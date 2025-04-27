import { Symbols } from './context/Symbols';
import { IStmt } from './contracts/IStmt';
import { grammarParser } from './grammar';

const instanceParser = new grammarParser();
instanceParser.parseError = (_err: any, hash: any) => {
    console.log(`No se esperaba el token ${hash.token} en la línea ${hash.loc.first_line} y columna ${hash.loc.last_column}`);
};

const input = `


function suma (int a , int b) {
    imprimir a;
    imprimir b;
    return a + b;
}

ingresar int res = suma(5, 10);
imprimir res;
`;
try {
    const ast: IStmt[] = instanceParser.parse(input);
    const globalCtx = new Symbols();

    for (const stmt of ast) {
        stmt.evaluate(globalCtx);
    }

} catch (error) {
    console.error(error.stack);
    console.error(error.message);
}

