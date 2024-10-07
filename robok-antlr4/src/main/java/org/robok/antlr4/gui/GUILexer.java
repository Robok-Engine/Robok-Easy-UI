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
		IDENTIFIER_DOT=9, NUMBER=10, BOOLEAN=11, STRING=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "IDENTIFIER", "IDENTIFIER_COLON", 
			"IDENTIFIER_DOT", "NUMBER", "BOOLEAN", "STRING", "WS"
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
			"IDENTIFIER_DOT", "NUMBER", "BOOLEAN", "STRING", "WS"
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
		"\u0007\n\u0007\f\u00074\t\u0007\u0001\b\u0001\b\u0005\b8\b\b\n\b\f\b;"+
		"\t\b\u0001\b\u0001\b\u0001\b\u0005\b@\b\b\n\b\f\bC\t\b\u0005\bE\b\b\n"+
		"\b\f\bH\t\b\u0001\t\u0004\tK\b\t\u000b\t\f\tL\u0001\t\u0001\t\u0004\t"+
		"Q\b\t\u000b\t\f\tR\u0003\tU\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n`\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000bf\b\u000b\n\u000b\f\u000bi\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0004\fn\b\f\u000b\f\f\fo\u0001\f\u0001"+
		"\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u0001\u0000\u0006\u0003\u0000AZ__az\u0004\u000009AZ__az\u0004\u0000"+
		"0:AZ__az\u0001\u000009\u0002\u0000\"\"\\\\\u0003\u0000\t\n\r\r  ~\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003\u001d"+
		"\u0001\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000\u0007!\u0001"+
		"\u0000\u0000\u0000\t#\u0001\u0000\u0000\u0000\u000b%\u0001\u0000\u0000"+
		"\u0000\r\'\u0001\u0000\u0000\u0000\u000f.\u0001\u0000\u0000\u0000\u0011"+
		"5\u0001\u0000\u0000\u0000\u0013J\u0001\u0000\u0000\u0000\u0015_\u0001"+
		"\u0000\u0000\u0000\u0017a\u0001\u0000\u0000\u0000\u0019m\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0005{\u0000\u0000\u001c\u0002\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005}\u0000\u0000\u001e\u0004\u0001\u0000\u0000\u0000\u001f"+
		" \u0005(\u0000\u0000 \u0006\u0001\u0000\u0000\u0000!\"\u0005)\u0000\u0000"+
		"\"\b\u0001\u0000\u0000\u0000#$\u0005,\u0000\u0000$\n\u0001\u0000\u0000"+
		"\u0000%&\u0005=\u0000\u0000&\f\u0001\u0000\u0000\u0000\'+\u0007\u0000"+
		"\u0000\u0000(*\u0007\u0001\u0000\u0000)(\u0001\u0000\u0000\u0000*-\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",\u000e\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000.2\u0007\u0000"+
		"\u0000\u0000/1\u0007\u0002\u0000\u00000/\u0001\u0000\u0000\u000014\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"3\u0010\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000059\u0007\u0000"+
		"\u0000\u000068\u0007\u0001\u0000\u000076\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":F\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005.\u0000\u0000"+
		"=A\u0007\u0000\u0000\u0000>@\u0007\u0001\u0000\u0000?>\u0001\u0000\u0000"+
		"\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000D<\u0001"+
		"\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000G\u0012\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000IK\u0007\u0003\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MT\u0001\u0000\u0000\u0000NP\u0005.\u0000\u0000OQ\u0007\u0003\u0000\u0000"+
		"PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TN\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0014\u0001\u0000\u0000\u0000"+
		"VW\u0005t\u0000\u0000WX\u0005r\u0000\u0000XY\u0005u\u0000\u0000Y`\u0005"+
		"e\u0000\u0000Z[\u0005f\u0000\u0000[\\\u0005a\u0000\u0000\\]\u0005l\u0000"+
		"\u0000]^\u0005s\u0000\u0000^`\u0005e\u0000\u0000_V\u0001\u0000\u0000\u0000"+
		"_Z\u0001\u0000\u0000\u0000`\u0016\u0001\u0000\u0000\u0000ag\u0005\"\u0000"+
		"\u0000bf\b\u0004\u0000\u0000cd\u0005\\\u0000\u0000df\t\u0000\u0000\u0000"+
		"eb\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\"\u0000\u0000k\u0018\u0001"+
		"\u0000\u0000\u0000ln\u0007\u0005\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qr\u0006\f\u0000\u0000r\u001a\u0001\u0000"+
		"\u0000\u0000\r\u0000+29AFLRT_ego\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}