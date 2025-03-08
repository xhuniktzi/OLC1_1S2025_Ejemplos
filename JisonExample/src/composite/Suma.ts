import { TokenLocation } from "@ts-jison/common";
import { IExpr } from "../contracts/IExpr";

export class Suma implements IExpr {
    constructor(private left: IExpr, private right: IExpr, public location: TokenLocation) {}

    evaluate(): number {
        return this.left.evaluate() + this.right.evaluate();
    }
}