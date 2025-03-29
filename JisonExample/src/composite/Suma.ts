import { TokenLocation } from "@ts-jison/common";
import { IExpr } from "../contracts/IExpr";
import { Symbols } from "../context/Symbols";

export class Suma implements IExpr {
    constructor(private left: IExpr, private right: IExpr, public location: TokenLocation) {}

    evaluate(context: Symbols): number {
        return this.left.evaluate(context) + this.right.evaluate(context);
    }
}