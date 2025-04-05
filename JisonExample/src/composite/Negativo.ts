import { EnumTypes } from "../context/EnumTypes";
import { Symbols } from "../context/Symbols";
import { VariableWrapper } from "../context/VariableWrapper";
import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";

export class Negativo implements IExpr {
    constructor(private expr: IExpr, public location: TokenLocation) { }

    evaluate(context: Symbols): VariableWrapper {
        return {
            value: -this.expr.evaluate(context).value,
            type: EnumTypes.INT,
        }
    }
}