import { Symbols } from "../context/Symbols";
import { VariableWrapper } from "../context/VariableWrapper";
import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";


export class VariableRef implements IExpr {
    constructor(private name: string, public location: TokenLocation) { }

    evaluate(context: Symbols): VariableWrapper {
        return {
            value: context.getSymbol(this.name)?.value,
            type: context.getSymbol(this.name)?.type,
        }
    }
}