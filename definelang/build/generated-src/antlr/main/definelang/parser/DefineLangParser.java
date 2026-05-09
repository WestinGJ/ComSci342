// Generated from definelang/parser/DefineLang.g4 by ANTLR 4.13.2
package definelang.parser; import static definelang.AST.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DefineLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Define=7, Let=8, Dot=9, 
		Number=10, Identifier=11, Letter=12, LetterOrDigit=13, StrLiteral=14, 
		AT=15, ELLIPSIS=16, WS=17, Comment=18, Line_Comment=19;
	public static final int
		RULE_program = 0, RULE_definedecl = 1, RULE_exp = 2, RULE_varexp = 3, 
		RULE_letexp = 4, RULE_numexp = 5, RULE_addexp = 6, RULE_subexp = 7, RULE_multexp = 8, 
		RULE_divexp = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definedecl", "exp", "varexp", "letexp", "numexp", "addexp", 
			"subexp", "multexp", "divexp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'-'", "'+'", "'*'", "'/'", "'define'", "'let'", 
			"'.'", null, null, null, null, null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "Define", "Let", "Dot", "Number", 
			"Identifier", "Letter", "LetterOrDigit", "StrLiteral", "AT", "ELLIPSIS", 
			"WS", "Comment", "Line_Comment"
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
	public String getGrammarFileName() { return "DefineLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DefineLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public ArrayList<DefineDecl> defs = new ArrayList<DefineDecl>();;
		public Exp expr = new UnitExp();;
		public DefinedeclContext def;
		public ExpContext e;
		public List<DefinedeclContext> definedecl() {
			return getRuleContexts(DefinedeclContext.class);
		}
		public DefinedeclContext definedecl(int i) {
			return getRuleContext(DefinedeclContext.class,i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(20);
					((ProgramContext)_localctx).def = definedecl();
					 _localctx.defs.add(((ProgramContext)_localctx).def.ast); 
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3082L) != 0)) {
				{
				setState(28);
				((ProgramContext)_localctx).e = exp();
				 ((ProgramContext)_localctx).expr =  ((ProgramContext)_localctx).e.ast; 
				}
			}

			 ((ProgramContext)_localctx).ast =  new Program(_localctx.defs, _localctx.expr); 
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
	public static class DefinedeclContext extends ParserRuleContext {
		public DefineDecl ast;
		public Token id;
		public ExpContext e;
		public TerminalNode Define() { return getToken(DefineLangParser.Define, 0); }
		public TerminalNode Identifier() { return getToken(DefineLangParser.Identifier, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DefinedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedecl; }
	}

	public final DefinedeclContext definedecl() throws RecognitionException {
		DefinedeclContext _localctx = new DefinedeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definedecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__0);
			setState(36);
			match(Define);
			setState(37);
			((DefinedeclContext)_localctx).id = match(Identifier);
			setState(38);
			((DefinedeclContext)_localctx).e = exp();
			setState(39);
			match(T__1);
			 ((DefinedeclContext)_localctx).ast =  new DefineDecl((((DefinedeclContext)_localctx).id!=null?((DefinedeclContext)_localctx).id.getText():null), ((DefinedeclContext)_localctx).e.ast); 
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
	public static class ExpContext extends ParserRuleContext {
		public Exp ast;
		public VarexpContext v;
		public NumexpContext n;
		public AddexpContext a;
		public SubexpContext s;
		public MultexpContext m;
		public DivexpContext d;
		public LetexpContext l;
		public VarexpContext varexp() {
			return getRuleContext(VarexpContext.class,0);
		}
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public SubexpContext subexp() {
			return getRuleContext(SubexpContext.class,0);
		}
		public MultexpContext multexp() {
			return getRuleContext(MultexpContext.class,0);
		}
		public DivexpContext divexp() {
			return getRuleContext(DivexpContext.class,0);
		}
		public LetexpContext letexp() {
			return getRuleContext(LetexpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				((ExpContext)_localctx).v = varexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).v.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				((ExpContext)_localctx).n = numexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				((ExpContext)_localctx).a = addexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).a.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				((ExpContext)_localctx).s = subexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).s.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				((ExpContext)_localctx).m = multexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).m.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				((ExpContext)_localctx).d = divexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).d.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				((ExpContext)_localctx).l = letexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).l.ast; 
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
	public static class VarexpContext extends ParserRuleContext {
		public VarExp ast;
		public Token id;
		public TerminalNode Identifier() { return getToken(DefineLangParser.Identifier, 0); }
		public VarexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varexp; }
	}

	public final VarexpContext varexp() throws RecognitionException {
		VarexpContext _localctx = new VarexpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			((VarexpContext)_localctx).id = match(Identifier);
			 ((VarexpContext)_localctx).ast =  new VarExp((((VarexpContext)_localctx).id!=null?((VarexpContext)_localctx).id.getText():null)); 
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
	public static class LetexpContext extends ParserRuleContext {
		public LetExp ast;
		public ArrayList<String> names = new ArrayList<String>();;
		public ArrayList<Exp> value_exps = new ArrayList<Exp>();;
		public Token id;
		public ExpContext e;
		public ExpContext body;
		public TerminalNode Let() { return getToken(DefineLangParser.Let, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(DefineLangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DefineLangParser.Identifier, i);
		}
		public LetexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letexp; }
	}

	public final LetexpContext letexp() throws RecognitionException {
		LetexpContext _localctx = new LetexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_letexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(69);
			match(Let);
			setState(70);
			match(T__0);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				match(T__0);
				setState(72);
				((LetexpContext)_localctx).id = match(Identifier);
				setState(73);
				((LetexpContext)_localctx).e = exp();
				setState(74);
				match(T__1);
				 _localctx.names.add((((LetexpContext)_localctx).id!=null?((LetexpContext)_localctx).id.getText():null)); _localctx.value_exps.add(((LetexpContext)_localctx).e.ast); 
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(81);
			match(T__1);
			setState(82);
			((LetexpContext)_localctx).body = exp();
			setState(83);
			match(T__1);
			 ((LetexpContext)_localctx).ast =  new LetExp(_localctx.names, _localctx.value_exps, ((LetexpContext)_localctx).body.ast); 
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
	public static class NumexpContext extends ParserRuleContext {
		public NumExp ast;
		public Token n0;
		public Token n1;
		public List<TerminalNode> Number() { return getTokens(DefineLangParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(DefineLangParser.Number, i);
		}
		public TerminalNode Dot() { return getToken(DefineLangParser.Dot, 0); }
		public NumexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexp; }
	}

	public final NumexpContext numexp() throws RecognitionException {
		NumexpContext _localctx = new NumexpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numexp);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp( Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__2);
				setState(89);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(-Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(92);
				match(Dot);
				setState(93);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble(      (((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(T__2);
				setState(96);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(97);
				match(Dot);
				setState(98);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble("-" + (((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
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
	public static class AddexpContext extends ParserRuleContext {
		public AddExp ast;
		public ArrayList<Exp> list = new ArrayList<Exp>();;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AddexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexp; }
	}

	public final AddexpContext addexp() throws RecognitionException {
		AddexpContext _localctx = new AddexpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__0);
			setState(103);
			match(T__3);
			setState(104);
			((AddexpContext)_localctx).e = exp();
			 _localctx.list.add(((AddexpContext)_localctx).e.ast); 
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				((AddexpContext)_localctx).e = exp();
				 _localctx.list.add(((AddexpContext)_localctx).e.ast); 
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3082L) != 0) );
			setState(113);
			match(T__1);
			 ((AddexpContext)_localctx).ast =  new AddExp(_localctx.list); 
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
	public static class SubexpContext extends ParserRuleContext {
		public SubExp ast;
		public ArrayList<Exp> list = new ArrayList<Exp>();;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SubexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexp; }
	}

	public final SubexpContext subexp() throws RecognitionException {
		SubexpContext _localctx = new SubexpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__0);
			setState(117);
			match(T__2);
			setState(118);
			((SubexpContext)_localctx).e = exp();
			 _localctx.list.add(((SubexpContext)_localctx).e.ast); 
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				((SubexpContext)_localctx).e = exp();
				 _localctx.list.add(((SubexpContext)_localctx).e.ast); 
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3082L) != 0) );
			setState(127);
			match(T__1);
			 ((SubexpContext)_localctx).ast =  new SubExp(_localctx.list); 
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
	public static class MultexpContext extends ParserRuleContext {
		public MultExp ast;
		public ArrayList<Exp> list = new ArrayList<Exp>();;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MultexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multexp; }
	}

	public final MultexpContext multexp() throws RecognitionException {
		MultexpContext _localctx = new MultexpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__0);
			setState(131);
			match(T__4);
			setState(132);
			((MultexpContext)_localctx).e = exp();
			 _localctx.list.add(((MultexpContext)_localctx).e.ast); 
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				((MultexpContext)_localctx).e = exp();
				 _localctx.list.add(((MultexpContext)_localctx).e.ast); 
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3082L) != 0) );
			setState(141);
			match(T__1);
			 ((MultexpContext)_localctx).ast =  new MultExp(_localctx.list); 
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
	public static class DivexpContext extends ParserRuleContext {
		public DivExp ast;
		public ArrayList<Exp> list = new ArrayList<Exp>();;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public DivexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divexp; }
	}

	public final DivexpContext divexp() throws RecognitionException {
		DivexpContext _localctx = new DivexpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_divexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__0);
			setState(145);
			match(T__5);
			setState(146);
			((DivexpContext)_localctx).e = exp();
			 _localctx.list.add(((DivexpContext)_localctx).e.ast); 
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148);
				((DivexpContext)_localctx).e = exp();
				 _localctx.list.add(((DivexpContext)_localctx).e.ast); 
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3082L) != 0) );
			setState(155);
			match(T__1);
			 ((DivexpContext)_localctx).ast =  new DivExp(_localctx.list); 
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
		"\u0004\u0001\u0013\u009f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000 \b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002@\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"N\b\u0004\u000b\u0004\f\u0004O\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005e\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0004\u0006n\b\u0006\u000b\u0006\f\u0006o\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007|\b\u0007\u000b\u0007\f\u0007}\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0004\b\u008a\b\b\u000b\b\f\b\u008b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u0098"+
		"\b\t\u000b\t\f\t\u0099\u0001\t\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000\u00a4\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004?\u0001\u0000"+
		"\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\bD\u0001\u0000\u0000\u0000"+
		"\nd\u0001\u0000\u0000\u0000\ff\u0001\u0000\u0000\u0000\u000et\u0001\u0000"+
		"\u0000\u0000\u0010\u0082\u0001\u0000\u0000\u0000\u0012\u0090\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0003\u0002\u0001\u0000\u0015\u0016\u0006\u0000"+
		"\uffff\uffff\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0014\u0001"+
		"\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001f\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0003"+
		"\u0004\u0002\u0000\u001d\u001e\u0006\u0000\uffff\uffff\u0000\u001e \u0001"+
		"\u0000\u0000\u0000\u001f\u001c\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0006\u0000\uffff\uffff\u0000"+
		"\"\u0001\u0001\u0000\u0000\u0000#$\u0005\u0001\u0000\u0000$%\u0005\u0007"+
		"\u0000\u0000%&\u0005\u000b\u0000\u0000&\'\u0003\u0004\u0002\u0000\'(\u0005"+
		"\u0002\u0000\u0000()\u0006\u0001\uffff\uffff\u0000)\u0003\u0001\u0000"+
		"\u0000\u0000*+\u0003\u0006\u0003\u0000+,\u0006\u0002\uffff\uffff\u0000"+
		",@\u0001\u0000\u0000\u0000-.\u0003\n\u0005\u0000./\u0006\u0002\uffff\uffff"+
		"\u0000/@\u0001\u0000\u0000\u000001\u0003\f\u0006\u000012\u0006\u0002\uffff"+
		"\uffff\u00002@\u0001\u0000\u0000\u000034\u0003\u000e\u0007\u000045\u0006"+
		"\u0002\uffff\uffff\u00005@\u0001\u0000\u0000\u000067\u0003\u0010\b\u0000"+
		"78\u0006\u0002\uffff\uffff\u00008@\u0001\u0000\u0000\u00009:\u0003\u0012"+
		"\t\u0000:;\u0006\u0002\uffff\uffff\u0000;@\u0001\u0000\u0000\u0000<=\u0003"+
		"\b\u0004\u0000=>\u0006\u0002\uffff\uffff\u0000>@\u0001\u0000\u0000\u0000"+
		"?*\u0001\u0000\u0000\u0000?-\u0001\u0000\u0000\u0000?0\u0001\u0000\u0000"+
		"\u0000?3\u0001\u0000\u0000\u0000?6\u0001\u0000\u0000\u0000?9\u0001\u0000"+
		"\u0000\u0000?<\u0001\u0000\u0000\u0000@\u0005\u0001\u0000\u0000\u0000"+
		"AB\u0005\u000b\u0000\u0000BC\u0006\u0003\uffff\uffff\u0000C\u0007\u0001"+
		"\u0000\u0000\u0000DE\u0005\u0001\u0000\u0000EF\u0005\b\u0000\u0000FM\u0005"+
		"\u0001\u0000\u0000GH\u0005\u0001\u0000\u0000HI\u0005\u000b\u0000\u0000"+
		"IJ\u0003\u0004\u0002\u0000JK\u0005\u0002\u0000\u0000KL\u0006\u0004\uffff"+
		"\uffff\u0000LN\u0001\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QR\u0005\u0002\u0000\u0000RS\u0003\u0004\u0002"+
		"\u0000ST\u0005\u0002\u0000\u0000TU\u0006\u0004\uffff\uffff\u0000U\t\u0001"+
		"\u0000\u0000\u0000VW\u0005\n\u0000\u0000We\u0006\u0005\uffff\uffff\u0000"+
		"XY\u0005\u0003\u0000\u0000YZ\u0005\n\u0000\u0000Ze\u0006\u0005\uffff\uffff"+
		"\u0000[\\\u0005\n\u0000\u0000\\]\u0005\t\u0000\u0000]^\u0005\n\u0000\u0000"+
		"^e\u0006\u0005\uffff\uffff\u0000_`\u0005\u0003\u0000\u0000`a\u0005\n\u0000"+
		"\u0000ab\u0005\t\u0000\u0000bc\u0005\n\u0000\u0000ce\u0006\u0005\uffff"+
		"\uffff\u0000dV\u0001\u0000\u0000\u0000dX\u0001\u0000\u0000\u0000d[\u0001"+
		"\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000e\u000b\u0001\u0000\u0000"+
		"\u0000fg\u0005\u0001\u0000\u0000gh\u0005\u0004\u0000\u0000hi\u0003\u0004"+
		"\u0002\u0000im\u0006\u0006\uffff\uffff\u0000jk\u0003\u0004\u0002\u0000"+
		"kl\u0006\u0006\uffff\uffff\u0000ln\u0001\u0000\u0000\u0000mj\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0005\u0002\u0000\u0000"+
		"rs\u0006\u0006\uffff\uffff\u0000s\r\u0001\u0000\u0000\u0000tu\u0005\u0001"+
		"\u0000\u0000uv\u0005\u0003\u0000\u0000vw\u0003\u0004\u0002\u0000w{\u0006"+
		"\u0007\uffff\uffff\u0000xy\u0003\u0004\u0002\u0000yz\u0006\u0007\uffff"+
		"\uffff\u0000z|\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0002\u0000\u0000\u0080"+
		"\u0081\u0006\u0007\uffff\uffff\u0000\u0081\u000f\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005\u0001\u0000\u0000\u0083\u0084\u0005\u0005\u0000\u0000"+
		"\u0084\u0085\u0003\u0004\u0002\u0000\u0085\u0089\u0006\b\uffff\uffff\u0000"+
		"\u0086\u0087\u0003\u0004\u0002\u0000\u0087\u0088\u0006\b\uffff\uffff\u0000"+
		"\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0086\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005\u0002\u0000\u0000\u008e\u008f\u0006\b\uffff\uffff\u0000"+
		"\u008f\u0011\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0001\u0000\u0000"+
		"\u0091\u0092\u0005\u0006\u0000\u0000\u0092\u0093\u0003\u0004\u0002\u0000"+
		"\u0093\u0097\u0006\t\uffff\uffff\u0000\u0094\u0095\u0003\u0004\u0002\u0000"+
		"\u0095\u0096\u0006\t\uffff\uffff\u0000\u0096\u0098\u0001\u0000\u0000\u0000"+
		"\u0097\u0094\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0002\u0000\u0000"+
		"\u009c\u009d\u0006\t\uffff\uffff\u0000\u009d\u0013\u0001\u0000\u0000\u0000"+
		"\t\u0019\u001f?Odo}\u008b\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}