import { EnumTypes } from "../context/EnumTypes";
import { Symbols } from "../context/Symbols";
import { VariableWrapper } from "../context/VariableWrapper";
import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";

export class TerminalBool implements IExpr {
    constructor(private value: boolean, public location: TokenLocation) { }

    evaluate(_context: Symbols): VariableWrapper {
        return {
            value: this.value ? 1 : 0, // Convert boolean to int (1 for true, 0 for false)
            type: EnumTypes.BOOL,
        }
    }
}