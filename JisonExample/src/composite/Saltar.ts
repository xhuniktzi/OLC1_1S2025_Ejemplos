import { TokenLocation } from "@ts-jison/common";
import { Symbols } from "../context/Symbols";
import { IStmt } from "../contracts/IStmt";
import { BreakExcept } from "../error/BreakExcept";

export class Saltar implements IStmt {


    constructor(
        public location: TokenLocation
    ) {

    }

    evaluate(context: Symbols): void {
        throw new BreakExcept();
    }
}
