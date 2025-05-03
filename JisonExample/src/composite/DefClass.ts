import { IStmt } from "../contracts/IStmt";
import { Symbols } from "../context/Symbols";
import { TokenLocation } from "@ts-jison/common";
import { ArgsWrapper } from "../context/ArgsWrapper";

export class DefClass implements IStmt {
    constructor(
        private name: string,
        public args: ArgsWrapper[],
         public location: TokenLocation
    ) { }
    evaluate(context: Symbols): void {
        context.addClass(this.name, this.args);
    }
}