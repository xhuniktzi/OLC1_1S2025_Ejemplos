import { Symbols } from "../context/Symbols";
import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";

export class Factorial implements IExpr {
    constructor(private expr: IExpr, public location: TokenLocation) { }

    evaluate(context: Symbols): number {
        return this.factorial(this.expr.evaluate(context));
    }

    private factorial(n: number): number {
        if (n === 0) {
            return 1;
        }
        return n * this.factorial(n - 1);
    }
}