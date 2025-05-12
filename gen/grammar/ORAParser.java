// Generated from /Users/jocho/Desktop/ORA/src/grammar/ORA.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ORAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, EQ=24, NEQ=25, 
		LT=26, GT=27, LE=28, GE=29, AND=30, OR=31, NOT=32, ID=33, STRING=34, INT=35, 
		FLOAT=36, WS=37;
	public static final int
		RULE_query = 0, RULE_expression = 1, RULE_pickExpression = 2, RULE_pickParams = 3, 
		RULE_pickParam = 4, RULE_addExpression = 5, RULE_updateExpression = 6, 
		RULE_removeExpression = 7, RULE_condition = 8, RULE_expressionAtom = 9, 
		RULE_sortParam = 10, RULE_assignmentList = 11, RULE_setList = 12, RULE_assignment = 13, 
		RULE_array = 14, RULE_value = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "expression", "pickExpression", "pickParams", "pickParam", "addExpression", 
			"updateExpression", "removeExpression", "condition", "expressionAtom", 
			"sortParam", "assignmentList", "setList", "assignment", "array", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'pick'", "'('", "')'", "';'", "'{'", "','", "'}'", "'fields'", 
			"':'", "'if'", "'sort'", "'maxRecords'", "'add'", "'update'", "'set'", 
			"'remove'", "'upward'", "'downward'", "'()'", "'['", "']'", "'='", "'=='", 
			"'!='", "'<'", "'>'", "'<='", "'>='", null, null, "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"EQ", "NEQ", "LT", "GT", "LE", "GE", "AND", "OR", "NOT", "ID", "STRING", 
			"INT", "FLOAT", "WS"
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
	public String getGrammarFileName() { return "ORA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ORAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ORAParser.EOF, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			expression();
			setState(33);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends ExpressionContext {
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PickContext extends ExpressionContext {
		public PickExpressionContext pickExpression() {
			return getRuleContext(PickExpressionContext.class,0);
		}
		public PickContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterPick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitPick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitPick(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UpdateContext extends ExpressionContext {
		public UpdateExpressionContext updateExpression() {
			return getRuleContext(UpdateExpressionContext.class,0);
		}
		public UpdateContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RemoveContext extends ExpressionContext {
		public RemoveExpressionContext removeExpression() {
			return getRuleContext(RemoveExpressionContext.class,0);
		}
		public RemoveContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitRemove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new PickContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				pickExpression();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				addExpression();
				}
				break;
			case 3:
				_localctx = new UpdateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				updateExpression();
				}
				break;
			case 4:
				_localctx = new RemoveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				removeExpression();
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
	public static class PickExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ORAParser.ID, 0); }
		public PickParamsContext pickParams() {
			return getRuleContext(PickParamsContext.class,0);
		}
		public PickExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pickExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterPickExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitPickExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitPickExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PickExpressionContext pickExpression() throws RecognitionException {
		PickExpressionContext _localctx = new PickExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pickExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(ID);
			setState(42);
			match(T__0);
			setState(43);
			match(T__1);
			setState(44);
			match(T__2);
			setState(45);
			pickParams();
			setState(46);
			match(T__3);
			setState(47);
			match(T__4);
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
	public static class PickParamsContext extends ParserRuleContext {
		public List<PickParamContext> pickParam() {
			return getRuleContexts(PickParamContext.class);
		}
		public PickParamContext pickParam(int i) {
			return getRuleContext(PickParamContext.class,i);
		}
		public PickParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pickParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterPickParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitPickParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitPickParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PickParamsContext pickParams() throws RecognitionException {
		PickParamsContext _localctx = new PickParamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pickParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__5);
			setState(50);
			pickParam();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(51);
				match(T__6);
				setState(52);
				pickParam();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(T__7);
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
	public static class PickParamContext extends ParserRuleContext {
		public PickParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pickParam; }
	 
		public PickParamContext() { }
		public void copyFrom(PickParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaxRecordsContext extends PickParamContext {
		public TerminalNode INT() { return getToken(ORAParser.INT, 0); }
		public MaxRecordsContext(PickParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterMaxRecords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitMaxRecords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitMaxRecords(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SortContext extends PickParamContext {
		public SortParamContext sortParam() {
			return getRuleContext(SortParamContext.class,0);
		}
		public SortContext(PickParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitSort(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldsContext extends PickParamContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FieldsContext(PickParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitFields(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends PickParamContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfContext(PickParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PickParamContext pickParam() throws RecognitionException {
		PickParamContext _localctx = new PickParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pickParam);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new FieldsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(T__8);
				setState(61);
				match(T__9);
				setState(62);
				array();
				}
				break;
			case T__10:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(T__10);
				setState(64);
				match(T__9);
				setState(65);
				condition();
				}
				break;
			case T__11:
				_localctx = new SortContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(T__11);
				setState(67);
				match(T__9);
				setState(68);
				sortParam();
				}
				break;
			case T__12:
				_localctx = new MaxRecordsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				match(T__12);
				setState(70);
				match(T__9);
				setState(71);
				match(INT);
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
	public static class AddExpressionContext extends ParserRuleContext {
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
	 
		public AddExpressionContext() { }
		public void copyFrom(AddExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends AddExpressionContext {
		public TerminalNode ID() { return getToken(ORAParser.ID, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public AddExprContext(AddExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_addExpression);
		try {
			_localctx = new AddExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(ID);
			setState(75);
			match(T__0);
			setState(76);
			match(T__13);
			setState(77);
			match(T__2);
			setState(78);
			assignmentList();
			setState(79);
			match(T__3);
			setState(80);
			match(T__4);
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
	public static class UpdateExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ORAParser.ID, 0); }
		public SetListContext setList() {
			return getRuleContext(SetListContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public UpdateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterUpdateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitUpdateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitUpdateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateExpressionContext updateExpression() throws RecognitionException {
		UpdateExpressionContext _localctx = new UpdateExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_updateExpression);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(ID);
				setState(83);
				match(T__0);
				setState(84);
				match(T__14);
				setState(85);
				match(T__2);
				setState(86);
				match(T__5);
				setState(87);
				match(T__15);
				setState(88);
				match(T__9);
				setState(89);
				setList();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(90);
					match(T__6);
					setState(91);
					match(T__10);
					setState(92);
					match(T__9);
					setState(93);
					condition();
					}
				}

				setState(96);
				match(T__7);
				setState(97);
				match(T__3);
				setState(98);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(ID);
				setState(101);
				match(T__0);
				setState(102);
				match(T__14);
				setState(103);
				match(T__2);
				setState(104);
				match(T__5);
				{
				setState(105);
				match(T__10);
				setState(106);
				match(T__9);
				setState(107);
				condition();
				{
				setState(108);
				match(T__6);
				}
				}
				{
				setState(110);
				match(T__15);
				setState(111);
				match(T__9);
				setState(112);
				setList();
				}
				setState(114);
				match(T__7);
				setState(115);
				match(T__3);
				setState(116);
				match(T__4);
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
	public static class RemoveExpressionContext extends ParserRuleContext {
		public RemoveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeExpression; }
	 
		public RemoveExpressionContext() { }
		public void copyFrom(RemoveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RemoveExprContext extends RemoveExpressionContext {
		public TerminalNode ID() { return getToken(ORAParser.ID, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RemoveExprContext(RemoveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterRemoveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitRemoveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitRemoveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemoveExpressionContext removeExpression() throws RecognitionException {
		RemoveExpressionContext _localctx = new RemoveExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_removeExpression);
		try {
			_localctx = new RemoveExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(121);
			match(T__0);
			setState(122);
			match(T__16);
			setState(123);
			match(T__2);
			setState(124);
			match(T__5);
			setState(125);
			match(T__10);
			setState(126);
			match(T__9);
			setState(127);
			condition();
			setState(128);
			match(T__7);
			setState(129);
			match(T__3);
			setState(130);
			match(T__4);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionAtomContext> expressionAtom() {
			return getRuleContexts(ExpressionAtomContext.class);
		}
		public ExpressionAtomContext expressionAtom(int i) {
			return getRuleContext(ExpressionAtomContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ORAParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ORAParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(ORAParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ORAParser.OR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			expressionAtom();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(133);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(134);
				expressionAtom();
				}
				}
				setState(139);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAtomContext extends ParserRuleContext {
		public ExpressionAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAtom; }
	 
		public ExpressionAtomContext() { }
		public void copyFrom(ExpressionAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionAtomContext extends ExpressionAtomContext {
		public TerminalNode NOT() { return getToken(ORAParser.NOT, 0); }
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public NotExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterNotExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitNotExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitNotExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsAtomContext extends ExpressionAtomContext {
		public TerminalNode ID() { return getToken(ORAParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ORAParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ORAParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(ORAParser.LT, 0); }
		public TerminalNode GT() { return getToken(ORAParser.GT, 0); }
		public TerminalNode LE() { return getToken(ORAParser.LE, 0); }
		public TerminalNode GE() { return getToken(ORAParser.GE, 0); }
		public ExpressionsAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterExpressionsAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitExpressionsAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitExpressionsAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParanthesizedConditionContext extends ExpressionAtomContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ParanthesizedConditionContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterParanthesizedCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitParanthesizedCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitParanthesizedCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAtomContext expressionAtom() throws RecognitionException {
		ExpressionAtomContext _localctx = new ExpressionAtomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressionAtom);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ExpressionsAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(ID);
				setState(141);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(142);
				value();
				}
				break;
			case NOT:
				_localctx = new NotExpressionAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(NOT);
				setState(144);
				expressionAtom();
				}
				break;
			case T__2:
				_localctx = new ParanthesizedConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(T__2);
				setState(146);
				condition();
				setState(147);
				match(T__3);
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
	public static class SortParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ORAParser.ID, 0); }
		public SortParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterSortParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitSortParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitSortParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortParamContext sortParam() throws RecognitionException {
		SortParamContext _localctx = new SortParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sortParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ID);
			setState(152);
			match(T__0);
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(154);
			match(T__19);
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
	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__5);
			setState(157);
			assignment();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(158);
				match(T__6);
				setState(159);
				assignment();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(T__7);
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
	public static class SetListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public SetListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterSetList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitSetList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitSetList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetListContext setList() throws RecognitionException {
		SetListContext _localctx = new SetListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_setList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__20);
			setState(168);
			assignment();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(169);
				match(T__6);
				setState(170);
				assignment();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(T__21);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ORAParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ID);
			setState(179);
			match(T__22);
			setState(180);
			value();
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
	public static class ArrayContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ORAParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ORAParser.ID, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__20);
			setState(183);
			match(ID);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(184);
				match(T__6);
				setState(185);
				match(ID);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(T__21);
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
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ValueContext {
		public TerminalNode STRING() { return getToken(ORAParser.STRING, 0); }
		public StringContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ValueContext {
		public TerminalNode FLOAT() { return getToken(ORAParser.FLOAT, 0); }
		public FloatContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ValueContext {
		public TerminalNode INT() { return getToken(ORAParser.INT, 0); }
		public IntContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ORAListener ) ((ORAListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ORAVisitor ) return ((ORAVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(STRING);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(FLOAT);
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

	public static final String _serializedATN =
		"\u0004\u0001%\u00c7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00036\b\u0003\n\u0003\f\u0003"+
		"9\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004I\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006_\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006w\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0088"+
		"\b\b\n\b\f\b\u008b\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u0096\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00a1\b\u000b\n\u000b\f\u000b\u00a4\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ac\b\f\n\f\f\f\u00af\t\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00bb\b\u000e\n\u000e\f\u000e\u00be\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00c5\b\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0003"+
		"\u0001\u0000\u001e\u001f\u0001\u0000\u0018\u001d\u0001\u0000\u0012\u0013"+
		"\u00c7\u0000 \u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000"+
		"\u0004)\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000\bH\u0001"+
		"\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000\fv\u0001\u0000\u0000\u0000"+
		"\u000ex\u0001\u0000\u0000\u0000\u0010\u0084\u0001\u0000\u0000\u0000\u0012"+
		"\u0095\u0001\u0000\u0000\u0000\u0014\u0097\u0001\u0000\u0000\u0000\u0016"+
		"\u009c\u0001\u0000\u0000\u0000\u0018\u00a7\u0001\u0000\u0000\u0000\u001a"+
		"\u00b2\u0001\u0000\u0000\u0000\u001c\u00b6\u0001\u0000\u0000\u0000\u001e"+
		"\u00c4\u0001\u0000\u0000\u0000 !\u0003\u0002\u0001\u0000!\"\u0005\u0000"+
		"\u0000\u0001\"\u0001\u0001\u0000\u0000\u0000#(\u0003\u0004\u0002\u0000"+
		"$(\u0003\n\u0005\u0000%(\u0003\f\u0006\u0000&(\u0003\u000e\u0007\u0000"+
		"\'#\u0001\u0000\u0000\u0000\'$\u0001\u0000\u0000\u0000\'%\u0001\u0000"+
		"\u0000\u0000\'&\u0001\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000"+
		")*\u0005!\u0000\u0000*+\u0005\u0001\u0000\u0000+,\u0005\u0002\u0000\u0000"+
		",-\u0005\u0003\u0000\u0000-.\u0003\u0006\u0003\u0000./\u0005\u0004\u0000"+
		"\u0000/0\u0005\u0005\u0000\u00000\u0005\u0001\u0000\u0000\u000012\u0005"+
		"\u0006\u0000\u000027\u0003\b\u0004\u000034\u0005\u0007\u0000\u000046\u0003"+
		"\b\u0004\u000053\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u0000:;\u0005\b\u0000\u0000;\u0007\u0001\u0000\u0000"+
		"\u0000<=\u0005\t\u0000\u0000=>\u0005\n\u0000\u0000>I\u0003\u001c\u000e"+
		"\u0000?@\u0005\u000b\u0000\u0000@A\u0005\n\u0000\u0000AI\u0003\u0010\b"+
		"\u0000BC\u0005\f\u0000\u0000CD\u0005\n\u0000\u0000DI\u0003\u0014\n\u0000"+
		"EF\u0005\r\u0000\u0000FG\u0005\n\u0000\u0000GI\u0005#\u0000\u0000H<\u0001"+
		"\u0000\u0000\u0000H?\u0001\u0000\u0000\u0000HB\u0001\u0000\u0000\u0000"+
		"HE\u0001\u0000\u0000\u0000I\t\u0001\u0000\u0000\u0000JK\u0005!\u0000\u0000"+
		"KL\u0005\u0001\u0000\u0000LM\u0005\u000e\u0000\u0000MN\u0005\u0003\u0000"+
		"\u0000NO\u0003\u0016\u000b\u0000OP\u0005\u0004\u0000\u0000PQ\u0005\u0005"+
		"\u0000\u0000Q\u000b\u0001\u0000\u0000\u0000RS\u0005!\u0000\u0000ST\u0005"+
		"\u0001\u0000\u0000TU\u0005\u000f\u0000\u0000UV\u0005\u0003\u0000\u0000"+
		"VW\u0005\u0006\u0000\u0000WX\u0005\u0010\u0000\u0000XY\u0005\n\u0000\u0000"+
		"Y^\u0003\u0018\f\u0000Z[\u0005\u0007\u0000\u0000[\\\u0005\u000b\u0000"+
		"\u0000\\]\u0005\n\u0000\u0000]_\u0003\u0010\b\u0000^Z\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005\b\u0000"+
		"\u0000ab\u0005\u0004\u0000\u0000bc\u0005\u0005\u0000\u0000cw\u0001\u0000"+
		"\u0000\u0000de\u0005!\u0000\u0000ef\u0005\u0001\u0000\u0000fg\u0005\u000f"+
		"\u0000\u0000gh\u0005\u0003\u0000\u0000hi\u0005\u0006\u0000\u0000ij\u0005"+
		"\u000b\u0000\u0000jk\u0005\n\u0000\u0000kl\u0003\u0010\b\u0000lm\u0005"+
		"\u0007\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005\u0010\u0000\u0000"+
		"op\u0005\n\u0000\u0000pq\u0003\u0018\f\u0000qr\u0001\u0000\u0000\u0000"+
		"rs\u0005\b\u0000\u0000st\u0005\u0004\u0000\u0000tu\u0005\u0005\u0000\u0000"+
		"uw\u0001\u0000\u0000\u0000vR\u0001\u0000\u0000\u0000vd\u0001\u0000\u0000"+
		"\u0000w\r\u0001\u0000\u0000\u0000xy\u0005!\u0000\u0000yz\u0005\u0001\u0000"+
		"\u0000z{\u0005\u0011\u0000\u0000{|\u0005\u0003\u0000\u0000|}\u0005\u0006"+
		"\u0000\u0000}~\u0005\u000b\u0000\u0000~\u007f\u0005\n\u0000\u0000\u007f"+
		"\u0080\u0003\u0010\b\u0000\u0080\u0081\u0005\b\u0000\u0000\u0081\u0082"+
		"\u0005\u0004\u0000\u0000\u0082\u0083\u0005\u0005\u0000\u0000\u0083\u000f"+
		"\u0001\u0000\u0000\u0000\u0084\u0089\u0003\u0012\t\u0000\u0085\u0086\u0007"+
		"\u0000\u0000\u0000\u0086\u0088\u0003\u0012\t\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0011\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0005!\u0000"+
		"\u0000\u008d\u008e\u0007\u0001\u0000\u0000\u008e\u0096\u0003\u001e\u000f"+
		"\u0000\u008f\u0090\u0005 \u0000\u0000\u0090\u0096\u0003\u0012\t\u0000"+
		"\u0091\u0092\u0005\u0003\u0000\u0000\u0092\u0093\u0003\u0010\b\u0000\u0093"+
		"\u0094\u0005\u0004\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095"+
		"\u008c\u0001\u0000\u0000\u0000\u0095\u008f\u0001\u0000\u0000\u0000\u0095"+
		"\u0091\u0001\u0000\u0000\u0000\u0096\u0013\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005!\u0000\u0000\u0098\u0099\u0005\u0001\u0000\u0000\u0099\u009a"+
		"\u0007\u0002\u0000\u0000\u009a\u009b\u0005\u0014\u0000\u0000\u009b\u0015"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0006\u0000\u0000\u009d\u00a2"+
		"\u0003\u001a\r\u0000\u009e\u009f\u0005\u0007\u0000\u0000\u009f\u00a1\u0003"+
		"\u001a\r\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005\b\u0000\u0000\u00a6\u0017\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005\u0015\u0000\u0000\u00a8\u00ad\u0003\u001a\r\u0000"+
		"\u00a9\u00aa\u0005\u0007\u0000\u0000\u00aa\u00ac\u0003\u001a\r\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005\u0016\u0000\u0000\u00b1\u0019\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0005!\u0000\u0000\u00b3\u00b4\u0005\u0017\u0000\u0000\u00b4\u00b5"+
		"\u0003\u001e\u000f\u0000\u00b5\u001b\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0005\u0015\u0000\u0000\u00b7\u00bc\u0005!\u0000\u0000\u00b8\u00b9\u0005"+
		"\u0007\u0000\u0000\u00b9\u00bb\u0005!\u0000\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0016"+
		"\u0000\u0000\u00c0\u001d\u0001\u0000\u0000\u0000\u00c1\u00c5\u0005\"\u0000"+
		"\u0000\u00c2\u00c5\u0005#\u0000\u0000\u00c3\u00c5\u0005$\u0000\u0000\u00c4"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u001f\u0001\u0000\u0000\u0000\u000b"+
		"\'7H^v\u0089\u0095\u00a2\u00ad\u00bc\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}