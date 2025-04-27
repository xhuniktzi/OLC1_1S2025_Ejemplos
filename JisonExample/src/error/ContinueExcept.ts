export class ContinueExcept extends Error {
    public constructor(
    ) {
        super("Continue statement outside of loop");
    }
}