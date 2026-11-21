// Generated from Python3.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Python3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, INT=29, FLOAT=30, VARIABLE=31, 
		BOOLEAN=32, STRING=33, CHAR=34;
	public static final int
		RULE_start = 0, RULE_next = 1, RULE_space = 2, RULE_unindented_statement = 3, 
		RULE_var_assignment = 4, RULE_var_operation = 5, RULE_if_statement = 6, 
		RULE_elif_statement = 7, RULE_else_statement = 8, RULE_indented_statement = 9, 
		RULE_type = 10, RULE_equality = 11, RULE_equation = 12, RULE_number = 13, 
		RULE_math_operator = 14, RULE_comp_operator = 15, RULE_list = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "next", "space", "unindented_statement", "var_assignment", "var_operation", 
			"if_statement", "elif_statement", "else_statement", "indented_statement", 
			"type", "equality", "equation", "number", "math_operator", "comp_operator", 
			"list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\r'", "'\\n'", "' '", "'\\t'", "'='", "'if'", "':'", "'elif'", 
			"'else'", "'('", "'not'", "')'", "'and'", "'or'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'['", "']'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "INT", "FLOAT", "VARIABLE", "BOOLEAN", 
			"STRING", "CHAR"
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
	public String getGrammarFileName() { return "Python3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Python3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public Unindented_statementContext unindented_statement() {
			return getRuleContext(Unindented_statementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Python3Parser.EOF, 0); }
		public List<NextContext> next() {
			return getRuleContexts(NextContext.class);
		}
		public NextContext next(int i) {
			return getRuleContext(NextContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) {
				{
				{
				setState(34);
				next();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			unindented_statement();
			setState(41);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NextContext extends ParserRuleContext {
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public NextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitNext(this);
		}
	}

	public final NextContext next() throws RecognitionException {
		NextContext _localctx = new NextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_next);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(43);
				space();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(49);
				match(T__0);
				}
			}

			setState(52);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpaceContext extends ParserRuleContext {
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitSpace(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_space);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unindented_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Var_assignmentContext var_assignment() {
			return getRuleContext(Var_assignmentContext.class,0);
		}
		public Var_operationContext var_operation() {
			return getRuleContext(Var_operationContext.class,0);
		}
		public Unindented_statementContext unindented_statement() {
			return getRuleContext(Unindented_statementContext.class,0);
		}
		public List<NextContext> next() {
			return getRuleContexts(NextContext.class);
		}
		public NextContext next(int i) {
			return getRuleContext(NextContext.class,i);
		}
		public Unindented_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unindented_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterUnindented_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitUnindented_statement(this);
		}
	}

	public final Unindented_statementContext unindented_statement() throws RecognitionException {
		Unindented_statementContext _localctx = new Unindented_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unindented_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(56);
				if_statement();
				}
				break;
			case 2:
				{
				setState(57);
				var_assignment();
				}
				break;
			case 3:
				{
				setState(58);
				var_operation();
				}
				break;
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) {
				{
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					next();
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0) );
				setState(66);
				unindented_statement();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_assignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Python3Parser.VARIABLE, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public Var_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterVar_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitVar_assignment(this);
		}
	}

	public final Var_assignmentContext var_assignment() throws RecognitionException {
		Var_assignmentContext _localctx = new Var_assignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(VARIABLE);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(71);
				space();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__4);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(78);
				space();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(84);
				equation();
				}
				break;
			case 2:
				{
				setState(85);
				type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_operationContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(Python3Parser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Python3Parser.VARIABLE, i);
		}
		public Math_operatorContext math_operator() {
			return getRuleContext(Math_operatorContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public Var_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterVar_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitVar_operation(this);
		}
	}

	public final Var_operationContext var_operation() throws RecognitionException {
		Var_operationContext _localctx = new Var_operationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(VARIABLE);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(89);
				space();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			math_operator();
			setState(96);
			match(T__4);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(97);
				space();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(103);
				number();
				}
				break;
			case 2:
				{
				setState(104);
				match(VARIABLE);
				}
				break;
			case 3:
				{
				setState(105);
				equation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public Indented_statementContext indented_statement() {
			return getRuleContext(Indented_statementContext.class,0);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<Elif_statementContext> elif_statement() {
			return getRuleContexts(Elif_statementContext.class);
		}
		public Elif_statementContext elif_statement(int i) {
			return getRuleContext(Elif_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public List<NextContext> next() {
			return getRuleContexts(NextContext.class);
		}
		public NextContext next(int i) {
			return getRuleContext(NextContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__5);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					space();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(115);
			equality();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(116);
				space();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(T__6);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(123);
				match(T__0);
				}
			}

			setState(126);
			match(T__1);
			setState(127);
			indented_statement();
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(129); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(128);
						next();
						}
						}
						setState(131); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0) );
					setState(133);
					elif_statement();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(140);
					next();
					}
					}
					setState(143); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0) );
				setState(145);
				else_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Elif_statementContext extends ParserRuleContext {
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public Indented_statementContext indented_statement() {
			return getRuleContext(Indented_statementContext.class,0);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public Elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterElif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitElif_statement(this);
		}
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elif_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__7);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					space();
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(156);
			equality();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(157);
				space();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(T__6);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(164);
				match(T__0);
				}
			}

			setState(167);
			match(T__1);
			setState(168);
			indented_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementContext extends ParserRuleContext {
		public Indented_statementContext indented_statement() {
			return getRuleContext(Indented_statementContext.class,0);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitElse_statement(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__8);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(171);
				space();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(T__6);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(178);
				match(T__0);
				}
			}

			setState(181);
			match(T__1);
			setState(182);
			indented_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Indented_statementContext extends ParserRuleContext {
		public Var_assignmentContext var_assignment() {
			return getRuleContext(Var_assignmentContext.class,0);
		}
		public Indented_statementContext indented_statement() {
			return getRuleContext(Indented_statementContext.class,0);
		}
		public List<NextContext> next() {
			return getRuleContexts(NextContext.class);
		}
		public NextContext next(int i) {
			return getRuleContext(NextContext.class,i);
		}
		public Var_operationContext var_operation() {
			return getRuleContext(Var_operationContext.class,0);
		}
		public Indented_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indented_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterIndented_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitIndented_statement(this);
		}
	}

	public final Indented_statementContext indented_statement() throws RecognitionException {
		Indented_statementContext _localctx = new Indented_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_indented_statement);
		try {
			int _alt;
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(T__3);
				setState(185);
				var_assignment();
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(187); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(186);
							next();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(189); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(191);
					indented_statement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(T__3);
				setState(196);
				var_operation();
				setState(204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(198); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(197);
							next();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(200); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(202);
					indented_statement();
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Python3Parser.VARIABLE, 0); }
		public TerminalNode BOOLEAN() { return getToken(Python3Parser.BOOLEAN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(Python3Parser.STRING, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(Python3Parser.CHAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(BOOLEAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				match(CHAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public Comp_operatorContext comp_operator() {
			return getRuleContext(Comp_operatorContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitEquality(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_equality);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(216);
				match(T__9);
				}
			}

			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(219);
				match(T__10);
				}
			}

			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(222);
				space();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			type();
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(229);
					space();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0)) {
				{
				setState(235);
				comp_operator();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2 || _la==T__3) {
					{
					{
					setState(236);
					space();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				type();
				}
			}

			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(246);
				match(T__11);
				}
			}

			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					space();
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__13) {
				{
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(256);
						space();
						}
						} 
					}
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(262);
				equality();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class EquationContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<Math_operatorContext> math_operator() {
			return getRuleContexts(Math_operatorContext.class);
		}
		public Math_operatorContext math_operator(int i) {
			return getRuleContext(Math_operatorContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitEquation(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_equation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			number();
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2 || _la==T__3) {
						{
						{
						setState(266);
						space();
						}
						}
						setState(271);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(272);
					math_operator();
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2 || _la==T__3) {
						{
						{
						setState(273);
						space();
						}
						}
						setState(278);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(279);
					number();
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Python3Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(Python3Parser.FLOAT, 0); }
		public TerminalNode VARIABLE() { return getToken(Python3Parser.VARIABLE, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number);
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14 || _la==T__15) {
					{
					setState(286);
					_la = _input.LA(1);
					if ( !(_la==T__14 || _la==T__15) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(289);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(VARIABLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Math_operatorContext extends ParserRuleContext {
		public Math_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterMath_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitMath_operator(this);
		}
	}

	public final Math_operatorContext math_operator() throws RecognitionException {
		Math_operatorContext _localctx = new Math_operatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_math_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1015808L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comp_operatorContext extends ParserRuleContext {
		public Comp_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterComp_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitComp_operator(this);
		}
	}

	public final Comp_operatorContext comp_operator() throws RecognitionException {
		Comp_operatorContext _localctx = new Comp_operatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comp_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_list);
		int _la;
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(T__25);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2 || _la==T__3) {
					{
					{
					setState(298);
					space();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(304);
				match(T__26);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(T__25);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2 || _la==T__3) {
					{
					{
					setState(306);
					space();
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
				type();
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2 || _la==T__3) {
					{
					{
					setState(313);
					space();
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(319);
					match(T__27);
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2 || _la==T__3) {
						{
						{
						setState(320);
						space();
						}
						}
						setState(325);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(326);
					type();
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2 || _la==T__3) {
						{
						{
						setState(327);
						space();
						}
						}
						setState(332);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(338);
				match(T__26);
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
		"\u0004\u0001\"\u0157\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"-\b\u0001\n\u0001\f\u00010\t\u0001\u0001\u0001\u0003\u00013\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003<\b\u0003\u0001\u0003\u0004\u0003?\b\u0003\u000b\u0003"+
		"\f\u0003@\u0001\u0003\u0001\u0003\u0003\u0003E\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0005\u0004I\b\u0004\n\u0004\f\u0004L\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004P\b\u0004\n\u0004\f\u0004S\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004W\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005[\b\u0005"+
		"\n\u0005\f\u0005^\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"c\b\u0005\n\u0005\f\u0005f\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005k\b\u0005\u0001\u0006\u0001\u0006\u0005\u0006o\b\u0006\n\u0006"+
		"\f\u0006r\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006v\b\u0006\n\u0006"+
		"\f\u0006y\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006}\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0004\u0006\u0082\b\u0006\u000b\u0006\f\u0006"+
		"\u0083\u0001\u0006\u0001\u0006\u0005\u0006\u0088\b\u0006\n\u0006\f\u0006"+
		"\u008b\t\u0006\u0001\u0006\u0004\u0006\u008e\b\u0006\u000b\u0006\f\u0006"+
		"\u008f\u0001\u0006\u0001\u0006\u0003\u0006\u0094\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u0098\b\u0007\n\u0007\f\u0007\u009b\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u009f\b\u0007\n\u0007\f\u0007\u00a2\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00a6\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0005\b\u00ad\b\b\n\b\f\b\u00b0\t\b\u0001\b\u0001"+
		"\b\u0003\b\u00b4\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0004"+
		"\t\u00bc\b\t\u000b\t\f\t\u00bd\u0001\t\u0001\t\u0003\t\u00c2\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0004\t\u00c7\b\t\u000b\t\f\t\u00c8\u0001\t\u0001\t"+
		"\u0003\t\u00cd\b\t\u0003\t\u00cf\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00d7\b\n\u0001\u000b\u0003\u000b\u00da\b\u000b\u0001"+
		"\u000b\u0003\u000b\u00dd\b\u000b\u0001\u000b\u0005\u000b\u00e0\b\u000b"+
		"\n\u000b\f\u000b\u00e3\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e7"+
		"\b\u000b\n\u000b\f\u000b\u00ea\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00ee\b\u000b\n\u000b\f\u000b\u00f1\t\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00f5\b\u000b\u0001\u000b\u0003\u000b\u00f8\b\u000b\u0001\u000b"+
		"\u0005\u000b\u00fb\b\u000b\n\u000b\f\u000b\u00fe\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0102\b\u000b\n\u000b\f\u000b\u0105\t\u000b\u0001\u000b"+
		"\u0003\u000b\u0108\b\u000b\u0001\f\u0001\f\u0005\f\u010c\b\f\n\f\f\f\u010f"+
		"\t\f\u0001\f\u0001\f\u0005\f\u0113\b\f\n\f\f\f\u0116\t\f\u0001\f\u0001"+
		"\f\u0005\f\u011a\b\f\n\f\f\f\u011d\t\f\u0001\r\u0003\r\u0120\b\r\u0001"+
		"\r\u0001\r\u0003\r\u0124\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u012c\b\u0010\n\u0010\f\u0010"+
		"\u012f\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0134\b"+
		"\u0010\n\u0010\f\u0010\u0137\t\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u013b\b\u0010\n\u0010\f\u0010\u013e\t\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0142\b\u0010\n\u0010\f\u0010\u0145\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0149\b\u0010\n\u0010\f\u0010\u014c\t\u0010\u0005\u0010\u014e"+
		"\b\u0010\n\u0010\f\u0010\u0151\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0155\b\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0006"+
		"\u0001\u0000\u0003\u0004\u0001\u0000\r\u000e\u0001\u0000\u000f\u0010\u0001"+
		"\u0000\u001d\u001e\u0001\u0000\u000f\u0013\u0001\u0000\u0014\u0019\u017f"+
		"\u0000%\u0001\u0000\u0000\u0000\u0002.\u0001\u0000\u0000\u0000\u00046"+
		"\u0001\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000\bF\u0001\u0000"+
		"\u0000\u0000\nX\u0001\u0000\u0000\u0000\fl\u0001\u0000\u0000\u0000\u000e"+
		"\u0095\u0001\u0000\u0000\u0000\u0010\u00aa\u0001\u0000\u0000\u0000\u0012"+
		"\u00ce\u0001\u0000\u0000\u0000\u0014\u00d6\u0001\u0000\u0000\u0000\u0016"+
		"\u00d9\u0001\u0000\u0000\u0000\u0018\u0109\u0001\u0000\u0000\u0000\u001a"+
		"\u0123\u0001\u0000\u0000\u0000\u001c\u0125\u0001\u0000\u0000\u0000\u001e"+
		"\u0127\u0001\u0000\u0000\u0000 \u0154\u0001\u0000\u0000\u0000\"$\u0003"+
		"\u0002\u0001\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000()\u0003\u0006\u0003\u0000)*\u0005\u0000"+
		"\u0000\u0001*\u0001\u0001\u0000\u0000\u0000+-\u0003\u0004\u0002\u0000"+
		",+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u000013\u0005\u0001\u0000\u000021\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0005\u0002\u0000\u0000"+
		"5\u0003\u0001\u0000\u0000\u000067\u0007\u0000\u0000\u00007\u0005\u0001"+
		"\u0000\u0000\u00008<\u0003\f\u0006\u00009<\u0003\b\u0004\u0000:<\u0003"+
		"\n\u0005\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001"+
		"\u0000\u0000\u0000<D\u0001\u0000\u0000\u0000=?\u0003\u0002\u0001\u0000"+
		">=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0003\u0006"+
		"\u0003\u0000CE\u0001\u0000\u0000\u0000D>\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000E\u0007\u0001\u0000\u0000\u0000FJ\u0005\u001f\u0000"+
		"\u0000GI\u0003\u0004\u0002\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MQ\u0005\u0005\u0000\u0000"+
		"NP\u0003\u0004\u0002\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RV\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000TW\u0003\u0018\f\u0000UW\u0003\u0014"+
		"\n\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000W\t\u0001"+
		"\u0000\u0000\u0000X\\\u0005\u001f\u0000\u0000Y[\u0003\u0004\u0002\u0000"+
		"ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000_`\u0003\u001c\u000e\u0000`d\u0005\u0005\u0000\u0000ac\u0003"+
		"\u0004\u0002\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ej\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000gk\u0003\u001a\r\u0000hk\u0005\u001f\u0000"+
		"\u0000ik\u0003\u0018\f\u0000jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000k\u000b\u0001\u0000\u0000\u0000lp\u0005"+
		"\u0006\u0000\u0000mo\u0003\u0004\u0002\u0000nm\u0001\u0000\u0000\u0000"+
		"or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000sw\u0003\u0016"+
		"\u000b\u0000tv\u0003\u0004\u0002\u0000ut\u0001\u0000\u0000\u0000vy\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0005\u0007\u0000"+
		"\u0000{}\u0005\u0001\u0000\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0005\u0002\u0000\u0000"+
		"\u007f\u0089\u0003\u0012\t\u0000\u0080\u0082\u0003\u0002\u0001\u0000\u0081"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0003\u000e\u0007\u0000\u0086"+
		"\u0088\u0001\u0000\u0000\u0000\u0087\u0081\u0001\u0000\u0000\u0000\u0088"+
		"\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u0093\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008c\u008e\u0003\u0002\u0001\u0000\u008d"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0003\u0010\b\u0000\u0092\u0094"+
		"\u0001\u0000\u0000\u0000\u0093\u008d\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\r\u0001\u0000\u0000\u0000\u0095\u0099\u0005"+
		"\b\u0000\u0000\u0096\u0098\u0003\u0004\u0002\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u00a0\u0003\u0016"+
		"\u000b\u0000\u009d\u009f\u0003\u0004\u0002\u0000\u009e\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005\u0007"+
		"\u0000\u0000\u00a4\u00a6\u0005\u0001\u0000\u0000\u00a5\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005\u0002\u0000\u0000\u00a8\u00a9\u0003\u0012"+
		"\t\u0000\u00a9\u000f\u0001\u0000\u0000\u0000\u00aa\u00ae\u0005\t\u0000"+
		"\u0000\u00ab\u00ad\u0003\u0004\u0002\u0000\u00ac\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b3\u0005\u0007\u0000"+
		"\u0000\u00b2\u00b4\u0005\u0001\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0005\u0002\u0000\u0000\u00b6\u00b7\u0003\u0012\t\u0000"+
		"\u00b7\u0011\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0004\u0000\u0000"+
		"\u00b9\u00c1\u0003\b\u0004\u0000\u00ba\u00bc\u0003\u0002\u0001\u0000\u00bb"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003\u0012\t\u0000\u00c0\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bb\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00cf\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0005\u0004\u0000\u0000\u00c4\u00cc\u0003\n\u0005\u0000\u00c5\u00c7\u0003"+
		"\u0002\u0001\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003"+
		"\u0012\t\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00c6\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000"+
		"\u0000\u0000\u00ce\u00b8\u0001\u0000\u0000\u0000\u00ce\u00c3\u0001\u0000"+
		"\u0000\u0000\u00cf\u0013\u0001\u0000\u0000\u0000\u00d0\u00d7\u0005\u001f"+
		"\u0000\u0000\u00d1\u00d7\u0005 \u0000\u0000\u00d2\u00d7\u0003\u001a\r"+
		"\u0000\u00d3\u00d7\u0005!\u0000\u0000\u00d4\u00d7\u0003 \u0010\u0000\u00d5"+
		"\u00d7\u0005\"\u0000\u0000\u00d6\u00d0\u0001\u0000\u0000\u0000\u00d6\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d6\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u0015\u0001\u0000\u0000\u0000\u00d8\u00da"+
		"\u0005\n\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00dd\u0005"+
		"\u000b\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e1\u0001\u0000\u0000\u0000\u00de\u00e0\u0003"+
		"\u0004\u0002\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e8\u0003\u0014\n\u0000\u00e5\u00e7\u0003\u0004"+
		"\u0002\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e9\u00f4\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ef\u0003\u001e\u000f\u0000\u00ec\u00ee\u0003\u0004"+
		"\u0002\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0003\u0014\n\u0000\u00f3\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f4\u00eb\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f8\u0005\f\u0000\u0000"+
		"\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f8\u00fc\u0001\u0000\u0000\u0000\u00f9\u00fb\u0003\u0004\u0002\u0000"+
		"\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd\u0107\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00ff\u0103\u0007\u0001\u0000\u0000\u0100\u0102\u0003\u0004\u0002\u0000"+
		"\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000"+
		"\u0106\u0108\u0003\u0016\u000b\u0000\u0107\u00ff\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0017\u0001\u0000\u0000\u0000"+
		"\u0109\u011b\u0003\u001a\r\u0000\u010a\u010c\u0003\u0004\u0002\u0000\u010b"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d"+
		"\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e"+
		"\u0110\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110"+
		"\u0114\u0003\u001c\u000e\u0000\u0111\u0113\u0003\u0004\u0002\u0000\u0112"+
		"\u0111\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114"+
		"\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115"+
		"\u0117\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0003\u001a\r\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u010d"+
		"\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u0019"+
		"\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0120"+
		"\u0007\u0002\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0124"+
		"\u0007\u0003\u0000\u0000\u0122\u0124\u0005\u001f\u0000\u0000\u0123\u011f"+
		"\u0001\u0000\u0000\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u001b"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0007\u0004\u0000\u0000\u0126\u001d"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0007\u0005\u0000\u0000\u0128\u001f"+
		"\u0001\u0000\u0000\u0000\u0129\u012d\u0005\u001a\u0000\u0000\u012a\u012c"+
		"\u0003\u0004\u0002\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012f"+
		"\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012d"+
		"\u0001\u0000\u0000\u0000\u0130\u0155\u0005\u001b\u0000\u0000\u0131\u0135"+
		"\u0005\u001a\u0000\u0000\u0132\u0134\u0003\u0004\u0002\u0000\u0133\u0132"+
		"\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0138"+
		"\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u013c"+
		"\u0003\u0014\n\u0000\u0139\u013b\u0003\u0004\u0002\u0000\u013a\u0139\u0001"+
		"\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u014f\u0001"+
		"\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0143\u0005"+
		"\u001c\u0000\u0000\u0140\u0142\u0003\u0004\u0002\u0000\u0141\u0140\u0001"+
		"\u0000\u0000\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0146\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u014a\u0003"+
		"\u0014\n\u0000\u0147\u0149\u0003\u0004\u0002\u0000\u0148\u0147\u0001\u0000"+
		"\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000"+
		"\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u013f\u0001\u0000"+
		"\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0152\u0001\u0000"+
		"\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u001b"+
		"\u0000\u0000\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u0129\u0001\u0000"+
		"\u0000\u0000\u0154\u0131\u0001\u0000\u0000\u0000\u0155!\u0001\u0000\u0000"+
		"\u00004%.2;@DJQV\\djpw|\u0083\u0089\u008f\u0093\u0099\u00a0\u00a5\u00ae"+
		"\u00b3\u00bd\u00c1\u00c8\u00cc\u00ce\u00d6\u00d9\u00dc\u00e1\u00e8\u00ef"+
		"\u00f4\u00f7\u00fc\u0103\u0107\u010d\u0114\u011b\u011f\u0123\u012d\u0135"+
		"\u013c\u0143\u014a\u014f\u0154";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}