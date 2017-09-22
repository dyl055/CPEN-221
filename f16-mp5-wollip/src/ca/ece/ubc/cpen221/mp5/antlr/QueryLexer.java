// Generated from Query.g4 by ANTLR 4.5.3
package ca.ece.ubc.cpen221.mp5.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, INT=11, STRINGS=12, STRING=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "INT", "STRINGS", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'||'", "'&&'", "'('", "')'", "'in('", "'category('", "'price('", 
		"'rating('", "'name('", "'..'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "INT", 
		"STRINGS", "STRING", "WS"
	};
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


	public QueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Query.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20e\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\rU\n\r\f\r\16\rX\13\r"+
		"\3\16\6\16[\n\16\r\16\16\16\\\3\17\6\17`\n\17\r\17\16\17a\3\17\3\17\2"+
		"\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\3\2\4\5\2\62;C\\c|\5\2\13\f\17\17\"\"g\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\3\37\3\2\2\2\5\"\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2"+
		"\2\r-\3\2\2\2\17\67\3\2\2\2\21>\3\2\2\2\23F\3\2\2\2\25L\3\2\2\2\27O\3"+
		"\2\2\2\31Q\3\2\2\2\33Z\3\2\2\2\35_\3\2\2\2\37 \7~\2\2 !\7~\2\2!\4\3\2"+
		"\2\2\"#\7(\2\2#$\7(\2\2$\6\3\2\2\2%&\7*\2\2&\b\3\2\2\2\'(\7+\2\2(\n\3"+
		"\2\2\2)*\7k\2\2*+\7p\2\2+,\7*\2\2,\f\3\2\2\2-.\7e\2\2./\7c\2\2/\60\7v"+
		"\2\2\60\61\7g\2\2\61\62\7i\2\2\62\63\7q\2\2\63\64\7t\2\2\64\65\7{\2\2"+
		"\65\66\7*\2\2\66\16\3\2\2\2\678\7r\2\289\7t\2\29:\7k\2\2:;\7e\2\2;<\7"+
		"g\2\2<=\7*\2\2=\20\3\2\2\2>?\7t\2\2?@\7c\2\2@A\7v\2\2AB\7k\2\2BC\7p\2"+
		"\2CD\7i\2\2DE\7*\2\2E\22\3\2\2\2FG\7p\2\2GH\7c\2\2HI\7o\2\2IJ\7g\2\2J"+
		"K\7*\2\2K\24\3\2\2\2LM\7\60\2\2MN\7\60\2\2N\26\3\2\2\2OP\4\62\67\2P\30"+
		"\3\2\2\2QV\5\33\16\2RS\7\"\2\2SU\5\33\16\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2"+
		"\2VW\3\2\2\2W\32\3\2\2\2XV\3\2\2\2Y[\t\2\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3"+
		"\2\2\2\\]\3\2\2\2]\34\3\2\2\2^`\t\3\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2"+
		"ab\3\2\2\2bc\3\2\2\2cd\b\17\2\2d\36\3\2\2\2\6\2V\\a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}