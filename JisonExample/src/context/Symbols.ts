import { DefFuncion } from "../composite/DefFuncion";
import { ArgsWrapper } from "./ArgsWrapper";
import { ObjWrapper } from "./ObjWrapper";
import { VariableWrapper } from "./VariableWrapper";


export class Symbols {
    private readonly parent: Symbols | undefined;
    private readonly symbols: Map<string, VariableWrapper> = new Map<string, VariableWrapper>();
    private readonly functions: Map<string, DefFuncion> = new Map<string, DefFuncion>();
    private readonly classes: Map<string, ArgsWrapper[]> = new Map<string, ArgsWrapper[]>();
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

    public updateSymbol(name: string, value: number): void {
        const symbol = this.symbols.get(name);
        if (symbol) {
            symbol.value = value;
        } else if (this.parent) {
            this.parent.updateSymbol(name, value);
        } else {
            throw new Error(`Semantico: Variable ${name} not found`);
        }
    }

    public addFunction(name: string, value: DefFuncion): void {
        if (this.functions.has(name)) {
            throw new Error(`Semantico: Function ${name} already exists`);
        }
        this.functions.set(name, value);
    }

    public getFunction(name: string): DefFuncion {
        const func = this.functions.get(name);
        if (func) {
            return func;
        } else if (this.parent) {
            return this.parent.getFunction(name);
        } else {
            throw new Error(`Semantico: Function ${name} not found`);
        }
    }

    public addClass(name: string, value: ArgsWrapper[]): void {
        if (this.classes.has(name)) {
            throw new Error(`Semantico: Class ${name} already exists`);
        }
        this.classes.set(name, value);
    }

    public getClass(name: string): ArgsWrapper[] {
        const cls = this.classes.get(name);
        if (cls) {
            return cls;
        } else if (this.parent) {
            return this.parent.getClass(name);
        } else {
            throw new Error(`Semantico: Class ${name} not found`);
        }
    }

}
