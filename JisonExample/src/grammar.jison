
/* description: Parses and executes mathematical expressions. */

/* lexical grammar */

%lex
%%

\s+                   /* skip whitespace */
[0-9]+("."[0-9]+)?\b  return 'NUMBER'
"*"                   return '*'
"/"                   return '/'
"-"                   return '-'
"+"                   return '+'
"^"                   return '^'
"!"                   return '!'
"%"                   return '%'
"("                   return '('
")"                   return ')'
"PI"                  return 'PI'
"E"                   return 'E'
<<EOF>>               return 'EOF'
.                     return 'INVALID'

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
import { TerminalNum } from './composite/TerminalNum';
%}

%left '+' '-'
%left '*' '/' '%'
%left '^'
%right '!'
%left UMINUS

%start expressions

%% /* language grammar */

expressions
    : e EOF
        { return $1; }
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
    | E
        {$$ = new TerminalNum(Math.E, @1);}
    | PI
        {$$ = new TerminalNum(Math.PI, @1);}
    ;
