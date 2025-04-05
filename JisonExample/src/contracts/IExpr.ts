import { TokenLocation } from "@ts-jison/common";
import { Symbols } from "../context/Symbols";
import { VariableWrapper } from "../context/VariableWrapper";

export interface IExpr {
    evaluate(context: Symbols): VariableWrapper;
    location: TokenLocation;
}

