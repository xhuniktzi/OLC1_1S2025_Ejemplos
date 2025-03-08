import { IExpr } from './contracts/IExpr';
import { grammarParser } from './grammar';

const instanceParser = new grammarParser();

const ast: IExpr = instanceParser.parse('((2+123)-100)*((1+2*3)*PI)');
console.log(ast.evaluate()); // 0