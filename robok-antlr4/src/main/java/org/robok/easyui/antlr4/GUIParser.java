// Generated from GUI.g4 by ANTLR 4.13.2
package org.robok.easyui.antlr4;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, IDENTIFIER=8, 
		IDENTIFIER_COLON=9, STRING=10, NUMBER=11, IDENTIFIER_DOT=12, WS=13, LINE_COMMENT=14, 
		BLOCK_COMMENT=15, HASH_COMMENT=16;
	public static final int
		RULE_guiFile = 0, RULE_component = 1, RULE_attributeScope = 2, RULE_attributeDefault = 3, 
		RULE_argumentList = 4, RULE_argument = 5, RULE_value = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"guiFile", "component", "attributeScope", "attributeDefault", "argumentList", 
			"argument", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'default'", "','", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "IDENTIFIER", "IDENTIFIER_COLON", 
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
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public List<AttributeScopeContext> attributeScope() {
			return getRuleContexts(AttributeScopeContext.class);
		}
		public AttributeScopeContext attributeScope(int i) {
			return getRuleContext(AttributeScopeContext.class,i);
		}
		public List<AttributeDefaultContext> attributeDefault() {
			return getRuleContexts(AttributeDefaultContext.class);
		}
		public AttributeDefaultContext attributeDefault(int i) {
			return getRuleContext(AttributeDefaultContext.class,i);
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
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==IDENTIFIER) {
				{
				setState(17);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(14);
					component();
					}
					break;
				case 2:
					{
					setState(15);
					attributeScope();
					}
					break;
				case 3:
					{
					setState(16);
					attributeDefault();
					}
					break;
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
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
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GUIParser.IDENTIFIER, 0); }
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
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
		enterRule(_localctx, 2, RULE_component);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(IDENTIFIER);
				setState(25);
				match(T__0);
				setState(26);
				argumentList();
				setState(27);
				match(T__1);
				setState(28);
				match(T__2);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER || _la==IDENTIFIER_COLON) {
					{
					setState(31);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(29);
						component();
						}
						break;
					case 2:
						{
						setState(30);
						argumentList();
						}
						break;
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(IDENTIFIER);
				setState(39);
				match(T__2);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER || _la==IDENTIFIER_COLON) {
					{
					setState(42);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(40);
						component();
						}
						break;
					case 2:
						{
						setState(41);
						argumentList();
						}
						break;
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(47);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(IDENTIFIER);
				setState(49);
				match(T__0);
				setState(50);
				argumentList();
				setState(51);
				match(T__1);
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
	public static class AttributeScopeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GUIParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(GUIParser.STRING, 0); }
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
		}
		public AttributeScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).enterAttributeScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).exitAttributeScope(this);
		}
	}

	public final AttributeScopeContext attributeScope() throws RecognitionException {
		AttributeScopeContext _localctx = new AttributeScopeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attributeScope);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(IDENTIFIER);
				setState(56);
				match(T__0);
				setState(57);
				match(STRING);
				setState(58);
				match(T__1);
				setState(59);
				match(T__2);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER || _la==IDENTIFIER_COLON) {
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(60);
						component();
						}
						break;
					case 2:
						{
						setState(61);
						argumentList();
						}
						break;
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(IDENTIFIER);
				setState(69);
				match(T__0);
				setState(70);
				match(STRING);
				setState(71);
				match(T__1);
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
	public static class AttributeDefaultContext extends ParserRuleContext {
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public AttributeDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).enterAttributeDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).exitAttributeDefault(this);
		}
	}

	public final AttributeDefaultContext attributeDefault() throws RecognitionException {
		AttributeDefaultContext _localctx = new AttributeDefaultContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attributeDefault);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(T__4);
				setState(75);
				match(T__0);
				setState(76);
				argumentList();
				setState(77);
				match(T__1);
				setState(78);
				match(T__2);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER || _la==IDENTIFIER_COLON) {
					{
					setState(81);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(79);
						component();
						}
						break;
					case 2:
						{
						setState(80);
						argumentList();
						}
						break;
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__4);
				setState(89);
				match(T__0);
				setState(90);
				argumentList();
				setState(91);
				match(T__1);
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
		enterRule(_localctx, 8, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			argument();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(96);
				match(T__5);
				setState(97);
				argument();
				}
				}
				setState(102);
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
		enterRule(_localctx, 10, RULE_argument);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(IDENTIFIER);
				setState(104);
				match(T__6);
				setState(105);
				value();
				}
				break;
			case IDENTIFIER_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(IDENTIFIER_COLON);
				setState(107);
				match(T__6);
				setState(108);
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
		enterRule(_localctx, 12, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
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
		"\u0004\u0001\u0010r\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001+\b\u0001\n\u0001\f\u0001.\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003R\b\u0003\n\u0003\f\u0003U\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003^\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"c\b\u0004\n\u0004\f\u0004f\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005n\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n"+
		"\f\u0000\u0001\u0001\u0000\n\f{\u0000\u0013\u0001\u0000\u0000\u0000\u0002"+
		"5\u0001\u0000\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006]\u0001"+
		"\u0000\u0000\u0000\b_\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000"+
		"\fo\u0001\u0000\u0000\u0000\u000e\u0012\u0003\u0002\u0001\u0000\u000f"+
		"\u0012\u0003\u0004\u0002\u0000\u0010\u0012\u0003\u0006\u0003\u0000\u0011"+
		"\u000e\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011"+
		"\u0010\u0001\u0000\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013"+
		"\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014"+
		"\u0016\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0005\u0000\u0000\u0001\u0017\u0001\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0005\b\u0000\u0000\u0019\u001a\u0005\u0001\u0000\u0000\u001a\u001b"+
		"\u0003\b\u0004\u0000\u001b\u001c\u0005\u0002\u0000\u0000\u001c!\u0005"+
		"\u0003\u0000\u0000\u001d \u0003\u0002\u0001\u0000\u001e \u0003\b\u0004"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000"+
		"\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001"+
		"\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"$%\u0005\u0004\u0000\u0000%6\u0001\u0000\u0000\u0000&\'\u0005\b\u0000"+
		"\u0000\',\u0005\u0003\u0000\u0000(+\u0003\u0002\u0001\u0000)+\u0003\b"+
		"\u0004\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+.\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/6\u0005\u0004\u0000"+
		"\u000001\u0005\b\u0000\u000012\u0005\u0001\u0000\u000023\u0003\b\u0004"+
		"\u000034\u0005\u0002\u0000\u000046\u0001\u0000\u0000\u00005\u0018\u0001"+
		"\u0000\u0000\u00005&\u0001\u0000\u0000\u000050\u0001\u0000\u0000\u0000"+
		"6\u0003\u0001\u0000\u0000\u000078\u0005\b\u0000\u000089\u0005\u0001\u0000"+
		"\u00009:\u0005\n\u0000\u0000:;\u0005\u0002\u0000\u0000;@\u0005\u0003\u0000"+
		"\u0000<?\u0003\u0002\u0001\u0000=?\u0003\b\u0004\u0000><\u0001\u0000\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000CI\u0005\u0004\u0000\u0000DE\u0005\b\u0000\u0000EF\u0005"+
		"\u0001\u0000\u0000FG\u0005\n\u0000\u0000GI\u0005\u0002\u0000\u0000H7\u0001"+
		"\u0000\u0000\u0000HD\u0001\u0000\u0000\u0000I\u0005\u0001\u0000\u0000"+
		"\u0000JK\u0005\u0005\u0000\u0000KL\u0005\u0001\u0000\u0000LM\u0003\b\u0004"+
		"\u0000MN\u0005\u0002\u0000\u0000NS\u0005\u0003\u0000\u0000OR\u0003\u0002"+
		"\u0001\u0000PR\u0003\b\u0004\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000"+
		"\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"VW\u0005\u0004\u0000\u0000W^\u0001\u0000\u0000\u0000XY\u0005\u0005\u0000"+
		"\u0000YZ\u0005\u0001\u0000\u0000Z[\u0003\b\u0004\u0000[\\\u0005\u0002"+
		"\u0000\u0000\\^\u0001\u0000\u0000\u0000]J\u0001\u0000\u0000\u0000]X\u0001"+
		"\u0000\u0000\u0000^\u0007\u0001\u0000\u0000\u0000_d\u0003\n\u0005\u0000"+
		"`a\u0005\u0006\u0000\u0000ac\u0003\n\u0005\u0000b`\u0001\u0000\u0000\u0000"+
		"cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000e\t\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0005\b"+
		"\u0000\u0000hi\u0005\u0007\u0000\u0000in\u0003\f\u0006\u0000jk\u0005\t"+
		"\u0000\u0000kl\u0005\u0007\u0000\u0000ln\u0003\f\u0006\u0000mg\u0001\u0000"+
		"\u0000\u0000mj\u0001\u0000\u0000\u0000n\u000b\u0001\u0000\u0000\u0000"+
		"op\u0007\u0000\u0000\u0000p\r\u0001\u0000\u0000\u0000\u000f\u0011\u0013"+
		"\u001f!*,5>@HQS]dm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}