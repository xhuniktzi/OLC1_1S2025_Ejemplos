
/* description: Parses and executes mathematical expressions. */

/* lexical grammar */

%lex
%%

\s+                   /* skip whitespace */
[0-9]+("."[0-9]+)?\b  return 'NUMBER'
true|false            return 'BOOLEAN'
";"                   return ';'
"="                   return '='
"*"                   return '*'
"/"                   return '/'
"-"                   return '-'
"+"                   return '+'
"^"                   return '^'
"!"                   return '!'
"%"                   return '%'
"("                   return '('
")"                   return ')'
"{"                   return '{'	
"}"                   return '}'
">"                   return '>'
"PI"                  return 'PI'
"E"                   return 'E'
"ingresar"            return 'INGRESAR'
"imprimir"            return 'IMPRIMIR'
"si"                  return 'SI'
"int"                 return 'TYPE'
"boolean"             return 'TYPE'
[0-9a-zA-Z_]+         return 'IDENTIFIER';
<<EOF>>               return 'EOF'
.                     {
                           console.error('Lexico: Unexpected character ' + yytext);
                        }


/lex

/* operator associations and precedence */
%{
import { Division } from './composite/Division';
import { Factorial } from './composite/Factorial';
import { Modulo } from './composite/Modulo';
import { Negativo } from './composite/Negativo';
import { Potencia } from './composite/Potencia';
import { Producto } from './composite/Producto';
import { Resta } from './composite/Resta';
import { Suma } from './composite/Suma';
import { MayorQue } from './composite/MayorQue';
import { Condicional } from './composite/Condicional';
import { TerminalNum } from './composite/TerminalNum';
import { TerminalBool } from './composite/TerminalBool';
import { Declaration } from './composite/Declaration';
import { VariableRef } from './composite/VariableRef';
import { Print } from './composite/Print';
import fnParseDatatype from './functions/parseDatatype';
import fnParseBoolean from './functions/parseBoolean';

%}
%left '>'
%left '+' '-'
%left '*' '/' '%'
%nonassoc '^'
%right '!'
%left UMINUS

%start inicio

%% /* language grammar */

inicio : instructions EOF
        { return $1; }
        ;

instructions : instructions instruction
                { $$ = $1; $$.push($2); }
             | instruction
             { $$ = []; $$[0] = $1; }
             ;

instruction : declaration ';'
    { $$ = $1; }
    | print ';'
    { $$ = $1; }
    | if 
    { $$ = $1; }
    ;

declaration : INGRESAR TYPE IDENTIFIER '=' e
    { $$ = new Declaration(fnParseDatatype($2), $3, $5, @1); }
    ;

print : IMPRIMIR e
    { $$ = new Print($2, @1); }
    ;

if : SI '(' e ')' '{' instructions '}'
    { $$ = new Condicional($3, $6, @1); }
    ;

e
    : e '+' e
        {$$ = new Suma($1, $3, @1);}
    | e '-' e
        {$$ = new Resta($1, $3, @1);}
    | e '*' e
        {$$ = new Producto($1, $3, @1);}
    | e '/' e
        {$$ = new Division($1, $3, @1);}
    | e '^' e
        {$$ = new Potencia($1, $3, @1);}
    | e '!'
        {{
          $$ = new Factorial($1, @1);
        }}
    | e '%' e
        {$$ = new Modulo($1, $3, @1);}
    | '-' e %prec UMINUS
        {$$ = new Negativo($2, @1);}
    | '(' e ')'
        {$$ = $2;}
    | NUMBER
        {$$ = new TerminalNum(Number(yytext), @1);}
    | BOOLEAN
        {$$ = new TerminalBool(fnParseBoolean(yytext), @1);}
    | E
        {$$ = new TerminalNum(Math.E, @1);}
    | PI
        {$$ = new TerminalNum(Math.PI, @1);}
    | IDENTIFIER
        {$$ = new VariableRef($1, @1);}
    | e '>' e
        {$$ = new MayorQue($1, $3, @1);}
    ;
