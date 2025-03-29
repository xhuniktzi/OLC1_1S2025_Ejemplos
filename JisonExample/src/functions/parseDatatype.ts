import { EnumTypes } from "../context/EnumTypes";

const fnParseDatatype = (datatype: string): EnumTypes => {
    switch (datatype) {
        case 'int':
            return EnumTypes.INT;
        case 'boolean':
            return EnumTypes.BOOL;
    }
}

export default fnParseDatatype;