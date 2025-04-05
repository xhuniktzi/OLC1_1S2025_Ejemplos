import { Symbols } from "../context/Symbols";
import { VariableWrapper } from "../context/VariableWrapper";
import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";
import fnSemanticRelational from "../functions/semanticRelational";
import { EnumTypes } from "../context/EnumTypes";

export class MayorQue implements IExpr {
    constructor(private left: IExpr, private right: IExpr, public location: TokenLocation) { }

    evaluate(context: Symbols): VariableWrapper {
        if (fnSemanticRelational(this.left.evaluate(context).type,
            this.right.evaluate(context).type)) {
            return {
                value: this.left.evaluate(context).value > this.right.evaluate(context).value ? 1 : 0,
                type: EnumTypes.BOOL,
            }
        } else {
            throw new Error(`Semantico: No se puede comparar ${this.left.evaluate(context).type} con ${this.right.evaluate(context).type}`);
        }
    }

}