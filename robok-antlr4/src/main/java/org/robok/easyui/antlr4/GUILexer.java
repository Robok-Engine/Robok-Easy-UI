// Generated from GUI.g4 by ANTLR 4.13.2
package org.robok.easyui.antlr4;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, DEFAULT=7, IDENTIFIER=8, 
		IDENTIFIER_COLON=9, STRING=10, NUMBER=11, IDENTIFIER_DOT=12, WS=13, LINE_COMMENT=14, 
		BLOCK_COMMENT=15, HASH_COMMENT=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "DEFAULT", "IDENTIFIER", 
			"IDENTIFIER_COLON", "STRING", "NUMBER", "IDENTIFIER_DOT", "WS", "LINE_COMMENT", 
			"BLOCK_COMMENT", "HASH_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "'='", "'default'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "DEFAULT", "IDENTIFIER", "IDENTIFIER_COLON", 
			"STRING", "NUMBER", "IDENTIFIER_DOT", "WS", "LINE_COMMENT", "BLOCK_COMMENT", 
			"HASH_COMMENT"
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
		"\u0004\u0000\u0010\u0098\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0005\u00078\b\u0007\n\u0007\f\u0007;\t\u0007\u0001\b\u0001\b\u0005\b"+
		"?\b\b\n\b\f\bB\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tH\b\t\n\t\f"+
		"\tK\t\t\u0001\t\u0001\t\u0001\n\u0004\nP\b\n\u000b\n\f\nQ\u0001\n\u0001"+
		"\n\u0004\nV\b\n\u000b\n\f\nW\u0003\nZ\b\n\u0001\u000b\u0001\u000b\u0005"+
		"\u000b^\b\u000b\n\u000b\f\u000ba\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000bf\b\u000b\n\u000b\f\u000bi\t\u000b\u0005\u000bk\b\u000b"+
		"\n\u000b\f\u000bn\t\u000b\u0001\f\u0004\fq\b\f\u000b\f\f\fr\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r{\b\r\n\r\f\r~\t\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0086\b"+
		"\u000e\n\u000e\f\u000e\u0089\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u0092\b\u000f"+
		"\n\u000f\f\u000f\u0095\t\u000f\u0001\u000f\u0001\u000f\u0001\u0087\u0000"+
		"\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010\u0001\u0000\u0007\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0004\u00000:AZ__az\u0002\u0000\"\"\\\\\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  \u0002\u0000\n\n\r\r\u00a5\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000"+
		"\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000"+
		"\u0000\t)\u0001\u0000\u0000\u0000\u000b+\u0001\u0000\u0000\u0000\r-\u0001"+
		"\u0000\u0000\u0000\u000f5\u0001\u0000\u0000\u0000\u0011<\u0001\u0000\u0000"+
		"\u0000\u0013C\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017"+
		"[\u0001\u0000\u0000\u0000\u0019p\u0001\u0000\u0000\u0000\u001bv\u0001"+
		"\u0000\u0000\u0000\u001d\u0081\u0001\u0000\u0000\u0000\u001f\u008f\u0001"+
		"\u0000\u0000\u0000!\"\u0005(\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000"+
		"#$\u0005)\u0000\u0000$\u0004\u0001\u0000\u0000\u0000%&\u0005{\u0000\u0000"+
		"&\u0006\u0001\u0000\u0000\u0000\'(\u0005}\u0000\u0000(\b\u0001\u0000\u0000"+
		"\u0000)*\u0005,\u0000\u0000*\n\u0001\u0000\u0000\u0000+,\u0005=\u0000"+
		"\u0000,\f\u0001\u0000\u0000\u0000-.\u0005d\u0000\u0000./\u0005e\u0000"+
		"\u0000/0\u0005f\u0000\u000001\u0005a\u0000\u000012\u0005u\u0000\u0000"+
		"23\u0005l\u0000\u000034\u0005t\u0000\u00004\u000e\u0001\u0000\u0000\u0000"+
		"59\u0007\u0000\u0000\u000068\u0007\u0001\u0000\u000076\u0001\u0000\u0000"+
		"\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:\u0010\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		"<@\u0007\u0000\u0000\u0000=?\u0007\u0002\u0000\u0000>=\u0001\u0000\u0000"+
		"\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000A\u0012\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"CI\u0005\"\u0000\u0000DH\b\u0003\u0000\u0000EF\u0005\\\u0000\u0000FH\t"+
		"\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005\"\u0000"+
		"\u0000M\u0014\u0001\u0000\u0000\u0000NP\u0007\u0004\u0000\u0000ON\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RY\u0001\u0000\u0000\u0000SU\u0005.\u0000\u0000"+
		"TV\u0007\u0004\u0000\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000"+
		"\u0000\u0000YS\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0016"+
		"\u0001\u0000\u0000\u0000[_\u0007\u0000\u0000\u0000\\^\u0007\u0001\u0000"+
		"\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`l\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000bc\u0005.\u0000\u0000cg\u0007\u0000\u0000\u0000df\u0007"+
		"\u0001\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000jb\u0001\u0000\u0000\u0000kn\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0018"+
		"\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000oq\u0007\u0005\u0000"+
		"\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0006"+
		"\f\u0000\u0000u\u001a\u0001\u0000\u0000\u0000vw\u0005/\u0000\u0000wx\u0005"+
		"/\u0000\u0000x|\u0001\u0000\u0000\u0000y{\b\u0006\u0000\u0000zy\u0001"+
		"\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0006\r\u0000\u0000\u0080\u001c\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005/\u0000\u0000\u0082\u0083\u0005*\u0000\u0000\u0083"+
		"\u0087\u0001\u0000\u0000\u0000\u0084\u0086\t\u0000\u0000\u0000\u0085\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008a"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005*\u0000\u0000\u008b\u008c\u0005/\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0006\u000e\u0000\u0000\u008e\u001e\u0001\u0000"+
		"\u0000\u0000\u008f\u0093\u0005#\u0000\u0000\u0090\u0092\b\u0006\u0000"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0006\u000f\u0000\u0000\u0097 \u0001\u0000\u0000\u0000"+
		"\u000f\u00009@GIQWY_glr|\u0087\u0093\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}