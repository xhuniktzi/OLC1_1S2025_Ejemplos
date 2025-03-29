import { Symbols } from "../context/Symbols";
import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";

export class Potencia implements IExpr {
    constructor(private left: IExpr, private right: IExpr, public location: TokenLocation) {}

    evaluate(context: Symbols): number {
        return Math.pow(this.left.evaluate(context), this.right.evaluate(context));
    }
}