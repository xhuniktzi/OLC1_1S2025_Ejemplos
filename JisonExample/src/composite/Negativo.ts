import { Symbols } from "../context/Symbols";
import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";

export class Negativo implements IExpr {
    constructor(private expr: IExpr, public location: TokenLocation) {}

    evaluate(context: Symbols): number {
        return -this.expr.evaluate(context);
    }
}