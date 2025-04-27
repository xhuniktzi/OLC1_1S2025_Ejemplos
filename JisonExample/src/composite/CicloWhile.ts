import { TokenLocation } from "@ts-jison/common";
import { Symbols } from "../context/Symbols";
import { IStmt } from "../contracts/IStmt";
import { IExpr } from "../contracts/IExpr";
import { ContinueExcept } from "../error/ContinueExcept";
import { BreakExcept } from "../error/BreakExcept";


export class CicloWhile implements IStmt {


    constructor(
        private condition: IExpr,
        private instructions: IStmt[],
        public location: TokenLocation
    ) {

    }

    evaluate(context: Symbols): void {
        while (this.condition.evaluate(context).value) {
            try {
                const internalCtx = new Symbols(context);
                for (const stmt of this.instructions) {
                    stmt.evaluate(internalCtx);
                }
            } catch (error: unknown) {
                if (error instanceof ContinueExcept) {
                    continue;
                } else if (error instanceof BreakExcept) {
                    break;
                }
            }

        }
    }
}
