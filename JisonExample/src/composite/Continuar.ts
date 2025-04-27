import { TokenLocation } from "@ts-jison/common";
import { Symbols } from "../context/Symbols";
import { IStmt } from "../contracts/IStmt";
import { ContinueExcept } from "../error/ContinueExcept";

export class Continuar implements IStmt {


    constructor(
        public location: TokenLocation
    ) {

    }

    evaluate(context: Symbols): void {
        throw new ContinueExcept();
    }
}
