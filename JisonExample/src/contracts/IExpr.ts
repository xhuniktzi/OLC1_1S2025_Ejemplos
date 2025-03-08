import { TokenLocation } from "@ts-jison/common";

export interface IExpr {
    evaluate(): number;
    location: TokenLocation;
}