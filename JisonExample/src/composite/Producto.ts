import { EnumTypes } from "../context/EnumTypes";
import { Symbols } from "../context/Symbols";
import { VariableWrapper } from "../context/VariableWrapper";
import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";

export class Producto implements IExpr {
    constructor(private left: IExpr, private right: IExpr, public location: TokenLocation) { }

    evaluate(context: Symbols): VariableWrapper {
        return {
            value: this.left.evaluate(context).value * this.right.evaluate(context).value,
            type: EnumTypes.INT,
        };
    }
}