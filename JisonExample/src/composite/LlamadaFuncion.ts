import { Symbols } from "../context/Symbols";
import { VariableWrapper } from "../context/VariableWrapper";
import { IExpr } from "../contracts/IExpr";
import { TokenLocation } from "@ts-jison/common";
import { ReturnExcept } from "../error/ReturnExcept";


export class LlamadaFuncion implements IExpr {
    constructor(private name: string, private lst_expr: IExpr[], public location: TokenLocation) { }

    evaluate(context: Symbols): VariableWrapper {
        const func = context.getFunction(this.name);

        try {
            const func_table = new Symbols(context);
            func.args.forEach((arg, index) => {
                const arg_value = this.lst_expr[index].evaluate(context);
                const arg_type = arg_value.type;
                if (arg_type != arg.type) {

                    throw new Error(`Semantico: Argument type mismatch in function ${this.name}`);
                }
                func_table.setSymbol(arg.name, arg_value);
            });

            func.lst_stmt.forEach((stmt) => {
                stmt.evaluate(func_table);
            });
        } catch (error) {

            if (error instanceof ReturnExcept) {
                return error.value;
            }
        }
    }
}