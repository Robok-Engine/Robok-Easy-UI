// Generated from GUI.g4 by ANTLR 4.13.2
package org.robok.antlr4.gui;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GUILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IDENTIFIER=7, IDENTIFIER_COLON=8, 
		STRING=9, NUMBER=10, BOOLEAN=11, IDENTIFIER_DOT=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "IDENTIFIER", "IDENTIFIER_COLON", 
			"STRING", "NUMBER", "BOOLEAN", "IDENTIFIER_DOT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "','", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "IDENTIFIER", "IDENTIFIER_COLON", 
			"STRING", "NUMBER", "BOOLEAN", "IDENTIFIER_DOT", "WS"
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


	public GUILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GUI.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\rs\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006*\b"+
		"\u0006\n\u0006\f\u0006-\t\u0006\u0001\u0007\u0001\u0007\u0005\u00071\b"+
		"\u0007\n\u0007\f\u00074\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b:\b\b\n\b\f\b=\t\b\u0001\b\u0001\b\u0001\t\u0004\tB\b\t\u000b\t\f\t"+
		"C\u0001\t\u0001\t\u0004\tH\b\t\u000b\t\f\tI\u0003\tL\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nW\b"+
		"\n\u0001\u000b\u0001\u000b\u0005\u000b[\b\u000b\n\u000b\f\u000b^\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bc\b\u000b\n\u000b\f\u000b"+
		"f\t\u000b\u0005\u000bh\b\u000b\n\u000b\f\u000bk\t\u000b\u0001\f\u0004"+
		"\fn\b\f\u000b\f\f\fo\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000\u0006\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0004\u00000:AZ__az\u0002\u0000\"\"\\\\\u0001\u000009\u0003"+
		"\u0000\t\n\r\r  ~\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000"+
		"\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000"+
		"\u0000\u0007!\u0001\u0000\u0000\u0000\t#\u0001\u0000\u0000\u0000\u000b"+
		"%\u0001\u0000\u0000\u0000\r\'\u0001\u0000\u0000\u0000\u000f.\u0001\u0000"+
		"\u0000\u0000\u00115\u0001\u0000\u0000\u0000\u0013A\u0001\u0000\u0000\u0000"+
		"\u0015V\u0001\u0000\u0000\u0000\u0017X\u0001\u0000\u0000\u0000\u0019m"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0005{\u0000\u0000\u001c\u0002\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005}\u0000\u0000\u001e\u0004\u0001\u0000"+
		"\u0000\u0000\u001f \u0005(\u0000\u0000 \u0006\u0001\u0000\u0000\u0000"+
		"!\"\u0005)\u0000\u0000\"\b\u0001\u0000\u0000\u0000#$\u0005,\u0000\u0000"+
		"$\n\u0001\u0000\u0000\u0000%&\u0005=\u0000\u0000&\f\u0001\u0000\u0000"+
		"\u0000\'+\u0007\u0000\u0000\u0000(*\u0007\u0001\u0000\u0000)(\u0001\u0000"+
		"\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,\u000e\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000.2\u0007\u0000\u0000\u0000/1\u0007\u0002\u0000\u00000/\u0001\u0000"+
		"\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u00003\u0010\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u00005;\u0005\"\u0000\u00006:\b\u0003\u0000\u000078\u0005\\\u0000\u0000"+
		"8:\t\u0000\u0000\u000096\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		":=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>?\u0005\"\u0000"+
		"\u0000?\u0012\u0001\u0000\u0000\u0000@B\u0007\u0004\u0000\u0000A@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DK\u0001\u0000\u0000\u0000EG\u0005.\u0000\u0000"+
		"FH\u0007\u0004\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000"+
		"\u0000\u0000KE\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0014"+
		"\u0001\u0000\u0000\u0000MN\u0005t\u0000\u0000NO\u0005r\u0000\u0000OP\u0005"+
		"u\u0000\u0000PW\u0005e\u0000\u0000QR\u0005f\u0000\u0000RS\u0005a\u0000"+
		"\u0000ST\u0005l\u0000\u0000TU\u0005s\u0000\u0000UW\u0005e\u0000\u0000"+
		"VM\u0001\u0000\u0000\u0000VQ\u0001\u0000\u0000\u0000W\u0016\u0001\u0000"+
		"\u0000\u0000X\\\u0007\u0000\u0000\u0000Y[\u0007\u0001\u0000\u0000ZY\u0001"+
		"\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]i\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000_`\u0005.\u0000\u0000`d\u0007\u0000\u0000\u0000ac\u0007\u0001\u0000"+
		"\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000g_\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0018\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000ln\u0007\u0005\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0006\f\u0000\u0000"+
		"r\u001a\u0001\u0000\u0000\u0000\r\u0000+29;CIKV\\dio\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}