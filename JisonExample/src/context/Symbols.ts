import { VariableWrapper } from "./VariableWrapper";

export class Symbols {
    private readonly parent: Symbols | undefined;
    private readonly symbols: Map<string, VariableWrapper> = new Map<string, VariableWrapper>();
    public constructor(parent?: Symbols) {
        this.parent = parent;
    }

    public getSymbol(name: string): VariableWrapper {
        const symbol = this.symbols.get(name);
        if (symbol) {
            return symbol;
        } else if (this.parent) {
            return this.parent.getSymbol(name);
        } else {
            throw new Error(`Semantico: Variable ${name} not found`);
        }
    }

    public setSymbol(name: string, value: VariableWrapper): void {
        this.symbols.set(name, value);
    }
}
