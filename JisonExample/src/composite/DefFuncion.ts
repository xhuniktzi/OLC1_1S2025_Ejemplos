import { IStmt } from "../contracts/IStmt";
import { Symbols } from "../context/Symbols";
import { TokenLocation } from "@ts-jison/common";
import { ArgsWrapper } from "../context/ArgsWrapper";

export class DefFuncion implements IStmt {
    constructor(
        private name: string,
        public args: ArgsWrapper[],
        public lst_stmt: IStmt[],
         public location: TokenLocation
    ) { }
    evaluate(context: Symbols): void {
        context.addFunction(this.name, this);
    }
}