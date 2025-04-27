import { TokenLocation } from "@ts-jison/common";
import { IExpr } from "../contracts/IExpr";
import { IStmt } from "../contracts/IStmt";
import { Symbols } from "../context/Symbols";
import { EnumTypes } from "../context/EnumTypes";

export class Declaration implements IStmt {
    constructor(private type: EnumTypes, private name: string, private value: IExpr, public location: TokenLocation) { }

    evaluate(context: Symbols): void {
        const t = this.value.evaluate(context);
        context.setSymbol(this.name, {
            type: this.type,
            value: t.value,
        });
    }
}