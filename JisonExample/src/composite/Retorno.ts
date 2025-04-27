import { Symbols } from "../context/Symbols";
import { IStmt } from "../contracts/IStmt";
import { TokenLocation } from "@ts-jison/common";
import { ReturnExcept } from "../error/ReturnExcept";
import { IExpr } from "../contracts/IExpr";

export class Retorno implements IStmt {
    constructor(
        public readonly value: IExpr,
        public readonly location: TokenLocation,
    ) { }

    evaluate(context: Symbols): void {
        throw new ReturnExcept(this.value.evaluate(context));
    }
}