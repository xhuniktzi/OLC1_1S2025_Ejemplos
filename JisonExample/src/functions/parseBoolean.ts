const fnParseBoolean = (value: string): boolean => {
    switch (value) {
        case 'true':
            return true;
        case 'false':
            return false;
        default:
            throw new Error(`Invalid boolean value: ${value}`);
    }
}

export default fnParseBoolean;