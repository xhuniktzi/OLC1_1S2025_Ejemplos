
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package jflexcupexample.analyzers;

import java_cup.runtime.Symbol;
import composite.RunStmt;
import composite.MainStmt;
import contracts.IBlock;
import composite.NotExpr;
import composite.OrExpr;
import composite.AndExpr;
import composite.BoolTerm;
import contracts.IExpr;
import java.util.LinkedList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\027\000\002\002\004\000\002\002\004\000\002\010" +
    "\004\000\002\010\003\000\002\011\007\000\002\012\004" +
    "\000\002\013\005\000\002\014\007\000\002\015\005\000" +
    "\002\015\003\000\002\016\006\000\002\016\004\000\002" +
    "\007\006\000\002\003\003\000\002\004\006\000\002\005" +
    "\005\000\002\005\003\000\002\006\004\000\002\006\003" +
    "\000\002\017\005\000\002\017\005\000\002\017\004\000" +
    "\002\017\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\004\006\006\001\002\000\004\002\066\001" +
    "\002\000\006\004\047\006\006\001\002\000\004\022\010" +
    "\001\002\000\006\004\ufffe\006\ufffe\001\002\000\004\016" +
    "\011\001\002\000\004\007\012\001\002\000\004\021\044" +
    "\001\002\000\004\017\043\001\002\000\004\010\016\001" +
    "\002\000\004\017\ufffc\001\002\000\004\021\017\001\002" +
    "\000\004\014\020\001\002\000\006\011\024\013\021\001" +
    "\002\000\004\023\042\001\002\000\006\015\ufff8\020\ufff8" +
    "\001\002\000\006\015\040\020\037\001\002\000\006\024" +
    "\027\026\025\001\002\000\006\024\027\026\025\001\002" +
    "\000\010\012\031\025\032\027\030\001\002\000\010\012" +
    "\uffeb\025\uffeb\027\uffeb\001\002\000\006\024\027\026\025" +
    "\001\002\000\004\023\034\001\002\000\006\024\027\026" +
    "\025\001\002\000\010\012\uffee\025\uffee\027\uffee\001\002" +
    "\000\006\015\ufff7\020\ufff7\001\002\000\010\012\uffed\025" +
    "\uffed\027\uffed\001\002\000\010\012\uffec\025\uffec\027\uffec" +
    "\001\002\000\006\011\024\013\021\001\002\000\004\017" +
    "\ufffa\001\002\000\006\015\ufff9\020\ufff9\001\002\000\006" +
    "\015\ufff6\020\ufff6\001\002\000\006\004\ufffd\006\ufffd\001" +
    "\002\000\004\023\045\001\002\000\004\010\ufffb\001\002" +
    "\000\004\002\000\001\002\000\004\016\051\001\002\000" +
    "\006\004\uffff\006\uffff\001\002\000\004\005\052\001\002" +
    "\000\004\014\060\001\002\000\006\005\uffef\017\uffef\001" +
    "\002\000\004\017\057\001\002\000\006\005\052\017\ufff4" +
    "\001\002\000\006\005\ufff0\017\ufff0\001\002\000\004\002" +
    "\ufff5\001\002\000\004\022\061\001\002\000\006\015\ufff1" +
    "\020\ufff1\001\002\000\006\015\064\020\063\001\002\000" +
    "\004\022\065\001\002\000\006\005\ufff3\017\ufff3\001\002" +
    "\000\006\015\ufff2\020\ufff2\001\002\000\004\002\001\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\010\002\003\010\004\011\006\001\001\000" +
    "\002\001\001\000\006\007\045\011\047\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\012" +
    "\012\013\013\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\014\014\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\015\022\016\021\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\017\025\001\001\000\004\017\035\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\017\034\001\001\000" +
    "\002\001\001\000\004\017\032\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\016\040\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\003\053\004\052\006\054\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\004\055\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\061\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



public LinkedList<IBlock> AST = new LinkedList<>();


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ini ::= lst_strategies main 
            {
              Object RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		MainStmt m = (MainStmt)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    parser.AST.add(m);

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // lst_strategies ::= lst_strategies strategy 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lst_strategies",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // lst_strategies ::= strategy 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lst_strategies",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // strategy ::= STRATEGY ID BRACE_OPEN strategy_body BRACE_CLOSE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("strategy",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // strategy_body ::= initial_rule body_rules 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("strategy_body",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // initial_rule ::= INITIAL COLON ACTION 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("initial_rule",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // body_rules ::= RULES COLON BRACKET_OPEN lst_rules BRACKET_CLOSE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("body_rules",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // lst_rules ::= lst_rules COMMA rule_if 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lst_rules",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // lst_rules ::= rule_if 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lst_rules",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // rule_if ::= IF expr THEN ACTION 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		IExpr e = (IExpr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 
System.out.println(e.evaluar());

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("rule_if",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // rule_if ::= ELSE ACTION 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("rule_if",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // main ::= MAIN BRACE_OPEN main_inblock BRACE_CLOSE 
            {
              MainStmt RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		LinkedList<RunStmt> m = (LinkedList<RunStmt>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new MainStmt(m); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("main",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // main_inblock ::= run_lst 
            {
              LinkedList<RunStmt> RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		LinkedList<RunStmt> l = (LinkedList<RunStmt>)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = l; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("main_inblock",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // run_stmt ::= RUN BRACKET_OPEN match_lst BRACKET_CLOSE 
            {
              RunStmt RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		LinkedList<String> l = (LinkedList<String>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new RunStmt(l); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("run_stmt",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // match_lst ::= match_lst COMMA ID 
            {
              LinkedList<String> RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		LinkedList<String> l = (LinkedList<String>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = l; RESULT.add(i); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("match_lst",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // match_lst ::= ID 
            {
              LinkedList<String> RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new LinkedList<String>(); RESULT.add(i); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("match_lst",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // run_lst ::= run_lst run_stmt 
            {
              LinkedList<RunStmt> RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		LinkedList<RunStmt> l = (LinkedList<RunStmt>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		RunStmt r = (RunStmt)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = l; RESULT.add(r); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("run_lst",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // run_lst ::= run_stmt 
            {
              LinkedList<RunStmt> RESULT =null;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		RunStmt r = (RunStmt)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new LinkedList<RunStmt>(); RESULT.add(r); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("run_lst",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= expr OR expr 
            {
              IExpr RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		IExpr e1 = (IExpr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		IExpr e2 = (IExpr)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new OrExpr(e1, e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr ::= expr AND expr 
            {
              IExpr RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		IExpr e1 = (IExpr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		IExpr e2 = (IExpr)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new AndExpr(e1, e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expr ::= NOT expr 
            {
              IExpr RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		IExpr e = (IExpr)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new NotExpr(e); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expr ::= BOOLEAN 
            {
              IExpr RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new BoolTerm(b); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
