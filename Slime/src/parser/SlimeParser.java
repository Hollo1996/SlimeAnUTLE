// Generated from /home/boss/Documents/Git/SlimeAnUTLE/Slime/src/SlimeParser.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SlimeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RULE_DIV=1, COMM_OUTER=2, OB_SLOT=3, OB_SPEC=4, OB_REFE=5, OB_EXPA=6, 
		OB_PLUS=7, OB_DECL=8, OB_DELE=9, OB_TEXT=10, OB_TEMP=11, OLB_SLOT=12, 
		OLB_SPEC=13, OLB_REFE=14, OLB_EXPA=15, OLB_PLUS=16, OLB_DECL=17, OLB_DELE=18, 
		OLB_TEXT=19, OLB_TEMP=20, LB_SLOT=21, LB_SPEC=22, LB_REFE=23, LB_EXPA=24, 
		LB_PLUS=25, LB_DECL=26, LB_DELE=27, LB_TEXT=28, LB_TEMP=29, TEXT_OUTOR=30, 
		COMM_B_S=31, WS_B_S=32, CB_SLOT=33, CB_SPEC=34, NAME_B_S=35, SC_B_S=36, 
		COMM_O_S=37, WS_O_S=38, NL_SLSP=39, NAME_O_S=40, SC_O_S=41, COMM_L_S=42, 
		NW_SLSP=43, NAME_L_S=44, SC_L_S=45, COMM_REFE=46, WS_B_R=47, CB_REFE=48, 
		CL_B_R=49, NAME_B_R=50, IN_B_R=51, COMM_O_R=52, WS_O_R=53, NL_REFE=54, 
		CL_O_R=55, NAME_O_R=56, IN_O_R=57, COMM_L_R=58, WS_L_R=59, NW_REFE=60, 
		CL_L_R=61, NAME_L_R=62, IN_L_R=63, COMM_B_O=64, WS_B_O=65, CB_EXPA=66, 
		CB_PLUS=67, CB_DECL=68, CB_DELE=69, OB_SLOT_B_O=70, OB_SPEC_B_O=71, OB_REFE_B_O=72, 
		OB_EXPA_B_O=73, OB_PLUS_B_O=74, OB_DECL_B_O=75, OB_DELE_B_O=76, OB_TEXT_B_O=77, 
		OB_TEMP_B_O=78, OLB_SLOT_B_O=79, OLB_SPEC_B_O=80, OLB_REFE_B_O=81, OLB_EXPA_B_O=82, 
		OLB_PLUS_B_O=83, OLB_DECL_B_O=84, OLB_DELE_B_O=85, OLB_TEXT_B_O=86, OLB_TEMP_B_O=87, 
		LB_SLOT_B_O=88, LB_SPEC_B_O=89, LB_REFE_B_O=90, LB_EXPA_B_O=91, LB_PLUS_B_O=92, 
		LB_DECL_B_O=93, LB_DELE_B_O=94, LB_TEXT_B_O=95, LB_TEMP_B_O=96, OB_IMPORT=97, 
		EQOP_B_O=98, PLOP_B_O=99, PE_B_O=100, CL_B_O=101, CO_B_O=102, SC_B_O=103, 
		NAME_B_O=104, INTE_B_O=105, COMM_O_O=106, WS_O_O=107, NL_OPER=108, OB_SLOT_O_O=109, 
		OB_SPEC_O_O=110, OB_REFE_O_O=111, OB_EXPA_O_O=112, OB_PLUS_O_O=113, OB_DECL_O_O=114, 
		OB_DELE_O_O=115, OB_TEXT_O_O=116, OB_TEMP_O_O=117, OLB_SLOT_O_O=118, OLB_SPEC_O_O=119, 
		OLB_REFE_O_O=120, OLB_EXPA_O_O=121, OLB_PLUS_O_O=122, OLB_DECL_O_O=123, 
		OLB_DELE_O_O=124, OLB_TEXT_O_O=125, OLB_TEMP_O_O=126, LB_SLOT_O_O=127, 
		LB_SPEC_O_O=128, LB_REFE_O_O=129, LB_EXPA_O_O=130, LB_PLUS_O_O=131, LB_DECL_O_O=132, 
		LB_DELE_O_O=133, LB_TEXT_O_O=134, LB_TEMP_O_O=135, OL_IMPORT=136, EQOP_O_O=137, 
		PLOP_O_O=138, PE_O_O=139, CL_O_O=140, CO_O_O=141, SC_O_O=142, NAME_O_O=143, 
		INTE_O_O=144, COMM_L_O=145, NW_OPER=146, OB_SLOT_L_O=147, OB_SPEC_L_O=148, 
		OB_REFE_L_O=149, OB_EXPA_L_O=150, OB_PLUS_L_O=151, OB_DECL_L_O=152, OB_DELE_L_O=153, 
		OB_TEXT_L_O=154, OB_TEMP_L_O=155, OLB_SLOT_L_O=156, OLB_SPEC_L_O=157, 
		OLB_REFE_L_O=158, OLB_EXPA_L_O=159, OLB_PLUS_L_O=160, OLB_DECL_L_O=161, 
		OLB_DELE_L_O=162, OLB_TEXT_L_O=163, OLB_TEMP_L_O=164, LB_SLOT_L_O=165, 
		LB_SPEC_L_O=166, LB_REFE_L_O=167, LB_EXPA_L_O=168, LB_PLUS_L_O=169, LB_DECL_L_O=170, 
		LB_DELE_L_O=171, LB_TEXT_L_O=172, LB_TEMP_L_O=173, L_IMPORT=174, EQOP_L_O=175, 
		PLOP_L_O=176, PE_L_O=177, CL_L_O=178, CO_L_O=179, SC_L_O=180, NAME_L_O=181, 
		INTE_L_O=182, CB_TEXT=183, IN_TEXT=184, NL_TEXT=185, IN_OL_TEXT=186, NW_TEXT=187, 
		IN_L_TEXT=188, CB_TEMP=189, TEXT_LINE=190, LINE_DIVIDER=191, OB_SLOT_B_T=192, 
		OB_SPEC_B_T=193, OB_TEXT_B_T=194, OLB_SLOT_B_T=195, OLB_SPEC_B_T=196, 
		OLB_TEXT_B_T=197, LB_SLOT_B_T=198, LB_SPEC_B_T=199, LB_TEXT_B_T=200, SC_B_T=201, 
		NL_TEMP=202, OL_TEXT_LINE=203, OB_SLOT_O_T=204, OB_SPEC_O_T=205, OB_TEXT_O_T=206, 
		OLB_SLOT_O_T=207, OLB_SPEC_O_T=208, OLB_TEXT_O_T=209, LB_SLOT_O_T=210, 
		LB_SPEC_O_T=211, LB_TEXT_O_T=212, SC_O_T=213, NW_TEMP=214, L_TEXT_LINE=215, 
		OB_SLOT_L_T=216, OB_SPEC_L_T=217, OB_TEXT_L_T=218, OLB_SLOT_L_T=219, OLB_SPEC_L_T=220, 
		OLB_TEXT_L_T=221, LB_SLOT_L_T=222, LB_SPEC_L_T=223, LB_TEXT_L_T=224, SC_L_T=225;
	public static final int
		RULE_file = 0, RULE_text = 1, RULE_textHead = 2, RULE_textBody = 3, RULE_textTail = 4, 
		RULE_refe = 5, RULE_refeHead = 6, RULE_refeBody = 7, RULE_refeTail = 8, 
		RULE_slot = 9, RULE_slotHead = 10, RULE_slotTail = 11, RULE_spec = 12, 
		RULE_specHead = 13, RULE_specTail = 14, RULE_spslBody = 15, RULE_temp = 16, 
		RULE_tempHead = 17, RULE_tempBody = 18, RULE_tempBodyPart = 19, RULE_tempTail = 20, 
		RULE_tempText = 21, RULE_expa = 22, RULE_expaHead = 23, RULE_expaBody = 24, 
		RULE_expaBodyPart = 25, RULE_expaTail = 26, RULE_plus = 27, RULE_plusHead = 28, 
		RULE_plusBody = 29, RULE_plusBodyPart = 30, RULE_plusElement = 31, RULE_plusTail = 32, 
		RULE_dele = 33, RULE_deleHead = 34, RULE_deleBody = 35, RULE_deleTail = 36, 
		RULE_decl = 37, RULE_declHead = 38, RULE_declNeck = 39, RULE_declBody = 40, 
		RULE_declBodyPart = 41, RULE_declTail = 42, RULE_nameValue = 43, RULE_nameType = 44, 
		RULE_listVari = 45, RULE_vari = 46, RULE_listName = 47, RULE_variPath = 48, 
		RULE_typeName = 49, RULE_textOutor = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "text", "textHead", "textBody", "textTail", "refe", "refeHead", 
			"refeBody", "refeTail", "slot", "slotHead", "slotTail", "spec", "specHead", 
			"specTail", "spslBody", "temp", "tempHead", "tempBody", "tempBodyPart", 
			"tempTail", "tempText", "expa", "expaHead", "expaBody", "expaBodyPart", 
			"expaTail", "plus", "plusHead", "plusBody", "plusBodyPart", "plusElement", 
			"plusTail", "dele", "deleHead", "deleBody", "deleTail", "decl", "declHead", 
			"declNeck", "declBody", "declBodyPart", "declTail", "nameValue", "nameType", 
			"listVari", "vari", "listName", "variPath", "typeName", "textOutor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'$}'", "'@}'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'&}'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'*}'", "'+}'", "'=}'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'\"}'", null, null, null, null, null, 
			"'|}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RULE_DIV", "COMM_OUTER", "OB_SLOT", "OB_SPEC", "OB_REFE", "OB_EXPA", 
			"OB_PLUS", "OB_DECL", "OB_DELE", "OB_TEXT", "OB_TEMP", "OLB_SLOT", "OLB_SPEC", 
			"OLB_REFE", "OLB_EXPA", "OLB_PLUS", "OLB_DECL", "OLB_DELE", "OLB_TEXT", 
			"OLB_TEMP", "LB_SLOT", "LB_SPEC", "LB_REFE", "LB_EXPA", "LB_PLUS", "LB_DECL", 
			"LB_DELE", "LB_TEXT", "LB_TEMP", "TEXT_OUTOR", "COMM_B_S", "WS_B_S", 
			"CB_SLOT", "CB_SPEC", "NAME_B_S", "SC_B_S", "COMM_O_S", "WS_O_S", "NL_SLSP", 
			"NAME_O_S", "SC_O_S", "COMM_L_S", "NW_SLSP", "NAME_L_S", "SC_L_S", "COMM_REFE", 
			"WS_B_R", "CB_REFE", "CL_B_R", "NAME_B_R", "IN_B_R", "COMM_O_R", "WS_O_R", 
			"NL_REFE", "CL_O_R", "NAME_O_R", "IN_O_R", "COMM_L_R", "WS_L_R", "NW_REFE", 
			"CL_L_R", "NAME_L_R", "IN_L_R", "COMM_B_O", "WS_B_O", "CB_EXPA", "CB_PLUS", 
			"CB_DECL", "CB_DELE", "OB_SLOT_B_O", "OB_SPEC_B_O", "OB_REFE_B_O", "OB_EXPA_B_O", 
			"OB_PLUS_B_O", "OB_DECL_B_O", "OB_DELE_B_O", "OB_TEXT_B_O", "OB_TEMP_B_O", 
			"OLB_SLOT_B_O", "OLB_SPEC_B_O", "OLB_REFE_B_O", "OLB_EXPA_B_O", "OLB_PLUS_B_O", 
			"OLB_DECL_B_O", "OLB_DELE_B_O", "OLB_TEXT_B_O", "OLB_TEMP_B_O", "LB_SLOT_B_O", 
			"LB_SPEC_B_O", "LB_REFE_B_O", "LB_EXPA_B_O", "LB_PLUS_B_O", "LB_DECL_B_O", 
			"LB_DELE_B_O", "LB_TEXT_B_O", "LB_TEMP_B_O", "OB_IMPORT", "EQOP_B_O", 
			"PLOP_B_O", "PE_B_O", "CL_B_O", "CO_B_O", "SC_B_O", "NAME_B_O", "INTE_B_O", 
			"COMM_O_O", "WS_O_O", "NL_OPER", "OB_SLOT_O_O", "OB_SPEC_O_O", "OB_REFE_O_O", 
			"OB_EXPA_O_O", "OB_PLUS_O_O", "OB_DECL_O_O", "OB_DELE_O_O", "OB_TEXT_O_O", 
			"OB_TEMP_O_O", "OLB_SLOT_O_O", "OLB_SPEC_O_O", "OLB_REFE_O_O", "OLB_EXPA_O_O", 
			"OLB_PLUS_O_O", "OLB_DECL_O_O", "OLB_DELE_O_O", "OLB_TEXT_O_O", "OLB_TEMP_O_O", 
			"LB_SLOT_O_O", "LB_SPEC_O_O", "LB_REFE_O_O", "LB_EXPA_O_O", "LB_PLUS_O_O", 
			"LB_DECL_O_O", "LB_DELE_O_O", "LB_TEXT_O_O", "LB_TEMP_O_O", "OL_IMPORT", 
			"EQOP_O_O", "PLOP_O_O", "PE_O_O", "CL_O_O", "CO_O_O", "SC_O_O", "NAME_O_O", 
			"INTE_O_O", "COMM_L_O", "NW_OPER", "OB_SLOT_L_O", "OB_SPEC_L_O", "OB_REFE_L_O", 
			"OB_EXPA_L_O", "OB_PLUS_L_O", "OB_DECL_L_O", "OB_DELE_L_O", "OB_TEXT_L_O", 
			"OB_TEMP_L_O", "OLB_SLOT_L_O", "OLB_SPEC_L_O", "OLB_REFE_L_O", "OLB_EXPA_L_O", 
			"OLB_PLUS_L_O", "OLB_DECL_L_O", "OLB_DELE_L_O", "OLB_TEXT_L_O", "OLB_TEMP_L_O", 
			"LB_SLOT_L_O", "LB_SPEC_L_O", "LB_REFE_L_O", "LB_EXPA_L_O", "LB_PLUS_L_O", 
			"LB_DECL_L_O", "LB_DELE_L_O", "LB_TEXT_L_O", "LB_TEMP_L_O", "L_IMPORT", 
			"EQOP_L_O", "PLOP_L_O", "PE_L_O", "CL_L_O", "CO_L_O", "SC_L_O", "NAME_L_O", 
			"INTE_L_O", "CB_TEXT", "IN_TEXT", "NL_TEXT", "IN_OL_TEXT", "NW_TEXT", 
			"IN_L_TEXT", "CB_TEMP", "TEXT_LINE", "LINE_DIVIDER", "OB_SLOT_B_T", "OB_SPEC_B_T", 
			"OB_TEXT_B_T", "OLB_SLOT_B_T", "OLB_SPEC_B_T", "OLB_TEXT_B_T", "LB_SLOT_B_T", 
			"LB_SPEC_B_T", "LB_TEXT_B_T", "SC_B_T", "NL_TEMP", "OL_TEXT_LINE", "OB_SLOT_O_T", 
			"OB_SPEC_O_T", "OB_TEXT_O_T", "OLB_SLOT_O_T", "OLB_SPEC_O_T", "OLB_TEXT_O_T", 
			"LB_SLOT_O_T", "LB_SPEC_O_T", "LB_TEXT_O_T", "SC_O_T", "NW_TEMP", "L_TEXT_LINE", 
			"OB_SLOT_L_T", "OB_SPEC_L_T", "OB_TEXT_L_T", "OLB_SLOT_L_T", "OLB_SPEC_L_T", 
			"OLB_TEXT_L_T", "LB_SLOT_L_T", "LB_SPEC_L_T", "LB_TEXT_L_T", "SC_L_T"
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
	public String getGrammarFileName() { return "SlimeParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SlimeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<RefeContext> refe() {
			return getRuleContexts(RefeContext.class);
		}
		public RefeContext refe(int i) {
			return getRuleContext(RefeContext.class,i);
		}
		public List<SlotContext> slot() {
			return getRuleContexts(SlotContext.class);
		}
		public SlotContext slot(int i) {
			return getRuleContext(SlotContext.class,i);
		}
		public List<SpecContext> spec() {
			return getRuleContexts(SpecContext.class);
		}
		public SpecContext spec(int i) {
			return getRuleContext(SpecContext.class,i);
		}
		public List<TempContext> temp() {
			return getRuleContexts(TempContext.class);
		}
		public TempContext temp(int i) {
			return getRuleContext(TempContext.class,i);
		}
		public List<DeleContext> dele() {
			return getRuleContexts(DeleContext.class);
		}
		public DeleContext dele(int i) {
			return getRuleContext(DeleContext.class,i);
		}
		public List<ExpaContext> expa() {
			return getRuleContexts(ExpaContext.class);
		}
		public ExpaContext expa(int i) {
			return getRuleContext(ExpaContext.class,i);
		}
		public List<PlusContext> plus() {
			return getRuleContexts(PlusContext.class);
		}
		public PlusContext plus(int i) {
			return getRuleContext(PlusContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TextOutorContext> textOutor() {
			return getRuleContexts(TextOutorContext.class);
		}
		public TextOutorContext textOutor(int i) {
			return getRuleContext(TextOutorContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_SLOT) | (1L << OB_SPEC) | (1L << OB_REFE) | (1L << OB_EXPA) | (1L << OB_PLUS) | (1L << OB_DECL) | (1L << OB_DELE) | (1L << OB_TEXT) | (1L << OB_TEMP) | (1L << OLB_SLOT) | (1L << OLB_SPEC) | (1L << OLB_REFE) | (1L << OLB_EXPA) | (1L << OLB_PLUS) | (1L << OLB_DECL) | (1L << OLB_DELE) | (1L << OLB_TEXT) | (1L << OLB_TEMP) | (1L << LB_SLOT) | (1L << LB_SPEC) | (1L << LB_REFE) | (1L << LB_EXPA) | (1L << LB_PLUS) | (1L << LB_DECL) | (1L << LB_DELE) | (1L << LB_TEXT) | (1L << LB_TEMP) | (1L << TEXT_OUTOR))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OB_SLOT_B_O - 70)) | (1L << (OB_SPEC_B_O - 70)) | (1L << (OB_REFE_B_O - 70)) | (1L << (OB_EXPA_B_O - 70)) | (1L << (OB_PLUS_B_O - 70)) | (1L << (OB_DECL_B_O - 70)) | (1L << (OB_DELE_B_O - 70)) | (1L << (OB_TEXT_B_O - 70)) | (1L << (OB_TEMP_B_O - 70)) | (1L << (OLB_SLOT_B_O - 70)) | (1L << (OLB_SPEC_B_O - 70)) | (1L << (OLB_REFE_B_O - 70)) | (1L << (OLB_EXPA_B_O - 70)) | (1L << (OLB_PLUS_B_O - 70)) | (1L << (OLB_DECL_B_O - 70)) | (1L << (OLB_DELE_B_O - 70)) | (1L << (OLB_TEXT_B_O - 70)) | (1L << (OLB_TEMP_B_O - 70)) | (1L << (LB_SLOT_B_O - 70)) | (1L << (LB_SPEC_B_O - 70)) | (1L << (LB_REFE_B_O - 70)) | (1L << (LB_EXPA_B_O - 70)) | (1L << (LB_PLUS_B_O - 70)) | (1L << (LB_DECL_B_O - 70)) | (1L << (LB_DELE_B_O - 70)) | (1L << (LB_TEXT_B_O - 70)) | (1L << (LB_TEMP_B_O - 70)) | (1L << (OB_SLOT_O_O - 70)) | (1L << (OB_SPEC_O_O - 70)) | (1L << (OB_REFE_O_O - 70)) | (1L << (OB_EXPA_O_O - 70)) | (1L << (OB_PLUS_O_O - 70)) | (1L << (OB_DECL_O_O - 70)) | (1L << (OB_DELE_O_O - 70)) | (1L << (OB_TEXT_O_O - 70)) | (1L << (OB_TEMP_O_O - 70)) | (1L << (OLB_SLOT_O_O - 70)) | (1L << (OLB_SPEC_O_O - 70)) | (1L << (OLB_REFE_O_O - 70)) | (1L << (OLB_EXPA_O_O - 70)) | (1L << (OLB_PLUS_O_O - 70)) | (1L << (OLB_DECL_O_O - 70)) | (1L << (OLB_DELE_O_O - 70)) | (1L << (OLB_TEXT_O_O - 70)) | (1L << (OLB_TEMP_O_O - 70)) | (1L << (LB_SLOT_O_O - 70)) | (1L << (LB_SPEC_O_O - 70)) | (1L << (LB_REFE_O_O - 70)) | (1L << (LB_EXPA_O_O - 70)) | (1L << (LB_PLUS_O_O - 70)) | (1L << (LB_DECL_O_O - 70)) | (1L << (LB_DELE_O_O - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (LB_TEXT_O_O - 134)) | (1L << (LB_TEMP_O_O - 134)) | (1L << (OB_SLOT_L_O - 134)) | (1L << (OB_SPEC_L_O - 134)) | (1L << (OB_REFE_L_O - 134)) | (1L << (OB_EXPA_L_O - 134)) | (1L << (OB_PLUS_L_O - 134)) | (1L << (OB_DECL_L_O - 134)) | (1L << (OB_DELE_L_O - 134)) | (1L << (OB_TEXT_L_O - 134)) | (1L << (OB_TEMP_L_O - 134)) | (1L << (OLB_SLOT_L_O - 134)) | (1L << (OLB_SPEC_L_O - 134)) | (1L << (OLB_REFE_L_O - 134)) | (1L << (OLB_EXPA_L_O - 134)) | (1L << (OLB_PLUS_L_O - 134)) | (1L << (OLB_DECL_L_O - 134)) | (1L << (OLB_DELE_L_O - 134)) | (1L << (OLB_TEXT_L_O - 134)) | (1L << (OLB_TEMP_L_O - 134)) | (1L << (LB_SLOT_L_O - 134)) | (1L << (LB_SPEC_L_O - 134)) | (1L << (LB_REFE_L_O - 134)) | (1L << (LB_EXPA_L_O - 134)) | (1L << (LB_PLUS_L_O - 134)) | (1L << (LB_DECL_L_O - 134)) | (1L << (LB_DELE_L_O - 134)) | (1L << (LB_TEXT_L_O - 134)) | (1L << (LB_TEMP_L_O - 134)) | (1L << (OB_SLOT_B_T - 134)) | (1L << (OB_SPEC_B_T - 134)) | (1L << (OB_TEXT_B_T - 134)) | (1L << (OLB_SLOT_B_T - 134)) | (1L << (OLB_SPEC_B_T - 134)) | (1L << (OLB_TEXT_B_T - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (LB_SLOT_B_T - 198)) | (1L << (LB_SPEC_B_T - 198)) | (1L << (LB_TEXT_B_T - 198)) | (1L << (OB_SLOT_O_T - 198)) | (1L << (OB_SPEC_O_T - 198)) | (1L << (OB_TEXT_O_T - 198)) | (1L << (OLB_SLOT_O_T - 198)) | (1L << (OLB_SPEC_O_T - 198)) | (1L << (OLB_TEXT_O_T - 198)) | (1L << (LB_SLOT_O_T - 198)) | (1L << (LB_SPEC_O_T - 198)) | (1L << (LB_TEXT_O_T - 198)) | (1L << (OB_SLOT_L_T - 198)) | (1L << (OB_SPEC_L_T - 198)) | (1L << (OB_TEXT_L_T - 198)) | (1L << (OLB_SLOT_L_T - 198)) | (1L << (OLB_SPEC_L_T - 198)) | (1L << (OLB_TEXT_L_T - 198)) | (1L << (LB_SLOT_L_T - 198)) | (1L << (LB_SPEC_L_T - 198)) | (1L << (LB_TEXT_L_T - 198)))) != 0)) {
				{
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(102);
					text();
					}
					break;
				case 2:
					{
					setState(103);
					refe();
					}
					break;
				case 3:
					{
					setState(104);
					slot();
					}
					break;
				case 4:
					{
					setState(105);
					spec();
					}
					break;
				case 5:
					{
					setState(106);
					temp();
					}
					break;
				case 6:
					{
					setState(107);
					dele();
					}
					break;
				case 7:
					{
					setState(108);
					expa();
					}
					break;
				case 8:
					{
					setState(109);
					plus();
					}
					break;
				case 9:
					{
					setState(110);
					decl();
					}
					break;
				case 10:
					{
					setState(111);
					dele();
					}
					break;
				case 11:
					{
					setState(112);
					refe();
					}
					break;
				case 12:
					{
					setState(113);
					textOutor();
					}
					break;
				}
				}
				setState(118);
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

	public static class TextContext extends ParserRuleContext {
		public TextHeadContext textHead() {
			return getRuleContext(TextHeadContext.class,0);
		}
		public TextBodyContext textBody() {
			return getRuleContext(TextBodyContext.class,0);
		}
		public TextTailContext textTail() {
			return getRuleContext(TextTailContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			textHead();
			setState(120);
			textBody();
			setState(121);
			textTail();
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

	public static class TextHeadContext extends ParserRuleContext {
		public TerminalNode OB_TEXT() { return getToken(SlimeParser.OB_TEXT, 0); }
		public TerminalNode OLB_TEXT() { return getToken(SlimeParser.OLB_TEXT, 0); }
		public TerminalNode LB_TEXT() { return getToken(SlimeParser.LB_TEXT, 0); }
		public TerminalNode OB_TEXT_B_O() { return getToken(SlimeParser.OB_TEXT_B_O, 0); }
		public TerminalNode OLB_TEXT_B_O() { return getToken(SlimeParser.OLB_TEXT_B_O, 0); }
		public TerminalNode LB_TEXT_B_O() { return getToken(SlimeParser.LB_TEXT_B_O, 0); }
		public TerminalNode OB_TEXT_O_O() { return getToken(SlimeParser.OB_TEXT_O_O, 0); }
		public TerminalNode OLB_TEXT_O_O() { return getToken(SlimeParser.OLB_TEXT_O_O, 0); }
		public TerminalNode LB_TEXT_O_O() { return getToken(SlimeParser.LB_TEXT_O_O, 0); }
		public TerminalNode OB_TEXT_L_O() { return getToken(SlimeParser.OB_TEXT_L_O, 0); }
		public TerminalNode OLB_TEXT_L_O() { return getToken(SlimeParser.OLB_TEXT_L_O, 0); }
		public TerminalNode LB_TEXT_L_O() { return getToken(SlimeParser.LB_TEXT_L_O, 0); }
		public TerminalNode OB_TEXT_B_T() { return getToken(SlimeParser.OB_TEXT_B_T, 0); }
		public TerminalNode OLB_TEXT_B_T() { return getToken(SlimeParser.OLB_TEXT_B_T, 0); }
		public TerminalNode LB_TEXT_B_T() { return getToken(SlimeParser.LB_TEXT_B_T, 0); }
		public TerminalNode OB_TEXT_O_T() { return getToken(SlimeParser.OB_TEXT_O_T, 0); }
		public TerminalNode OLB_TEXT_O_T() { return getToken(SlimeParser.OLB_TEXT_O_T, 0); }
		public TerminalNode LB_TEXT_O_T() { return getToken(SlimeParser.LB_TEXT_O_T, 0); }
		public TerminalNode OB_TEXT_L_T() { return getToken(SlimeParser.OB_TEXT_L_T, 0); }
		public TerminalNode OLB_TEXT_L_T() { return getToken(SlimeParser.OLB_TEXT_L_T, 0); }
		public TerminalNode LB_TEXT_L_T() { return getToken(SlimeParser.LB_TEXT_L_T, 0); }
		public TextHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTextHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTextHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTextHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextHeadContext textHead() throws RecognitionException {
		TextHeadContext _localctx = new TextHeadContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_textHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_TEXT) | (1L << OLB_TEXT) | (1L << LB_TEXT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (OB_TEXT_B_O - 77)) | (1L << (OLB_TEXT_B_O - 77)) | (1L << (LB_TEXT_B_O - 77)) | (1L << (OB_TEXT_O_O - 77)) | (1L << (OLB_TEXT_O_O - 77)) | (1L << (LB_TEXT_O_O - 77)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (OB_TEXT_L_O - 154)) | (1L << (OLB_TEXT_L_O - 154)) | (1L << (LB_TEXT_L_O - 154)) | (1L << (OB_TEXT_B_T - 154)) | (1L << (OLB_TEXT_B_T - 154)) | (1L << (LB_TEXT_B_T - 154)) | (1L << (OB_TEXT_O_T - 154)) | (1L << (OLB_TEXT_O_T - 154)) | (1L << (LB_TEXT_O_T - 154)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (OB_TEXT_L_T - 218)) | (1L << (OLB_TEXT_L_T - 218)) | (1L << (LB_TEXT_L_T - 218)))) != 0)) ) {
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

	public static class TextBodyContext extends ParserRuleContext {
		public TerminalNode IN_TEXT() { return getToken(SlimeParser.IN_TEXT, 0); }
		public TerminalNode IN_OL_TEXT() { return getToken(SlimeParser.IN_OL_TEXT, 0); }
		public TerminalNode IN_L_TEXT() { return getToken(SlimeParser.IN_L_TEXT, 0); }
		public TextBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTextBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTextBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTextBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextBodyContext textBody() throws RecognitionException {
		TextBodyContext _localctx = new TextBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_textBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (IN_TEXT - 184)) | (1L << (IN_OL_TEXT - 184)) | (1L << (IN_L_TEXT - 184)))) != 0)) ) {
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

	public static class TextTailContext extends ParserRuleContext {
		public TerminalNode CB_TEXT() { return getToken(SlimeParser.CB_TEXT, 0); }
		public TerminalNode NL_TEXT() { return getToken(SlimeParser.NL_TEXT, 0); }
		public TerminalNode NW_TEXT() { return getToken(SlimeParser.NW_TEXT, 0); }
		public TextTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTextTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTextTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTextTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextTailContext textTail() throws RecognitionException {
		TextTailContext _localctx = new TextTailContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_textTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (CB_TEXT - 183)) | (1L << (NL_TEXT - 183)) | (1L << (NW_TEXT - 183)))) != 0)) ) {
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

	public static class RefeContext extends ParserRuleContext {
		public RefeHeadContext refeHead() {
			return getRuleContext(RefeHeadContext.class,0);
		}
		public RefeBodyContext refeBody() {
			return getRuleContext(RefeBodyContext.class,0);
		}
		public RefeTailContext refeTail() {
			return getRuleContext(RefeTailContext.class,0);
		}
		public RefeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterRefe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitRefe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitRefe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefeContext refe() throws RecognitionException {
		RefeContext _localctx = new RefeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_refe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			refeHead();
			setState(130);
			refeBody();
			setState(131);
			refeTail();
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

	public static class RefeHeadContext extends ParserRuleContext {
		public TerminalNode OB_REFE() { return getToken(SlimeParser.OB_REFE, 0); }
		public TerminalNode OLB_REFE() { return getToken(SlimeParser.OLB_REFE, 0); }
		public TerminalNode LB_REFE() { return getToken(SlimeParser.LB_REFE, 0); }
		public TerminalNode OB_REFE_B_O() { return getToken(SlimeParser.OB_REFE_B_O, 0); }
		public TerminalNode OLB_REFE_B_O() { return getToken(SlimeParser.OLB_REFE_B_O, 0); }
		public TerminalNode LB_REFE_B_O() { return getToken(SlimeParser.LB_REFE_B_O, 0); }
		public TerminalNode OB_REFE_O_O() { return getToken(SlimeParser.OB_REFE_O_O, 0); }
		public TerminalNode OLB_REFE_O_O() { return getToken(SlimeParser.OLB_REFE_O_O, 0); }
		public TerminalNode LB_REFE_O_O() { return getToken(SlimeParser.LB_REFE_O_O, 0); }
		public TerminalNode OB_REFE_L_O() { return getToken(SlimeParser.OB_REFE_L_O, 0); }
		public TerminalNode OLB_REFE_L_O() { return getToken(SlimeParser.OLB_REFE_L_O, 0); }
		public TerminalNode LB_REFE_L_O() { return getToken(SlimeParser.LB_REFE_L_O, 0); }
		public RefeHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refeHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterRefeHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitRefeHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitRefeHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefeHeadContext refeHead() throws RecognitionException {
		RefeHeadContext _localctx = new RefeHeadContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_refeHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_REFE) | (1L << OLB_REFE) | (1L << LB_REFE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (OB_REFE_B_O - 72)) | (1L << (OLB_REFE_B_O - 72)) | (1L << (LB_REFE_B_O - 72)) | (1L << (OB_REFE_O_O - 72)) | (1L << (OLB_REFE_O_O - 72)) | (1L << (LB_REFE_O_O - 72)))) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & ((1L << (OB_REFE_L_O - 149)) | (1L << (OLB_REFE_L_O - 149)) | (1L << (LB_REFE_L_O - 149)))) != 0)) ) {
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

	public static class RefeBodyContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IN_B_R() { return getToken(SlimeParser.IN_B_R, 0); }
		public TerminalNode IN_O_R() { return getToken(SlimeParser.IN_O_R, 0); }
		public TerminalNode IN_L_R() { return getToken(SlimeParser.IN_L_R, 0); }
		public RefeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterRefeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitRefeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitRefeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefeBodyContext refeBody() throws RecognitionException {
		RefeBodyContext _localctx = new RefeBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_refeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			typeName();
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN_B_R) | (1L << IN_O_R) | (1L << IN_L_R))) != 0)) ) {
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

	public static class RefeTailContext extends ParserRuleContext {
		public TerminalNode CB_REFE() { return getToken(SlimeParser.CB_REFE, 0); }
		public TerminalNode NL_REFE() { return getToken(SlimeParser.NL_REFE, 0); }
		public TerminalNode NW_REFE() { return getToken(SlimeParser.NW_REFE, 0); }
		public RefeTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refeTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterRefeTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitRefeTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitRefeTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefeTailContext refeTail() throws RecognitionException {
		RefeTailContext _localctx = new RefeTailContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_refeTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CB_REFE) | (1L << NL_REFE) | (1L << NW_REFE))) != 0)) ) {
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

	public static class SlotContext extends ParserRuleContext {
		public SlotHeadContext slotHead() {
			return getRuleContext(SlotHeadContext.class,0);
		}
		public SpslBodyContext spslBody() {
			return getRuleContext(SpslBodyContext.class,0);
		}
		public SlotTailContext slotTail() {
			return getRuleContext(SlotTailContext.class,0);
		}
		public SlotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSlot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSlot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSlot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlotContext slot() throws RecognitionException {
		SlotContext _localctx = new SlotContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_slot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			slotHead();
			setState(141);
			spslBody();
			setState(142);
			slotTail();
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

	public static class SlotHeadContext extends ParserRuleContext {
		public TerminalNode OB_SLOT() { return getToken(SlimeParser.OB_SLOT, 0); }
		public TerminalNode OLB_SLOT() { return getToken(SlimeParser.OLB_SLOT, 0); }
		public TerminalNode LB_SLOT() { return getToken(SlimeParser.LB_SLOT, 0); }
		public TerminalNode OB_SLOT_B_O() { return getToken(SlimeParser.OB_SLOT_B_O, 0); }
		public TerminalNode OLB_SLOT_B_O() { return getToken(SlimeParser.OLB_SLOT_B_O, 0); }
		public TerminalNode LB_SLOT_B_O() { return getToken(SlimeParser.LB_SLOT_B_O, 0); }
		public TerminalNode OB_SLOT_O_O() { return getToken(SlimeParser.OB_SLOT_O_O, 0); }
		public TerminalNode OLB_SLOT_O_O() { return getToken(SlimeParser.OLB_SLOT_O_O, 0); }
		public TerminalNode LB_SLOT_O_O() { return getToken(SlimeParser.LB_SLOT_O_O, 0); }
		public TerminalNode OB_SLOT_L_O() { return getToken(SlimeParser.OB_SLOT_L_O, 0); }
		public TerminalNode OLB_SLOT_L_O() { return getToken(SlimeParser.OLB_SLOT_L_O, 0); }
		public TerminalNode LB_SLOT_L_O() { return getToken(SlimeParser.LB_SLOT_L_O, 0); }
		public TerminalNode OB_SLOT_B_T() { return getToken(SlimeParser.OB_SLOT_B_T, 0); }
		public TerminalNode OLB_SLOT_B_T() { return getToken(SlimeParser.OLB_SLOT_B_T, 0); }
		public TerminalNode LB_SLOT_B_T() { return getToken(SlimeParser.LB_SLOT_B_T, 0); }
		public TerminalNode OB_SLOT_O_T() { return getToken(SlimeParser.OB_SLOT_O_T, 0); }
		public TerminalNode OLB_SLOT_O_T() { return getToken(SlimeParser.OLB_SLOT_O_T, 0); }
		public TerminalNode LB_SLOT_O_T() { return getToken(SlimeParser.LB_SLOT_O_T, 0); }
		public TerminalNode OB_SLOT_L_T() { return getToken(SlimeParser.OB_SLOT_L_T, 0); }
		public TerminalNode OLB_SLOT_L_T() { return getToken(SlimeParser.OLB_SLOT_L_T, 0); }
		public TerminalNode LB_SLOT_L_T() { return getToken(SlimeParser.LB_SLOT_L_T, 0); }
		public SlotHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slotHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSlotHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSlotHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSlotHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlotHeadContext slotHead() throws RecognitionException {
		SlotHeadContext _localctx = new SlotHeadContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_slotHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_SLOT) | (1L << OLB_SLOT) | (1L << LB_SLOT))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OB_SLOT_B_O - 70)) | (1L << (OLB_SLOT_B_O - 70)) | (1L << (LB_SLOT_B_O - 70)) | (1L << (OB_SLOT_O_O - 70)) | (1L << (OLB_SLOT_O_O - 70)) | (1L << (LB_SLOT_O_O - 70)))) != 0) || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (OB_SLOT_L_O - 147)) | (1L << (OLB_SLOT_L_O - 147)) | (1L << (LB_SLOT_L_O - 147)) | (1L << (OB_SLOT_B_T - 147)) | (1L << (OLB_SLOT_B_T - 147)) | (1L << (LB_SLOT_B_T - 147)) | (1L << (OB_SLOT_O_T - 147)) | (1L << (OLB_SLOT_O_T - 147)) | (1L << (LB_SLOT_O_T - 147)))) != 0) || ((((_la - 216)) & ~0x3f) == 0 && ((1L << (_la - 216)) & ((1L << (OB_SLOT_L_T - 216)) | (1L << (OLB_SLOT_L_T - 216)) | (1L << (LB_SLOT_L_T - 216)))) != 0)) ) {
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

	public static class SlotTailContext extends ParserRuleContext {
		public TerminalNode CB_SLOT() { return getToken(SlimeParser.CB_SLOT, 0); }
		public TerminalNode NL_SLSP() { return getToken(SlimeParser.NL_SLSP, 0); }
		public TerminalNode NW_SLSP() { return getToken(SlimeParser.NW_SLSP, 0); }
		public SlotTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slotTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSlotTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSlotTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSlotTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlotTailContext slotTail() throws RecognitionException {
		SlotTailContext _localctx = new SlotTailContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_slotTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CB_SLOT) | (1L << NL_SLSP) | (1L << NW_SLSP))) != 0)) ) {
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

	public static class SpecContext extends ParserRuleContext {
		public SpecHeadContext specHead() {
			return getRuleContext(SpecHeadContext.class,0);
		}
		public SpslBodyContext spslBody() {
			return getRuleContext(SpslBodyContext.class,0);
		}
		public SpecTailContext specTail() {
			return getRuleContext(SpecTailContext.class,0);
		}
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			specHead();
			setState(149);
			spslBody();
			setState(150);
			specTail();
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

	public static class SpecHeadContext extends ParserRuleContext {
		public TerminalNode OB_SPEC() { return getToken(SlimeParser.OB_SPEC, 0); }
		public TerminalNode OLB_SPEC() { return getToken(SlimeParser.OLB_SPEC, 0); }
		public TerminalNode LB_SPEC() { return getToken(SlimeParser.LB_SPEC, 0); }
		public TerminalNode OB_SPEC_B_O() { return getToken(SlimeParser.OB_SPEC_B_O, 0); }
		public TerminalNode OLB_SPEC_B_O() { return getToken(SlimeParser.OLB_SPEC_B_O, 0); }
		public TerminalNode LB_SPEC_B_O() { return getToken(SlimeParser.LB_SPEC_B_O, 0); }
		public TerminalNode OB_SPEC_O_O() { return getToken(SlimeParser.OB_SPEC_O_O, 0); }
		public TerminalNode OLB_SPEC_O_O() { return getToken(SlimeParser.OLB_SPEC_O_O, 0); }
		public TerminalNode LB_SPEC_O_O() { return getToken(SlimeParser.LB_SPEC_O_O, 0); }
		public TerminalNode OB_SPEC_L_O() { return getToken(SlimeParser.OB_SPEC_L_O, 0); }
		public TerminalNode OLB_SPEC_L_O() { return getToken(SlimeParser.OLB_SPEC_L_O, 0); }
		public TerminalNode LB_SPEC_L_O() { return getToken(SlimeParser.LB_SPEC_L_O, 0); }
		public TerminalNode OB_SPEC_B_T() { return getToken(SlimeParser.OB_SPEC_B_T, 0); }
		public TerminalNode OLB_SPEC_B_T() { return getToken(SlimeParser.OLB_SPEC_B_T, 0); }
		public TerminalNode LB_SPEC_B_T() { return getToken(SlimeParser.LB_SPEC_B_T, 0); }
		public TerminalNode OB_SPEC_O_T() { return getToken(SlimeParser.OB_SPEC_O_T, 0); }
		public TerminalNode OLB_SPEC_O_T() { return getToken(SlimeParser.OLB_SPEC_O_T, 0); }
		public TerminalNode LB_SPEC_O_T() { return getToken(SlimeParser.LB_SPEC_O_T, 0); }
		public TerminalNode OB_SPEC_L_T() { return getToken(SlimeParser.OB_SPEC_L_T, 0); }
		public TerminalNode OLB_SPEC_L_T() { return getToken(SlimeParser.OLB_SPEC_L_T, 0); }
		public TerminalNode LB_SPEC_L_T() { return getToken(SlimeParser.LB_SPEC_L_T, 0); }
		public SpecHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSpecHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSpecHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSpecHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecHeadContext specHead() throws RecognitionException {
		SpecHeadContext _localctx = new SpecHeadContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_specHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_SPEC) | (1L << OLB_SPEC) | (1L << LB_SPEC))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (OB_SPEC_B_O - 71)) | (1L << (OLB_SPEC_B_O - 71)) | (1L << (LB_SPEC_B_O - 71)) | (1L << (OB_SPEC_O_O - 71)) | (1L << (OLB_SPEC_O_O - 71)) | (1L << (LB_SPEC_O_O - 71)))) != 0) || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (OB_SPEC_L_O - 148)) | (1L << (OLB_SPEC_L_O - 148)) | (1L << (LB_SPEC_L_O - 148)) | (1L << (OB_SPEC_B_T - 148)) | (1L << (OLB_SPEC_B_T - 148)) | (1L << (LB_SPEC_B_T - 148)) | (1L << (OB_SPEC_O_T - 148)) | (1L << (OLB_SPEC_O_T - 148)) | (1L << (LB_SPEC_O_T - 148)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (OB_SPEC_L_T - 217)) | (1L << (OLB_SPEC_L_T - 217)) | (1L << (LB_SPEC_L_T - 217)))) != 0)) ) {
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

	public static class SpecTailContext extends ParserRuleContext {
		public TerminalNode CB_SPEC() { return getToken(SlimeParser.CB_SPEC, 0); }
		public TerminalNode NL_SLSP() { return getToken(SlimeParser.NL_SLSP, 0); }
		public TerminalNode NW_SLSP() { return getToken(SlimeParser.NW_SLSP, 0); }
		public SpecTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSpecTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSpecTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSpecTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecTailContext specTail() throws RecognitionException {
		SpecTailContext _localctx = new SpecTailContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_specTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CB_SPEC) | (1L << NL_SLSP) | (1L << NW_SLSP))) != 0)) ) {
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

	public static class SpslBodyContext extends ParserRuleContext {
		public List<TerminalNode> NAME_B_S() { return getTokens(SlimeParser.NAME_B_S); }
		public TerminalNode NAME_B_S(int i) {
			return getToken(SlimeParser.NAME_B_S, i);
		}
		public List<TerminalNode> NAME_O_S() { return getTokens(SlimeParser.NAME_O_S); }
		public TerminalNode NAME_O_S(int i) {
			return getToken(SlimeParser.NAME_O_S, i);
		}
		public List<TerminalNode> NAME_L_S() { return getTokens(SlimeParser.NAME_L_S); }
		public TerminalNode NAME_L_S(int i) {
			return getToken(SlimeParser.NAME_L_S, i);
		}
		public List<TerminalNode> SC_B_S() { return getTokens(SlimeParser.SC_B_S); }
		public TerminalNode SC_B_S(int i) {
			return getToken(SlimeParser.SC_B_S, i);
		}
		public List<TerminalNode> SC_O_S() { return getTokens(SlimeParser.SC_O_S); }
		public TerminalNode SC_O_S(int i) {
			return getToken(SlimeParser.SC_O_S, i);
		}
		public List<TerminalNode> SC_L_S() { return getTokens(SlimeParser.SC_L_S); }
		public TerminalNode SC_L_S(int i) {
			return getToken(SlimeParser.SC_L_S, i);
		}
		public SpslBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spslBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSpslBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSpslBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSpslBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpslBodyContext spslBody() throws RecognitionException {
		SpslBodyContext _localctx = new SpslBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_spslBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(162);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME_B_S:
						{
						setState(156);
						match(NAME_B_S);
						setState(157);
						match(SC_B_S);
						}
						break;
					case NAME_O_S:
						{
						setState(158);
						match(NAME_O_S);
						setState(159);
						match(SC_O_S);
						}
						break;
					case NAME_L_S:
						{
						setState(160);
						match(NAME_L_S);
						setState(161);
						match(SC_L_S);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME_B_S) | (1L << NAME_O_S) | (1L << NAME_L_S))) != 0)) ) {
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

	public static class TempContext extends ParserRuleContext {
		public TempHeadContext tempHead() {
			return getRuleContext(TempHeadContext.class,0);
		}
		public TempBodyContext tempBody() {
			return getRuleContext(TempBodyContext.class,0);
		}
		public TempTailContext tempTail() {
			return getRuleContext(TempTailContext.class,0);
		}
		public TempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempContext temp() throws RecognitionException {
		TempContext _localctx = new TempContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_temp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			tempHead();
			setState(170);
			tempBody();
			setState(171);
			tempTail();
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

	public static class TempHeadContext extends ParserRuleContext {
		public TerminalNode OB_TEMP() { return getToken(SlimeParser.OB_TEMP, 0); }
		public TerminalNode OLB_TEMP() { return getToken(SlimeParser.OLB_TEMP, 0); }
		public TerminalNode LB_TEMP() { return getToken(SlimeParser.LB_TEMP, 0); }
		public TerminalNode OB_TEMP_B_O() { return getToken(SlimeParser.OB_TEMP_B_O, 0); }
		public TerminalNode OLB_TEMP_B_O() { return getToken(SlimeParser.OLB_TEMP_B_O, 0); }
		public TerminalNode LB_TEMP_B_O() { return getToken(SlimeParser.LB_TEMP_B_O, 0); }
		public TerminalNode OB_TEMP_O_O() { return getToken(SlimeParser.OB_TEMP_O_O, 0); }
		public TerminalNode OLB_TEMP_O_O() { return getToken(SlimeParser.OLB_TEMP_O_O, 0); }
		public TerminalNode LB_TEMP_O_O() { return getToken(SlimeParser.LB_TEMP_O_O, 0); }
		public TerminalNode OB_TEMP_L_O() { return getToken(SlimeParser.OB_TEMP_L_O, 0); }
		public TerminalNode OLB_TEMP_L_O() { return getToken(SlimeParser.OLB_TEMP_L_O, 0); }
		public TerminalNode LB_TEMP_L_O() { return getToken(SlimeParser.LB_TEMP_L_O, 0); }
		public TempHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTempHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTempHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTempHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempHeadContext tempHead() throws RecognitionException {
		TempHeadContext _localctx = new TempHeadContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tempHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_TEMP) | (1L << OLB_TEMP) | (1L << LB_TEMP))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (OB_TEMP_B_O - 78)) | (1L << (OLB_TEMP_B_O - 78)) | (1L << (LB_TEMP_B_O - 78)) | (1L << (OB_TEMP_O_O - 78)) | (1L << (OLB_TEMP_O_O - 78)) | (1L << (LB_TEMP_O_O - 78)))) != 0) || ((((_la - 155)) & ~0x3f) == 0 && ((1L << (_la - 155)) & ((1L << (OB_TEMP_L_O - 155)) | (1L << (OLB_TEMP_L_O - 155)) | (1L << (LB_TEMP_L_O - 155)))) != 0)) ) {
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

	public static class TempBodyContext extends ParserRuleContext {
		public List<TempBodyPartContext> tempBodyPart() {
			return getRuleContexts(TempBodyPartContext.class);
		}
		public TempBodyPartContext tempBodyPart(int i) {
			return getRuleContext(TempBodyPartContext.class,i);
		}
		public List<TerminalNode> SC_B_T() { return getTokens(SlimeParser.SC_B_T); }
		public TerminalNode SC_B_T(int i) {
			return getToken(SlimeParser.SC_B_T, i);
		}
		public List<TerminalNode> SC_L_T() { return getTokens(SlimeParser.SC_L_T); }
		public TerminalNode SC_L_T(int i) {
			return getToken(SlimeParser.SC_L_T, i);
		}
		public List<TerminalNode> SC_O_T() { return getTokens(SlimeParser.SC_O_T); }
		public TerminalNode SC_O_T(int i) {
			return getToken(SlimeParser.SC_O_T, i);
		}
		public TempBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTempBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTempBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTempBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempBodyContext tempBody() throws RecognitionException {
		TempBodyContext _localctx = new TempBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tempBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					tempBodyPart();
					setState(176);
					_la = _input.LA(1);
					if ( !(((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (SC_B_T - 201)) | (1L << (SC_O_T - 201)) | (1L << (SC_L_T - 201)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(183);
			tempBodyPart();
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

	public static class TempBodyPartContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<SlotContext> slot() {
			return getRuleContexts(SlotContext.class);
		}
		public SlotContext slot(int i) {
			return getRuleContext(SlotContext.class,i);
		}
		public List<SpecContext> spec() {
			return getRuleContexts(SpecContext.class);
		}
		public SpecContext spec(int i) {
			return getRuleContext(SpecContext.class,i);
		}
		public List<TempTextContext> tempText() {
			return getRuleContexts(TempTextContext.class);
		}
		public TempTextContext tempText(int i) {
			return getRuleContext(TempTextContext.class,i);
		}
		public List<TerminalNode> LINE_DIVIDER() { return getTokens(SlimeParser.LINE_DIVIDER); }
		public TerminalNode LINE_DIVIDER(int i) {
			return getToken(SlimeParser.LINE_DIVIDER, i);
		}
		public TempBodyPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempBodyPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTempBodyPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTempBodyPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTempBodyPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempBodyPartContext tempBodyPart() throws RecognitionException {
		TempBodyPartContext _localctx = new TempBodyPartContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tempBodyPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(190);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OB_TEXT:
				case OLB_TEXT:
				case LB_TEXT:
				case OB_TEXT_B_O:
				case OLB_TEXT_B_O:
				case LB_TEXT_B_O:
				case OB_TEXT_O_O:
				case OLB_TEXT_O_O:
				case LB_TEXT_O_O:
				case OB_TEXT_L_O:
				case OLB_TEXT_L_O:
				case LB_TEXT_L_O:
				case OB_TEXT_B_T:
				case OLB_TEXT_B_T:
				case LB_TEXT_B_T:
				case OB_TEXT_O_T:
				case OLB_TEXT_O_T:
				case LB_TEXT_O_T:
				case OB_TEXT_L_T:
				case OLB_TEXT_L_T:
				case LB_TEXT_L_T:
					{
					setState(185);
					text();
					}
					break;
				case OB_SLOT:
				case OLB_SLOT:
				case LB_SLOT:
				case OB_SLOT_B_O:
				case OLB_SLOT_B_O:
				case LB_SLOT_B_O:
				case OB_SLOT_O_O:
				case OLB_SLOT_O_O:
				case LB_SLOT_O_O:
				case OB_SLOT_L_O:
				case OLB_SLOT_L_O:
				case LB_SLOT_L_O:
				case OB_SLOT_B_T:
				case OLB_SLOT_B_T:
				case LB_SLOT_B_T:
				case OB_SLOT_O_T:
				case OLB_SLOT_O_T:
				case LB_SLOT_O_T:
				case OB_SLOT_L_T:
				case OLB_SLOT_L_T:
				case LB_SLOT_L_T:
					{
					setState(186);
					slot();
					}
					break;
				case OB_SPEC:
				case OLB_SPEC:
				case LB_SPEC:
				case OB_SPEC_B_O:
				case OLB_SPEC_B_O:
				case LB_SPEC_B_O:
				case OB_SPEC_O_O:
				case OLB_SPEC_O_O:
				case LB_SPEC_O_O:
				case OB_SPEC_L_O:
				case OLB_SPEC_L_O:
				case LB_SPEC_L_O:
				case OB_SPEC_B_T:
				case OLB_SPEC_B_T:
				case LB_SPEC_B_T:
				case OB_SPEC_O_T:
				case OLB_SPEC_O_T:
				case LB_SPEC_O_T:
				case OB_SPEC_L_T:
				case OLB_SPEC_L_T:
				case LB_SPEC_L_T:
					{
					setState(187);
					spec();
					}
					break;
				case TEXT_LINE:
				case OL_TEXT_LINE:
				case L_TEXT_LINE:
					{
					setState(188);
					tempText();
					}
					break;
				case LINE_DIVIDER:
					{
					setState(189);
					match(LINE_DIVIDER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_SLOT) | (1L << OB_SPEC) | (1L << OB_TEXT) | (1L << OLB_SLOT) | (1L << OLB_SPEC) | (1L << OLB_TEXT) | (1L << LB_SLOT) | (1L << LB_SPEC) | (1L << LB_TEXT))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OB_SLOT_B_O - 70)) | (1L << (OB_SPEC_B_O - 70)) | (1L << (OB_TEXT_B_O - 70)) | (1L << (OLB_SLOT_B_O - 70)) | (1L << (OLB_SPEC_B_O - 70)) | (1L << (OLB_TEXT_B_O - 70)) | (1L << (LB_SLOT_B_O - 70)) | (1L << (LB_SPEC_B_O - 70)) | (1L << (LB_TEXT_B_O - 70)) | (1L << (OB_SLOT_O_O - 70)) | (1L << (OB_SPEC_O_O - 70)) | (1L << (OB_TEXT_O_O - 70)) | (1L << (OLB_SLOT_O_O - 70)) | (1L << (OLB_SPEC_O_O - 70)) | (1L << (OLB_TEXT_O_O - 70)) | (1L << (LB_SLOT_O_O - 70)) | (1L << (LB_SPEC_O_O - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (LB_TEXT_O_O - 134)) | (1L << (OB_SLOT_L_O - 134)) | (1L << (OB_SPEC_L_O - 134)) | (1L << (OB_TEXT_L_O - 134)) | (1L << (OLB_SLOT_L_O - 134)) | (1L << (OLB_SPEC_L_O - 134)) | (1L << (OLB_TEXT_L_O - 134)) | (1L << (LB_SLOT_L_O - 134)) | (1L << (LB_SPEC_L_O - 134)) | (1L << (LB_TEXT_L_O - 134)) | (1L << (TEXT_LINE - 134)) | (1L << (LINE_DIVIDER - 134)) | (1L << (OB_SLOT_B_T - 134)) | (1L << (OB_SPEC_B_T - 134)) | (1L << (OB_TEXT_B_T - 134)) | (1L << (OLB_SLOT_B_T - 134)) | (1L << (OLB_SPEC_B_T - 134)) | (1L << (OLB_TEXT_B_T - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (LB_SLOT_B_T - 198)) | (1L << (LB_SPEC_B_T - 198)) | (1L << (LB_TEXT_B_T - 198)) | (1L << (OL_TEXT_LINE - 198)) | (1L << (OB_SLOT_O_T - 198)) | (1L << (OB_SPEC_O_T - 198)) | (1L << (OB_TEXT_O_T - 198)) | (1L << (OLB_SLOT_O_T - 198)) | (1L << (OLB_SPEC_O_T - 198)) | (1L << (OLB_TEXT_O_T - 198)) | (1L << (LB_SLOT_O_T - 198)) | (1L << (LB_SPEC_O_T - 198)) | (1L << (LB_TEXT_O_T - 198)) | (1L << (L_TEXT_LINE - 198)) | (1L << (OB_SLOT_L_T - 198)) | (1L << (OB_SPEC_L_T - 198)) | (1L << (OB_TEXT_L_T - 198)) | (1L << (OLB_SLOT_L_T - 198)) | (1L << (OLB_SPEC_L_T - 198)) | (1L << (OLB_TEXT_L_T - 198)) | (1L << (LB_SLOT_L_T - 198)) | (1L << (LB_SPEC_L_T - 198)) | (1L << (LB_TEXT_L_T - 198)))) != 0) );
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

	public static class TempTailContext extends ParserRuleContext {
		public TerminalNode CB_TEMP() { return getToken(SlimeParser.CB_TEMP, 0); }
		public TerminalNode NL_TEMP() { return getToken(SlimeParser.NL_TEMP, 0); }
		public TerminalNode NW_TEMP() { return getToken(SlimeParser.NW_TEMP, 0); }
		public TempTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTempTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTempTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTempTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempTailContext tempTail() throws RecognitionException {
		TempTailContext _localctx = new TempTailContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tempTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !(((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (CB_TEMP - 189)) | (1L << (NL_TEMP - 189)) | (1L << (NW_TEMP - 189)))) != 0)) ) {
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

	public static class TempTextContext extends ParserRuleContext {
		public List<TerminalNode> TEXT_LINE() { return getTokens(SlimeParser.TEXT_LINE); }
		public TerminalNode TEXT_LINE(int i) {
			return getToken(SlimeParser.TEXT_LINE, i);
		}
		public List<TerminalNode> LINE_DIVIDER() { return getTokens(SlimeParser.LINE_DIVIDER); }
		public TerminalNode LINE_DIVIDER(int i) {
			return getToken(SlimeParser.LINE_DIVIDER, i);
		}
		public TerminalNode OL_TEXT_LINE() { return getToken(SlimeParser.OL_TEXT_LINE, 0); }
		public TerminalNode L_TEXT_LINE() { return getToken(SlimeParser.L_TEXT_LINE, 0); }
		public TempTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTempText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTempText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTempText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempTextContext tempText() throws RecognitionException {
		TempTextContext _localctx = new TempTextContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tempText);
		try {
			int _alt;
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_LINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(196);
						match(TEXT_LINE);
						setState(197);
						match(LINE_DIVIDER);
						}
						} 
					}
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(203);
				match(TEXT_LINE);
				}
				break;
			case OL_TEXT_LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(OL_TEXT_LINE);
				}
				break;
			case L_TEXT_LINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(L_TEXT_LINE);
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

	public static class ExpaContext extends ParserRuleContext {
		public ExpaHeadContext expaHead() {
			return getRuleContext(ExpaHeadContext.class,0);
		}
		public ExpaBodyContext expaBody() {
			return getRuleContext(ExpaBodyContext.class,0);
		}
		public ExpaTailContext expaTail() {
			return getRuleContext(ExpaTailContext.class,0);
		}
		public ExpaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExpa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExpa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExpa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpaContext expa() throws RecognitionException {
		ExpaContext _localctx = new ExpaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			expaHead();
			setState(209);
			expaBody();
			setState(210);
			expaTail();
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

	public static class ExpaHeadContext extends ParserRuleContext {
		public TerminalNode OB_EXPA() { return getToken(SlimeParser.OB_EXPA, 0); }
		public TerminalNode OLB_EXPA() { return getToken(SlimeParser.OLB_EXPA, 0); }
		public TerminalNode LB_EXPA() { return getToken(SlimeParser.LB_EXPA, 0); }
		public TerminalNode OB_EXPA_B_O() { return getToken(SlimeParser.OB_EXPA_B_O, 0); }
		public TerminalNode OLB_EXPA_B_O() { return getToken(SlimeParser.OLB_EXPA_B_O, 0); }
		public TerminalNode LB_EXPA_B_O() { return getToken(SlimeParser.LB_EXPA_B_O, 0); }
		public TerminalNode OB_EXPA_O_O() { return getToken(SlimeParser.OB_EXPA_O_O, 0); }
		public TerminalNode OLB_EXPA_O_O() { return getToken(SlimeParser.OLB_EXPA_O_O, 0); }
		public TerminalNode LB_EXPA_O_O() { return getToken(SlimeParser.LB_EXPA_O_O, 0); }
		public TerminalNode OB_EXPA_L_O() { return getToken(SlimeParser.OB_EXPA_L_O, 0); }
		public TerminalNode OLB_EXPA_L_O() { return getToken(SlimeParser.OLB_EXPA_L_O, 0); }
		public TerminalNode LB_EXPA_L_O() { return getToken(SlimeParser.LB_EXPA_L_O, 0); }
		public ExpaHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expaHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExpaHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExpaHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExpaHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpaHeadContext expaHead() throws RecognitionException {
		ExpaHeadContext _localctx = new ExpaHeadContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expaHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_EXPA) | (1L << OLB_EXPA) | (1L << LB_EXPA))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (OB_EXPA_B_O - 73)) | (1L << (OLB_EXPA_B_O - 73)) | (1L << (LB_EXPA_B_O - 73)) | (1L << (OB_EXPA_O_O - 73)) | (1L << (OLB_EXPA_O_O - 73)) | (1L << (LB_EXPA_O_O - 73)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (OB_EXPA_L_O - 150)) | (1L << (OLB_EXPA_L_O - 150)) | (1L << (LB_EXPA_L_O - 150)))) != 0)) ) {
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

	public static class ExpaBodyContext extends ParserRuleContext {
		public List<ExpaBodyPartContext> expaBodyPart() {
			return getRuleContexts(ExpaBodyPartContext.class);
		}
		public ExpaBodyPartContext expaBodyPart(int i) {
			return getRuleContext(ExpaBodyPartContext.class,i);
		}
		public List<TerminalNode> SC_B_O() { return getTokens(SlimeParser.SC_B_O); }
		public TerminalNode SC_B_O(int i) {
			return getToken(SlimeParser.SC_B_O, i);
		}
		public List<TerminalNode> SC_O_O() { return getTokens(SlimeParser.SC_O_O); }
		public TerminalNode SC_O_O(int i) {
			return getToken(SlimeParser.SC_O_O, i);
		}
		public List<TerminalNode> SC_L_O() { return getTokens(SlimeParser.SC_L_O); }
		public TerminalNode SC_L_O(int i) {
			return getToken(SlimeParser.SC_L_O, i);
		}
		public ExpaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExpaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExpaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExpaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpaBodyContext expaBody() throws RecognitionException {
		ExpaBodyContext _localctx = new ExpaBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expaBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					expaBodyPart();
					setState(215);
					_la = _input.LA(1);
					if ( !(_la==SC_B_O || _la==SC_O_O || _la==SC_L_O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(222);
			expaBodyPart();
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

	public static class ExpaBodyPartContext extends ParserRuleContext {
		public VariContext vari() {
			return getRuleContext(VariContext.class,0);
		}
		public TerminalNode CL_B_O() { return getToken(SlimeParser.CL_B_O, 0); }
		public TerminalNode CL_O_O() { return getToken(SlimeParser.CL_O_O, 0); }
		public TerminalNode CL_L_O() { return getToken(SlimeParser.CL_L_O, 0); }
		public TempContext temp() {
			return getRuleContext(TempContext.class,0);
		}
		public SpecContext spec() {
			return getRuleContext(SpecContext.class,0);
		}
		public ExpaBodyPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expaBodyPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExpaBodyPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExpaBodyPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExpaBodyPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpaBodyPartContext expaBodyPart() throws RecognitionException {
		ExpaBodyPartContext _localctx = new ExpaBodyPartContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expaBodyPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			vari();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) {
				{
				setState(225);
				_la = _input.LA(1);
				if ( !(_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OB_TEMP:
				case OLB_TEMP:
				case LB_TEMP:
				case OB_TEMP_B_O:
				case OLB_TEMP_B_O:
				case LB_TEMP_B_O:
				case OB_TEMP_O_O:
				case OLB_TEMP_O_O:
				case LB_TEMP_O_O:
				case OB_TEMP_L_O:
				case OLB_TEMP_L_O:
				case LB_TEMP_L_O:
					{
					setState(226);
					temp();
					}
					break;
				case OB_SPEC:
				case OLB_SPEC:
				case LB_SPEC:
				case OB_SPEC_B_O:
				case OLB_SPEC_B_O:
				case LB_SPEC_B_O:
				case OB_SPEC_O_O:
				case OLB_SPEC_O_O:
				case LB_SPEC_O_O:
				case OB_SPEC_L_O:
				case OLB_SPEC_L_O:
				case LB_SPEC_L_O:
				case OB_SPEC_B_T:
				case OLB_SPEC_B_T:
				case LB_SPEC_B_T:
				case OB_SPEC_O_T:
				case OLB_SPEC_O_T:
				case LB_SPEC_O_T:
				case OB_SPEC_L_T:
				case OLB_SPEC_L_T:
				case LB_SPEC_L_T:
					{
					setState(227);
					spec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ExpaTailContext extends ParserRuleContext {
		public TerminalNode CB_EXPA() { return getToken(SlimeParser.CB_EXPA, 0); }
		public TerminalNode NL_OPER() { return getToken(SlimeParser.NL_OPER, 0); }
		public TerminalNode NW_OPER() { return getToken(SlimeParser.NW_OPER, 0); }
		public ExpaTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expaTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExpaTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExpaTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExpaTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpaTailContext expaTail() throws RecognitionException {
		ExpaTailContext _localctx = new ExpaTailContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expaTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !(_la==CB_EXPA || _la==NL_OPER || _la==NW_OPER) ) {
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

	public static class PlusContext extends ParserRuleContext {
		public PlusHeadContext plusHead() {
			return getRuleContext(PlusHeadContext.class,0);
		}
		public PlusBodyContext plusBody() {
			return getRuleContext(PlusBodyContext.class,0);
		}
		public PlusTailContext plusTail() {
			return getRuleContext(PlusTailContext.class,0);
		}
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			plusHead();
			setState(235);
			plusBody();
			setState(236);
			plusTail();
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

	public static class PlusHeadContext extends ParserRuleContext {
		public TerminalNode OB_PLUS() { return getToken(SlimeParser.OB_PLUS, 0); }
		public TerminalNode OLB_PLUS() { return getToken(SlimeParser.OLB_PLUS, 0); }
		public TerminalNode LB_PLUS() { return getToken(SlimeParser.LB_PLUS, 0); }
		public TerminalNode OB_PLUS_B_O() { return getToken(SlimeParser.OB_PLUS_B_O, 0); }
		public TerminalNode OLB_PLUS_B_O() { return getToken(SlimeParser.OLB_PLUS_B_O, 0); }
		public TerminalNode LB_PLUS_B_O() { return getToken(SlimeParser.LB_PLUS_B_O, 0); }
		public TerminalNode OB_PLUS_O_O() { return getToken(SlimeParser.OB_PLUS_O_O, 0); }
		public TerminalNode OLB_PLUS_O_O() { return getToken(SlimeParser.OLB_PLUS_O_O, 0); }
		public TerminalNode LB_PLUS_O_O() { return getToken(SlimeParser.LB_PLUS_O_O, 0); }
		public TerminalNode OB_PLUS_L_O() { return getToken(SlimeParser.OB_PLUS_L_O, 0); }
		public TerminalNode OLB_PLUS_L_O() { return getToken(SlimeParser.OLB_PLUS_L_O, 0); }
		public TerminalNode LB_PLUS_L_O() { return getToken(SlimeParser.LB_PLUS_L_O, 0); }
		public PlusHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterPlusHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitPlusHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitPlusHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusHeadContext plusHead() throws RecognitionException {
		PlusHeadContext _localctx = new PlusHeadContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_plusHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_PLUS) | (1L << OLB_PLUS) | (1L << LB_PLUS))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (OB_PLUS_B_O - 74)) | (1L << (OLB_PLUS_B_O - 74)) | (1L << (LB_PLUS_B_O - 74)) | (1L << (OB_PLUS_O_O - 74)) | (1L << (OLB_PLUS_O_O - 74)) | (1L << (LB_PLUS_O_O - 74)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (OB_PLUS_L_O - 151)) | (1L << (OLB_PLUS_L_O - 151)) | (1L << (LB_PLUS_L_O - 151)))) != 0)) ) {
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

	public static class PlusBodyContext extends ParserRuleContext {
		public List<PlusBodyPartContext> plusBodyPart() {
			return getRuleContexts(PlusBodyPartContext.class);
		}
		public PlusBodyPartContext plusBodyPart(int i) {
			return getRuleContext(PlusBodyPartContext.class,i);
		}
		public List<TerminalNode> SC_B_O() { return getTokens(SlimeParser.SC_B_O); }
		public TerminalNode SC_B_O(int i) {
			return getToken(SlimeParser.SC_B_O, i);
		}
		public List<TerminalNode> SC_O_O() { return getTokens(SlimeParser.SC_O_O); }
		public TerminalNode SC_O_O(int i) {
			return getToken(SlimeParser.SC_O_O, i);
		}
		public List<TerminalNode> SC_L_O() { return getTokens(SlimeParser.SC_L_O); }
		public TerminalNode SC_L_O(int i) {
			return getToken(SlimeParser.SC_L_O, i);
		}
		public PlusBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterPlusBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitPlusBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitPlusBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusBodyContext plusBody() throws RecognitionException {
		PlusBodyContext _localctx = new PlusBodyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_plusBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240);
					plusBodyPart();
					setState(241);
					_la = _input.LA(1);
					if ( !(_la==SC_B_O || _la==SC_O_O || _la==SC_L_O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(248);
			plusBodyPart();
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

	public static class PlusBodyPartContext extends ParserRuleContext {
		public List<VariContext> vari() {
			return getRuleContexts(VariContext.class);
		}
		public VariContext vari(int i) {
			return getRuleContext(VariContext.class,i);
		}
		public TerminalNode PLOP_B_O() { return getToken(SlimeParser.PLOP_B_O, 0); }
		public TerminalNode PLOP_O_O() { return getToken(SlimeParser.PLOP_O_O, 0); }
		public TerminalNode PLOP_L_O() { return getToken(SlimeParser.PLOP_L_O, 0); }
		public List<PlusElementContext> plusElement() {
			return getRuleContexts(PlusElementContext.class);
		}
		public PlusElementContext plusElement(int i) {
			return getRuleContext(PlusElementContext.class,i);
		}
		public TerminalNode CL_B_O() { return getToken(SlimeParser.CL_B_O, 0); }
		public TerminalNode CL_O_O() { return getToken(SlimeParser.CL_O_O, 0); }
		public TerminalNode CL_L_O() { return getToken(SlimeParser.CL_L_O, 0); }
		public List<TerminalNode> CO_B_O() { return getTokens(SlimeParser.CO_B_O); }
		public TerminalNode CO_B_O(int i) {
			return getToken(SlimeParser.CO_B_O, i);
		}
		public List<TerminalNode> CO_O_O() { return getTokens(SlimeParser.CO_O_O); }
		public TerminalNode CO_O_O(int i) {
			return getToken(SlimeParser.CO_O_O, i);
		}
		public List<TerminalNode> CO_L_O() { return getTokens(SlimeParser.CO_L_O); }
		public TerminalNode CO_L_O(int i) {
			return getToken(SlimeParser.CO_L_O, i);
		}
		public PlusBodyPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusBodyPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterPlusBodyPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitPlusBodyPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitPlusBodyPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusBodyPartContext plusBodyPart() throws RecognitionException {
		PlusBodyPartContext _localctx = new PlusBodyPartContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_plusBodyPart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			vari();
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==PLOP_B_O || _la==PLOP_O_O || _la==PLOP_L_O) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(252);
			vari();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) {
				{
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(254);
						plusElement();
						setState(255);
						_la = _input.LA(1);
						if ( !(_la==CO_B_O || _la==CO_O_O || _la==CO_L_O) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(262);
				plusElement();
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

	public static class PlusElementContext extends ParserRuleContext {
		public List<VariPathContext> variPath() {
			return getRuleContexts(VariPathContext.class);
		}
		public VariPathContext variPath(int i) {
			return getRuleContext(VariPathContext.class,i);
		}
		public TerminalNode PLOP_B_O() { return getToken(SlimeParser.PLOP_B_O, 0); }
		public TerminalNode PLOP_O_O() { return getToken(SlimeParser.PLOP_O_O, 0); }
		public TerminalNode PLOP_L_O() { return getToken(SlimeParser.PLOP_L_O, 0); }
		public PlusElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterPlusElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitPlusElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitPlusElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusElementContext plusElement() throws RecognitionException {
		PlusElementContext _localctx = new PlusElementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_plusElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			variPath();
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==PLOP_B_O || _la==PLOP_O_O || _la==PLOP_L_O) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(267);
			variPath();
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

	public static class PlusTailContext extends ParserRuleContext {
		public TerminalNode CB_PLUS() { return getToken(SlimeParser.CB_PLUS, 0); }
		public TerminalNode NL_OPER() { return getToken(SlimeParser.NL_OPER, 0); }
		public TerminalNode NW_OPER() { return getToken(SlimeParser.NW_OPER, 0); }
		public PlusTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterPlusTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitPlusTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitPlusTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusTailContext plusTail() throws RecognitionException {
		PlusTailContext _localctx = new PlusTailContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_plusTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==CB_PLUS || _la==NL_OPER || _la==NW_OPER) ) {
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

	public static class DeleContext extends ParserRuleContext {
		public DeleHeadContext deleHead() {
			return getRuleContext(DeleHeadContext.class,0);
		}
		public DeleBodyContext deleBody() {
			return getRuleContext(DeleBodyContext.class,0);
		}
		public DeleTailContext deleTail() {
			return getRuleContext(DeleTailContext.class,0);
		}
		public DeleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dele; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDele(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDele(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDele(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleContext dele() throws RecognitionException {
		DeleContext _localctx = new DeleContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dele);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			deleHead();
			setState(272);
			deleBody();
			setState(273);
			deleTail();
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

	public static class DeleHeadContext extends ParserRuleContext {
		public TerminalNode OB_DELE() { return getToken(SlimeParser.OB_DELE, 0); }
		public TerminalNode OLB_DELE() { return getToken(SlimeParser.OLB_DELE, 0); }
		public TerminalNode LB_DELE() { return getToken(SlimeParser.LB_DELE, 0); }
		public TerminalNode OB_DELE_B_O() { return getToken(SlimeParser.OB_DELE_B_O, 0); }
		public TerminalNode OLB_DELE_B_O() { return getToken(SlimeParser.OLB_DELE_B_O, 0); }
		public TerminalNode LB_DELE_B_O() { return getToken(SlimeParser.LB_DELE_B_O, 0); }
		public TerminalNode OB_DELE_O_O() { return getToken(SlimeParser.OB_DELE_O_O, 0); }
		public TerminalNode OLB_DELE_O_O() { return getToken(SlimeParser.OLB_DELE_O_O, 0); }
		public TerminalNode LB_DELE_O_O() { return getToken(SlimeParser.LB_DELE_O_O, 0); }
		public TerminalNode OB_DELE_L_O() { return getToken(SlimeParser.OB_DELE_L_O, 0); }
		public TerminalNode OLB_DELE_L_O() { return getToken(SlimeParser.OLB_DELE_L_O, 0); }
		public TerminalNode LB_DELE_L_O() { return getToken(SlimeParser.LB_DELE_L_O, 0); }
		public DeleHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeleHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeleHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeleHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleHeadContext deleHead() throws RecognitionException {
		DeleHeadContext _localctx = new DeleHeadContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_deleHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_DELE) | (1L << OLB_DELE) | (1L << LB_DELE))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (OB_DELE_B_O - 76)) | (1L << (OLB_DELE_B_O - 76)) | (1L << (LB_DELE_B_O - 76)) | (1L << (OB_DELE_O_O - 76)) | (1L << (OLB_DELE_O_O - 76)) | (1L << (LB_DELE_O_O - 76)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (OB_DELE_L_O - 153)) | (1L << (OLB_DELE_L_O - 153)) | (1L << (LB_DELE_L_O - 153)))) != 0)) ) {
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

	public static class DeleBodyContext extends ParserRuleContext {
		public List<VariPathContext> variPath() {
			return getRuleContexts(VariPathContext.class);
		}
		public VariPathContext variPath(int i) {
			return getRuleContext(VariPathContext.class,i);
		}
		public List<RefeContext> refe() {
			return getRuleContexts(RefeContext.class);
		}
		public RefeContext refe(int i) {
			return getRuleContext(RefeContext.class,i);
		}
		public List<TerminalNode> SC_B_O() { return getTokens(SlimeParser.SC_B_O); }
		public TerminalNode SC_B_O(int i) {
			return getToken(SlimeParser.SC_B_O, i);
		}
		public List<TerminalNode> SC_O_O() { return getTokens(SlimeParser.SC_O_O); }
		public TerminalNode SC_O_O(int i) {
			return getToken(SlimeParser.SC_O_O, i);
		}
		public List<TerminalNode> SC_L_O() { return getTokens(SlimeParser.SC_L_O); }
		public TerminalNode SC_L_O(int i) {
			return getToken(SlimeParser.SC_L_O, i);
		}
		public DeleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleBodyContext deleBody() throws RecognitionException {
		DeleBodyContext _localctx = new DeleBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_deleBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(279);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME_B_O:
					case INTE_B_O:
					case NAME_O_O:
					case INTE_O_O:
					case NAME_L_O:
					case INTE_L_O:
						{
						setState(277);
						variPath();
						}
						break;
					case OB_REFE:
					case OLB_REFE:
					case LB_REFE:
					case OB_REFE_B_O:
					case OLB_REFE_B_O:
					case LB_REFE_B_O:
					case OB_REFE_O_O:
					case OLB_REFE_O_O:
					case LB_REFE_O_O:
					case OB_REFE_L_O:
					case OLB_REFE_L_O:
					case LB_REFE_L_O:
						{
						setState(278);
						refe();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(281);
					_la = _input.LA(1);
					if ( !(_la==SC_B_O || _la==SC_O_O || _la==SC_L_O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_B_O:
			case INTE_B_O:
			case NAME_O_O:
			case INTE_O_O:
			case NAME_L_O:
			case INTE_L_O:
				{
				setState(288);
				variPath();
				}
				break;
			case OB_REFE:
			case OLB_REFE:
			case LB_REFE:
			case OB_REFE_B_O:
			case OLB_REFE_B_O:
			case LB_REFE_B_O:
			case OB_REFE_O_O:
			case OLB_REFE_O_O:
			case LB_REFE_O_O:
			case OB_REFE_L_O:
			case OLB_REFE_L_O:
			case LB_REFE_L_O:
				{
				setState(289);
				refe();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DeleTailContext extends ParserRuleContext {
		public TerminalNode CB_DELE() { return getToken(SlimeParser.CB_DELE, 0); }
		public TerminalNode NL_OPER() { return getToken(SlimeParser.NL_OPER, 0); }
		public TerminalNode NW_OPER() { return getToken(SlimeParser.NW_OPER, 0); }
		public DeleTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeleTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeleTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeleTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleTailContext deleTail() throws RecognitionException {
		DeleTailContext _localctx = new DeleTailContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_deleTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !(_la==CB_DELE || _la==NL_OPER || _la==NW_OPER) ) {
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

	public static class DeclContext extends ParserRuleContext {
		public DeclHeadContext declHead() {
			return getRuleContext(DeclHeadContext.class,0);
		}
		public DeclBodyContext declBody() {
			return getRuleContext(DeclBodyContext.class,0);
		}
		public DeclTailContext declTail() {
			return getRuleContext(DeclTailContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			declHead();
			setState(295);
			declBody();
			setState(296);
			declTail();
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

	public static class DeclHeadContext extends ParserRuleContext {
		public TerminalNode OB_DECL() { return getToken(SlimeParser.OB_DECL, 0); }
		public TerminalNode OLB_DECL() { return getToken(SlimeParser.OLB_DECL, 0); }
		public TerminalNode LB_DECL() { return getToken(SlimeParser.LB_DECL, 0); }
		public TerminalNode OB_DECL_B_O() { return getToken(SlimeParser.OB_DECL_B_O, 0); }
		public TerminalNode OLB_DECL_B_O() { return getToken(SlimeParser.OLB_DECL_B_O, 0); }
		public TerminalNode LB_DECL_B_O() { return getToken(SlimeParser.LB_DECL_B_O, 0); }
		public TerminalNode OB_DECL_O_O() { return getToken(SlimeParser.OB_DECL_O_O, 0); }
		public TerminalNode OLB_DECL_O_O() { return getToken(SlimeParser.OLB_DECL_O_O, 0); }
		public TerminalNode LB_DECL_O_O() { return getToken(SlimeParser.LB_DECL_O_O, 0); }
		public TerminalNode OB_DECL_L_O() { return getToken(SlimeParser.OB_DECL_L_O, 0); }
		public TerminalNode OLB_DECL_L_O() { return getToken(SlimeParser.OLB_DECL_L_O, 0); }
		public TerminalNode LB_DECL_L_O() { return getToken(SlimeParser.LB_DECL_L_O, 0); }
		public DeclHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeclHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeclHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeclHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclHeadContext declHead() throws RecognitionException {
		DeclHeadContext _localctx = new DeclHeadContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_declHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_DECL) | (1L << OLB_DECL) | (1L << LB_DECL))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (OB_DECL_B_O - 75)) | (1L << (OLB_DECL_B_O - 75)) | (1L << (LB_DECL_B_O - 75)) | (1L << (OB_DECL_O_O - 75)) | (1L << (OLB_DECL_O_O - 75)) | (1L << (LB_DECL_O_O - 75)))) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (OB_DECL_L_O - 152)) | (1L << (OLB_DECL_L_O - 152)) | (1L << (LB_DECL_L_O - 152)))) != 0)) ) {
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

	public static class DeclNeckContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode CL_B_O() { return getToken(SlimeParser.CL_B_O, 0); }
		public TerminalNode CL_O_O() { return getToken(SlimeParser.CL_O_O, 0); }
		public TerminalNode CL_L_O() { return getToken(SlimeParser.CL_L_O, 0); }
		public TerminalNode EQOP_B_O() { return getToken(SlimeParser.EQOP_B_O, 0); }
		public TerminalNode EQOP_O_O() { return getToken(SlimeParser.EQOP_O_O, 0); }
		public TerminalNode EQOP_L_O() { return getToken(SlimeParser.EQOP_L_O, 0); }
		public ListNameContext listName() {
			return getRuleContext(ListNameContext.class,0);
		}
		public DeclNeckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declNeck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeclNeck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeclNeck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeclNeck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclNeckContext declNeck() throws RecognitionException {
		DeclNeckContext _localctx = new DeclNeckContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_declNeck);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME_B_O || _la==NAME_O_O || _la==NAME_L_O) {
				{
				setState(300);
				listName();
				}
			}

			setState(303);
			_la = _input.LA(1);
			if ( !(_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(304);
			typeName();
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==EQOP_B_O || _la==EQOP_O_O || _la==EQOP_L_O) ) {
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

	public static class DeclBodyContext extends ParserRuleContext {
		public List<DeclBodyPartContext> declBodyPart() {
			return getRuleContexts(DeclBodyPartContext.class);
		}
		public DeclBodyPartContext declBodyPart(int i) {
			return getRuleContext(DeclBodyPartContext.class,i);
		}
		public List<TerminalNode> SC_B_O() { return getTokens(SlimeParser.SC_B_O); }
		public TerminalNode SC_B_O(int i) {
			return getToken(SlimeParser.SC_B_O, i);
		}
		public List<TerminalNode> SC_O_O() { return getTokens(SlimeParser.SC_O_O); }
		public TerminalNode SC_O_O(int i) {
			return getToken(SlimeParser.SC_O_O, i);
		}
		public List<TerminalNode> SC_L_O() { return getTokens(SlimeParser.SC_L_O); }
		public TerminalNode SC_L_O(int i) {
			return getToken(SlimeParser.SC_L_O, i);
		}
		public DeclBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeclBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeclBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeclBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclBodyContext declBody() throws RecognitionException {
		DeclBodyContext _localctx = new DeclBodyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_declBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					declBodyPart();
					setState(308);
					_la = _input.LA(1);
					if ( !(_la==SC_B_O || _la==SC_O_O || _la==SC_L_O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(315);
			declBodyPart();
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

	public static class DeclBodyPartContext extends ParserRuleContext {
		public DeclNeckContext declNeck() {
			return getRuleContext(DeclNeckContext.class,0);
		}
		public ListNameContext listName() {
			return getRuleContext(ListNameContext.class,0);
		}
		public ListVariContext listVari() {
			return getRuleContext(ListVariContext.class,0);
		}
		public List<NameTypeContext> nameType() {
			return getRuleContexts(NameTypeContext.class);
		}
		public NameTypeContext nameType(int i) {
			return getRuleContext(NameTypeContext.class,i);
		}
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public List<TerminalNode> CO_B_O() { return getTokens(SlimeParser.CO_B_O); }
		public TerminalNode CO_B_O(int i) {
			return getToken(SlimeParser.CO_B_O, i);
		}
		public List<TerminalNode> CO_O_O() { return getTokens(SlimeParser.CO_O_O); }
		public TerminalNode CO_O_O(int i) {
			return getToken(SlimeParser.CO_O_O, i);
		}
		public List<TerminalNode> CO_L_O() { return getTokens(SlimeParser.CO_L_O); }
		public TerminalNode CO_L_O(int i) {
			return getToken(SlimeParser.CO_L_O, i);
		}
		public VariContext vari() {
			return getRuleContext(VariContext.class,0);
		}
		public DeclBodyPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declBodyPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeclBodyPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeclBodyPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeclBodyPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclBodyPartContext declBodyPart() throws RecognitionException {
		DeclBodyPartContext _localctx = new DeclBodyPartContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_declBodyPart);
		int _la;
		try {
			int _alt;
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				declNeck();
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(318);
					listName();
					}
					break;
				case 2:
					{
					setState(319);
					listVari();
					}
					break;
				case 3:
					{
					setState(325);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(320);
							nameType();
							setState(321);
							_la = _input.LA(1);
							if ( !(_la==CO_B_O || _la==CO_O_O || _la==CO_L_O) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							} 
						}
						setState(327);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					}
					setState(328);
					nameType();
					}
					break;
				case 4:
					{
					setState(334);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(329);
							nameValue();
							setState(330);
							_la = _input.LA(1);
							if ( !(_la==CO_B_O || _la==CO_O_O || _la==CO_L_O) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							} 
						}
						setState(336);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					}
					setState(337);
					nameValue();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				vari();
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

	public static class DeclTailContext extends ParserRuleContext {
		public TerminalNode CB_DECL() { return getToken(SlimeParser.CB_DECL, 0); }
		public TerminalNode NL_OPER() { return getToken(SlimeParser.NL_OPER, 0); }
		public TerminalNode NW_OPER() { return getToken(SlimeParser.NW_OPER, 0); }
		public DeclTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeclTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeclTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeclTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclTailContext declTail() throws RecognitionException {
		DeclTailContext _localctx = new DeclTailContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_declTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !(_la==CB_DECL || _la==NL_OPER || _la==NW_OPER) ) {
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

	public static class NameValueContext extends ParserRuleContext {
		public ListNameContext listName() {
			return getRuleContext(ListNameContext.class,0);
		}
		public ListVariContext listVari() {
			return getRuleContext(ListVariContext.class,0);
		}
		public TerminalNode EQOP_B_O() { return getToken(SlimeParser.EQOP_B_O, 0); }
		public TerminalNode EQOP_O_O() { return getToken(SlimeParser.EQOP_O_O, 0); }
		public TerminalNode EQOP_L_O() { return getToken(SlimeParser.EQOP_L_O, 0); }
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitNameValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitNameValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_nameValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(345);
			listName();
			setState(346);
			_la = _input.LA(1);
			if ( !(_la==EQOP_B_O || _la==EQOP_O_O || _la==EQOP_L_O) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(347);
			listVari();
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

	public static class NameTypeContext extends ParserRuleContext {
		public ListNameContext listName() {
			return getRuleContext(ListNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode CL_B_O() { return getToken(SlimeParser.CL_B_O, 0); }
		public TerminalNode CL_O_O() { return getToken(SlimeParser.CL_O_O, 0); }
		public TerminalNode CL_L_O() { return getToken(SlimeParser.CL_L_O, 0); }
		public NameTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterNameType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitNameType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitNameType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameTypeContext nameType() throws RecognitionException {
		NameTypeContext _localctx = new NameTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_nameType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(349);
			listName();
			setState(350);
			_la = _input.LA(1);
			if ( !(_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(351);
			typeName();
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

	public static class ListVariContext extends ParserRuleContext {
		public List<VariContext> vari() {
			return getRuleContexts(VariContext.class);
		}
		public VariContext vari(int i) {
			return getRuleContext(VariContext.class,i);
		}
		public List<TerminalNode> CO_B_O() { return getTokens(SlimeParser.CO_B_O); }
		public TerminalNode CO_B_O(int i) {
			return getToken(SlimeParser.CO_B_O, i);
		}
		public List<TerminalNode> CO_O_O() { return getTokens(SlimeParser.CO_O_O); }
		public TerminalNode CO_O_O(int i) {
			return getToken(SlimeParser.CO_O_O, i);
		}
		public List<TerminalNode> CO_L_O() { return getTokens(SlimeParser.CO_L_O); }
		public TerminalNode CO_L_O(int i) {
			return getToken(SlimeParser.CO_L_O, i);
		}
		public ListVariContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listVari; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterListVari(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitListVari(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitListVari(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListVariContext listVari() throws RecognitionException {
		ListVariContext _localctx = new ListVariContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_listVari);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(353);
					vari();
					setState(354);
					_la = _input.LA(1);
					if ( !(_la==CO_B_O || _la==CO_O_O || _la==CO_L_O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(361);
			vari();
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

	public static class VariContext extends ParserRuleContext {
		public VariPathContext variPath() {
			return getRuleContext(VariPathContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TempContext temp() {
			return getRuleContext(TempContext.class,0);
		}
		public SpecContext spec() {
			return getRuleContext(SpecContext.class,0);
		}
		public SlotContext slot() {
			return getRuleContext(SlotContext.class,0);
		}
		public RefeContext refe() {
			return getRuleContext(RefeContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public VariContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vari; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterVari(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitVari(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitVari(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariContext vari() throws RecognitionException {
		VariContext _localctx = new VariContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_vari);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_B_O:
			case INTE_B_O:
			case NAME_O_O:
			case INTE_O_O:
			case NAME_L_O:
			case INTE_L_O:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				variPath();
				}
				break;
			case OB_DECL:
			case OLB_DECL:
			case LB_DECL:
			case OB_DECL_B_O:
			case OLB_DECL_B_O:
			case LB_DECL_B_O:
			case OB_DECL_O_O:
			case OLB_DECL_O_O:
			case LB_DECL_O_O:
			case OB_DECL_L_O:
			case OLB_DECL_L_O:
			case LB_DECL_L_O:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				decl();
				}
				break;
			case OB_TEMP:
			case OLB_TEMP:
			case LB_TEMP:
			case OB_TEMP_B_O:
			case OLB_TEMP_B_O:
			case LB_TEMP_B_O:
			case OB_TEMP_O_O:
			case OLB_TEMP_O_O:
			case LB_TEMP_O_O:
			case OB_TEMP_L_O:
			case OLB_TEMP_L_O:
			case LB_TEMP_L_O:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				temp();
				}
				break;
			case OB_SPEC:
			case OLB_SPEC:
			case LB_SPEC:
			case OB_SPEC_B_O:
			case OLB_SPEC_B_O:
			case LB_SPEC_B_O:
			case OB_SPEC_O_O:
			case OLB_SPEC_O_O:
			case LB_SPEC_O_O:
			case OB_SPEC_L_O:
			case OLB_SPEC_L_O:
			case LB_SPEC_L_O:
			case OB_SPEC_B_T:
			case OLB_SPEC_B_T:
			case LB_SPEC_B_T:
			case OB_SPEC_O_T:
			case OLB_SPEC_O_T:
			case LB_SPEC_O_T:
			case OB_SPEC_L_T:
			case OLB_SPEC_L_T:
			case LB_SPEC_L_T:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				spec();
				}
				break;
			case OB_SLOT:
			case OLB_SLOT:
			case LB_SLOT:
			case OB_SLOT_B_O:
			case OLB_SLOT_B_O:
			case LB_SLOT_B_O:
			case OB_SLOT_O_O:
			case OLB_SLOT_O_O:
			case LB_SLOT_O_O:
			case OB_SLOT_L_O:
			case OLB_SLOT_L_O:
			case LB_SLOT_L_O:
			case OB_SLOT_B_T:
			case OLB_SLOT_B_T:
			case LB_SLOT_B_T:
			case OB_SLOT_O_T:
			case OLB_SLOT_O_T:
			case LB_SLOT_O_T:
			case OB_SLOT_L_T:
			case OLB_SLOT_L_T:
			case LB_SLOT_L_T:
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				slot();
				}
				break;
			case OB_REFE:
			case OLB_REFE:
			case LB_REFE:
			case OB_REFE_B_O:
			case OLB_REFE_B_O:
			case LB_REFE_B_O:
			case OB_REFE_O_O:
			case OLB_REFE_O_O:
			case LB_REFE_O_O:
			case OB_REFE_L_O:
			case OLB_REFE_L_O:
			case LB_REFE_L_O:
				enterOuterAlt(_localctx, 6);
				{
				setState(368);
				refe();
				}
				break;
			case OB_PLUS:
			case OLB_PLUS:
			case LB_PLUS:
			case OB_PLUS_B_O:
			case OLB_PLUS_B_O:
			case LB_PLUS_B_O:
			case OB_PLUS_O_O:
			case OLB_PLUS_O_O:
			case LB_PLUS_O_O:
			case OB_PLUS_L_O:
			case OLB_PLUS_L_O:
			case LB_PLUS_L_O:
				enterOuterAlt(_localctx, 7);
				{
				setState(369);
				plus();
				}
				break;
			case OB_TEXT:
			case OLB_TEXT:
			case LB_TEXT:
			case OB_TEXT_B_O:
			case OLB_TEXT_B_O:
			case LB_TEXT_B_O:
			case OB_TEXT_O_O:
			case OLB_TEXT_O_O:
			case LB_TEXT_O_O:
			case OB_TEXT_L_O:
			case OLB_TEXT_L_O:
			case LB_TEXT_L_O:
			case OB_TEXT_B_T:
			case OLB_TEXT_B_T:
			case LB_TEXT_B_T:
			case OB_TEXT_O_T:
			case OLB_TEXT_O_T:
			case LB_TEXT_O_T:
			case OB_TEXT_L_T:
			case OLB_TEXT_L_T:
			case LB_TEXT_L_T:
				enterOuterAlt(_localctx, 8);
				{
				setState(370);
				text();
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

	public static class ListNameContext extends ParserRuleContext {
		public List<TerminalNode> NAME_B_O() { return getTokens(SlimeParser.NAME_B_O); }
		public TerminalNode NAME_B_O(int i) {
			return getToken(SlimeParser.NAME_B_O, i);
		}
		public List<TerminalNode> NAME_O_O() { return getTokens(SlimeParser.NAME_O_O); }
		public TerminalNode NAME_O_O(int i) {
			return getToken(SlimeParser.NAME_O_O, i);
		}
		public List<TerminalNode> NAME_L_O() { return getTokens(SlimeParser.NAME_L_O); }
		public TerminalNode NAME_L_O(int i) {
			return getToken(SlimeParser.NAME_L_O, i);
		}
		public List<TerminalNode> CO_B_O() { return getTokens(SlimeParser.CO_B_O); }
		public TerminalNode CO_B_O(int i) {
			return getToken(SlimeParser.CO_B_O, i);
		}
		public List<TerminalNode> CO_O_O() { return getTokens(SlimeParser.CO_O_O); }
		public TerminalNode CO_O_O(int i) {
			return getToken(SlimeParser.CO_O_O, i);
		}
		public List<TerminalNode> CO_L_O() { return getTokens(SlimeParser.CO_L_O); }
		public TerminalNode CO_L_O(int i) {
			return getToken(SlimeParser.CO_L_O, i);
		}
		public ListNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterListName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitListName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitListName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListNameContext listName() throws RecognitionException {
		ListNameContext _localctx = new ListNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_listName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(379);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME_B_O:
						{
						setState(373);
						match(NAME_B_O);
						setState(374);
						match(CO_B_O);
						}
						break;
					case NAME_O_O:
						{
						setState(375);
						match(NAME_O_O);
						setState(376);
						match(CO_O_O);
						}
						break;
					case NAME_L_O:
						{
						setState(377);
						match(NAME_L_O);
						setState(378);
						match(CO_L_O);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(384);
			_la = _input.LA(1);
			if ( !(_la==NAME_B_O || _la==NAME_O_O || _la==NAME_L_O) ) {
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

	public static class VariPathContext extends ParserRuleContext {
		public List<TerminalNode> NAME_B_O() { return getTokens(SlimeParser.NAME_B_O); }
		public TerminalNode NAME_B_O(int i) {
			return getToken(SlimeParser.NAME_B_O, i);
		}
		public List<TerminalNode> NAME_O_O() { return getTokens(SlimeParser.NAME_O_O); }
		public TerminalNode NAME_O_O(int i) {
			return getToken(SlimeParser.NAME_O_O, i);
		}
		public List<TerminalNode> NAME_L_O() { return getTokens(SlimeParser.NAME_L_O); }
		public TerminalNode NAME_L_O(int i) {
			return getToken(SlimeParser.NAME_L_O, i);
		}
		public List<TerminalNode> INTE_B_O() { return getTokens(SlimeParser.INTE_B_O); }
		public TerminalNode INTE_B_O(int i) {
			return getToken(SlimeParser.INTE_B_O, i);
		}
		public List<TerminalNode> INTE_O_O() { return getTokens(SlimeParser.INTE_O_O); }
		public TerminalNode INTE_O_O(int i) {
			return getToken(SlimeParser.INTE_O_O, i);
		}
		public List<TerminalNode> INTE_L_O() { return getTokens(SlimeParser.INTE_L_O); }
		public TerminalNode INTE_L_O(int i) {
			return getToken(SlimeParser.INTE_L_O, i);
		}
		public List<TerminalNode> PE_B_O() { return getTokens(SlimeParser.PE_B_O); }
		public TerminalNode PE_B_O(int i) {
			return getToken(SlimeParser.PE_B_O, i);
		}
		public List<TerminalNode> PE_O_O() { return getTokens(SlimeParser.PE_O_O); }
		public TerminalNode PE_O_O(int i) {
			return getToken(SlimeParser.PE_O_O, i);
		}
		public List<TerminalNode> PE_L_O() { return getTokens(SlimeParser.PE_L_O); }
		public TerminalNode PE_L_O(int i) {
			return getToken(SlimeParser.PE_L_O, i);
		}
		public VariPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterVariPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitVariPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitVariPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariPathContext variPath() throws RecognitionException {
		VariPathContext _localctx = new VariPathContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variPath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(398);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME_B_O:
						{
						setState(386);
						match(NAME_B_O);
						setState(387);
						match(PE_B_O);
						}
						break;
					case NAME_O_O:
						{
						setState(388);
						match(NAME_O_O);
						setState(389);
						match(PE_O_O);
						}
						break;
					case NAME_L_O:
						{
						setState(390);
						match(NAME_L_O);
						setState(391);
						match(PE_L_O);
						}
						break;
					case INTE_B_O:
						{
						setState(392);
						match(INTE_B_O);
						setState(393);
						match(PE_B_O);
						}
						break;
					case INTE_O_O:
						{
						setState(394);
						match(INTE_O_O);
						setState(395);
						match(PE_O_O);
						}
						break;
					case INTE_L_O:
						{
						setState(396);
						match(INTE_L_O);
						setState(397);
						match(PE_L_O);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(403);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (NAME_B_O - 104)) | (1L << (INTE_B_O - 104)) | (1L << (NAME_O_O - 104)) | (1L << (INTE_O_O - 104)))) != 0) || _la==NAME_L_O || _la==INTE_L_O) ) {
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

	public static class TypeNameContext extends ParserRuleContext {
		public List<TerminalNode> NAME_B_O() { return getTokens(SlimeParser.NAME_B_O); }
		public TerminalNode NAME_B_O(int i) {
			return getToken(SlimeParser.NAME_B_O, i);
		}
		public List<TerminalNode> NAME_O_O() { return getTokens(SlimeParser.NAME_O_O); }
		public TerminalNode NAME_O_O(int i) {
			return getToken(SlimeParser.NAME_O_O, i);
		}
		public List<TerminalNode> NAME_L_O() { return getTokens(SlimeParser.NAME_L_O); }
		public TerminalNode NAME_L_O(int i) {
			return getToken(SlimeParser.NAME_L_O, i);
		}
		public List<TerminalNode> NAME_B_R() { return getTokens(SlimeParser.NAME_B_R); }
		public TerminalNode NAME_B_R(int i) {
			return getToken(SlimeParser.NAME_B_R, i);
		}
		public List<TerminalNode> NAME_O_R() { return getTokens(SlimeParser.NAME_O_R); }
		public TerminalNode NAME_O_R(int i) {
			return getToken(SlimeParser.NAME_O_R, i);
		}
		public List<TerminalNode> NAME_L_R() { return getTokens(SlimeParser.NAME_L_R); }
		public TerminalNode NAME_L_R(int i) {
			return getToken(SlimeParser.NAME_L_R, i);
		}
		public List<TerminalNode> CL_B_O() { return getTokens(SlimeParser.CL_B_O); }
		public TerminalNode CL_B_O(int i) {
			return getToken(SlimeParser.CL_B_O, i);
		}
		public List<TerminalNode> CL_O_O() { return getTokens(SlimeParser.CL_O_O); }
		public TerminalNode CL_O_O(int i) {
			return getToken(SlimeParser.CL_O_O, i);
		}
		public List<TerminalNode> CL_L_O() { return getTokens(SlimeParser.CL_L_O); }
		public TerminalNode CL_L_O(int i) {
			return getToken(SlimeParser.CL_L_O, i);
		}
		public List<TerminalNode> CL_L_R() { return getTokens(SlimeParser.CL_L_R); }
		public TerminalNode CL_L_R(int i) {
			return getToken(SlimeParser.CL_L_R, i);
		}
		public List<TerminalNode> CL_O_R() { return getTokens(SlimeParser.CL_O_R); }
		public TerminalNode CL_O_R(int i) {
			return getToken(SlimeParser.CL_O_R, i);
		}
		public List<TerminalNode> CL_B_R() { return getTokens(SlimeParser.CL_B_R); }
		public TerminalNode CL_B_R(int i) {
			return getToken(SlimeParser.CL_B_R, i);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(417);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME_B_O:
						{
						setState(405);
						match(NAME_B_O);
						setState(406);
						match(CL_B_O);
						}
						break;
					case NAME_O_O:
						{
						setState(407);
						match(NAME_O_O);
						setState(408);
						match(CL_O_O);
						}
						break;
					case NAME_L_O:
						{
						setState(409);
						match(NAME_L_O);
						setState(410);
						match(CL_L_O);
						}
						break;
					case NAME_L_R:
						{
						setState(411);
						match(NAME_L_R);
						setState(412);
						match(CL_L_R);
						}
						break;
					case NAME_O_R:
						{
						setState(413);
						match(NAME_O_R);
						setState(414);
						match(CL_O_R);
						}
						break;
					case NAME_B_R:
						{
						setState(415);
						match(NAME_B_R);
						setState(416);
						match(CL_B_R);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(422);
			_la = _input.LA(1);
			if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (NAME_B_R - 50)) | (1L << (NAME_O_R - 50)) | (1L << (NAME_L_R - 50)) | (1L << (NAME_B_O - 50)))) != 0) || _la==NAME_O_O || _la==NAME_L_O) ) {
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

	public static class TextOutorContext extends ParserRuleContext {
		public TerminalNode TEXT_OUTOR() { return getToken(SlimeParser.TEXT_OUTOR, 0); }
		public TextOutorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textOutor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTextOutor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTextOutor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTextOutor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextOutorContext textOutor() throws RecognitionException {
		TextOutorContext _localctx = new TextOutorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_textOutor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(TEXT_OUTOR);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00e3\u01ad\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2u\n\2\f\2\16\2"+
		"x\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00a5\n\21"+
		"\f\21\16\21\u00a8\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\7\24\u00b5\n\24\f\24\16\24\u00b8\13\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\6\25\u00c1\n\25\r\25\16\25\u00c2\3\26\3\26\3\27\3\27\7\27"+
		"\u00c9\n\27\f\27\16\27\u00cc\13\27\3\27\3\27\3\27\5\27\u00d1\n\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\7\32\u00dc\n\32\f\32\16\32\u00df"+
		"\13\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u00e7\n\33\5\33\u00e9\n\33\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\7\37\u00f6\n\37"+
		"\f\37\16\37\u00f9\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \7 \u0104\n \f "+
		"\16 \u0107\13 \3 \5 \u010a\n \3!\3!\3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3"+
		"%\3%\5%\u011a\n%\3%\3%\7%\u011e\n%\f%\16%\u0121\13%\3%\3%\5%\u0125\n%"+
		"\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3)\5)\u0130\n)\3)\3)\3)\3)\3*\3*\3*\7*\u0139"+
		"\n*\f*\16*\u013c\13*\3*\3*\3+\3+\3+\3+\3+\3+\7+\u0146\n+\f+\16+\u0149"+
		"\13+\3+\3+\3+\3+\7+\u014f\n+\f+\16+\u0152\13+\3+\5+\u0155\n+\3+\5+\u0158"+
		"\n+\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\7/\u0167\n/\f/\16/\u016a\13"+
		"/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0176\n\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\7\61\u017e\n\61\f\61\16\61\u0181\13\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0191"+
		"\n\62\f\62\16\62\u0194\13\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\7\63\u01a4\n\63\f\63\16\63\u01a7\13\63\3"+
		"\63\3\63\3\64\3\64\3\64\2\2\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2 \27\2\f\f\25\25\36\36"+
		"OOXXaavv\177\177\u0088\u0088\u009c\u009c\u00a5\u00a5\u00ae\u00ae\u00c4"+
		"\u00c4\u00c7\u00c7\u00ca\u00ca\u00d0\u00d0\u00d3\u00d3\u00d6\u00d6\u00dc"+
		"\u00dc\u00df\u00df\u00e2\u00e2\5\2\u00ba\u00ba\u00bc\u00bc\u00be\u00be"+
		"\5\2\u00b9\u00b9\u00bb\u00bb\u00bd\u00bd\16\2\7\7\20\20\31\31JJSS\\\\"+
		"qqzz\u0083\u0083\u0097\u0097\u00a0\u00a0\u00a9\u00a9\5\2\65\65;;AA\5\2"+
		"\62\6288>>\27\2\5\5\16\16\27\27HHQQZZooxx\u0081\u0081\u0095\u0095\u009e"+
		"\u009e\u00a7\u00a7\u00c2\u00c2\u00c5\u00c5\u00c8\u00c8\u00ce\u00ce\u00d1"+
		"\u00d1\u00d4\u00d4\u00da\u00da\u00dd\u00dd\u00e0\u00e0\5\2##))--\27\2"+
		"\6\6\17\17\30\30IIRR[[ppyy\u0082\u0082\u0096\u0096\u009f\u009f\u00a8\u00a8"+
		"\u00c3\u00c3\u00c6\u00c6\u00c9\u00c9\u00cf\u00cf\u00d2\u00d2\u00d5\u00d5"+
		"\u00db\u00db\u00de\u00de\u00e1\u00e1\5\2$$))--\5\2%%**..\16\2\r\r\26\26"+
		"\37\37PPYYbbww\u0080\u0080\u0089\u0089\u009d\u009d\u00a6\u00a6\u00af\u00af"+
		"\5\2\u00cb\u00cb\u00d7\u00d7\u00e3\u00e3\5\2\u00bf\u00bf\u00cc\u00cc\u00d8"+
		"\u00d8\16\2\b\b\21\21\32\32KKTT]]rr{{\u0084\u0084\u0098\u0098\u00a1\u00a1"+
		"\u00aa\u00aa\5\2ii\u0090\u0090\u00b6\u00b6\5\2gg\u008e\u008e\u00b4\u00b4"+
		"\5\2DDnn\u0094\u0094\16\2\t\t\22\22\33\33LLUU^^ss||\u0085\u0085\u0099"+
		"\u0099\u00a2\u00a2\u00ab\u00ab\5\2ee\u008c\u008c\u00b2\u00b2\5\2hh\u008f"+
		"\u008f\u00b5\u00b5\5\2EEnn\u0094\u0094\16\2\13\13\24\24\35\35NNWW``uu"+
		"~~\u0087\u0087\u009b\u009b\u00a4\u00a4\u00ad\u00ad\5\2GGnn\u0094\u0094"+
		"\16\2\n\n\23\23\34\34MMVV__tt}}\u0086\u0086\u009a\u009a\u00a3\u00a3\u00ac"+
		"\u00ac\5\2dd\u008b\u008b\u00b1\u00b1\5\2FFnn\u0094\u0094\5\2jj\u0091\u0091"+
		"\u00b7\u00b7\5\2jk\u0091\u0092\u00b7\u00b8\b\2\64\64::@@jj\u0091\u0091"+
		"\u00b7\u00b7\2\u01b9\2v\3\2\2\2\4y\3\2\2\2\6}\3\2\2\2\b\177\3\2\2\2\n"+
		"\u0081\3\2\2\2\f\u0083\3\2\2\2\16\u0087\3\2\2\2\20\u0089\3\2\2\2\22\u008c"+
		"\3\2\2\2\24\u008e\3\2\2\2\26\u0092\3\2\2\2\30\u0094\3\2\2\2\32\u0096\3"+
		"\2\2\2\34\u009a\3\2\2\2\36\u009c\3\2\2\2 \u00a6\3\2\2\2\"\u00ab\3\2\2"+
		"\2$\u00af\3\2\2\2&\u00b6\3\2\2\2(\u00c0\3\2\2\2*\u00c4\3\2\2\2,\u00d0"+
		"\3\2\2\2.\u00d2\3\2\2\2\60\u00d6\3\2\2\2\62\u00dd\3\2\2\2\64\u00e2\3\2"+
		"\2\2\66\u00ea\3\2\2\28\u00ec\3\2\2\2:\u00f0\3\2\2\2<\u00f7\3\2\2\2>\u00fc"+
		"\3\2\2\2@\u010b\3\2\2\2B\u010f\3\2\2\2D\u0111\3\2\2\2F\u0115\3\2\2\2H"+
		"\u011f\3\2\2\2J\u0126\3\2\2\2L\u0128\3\2\2\2N\u012c\3\2\2\2P\u012f\3\2"+
		"\2\2R\u013a\3\2\2\2T\u0157\3\2\2\2V\u0159\3\2\2\2X\u015b\3\2\2\2Z\u015f"+
		"\3\2\2\2\\\u0168\3\2\2\2^\u0175\3\2\2\2`\u017f\3\2\2\2b\u0192\3\2\2\2"+
		"d\u01a5\3\2\2\2f\u01aa\3\2\2\2hu\5\4\3\2iu\5\f\7\2ju\5\24\13\2ku\5\32"+
		"\16\2lu\5\"\22\2mu\5D#\2nu\5.\30\2ou\58\35\2pu\5L\'\2qu\5D#\2ru\5\f\7"+
		"\2su\5f\64\2th\3\2\2\2ti\3\2\2\2tj\3\2\2\2tk\3\2\2\2tl\3\2\2\2tm\3\2\2"+
		"\2tn\3\2\2\2to\3\2\2\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2ux\3\2\2"+
		"\2vt\3\2\2\2vw\3\2\2\2w\3\3\2\2\2xv\3\2\2\2yz\5\6\4\2z{\5\b\5\2{|\5\n"+
		"\6\2|\5\3\2\2\2}~\t\2\2\2~\7\3\2\2\2\177\u0080\t\3\2\2\u0080\t\3\2\2\2"+
		"\u0081\u0082\t\4\2\2\u0082\13\3\2\2\2\u0083\u0084\5\16\b\2\u0084\u0085"+
		"\5\20\t\2\u0085\u0086\5\22\n\2\u0086\r\3\2\2\2\u0087\u0088\t\5\2\2\u0088"+
		"\17\3\2\2\2\u0089\u008a\5d\63\2\u008a\u008b\t\6\2\2\u008b\21\3\2\2\2\u008c"+
		"\u008d\t\7\2\2\u008d\23\3\2\2\2\u008e\u008f\5\26\f\2\u008f\u0090\5 \21"+
		"\2\u0090\u0091\5\30\r\2\u0091\25\3\2\2\2\u0092\u0093\t\b\2\2\u0093\27"+
		"\3\2\2\2\u0094\u0095\t\t\2\2\u0095\31\3\2\2\2\u0096\u0097\5\34\17\2\u0097"+
		"\u0098\5 \21\2\u0098\u0099\5\36\20\2\u0099\33\3\2\2\2\u009a\u009b\t\n"+
		"\2\2\u009b\35\3\2\2\2\u009c\u009d\t\13\2\2\u009d\37\3\2\2\2\u009e\u009f"+
		"\7%\2\2\u009f\u00a5\7&\2\2\u00a0\u00a1\7*\2\2\u00a1\u00a5\7+\2\2\u00a2"+
		"\u00a3\7.\2\2\u00a3\u00a5\7/\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a0\3\2\2"+
		"\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\t\f\2\2\u00aa"+
		"!\3\2\2\2\u00ab\u00ac\5$\23\2\u00ac\u00ad\5&\24\2\u00ad\u00ae\5*\26\2"+
		"\u00ae#\3\2\2\2\u00af\u00b0\t\r\2\2\u00b0%\3\2\2\2\u00b1\u00b2\5(\25\2"+
		"\u00b2\u00b3\t\16\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00ba\5(\25\2\u00ba\'\3\2\2\2\u00bb\u00c1\5\4\3\2"+
		"\u00bc\u00c1\5\24\13\2\u00bd\u00c1\5\32\16\2\u00be\u00c1\5,\27\2\u00bf"+
		"\u00c1\7\u00c1\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00bd"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3)\3\2\2\2\u00c4\u00c5\t\17\2\2"+
		"\u00c5+\3\2\2\2\u00c6\u00c7\7\u00c0\2\2\u00c7\u00c9\7\u00c1\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d1\7\u00c0\2\2\u00ce"+
		"\u00d1\7\u00cd\2\2\u00cf\u00d1\7\u00d9\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1-\3\2\2\2\u00d2\u00d3\5\60\31\2\u00d3"+
		"\u00d4\5\62\32\2\u00d4\u00d5\5\66\34\2\u00d5/\3\2\2\2\u00d6\u00d7\t\20"+
		"\2\2\u00d7\61\3\2\2\2\u00d8\u00d9\5\64\33\2\u00d9\u00da\t\21\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e1\5\64\33\2\u00e1\63\3\2\2\2\u00e2\u00e8\5^\60\2\u00e3\u00e6\t\22"+
		"\2\2\u00e4\u00e7\5\"\22\2\u00e5\u00e7\5\32\16\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\65\3\2\2\2\u00ea\u00eb\t\23\2\2\u00eb\67\3\2\2\2\u00ec\u00ed"+
		"\5:\36\2\u00ed\u00ee\5<\37\2\u00ee\u00ef\5B\"\2\u00ef9\3\2\2\2\u00f0\u00f1"+
		"\t\24\2\2\u00f1;\3\2\2\2\u00f2\u00f3\5> \2\u00f3\u00f4\t\21\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fb\5> \2\u00fb=\3\2\2\2\u00fc\u00fd\5^\60\2\u00fd\u00fe\t\25\2\2\u00fe"+
		"\u0109\5^\60\2\u00ff\u0105\t\22\2\2\u0100\u0101\5@!\2\u0101\u0102\t\26"+
		"\2\2\u0102\u0104\3\2\2\2\u0103\u0100\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u010a\5@!\2\u0109\u00ff\3\2\2\2\u0109\u010a\3\2\2\2\u010a?"+
		"\3\2\2\2\u010b\u010c\5b\62\2\u010c\u010d\t\25\2\2\u010d\u010e\5b\62\2"+
		"\u010eA\3\2\2\2\u010f\u0110\t\27\2\2\u0110C\3\2\2\2\u0111\u0112\5F$\2"+
		"\u0112\u0113\5H%\2\u0113\u0114\5J&\2\u0114E\3\2\2\2\u0115\u0116\t\30\2"+
		"\2\u0116G\3\2\2\2\u0117\u011a\5b\62\2\u0118\u011a\5\f\7\2\u0119\u0117"+
		"\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\t\21\2\2"+
		"\u011c\u011e\3\2\2\2\u011d\u0119\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0124\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0125\5b\62\2\u0123\u0125\5\f\7\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2"+
		"\2\2\u0125I\3\2\2\2\u0126\u0127\t\31\2\2\u0127K\3\2\2\2\u0128\u0129\5"+
		"N(\2\u0129\u012a\5R*\2\u012a\u012b\5V,\2\u012bM\3\2\2\2\u012c\u012d\t"+
		"\32\2\2\u012dO\3\2\2\2\u012e\u0130\5`\61\2\u012f\u012e\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\t\22\2\2\u0132\u0133\5d\63\2"+
		"\u0133\u0134\t\33\2\2\u0134Q\3\2\2\2\u0135\u0136\5T+\2\u0136\u0137\t\21"+
		"\2\2\u0137\u0139\3\2\2\2\u0138\u0135\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013d\u013e\5T+\2\u013eS\3\2\2\2\u013f\u0154\5P)\2\u0140\u0155\5"+
		"`\61\2\u0141\u0155\5\\/\2\u0142\u0143\5Z.\2\u0143\u0144\t\26\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u0142\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u0155\5Z.\2\u014b\u014c\5X-\2\u014c\u014d\t\26\2\2\u014d\u014f\3\2\2"+
		"\2\u014e\u014b\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0155\5X-\2\u0154"+
		"\u0140\3\2\2\2\u0154\u0141\3\2\2\2\u0154\u0147\3\2\2\2\u0154\u0150\3\2"+
		"\2\2\u0155\u0158\3\2\2\2\u0156\u0158\5^\60\2\u0157\u013f\3\2\2\2\u0157"+
		"\u0156\3\2\2\2\u0158U\3\2\2\2\u0159\u015a\t\34\2\2\u015aW\3\2\2\2\u015b"+
		"\u015c\5`\61\2\u015c\u015d\t\33\2\2\u015d\u015e\5\\/\2\u015eY\3\2\2\2"+
		"\u015f\u0160\5`\61\2\u0160\u0161\t\22\2\2\u0161\u0162\5d\63\2\u0162[\3"+
		"\2\2\2\u0163\u0164\5^\60\2\u0164\u0165\t\26\2\2\u0165\u0167\3\2\2\2\u0166"+
		"\u0163\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\5^\60\2\u016c"+
		"]\3\2\2\2\u016d\u0176\5b\62\2\u016e\u0176\5L\'\2\u016f\u0176\5\"\22\2"+
		"\u0170\u0176\5\32\16\2\u0171\u0176\5\24\13\2\u0172\u0176\5\f\7\2\u0173"+
		"\u0176\58\35\2\u0174\u0176\5\4\3\2\u0175\u016d\3\2\2\2\u0175\u016e\3\2"+
		"\2\2\u0175\u016f\3\2\2\2\u0175\u0170\3\2\2\2\u0175\u0171\3\2\2\2\u0175"+
		"\u0172\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176_\3\2\2\2"+
		"\u0177\u0178\7j\2\2\u0178\u017e\7h\2\2\u0179\u017a\7\u0091\2\2\u017a\u017e"+
		"\7\u008f\2\2\u017b\u017c\7\u00b7\2\2\u017c\u017e\7\u00b5\2\2\u017d\u0177"+
		"\3\2\2\2\u017d\u0179\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0182\u0183\t\35\2\2\u0183a\3\2\2\2\u0184\u0185\7j\2\2\u0185\u0191"+
		"\7f\2\2\u0186\u0187\7\u0091\2\2\u0187\u0191\7\u008d\2\2\u0188\u0189\7"+
		"\u00b7\2\2\u0189\u0191\7\u00b3\2\2\u018a\u018b\7k\2\2\u018b\u0191\7f\2"+
		"\2\u018c\u018d\7\u0092\2\2\u018d\u0191\7\u008d\2\2\u018e\u018f\7\u00b8"+
		"\2\2\u018f\u0191\7\u00b3\2\2\u0190\u0184\3\2\2\2\u0190\u0186\3\2\2\2\u0190"+
		"\u0188\3\2\2\2\u0190\u018a\3\2\2\2\u0190\u018c\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\t\36\2\2\u0196c\3\2\2\2"+
		"\u0197\u0198\7j\2\2\u0198\u01a4\7g\2\2\u0199\u019a\7\u0091\2\2\u019a\u01a4"+
		"\7\u008e\2\2\u019b\u019c\7\u00b7\2\2\u019c\u01a4\7\u00b4\2\2\u019d\u019e"+
		"\7@\2\2\u019e\u01a4\7?\2\2\u019f\u01a0\7:\2\2\u01a0\u01a4\79\2\2\u01a1"+
		"\u01a2\7\64\2\2\u01a2\u01a4\7\63\2\2\u01a3\u0197\3\2\2\2\u01a3\u0199\3"+
		"\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\t\37\2\2\u01a9"+
		"e\3\2\2\2\u01aa\u01ab\7 \2\2\u01abg\3\2\2\2\"tv\u00a4\u00a6\u00b6\u00c0"+
		"\u00c2\u00ca\u00d0\u00dd\u00e6\u00e8\u00f7\u0105\u0109\u0119\u011f\u0124"+
		"\u012f\u013a\u0147\u0150\u0154\u0157\u0168\u0175\u017d\u017f\u0190\u0192"+
		"\u01a3\u01a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}