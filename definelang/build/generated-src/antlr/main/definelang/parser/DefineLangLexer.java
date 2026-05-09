// Generated from definelang/parser/DefineLang.g4 by ANTLR 4.13.2
package definelang.parser; import static definelang.AST.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DefineLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Define=7, Let=8, Dot=9, 
		Number=10, Identifier=11, Letter=12, LetterOrDigit=13, StrLiteral=14, 
		AT=15, ELLIPSIS=16, WS=17, Comment=18, Line_Comment=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "Define", "Let", "Dot", 
			"Number", "Identifier", "Letter", "LetterOrDigit", "DIGIT", "ESCQUOTE", 
			"StrLiteral", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
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


	public DefineLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DefineLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 12:
			return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0013\u0095\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0004\tF\b\t\u000b\t\f\tG\u0001\n\u0001\n\u0005\nL\b\n\n\n"+
		"\f\nO\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000bW\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f_\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000fi\b\u000f\n\u000f"+
		"\f\u000fl\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012w\b"+
		"\u0012\u000b\u0012\f\u0012x\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0081\b\u0013\n\u0013\f\u0013"+
		"\u0084\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u008f\b\u0014"+
		"\n\u0014\f\u0014\u0092\t\u0014\u0001\u0014\u0001\u0014\u0002j\u0082\u0000"+
		"\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u0000"+
		"\u001d\u0000\u001f\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013\u0001\u0000"+
		"\u0007\u0004\u0000$$AZ__az\u0002\u0000\u0000\u00ff\u8000\ud800\u8000\udbff"+
		"\u0001\u0000\u8000\ud800\u8000\udbff\u0001\u0000\u8000\udc00\u8000\udfff"+
		"\u0005\u0000$$09AZ__az\u0002\u0000\n\n\r\r\u0003\u0000\t\n\f\r  \u009d"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001\u0000\u0000\u0000\u0005/"+
		"\u0001\u0000\u0000\u0000\u00071\u0001\u0000\u0000\u0000\t3\u0001\u0000"+
		"\u0000\u0000\u000b5\u0001\u0000\u0000\u0000\r7\u0001\u0000\u0000\u0000"+
		"\u000f>\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000\u0013E"+
		"\u0001\u0000\u0000\u0000\u0015I\u0001\u0000\u0000\u0000\u0017V\u0001\u0000"+
		"\u0000\u0000\u0019^\u0001\u0000\u0000\u0000\u001b`\u0001\u0000\u0000\u0000"+
		"\u001db\u0001\u0000\u0000\u0000\u001fe\u0001\u0000\u0000\u0000!o\u0001"+
		"\u0000\u0000\u0000#q\u0001\u0000\u0000\u0000%v\u0001\u0000\u0000\u0000"+
		"\'|\u0001\u0000\u0000\u0000)\u008a\u0001\u0000\u0000\u0000+,\u0005(\u0000"+
		"\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005)\u0000\u0000.\u0004\u0001"+
		"\u0000\u0000\u0000/0\u0005-\u0000\u00000\u0006\u0001\u0000\u0000\u0000"+
		"12\u0005+\u0000\u00002\b\u0001\u0000\u0000\u000034\u0005*\u0000\u0000"+
		"4\n\u0001\u0000\u0000\u000056\u0005/\u0000\u00006\f\u0001\u0000\u0000"+
		"\u000078\u0005d\u0000\u000089\u0005e\u0000\u00009:\u0005f\u0000\u0000"+
		":;\u0005i\u0000\u0000;<\u0005n\u0000\u0000<=\u0005e\u0000\u0000=\u000e"+
		"\u0001\u0000\u0000\u0000>?\u0005l\u0000\u0000?@\u0005e\u0000\u0000@A\u0005"+
		"t\u0000\u0000A\u0010\u0001\u0000\u0000\u0000BC\u0005.\u0000\u0000C\u0012"+
		"\u0001\u0000\u0000\u0000DF\u0003\u001b\r\u0000ED\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000H\u0014\u0001\u0000\u0000\u0000IM\u0003\u0017\u000b\u0000JL\u0003"+
		"\u0019\f\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0016\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PW\u0007\u0000\u0000\u0000QR\b\u0001\u0000"+
		"\u0000RW\u0004\u000b\u0000\u0000ST\u0007\u0002\u0000\u0000TU\u0007\u0003"+
		"\u0000\u0000UW\u0004\u000b\u0001\u0000VP\u0001\u0000\u0000\u0000VQ\u0001"+
		"\u0000\u0000\u0000VS\u0001\u0000\u0000\u0000W\u0018\u0001\u0000\u0000"+
		"\u0000X_\u0007\u0004\u0000\u0000YZ\b\u0001\u0000\u0000Z_\u0004\f\u0002"+
		"\u0000[\\\u0007\u0002\u0000\u0000\\]\u0007\u0003\u0000\u0000]_\u0004\f"+
		"\u0003\u0000^X\u0001\u0000\u0000\u0000^Y\u0001\u0000\u0000\u0000^[\u0001"+
		"\u0000\u0000\u0000_\u001a\u0001\u0000\u0000\u0000`a\u000209\u0000a\u001c"+
		"\u0001\u0000\u0000\u0000bc\u0005\\\u0000\u0000cd\u0005\"\u0000\u0000d"+
		"\u001e\u0001\u0000\u0000\u0000ej\u0005\"\u0000\u0000fi\u0003\u001d\u000e"+
		"\u0000gi\b\u0005\u0000\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000il\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0005"+
		"\"\u0000\u0000n \u0001\u0000\u0000\u0000op\u0005@\u0000\u0000p\"\u0001"+
		"\u0000\u0000\u0000qr\u0005.\u0000\u0000rs\u0005.\u0000\u0000st\u0005."+
		"\u0000\u0000t$\u0001\u0000\u0000\u0000uw\u0007\u0006\u0000\u0000vu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0006\u0012\u0000"+
		"\u0000{&\u0001\u0000\u0000\u0000|}\u0005/\u0000\u0000}~\u0005*\u0000\u0000"+
		"~\u0082\u0001\u0000\u0000\u0000\u007f\u0081\t\u0000\u0000\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083"+
		"\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005*\u0000\u0000\u0086\u0087\u0005/\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0006\u0013\u0000\u0000\u0089(\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005/\u0000\u0000\u008b\u008c\u0005/\u0000\u0000"+
		"\u008c\u0090\u0001\u0000\u0000\u0000\u008d\u008f\b\u0005\u0000\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0093\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0006\u0014\u0000\u0000\u0094*\u0001\u0000\u0000\u0000\n\u0000"+
		"GMV^hjx\u0082\u0090\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}