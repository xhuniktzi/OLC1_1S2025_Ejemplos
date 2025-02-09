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
PLUS = "+"
MULT = "*"
WS = [ \t\r\n]+

%%

{NUM}    { return new Symbol(sym.NUM, yyline, (int) yychar, yytext()); }
{PLUS}   { return new Symbol(sym.PLUS, yyline, (int) yychar, yytext()); }
{MULT}   { return new Symbol(sym.MULT, yyline, (int) yychar, yytext()); }
{WS}     { /* Ignorar espacios en blanco */ }

.        { System.err.println("Error lexico");}