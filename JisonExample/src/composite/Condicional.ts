import { TokenLocation } from "@ts-jison/common";
import { Symbols } from "../context/Symbols";
import { IStmt } from "../contracts/IStmt";
import { IExpr } from "../contracts/IExpr";


export class Condicional implements IStmt {


    constructor(
        private condition: IExpr,
        private trueBranch: IStmt[],
        public location: TokenLocation
    ) {

    }

    evaluate(context: Symbols): void {
        const internalCtx = new Symbols(context);
        if (this.condition.evaluate(context).value) {
            for (const stmt of this.trueBranch) {
                stmt.evaluate(internalCtx);
            }
        }
    }
}
