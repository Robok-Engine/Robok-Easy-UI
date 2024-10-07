// Generated from GUI.g4 by ANTLR 4.13.2
package org.robok.antlr4.gui;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GUIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IDENTIFIER=7, IDENTIFIER_COLON=8, 
		IDENTIFIER_DOT=9, NUMBER=10, BOOLEAN=11, STRING=12, WS=13;
	public static final int
		RULE_guiFile = 0, RULE_layout = 1, RULE_component = 2, RULE_argumentList = 3, 
		RULE_argument = 4, RULE_value = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"guiFile", "layout", "component", "argumentList", "argument", "value"
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

	@Override
	public String getGrammarFileName() { return "GUI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GUIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GuiFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GUIParser.EOF, 0); }
		public List<LayoutContext> layout() {
			return getRuleContexts(LayoutContext.class);
		}
		public LayoutContext layout(int i) {
			return getRuleContext(LayoutContext.class,i);
		}
		public GuiFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guiFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).enterGuiFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).exitGuiFile(this);
		}
	}

	public final GuiFileContext guiFile() throws RecognitionException {
		GuiFileContext _localctx = new GuiFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_guiFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(12);
				layout();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
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
	public static class LayoutContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GUIParser.IDENTIFIER, 0); }
		public List<LayoutContext> layout() {
			return getRuleContexts(LayoutContext.class);
		}
		public LayoutContext layout(int i) {
			return getRuleContext(LayoutContext.class,i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public LayoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).enterLayout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).exitLayout(this);
		}
	}

	public final LayoutContext layout() throws RecognitionException {
		LayoutContext _localctx = new LayoutContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_layout);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(IDENTIFIER);
			setState(21);
			match(T__0);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				setState(24);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(22);
					layout();
					}
					break;
				case 2:
					{
					setState(23);
					component();
					}
					break;
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
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
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GUIParser.IDENTIFIER, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public List<LayoutContext> layout() {
			return getRuleContexts(LayoutContext.class);
		}
		public LayoutContext layout(int i) {
			return getRuleContext(LayoutContext.class,i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).exitComponent(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(IDENTIFIER);
			setState(32);
			match(T__2);
			setState(33);
			argumentList();
			setState(34);
			match(T__3);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(35);
				match(T__0);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					setState(38);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(36);
						layout();
						}
						break;
					case 2:
						{
						setState(37);
						component();
						}
						break;
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				match(T__1);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			argument();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(47);
				match(T__4);
				setState(48);
				argument();
				}
				}
				setState(53);
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
	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GUIParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode IDENTIFIER_COLON() { return getToken(GUIParser.IDENTIFIER_COLON, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argument);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(IDENTIFIER);
				setState(55);
				match(T__5);
				setState(56);
				value();
				}
				break;
			case IDENTIFIER_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(IDENTIFIER_COLON);
				setState(58);
				match(T__5);
				setState(59);
				value();
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GUIParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(GUIParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(GUIParser.BOOLEAN, 0); }
		public TerminalNode IDENTIFIER_DOT() { return getToken(GUIParser.IDENTIFIER_DOT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7680L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\rA\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u0019\b\u0001\n\u0001\f\u0001\u001c\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\'\b\u0002\n\u0002\f\u0002*"+
		"\t\u0002\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u00032\b\u0003\n\u0003\f\u00035\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004=\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002"+
		"\u0004\u0006\b\n\u0000\u0001\u0001\u0000\t\fB\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000"+
		"\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000"+
		"\n>\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001"+
		"\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000"+
		"\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0012\u0001\u0000"+
		"\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0000"+
		"\u0000\u0001\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0007"+
		"\u0000\u0000\u0015\u001a\u0005\u0001\u0000\u0000\u0016\u0019\u0003\u0002"+
		"\u0001\u0000\u0017\u0019\u0003\u0004\u0002\u0000\u0018\u0016\u0001\u0000"+
		"\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000"+
		"\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000"+
		"\u0000\u0000\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005\u0002\u0000\u0000\u001e\u0003\u0001\u0000"+
		"\u0000\u0000\u001f \u0005\u0007\u0000\u0000 !\u0005\u0003\u0000\u0000"+
		"!\"\u0003\u0006\u0003\u0000\",\u0005\u0004\u0000\u0000#(\u0005\u0001\u0000"+
		"\u0000$\'\u0003\u0002\u0001\u0000%\'\u0003\u0004\u0002\u0000&$\u0001\u0000"+
		"\u0000\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001"+
		"\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000+-\u0005\u0002\u0000\u0000,#\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-\u0005\u0001\u0000\u0000\u0000.3\u0003"+
		"\b\u0004\u0000/0\u0005\u0005\u0000\u000002\u0003\b\u0004\u00001/\u0001"+
		"\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u00004\u0007\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000067\u0005\u0007\u0000\u000078\u0005\u0006\u0000\u00008=\u0003"+
		"\n\u0005\u00009:\u0005\b\u0000\u0000:;\u0005\u0006\u0000\u0000;=\u0003"+
		"\n\u0005\u0000<6\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000=\t"+
		"\u0001\u0000\u0000\u0000>?\u0007\u0000\u0000\u0000?\u000b\u0001\u0000"+
		"\u0000\u0000\b\u000f\u0018\u001a&(,3<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}