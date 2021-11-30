// Generated from Alguma.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMENTARIO=2, ALG=3, DEC=4, INT=5, STR=6, REA=7, ATR=8, LER=9, IMP=10, 
		ENQ=11, SE=12, SEN=13, ENT=14, INI=15, FIM=16, A=17, ID=18, OpBool=19, 
		OpArit=20, OpRel=21, AP=22, FP=23, Delim=24, NumI=25, NumR=26, Str=27;
	public static final int
		RULE_programa = 0, RULE_algoritmo = 1, RULE_declaracoes = 2, RULE_declaracao = 3, 
		RULE_tipo = 4, RULE_acao = 5, RULE_iooperacao = 6, RULE_iooperador = 7, 
		RULE_preatribuicao = 8, RULE_atribuicao = 9, RULE_condicional = 10, RULE_condicionalfalso = 11, 
		RULE_laco = 12, RULE_conteudo = 13, RULE_objeto = 14, RULE_num = 15, RULE_operacaoboleana = 16, 
		RULE_operacaoaritmetica = 17, RULE_continuaoperacaoaritmetica = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "algoritmo", "declaracoes", "declaracao", "tipo", "acao", 
			"iooperacao", "iooperador", "preatribuicao", "atribuicao", "condicional", 
			"condicionalfalso", "laco", "conteudo", "objeto", "num", "operacaoboleana", 
			"operacaoaritmetica", "continuaoperacaoaritmetica"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'ALGORITMO'", "'DECLARACOES'", "'INTEIRO'", "'STRING'", 
			"'REAL'", "'ATRIBUIR'", "'LER'", "'IMPRIMI'", "'ENQUANTO'", "'SE'", "'SENAO'", 
			"'ENTAO'", "'INICIO'", "'FIM'", "'A'", null, null, null, null, "'('", 
			"')'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMENTARIO", "ALG", "DEC", "INT", "STR", "REA", "ATR", "LER", 
			"IMP", "ENQ", "SE", "SEN", "ENT", "INI", "FIM", "A", "ID", "OpBool", 
			"OpArit", "OpRel", "AP", "FP", "Delim", "NumI", "NumR", "Str"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Alguma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgumaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public List<TerminalNode> Delim() { return getTokens(AlgumaParser.Delim); }
		public TerminalNode Delim(int i) {
			return getToken(AlgumaParser.Delim, i);
		}
		public TerminalNode DEC() { return getToken(AlgumaParser.DEC, 0); }
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALG() { return getToken(AlgumaParser.ALG, 0); }
		public TerminalNode EOF() { return getToken(AlgumaParser.EOF, 0); }
		public List<AcaoContext> acao() {
			return getRuleContexts(AcaoContext.class);
		}
		public AcaoContext acao(int i) {
			return getRuleContext(AcaoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(Delim);
			setState(39);
			match(DEC);
			setState(40);
			declaracoes();
			setState(41);
			match(Delim);
			setState(42);
			match(ALG);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATR) | (1L << LER) | (1L << IMP) | (1L << ENQ) | (1L << SE))) != 0)) {
				{
				{
				setState(43);
				acao();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlgoritmoContext extends ParserRuleContext {
		public List<AcaoContext> acao() {
			return getRuleContexts(AcaoContext.class);
		}
		public AcaoContext acao(int i) {
			return getRuleContext(AcaoContext.class,i);
		}
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitAlgoritmo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitAlgoritmo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_algoritmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATR) | (1L << LER) | (1L << IMP) | (1L << ENQ) | (1L << SE))) != 0)) {
				{
				{
				setState(51);
				acao();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(57);
				declaracao();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AlgumaParser.ID, 0); }
		public TerminalNode Delim() { return getToken(AlgumaParser.Delim, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ID);
			setState(64);
			match(Delim);
			setState(65);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode REA() { return getToken(AlgumaParser.REA, 0); }
		public TerminalNode INT() { return getToken(AlgumaParser.INT, 0); }
		public TerminalNode STR() { return getToken(AlgumaParser.STR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STR) | (1L << REA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AcaoContext extends ParserRuleContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public LacoContext laco() {
			return getRuleContext(LacoContext.class,0);
		}
		public PreatribuicaoContext preatribuicao() {
			return getRuleContext(PreatribuicaoContext.class,0);
		}
		public IooperacaoContext iooperacao() {
			return getRuleContext(IooperacaoContext.class,0);
		}
		public AcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterAcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitAcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitAcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcaoContext acao() throws RecognitionException {
		AcaoContext _localctx = new AcaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_acao);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				condicional();
				}
				break;
			case ENQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				laco();
				}
				break;
			case ATR:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				preatribuicao();
				}
				break;
			case LER:
			case IMP:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				iooperacao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IooperacaoContext extends ParserRuleContext {
		public IooperadorContext iooperador() {
			return getRuleContext(IooperadorContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public IooperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iooperacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterIooperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitIooperacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitIooperacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IooperacaoContext iooperacao() throws RecognitionException {
		IooperacaoContext _localctx = new IooperacaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_iooperacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			iooperador();
			setState(76);
			objeto();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IooperadorContext extends ParserRuleContext {
		public TerminalNode LER() { return getToken(AlgumaParser.LER, 0); }
		public TerminalNode IMP() { return getToken(AlgumaParser.IMP, 0); }
		public IooperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iooperador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterIooperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitIooperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitIooperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IooperadorContext iooperador() throws RecognitionException {
		IooperadorContext _localctx = new IooperadorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_iooperador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==LER || _la==IMP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreatribuicaoContext extends ParserRuleContext {
		public TerminalNode ATR() { return getToken(AlgumaParser.ATR, 0); }
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public PreatribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preatribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterPreatribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitPreatribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitPreatribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreatribuicaoContext preatribuicao() throws RecognitionException {
		PreatribuicaoContext _localctx = new PreatribuicaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_preatribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ATR);
			setState(81);
			atribuicao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode A() { return getToken(AlgumaParser.A, 0); }
		public TerminalNode ID() { return getToken(AlgumaParser.ID, 0); }
		public OperacaoaritmeticaContext operacaoaritmetica() {
			return getRuleContext(OperacaoaritmeticaContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(83);
				operacaoaritmetica();
				}
				break;
			case 2:
				{
				setState(84);
				objeto();
				}
				break;
			}
			setState(87);
			match(A);
			setState(88);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(AlgumaParser.SE, 0); }
		public OperacaoboleanaContext operacaoboleana() {
			return getRuleContext(OperacaoboleanaContext.class,0);
		}
		public TerminalNode ENT() { return getToken(AlgumaParser.ENT, 0); }
		public ConteudoContext conteudo() {
			return getRuleContext(ConteudoContext.class,0);
		}
		public CondicionalfalsoContext condicionalfalso() {
			return getRuleContext(CondicionalfalsoContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(SE);
			setState(91);
			operacaoboleana();
			setState(92);
			match(ENT);
			setState(93);
			conteudo();
			setState(94);
			condicionalfalso();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalfalsoContext extends ParserRuleContext {
		public TerminalNode SEN() { return getToken(AlgumaParser.SEN, 0); }
		public ConteudoContext conteudo() {
			return getRuleContext(ConteudoContext.class,0);
		}
		public CondicionalfalsoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalfalso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCondicionalfalso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCondicionalfalso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCondicionalfalso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalfalsoContext condicionalfalso() throws RecognitionException {
		CondicionalfalsoContext _localctx = new CondicionalfalsoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicionalfalso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(96);
				match(SEN);
				setState(97);
				conteudo();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LacoContext extends ParserRuleContext {
		public TerminalNode ENQ() { return getToken(AlgumaParser.ENQ, 0); }
		public OperacaoboleanaContext operacaoboleana() {
			return getRuleContext(OperacaoboleanaContext.class,0);
		}
		public ConteudoContext conteudo() {
			return getRuleContext(ConteudoContext.class,0);
		}
		public LacoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_laco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterLaco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitLaco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitLaco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LacoContext laco() throws RecognitionException {
		LacoContext _localctx = new LacoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_laco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ENQ);
			setState(101);
			operacaoboleana();
			setState(102);
			conteudo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConteudoContext extends ParserRuleContext {
		public TerminalNode INI() { return getToken(AlgumaParser.INI, 0); }
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode FIM() { return getToken(AlgumaParser.FIM, 0); }
		public AcaoContext acao() {
			return getRuleContext(AcaoContext.class,0);
		}
		public ConteudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conteudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterConteudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitConteudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitConteudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConteudoContext conteudo() throws RecognitionException {
		ConteudoContext _localctx = new ConteudoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conteudo);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(104);
				match(INI);
				setState(105);
				algoritmo();
				setState(106);
				match(FIM);
				}
				}
				break;
			case ATR:
			case LER:
			case IMP:
			case ENQ:
			case SE:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				acao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjetoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AlgumaParser.ID, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode Str() { return getToken(AlgumaParser.Str, 0); }
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(111);
				match(ID);
				}
				break;
			case NumI:
			case NumR:
				{
				setState(112);
				num();
				}
				break;
			case Str:
				{
				setState(113);
				match(Str);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NumI() { return getToken(AlgumaParser.NumI, 0); }
		public TerminalNode NumR() { return getToken(AlgumaParser.NumR, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==NumI || _la==NumR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacaoboleanaContext extends ParserRuleContext {
		public List<ObjetoContext> objeto() {
			return getRuleContexts(ObjetoContext.class);
		}
		public ObjetoContext objeto(int i) {
			return getRuleContext(ObjetoContext.class,i);
		}
		public TerminalNode OpRel() { return getToken(AlgumaParser.OpRel, 0); }
		public TerminalNode AP() { return getToken(AlgumaParser.AP, 0); }
		public TerminalNode FP() { return getToken(AlgumaParser.FP, 0); }
		public TerminalNode OpBool() { return getToken(AlgumaParser.OpBool, 0); }
		public OperacaoboleanaContext operacaoboleana() {
			return getRuleContext(OperacaoboleanaContext.class,0);
		}
		public OperacaoboleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaoboleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOperacaoboleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOperacaoboleana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOperacaoboleana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoboleanaContext operacaoboleana() throws RecognitionException {
		OperacaoboleanaContext _localctx = new OperacaoboleanaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operacaoboleana);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(118);
				objeto();
				setState(119);
				match(OpRel);
				setState(120);
				objeto();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(122);
				match(AP);
				setState(123);
				objeto();
				setState(124);
				match(OpRel);
				setState(125);
				objeto();
				setState(126);
				match(FP);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(128);
				match(AP);
				setState(129);
				objeto();
				setState(130);
				match(OpRel);
				setState(131);
				objeto();
				setState(132);
				match(FP);
				setState(133);
				match(OpBool);
				setState(134);
				operacaoboleana();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacaoaritmeticaContext extends ParserRuleContext {
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public TerminalNode OpArit() { return getToken(AlgumaParser.OpArit, 0); }
		public ContinuaoperacaoaritmeticaContext continuaoperacaoaritmetica() {
			return getRuleContext(ContinuaoperacaoaritmeticaContext.class,0);
		}
		public TerminalNode AP() { return getToken(AlgumaParser.AP, 0); }
		public TerminalNode FP() { return getToken(AlgumaParser.FP, 0); }
		public OperacaoaritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaoaritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOperacaoaritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOperacaoaritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOperacaoaritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoaritmeticaContext operacaoaritmetica() throws RecognitionException {
		OperacaoaritmeticaContext _localctx = new OperacaoaritmeticaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operacaoaritmetica);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NumI:
			case NumR:
			case Str:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(138);
				objeto();
				setState(139);
				match(OpArit);
				setState(140);
				continuaoperacaoaritmetica();
				}
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(142);
				match(AP);
				setState(143);
				objeto();
				setState(144);
				match(OpArit);
				setState(145);
				continuaoperacaoaritmetica();
				setState(146);
				match(FP);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinuaoperacaoaritmeticaContext extends ParserRuleContext {
		public OperacaoaritmeticaContext operacaoaritmetica() {
			return getRuleContext(OperacaoaritmeticaContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public ContinuaoperacaoaritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuaoperacaoaritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterContinuaoperacaoaritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitContinuaoperacaoaritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitContinuaoperacaoaritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinuaoperacaoaritmeticaContext continuaoperacaoaritmetica() throws RecognitionException {
		ContinuaoperacaoaritmeticaContext _localctx = new ContinuaoperacaoaritmeticaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_continuaoperacaoaritmetica);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				operacaoaritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				objeto();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u009d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13\2"+
		"\3\2\3\2\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\4\7\4=\n\4\f\4\16\4@\13\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\5\13X\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\5\re\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17p\n\17"+
		"\3\20\3\20\3\20\5\20u\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u008b\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0097\n\23\3\24"+
		"\3\24\5\24\u009b\n\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&\2\5\3\2\7\t\3\2\13\f\3\2\33\34\2\u0098\2(\3\2\2\2\48\3\2\2\2"+
		"\6>\3\2\2\2\bA\3\2\2\2\nE\3\2\2\2\fK\3\2\2\2\16M\3\2\2\2\20P\3\2\2\2\22"+
		"R\3\2\2\2\24W\3\2\2\2\26\\\3\2\2\2\30d\3\2\2\2\32f\3\2\2\2\34o\3\2\2\2"+
		"\36t\3\2\2\2 v\3\2\2\2\"\u008a\3\2\2\2$\u0096\3\2\2\2&\u009a\3\2\2\2("+
		")\7\32\2\2)*\7\6\2\2*+\5\6\4\2+,\7\32\2\2,\60\7\5\2\2-/\5\f\7\2.-\3\2"+
		"\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2"+
		"\63\64\7\2\2\3\64\3\3\2\2\2\65\67\5\f\7\2\66\65\3\2\2\2\67:\3\2\2\28\66"+
		"\3\2\2\289\3\2\2\29\5\3\2\2\2:8\3\2\2\2;=\5\b\5\2<;\3\2\2\2=@\3\2\2\2"+
		"><\3\2\2\2>?\3\2\2\2?\7\3\2\2\2@>\3\2\2\2AB\7\24\2\2BC\7\32\2\2CD\5\n"+
		"\6\2D\t\3\2\2\2EF\t\2\2\2F\13\3\2\2\2GL\5\26\f\2HL\5\32\16\2IL\5\22\n"+
		"\2JL\5\16\b\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\r\3\2\2\2MN\5\20"+
		"\t\2NO\5\36\20\2O\17\3\2\2\2PQ\t\3\2\2Q\21\3\2\2\2RS\7\n\2\2ST\5\24\13"+
		"\2T\23\3\2\2\2UX\5$\23\2VX\5\36\20\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YZ\7"+
		"\23\2\2Z[\7\24\2\2[\25\3\2\2\2\\]\7\16\2\2]^\5\"\22\2^_\7\20\2\2_`\5\34"+
		"\17\2`a\5\30\r\2a\27\3\2\2\2bc\7\17\2\2ce\5\34\17\2db\3\2\2\2de\3\2\2"+
		"\2e\31\3\2\2\2fg\7\r\2\2gh\5\"\22\2hi\5\34\17\2i\33\3\2\2\2jk\7\21\2\2"+
		"kl\5\4\3\2lm\7\22\2\2mp\3\2\2\2np\5\f\7\2oj\3\2\2\2on\3\2\2\2p\35\3\2"+
		"\2\2qu\7\24\2\2ru\5 \21\2su\7\35\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\37"+
		"\3\2\2\2vw\t\4\2\2w!\3\2\2\2xy\5\36\20\2yz\7\27\2\2z{\5\36\20\2{\u008b"+
		"\3\2\2\2|}\7\30\2\2}~\5\36\20\2~\177\7\27\2\2\177\u0080\5\36\20\2\u0080"+
		"\u0081\7\31\2\2\u0081\u008b\3\2\2\2\u0082\u0083\7\30\2\2\u0083\u0084\5"+
		"\36\20\2\u0084\u0085\7\27\2\2\u0085\u0086\5\36\20\2\u0086\u0087\7\31\2"+
		"\2\u0087\u0088\7\25\2\2\u0088\u0089\5\"\22\2\u0089\u008b\3\2\2\2\u008a"+
		"x\3\2\2\2\u008a|\3\2\2\2\u008a\u0082\3\2\2\2\u008b#\3\2\2\2\u008c\u008d"+
		"\5\36\20\2\u008d\u008e\7\26\2\2\u008e\u008f\5&\24\2\u008f\u0097\3\2\2"+
		"\2\u0090\u0091\7\30\2\2\u0091\u0092\5\36\20\2\u0092\u0093\7\26\2\2\u0093"+
		"\u0094\5&\24\2\u0094\u0095\7\31\2\2\u0095\u0097\3\2\2\2\u0096\u008c\3"+
		"\2\2\2\u0096\u0090\3\2\2\2\u0097%\3\2\2\2\u0098\u009b\5$\23\2\u0099\u009b"+
		"\5\36\20\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\'\3\2\2\2\r\60"+
		"8>KWdot\u008a\u0096\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}