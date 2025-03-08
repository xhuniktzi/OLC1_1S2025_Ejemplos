import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";

export class Negativo implements IExpr {
    constructor(private expr: IExpr, public location: TokenLocation) {}

    evaluate(): number {
        return -this.expr.evaluate();
    }
}