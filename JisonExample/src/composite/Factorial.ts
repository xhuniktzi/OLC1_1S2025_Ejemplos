import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";

export class Factorial implements IExpr {
    constructor(private expr: IExpr, public location: TokenLocation) { }

    evaluate(): number {
        return this.factorial(this.expr.evaluate());
    }

    private factorial(n: number): number {
        if (n === 0) {
            return 1;
        }
        return n * this.factorial(n - 1);
    }
}