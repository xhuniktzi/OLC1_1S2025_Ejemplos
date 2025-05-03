import { TokenLocation } from "@ts-jison/common";
import { Symbols } from "../context/Symbols";
import { IStmt } from "../contracts/IStmt";

export class Instanciar implements IStmt {
    constructor(
        private name: string,
        private className: string,
        public location: TokenLocation
    ) { }
    evaluate(context: Symbols): void {
        const currentClass = context.getClass(this.className);
        currentClass.forEach(arg => {
            context.setSymbol(`${this.name}.${arg.name}`, {
                type: arg.type,
                value: 0,
            });
        });
    }
}