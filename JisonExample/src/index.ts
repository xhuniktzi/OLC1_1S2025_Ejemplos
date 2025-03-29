import { Symbols } from './context/Symbols';
import { IStmt } from './contracts/IStmt';
import { grammarParser } from './grammar';

const instanceParser = new grammarParser();

const input = `
    ingresar int var1 = 10 + 3;
    imprimir var1;
    ingresar int var2 = 10 * var1;
    imprimir var2;
    imprimir 10 + var2;
`;
const ast: IStmt[] = instanceParser.parse(input);
const globalCtx = new Symbols();
for (const stmt of ast) {
    stmt.evaluate(globalCtx);
}

