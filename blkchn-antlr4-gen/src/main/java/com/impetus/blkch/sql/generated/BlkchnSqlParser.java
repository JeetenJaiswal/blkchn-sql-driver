// Generated from BlkchnSql.g4 by ANTLR 4.5
package com.impetus.blkch.sql.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BlkchnSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SELECT=8, FROM=9, 
		ADD=10, AS=11, ALL=12, DISTINCT=13, WHERE=14, GROUP=15, BY=16, GROUPING=17, 
		SETS=18, CUBE=19, ROLLUP=20, ORDER=21, HAVING=22, LIMIT=23, AT=24, OR=25, 
		AND=26, IN=27, NOT=28, NO=29, EXISTS=30, BETWEEN=31, LIKE=32, RLIKE=33, 
		IS=34, NULL=35, TRUE=36, FALSE=37, NULLS=38, ASC=39, DESC=40, FOR=41, 
		INTERVAL=42, CASE=43, WHEN=44, THEN=45, ELSE=46, END=47, JOIN=48, CROSS=49, 
		OUTER=50, INNER=51, LEFT=52, SEMI=53, RIGHT=54, FULL=55, NATURAL=56, ON=57, 
		FIRST=58, AFTER=59, LAST=60, VALUES=61, CREATE=62, TABLE=63, VIEW=64, 
		REPLACE=65, INSERT=66, DELETE=67, INTO=68, DESCRIBE=69, EXPLAIN=70, CAST=71, 
		SHOW=72, TABLES=73, COLUMNS=74, COLUMN=75, USE=76, FUNCTIONS=77, DROP=78, 
		UNION=79, EXCEPT=80, SETMINUS=81, INTERSECT=82, TO=83, ALTER=84, RENAME=85, 
		ARRAY=86, MAP=87, STRUCT=88, COMMENT=89, SET=90, RESET=91, COMMIT=92, 
		ROLLBACK=93, IGNORE=94, CALL=95, WITH=96, VERSION=97, ENDORSERS=98, ARGS=99, 
		ASSET=100, CHAINCODE=101, SMARTCONTRACT=102, STORAGE=103, TYPE=104, JSON=105, 
		CSV=106, FIELDS=107, RECORDS=108, DELIMITED=109, UPGRADE=110, IF=111, 
		EQ=112, NSEQ=113, NEQ=114, NEQJ=115, LT=116, LTE=117, GT=118, GTE=119, 
		PLUS=120, MINUS=121, ASTERISK=122, SLASH=123, PERCENT=124, DIV=125, TILDE=126, 
		AMPERSAND=127, PIPE=128, HAT=129, PERCENTLIT=130, OUT=131, OF=132, FUNCTION=133, 
		DATABASE=134, DATABASES=135, TRUNCATE=136, ANALYZE=137, COMPUTE=138, LIST=139, 
		REVOKE=140, GRANT=141, EXPORT=142, IMPORT=143, LOAD=144, ROLE=145, ROLES=146, 
		INDEX=147, INDEXES=148, CURRENT_DATE=149, CURRENT_TIMESTAMP=150, STRING=151, 
		BIGINT_LITERAL=152, SMALLINT_LITERAL=153, TINYINT_LITERAL=154, BYTELENGTH_LITERAL=155, 
		INTEGER_VALUE=156, DECIMAL_VALUE=157, DOUBLE_LITERAL=158, BIGDECIMAL_LITERAL=159, 
		IDENTIFIER=160, ENDORSER=161, BACKQUOTED_IDENTIFIER=162, SIMPLE_COMMENT=163, 
		BRACKETED_EMPTY_COMMENT=164, BRACKETED_COMMENT=165, WS=166, UNRECOGNIZED=167, 
		DELIMITER=168;
	public static final int
		RULE_singleStatement = 0, RULE_statement = 1, RULE_insertInto = 2, RULE_columnNames = 3, 
		RULE_columnValues = 4, RULE_constantSeq = 5, RULE_createFunction = 6, 
		RULE_upgradeFunction = 7, RULE_createAsset = 8, RULE_asset = 9, RULE_storageType = 10, 
		RULE_fieldDelimiter = 11, RULE_recordDelimiter = 12, RULE_deleteFunction = 13, 
		RULE_dropAsset = 14, RULE_className = 15, RULE_version = 16, RULE_endorsers = 17, 
		RULE_endorserDetails = 18, RULE_args = 19, RULE_argParamSeq = 20, RULE_argParam = 21, 
		RULE_callFunction = 22, RULE_parameterValues = 23, RULE_query = 24, RULE_queryOrganization = 25, 
		RULE_orderByClause = 26, RULE_limitClause = 27, RULE_queryTerm = 28, RULE_queryPrimary = 29, 
		RULE_sortItem = 30, RULE_querySpecification = 31, RULE_selectClause = 32, 
		RULE_whereClause = 33, RULE_havingClause = 34, RULE_fromClause = 35, RULE_groupByClause = 36, 
		RULE_setQuantifier = 37, RULE_relation = 38, RULE_joinRelation = 39, RULE_joinType = 40, 
		RULE_joinCriteria = 41, RULE_identifierList = 42, RULE_identifierSeq = 43, 
		RULE_relationPrimary = 44, RULE_inlineTable = 45, RULE_tableIdentifier = 46, 
		RULE_namedExpression = 47, RULE_namedExpressionSeq = 48, RULE_expression = 49, 
		RULE_booleanExpression = 50, RULE_predicated = 51, RULE_predicate = 52, 
		RULE_valueExpression = 53, RULE_primaryExpression = 54, RULE_constant = 55, 
		RULE_comparisonOperator = 56, RULE_arithmeticOperator = 57, RULE_predicateOperator = 58, 
		RULE_booleanValue = 59, RULE_interval = 60, RULE_intervalField = 61, RULE_intervalValue = 62, 
		RULE_dataType = 63, RULE_colTypeList = 64, RULE_colType = 65, RULE_complexColTypeList = 66, 
		RULE_complexColType = 67, RULE_whenClause = 68, RULE_qualifiedName = 69, 
		RULE_identifier = 70, RULE_strictIdentifier = 71, RULE_quotedIdentifier = 72, 
		RULE_number = 73, RULE_nonReserved = 74;
	public static final String[] ruleNames = {
		"singleStatement", "statement", "insertInto", "columnNames", "columnValues", 
		"constantSeq", "createFunction", "upgradeFunction", "createAsset", "asset", 
		"storageType", "fieldDelimiter", "recordDelimiter", "deleteFunction", 
		"dropAsset", "className", "version", "endorsers", "endorserDetails", "args", 
		"argParamSeq", "argParam", "callFunction", "parameterValues", "query", 
		"queryOrganization", "orderByClause", "limitClause", "queryTerm", "queryPrimary", 
		"sortItem", "querySpecification", "selectClause", "whereClause", "havingClause", 
		"fromClause", "groupByClause", "setQuantifier", "relation", "joinRelation", 
		"joinType", "joinCriteria", "identifierList", "identifierSeq", "relationPrimary", 
		"inlineTable", "tableIdentifier", "namedExpression", "namedExpressionSeq", 
		"expression", "booleanExpression", "predicated", "predicate", "valueExpression", 
		"primaryExpression", "constant", "comparisonOperator", "arithmeticOperator", 
		"predicateOperator", "booleanValue", "interval", "intervalField", "intervalValue", 
		"dataType", "colTypeList", "colType", "complexColTypeList", "complexColType", 
		"whenClause", "qualifiedName", "identifier", "strictIdentifier", "quotedIdentifier", 
		"number", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'.'", "'['", "']'", "':'", "'SELECT'", "'FROM'", 
		"'ADD'", "'AS'", "'ALL'", "'DISTINCT'", "'WHERE'", "'GROUP'", "'BY'", 
		"'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", "'HAVING'", "'LIMIT'", 
		"'AT'", "'OR'", "'AND'", "'IN'", null, "'NO'", "'EXISTS'", "'BETWEEN'", 
		"'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", "'FALSE'", "'NULLS'", "'ASC'", 
		"'DESC'", "'FOR'", "'INTERVAL'", "'CASE'", "'WHEN'", "'THEN'", "'ELSE'", 
		"'END'", "'JOIN'", "'CROSS'", "'OUTER'", "'INNER'", "'LEFT'", "'SEMI'", 
		"'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", "'FIRST'", "'AFTER'", "'LAST'", 
		"'VALUES'", "'CREATE'", "'TABLE'", "'VIEW'", "'REPLACE'", "'INSERT'", 
		"'DELETE'", "'INTO'", "'DESCRIBE'", "'EXPLAIN'", "'CAST'", "'SHOW'", "'TABLES'", 
		"'COLUMNS'", "'COLUMN'", "'USE'", "'FUNCTIONS'", "'DROP'", "'UNION'", 
		"'EXCEPT'", "'MINUS'", "'INTERSECT'", "'TO'", "'ALTER'", "'RENAME'", "'ARRAY'", 
		"'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", "'RESET'", "'COMMIT'", "'ROLLBACK'", 
		"'IGNORE'", "'CALL'", "'WITH'", "'VERSION'", "'ENDORSERS'", "'ARGS'", 
		"'ASSET'", "'CHAINCODE'", "'SMARTCONTRACT'", "'STORAGE'", "'TYPE'", "'JSON'", 
		"'CSV'", "'FIELDS'", "'RECORDS'", "'DELIMITED'", "'UPGRADE'", "'IF'", 
		null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", "'^'", "'PERCENT'", 
		"'OUT'", "'OF'", "'FUNCTION'", null, null, "'TRUNCATE'", "'ANALYZE'", 
		"'COMPUTE'", "'LIST'", "'REVOKE'", "'GRANT'", "'EXPORT'", "'IMPORT'", 
		"'LOAD'", "'ROLE'", "'ROLES'", "'INDEX'", "'INDEXES'", "'CURRENT_DATE'", 
		"'CURRENT_TIMESTAMP'", null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "SELECT", "FROM", "ADD", 
		"AS", "ALL", "DISTINCT", "WHERE", "GROUP", "BY", "GROUPING", "SETS", "CUBE", 
		"ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", "OR", "AND", "IN", "NOT", 
		"NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", "IS", "NULL", "TRUE", "FALSE", 
		"NULLS", "ASC", "DESC", "FOR", "INTERVAL", "CASE", "WHEN", "THEN", "ELSE", 
		"END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", "SEMI", "RIGHT", "FULL", 
		"NATURAL", "ON", "FIRST", "AFTER", "LAST", "VALUES", "CREATE", "TABLE", 
		"VIEW", "REPLACE", "INSERT", "DELETE", "INTO", "DESCRIBE", "EXPLAIN", 
		"CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", "FUNCTIONS", "DROP", 
		"UNION", "EXCEPT", "SETMINUS", "INTERSECT", "TO", "ALTER", "RENAME", "ARRAY", 
		"MAP", "STRUCT", "COMMENT", "SET", "RESET", "COMMIT", "ROLLBACK", "IGNORE", 
		"CALL", "WITH", "VERSION", "ENDORSERS", "ARGS", "ASSET", "CHAINCODE", 
		"SMARTCONTRACT", "STORAGE", "TYPE", "JSON", "CSV", "FIELDS", "RECORDS", 
		"DELIMITED", "UPGRADE", "IF", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", 
		"GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", 
		"AMPERSAND", "PIPE", "HAT", "PERCENTLIT", "OUT", "OF", "FUNCTION", "DATABASE", 
		"DATABASES", "TRUNCATE", "ANALYZE", "COMPUTE", "LIST", "REVOKE", "GRANT", 
		"EXPORT", "IMPORT", "LOAD", "ROLE", "ROLES", "INDEX", "INDEXES", "CURRENT_DATE", 
		"CURRENT_TIMESTAMP", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", 
		"BYTELENGTH_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", 
		"BIGDECIMAL_LITERAL", "IDENTIFIER", "ENDORSER", "BACKQUOTED_IDENTIFIER", 
		"SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", 
		"UNRECOGNIZED", "DELIMITER"
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

	@Override
	public String getGrammarFileName() { return "BlkchnSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is folllowed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	public BlkchnSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BlkchnSqlParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			statement();
			setState(151);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateAssetRuleContext extends StatementContext {
		public CreateAssetContext createAsset() {
			return getRuleContext(CreateAssetContext.class,0);
		}
		public CreateAssetRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCreateAssetRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCreateAssetRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCreateAssetRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropAssetRuleContext extends StatementContext {
		public DropAssetContext dropAsset() {
			return getRuleContext(DropAssetContext.class,0);
		}
		public DropAssetRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDropAssetRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDropAssetRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDropAssetRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionRuleContext extends StatementContext {
		public CreateFunctionContext createFunction() {
			return getRuleContext(CreateFunctionContext.class,0);
		}
		public CreateFunctionRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCreateFunctionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCreateFunctionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCreateFunctionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleInsertContext extends StatementContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSingleInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSingleInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSingleInsert(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallFunctionRuleContext extends StatementContext {
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public CallFunctionRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCallFunctionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCallFunctionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCallFunctionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpgradeFunctionRuleContext extends StatementContext {
		public UpgradeFunctionContext upgradeFunction() {
			return getRuleContext(UpgradeFunctionContext.class,0);
		}
		public UpgradeFunctionRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterUpgradeFunctionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitUpgradeFunctionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitUpgradeFunctionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteFunctionRuleContext extends StatementContext {
		public DeleteFunctionContext deleteFunction() {
			return getRuleContext(DeleteFunctionContext.class,0);
		}
		public DeleteFunctionRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDeleteFunctionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDeleteFunctionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDeleteFunctionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				query();
				}
				break;
			case 2:
				_localctx = new SingleInsertContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				insertInto();
				}
				break;
			case 3:
				_localctx = new CreateFunctionRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				createFunction();
				}
				break;
			case 4:
				_localctx = new CallFunctionRuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				callFunction();
				}
				break;
			case 5:
				_localctx = new CreateAssetRuleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				createAsset();
				}
				break;
			case 6:
				_localctx = new DeleteFunctionRuleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				deleteFunction();
				}
				break;
			case 7:
				_localctx = new DropAssetRuleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				dropAsset();
				}
				break;
			case 8:
				_localctx = new UpgradeFunctionRuleContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				upgradeFunction();
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

	public static class InsertIntoContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(BlkchnSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(BlkchnSqlParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(BlkchnSqlParser.VALUES, 0); }
		public ColumnValuesContext columnValues() {
			return getRuleContext(ColumnValuesContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertInto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(INSERT);
			setState(164);
			match(INTO);
			setState(165);
			tableIdentifier();
			setState(170);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(166);
				match(T__0);
				setState(167);
				columnNames();
				setState(168);
				match(T__1);
				}
			}

			setState(172);
			match(VALUES);
			setState(173);
			match(T__0);
			setState(174);
			columnValues();
			setState(175);
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

	public static class ColumnNamesContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterColumnNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitColumnNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_columnNames);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			identifierSeq();
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

	public static class ColumnValuesContext extends ParserRuleContext {
		public ConstantSeqContext constantSeq() {
			return getRuleContext(ConstantSeqContext.class,0);
		}
		public ColumnValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterColumnValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitColumnValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitColumnValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnValuesContext columnValues() throws RecognitionException {
		ColumnValuesContext _localctx = new ColumnValuesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_columnValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			constantSeq();
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

	public static class ConstantSeqContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterConstantSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitConstantSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitConstantSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantSeqContext constantSeq() throws RecognitionException {
		ConstantSeqContext _localctx = new ConstantSeqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constantSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			constant();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(182);
				match(T__2);
				setState(183);
				constant();
				}
				}
				setState(188);
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

	public static class CreateFunctionContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BlkchnSqlParser.CREATE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(BlkchnSqlParser.FUNCTION, 0); }
		public TerminalNode CHAINCODE() { return getToken(BlkchnSqlParser.CHAINCODE, 0); }
		public TerminalNode SMARTCONTRACT() { return getToken(BlkchnSqlParser.SMARTCONTRACT, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public EndorsersContext endorsers() {
			return getRuleContext(EndorsersContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CreateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFunctionContext createFunction() throws RecognitionException {
		CreateFunctionContext _localctx = new CreateFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(CREATE);
			setState(190);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (CHAINCODE - 101)) | (1L << (SMARTCONTRACT - 101)) | (1L << (FUNCTION - 101)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(191);
			qualifiedName();
			setState(192);
			match(AS);
			setState(193);
			className();
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(194);
				version();
				}
				break;
			}
			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(197);
				endorsers();
				}
				break;
			}
			setState(201);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(200);
				args();
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

	public static class UpgradeFunctionContext extends ParserRuleContext {
		public TerminalNode UPGRADE() { return getToken(BlkchnSqlParser.UPGRADE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(BlkchnSqlParser.FUNCTION, 0); }
		public TerminalNode CHAINCODE() { return getToken(BlkchnSqlParser.CHAINCODE, 0); }
		public TerminalNode SMARTCONTRACT() { return getToken(BlkchnSqlParser.SMARTCONTRACT, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public UpgradeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upgradeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterUpgradeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitUpgradeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitUpgradeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpgradeFunctionContext upgradeFunction() throws RecognitionException {
		UpgradeFunctionContext _localctx = new UpgradeFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_upgradeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(UPGRADE);
			setState(204);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (CHAINCODE - 101)) | (1L << (SMARTCONTRACT - 101)) | (1L << (FUNCTION - 101)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(205);
			qualifiedName();
			setState(206);
			match(AS);
			setState(207);
			className();
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(208);
				version();
				}
				break;
			}
			setState(212);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(211);
				args();
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

	public static class CreateAssetContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BlkchnSqlParser.CREATE, 0); }
		public AssetContext asset() {
			return getRuleContext(AssetContext.class,0);
		}
		public TerminalNode WITH() { return getToken(BlkchnSqlParser.WITH, 0); }
		public TerminalNode STORAGE() { return getToken(BlkchnSqlParser.STORAGE, 0); }
		public TerminalNode TYPE() { return getToken(BlkchnSqlParser.TYPE, 0); }
		public StorageTypeContext storageType() {
			return getRuleContext(StorageTypeContext.class,0);
		}
		public TerminalNode ASSET() { return getToken(BlkchnSqlParser.ASSET, 0); }
		public TerminalNode TABLE() { return getToken(BlkchnSqlParser.TABLE, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public FieldDelimiterContext fieldDelimiter() {
			return getRuleContext(FieldDelimiterContext.class,0);
		}
		public RecordDelimiterContext recordDelimiter() {
			return getRuleContext(RecordDelimiterContext.class,0);
		}
		public CreateAssetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createAsset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCreateAsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCreateAsset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCreateAsset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateAssetContext createAsset() throws RecognitionException {
		CreateAssetContext _localctx = new CreateAssetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createAsset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(CREATE);
			setState(215);
			_la = _input.LA(1);
			if ( !(_la==TABLE || _la==ASSET) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(216);
			asset();
			setState(221);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(217);
				match(T__0);
				setState(218);
				colTypeList();
				setState(219);
				match(T__1);
				}
			}

			setState(223);
			match(WITH);
			setState(224);
			match(STORAGE);
			setState(225);
			match(TYPE);
			setState(226);
			storageType();
			setState(228);
			_la = _input.LA(1);
			if (_la==FIELDS) {
				{
				setState(227);
				fieldDelimiter();
				}
			}

			setState(231);
			_la = _input.LA(1);
			if (_la==RECORDS) {
				{
				setState(230);
				recordDelimiter();
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

	public static class AssetContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterAsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitAsset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitAsset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssetContext asset() throws RecognitionException {
		AssetContext _localctx = new AssetContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			identifier();
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

	public static class StorageTypeContext extends ParserRuleContext {
		public TerminalNode JSON() { return getToken(BlkchnSqlParser.JSON, 0); }
		public TerminalNode CSV() { return getToken(BlkchnSqlParser.CSV, 0); }
		public StorageTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterStorageType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitStorageType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitStorageType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageTypeContext storageType() throws RecognitionException {
		StorageTypeContext _localctx = new StorageTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_storageType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==JSON || _la==CSV) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FieldDelimiterContext extends ParserRuleContext {
		public TerminalNode FIELDS() { return getToken(BlkchnSqlParser.FIELDS, 0); }
		public TerminalNode DELIMITED() { return getToken(BlkchnSqlParser.DELIMITED, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public FieldDelimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDelimiter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterFieldDelimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitFieldDelimiter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitFieldDelimiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDelimiterContext fieldDelimiter() throws RecognitionException {
		FieldDelimiterContext _localctx = new FieldDelimiterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fieldDelimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(FIELDS);
			setState(238);
			match(DELIMITED);
			setState(239);
			match(BY);
			setState(240);
			match(STRING);
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

	public static class RecordDelimiterContext extends ParserRuleContext {
		public TerminalNode RECORDS() { return getToken(BlkchnSqlParser.RECORDS, 0); }
		public TerminalNode DELIMITED() { return getToken(BlkchnSqlParser.DELIMITED, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public RecordDelimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDelimiter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterRecordDelimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitRecordDelimiter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitRecordDelimiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordDelimiterContext recordDelimiter() throws RecognitionException {
		RecordDelimiterContext _localctx = new RecordDelimiterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_recordDelimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(RECORDS);
			setState(243);
			match(DELIMITED);
			setState(244);
			match(BY);
			setState(245);
			match(STRING);
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

	public static class DeleteFunctionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(BlkchnSqlParser.DELETE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public DeleteFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDeleteFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDeleteFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDeleteFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteFunctionContext deleteFunction() throws RecognitionException {
		DeleteFunctionContext _localctx = new DeleteFunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_deleteFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(DELETE);
			setState(248);
			qualifiedName();
			setState(249);
			match(T__0);
			setState(251);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << FIRST) | (1L << AFTER) | (1L << LAST) | (1L << VALUES) | (1L << CREATE) | (1L << TABLE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)) | (1L << (MINUS - 64)) | (1L << (DIV - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (PERCENTLIT - 130)) | (1L << (OUT - 130)) | (1L << (OF - 130)) | (1L << (FUNCTION - 130)) | (1L << (DATABASE - 130)) | (1L << (DATABASES - 130)) | (1L << (TRUNCATE - 130)) | (1L << (ANALYZE - 130)) | (1L << (COMPUTE - 130)) | (1L << (LIST - 130)) | (1L << (REVOKE - 130)) | (1L << (GRANT - 130)) | (1L << (EXPORT - 130)) | (1L << (IMPORT - 130)) | (1L << (LOAD - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (INDEX - 130)) | (1L << (INDEXES - 130)) | (1L << (CURRENT_DATE - 130)) | (1L << (CURRENT_TIMESTAMP - 130)) | (1L << (STRING - 130)) | (1L << (BIGINT_LITERAL - 130)) | (1L << (SMALLINT_LITERAL - 130)) | (1L << (TINYINT_LITERAL - 130)) | (1L << (INTEGER_VALUE - 130)) | (1L << (DECIMAL_VALUE - 130)) | (1L << (DOUBLE_LITERAL - 130)) | (1L << (BIGDECIMAL_LITERAL - 130)) | (1L << (IDENTIFIER - 130)) | (1L << (BACKQUOTED_IDENTIFIER - 130)))) != 0)) {
				{
				setState(250);
				parameterValues();
				}
			}

			setState(253);
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

	public static class DropAssetContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(BlkchnSqlParser.DROP, 0); }
		public AssetContext asset() {
			return getRuleContext(AssetContext.class,0);
		}
		public TerminalNode ASSET() { return getToken(BlkchnSqlParser.ASSET, 0); }
		public TerminalNode TABLE() { return getToken(BlkchnSqlParser.TABLE, 0); }
		public DropAssetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropAsset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDropAsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDropAsset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDropAsset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropAssetContext dropAsset() throws RecognitionException {
		DropAssetContext _localctx = new DropAssetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dropAsset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(DROP);
			setState(256);
			_la = _input.LA(1);
			if ( !(_la==TABLE || _la==ASSET) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(257);
			asset();
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(STRING);
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

	public static class VersionContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(BlkchnSqlParser.WITH, 0); }
		public TerminalNode VERSION() { return getToken(BlkchnSqlParser.VERSION, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(WITH);
			setState(262);
			match(VERSION);
			setState(263);
			match(STRING);
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

	public static class EndorsersContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(BlkchnSqlParser.WITH, 0); }
		public TerminalNode ENDORSERS() { return getToken(BlkchnSqlParser.ENDORSERS, 0); }
		public EndorserDetailsContext endorserDetails() {
			return getRuleContext(EndorserDetailsContext.class,0);
		}
		public EndorsersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endorsers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterEndorsers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitEndorsers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitEndorsers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndorsersContext endorsers() throws RecognitionException {
		EndorsersContext _localctx = new EndorsersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_endorsers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(WITH);
			setState(266);
			match(ENDORSERS);
			setState(267);
			endorserDetails();
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

	public static class EndorserDetailsContext extends ParserRuleContext {
		public TerminalNode ENDORSER() { return getToken(BlkchnSqlParser.ENDORSER, 0); }
		public List<EndorserDetailsContext> endorserDetails() {
			return getRuleContexts(EndorserDetailsContext.class);
		}
		public EndorserDetailsContext endorserDetails(int i) {
			return getRuleContext(EndorserDetailsContext.class,i);
		}
		public TerminalNode AND() { return getToken(BlkchnSqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(BlkchnSqlParser.OR, 0); }
		public EndorserDetailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endorserDetails; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterEndorserDetails(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitEndorserDetails(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitEndorserDetails(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndorserDetailsContext endorserDetails() throws RecognitionException {
		EndorserDetailsContext _localctx = new EndorserDetailsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_endorserDetails);
		int _la;
		try {
			setState(282);
			switch (_input.LA(1)) {
			case ENDORSER:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(ENDORSER);
				}
				break;
			case OR:
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(271);
				match(T__0);
				setState(272);
				endorserDetails();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(273);
					match(T__2);
					setState(274);
					endorserDetails();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(280);
				match(T__1);
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

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(BlkchnSqlParser.WITH, 0); }
		public TerminalNode ARGS() { return getToken(BlkchnSqlParser.ARGS, 0); }
		public ArgParamSeqContext argParamSeq() {
			return getRuleContext(ArgParamSeqContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(WITH);
			setState(285);
			match(ARGS);
			setState(286);
			argParamSeq();
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

	public static class ArgParamSeqContext extends ParserRuleContext {
		public List<ArgParamContext> argParam() {
			return getRuleContexts(ArgParamContext.class);
		}
		public ArgParamContext argParam(int i) {
			return getRuleContext(ArgParamContext.class,i);
		}
		public ArgParamSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argParamSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArgParamSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArgParamSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArgParamSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgParamSeqContext argParamSeq() throws RecognitionException {
		ArgParamSeqContext _localctx = new ArgParamSeqContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_argParamSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			argParam();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(289);
				match(T__2);
				setState(290);
				argParam();
				}
				}
				setState(295);
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

	public static class ArgParamContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ArgParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArgParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArgParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArgParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgParamContext argParam() throws RecognitionException {
		ArgParamContext _localctx = new ArgParamContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_argParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			constant();
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

	public static class CallFunctionContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(BlkchnSqlParser.CALL, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public AssetContext asset() {
			return getRuleContext(AssetContext.class,0);
		}
		public TerminalNode ASSET() { return getToken(BlkchnSqlParser.ASSET, 0); }
		public TerminalNode TABLE() { return getToken(BlkchnSqlParser.TABLE, 0); }
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(CALL);
			setState(299);
			qualifiedName();
			setState(300);
			match(T__0);
			setState(302);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << FIRST) | (1L << AFTER) | (1L << LAST) | (1L << VALUES) | (1L << CREATE) | (1L << TABLE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)) | (1L << (MINUS - 64)) | (1L << (DIV - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (PERCENTLIT - 130)) | (1L << (OUT - 130)) | (1L << (OF - 130)) | (1L << (FUNCTION - 130)) | (1L << (DATABASE - 130)) | (1L << (DATABASES - 130)) | (1L << (TRUNCATE - 130)) | (1L << (ANALYZE - 130)) | (1L << (COMPUTE - 130)) | (1L << (LIST - 130)) | (1L << (REVOKE - 130)) | (1L << (GRANT - 130)) | (1L << (EXPORT - 130)) | (1L << (IMPORT - 130)) | (1L << (LOAD - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (INDEX - 130)) | (1L << (INDEXES - 130)) | (1L << (CURRENT_DATE - 130)) | (1L << (CURRENT_TIMESTAMP - 130)) | (1L << (STRING - 130)) | (1L << (BIGINT_LITERAL - 130)) | (1L << (SMALLINT_LITERAL - 130)) | (1L << (TINYINT_LITERAL - 130)) | (1L << (INTEGER_VALUE - 130)) | (1L << (DECIMAL_VALUE - 130)) | (1L << (DOUBLE_LITERAL - 130)) | (1L << (BIGDECIMAL_LITERAL - 130)) | (1L << (IDENTIFIER - 130)) | (1L << (BACKQUOTED_IDENTIFIER - 130)))) != 0)) {
				{
				setState(301);
				parameterValues();
				}
			}

			setState(304);
			match(T__1);
			setState(308);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(305);
				match(AS);
				setState(306);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==ASSET) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(307);
				asset();
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

	public static class ParameterValuesContext extends ParserRuleContext {
		public ArgParamSeqContext argParamSeq() {
			return getRuleContext(ArgParamSeqContext.class,0);
		}
		public ParameterValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterParameterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitParameterValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitParameterValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterValuesContext parameterValues() throws RecognitionException {
		ParameterValuesContext _localctx = new ParameterValuesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parameterValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			argParamSeq();
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

	public static class QueryContext extends ParserRuleContext {
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	 
		public QueryContext() { }
		public void copyFrom(QueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleQueryContext extends QueryContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public SimpleQueryContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSimpleQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSimpleQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSimpleQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_query);
		try {
			_localctx = new SimpleQueryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			queryTerm(0);
			setState(313);
			queryOrganization();
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

	public static class QueryOrganizationContext extends ParserRuleContext {
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(315);
				orderByClause();
				}
			}

			setState(319);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(318);
				limitClause();
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public TerminalNode ORDER() { return getToken(BlkchnSqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(ORDER);
			setState(322);
			match(BY);
			setState(323);
			((OrderByClauseContext)_localctx).sortItem = sortItem();
			((OrderByClauseContext)_localctx).order.add(((OrderByClauseContext)_localctx).sortItem);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(324);
				match(T__2);
				setState(325);
				((OrderByClauseContext)_localctx).sortItem = sortItem();
				((OrderByClauseContext)_localctx).order.add(((OrderByClauseContext)_localctx).sortItem);
				}
				}
				setState(330);
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

	public static class LimitClauseContext extends ParserRuleContext {
		public ExpressionContext limit;
		public TerminalNode LIMIT() { return getToken(BlkchnSqlParser.LIMIT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(331);
			match(LIMIT);
			setState(332);
			((LimitClauseContext)_localctx).limit = expression();
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

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(BlkchnSqlParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(BlkchnSqlParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(BlkchnSqlParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(BlkchnSqlParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(335);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
					((SetOperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
					setState(337);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(338);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (UNION - 79)) | (1L << (EXCEPT - 79)) | (1L << (SETMINUS - 79)) | (1L << (INTERSECT - 79)))) != 0)) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(340);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(339);
						setQuantifier();
						}
					}

					setState(342);
					((SetOperationContext)_localctx).right = queryTerm(2);
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_queryPrimary);
		try {
			setState(353);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				querySpecification();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(T__0);
				setState(350);
				query();
				setState(351);
				match(T__1);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(BlkchnSqlParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(BlkchnSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(BlkchnSqlParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(BlkchnSqlParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(BlkchnSqlParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			expression();
			setState(357);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(356);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(361);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(359);
				match(NULLS);
				setState(360);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_querySpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			selectClause();
			setState(364);
			fromClause();
			setState(366);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(365);
				whereClause();
				}
				break;
			}
			setState(369);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(368);
				groupByClause();
				}
				break;
			}
			setState(372);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(371);
				havingClause();
				}
				break;
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

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(BlkchnSqlParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(SELECT);
			setState(376);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(375);
				setQuantifier();
				}
				break;
			}
			setState(378);
			namedExpressionSeq();
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(BlkchnSqlParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(WHERE);
			setState(381);
			booleanExpression(0);
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

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(BlkchnSqlParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(HAVING);
			setState(384);
			booleanExpression(0);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(BlkchnSqlParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(FROM);
			setState(387);
			relation();
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388);
					match(T__2);
					setState(389);
					relation();
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public TerminalNode GROUP() { return getToken(BlkchnSqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_groupByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(GROUP);
			setState(396);
			match(BY);
			setState(397);
			((GroupByClauseContext)_localctx).expression = expression();
			((GroupByClauseContext)_localctx).groupingExpressions.add(((GroupByClauseContext)_localctx).expression);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(398);
					match(T__2);
					setState(399);
					((GroupByClauseContext)_localctx).expression = expression();
					((GroupByClauseContext)_localctx).groupingExpressions.add(((GroupByClauseContext)_localctx).expression);
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(BlkchnSqlParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(BlkchnSqlParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			relationPrimary();
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(408);
					joinRelation();
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(BlkchnSqlParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_joinRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(414);
			joinType();
			}
			setState(415);
			match(JOIN);
			setState(416);
			((JoinRelationContext)_localctx).right = relationPrimary();
			setState(418);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(417);
				joinCriteria();
				}
				break;
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(BlkchnSqlParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(BlkchnSqlParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(BlkchnSqlParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(BlkchnSqlParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(BlkchnSqlParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(BlkchnSqlParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_joinType);
		int _la;
		try {
			setState(436);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(420);
					match(INNER);
					}
				}

				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(CROSS);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				match(LEFT);
				setState(426);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(425);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				match(RIGHT);
				setState(430);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(429);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				match(FULL);
				setState(434);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(433);
					match(OUTER);
					}
				}

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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(BlkchnSqlParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_joinCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(ON);
			setState(439);
			booleanExpression(0);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(T__0);
			setState(442);
			identifierSeq();
			setState(443);
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

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_identifierSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			identifier();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(446);
				match(T__2);
				setState(447);
				identifier();
				}
				}
				setState(452);
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_relationPrimary);
		try {
			setState(479);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				tableIdentifier();
				setState(458);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(455);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(454);
						match(AS);
						}
						break;
					}
					setState(457);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(T__0);
				setState(461);
				query();
				setState(462);
				match(T__1);
				setState(467);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(464);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(463);
						match(AS);
						}
						break;
					}
					setState(466);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				inlineTable();
				}
				break;
			case 4:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				match(T__0);
				setState(471);
				relation();
				setState(472);
				match(T__1);
				setState(477);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(474);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(473);
						match(AS);
						}
						break;
					}
					setState(476);
					strictIdentifier();
					}
					break;
				}
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

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(BlkchnSqlParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(VALUES);
			setState(482);
			expression();
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					match(T__2);
					setState(484);
					expression();
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(497);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(491);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(490);
					match(AS);
					}
					break;
				}
				setState(493);
				identifier();
				setState(495);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(494);
					identifierList();
					}
					break;
				}
				}
				break;
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

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(499);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(500);
				match(T__3);
				}
				break;
			}
			setState(504);
			((TableIdentifierContext)_localctx).table = identifier();
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

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			expression();
			setState(514);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(508);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(507);
					match(AS);
					}
					break;
				}
				setState(512);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case FIRST:
				case AFTER:
				case LAST:
				case VALUES:
				case CREATE:
				case TABLE:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case COMMIT:
				case ROLLBACK:
				case IGNORE:
				case IF:
				case DIV:
				case PERCENTLIT:
				case OUT:
				case OF:
				case FUNCTION:
				case DATABASE:
				case DATABASES:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case REVOKE:
				case GRANT:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case INDEX:
				case INDEXES:
				case CURRENT_DATE:
				case CURRENT_TIMESTAMP:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(510);
					identifier();
					}
					break;
				case T__0:
					{
					setState(511);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_namedExpressionSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			namedExpression();
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(517);
				match(T__2);
				setState(518);
				namedExpression();
				}
				}
				setState(523);
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

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			booleanExpression(0);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(BlkchnSqlParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBooleanDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBooleanDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBooleanDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(BlkchnSqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(BlkchnSqlParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(527);
				match(NOT);
				setState(528);
				booleanExpression(4);
				}
				break;
			case 2:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(529);
				predicated();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(538);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(532);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(533);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(534);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(535);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(536);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(537);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			valueExpression(0);
			setState(545);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(544);
				predicate();
				}
				break;
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

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public TerminalNode AND() { return getToken(BlkchnSqlParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(BlkchnSqlParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(BlkchnSqlParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(BlkchnSqlParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(BlkchnSqlParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(BlkchnSqlParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(BlkchnSqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(BlkchnSqlParser.NULL, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_predicate);
		int _la;
		try {
			setState(588);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(547);
					match(NOT);
					}
				}

				setState(550);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(551);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(552);
				match(AND);
				setState(553);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(555);
					match(NOT);
					}
				}

				setState(558);
				((PredicateContext)_localctx).kind = match(IN);
				setState(559);
				match(T__0);
				setState(560);
				expression();
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(561);
					match(T__2);
					setState(562);
					expression();
					}
					}
					setState(567);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(568);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(570);
					match(NOT);
					}
				}

				setState(573);
				((PredicateContext)_localctx).kind = match(IN);
				setState(574);
				match(T__0);
				setState(575);
				query();
				setState(576);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(579);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(578);
					match(NOT);
					}
				}

				setState(581);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(582);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(583);
				match(IS);
				setState(585);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(584);
					match(NOT);
					}
				}

				setState(587);
				((PredicateContext)_localctx).kind = match(NULL);
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(BlkchnSqlParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(BlkchnSqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(BlkchnSqlParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(BlkchnSqlParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(BlkchnSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public TerminalNode AMPERSAND() { return getToken(BlkchnSqlParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(BlkchnSqlParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(BlkchnSqlParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(BlkchnSqlParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(BlkchnSqlParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			switch (_input.LA(1)) {
			case PLUS:
			case TILDE:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(591);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==TILDE) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(592);
				valueExpression(7);
				}
				break;
			case T__0:
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case FIRST:
			case AFTER:
			case LAST:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case COMMIT:
			case ROLLBACK:
			case IGNORE:
			case IF:
			case MINUS:
			case ASTERISK:
			case DIV:
			case PERCENTLIT:
			case OUT:
			case OF:
			case FUNCTION:
			case DATABASE:
			case DATABASES:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case REVOKE:
			case GRANT:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case INDEX:
			case INDEXES:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case STRING:
			case BIGINT_LITERAL:
			case SMALLINT_LITERAL:
			case TINYINT_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_LITERAL:
			case BIGDECIMAL_LITERAL:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(593);
				primaryExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(615);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(596);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(597);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (ASTERISK - 122)) | (1L << (SLASH - 122)) | (1L << (PERCENT - 122)) | (1L << (DIV - 122)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(598);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(599);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(600);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(601);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(602);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(603);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(604);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(605);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(606);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(607);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(608);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(609);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(610);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(611);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(612);
						comparisonOperator();
						setState(613);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(BlkchnSqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(BlkchnSqlParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BlkchnSqlParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(BlkchnSqlParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(BlkchnSqlParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(BlkchnSqlParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(BlkchnSqlParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeFunctionCallContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(BlkchnSqlParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(BlkchnSqlParser.CURRENT_TIMESTAMP, 0); }
		public TimeFunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterTimeFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitTimeFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitTimeFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(BlkchnSqlParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(BlkchnSqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(BlkchnSqlParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BlkchnSqlParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(BlkchnSqlParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(BlkchnSqlParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(BlkchnSqlParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				_localctx = new TimeFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(621);
				((TimeFunctionCallContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((TimeFunctionCallContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(622);
				match(CASE);
				setState(624); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(623);
					whenClause();
					}
					}
					setState(626); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(630);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(628);
					match(ELSE);
					setState(629);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(632);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(634);
				match(CASE);
				setState(635);
				((SimpleCaseContext)_localctx).value = expression();
				setState(637); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(636);
					whenClause();
					}
					}
					setState(639); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(643);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(641);
					match(ELSE);
					setState(642);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(645);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(647);
				match(CAST);
				setState(648);
				match(T__0);
				setState(649);
				expression();
				setState(650);
				match(AS);
				setState(651);
				dataType();
				setState(652);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(654);
				match(FIRST);
				setState(655);
				match(T__0);
				setState(656);
				expression();
				setState(659);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(657);
					match(IGNORE);
					setState(658);
					match(NULLS);
					}
				}

				setState(661);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(663);
				match(LAST);
				setState(664);
				match(T__0);
				setState(665);
				expression();
				setState(668);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(666);
					match(IGNORE);
					setState(667);
					match(NULLS);
					}
				}

				setState(670);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(672);
				constant();
				}
				break;
			case 8:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(673);
				match(ASTERISK);
				}
				break;
			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(674);
				qualifiedName();
				setState(675);
				match(T__3);
				setState(676);
				match(ASTERISK);
				}
				break;
			case 10:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(678);
				match(T__0);
				setState(679);
				namedExpression();
				setState(682); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(680);
					match(T__2);
					setState(681);
					namedExpression();
					}
					}
					setState(684); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(686);
				match(T__1);
				}
				break;
			case 11:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(688);
				match(T__0);
				setState(689);
				query();
				setState(690);
				match(T__1);
				}
				break;
			case 12:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(692);
				qualifiedName();
				setState(693);
				match(T__0);
				setState(705);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << FIRST) | (1L << AFTER) | (1L << LAST) | (1L << VALUES) | (1L << CREATE) | (1L << TABLE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (ASTERISK - 64)) | (1L << (DIV - 64)) | (1L << (TILDE - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (PERCENTLIT - 130)) | (1L << (OUT - 130)) | (1L << (OF - 130)) | (1L << (FUNCTION - 130)) | (1L << (DATABASE - 130)) | (1L << (DATABASES - 130)) | (1L << (TRUNCATE - 130)) | (1L << (ANALYZE - 130)) | (1L << (COMPUTE - 130)) | (1L << (LIST - 130)) | (1L << (REVOKE - 130)) | (1L << (GRANT - 130)) | (1L << (EXPORT - 130)) | (1L << (IMPORT - 130)) | (1L << (LOAD - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (INDEX - 130)) | (1L << (INDEXES - 130)) | (1L << (CURRENT_DATE - 130)) | (1L << (CURRENT_TIMESTAMP - 130)) | (1L << (STRING - 130)) | (1L << (BIGINT_LITERAL - 130)) | (1L << (SMALLINT_LITERAL - 130)) | (1L << (TINYINT_LITERAL - 130)) | (1L << (INTEGER_VALUE - 130)) | (1L << (DECIMAL_VALUE - 130)) | (1L << (DOUBLE_LITERAL - 130)) | (1L << (BIGDECIMAL_LITERAL - 130)) | (1L << (IDENTIFIER - 130)) | (1L << (BACKQUOTED_IDENTIFIER - 130)))) != 0)) {
					{
					setState(695);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						setState(694);
						setQuantifier();
						}
						break;
					}
					setState(697);
					namedExpression();
					setState(702);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(698);
						match(T__2);
						setState(699);
						namedExpression();
						}
						}
						setState(704);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(707);
				match(T__1);
				}
				break;
			case 13:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(709);
				identifier();
				}
				break;
			case 14:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(710);
				match(T__0);
				setState(711);
				expression();
				setState(712);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(724);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(716);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(717);
						match(T__4);
						setState(718);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(719);
						match(T__5);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(721);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(722);
						match(T__3);
						setState(723);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(BlkchnSqlParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(BlkchnSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BlkchnSqlParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_constant);
		try {
			int _alt;
			setState(741);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(731);
				identifier();
				setState(732);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(734);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(735);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(737); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(736);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(739); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(BlkchnSqlParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(BlkchnSqlParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(BlkchnSqlParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(BlkchnSqlParser.LT, 0); }
		public TerminalNode LTE() { return getToken(BlkchnSqlParser.LTE, 0); }
		public TerminalNode GT() { return getToken(BlkchnSqlParser.GT, 0); }
		public TerminalNode GTE() { return getToken(BlkchnSqlParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(BlkchnSqlParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (EQ - 112)) | (1L << (NSEQ - 112)) | (1L << (NEQ - 112)) | (1L << (NEQJ - 112)) | (1L << (LT - 112)) | (1L << (LTE - 112)) | (1L << (GT - 112)) | (1L << (GTE - 112)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(BlkchnSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(BlkchnSqlParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(BlkchnSqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(BlkchnSqlParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(BlkchnSqlParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(BlkchnSqlParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(BlkchnSqlParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(BlkchnSqlParser.PIPE, 0); }
		public TerminalNode HAT() { return getToken(BlkchnSqlParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			_la = _input.LA(1);
			if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (PLUS - 120)) | (1L << (MINUS - 120)) | (1L << (ASTERISK - 120)) | (1L << (SLASH - 120)) | (1L << (PERCENT - 120)) | (1L << (DIV - 120)) | (1L << (TILDE - 120)) | (1L << (AMPERSAND - 120)) | (1L << (PIPE - 120)) | (1L << (HAT - 120)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(BlkchnSqlParser.OR, 0); }
		public TerminalNode AND() { return getToken(BlkchnSqlParser.AND, 0); }
		public TerminalNode IN() { return getToken(BlkchnSqlParser.IN, 0); }
		public TerminalNode NOT() { return getToken(BlkchnSqlParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(BlkchnSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BlkchnSqlParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(BlkchnSqlParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(INTERVAL);
			setState(755);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(752);
					intervalField();
					}
					} 
				}
				setState(757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(BlkchnSqlParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(759);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(762);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(760);
				match(TO);
				setState(761);
				((IntervalFieldContext)_localctx).to = identifier();
				}
				break;
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

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(BlkchnSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(BlkchnSqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(BlkchnSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_intervalValue);
		int _la;
		try {
			setState(769);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(764);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(767);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				match(STRING);
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ARRAY() { return getToken(BlkchnSqlParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(BlkchnSqlParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(BlkchnSqlParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(BlkchnSqlParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(BlkchnSqlParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(BlkchnSqlParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_dataType);
		int _la;
		try {
			setState(805);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(772);
				match(LT);
				setState(773);
				dataType();
				setState(774);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(777);
				match(LT);
				setState(778);
				dataType();
				setState(779);
				match(T__2);
				setState(780);
				dataType();
				setState(781);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(783);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(790);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(784);
					match(LT);
					setState(786);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << FIRST) | (1L << AFTER) | (1L << LAST) | (1L << VALUES) | (1L << CREATE) | (1L << TABLE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)) | (1L << (DIV - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (PERCENTLIT - 130)) | (1L << (OUT - 130)) | (1L << (OF - 130)) | (1L << (FUNCTION - 130)) | (1L << (DATABASE - 130)) | (1L << (DATABASES - 130)) | (1L << (TRUNCATE - 130)) | (1L << (ANALYZE - 130)) | (1L << (COMPUTE - 130)) | (1L << (LIST - 130)) | (1L << (REVOKE - 130)) | (1L << (GRANT - 130)) | (1L << (EXPORT - 130)) | (1L << (IMPORT - 130)) | (1L << (LOAD - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (INDEX - 130)) | (1L << (INDEXES - 130)) | (1L << (CURRENT_DATE - 130)) | (1L << (CURRENT_TIMESTAMP - 130)) | (1L << (IDENTIFIER - 130)) | (1L << (BACKQUOTED_IDENTIFIER - 130)))) != 0)) {
						{
						setState(785);
						complexColTypeList();
						}
					}

					setState(788);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(789);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(792);
				identifier();
				setState(803);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(793);
					match(T__0);
					setState(794);
					match(INTEGER_VALUE);
					setState(799);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(795);
						match(T__2);
						setState(796);
						match(INTEGER_VALUE);
						}
						}
						setState(801);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(802);
					match(T__1);
					}
				}

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

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_colTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			colType();
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(808);
				match(T__2);
				setState(809);
				colType();
				}
				}
				setState(814);
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

	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(BlkchnSqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_colType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			identifier();
			setState(816);
			dataType();
			setState(819);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(817);
				match(COMMENT);
				setState(818);
				match(STRING);
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

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			complexColType();
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(822);
				match(T__2);
				setState(823);
				complexColType();
				}
				}
				setState(828);
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

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(BlkchnSqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			identifier();
			setState(830);
			match(T__6);
			setState(831);
			dataType();
			setState(834);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(832);
				match(COMMENT);
				setState(833);
				match(STRING);
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(BlkchnSqlParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(BlkchnSqlParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(WHEN);
			setState(837);
			((WhenClauseContext)_localctx).condition = expression();
			setState(838);
			match(THEN);
			setState(839);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			identifier();
			setState(846);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(842);
					match(T__3);
					setState(843);
					identifier();
					}
					} 
				}
				setState(848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode FULL() { return getToken(BlkchnSqlParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(BlkchnSqlParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(BlkchnSqlParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(BlkchnSqlParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(BlkchnSqlParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(BlkchnSqlParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(BlkchnSqlParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(BlkchnSqlParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(BlkchnSqlParser.ON, 0); }
		public TerminalNode UNION() { return getToken(BlkchnSqlParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(BlkchnSqlParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(BlkchnSqlParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(BlkchnSqlParser.SETMINUS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_identifier);
		try {
			setState(863);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case FIRST:
			case AFTER:
			case LAST:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case FUNCTIONS:
			case DROP:
			case TO:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case COMMIT:
			case ROLLBACK:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case OUT:
			case OF:
			case FUNCTION:
			case DATABASE:
			case DATABASES:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case REVOKE:
			case GRANT:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case INDEX:
			case INDEXES:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				strictIdentifier();
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(850);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 3);
				{
				setState(851);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 4);
				{
				setState(852);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 5);
				{
				setState(853);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 6);
				{
				setState(854);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(855);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 8);
				{
				setState(856);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 9);
				{
				setState(857);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 10);
				{
				setState(858);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 11);
				{
				setState(859);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 12);
				{
				setState(860);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 13);
				{
				setState(861);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 14);
				{
				setState(862);
				match(SETMINUS);
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

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(BlkchnSqlParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_strictIdentifier);
		try {
			setState(868);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case FIRST:
			case AFTER:
			case LAST:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case FUNCTIONS:
			case DROP:
			case TO:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case COMMIT:
			case ROLLBACK:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case OUT:
			case OF:
			case FUNCTION:
			case DATABASE:
			case DATABASES:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case REVOKE:
			case GRANT:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case INDEX:
			case INDEXES:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(867);
				nonReserved();
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

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(BlkchnSqlParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(BACKQUOTED_IDENTIFIER);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(BlkchnSqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(BlkchnSqlParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(BlkchnSqlParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(BlkchnSqlParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(BlkchnSqlParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(BlkchnSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(BlkchnSqlParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_number);
		int _la;
		try {
			setState(900);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(872);
					match(MINUS);
					}
				}

				setState(875);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(876);
					match(MINUS);
					}
				}

				setState(879);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(881);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(880);
					match(MINUS);
					}
				}

				setState(883);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(885);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(884);
					match(MINUS);
					}
				}

				setState(887);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(889);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(888);
					match(MINUS);
					}
				}

				setState(891);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(893);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(892);
					match(MINUS);
					}
				}

				setState(895);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(897);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(896);
					match(MINUS);
					}
				}

				setState(899);
				match(BIGDECIMAL_LITERAL);
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(BlkchnSqlParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(BlkchnSqlParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(BlkchnSqlParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(BlkchnSqlParser.COLUMN, 0); }
		public TerminalNode FUNCTIONS() { return getToken(BlkchnSqlParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(BlkchnSqlParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(BlkchnSqlParser.ADD, 0); }
		public TerminalNode LAST() { return getToken(BlkchnSqlParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(BlkchnSqlParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(BlkchnSqlParser.AFTER, 0); }
		public TerminalNode MAP() { return getToken(BlkchnSqlParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(BlkchnSqlParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(BlkchnSqlParser.STRUCT, 0); }
		public TerminalNode GROUPING() { return getToken(BlkchnSqlParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(BlkchnSqlParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(BlkchnSqlParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(BlkchnSqlParser.EXPLAIN, 0); }
		public TerminalNode USE() { return getToken(BlkchnSqlParser.USE, 0); }
		public List<TerminalNode> TO() { return getTokens(BlkchnSqlParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(BlkchnSqlParser.TO, i);
		}
		public TerminalNode PERCENTLIT() { return getToken(BlkchnSqlParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(BlkchnSqlParser.OUT, 0); }
		public TerminalNode OF() { return getToken(BlkchnSqlParser.OF, 0); }
		public TerminalNode SET() { return getToken(BlkchnSqlParser.SET, 0); }
		public TerminalNode RESET() { return getToken(BlkchnSqlParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(BlkchnSqlParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(BlkchnSqlParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(BlkchnSqlParser.IF, 0); }
		public TerminalNode NO() { return getToken(BlkchnSqlParser.NO, 0); }
		public TerminalNode COMMIT() { return getToken(BlkchnSqlParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(BlkchnSqlParser.ROLLBACK, 0); }
		public TerminalNode IGNORE() { return getToken(BlkchnSqlParser.IGNORE, 0); }
		public TerminalNode TRUNCATE() { return getToken(BlkchnSqlParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(BlkchnSqlParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(BlkchnSqlParser.LIST, 0); }
		public TerminalNode ANALYZE() { return getToken(BlkchnSqlParser.ANALYZE, 0); }
		public TerminalNode REVOKE() { return getToken(BlkchnSqlParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(BlkchnSqlParser.GRANT, 0); }
		public TerminalNode EXPORT() { return getToken(BlkchnSqlParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(BlkchnSqlParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(BlkchnSqlParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(BlkchnSqlParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(BlkchnSqlParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(BlkchnSqlParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(BlkchnSqlParser.ROLES, 0); }
		public TerminalNode INDEX() { return getToken(BlkchnSqlParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(BlkchnSqlParser.INDEXES, 0); }
		public TerminalNode ASC() { return getToken(BlkchnSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(BlkchnSqlParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(BlkchnSqlParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(BlkchnSqlParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(BlkchnSqlParser.SETS, 0); }
		public TerminalNode AT() { return getToken(BlkchnSqlParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(BlkchnSqlParser.NULLS, 0); }
		public TerminalNode ALL() { return getToken(BlkchnSqlParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(BlkchnSqlParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(BlkchnSqlParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(BlkchnSqlParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(BlkchnSqlParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(BlkchnSqlParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(BlkchnSqlParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(BlkchnSqlParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(BlkchnSqlParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(BlkchnSqlParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(BlkchnSqlParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(BlkchnSqlParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(BlkchnSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(BlkchnSqlParser.INTO, 0); }
		public TerminalNode IS() { return getToken(BlkchnSqlParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(BlkchnSqlParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(BlkchnSqlParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(BlkchnSqlParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(BlkchnSqlParser.OUTER, 0); }
		public List<TerminalNode> TABLE() { return getTokens(BlkchnSqlParser.TABLE); }
		public TerminalNode TABLE(int i) {
			return getToken(BlkchnSqlParser.TABLE, i);
		}
		public TerminalNode TRUE() { return getToken(BlkchnSqlParser.TRUE, 0); }
		public TerminalNode RLIKE() { return getToken(BlkchnSqlParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(BlkchnSqlParser.AND, 0); }
		public TerminalNode CASE() { return getToken(BlkchnSqlParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(BlkchnSqlParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(BlkchnSqlParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(BlkchnSqlParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(BlkchnSqlParser.ELSE, 0); }
		public TerminalNode END() { return getToken(BlkchnSqlParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(BlkchnSqlParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(BlkchnSqlParser.INTERVAL, 0); }
		public TerminalNode OR() { return getToken(BlkchnSqlParser.OR, 0); }
		public TerminalNode THEN() { return getToken(BlkchnSqlParser.THEN, 0); }
		public TerminalNode WHEN() { return getToken(BlkchnSqlParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(BlkchnSqlParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(BlkchnSqlParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(BlkchnSqlParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(BlkchnSqlParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(BlkchnSqlParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(BlkchnSqlParser.NOT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(BlkchnSqlParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(BlkchnSqlParser.CURRENT_TIMESTAMP, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER) | (1L << FIRST) | (1L << AFTER) | (1L << LAST) | (1L << VALUES) | (1L << CREATE) | (1L << TABLE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)) | (1L << (DIV - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (PERCENTLIT - 130)) | (1L << (OUT - 130)) | (1L << (OF - 130)) | (1L << (FUNCTION - 130)) | (1L << (DATABASE - 130)) | (1L << (DATABASES - 130)) | (1L << (TRUNCATE - 130)) | (1L << (ANALYZE - 130)) | (1L << (COMPUTE - 130)) | (1L << (LIST - 130)) | (1L << (REVOKE - 130)) | (1L << (GRANT - 130)) | (1L << (EXPORT - 130)) | (1L << (IMPORT - 130)) | (1L << (LOAD - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (INDEX - 130)) | (1L << (INDEXES - 130)) | (1L << (CURRENT_DATE - 130)) | (1L << (CURRENT_TIMESTAMP - 130)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 50:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 53:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 54:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00aa\u038b\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\u00a4\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00ad\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7\u00bb\n\7\f\7\16\7\u00be\13\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u00c6\n\b\3\b\5\b\u00c9\n\b\3\b\5\b\u00cc\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d4\n\t\3\t\5\t\u00d7\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00e0\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e7\n\n\3\n\5\n\u00ea"+
		"\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\5\17\u00fe\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u0116\n\24\f\24\16\24\u0119\13\24\3\24\3\24\5\24\u011d\n\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u0126\n\26\f\26\16\26\u0129\13"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0131\n\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0137\n\30\3\31\3\31\3\32\3\32\3\32\3\33\5\33\u013f\n\33\3\33\5"+
		"\33\u0142\n\33\3\34\3\34\3\34\3\34\3\34\7\34\u0149\n\34\f\34\16\34\u014c"+
		"\13\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0157\n\36\3"+
		"\36\7\36\u015a\n\36\f\36\16\36\u015d\13\36\3\37\3\37\3\37\3\37\3\37\5"+
		"\37\u0164\n\37\3 \3 \5 \u0168\n \3 \3 \5 \u016c\n \3!\3!\3!\5!\u0171\n"+
		"!\3!\5!\u0174\n!\3!\5!\u0177\n!\3\"\3\"\5\"\u017b\n\"\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3$\3%\3%\3%\3%\7%\u0189\n%\f%\16%\u018c\13%\3&\3&\3&\3&\3&\7&"+
		"\u0193\n&\f&\16&\u0196\13&\3\'\3\'\3(\3(\7(\u019c\n(\f(\16(\u019f\13("+
		"\3)\3)\3)\3)\5)\u01a5\n)\3*\5*\u01a8\n*\3*\3*\3*\5*\u01ad\n*\3*\3*\5*"+
		"\u01b1\n*\3*\3*\5*\u01b5\n*\5*\u01b7\n*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-"+
		"\7-\u01c3\n-\f-\16-\u01c6\13-\3.\3.\5.\u01ca\n.\3.\5.\u01cd\n.\3.\3.\3"+
		".\3.\5.\u01d3\n.\3.\5.\u01d6\n.\3.\3.\3.\3.\3.\5.\u01dd\n.\3.\5.\u01e0"+
		"\n.\5.\u01e2\n.\3/\3/\3/\3/\7/\u01e8\n/\f/\16/\u01eb\13/\3/\5/\u01ee\n"+
		"/\3/\3/\5/\u01f2\n/\5/\u01f4\n/\3\60\3\60\3\60\5\60\u01f9\n\60\3\60\3"+
		"\60\3\61\3\61\5\61\u01ff\n\61\3\61\3\61\5\61\u0203\n\61\5\61\u0205\n\61"+
		"\3\62\3\62\3\62\7\62\u020a\n\62\f\62\16\62\u020d\13\62\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\5\64\u0215\n\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u021d"+
		"\n\64\f\64\16\64\u0220\13\64\3\65\3\65\5\65\u0224\n\65\3\66\5\66\u0227"+
		"\n\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u022f\n\66\3\66\3\66\3\66\3\66"+
		"\3\66\7\66\u0236\n\66\f\66\16\66\u0239\13\66\3\66\3\66\3\66\5\66\u023e"+
		"\n\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0246\n\66\3\66\3\66\3\66\3\66"+
		"\5\66\u024c\n\66\3\66\5\66\u024f\n\66\3\67\3\67\3\67\3\67\5\67\u0255\n"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\7\67\u026a\n\67\f\67\16\67\u026d\13\67\3"+
		"8\38\38\38\68\u0273\n8\r8\168\u0274\38\38\58\u0279\n8\38\38\38\38\38\6"+
		"8\u0280\n8\r8\168\u0281\38\38\58\u0286\n8\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\58\u0296\n8\38\38\38\38\38\38\38\58\u029f\n8\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\68\u02ad\n8\r8\168\u02ae\38\38\38\38\38\38\3"+
		"8\38\38\58\u02ba\n8\38\38\38\78\u02bf\n8\f8\168\u02c2\138\58\u02c4\n8"+
		"\38\38\38\38\38\38\38\58\u02cd\n8\38\38\38\38\38\38\38\38\78\u02d7\n8"+
		"\f8\168\u02da\138\39\39\39\39\39\39\39\39\69\u02e4\n9\r9\169\u02e5\59"+
		"\u02e8\n9\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\7>\u02f4\n>\f>\16>\u02f7\13>\3"+
		"?\3?\3?\3?\5?\u02fd\n?\3@\5@\u0300\n@\3@\3@\5@\u0304\n@\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0315\nA\3A\3A\5A\u0319\nA\3A\3A\3"+
		"A\3A\3A\7A\u0320\nA\fA\16A\u0323\13A\3A\5A\u0326\nA\5A\u0328\nA\3B\3B"+
		"\3B\7B\u032d\nB\fB\16B\u0330\13B\3C\3C\3C\3C\5C\u0336\nC\3D\3D\3D\7D\u033b"+
		"\nD\fD\16D\u033e\13D\3E\3E\3E\3E\3E\5E\u0345\nE\3F\3F\3F\3F\3F\3G\3G\3"+
		"G\7G\u034f\nG\fG\16G\u0352\13G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\5H\u0362\nH\3I\3I\3I\5I\u0367\nI\3J\3J\3K\5K\u036c\nK\3K\3K\5K\u0370"+
		"\nK\3K\3K\5K\u0374\nK\3K\3K\5K\u0378\nK\3K\3K\5K\u037c\nK\3K\3K\5K\u0380"+
		"\nK\3K\3K\5K\u0384\nK\3K\5K\u0387\nK\3L\3L\3L\2\6:flnM\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\2\25\4\2gh\u0087\u0087\4\2AAff\3\2kl\3\2\33\34\3\2QT\3\2"+
		")*\4\2<<>>\3\2\16\17\3\2\"#\4\2zz\u0080\u0080\3\2|\177\3\2z{\3\2\u0097"+
		"\u0098\3\2ry\3\2z\u0083\3\2\33\36\3\2&\'\3\2\u009e\u009f\t\2\n\61\64\64"+
		"<PU`qq\177\177\u0084\u0098\u03e1\2\u0098\3\2\2\2\4\u00a3\3\2\2\2\6\u00a5"+
		"\3\2\2\2\b\u00b3\3\2\2\2\n\u00b5\3\2\2\2\f\u00b7\3\2\2\2\16\u00bf\3\2"+
		"\2\2\20\u00cd\3\2\2\2\22\u00d8\3\2\2\2\24\u00eb\3\2\2\2\26\u00ed\3\2\2"+
		"\2\30\u00ef\3\2\2\2\32\u00f4\3\2\2\2\34\u00f9\3\2\2\2\36\u0101\3\2\2\2"+
		" \u0105\3\2\2\2\"\u0107\3\2\2\2$\u010b\3\2\2\2&\u011c\3\2\2\2(\u011e\3"+
		"\2\2\2*\u0122\3\2\2\2,\u012a\3\2\2\2.\u012c\3\2\2\2\60\u0138\3\2\2\2\62"+
		"\u013a\3\2\2\2\64\u013e\3\2\2\2\66\u0143\3\2\2\28\u014d\3\2\2\2:\u0150"+
		"\3\2\2\2<\u0163\3\2\2\2>\u0165\3\2\2\2@\u016d\3\2\2\2B\u0178\3\2\2\2D"+
		"\u017e\3\2\2\2F\u0181\3\2\2\2H\u0184\3\2\2\2J\u018d\3\2\2\2L\u0197\3\2"+
		"\2\2N\u0199\3\2\2\2P\u01a0\3\2\2\2R\u01b6\3\2\2\2T\u01b8\3\2\2\2V\u01bb"+
		"\3\2\2\2X\u01bf\3\2\2\2Z\u01e1\3\2\2\2\\\u01e3\3\2\2\2^\u01f8\3\2\2\2"+
		"`\u01fc\3\2\2\2b\u0206\3\2\2\2d\u020e\3\2\2\2f\u0214\3\2\2\2h\u0221\3"+
		"\2\2\2j\u024e\3\2\2\2l\u0254\3\2\2\2n\u02cc\3\2\2\2p\u02e7\3\2\2\2r\u02e9"+
		"\3\2\2\2t\u02eb\3\2\2\2v\u02ed\3\2\2\2x\u02ef\3\2\2\2z\u02f1\3\2\2\2|"+
		"\u02f8\3\2\2\2~\u0303\3\2\2\2\u0080\u0327\3\2\2\2\u0082\u0329\3\2\2\2"+
		"\u0084\u0331\3\2\2\2\u0086\u0337\3\2\2\2\u0088\u033f\3\2\2\2\u008a\u0346"+
		"\3\2\2\2\u008c\u034b\3\2\2\2\u008e\u0361\3\2\2\2\u0090\u0366\3\2\2\2\u0092"+
		"\u0368\3\2\2\2\u0094\u0386\3\2\2\2\u0096\u0388\3\2\2\2\u0098\u0099\5\4"+
		"\3\2\u0099\u009a\7\2\2\3\u009a\3\3\2\2\2\u009b\u00a4\5\62\32\2\u009c\u00a4"+
		"\5\6\4\2\u009d\u00a4\5\16\b\2\u009e\u00a4\5.\30\2\u009f\u00a4\5\22\n\2"+
		"\u00a0\u00a4\5\34\17\2\u00a1\u00a4\5\36\20\2\u00a2\u00a4\5\20\t\2\u00a3"+
		"\u009b\3\2\2\2\u00a3\u009c\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3\u009e\3\2"+
		"\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\5\3\2\2\2\u00a5\u00a6\7D\2\2\u00a6\u00a7\7F\2\2\u00a7"+
		"\u00ac\5^\60\2\u00a8\u00a9\7\3\2\2\u00a9\u00aa\5\b\5\2\u00aa\u00ab\7\4"+
		"\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\7?\2\2\u00af\u00b0\7\3\2\2\u00b0\u00b1\5\n"+
		"\6\2\u00b1\u00b2\7\4\2\2\u00b2\7\3\2\2\2\u00b3\u00b4\5X-\2\u00b4\t\3\2"+
		"\2\2\u00b5\u00b6\5\f\7\2\u00b6\13\3\2\2\2\u00b7\u00bc\5p9\2\u00b8\u00b9"+
		"\7\5\2\2\u00b9\u00bb\5p9\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\r\3\2\2\2\u00be\u00bc\3\2\2\2"+
		"\u00bf\u00c0\7@\2\2\u00c0\u00c1\t\2\2\2\u00c1\u00c2\5\u008cG\2\u00c2\u00c3"+
		"\7\r\2\2\u00c3\u00c5\5 \21\2\u00c4\u00c6\5\"\22\2\u00c5\u00c4\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c9\5$\23\2\u00c8\u00c7"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00cc\5(\25\2\u00cb"+
		"\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\17\3\2\2\2\u00cd\u00ce\7p\2\2"+
		"\u00ce\u00cf\t\2\2\2\u00cf\u00d0\5\u008cG\2\u00d0\u00d1\7\r\2\2\u00d1"+
		"\u00d3\5 \21\2\u00d2\u00d4\5\"\22\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3"+
		"\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d7\5(\25\2\u00d6\u00d5\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\21\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9\u00da\t\3\2\2"+
		"\u00da\u00df\5\24\13\2\u00db\u00dc\7\3\2\2\u00dc\u00dd\5\u0082B\2\u00dd"+
		"\u00de\7\4\2\2\u00de\u00e0\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7b\2\2\u00e2\u00e3\7i\2\2\u00e3\u00e4"+
		"\7j\2\2\u00e4\u00e6\5\26\f\2\u00e5\u00e7\5\30\r\2\u00e6\u00e5\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00ea\5\32\16\2\u00e9\u00e8"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\23\3\2\2\2\u00eb\u00ec\5\u008eH\2\u00ec"+
		"\25\3\2\2\2\u00ed\u00ee\t\4\2\2\u00ee\27\3\2\2\2\u00ef\u00f0\7m\2\2\u00f0"+
		"\u00f1\7o\2\2\u00f1\u00f2\7\22\2\2\u00f2\u00f3\7\u0099\2\2\u00f3\31\3"+
		"\2\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7o\2\2\u00f6\u00f7\7\22\2\2\u00f7"+
		"\u00f8\7\u0099\2\2\u00f8\33\3\2\2\2\u00f9\u00fa\7E\2\2\u00fa\u00fb\5\u008c"+
		"G\2\u00fb\u00fd\7\3\2\2\u00fc\u00fe\5\60\31\2\u00fd\u00fc\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7\4\2\2\u0100\35\3\2\2"+
		"\2\u0101\u0102\7P\2\2\u0102\u0103\t\3\2\2\u0103\u0104\5\24\13\2\u0104"+
		"\37\3\2\2\2\u0105\u0106\7\u0099\2\2\u0106!\3\2\2\2\u0107\u0108\7b\2\2"+
		"\u0108\u0109\7c\2\2\u0109\u010a\7\u0099\2\2\u010a#\3\2\2\2\u010b\u010c"+
		"\7b\2\2\u010c\u010d\7d\2\2\u010d\u010e\5&\24\2\u010e%\3\2\2\2\u010f\u011d"+
		"\7\u00a3\2\2\u0110\u0111\t\5\2\2\u0111\u0112\7\3\2\2\u0112\u0117\5&\24"+
		"\2\u0113\u0114\7\5\2\2\u0114\u0116\5&\24\2\u0115\u0113\3\2\2\2\u0116\u0119"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011b\7\4\2\2\u011b\u011d\3\2\2\2\u011c\u010f\3\2"+
		"\2\2\u011c\u0110\3\2\2\2\u011d\'\3\2\2\2\u011e\u011f\7b\2\2\u011f\u0120"+
		"\7e\2\2\u0120\u0121\5*\26\2\u0121)\3\2\2\2\u0122\u0127\5,\27\2\u0123\u0124"+
		"\7\5\2\2\u0124\u0126\5,\27\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128+\3\2\2\2\u0129\u0127\3\2\2\2"+
		"\u012a\u012b\5p9\2\u012b-\3\2\2\2\u012c\u012d\7a\2\2\u012d\u012e\5\u008c"+
		"G\2\u012e\u0130\7\3\2\2\u012f\u0131\5\60\31\2\u0130\u012f\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0136\7\4\2\2\u0133\u0134\7\r"+
		"\2\2\u0134\u0135\t\3\2\2\u0135\u0137\5\24\13\2\u0136\u0133\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137/\3\2\2\2\u0138\u0139\5*\26\2\u0139\61\3\2\2\2\u013a"+
		"\u013b\5:\36\2\u013b\u013c\5\64\33\2\u013c\63\3\2\2\2\u013d\u013f\5\66"+
		"\34\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140"+
		"\u0142\58\35\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\65\3\2\2"+
		"\2\u0143\u0144\7\27\2\2\u0144\u0145\7\22\2\2\u0145\u014a\5> \2\u0146\u0147"+
		"\7\5\2\2\u0147\u0149\5> \2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\67\3\2\2\2\u014c\u014a\3\2\2"+
		"\2\u014d\u014e\7\31\2\2\u014e\u014f\5d\63\2\u014f9\3\2\2\2\u0150\u0151"+
		"\b\36\1\2\u0151\u0152\5<\37\2\u0152\u015b\3\2\2\2\u0153\u0154\f\3\2\2"+
		"\u0154\u0156\t\6\2\2\u0155\u0157\5L\'\2\u0156\u0155\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\5:\36\4\u0159\u0153\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c;\3\2\2\2"+
		"\u015d\u015b\3\2\2\2\u015e\u0164\5@!\2\u015f\u0160\7\3\2\2\u0160\u0161"+
		"\5\62\32\2\u0161\u0162\7\4\2\2\u0162\u0164\3\2\2\2\u0163\u015e\3\2\2\2"+
		"\u0163\u015f\3\2\2\2\u0164=\3\2\2\2\u0165\u0167\5d\63\2\u0166\u0168\t"+
		"\7\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u016a\7(\2\2\u016a\u016c\t\b\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c?\3\2\2\2\u016d\u016e\5B\"\2\u016e\u0170\5H%\2\u016f\u0171\5"+
		"D#\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172"+
		"\u0174\5J&\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2"+
		"\2\u0175\u0177\5F$\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177A\3"+
		"\2\2\2\u0178\u017a\7\n\2\2\u0179\u017b\5L\'\2\u017a\u0179\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\5b\62\2\u017dC\3\2\2\2"+
		"\u017e\u017f\7\20\2\2\u017f\u0180\5f\64\2\u0180E\3\2\2\2\u0181\u0182\7"+
		"\30\2\2\u0182\u0183\5f\64\2\u0183G\3\2\2\2\u0184\u0185\7\13\2\2\u0185"+
		"\u018a\5N(\2\u0186\u0187\7\5\2\2\u0187\u0189\5N(\2\u0188\u0186\3\2\2\2"+
		"\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018bI\3"+
		"\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7\21\2\2\u018e\u018f\7\22\2\2\u018f"+
		"\u0194\5d\63\2\u0190\u0191\7\5\2\2\u0191\u0193\5d\63\2\u0192\u0190\3\2"+
		"\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"K\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\t\t\2\2\u0198M\3\2\2\2\u0199"+
		"\u019d\5Z.\2\u019a\u019c\5P)\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2"+
		"\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019eO\3\2\2\2\u019f\u019d\3"+
		"\2\2\2\u01a0\u01a1\5R*\2\u01a1\u01a2\7\62\2\2\u01a2\u01a4\5Z.\2\u01a3"+
		"\u01a5\5T+\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5Q\3\2\2\2\u01a6"+
		"\u01a8\7\65\2\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01b7\3"+
		"\2\2\2\u01a9\u01b7\7\63\2\2\u01aa\u01ac\7\66\2\2\u01ab\u01ad\7\64\2\2"+
		"\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b7\3\2\2\2\u01ae\u01b0"+
		"\78\2\2\u01af\u01b1\7\64\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b7\3\2\2\2\u01b2\u01b4\79\2\2\u01b3\u01b5\7\64\2\2\u01b4\u01b3\3\2"+
		"\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01a7\3\2\2\2\u01b6"+
		"\u01a9\3\2\2\2\u01b6\u01aa\3\2\2\2\u01b6\u01ae\3\2\2\2\u01b6\u01b2\3\2"+
		"\2\2\u01b7S\3\2\2\2\u01b8\u01b9\7;\2\2\u01b9\u01ba\5f\64\2\u01baU\3\2"+
		"\2\2\u01bb\u01bc\7\3\2\2\u01bc\u01bd\5X-\2\u01bd\u01be\7\4\2\2\u01beW"+
		"\3\2\2\2\u01bf\u01c4\5\u008eH\2\u01c0\u01c1\7\5\2\2\u01c1\u01c3\5\u008e"+
		"H\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5Y\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01cc\5^\60\2"+
		"\u01c8\u01ca\7\r\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01cd\5\u0090I\2\u01cc\u01c9\3\2\2\2\u01cc\u01cd\3\2\2"+
		"\2\u01cd\u01e2\3\2\2\2\u01ce\u01cf\7\3\2\2\u01cf\u01d0\5\62\32\2\u01d0"+
		"\u01d5\7\4\2\2\u01d1\u01d3\7\r\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2"+
		"\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\5\u0090I\2\u01d5\u01d2\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01e2\3\2\2\2\u01d7\u01e2\5\\/\2\u01d8\u01d9\7\3"+
		"\2\2\u01d9\u01da\5N(\2\u01da\u01df\7\4\2\2\u01db\u01dd\7\r\2\2\u01dc\u01db"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\5\u0090I"+
		"\2\u01df\u01dc\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01c7"+
		"\3\2\2\2\u01e1\u01ce\3\2\2\2\u01e1\u01d7\3\2\2\2\u01e1\u01d8\3\2\2\2\u01e2"+
		"[\3\2\2\2\u01e3\u01e4\7?\2\2\u01e4\u01e9\5d\63\2\u01e5\u01e6\7\5\2\2\u01e6"+
		"\u01e8\5d\63\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2"+
		"\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01f3\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec"+
		"\u01ee\7\r\2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01ef\u01f1\5\u008eH\2\u01f0\u01f2\5V,\2\u01f1\u01f0\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01ed\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4]\3\2\2\2\u01f5\u01f6\5\u008eH\2\u01f6\u01f7\7\6\2\2\u01f7\u01f9"+
		"\3\2\2\2\u01f8\u01f5\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fb\5\u008eH\2\u01fb_\3\2\2\2\u01fc\u0204\5d\63\2\u01fd\u01ff\7\r\2"+
		"\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u0203"+
		"\5\u008eH\2\u0201\u0203\5V,\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2"+
		"\u0203\u0205\3\2\2\2\u0204\u01fe\3\2\2\2\u0204\u0205\3\2\2\2\u0205a\3"+
		"\2\2\2\u0206\u020b\5`\61\2\u0207\u0208\7\5\2\2\u0208\u020a\5`\61\2\u0209"+
		"\u0207\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020cc\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u020f\5f\64\2\u020fe\3\2"+
		"\2\2\u0210\u0211\b\64\1\2\u0211\u0212\7\36\2\2\u0212\u0215\5f\64\6\u0213"+
		"\u0215\5h\65\2\u0214\u0210\3\2\2\2\u0214\u0213\3\2\2\2\u0215\u021e\3\2"+
		"\2\2\u0216\u0217\f\4\2\2\u0217\u0218\7\34\2\2\u0218\u021d\5f\64\5\u0219"+
		"\u021a\f\3\2\2\u021a\u021b\7\33\2\2\u021b\u021d\5f\64\4\u021c\u0216\3"+
		"\2\2\2\u021c\u0219\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021fg\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0223\5l\67\2"+
		"\u0222\u0224\5j\66\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224i\3"+
		"\2\2\2\u0225\u0227\7\36\2\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u0229\7!\2\2\u0229\u022a\5l\67\2\u022a\u022b\7\34"+
		"\2\2\u022b\u022c\5l\67\2\u022c\u024f\3\2\2\2\u022d\u022f\7\36\2\2\u022e"+
		"\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\7\35"+
		"\2\2\u0231\u0232\7\3\2\2\u0232\u0237\5d\63\2\u0233\u0234\7\5\2\2\u0234"+
		"\u0236\5d\63\2\u0235\u0233\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2"+
		"\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u0237\3\2\2\2\u023a"+
		"\u023b\7\4\2\2\u023b\u024f\3\2\2\2\u023c\u023e\7\36\2\2\u023d\u023c\3"+
		"\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\7\35\2\2\u0240"+
		"\u0241\7\3\2\2\u0241\u0242\5\62\32\2\u0242\u0243\7\4\2\2\u0243\u024f\3"+
		"\2\2\2\u0244\u0246\7\36\2\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u0248\t\n\2\2\u0248\u024f\5l\67\2\u0249\u024b\7$"+
		"\2\2\u024a\u024c\7\36\2\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024d\u024f\7%\2\2\u024e\u0226\3\2\2\2\u024e\u022e\3\2"+
		"\2\2\u024e\u023d\3\2\2\2\u024e\u0245\3\2\2\2\u024e\u0249\3\2\2\2\u024f"+
		"k\3\2\2\2\u0250\u0251\b\67\1\2\u0251\u0252\t\13\2\2\u0252\u0255\5l\67"+
		"\t\u0253\u0255\5n8\2\u0254\u0250\3\2\2\2\u0254\u0253\3\2\2\2\u0255\u026b"+
		"\3\2\2\2\u0256\u0257\f\b\2\2\u0257\u0258\t\f\2\2\u0258\u026a\5l\67\t\u0259"+
		"\u025a\f\7\2\2\u025a\u025b\t\r\2\2\u025b\u026a\5l\67\b\u025c\u025d\f\6"+
		"\2\2\u025d\u025e\7\u0081\2\2\u025e\u026a\5l\67\7\u025f\u0260\f\5\2\2\u0260"+
		"\u0261\7\u0083\2\2\u0261\u026a\5l\67\6\u0262\u0263\f\4\2\2\u0263\u0264"+
		"\7\u0082\2\2\u0264\u026a\5l\67\5\u0265\u0266\f\3\2\2\u0266\u0267\5r:\2"+
		"\u0267\u0268\5l\67\4\u0268\u026a\3\2\2\2\u0269\u0256\3\2\2\2\u0269\u0259"+
		"\3\2\2\2\u0269\u025c\3\2\2\2\u0269\u025f\3\2\2\2\u0269\u0262\3\2\2\2\u0269"+
		"\u0265\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2"+
		"\2\2\u026cm\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u026f\b8\1\2\u026f\u02cd"+
		"\t\16\2\2\u0270\u0272\7-\2\2\u0271\u0273\5\u008aF\2\u0272\u0271\3\2\2"+
		"\2\u0273\u0274\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0278"+
		"\3\2\2\2\u0276\u0277\7\60\2\2\u0277\u0279\5d\63\2\u0278\u0276\3\2\2\2"+
		"\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\7\61\2\2\u027b\u02cd"+
		"\3\2\2\2\u027c\u027d\7-\2\2\u027d\u027f\5d\63\2\u027e\u0280\5\u008aF\2"+
		"\u027f\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282"+
		"\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0284\7\60\2\2\u0284\u0286\5d\63\2"+
		"\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288"+
		"\7\61\2\2\u0288\u02cd\3\2\2\2\u0289\u028a\7I\2\2\u028a\u028b\7\3\2\2\u028b"+
		"\u028c\5d\63\2\u028c\u028d\7\r\2\2\u028d\u028e\5\u0080A\2\u028e\u028f"+
		"\7\4\2\2\u028f\u02cd\3\2\2\2\u0290\u0291\7<\2\2\u0291\u0292\7\3\2\2\u0292"+
		"\u0295\5d\63\2\u0293\u0294\7`\2\2\u0294\u0296\7(\2\2\u0295\u0293\3\2\2"+
		"\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\7\4\2\2\u0298\u02cd"+
		"\3\2\2\2\u0299\u029a\7>\2\2\u029a\u029b\7\3\2\2\u029b\u029e\5d\63\2\u029c"+
		"\u029d\7`\2\2\u029d\u029f\7(\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2"+
		"\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\7\4\2\2\u02a1\u02cd\3\2\2\2\u02a2\u02cd"+
		"\5p9\2\u02a3\u02cd\7|\2\2\u02a4\u02a5\5\u008cG\2\u02a5\u02a6\7\6\2\2\u02a6"+
		"\u02a7\7|\2\2\u02a7\u02cd\3\2\2\2\u02a8\u02a9\7\3\2\2\u02a9\u02ac\5`\61"+
		"\2\u02aa\u02ab\7\5\2\2\u02ab\u02ad\5`\61\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae"+
		"\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0"+
		"\u02b1\7\4\2\2\u02b1\u02cd\3\2\2\2\u02b2\u02b3\7\3\2\2\u02b3\u02b4\5\62"+
		"\32\2\u02b4\u02b5\7\4\2\2\u02b5\u02cd\3\2\2\2\u02b6\u02b7\5\u008cG\2\u02b7"+
		"\u02c3\7\3\2\2\u02b8\u02ba\5L\'\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2"+
		"\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02c0\5`\61\2\u02bc\u02bd\7\5\2\2\u02bd"+
		"\u02bf\5`\61\2\u02be\u02bc\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2"+
		"\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3"+
		"\u02b9\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\7\4"+
		"\2\2\u02c6\u02cd\3\2\2\2\u02c7\u02cd\5\u008eH\2\u02c8\u02c9\7\3\2\2\u02c9"+
		"\u02ca\5d\63\2\u02ca\u02cb\7\4\2\2\u02cb\u02cd\3\2\2\2\u02cc\u026e\3\2"+
		"\2\2\u02cc\u0270\3\2\2\2\u02cc\u027c\3\2\2\2\u02cc\u0289\3\2\2\2\u02cc"+
		"\u0290\3\2\2\2\u02cc\u0299\3\2\2\2\u02cc\u02a2\3\2\2\2\u02cc\u02a3\3\2"+
		"\2\2\u02cc\u02a4\3\2\2\2\u02cc\u02a8\3\2\2\2\u02cc\u02b2\3\2\2\2\u02cc"+
		"\u02b6\3\2\2\2\u02cc\u02c7\3\2\2\2\u02cc\u02c8\3\2\2\2\u02cd\u02d8\3\2"+
		"\2\2\u02ce\u02cf\f\6\2\2\u02cf\u02d0\7\7\2\2\u02d0\u02d1\5l\67\2\u02d1"+
		"\u02d2\7\b\2\2\u02d2\u02d7\3\2\2\2\u02d3\u02d4\f\4\2\2\u02d4\u02d5\7\6"+
		"\2\2\u02d5\u02d7\5\u008eH\2\u02d6\u02ce\3\2\2\2\u02d6\u02d3\3\2\2\2\u02d7"+
		"\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9o\3\2\2\2"+
		"\u02da\u02d8\3\2\2\2\u02db\u02e8\7%\2\2\u02dc\u02e8\5z>\2\u02dd\u02de"+
		"\5\u008eH\2\u02de\u02df\7\u0099\2\2\u02df\u02e8\3\2\2\2\u02e0\u02e8\5"+
		"\u0094K\2\u02e1\u02e8\5x=\2\u02e2\u02e4\7\u0099\2\2\u02e3\u02e2\3\2\2"+
		"\2\u02e4\u02e5\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8"+
		"\3\2\2\2\u02e7\u02db\3\2\2\2\u02e7\u02dc\3\2\2\2\u02e7\u02dd\3\2\2\2\u02e7"+
		"\u02e0\3\2\2\2\u02e7\u02e1\3\2\2\2\u02e7\u02e3\3\2\2\2\u02e8q\3\2\2\2"+
		"\u02e9\u02ea\t\17\2\2\u02eas\3\2\2\2\u02eb\u02ec\t\20\2\2\u02ecu\3\2\2"+
		"\2\u02ed\u02ee\t\21\2\2\u02eew\3\2\2\2\u02ef\u02f0\t\22\2\2\u02f0y\3\2"+
		"\2\2\u02f1\u02f5\7,\2\2\u02f2\u02f4\5|?\2\u02f3\u02f2\3\2\2\2\u02f4\u02f7"+
		"\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6{\3\2\2\2\u02f7"+
		"\u02f5\3\2\2\2\u02f8\u02f9\5~@\2\u02f9\u02fc\5\u008eH\2\u02fa\u02fb\7"+
		"U\2\2\u02fb\u02fd\5\u008eH\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd"+
		"}\3\2\2\2\u02fe\u0300\t\r\2\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2"+
		"\u0300\u0301\3\2\2\2\u0301\u0304\t\23\2\2\u0302\u0304\7\u0099\2\2\u0303"+
		"\u02ff\3\2\2\2\u0303\u0302\3\2\2\2\u0304\177\3\2\2\2\u0305\u0306\7X\2"+
		"\2\u0306\u0307\7v\2\2\u0307\u0308\5\u0080A\2\u0308\u0309\7x\2\2\u0309"+
		"\u0328\3\2\2\2\u030a\u030b\7Y\2\2\u030b\u030c\7v\2\2\u030c\u030d\5\u0080"+
		"A\2\u030d\u030e\7\5\2\2\u030e\u030f\5\u0080A\2\u030f\u0310\7x\2\2\u0310"+
		"\u0328\3\2\2\2\u0311\u0318\7Z\2\2\u0312\u0314\7v\2\2\u0313\u0315\5\u0086"+
		"D\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316"+
		"\u0319\7x\2\2\u0317\u0319\7t\2\2\u0318\u0312\3\2\2\2\u0318\u0317\3\2\2"+
		"\2\u0319\u0328\3\2\2\2\u031a\u0325\5\u008eH\2\u031b\u031c\7\3\2\2\u031c"+
		"\u0321\7\u009e\2\2\u031d\u031e\7\5\2\2\u031e\u0320\7\u009e\2\2\u031f\u031d"+
		"\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0324\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u0326\7\4\2\2\u0325\u031b\3\2"+
		"\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0305\3\2\2\2\u0327"+
		"\u030a\3\2\2\2\u0327\u0311\3\2\2\2\u0327\u031a\3\2\2\2\u0328\u0081\3\2"+
		"\2\2\u0329\u032e\5\u0084C\2\u032a\u032b\7\5\2\2\u032b\u032d\5\u0084C\2"+
		"\u032c\u032a\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f"+
		"\3\2\2\2\u032f\u0083\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0332\5\u008eH"+
		"\2\u0332\u0335\5\u0080A\2\u0333\u0334\7[\2\2\u0334\u0336\7\u0099\2\2\u0335"+
		"\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0085\3\2\2\2\u0337\u033c\5\u0088"+
		"E\2\u0338\u0339\7\5\2\2\u0339\u033b\5\u0088E\2\u033a\u0338\3\2\2\2\u033b"+
		"\u033e\3\2\2\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u0087\3\2"+
		"\2\2\u033e\u033c\3\2\2\2\u033f\u0340\5\u008eH\2\u0340\u0341\7\t\2\2\u0341"+
		"\u0344\5\u0080A\2\u0342\u0343\7[\2\2\u0343\u0345\7\u0099\2\2\u0344\u0342"+
		"\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0089\3\2\2\2\u0346\u0347\7.\2\2\u0347"+
		"\u0348\5d\63\2\u0348\u0349\7/\2\2\u0349\u034a\5d\63\2\u034a\u008b\3\2"+
		"\2\2\u034b\u0350\5\u008eH\2\u034c\u034d\7\6\2\2\u034d\u034f\5\u008eH\2"+
		"\u034e\u034c\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351"+
		"\3\2\2\2\u0351\u008d\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0362\5\u0090I"+
		"\2\u0354\u0362\79\2\2\u0355\u0362\7\65\2\2\u0356\u0362\7\66\2\2\u0357"+
		"\u0362\7\67\2\2\u0358\u0362\78\2\2\u0359\u0362\7:\2\2\u035a\u0362\7\62"+
		"\2\2\u035b\u0362\7\63\2\2\u035c\u0362\7;\2\2\u035d\u0362\7Q\2\2\u035e"+
		"\u0362\7T\2\2\u035f\u0362\7R\2\2\u0360\u0362\7S\2\2\u0361\u0353\3\2\2"+
		"\2\u0361\u0354\3\2\2\2\u0361\u0355\3\2\2\2\u0361\u0356\3\2\2\2\u0361\u0357"+
		"\3\2\2\2\u0361\u0358\3\2\2\2\u0361\u0359\3\2\2\2\u0361\u035a\3\2\2\2\u0361"+
		"\u035b\3\2\2\2\u0361\u035c\3\2\2\2\u0361\u035d\3\2\2\2\u0361\u035e\3\2"+
		"\2\2\u0361\u035f\3\2\2\2\u0361\u0360\3\2\2\2\u0362\u008f\3\2\2\2\u0363"+
		"\u0367\7\u00a2\2\2\u0364\u0367\5\u0092J\2\u0365\u0367\5\u0096L\2\u0366"+
		"\u0363\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0365\3\2\2\2\u0367\u0091\3\2"+
		"\2\2\u0368\u0369\7\u00a4\2\2\u0369\u0093\3\2\2\2\u036a\u036c\7{\2\2\u036b"+
		"\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u0387\7\u009f"+
		"\2\2\u036e\u0370\7{\2\2\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\u0371\3\2\2\2\u0371\u0387\7\u009e\2\2\u0372\u0374\7{\2\2\u0373\u0372"+
		"\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0387\7\u009a\2"+
		"\2\u0376\u0378\7{\2\2\u0377\u0376\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379"+
		"\3\2\2\2\u0379\u0387\7\u009b\2\2\u037a\u037c\7{\2\2\u037b\u037a\3\2\2"+
		"\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u0387\7\u009c\2\2\u037e"+
		"\u0380\7{\2\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2"+
		"\2\2\u0381\u0387\7\u00a0\2\2\u0382\u0384\7{\2\2\u0383\u0382\3\2\2\2\u0383"+
		"\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\7\u00a1\2\2\u0386\u036b"+
		"\3\2\2\2\u0386\u036f\3\2\2\2\u0386\u0373\3\2\2\2\u0386\u0377\3\2\2\2\u0386"+
		"\u037b\3\2\2\2\u0386\u037f\3\2\2\2\u0386\u0383\3\2\2\2\u0387\u0095\3\2"+
		"\2\2\u0388\u0389\t\24\2\2\u0389\u0097\3\2\2\2n\u00a3\u00ac\u00bc\u00c5"+
		"\u00c8\u00cb\u00d3\u00d6\u00df\u00e6\u00e9\u00fd\u0117\u011c\u0127\u0130"+
		"\u0136\u013e\u0141\u014a\u0156\u015b\u0163\u0167\u016b\u0170\u0173\u0176"+
		"\u017a\u018a\u0194\u019d\u01a4\u01a7\u01ac\u01b0\u01b4\u01b6\u01c4\u01c9"+
		"\u01cc\u01d2\u01d5\u01dc\u01df\u01e1\u01e9\u01ed\u01f1\u01f3\u01f8\u01fe"+
		"\u0202\u0204\u020b\u0214\u021c\u021e\u0223\u0226\u022e\u0237\u023d\u0245"+
		"\u024b\u024e\u0254\u0269\u026b\u0274\u0278\u0281\u0285\u0295\u029e\u02ae"+
		"\u02b9\u02c0\u02c3\u02cc\u02d6\u02d8\u02e5\u02e7\u02f5\u02fc\u02ff\u0303"+
		"\u0314\u0318\u0321\u0325\u0327\u032e\u0335\u033c\u0344\u0350\u0361\u0366"+
		"\u036b\u036f\u0373\u0377\u037b\u037f\u0383\u0386";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}