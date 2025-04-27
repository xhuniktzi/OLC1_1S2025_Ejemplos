import { VariableWrapper } from "../context/VariableWrapper";

export class ReturnExcept extends Error {
    public constructor(
        public readonly value: VariableWrapper,
    ) {
        super();
    }
}