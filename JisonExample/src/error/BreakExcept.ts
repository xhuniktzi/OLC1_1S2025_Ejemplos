export class BreakExcept extends Error {
    public constructor(
    ) {
        super("Break statement outside of loop");
    }
}