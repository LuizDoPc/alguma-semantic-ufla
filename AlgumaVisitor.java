// Generated from Alguma.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlgumaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlgumaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#algoritmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgoritmo(AlgumaParser.AlgoritmoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(AlgumaParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(AlgumaParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(AlgumaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#acao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcao(AlgumaParser.AcaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#iooperacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIooperacao(AlgumaParser.IooperacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#iooperador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIooperador(AlgumaParser.IooperadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#preatribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreatribuicao(AlgumaParser.PreatribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(AlgumaParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(AlgumaParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#condicionalfalso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalfalso(AlgumaParser.CondicionalfalsoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#laco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLaco(AlgumaParser.LacoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#conteudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConteudo(AlgumaParser.ConteudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(AlgumaParser.ObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(AlgumaParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#operacaoboleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoboleana(AlgumaParser.OperacaoboleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#operacaoaritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoaritmetica(AlgumaParser.OperacaoaritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#continuaoperacaoaritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuaoperacaoaritmetica(AlgumaParser.ContinuaoperacaoaritmeticaContext ctx);
}