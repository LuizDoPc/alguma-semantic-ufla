import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.HashMap;
import java.util.Map;

public class AlgumaSemanticParser<T> extends AlgumaBaseVisitor<T> {

    private Map<String,String> symbolTable = new HashMap<String,String>();


   	@Override public T visitDeclaracao(AlgumaParser.DeclaracaoContext ctx) {
        String tipo = ctx.getChild(2).getText();
        String id = ctx.getChild(0).getText();

        if (symbolTable.containsKey(id)){
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
            throw new Error("Duplicated var");
        } else {
            symbolTable.put(id,tipo);
        }
        return visitChildren(ctx);
    }

   

    @Override public T visitObjeto(AlgumaParser.ObjetoContext ctx){
        if (ctx.getChild(0).getClass() == org.antlr.v4.runtime.tree.TerminalNodeImpl.class && !ctx.getChild(0).getText().contains("'")){
            verificaVariaveisNaoDeclaradas(ctx.getChild(0).getText());
        }
        return visitChildren(ctx);
    }

    //2) Checagem de variáveis não declaradas
    private void verificaVariaveisNaoDeclaradas(String id){
        if (!symbolTable.containsKey(id)){
            System.out.println("Uso de variável não declarada! Variável " + id + " não foi declarada");
            throw new Error("Undeclared var");
        }

    }

    private void validaValorDestino(String tipoValor, String tipoDestino, String valor){
        if(tipoValor != null){ // atribuicao de variavel
            if(!tipoValor.equals(tipoDestino)){
                System.out.println("O tipo "+tipoValor+" não pode ser atribuído ao tipo "+tipoDestino+"!");
                throw new Error("Incompatible types");
            }
        }else{ // atribuicao de valor
            if(tipoDestino.equals("INTEIRO") && valor.contains("'")){
                System.out.println("Não é possível atribuir uma STRING a um INTERIO");
                throw new Error("Incompatible types");
            }
            else if(tipoDestino.equals("REAL") && valor.contains("'")){
                System.out.println("Não é possível atribuir uma STRING a um REAL");
                throw new Error("Incompatible types");
            }
            if(tipoDestino.equals("INTEIRO") && valor.contains(",")){
                System.out.println("Não é possível atribuir um REAL a um INTEIRO");
                throw new Error("Incompatible types");
            }else {
                if(tipoDestino.equals("REAL") && !valor.contains(",")){
                    System.out.println("Não é possível atribuir um INTEIRO a um REAL");
                    throw new Error("Incompatible types");
                }
            }
        }
    }

    @Override public T visitAtribuicao(AlgumaParser.AtribuicaoContext ctx) {
        String valor = ctx.getChild(0).getText();
        String destino = ctx.getChild(2).getText();

        String tipoDestino = symbolTable.get(destino);
        
        // atribuicao de objeto
        if(ctx.getChild(0).getChildCount() == 1){
            String tipoValor = symbolTable.get(valor);

            verificaVariaveisNaoDeclaradas(destino);
            validaValorDestino(tipoValor, tipoDestino, valor);

        }else{ 
            // atribuicao de operacao
            ParseTree operacao = ctx.getChild(0);
            
            for(int i=0; i<operacao.getChildCount(); i++){
                String operacaoAtual = operacao.getChild(i).getText();
                if(!operacaoAtual.equals("*") && !operacaoAtual.equals("/") && 
                   !operacaoAtual.equals("+") && !operacaoAtual.equals("–") &&
                   !operacaoAtual.equals("-") && !operacaoAtual.equals("(") &&
                   !operacaoAtual.equals(")")){
                       String tipoValor = symbolTable.get(operacaoAtual);
                       
                       validaValorDestino(tipoValor, tipoDestino, valor);
                   }
            }

        }
        
        return visitChildren(ctx);
    }


    public Map<String, String> getTabelaSimbolos() {
        return symbolTable;
    }
}
