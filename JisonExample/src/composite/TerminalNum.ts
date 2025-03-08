import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";


export class TerminalNum implements IExpr {
    constructor(private value: number, public location: TokenLocation) {}

    evaluate(): number {
        return this.value;
    }
}