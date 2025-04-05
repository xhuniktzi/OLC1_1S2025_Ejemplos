import { EnumTypes } from "../context/EnumTypes";

const fnSemanticRelational = (left: EnumTypes, right: EnumTypes): boolean => {
    const semanticTable = {
        [EnumTypes.INT]: {
            [EnumTypes.INT]: true,
            [EnumTypes.BOOL]: false
        },
        [EnumTypes.BOOL]: {
            [EnumTypes.INT]: false,
            [EnumTypes.BOOL]: true
        }
    }

    return semanticTable[left][right];
}

export default fnSemanticRelational;