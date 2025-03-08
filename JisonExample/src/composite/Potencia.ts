import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";

export class Potencia implements IExpr {
    constructor(private left: IExpr, private right: IExpr, public location: TokenLocation) {}

    evaluate(): number {
        return Math.pow(this.left.evaluate(), this.right.evaluate());
    }
}