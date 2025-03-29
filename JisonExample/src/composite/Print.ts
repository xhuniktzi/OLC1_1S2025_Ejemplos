import { TokenLocation } from "@ts-jison/common";
import { Symbols } from "../context/Symbols";
import { IStmt } from "../contracts/IStmt";
import { IExpr } from "../contracts/IExpr";

export class Print implements IStmt {
    constructor(private value: IExpr, public location: TokenLocation) { }

    evaluate(context: Symbols): void {
        console.log(this.value.evaluate(context));
    }
}