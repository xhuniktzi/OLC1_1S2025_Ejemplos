import { Symbols } from './context/Symbols';
import { IStmt } from './contracts/IStmt';
import { grammarParser } from './grammar';

const instanceParser = new grammarParser();
instanceParser.parseError = (_err: any, hash: any) => {
    console.log(`No se esperaba el token ${hash.token} en la línea ${hash.loc.first_line} y columna ${hash.loc.last_column}`);
};

const input = `
class Animal {
    int age;
    boolean isAlive;
}

function suma (int a , int b) {
    imprimir a;
    imprimir b;
    return a + b;
}

ingresar int res = suma(5, 10);
imprimir res;
instanciar Animal como a1;
instanciar Animal como a2;
a1.age = 5;
a2.age = 10;

imprimir a1.age + a2.age;
`
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

