import { Symbols } from "../context/Symbols";
import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";


export class VariableRef implements IExpr {
    constructor(private name: string, public location: TokenLocation) {}

    evaluate(context: Symbols): number {
        return context.getSymbol(this.name).value;
    }
}