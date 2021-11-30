// Generated from Alguma.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaParser}.
 */
public interface AlgumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(AlgumaParser.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(AlgumaParser.AlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(AlgumaParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(AlgumaParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(AlgumaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(AlgumaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(AlgumaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(AlgumaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#acao}.
	 * @param ctx the parse tree
	 */
	void enterAcao(AlgumaParser.AcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#acao}.
	 * @param ctx the parse tree
	 */
	void exitAcao(AlgumaParser.AcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#iooperacao}.
	 * @param ctx the parse tree
	 */
	void enterIooperacao(AlgumaParser.IooperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#iooperacao}.
	 * @param ctx the parse tree
	 */
	void exitIooperacao(AlgumaParser.IooperacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#iooperador}.
	 * @param ctx the parse tree
	 */
	void enterIooperador(AlgumaParser.IooperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#iooperador}.
	 * @param ctx the parse tree
	 */
	void exitIooperador(AlgumaParser.IooperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#preatribuicao}.
	 * @param ctx the parse tree
	 */
	void enterPreatribuicao(AlgumaParser.PreatribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#preatribuicao}.
	 * @param ctx the parse tree
	 */
	void exitPreatribuicao(AlgumaParser.PreatribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(AlgumaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(AlgumaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(AlgumaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(AlgumaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#condicionalfalso}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalfalso(AlgumaParser.CondicionalfalsoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#condicionalfalso}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalfalso(AlgumaParser.CondicionalfalsoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#laco}.
	 * @param ctx the parse tree
	 */
	void enterLaco(AlgumaParser.LacoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#laco}.
	 * @param ctx the parse tree
	 */
	void exitLaco(AlgumaParser.LacoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#conteudo}.
	 * @param ctx the parse tree
	 */
	void enterConteudo(AlgumaParser.ConteudoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#conteudo}.
	 * @param ctx the parse tree
	 */
	void exitConteudo(AlgumaParser.ConteudoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(AlgumaParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(AlgumaParser.ObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(AlgumaParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(AlgumaParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#operacaoboleana}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoboleana(AlgumaParser.OperacaoboleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#operacaoboleana}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoboleana(AlgumaParser.OperacaoboleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#operacaoaritmetica}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoaritmetica(AlgumaParser.OperacaoaritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#operacaoaritmetica}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoaritmetica(AlgumaParser.OperacaoaritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#continuaoperacaoaritmetica}.
	 * @param ctx the parse tree
	 */
	void enterContinuaoperacaoaritmetica(AlgumaParser.ContinuaoperacaoaritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#continuaoperacaoaritmetica}.
	 * @param ctx the parse tree
	 */
	void exitContinuaoperacaoaritmetica(AlgumaParser.ContinuaoperacaoaritmeticaContext ctx);
}