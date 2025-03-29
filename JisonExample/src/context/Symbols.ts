import { EnumTypes } from "./EnumTypes";

export class Symbols {
    private readonly symbols: Map<string, VariableWrapper> = new Map<string, VariableWrapper>();

    public getSymbol(name: string): VariableWrapper {
        return this.symbols.get(name);
    }

    public setSymbol(name: string, value: VariableWrapper): void {
        this.symbols.set(name, value);
    }
}

class VariableWrapper {
    constructor(public value: number, public type: EnumTypes) {}
}