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


NUM = [0-9]+
ID = [0-9A-Za-z_]+

WS = [ \t\r\n]+

%%

"main"   { return new Symbol(sym.MAIN, yyline, (int) yychar, yytext()); }
"run"   { return new Symbol(sym.RUN, yyline, (int) yychar, yytext()); }
"with"   { return new Symbol(sym.WITH, yyline, (int) yychar, yytext()); }
"seed"   { return new Symbol(sym.SEED, yyline, (int) yychar, yytext()); }

"[" { return new Symbol(sym.BRACKET_OPEN, yyline, (int) yychar, yytext()); }
"]" { return new Symbol(sym.BRACKET_CLOSE, yyline, (int) yychar, yytext()); }
"{" { return new Symbol(sym.BRACE_OPEN, yyline, (int) yychar, yytext()); }
"}" { return new Symbol(sym.BRACE_CLOSE, yyline, (int) yychar, yytext()); }
":" { return new Symbol(sym.COLON, yyline, (int) yychar, yytext()); }
"," { return new Symbol(sym.COMMA, yyline, (int) yychar, yytext()); }

{NUM}    { return new Symbol(sym.NUM, yyline, (int) yychar, yytext()); }
{ID}    { return new Symbol(sym.ID, yyline, (int) yychar, yytext()); }

{WS}     { /* Ignorar espacios en blanco */ }

.        { System.err.println("Error lexico");}