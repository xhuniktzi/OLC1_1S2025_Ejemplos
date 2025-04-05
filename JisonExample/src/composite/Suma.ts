import { TokenLocation } from "@ts-jison/common";
import { IExpr } from "../contracts/IExpr";
import { Symbols } from "../context/Symbols";
import { EnumTypes } from "../context/EnumTypes";
import { VariableWrapper } from "../context/VariableWrapper";

export class Suma implements IExpr {
    constructor(private left: IExpr, private right: IExpr, public location: TokenLocation) { }

    evaluate(context: Symbols): VariableWrapper {
        return {
            value: this.left.evaluate(context).value + this.right.evaluate(context).value,
            type: EnumTypes.INT,
        };
    }
}