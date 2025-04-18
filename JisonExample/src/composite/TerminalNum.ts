import { EnumTypes } from "../context/EnumTypes";
import { Symbols } from "../context/Symbols";
import { VariableWrapper } from "../context/VariableWrapper";
import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";


export class TerminalNum implements IExpr {
    constructor(private value: number, public location: TokenLocation) { }

    evaluate(_context: Symbols): VariableWrapper {
        return {
            value: this.value,
            type: EnumTypes.INT,
        }
    }
}