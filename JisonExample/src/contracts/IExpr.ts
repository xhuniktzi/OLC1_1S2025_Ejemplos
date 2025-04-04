import { TokenLocation } from "@ts-jison/common";
import { Symbols } from "../context/Symbols";

export interface IExpr {
    evaluate(context: Symbols): number;
    location: TokenLocation;
}