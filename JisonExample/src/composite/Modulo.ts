import { Symbols } from "../context/Symbols";
import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";

export class Modulo implements IExpr {
    constructor(private left: IExpr, private right: IExpr, public location: TokenLocation) {}

    evaluate(context: Symbols): number {
        return this.left.evaluate(context) % this.right.evaluate(context);
    }
}