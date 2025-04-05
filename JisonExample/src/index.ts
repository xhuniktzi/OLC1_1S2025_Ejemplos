import { Symbols } from './context/Symbols';
import { IStmt } from './contracts/IStmt';
import { grammarParser } from './grammar';

const instanceParser = new grammarParser();
instanceParser.parseError = (_err: any, hash: any) => {
    console.log(`No se esperaba el token ${hash.token} en la línea ${hash.loc.first_line} y columna ${hash.loc.last_column}`);
};

const input = `

    ingresar boolean var3 = true;
    imprimir var3;

    si (var3) {
        ingresar int var2 = 30;
        ingresar int var4 = 42;
        si (var4 > var2) {
            imprimir var2;
            imprimir var4;
        }
    }

`;
try {
    const ast: IStmt[] = instanceParser.parse(input);
    const globalCtx = new Symbols();

    for (const stmt of ast) {
        stmt.evaluate(globalCtx);
    }

} catch (error) {
    console.error(error.message);
}

