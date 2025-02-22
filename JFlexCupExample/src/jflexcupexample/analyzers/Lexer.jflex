package jflexcupexample.analyzers;

import java_cup.runtime.Symbol;

%%

%class Lexer
%public
%unicode
%cup
%line
%char

%{
  
%}

ACTION = C|D
BOOLEAN = True|False
ID = [0-9A-Za-z_]+
WS = [ \t\r\n]+


%%

"main"   { return new Symbol(sym.MAIN, yyline, (int) yychar, yytext()); }
"run"   { return new Symbol(sym.RUN, yyline, (int) yychar, yytext()); }

"strategy"   { return new Symbol(sym.STRATEGY, yyline, (int) yychar, yytext()); }
"initial"   { return new Symbol(sym.INITIAL, yyline, (int) yychar, yytext()); }
"rules"   { return new Symbol(sym.RULES, yyline, (int) yychar, yytext()); }
"if"   { return new Symbol(sym.IF, yyline, (int) yychar, yytext()); }
"then"   { return new Symbol(sym.THEN, yyline, (int) yychar, yytext()); }
"else"   { return new Symbol(sym.ELSE, yyline, (int) yychar, yytext()); }

"&&" { return new Symbol(sym.AND, yyline, (int) yychar, yytext()); }
"||" { return new Symbol(sym.OR, yyline, (int) yychar, yytext()); }
"!" { return new Symbol(sym.NOT, yyline, (int) yychar, yytext()); }

"[" { return new Symbol(sym.BRACKET_OPEN, yyline, (int) yychar, yytext()); }
"]" { return new Symbol(sym.BRACKET_CLOSE, yyline, (int) yychar, yytext()); }
"{" { return new Symbol(sym.BRACE_OPEN, yyline, (int) yychar, yytext()); }
"}" { return new Symbol(sym.BRACE_CLOSE, yyline, (int) yychar, yytext()); }
"(" { return new Symbol(sym.PARENTESIS_OPEN, yyline, (int) yychar, yytext()); }
")" { return new Symbol(sym.PARENTESIS_CLOSE, yyline, (int) yychar, yytext()); }
"," { return new Symbol(sym.COMMA, yyline, (int) yychar, yytext()); }
":" { return new Symbol(sym.COLON, yyline, (int) yychar, yytext()); }

{BOOLEAN}    { return new Symbol(sym.BOOLEAN, yyline, (int) yychar, yytext()); }
{ACTION}    { return new Symbol(sym.ACTION, yyline, (int) yychar, yytext()); }
{ID}    { return new Symbol(sym.ID, yyline, (int) yychar, yytext()); }


{WS}     { /* Ignorar espacios en blanco */ }

.        { System.err.println("Error lexico");}