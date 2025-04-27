import { TokenLocation } from "@ts-jison/common";
import { Symbols } from "../context/Symbols";
import { IStmt } from "../contracts/IStmt";
import { IExpr } from "../contracts/IExpr";


export class Asignacion implements IStmt {


    constructor(
        private name: string,
        private value: IExpr,
        public location: TokenLocation
    ) {

    }

    evaluate(context: Symbols): void {
        context.updateSymbol(this.name, this.value.evaluate(context).value);
    }
}
