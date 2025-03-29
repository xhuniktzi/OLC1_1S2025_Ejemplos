import { TokenLocation } from "@ts-jison/common";
import { Symbols } from "../context/Symbols";

export interface IStmt {
    evaluate(context: Symbols): void;
    location: TokenLocation;
}