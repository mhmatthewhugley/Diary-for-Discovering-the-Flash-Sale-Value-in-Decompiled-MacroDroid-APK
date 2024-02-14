package com.android.p023dx.rop.code;

import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.rop.type.Prototype;
import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeBearer;
import com.android.p023dx.rop.type.TypeList;

/* renamed from: com.android.dx.rop.code.Rops */
public final class Rops {
    public static final Rop ADD_CONST_DOUBLE;
    public static final Rop ADD_CONST_FLOAT;
    public static final Rop ADD_CONST_INT;
    public static final Rop ADD_CONST_LONG;
    public static final Rop ADD_DOUBLE;
    public static final Rop ADD_FLOAT;
    public static final Rop ADD_INT;
    public static final Rop ADD_LONG;
    public static final Rop AGET_BOOLEAN;
    public static final Rop AGET_BYTE;
    public static final Rop AGET_CHAR;
    public static final Rop AGET_DOUBLE;
    public static final Rop AGET_FLOAT;
    public static final Rop AGET_INT;
    public static final Rop AGET_LONG;
    public static final Rop AGET_OBJECT;
    public static final Rop AGET_SHORT;
    public static final Rop AND_CONST_INT;
    public static final Rop AND_CONST_LONG;
    public static final Rop AND_INT;
    public static final Rop AND_LONG;
    public static final Rop APUT_BOOLEAN;
    public static final Rop APUT_BYTE;
    public static final Rop APUT_CHAR;
    public static final Rop APUT_DOUBLE;
    public static final Rop APUT_FLOAT;
    public static final Rop APUT_INT;
    public static final Rop APUT_LONG;
    public static final Rop APUT_OBJECT;
    public static final Rop APUT_SHORT;
    public static final Rop ARRAY_LENGTH;
    public static final Rop CHECK_CAST;
    public static final Rop CMPG_DOUBLE;
    public static final Rop CMPG_FLOAT;
    public static final Rop CMPL_DOUBLE;
    public static final Rop CMPL_FLOAT;
    public static final Rop CMPL_LONG;
    public static final Rop CONST_DOUBLE;
    public static final Rop CONST_FLOAT;
    public static final Rop CONST_INT;
    public static final Rop CONST_LONG;
    public static final Rop CONST_OBJECT;
    public static final Rop CONST_OBJECT_NOTHROW;
    public static final Rop CONV_D2F;
    public static final Rop CONV_D2I;
    public static final Rop CONV_D2L;
    public static final Rop CONV_F2D;
    public static final Rop CONV_F2I;
    public static final Rop CONV_F2L;
    public static final Rop CONV_I2D;
    public static final Rop CONV_I2F;
    public static final Rop CONV_I2L;
    public static final Rop CONV_L2D;
    public static final Rop CONV_L2F;
    public static final Rop CONV_L2I;
    public static final Rop DIV_CONST_DOUBLE;
    public static final Rop DIV_CONST_FLOAT;
    public static final Rop DIV_CONST_INT;
    public static final Rop DIV_CONST_LONG;
    public static final Rop DIV_DOUBLE;
    public static final Rop DIV_FLOAT;
    public static final Rop DIV_INT;
    public static final Rop DIV_LONG;
    public static final Rop FILL_ARRAY_DATA;
    public static final Rop GET_FIELD_BOOLEAN;
    public static final Rop GET_FIELD_BYTE;
    public static final Rop GET_FIELD_CHAR;
    public static final Rop GET_FIELD_DOUBLE;
    public static final Rop GET_FIELD_FLOAT;
    public static final Rop GET_FIELD_INT;
    public static final Rop GET_FIELD_LONG;
    public static final Rop GET_FIELD_OBJECT;
    public static final Rop GET_FIELD_SHORT;
    public static final Rop GET_STATIC_BOOLEAN;
    public static final Rop GET_STATIC_BYTE;
    public static final Rop GET_STATIC_CHAR;
    public static final Rop GET_STATIC_DOUBLE;
    public static final Rop GET_STATIC_FLOAT;
    public static final Rop GET_STATIC_INT;
    public static final Rop GET_STATIC_LONG;
    public static final Rop GET_STATIC_OBJECT;
    public static final Rop GET_STATIC_SHORT;
    public static final Rop GOTO;
    public static final Rop IF_EQZ_INT;
    public static final Rop IF_EQZ_OBJECT;
    public static final Rop IF_EQ_INT;
    public static final Rop IF_EQ_OBJECT;
    public static final Rop IF_GEZ_INT;
    public static final Rop IF_GE_INT;
    public static final Rop IF_GTZ_INT;
    public static final Rop IF_GT_INT;
    public static final Rop IF_LEZ_INT;
    public static final Rop IF_LE_INT;
    public static final Rop IF_LTZ_INT;
    public static final Rop IF_LT_INT;
    public static final Rop IF_NEZ_INT;
    public static final Rop IF_NEZ_OBJECT;
    public static final Rop IF_NE_INT;
    public static final Rop IF_NE_OBJECT;
    public static final Rop INSTANCE_OF;
    public static final Rop MARK_LOCAL_DOUBLE;
    public static final Rop MARK_LOCAL_FLOAT;
    public static final Rop MARK_LOCAL_INT;
    public static final Rop MARK_LOCAL_LONG;
    public static final Rop MARK_LOCAL_OBJECT;
    public static final Rop MONITOR_ENTER;
    public static final Rop MONITOR_EXIT;
    public static final Rop MOVE_DOUBLE;
    public static final Rop MOVE_FLOAT;
    public static final Rop MOVE_INT;
    public static final Rop MOVE_LONG;
    public static final Rop MOVE_OBJECT;
    public static final Rop MOVE_PARAM_DOUBLE;
    public static final Rop MOVE_PARAM_FLOAT;
    public static final Rop MOVE_PARAM_INT;
    public static final Rop MOVE_PARAM_LONG;
    public static final Rop MOVE_PARAM_OBJECT;
    public static final Rop MOVE_RETURN_ADDRESS = new Rop(2, Type.RETURN_ADDRESS, StdTypeList.RETURN_ADDRESS, "move-return-address");
    public static final Rop MUL_CONST_DOUBLE;
    public static final Rop MUL_CONST_FLOAT;
    public static final Rop MUL_CONST_INT;
    public static final Rop MUL_CONST_LONG;
    public static final Rop MUL_DOUBLE;
    public static final Rop MUL_FLOAT;
    public static final Rop MUL_INT;
    public static final Rop MUL_LONG;
    public static final Rop NEG_DOUBLE;
    public static final Rop NEG_FLOAT;
    public static final Rop NEG_INT;
    public static final Rop NEG_LONG;
    public static final Rop NEW_ARRAY_BOOLEAN;
    public static final Rop NEW_ARRAY_BYTE;
    public static final Rop NEW_ARRAY_CHAR;
    public static final Rop NEW_ARRAY_DOUBLE;
    public static final Rop NEW_ARRAY_FLOAT;
    public static final Rop NEW_ARRAY_INT;
    public static final Rop NEW_ARRAY_LONG;
    public static final Rop NEW_ARRAY_SHORT;
    public static final Rop NEW_INSTANCE;
    public static final Rop NOP;
    public static final Rop NOT_INT;
    public static final Rop NOT_LONG;
    public static final Rop OR_CONST_INT;
    public static final Rop OR_CONST_LONG;
    public static final Rop OR_INT;
    public static final Rop OR_LONG;
    public static final Rop PUT_FIELD_BOOLEAN;
    public static final Rop PUT_FIELD_BYTE;
    public static final Rop PUT_FIELD_CHAR;
    public static final Rop PUT_FIELD_DOUBLE;
    public static final Rop PUT_FIELD_FLOAT;
    public static final Rop PUT_FIELD_INT;
    public static final Rop PUT_FIELD_LONG;
    public static final Rop PUT_FIELD_OBJECT;
    public static final Rop PUT_FIELD_SHORT;
    public static final Rop PUT_STATIC_BOOLEAN;
    public static final Rop PUT_STATIC_BYTE;
    public static final Rop PUT_STATIC_CHAR;
    public static final Rop PUT_STATIC_DOUBLE;
    public static final Rop PUT_STATIC_FLOAT;
    public static final Rop PUT_STATIC_INT;
    public static final Rop PUT_STATIC_LONG;
    public static final Rop PUT_STATIC_OBJECT;
    public static final Rop PUT_STATIC_SHORT;
    public static final Rop REM_CONST_DOUBLE;
    public static final Rop REM_CONST_FLOAT;
    public static final Rop REM_CONST_INT;
    public static final Rop REM_CONST_LONG;
    public static final Rop REM_DOUBLE;
    public static final Rop REM_FLOAT;
    public static final Rop REM_INT;
    public static final Rop REM_LONG;
    public static final Rop RETURN_DOUBLE;
    public static final Rop RETURN_FLOAT;
    public static final Rop RETURN_INT;
    public static final Rop RETURN_LONG;
    public static final Rop RETURN_OBJECT;
    public static final Rop RETURN_VOID;
    public static final Rop SHL_CONST_INT;
    public static final Rop SHL_CONST_LONG;
    public static final Rop SHL_INT;
    public static final Rop SHL_LONG;
    public static final Rop SHR_CONST_INT;
    public static final Rop SHR_CONST_LONG;
    public static final Rop SHR_INT;
    public static final Rop SHR_LONG;
    public static final Rop SUB_CONST_DOUBLE;
    public static final Rop SUB_CONST_FLOAT;
    public static final Rop SUB_CONST_INT;
    public static final Rop SUB_CONST_LONG;
    public static final Rop SUB_DOUBLE;
    public static final Rop SUB_FLOAT;
    public static final Rop SUB_INT;
    public static final Rop SUB_LONG;
    public static final Rop SWITCH;
    public static final Rop THROW;
    public static final Rop TO_BYTE;
    public static final Rop TO_CHAR;
    public static final Rop TO_SHORT;
    public static final Rop USHR_CONST_INT;
    public static final Rop USHR_CONST_LONG;
    public static final Rop USHR_INT;
    public static final Rop USHR_LONG;
    public static final Rop XOR_CONST_INT;
    public static final Rop XOR_CONST_LONG;
    public static final Rop XOR_INT;
    public static final Rop XOR_LONG;

    static {
        Type type = Type.VOID;
        StdTypeList stdTypeList = StdTypeList.EMPTY;
        NOP = new Rop(1, type, stdTypeList, "nop");
        Type type2 = Type.INT;
        StdTypeList stdTypeList2 = StdTypeList.INT;
        MOVE_INT = new Rop(2, type2, stdTypeList2, "move-int");
        Type type3 = Type.LONG;
        StdTypeList stdTypeList3 = StdTypeList.LONG;
        MOVE_LONG = new Rop(2, type3, stdTypeList3, "move-long");
        Type type4 = Type.FLOAT;
        StdTypeList stdTypeList4 = StdTypeList.FLOAT;
        MOVE_FLOAT = new Rop(2, type4, stdTypeList4, "move-float");
        Type type5 = Type.DOUBLE;
        StdTypeList stdTypeList5 = StdTypeList.DOUBLE;
        MOVE_DOUBLE = new Rop(2, type5, stdTypeList5, "move-double");
        Type type6 = Type.OBJECT;
        StdTypeList stdTypeList6 = StdTypeList.OBJECT;
        MOVE_OBJECT = new Rop(2, type6, stdTypeList6, "move-object");
        MOVE_PARAM_INT = new Rop(3, type2, stdTypeList, "move-param-int");
        MOVE_PARAM_LONG = new Rop(3, type3, stdTypeList, "move-param-long");
        MOVE_PARAM_FLOAT = new Rop(3, type4, stdTypeList, "move-param-float");
        MOVE_PARAM_DOUBLE = new Rop(3, type5, stdTypeList, "move-param-double");
        MOVE_PARAM_OBJECT = new Rop(3, type6, stdTypeList, "move-param-object");
        CONST_INT = new Rop(5, type2, stdTypeList, "const-int");
        CONST_LONG = new Rop(5, type3, stdTypeList, "const-long");
        CONST_FLOAT = new Rop(5, type4, stdTypeList, "const-float");
        CONST_DOUBLE = new Rop(5, type5, stdTypeList, "const-double");
        StdTypeList stdTypeList7 = Exceptions.LIST_Error;
        StdTypeList stdTypeList8 = stdTypeList6;
        StdTypeList stdTypeList9 = stdTypeList;
        StdTypeList stdTypeList10 = stdTypeList4;
        Type type7 = type6;
        StdTypeList stdTypeList11 = stdTypeList5;
        CONST_OBJECT = new Rop(5, type6, (TypeList) stdTypeList9, (TypeList) stdTypeList7, "const-object");
        CONST_OBJECT_NOTHROW = new Rop(5, type7, stdTypeList, "const-object-nothrow");
        Type type8 = type;
        GOTO = new Rop(6, type8, (TypeList) stdTypeList9, 3, "goto");
        StdTypeList stdTypeList12 = stdTypeList2;
        IF_EQZ_INT = new Rop(7, type8, (TypeList) stdTypeList12, 4, "if-eqz-int");
        IF_NEZ_INT = new Rop(8, type8, (TypeList) stdTypeList12, 4, "if-nez-int");
        IF_LTZ_INT = new Rop(9, type8, (TypeList) stdTypeList12, 4, "if-ltz-int");
        IF_GEZ_INT = new Rop(10, type8, (TypeList) stdTypeList12, 4, "if-gez-int");
        IF_LEZ_INT = new Rop(11, type8, (TypeList) stdTypeList12, 4, "if-lez-int");
        IF_GTZ_INT = new Rop(12, type8, (TypeList) stdTypeList12, 4, "if-gtz-int");
        StdTypeList stdTypeList13 = stdTypeList8;
        IF_EQZ_OBJECT = new Rop(7, type8, (TypeList) stdTypeList13, 4, "if-eqz-object");
        IF_NEZ_OBJECT = new Rop(8, type8, (TypeList) stdTypeList13, 4, "if-nez-object");
        StdTypeList stdTypeList14 = StdTypeList.INT_INT;
        StdTypeList stdTypeList15 = stdTypeList14;
        IF_EQ_INT = new Rop(7, type8, (TypeList) stdTypeList14, 4, "if-eq-int");
        StdTypeList stdTypeList16 = stdTypeList15;
        IF_NE_INT = new Rop(8, type8, (TypeList) stdTypeList16, 4, "if-ne-int");
        IF_LT_INT = new Rop(9, type8, (TypeList) stdTypeList16, 4, "if-lt-int");
        IF_GE_INT = new Rop(10, type8, (TypeList) stdTypeList16, 4, "if-ge-int");
        IF_LE_INT = new Rop(11, type8, (TypeList) stdTypeList16, 4, "if-le-int");
        IF_GT_INT = new Rop(12, type8, (TypeList) stdTypeList16, 4, "if-gt-int");
        StdTypeList stdTypeList17 = StdTypeList.OBJECT_OBJECT;
        StdTypeList stdTypeList18 = stdTypeList17;
        IF_EQ_OBJECT = new Rop(7, type8, (TypeList) stdTypeList18, 4, "if-eq-object");
        IF_NE_OBJECT = new Rop(8, type8, (TypeList) stdTypeList18, 4, "if-ne-object");
        SWITCH = new Rop(13, type8, (TypeList) stdTypeList2, 5, "switch");
        StdTypeList stdTypeList19 = stdTypeList15;
        ADD_INT = new Rop(14, type2, stdTypeList19, "add-int");
        StdTypeList stdTypeList20 = StdTypeList.LONG_LONG;
        ADD_LONG = new Rop(14, type3, stdTypeList20, "add-long");
        StdTypeList stdTypeList21 = StdTypeList.FLOAT_FLOAT;
        ADD_FLOAT = new Rop(14, type4, stdTypeList21, "add-float");
        StdTypeList stdTypeList22 = StdTypeList.DOUBLE_DOUBLE;
        Type type9 = type5;
        StdTypeList stdTypeList23 = stdTypeList22;
        ADD_DOUBLE = new Rop(14, type9, (TypeList) stdTypeList23, 1, "add-double");
        SUB_INT = new Rop(15, type2, stdTypeList19, "sub-int");
        SUB_LONG = new Rop(15, type3, stdTypeList20, "sub-long");
        SUB_FLOAT = new Rop(15, type4, stdTypeList21, "sub-float");
        SUB_DOUBLE = new Rop(15, type9, (TypeList) stdTypeList23, 1, "sub-double");
        MUL_INT = new Rop(16, type2, stdTypeList19, "mul-int");
        MUL_LONG = new Rop(16, type3, stdTypeList20, "mul-long");
        MUL_FLOAT = new Rop(16, type4, stdTypeList21, "mul-float");
        MUL_DOUBLE = new Rop(16, type9, (TypeList) stdTypeList23, 1, "mul-double");
        StdTypeList stdTypeList24 = Exceptions.LIST_Error_ArithmeticException;
        StdTypeList stdTypeList25 = stdTypeList22;
        StdTypeList stdTypeList26 = stdTypeList21;
        StdTypeList stdTypeList27 = stdTypeList20;
        StdTypeList stdTypeList28 = stdTypeList19;
        DIV_INT = new Rop(17, type2, (TypeList) stdTypeList19, (TypeList) stdTypeList24, "div-int");
        Type type10 = type5;
        Type type11 = type7;
        Type type12 = type4;
        StdTypeList stdTypeList29 = stdTypeList3;
        DIV_LONG = new Rop(17, type3, (TypeList) stdTypeList27, (TypeList) stdTypeList24, "div-long");
        StdTypeList stdTypeList30 = stdTypeList26;
        DIV_FLOAT = new Rop(17, type12, stdTypeList30, "div-float");
        StdTypeList stdTypeList31 = stdTypeList25;
        DIV_DOUBLE = new Rop(17, type10, stdTypeList31, "div-double");
        Type type13 = type12;
        StdTypeList stdTypeList32 = stdTypeList10;
        StdTypeList stdTypeList33 = stdTypeList;
        Type type14 = type10;
        REM_INT = new Rop(18, type2, (TypeList) stdTypeList28, (TypeList) stdTypeList24, "rem-int");
        StdTypeList stdTypeList34 = stdTypeList29;
        StdTypeList stdTypeList35 = stdTypeList31;
        Type type15 = type3;
        StdTypeList stdTypeList36 = stdTypeList30;
        REM_LONG = new Rop(18, type15, (TypeList) stdTypeList27, (TypeList) stdTypeList24, "rem-long");
        Type type16 = type13;
        REM_FLOAT = new Rop(18, type16, stdTypeList36, "rem-float");
        REM_DOUBLE = new Rop(18, type14, stdTypeList35, "rem-double");
        NEG_INT = new Rop(19, type2, stdTypeList2, "neg-int");
        NEG_LONG = new Rop(19, type15, stdTypeList34, "neg-long");
        StdTypeList stdTypeList37 = stdTypeList32;
        NEG_FLOAT = new Rop(19, type16, stdTypeList37, "neg-float");
        StdTypeList stdTypeList38 = stdTypeList11;
        NEG_DOUBLE = new Rop(19, type14, stdTypeList38, "neg-double");
        StdTypeList stdTypeList39 = stdTypeList28;
        AND_INT = new Rop(20, type2, stdTypeList39, "and-int");
        Type type17 = type;
        StdTypeList stdTypeList40 = stdTypeList27;
        AND_LONG = new Rop(20, type15, stdTypeList40, "and-long");
        OR_INT = new Rop(21, type2, stdTypeList39, "or-int");
        OR_LONG = new Rop(21, type15, stdTypeList40, "or-long");
        XOR_INT = new Rop(22, type2, stdTypeList39, "xor-int");
        XOR_LONG = new Rop(22, type15, stdTypeList40, "xor-long");
        SHL_INT = new Rop(23, type2, stdTypeList39, "shl-int");
        StdTypeList stdTypeList41 = StdTypeList.LONG_INT;
        SHL_LONG = new Rop(23, type15, stdTypeList41, "shl-long");
        SHR_INT = new Rop(24, type2, stdTypeList39, "shr-int");
        SHR_LONG = new Rop(24, type15, stdTypeList41, "shr-long");
        USHR_INT = new Rop(25, type2, stdTypeList39, "ushr-int");
        USHR_LONG = new Rop(25, type15, stdTypeList41, "ushr-long");
        NOT_INT = new Rop(26, type2, stdTypeList2, "not-int");
        NOT_LONG = new Rop(26, type15, stdTypeList34, "not-long");
        ADD_CONST_INT = new Rop(14, type2, stdTypeList2, "add-const-int");
        ADD_CONST_LONG = new Rop(14, type15, stdTypeList34, "add-const-long");
        ADD_CONST_FLOAT = new Rop(14, type16, stdTypeList37, "add-const-float");
        ADD_CONST_DOUBLE = new Rop(14, type14, stdTypeList38, "add-const-double");
        SUB_CONST_INT = new Rop(15, type2, stdTypeList2, "sub-const-int");
        SUB_CONST_LONG = new Rop(15, type15, stdTypeList34, "sub-const-long");
        SUB_CONST_FLOAT = new Rop(15, type16, stdTypeList37, "sub-const-float");
        SUB_CONST_DOUBLE = new Rop(15, type14, stdTypeList38, "sub-const-double");
        MUL_CONST_INT = new Rop(16, type2, stdTypeList2, "mul-const-int");
        MUL_CONST_LONG = new Rop(16, type15, stdTypeList34, "mul-const-long");
        MUL_CONST_FLOAT = new Rop(16, type16, stdTypeList37, "mul-const-float");
        MUL_CONST_DOUBLE = new Rop(16, type14, stdTypeList38, "mul-const-double");
        StdTypeList stdTypeList42 = stdTypeList36;
        StdTypeList stdTypeList43 = stdTypeList35;
        StdTypeList stdTypeList44 = stdTypeList34;
        DIV_CONST_INT = new Rop(17, type2, (TypeList) stdTypeList2, (TypeList) stdTypeList24, "div-const-int");
        StdTypeList stdTypeList45 = stdTypeList38;
        StdTypeList stdTypeList46 = stdTypeList37;
        Type type18 = type15;
        Type type19 = type16;
        DIV_CONST_LONG = new Rop(17, type15, (TypeList) stdTypeList44, (TypeList) stdTypeList24, "div-const-long");
        DIV_CONST_FLOAT = new Rop(17, type19, stdTypeList46, "div-const-float");
        DIV_CONST_DOUBLE = new Rop(17, type14, stdTypeList45, "div-const-double");
        StdTypeList stdTypeList47 = stdTypeList46;
        StdTypeList stdTypeList48 = stdTypeList45;
        REM_CONST_INT = new Rop(18, type2, (TypeList) stdTypeList2, (TypeList) stdTypeList24, "rem-const-int");
        Type type20 = type18;
        Type type21 = type19;
        StdTypeList stdTypeList49 = stdTypeList44;
        REM_CONST_LONG = new Rop(18, type20, (TypeList) stdTypeList49, (TypeList) stdTypeList24, "rem-const-long");
        StdTypeList stdTypeList50 = stdTypeList47;
        REM_CONST_FLOAT = new Rop(18, type21, stdTypeList50, "rem-const-float");
        REM_CONST_DOUBLE = new Rop(18, type14, stdTypeList48, "rem-const-double");
        AND_CONST_INT = new Rop(20, type2, stdTypeList2, "and-const-int");
        AND_CONST_LONG = new Rop(20, type20, stdTypeList49, "and-const-long");
        OR_CONST_INT = new Rop(21, type2, stdTypeList2, "or-const-int");
        OR_CONST_LONG = new Rop(21, type20, stdTypeList49, "or-const-long");
        XOR_CONST_INT = new Rop(22, type2, stdTypeList2, "xor-const-int");
        XOR_CONST_LONG = new Rop(22, type20, stdTypeList49, "xor-const-long");
        SHL_CONST_INT = new Rop(23, type2, stdTypeList2, "shl-const-int");
        SHL_CONST_LONG = new Rop(23, type20, stdTypeList2, "shl-const-long");
        SHR_CONST_INT = new Rop(24, type2, stdTypeList2, "shr-const-int");
        SHR_CONST_LONG = new Rop(24, type20, stdTypeList2, "shr-const-long");
        USHR_CONST_INT = new Rop(25, type2, stdTypeList2, "ushr-const-int");
        USHR_CONST_LONG = new Rop(25, type20, stdTypeList2, "ushr-const-long");
        CMPL_LONG = new Rop(27, type2, stdTypeList27, "cmpl-long");
        StdTypeList stdTypeList51 = stdTypeList42;
        CMPL_FLOAT = new Rop(27, type2, stdTypeList51, "cmpl-float");
        StdTypeList stdTypeList52 = stdTypeList43;
        CMPL_DOUBLE = new Rop(27, type2, stdTypeList52, "cmpl-double");
        CMPG_FLOAT = new Rop(28, type2, stdTypeList51, "cmpg-float");
        CMPG_DOUBLE = new Rop(28, type2, stdTypeList52, "cmpg-double");
        CONV_L2I = new Rop(29, type2, stdTypeList49, "conv-l2i");
        CONV_F2I = new Rop(29, type2, stdTypeList50, "conv-f2i");
        CONV_D2I = new Rop(29, type2, stdTypeList48, "conv-d2i");
        CONV_I2L = new Rop(29, type20, stdTypeList2, "conv-i2l");
        CONV_F2L = new Rop(29, type20, stdTypeList50, "conv-f2l");
        CONV_D2L = new Rop(29, type20, stdTypeList48, "conv-d2l");
        CONV_I2F = new Rop(29, type21, stdTypeList2, "conv-i2f");
        CONV_L2F = new Rop(29, type21, stdTypeList49, "conv-l2f");
        CONV_D2F = new Rop(29, type21, stdTypeList48, "conv-d2f");
        CONV_I2D = new Rop(29, type14, stdTypeList2, "conv-i2d");
        CONV_L2D = new Rop(29, type14, stdTypeList49, "conv-l2d");
        CONV_F2D = new Rop(29, type14, stdTypeList50, "conv-f2d");
        TO_BYTE = new Rop(30, type2, stdTypeList2, "to-byte");
        TO_CHAR = new Rop(31, type2, stdTypeList2, "to-char");
        TO_SHORT = new Rop(32, type2, stdTypeList2, "to-short");
        Type type22 = type17;
        Type type23 = type21;
        Type type24 = type20;
        RETURN_VOID = new Rop(33, type22, (TypeList) stdTypeList33, 2, "return-void");
        RETURN_INT = new Rop(33, type22, (TypeList) stdTypeList2, 2, "return-int");
        RETURN_LONG = new Rop(33, type22, (TypeList) stdTypeList49, 2, "return-long");
        RETURN_FLOAT = new Rop(33, type22, (TypeList) stdTypeList50, 2, "return-float");
        RETURN_DOUBLE = new Rop(33, type22, (TypeList) stdTypeList48, 2, "return-double");
        StdTypeList stdTypeList53 = stdTypeList8;
        RETURN_OBJECT = new Rop(33, type22, (TypeList) stdTypeList53, 2, "return-object");
        StdTypeList stdTypeList54 = Exceptions.LIST_Error_NullPointerException;
        ARRAY_LENGTH = new Rop(34, type2, (TypeList) stdTypeList53, (TypeList) stdTypeList54, "array-length");
        StdTypeList stdTypeList55 = StdTypeList.THROWABLE;
        Type type25 = type17;
        THROW = new Rop(35, type25, (TypeList) stdTypeList55, (TypeList) stdTypeList55, "throw");
        StdTypeList stdTypeList56 = stdTypeList8;
        MONITOR_ENTER = new Rop(36, type25, (TypeList) stdTypeList56, (TypeList) stdTypeList54, "monitor-enter");
        MONITOR_EXIT = new Rop(37, type25, (TypeList) stdTypeList56, (TypeList) Exceptions.LIST_Error_Null_IllegalMonitorStateException, "monitor-exit");
        StdTypeList stdTypeList57 = StdTypeList.INTARR_INT;
        StdTypeList stdTypeList58 = Exceptions.LIST_Error_Null_ArrayIndexOutOfBounds;
        Type type26 = type2;
        AGET_INT = new Rop(38, type26, (TypeList) stdTypeList57, (TypeList) stdTypeList58, "aget-int");
        Type type27 = type24;
        AGET_LONG = new Rop(38, type27, (TypeList) StdTypeList.LONGARR_INT, (TypeList) stdTypeList58, "aget-long");
        StdTypeList stdTypeList59 = stdTypeList58;
        AGET_FLOAT = new Rop(38, type23, (TypeList) StdTypeList.FLOATARR_INT, (TypeList) stdTypeList59, "aget-float");
        AGET_DOUBLE = new Rop(38, type14, (TypeList) StdTypeList.DOUBLEARR_INT, (TypeList) stdTypeList59, "aget-double");
        AGET_OBJECT = new Rop(38, type11, (TypeList) StdTypeList.OBJECTARR_INT, (TypeList) stdTypeList59, "aget-object");
        StdTypeList stdTypeList60 = stdTypeList50;
        StdTypeList stdTypeList61 = stdTypeList58;
        AGET_BOOLEAN = new Rop(38, type26, (TypeList) StdTypeList.BOOLEANARR_INT, (TypeList) stdTypeList61, "aget-boolean");
        AGET_BYTE = new Rop(38, type26, (TypeList) StdTypeList.BYTEARR_INT, (TypeList) stdTypeList61, "aget-byte");
        AGET_CHAR = new Rop(38, type26, (TypeList) StdTypeList.CHARARR_INT, (TypeList) stdTypeList61, "aget-char");
        AGET_SHORT = new Rop(38, type26, (TypeList) StdTypeList.SHORTARR_INT, (TypeList) stdTypeList61, "aget-short");
        Type type28 = type17;
        APUT_INT = new Rop(39, type28, (TypeList) StdTypeList.INT_INTARR_INT, (TypeList) stdTypeList61, "aput-int");
        APUT_LONG = new Rop(39, type28, (TypeList) StdTypeList.LONG_LONGARR_INT, (TypeList) stdTypeList61, "aput-long");
        APUT_FLOAT = new Rop(39, type28, (TypeList) StdTypeList.FLOAT_FLOATARR_INT, (TypeList) stdTypeList61, "aput-float");
        APUT_DOUBLE = new Rop(39, type28, (TypeList) StdTypeList.DOUBLE_DOUBLEARR_INT, (TypeList) stdTypeList61, "aput-double");
        StdTypeList stdTypeList62 = StdTypeList.OBJECT_OBJECTARR_INT;
        StdTypeList stdTypeList63 = Exceptions.LIST_Error_Null_ArrayIndex_ArrayStore;
        APUT_OBJECT = new Rop(39, type28, (TypeList) stdTypeList62, (TypeList) stdTypeList63, "aput-object");
        APUT_BOOLEAN = new Rop(39, type28, (TypeList) StdTypeList.INT_BOOLEANARR_INT, (TypeList) stdTypeList63, "aput-boolean");
        APUT_BYTE = new Rop(39, type28, (TypeList) StdTypeList.INT_BYTEARR_INT, (TypeList) stdTypeList63, "aput-byte");
        APUT_CHAR = new Rop(39, type28, (TypeList) StdTypeList.INT_CHARARR_INT, (TypeList) stdTypeList63, "aput-char");
        APUT_SHORT = new Rop(39, type28, (TypeList) StdTypeList.INT_SHORTARR_INT, (TypeList) stdTypeList63, "aput-short");
        NEW_INSTANCE = new Rop(40, type11, (TypeList) stdTypeList33, (TypeList) stdTypeList7, "new-instance");
        Type type29 = Type.INT_ARRAY;
        StdTypeList stdTypeList64 = stdTypeList2;
        StdTypeList stdTypeList65 = Exceptions.LIST_Error_NegativeArraySizeException;
        NEW_ARRAY_INT = new Rop(41, type29, (TypeList) stdTypeList64, (TypeList) stdTypeList65, "new-array-int");
        NEW_ARRAY_LONG = new Rop(41, Type.LONG_ARRAY, (TypeList) stdTypeList64, (TypeList) stdTypeList65, "new-array-long");
        NEW_ARRAY_FLOAT = new Rop(41, Type.FLOAT_ARRAY, (TypeList) stdTypeList64, (TypeList) stdTypeList65, "new-array-float");
        NEW_ARRAY_DOUBLE = new Rop(41, Type.DOUBLE_ARRAY, (TypeList) stdTypeList64, (TypeList) stdTypeList65, "new-array-double");
        NEW_ARRAY_BOOLEAN = new Rop(41, Type.BOOLEAN_ARRAY, (TypeList) stdTypeList64, (TypeList) stdTypeList65, "new-array-boolean");
        NEW_ARRAY_BYTE = new Rop(41, Type.BYTE_ARRAY, (TypeList) stdTypeList64, (TypeList) stdTypeList65, "new-array-byte");
        NEW_ARRAY_CHAR = new Rop(41, Type.CHAR_ARRAY, (TypeList) stdTypeList64, (TypeList) stdTypeList65, "new-array-char");
        NEW_ARRAY_SHORT = new Rop(41, Type.SHORT_ARRAY, (TypeList) stdTypeList64, (TypeList) stdTypeList65, "new-array-short");
        StdTypeList stdTypeList66 = stdTypeList8;
        CHECK_CAST = new Rop(43, type17, (TypeList) stdTypeList66, (TypeList) Exceptions.LIST_Error_ClassCastException, "check-cast");
        Type type30 = type2;
        INSTANCE_OF = new Rop(44, type30, (TypeList) stdTypeList66, (TypeList) stdTypeList7, "instance-of");
        GET_FIELD_INT = new Rop(45, type30, (TypeList) stdTypeList66, (TypeList) stdTypeList54, "get-field-int");
        GET_FIELD_LONG = new Rop(45, type27, (TypeList) stdTypeList8, (TypeList) stdTypeList54, "get-field-long");
        StdTypeList stdTypeList67 = stdTypeList8;
        StdTypeList stdTypeList68 = stdTypeList54;
        GET_FIELD_FLOAT = new Rop(45, type23, (TypeList) stdTypeList67, (TypeList) stdTypeList68, "get-field-float");
        GET_FIELD_DOUBLE = new Rop(45, type14, (TypeList) stdTypeList67, (TypeList) stdTypeList68, "get-field-double");
        GET_FIELD_OBJECT = new Rop(45, type11, (TypeList) stdTypeList67, (TypeList) stdTypeList68, "get-field-object");
        StdTypeList stdTypeList69 = stdTypeList60;
        StdTypeList stdTypeList70 = stdTypeList54;
        StdTypeList stdTypeList71 = stdTypeList49;
        GET_FIELD_BOOLEAN = new Rop(45, type30, (TypeList) stdTypeList66, (TypeList) stdTypeList70, "get-field-boolean");
        GET_FIELD_BYTE = new Rop(45, type30, (TypeList) stdTypeList66, (TypeList) stdTypeList70, "get-field-byte");
        GET_FIELD_CHAR = new Rop(45, type30, (TypeList) stdTypeList66, (TypeList) stdTypeList70, "get-field-char");
        GET_FIELD_SHORT = new Rop(45, type30, (TypeList) stdTypeList66, (TypeList) stdTypeList70, "get-field-short");
        StdTypeList stdTypeList72 = stdTypeList33;
        StdTypeList stdTypeList73 = stdTypeList7;
        GET_STATIC_INT = new Rop(46, type30, (TypeList) stdTypeList72, (TypeList) stdTypeList73, "get-static-int");
        GET_STATIC_LONG = new Rop(46, type24, (TypeList) stdTypeList72, (TypeList) stdTypeList73, "get-static-long");
        GET_STATIC_FLOAT = new Rop(46, type23, (TypeList) stdTypeList72, (TypeList) stdTypeList73, "get-static-float");
        GET_STATIC_DOUBLE = new Rop(46, type14, (TypeList) stdTypeList72, (TypeList) stdTypeList73, "get-static-double");
        GET_STATIC_OBJECT = new Rop(46, type11, (TypeList) stdTypeList72, (TypeList) stdTypeList73, "get-static-object");
        Type type31 = type2;
        GET_STATIC_BOOLEAN = new Rop(46, type31, (TypeList) stdTypeList72, (TypeList) stdTypeList73, "get-field-boolean");
        GET_STATIC_BYTE = new Rop(46, type31, (TypeList) stdTypeList72, (TypeList) stdTypeList73, "get-field-byte");
        GET_STATIC_CHAR = new Rop(46, type31, (TypeList) stdTypeList72, (TypeList) stdTypeList73, "get-field-char");
        GET_STATIC_SHORT = new Rop(46, type31, (TypeList) stdTypeList72, (TypeList) stdTypeList73, "get-field-short");
        StdTypeList stdTypeList74 = StdTypeList.INT_OBJECT;
        Type type32 = type17;
        StdTypeList stdTypeList75 = stdTypeList54;
        PUT_FIELD_INT = new Rop(47, type32, (TypeList) stdTypeList74, (TypeList) stdTypeList75, "put-field-int");
        PUT_FIELD_LONG = new Rop(47, type32, (TypeList) StdTypeList.LONG_OBJECT, (TypeList) stdTypeList75, "put-field-long");
        PUT_FIELD_FLOAT = new Rop(47, type32, (TypeList) StdTypeList.FLOAT_OBJECT, (TypeList) stdTypeList75, "put-field-float");
        PUT_FIELD_DOUBLE = new Rop(47, type32, (TypeList) StdTypeList.DOUBLE_OBJECT, (TypeList) stdTypeList75, "put-field-double");
        PUT_FIELD_OBJECT = new Rop(47, type32, (TypeList) stdTypeList17, (TypeList) stdTypeList75, "put-field-object");
        StdTypeList stdTypeList76 = stdTypeList74;
        PUT_FIELD_BOOLEAN = new Rop(47, type32, (TypeList) stdTypeList76, (TypeList) stdTypeList75, "put-field-boolean");
        PUT_FIELD_BYTE = new Rop(47, type32, (TypeList) stdTypeList76, (TypeList) stdTypeList75, "put-field-byte");
        PUT_FIELD_CHAR = new Rop(47, type32, (TypeList) stdTypeList76, (TypeList) stdTypeList75, "put-field-char");
        PUT_FIELD_SHORT = new Rop(47, type32, (TypeList) stdTypeList76, (TypeList) stdTypeList75, "put-field-short");
        StdTypeList stdTypeList77 = stdTypeList7;
        PUT_STATIC_INT = new Rop(48, type32, (TypeList) stdTypeList2, (TypeList) stdTypeList77, "put-static-int");
        PUT_STATIC_LONG = new Rop(48, type32, (TypeList) stdTypeList71, (TypeList) stdTypeList77, "put-static-long");
        PUT_STATIC_FLOAT = new Rop(48, type32, (TypeList) stdTypeList69, (TypeList) stdTypeList77, "put-static-float");
        PUT_STATIC_DOUBLE = new Rop(48, type32, (TypeList) stdTypeList48, (TypeList) stdTypeList77, "put-static-double");
        PUT_STATIC_OBJECT = new Rop(48, type32, (TypeList) stdTypeList8, (TypeList) stdTypeList77, "put-static-object");
        StdTypeList stdTypeList78 = stdTypeList2;
        PUT_STATIC_BOOLEAN = new Rop(48, type32, (TypeList) stdTypeList78, (TypeList) stdTypeList77, "put-static-boolean");
        PUT_STATIC_BYTE = new Rop(48, type32, (TypeList) stdTypeList78, (TypeList) stdTypeList77, "put-static-byte");
        PUT_STATIC_CHAR = new Rop(48, type32, (TypeList) stdTypeList78, (TypeList) stdTypeList77, "put-static-char");
        PUT_STATIC_SHORT = new Rop(48, type32, (TypeList) stdTypeList78, (TypeList) stdTypeList77, "put-static-short");
        MARK_LOCAL_INT = new Rop(54, type32, stdTypeList2, "mark-local-int");
        MARK_LOCAL_LONG = new Rop(54, type32, stdTypeList71, "mark-local-long");
        MARK_LOCAL_FLOAT = new Rop(54, type32, stdTypeList69, "mark-local-float");
        MARK_LOCAL_DOUBLE = new Rop(54, type32, stdTypeList48, "mark-local-double");
        MARK_LOCAL_OBJECT = new Rop(54, type32, stdTypeList8, "mark-local-object");
        FILL_ARRAY_DATA = new Rop(57, type32, stdTypeList33, "fill-array-data");
    }

    private Rops() {
    }

    public static Rop opAdd(TypeList typeList) {
        return pickBinaryOp(typeList, ADD_CONST_INT, ADD_CONST_LONG, ADD_CONST_FLOAT, ADD_CONST_DOUBLE, ADD_INT, ADD_LONG, ADD_FLOAT, ADD_DOUBLE);
    }

    public static Rop opAget(TypeBearer typeBearer) {
        switch (typeBearer.getBasicType()) {
            case 1:
                return AGET_BOOLEAN;
            case 2:
                return AGET_BYTE;
            case 3:
                return AGET_CHAR;
            case 4:
                return AGET_DOUBLE;
            case 5:
                return AGET_FLOAT;
            case 6:
                return AGET_INT;
            case 7:
                return AGET_LONG;
            case 8:
                return AGET_SHORT;
            case 9:
                return AGET_OBJECT;
            default:
                return throwBadType(typeBearer);
        }
    }

    public static Rop opAnd(TypeList typeList) {
        return pickBinaryOp(typeList, AND_CONST_INT, AND_CONST_LONG, (Rop) null, (Rop) null, AND_INT, AND_LONG, (Rop) null, (Rop) null);
    }

    public static Rop opAput(TypeBearer typeBearer) {
        switch (typeBearer.getBasicType()) {
            case 1:
                return APUT_BOOLEAN;
            case 2:
                return APUT_BYTE;
            case 3:
                return APUT_CHAR;
            case 4:
                return APUT_DOUBLE;
            case 5:
                return APUT_FLOAT;
            case 6:
                return APUT_INT;
            case 7:
                return APUT_LONG;
            case 8:
                return APUT_SHORT;
            case 9:
                return APUT_OBJECT;
            default:
                return throwBadType(typeBearer);
        }
    }

    public static Rop opCmpg(TypeBearer typeBearer) {
        int basicType = typeBearer.getBasicType();
        if (basicType == 4) {
            return CMPG_DOUBLE;
        }
        if (basicType != 5) {
            return throwBadType(typeBearer);
        }
        return CMPG_FLOAT;
    }

    public static Rop opCmpl(TypeBearer typeBearer) {
        int basicType = typeBearer.getBasicType();
        if (basicType == 4) {
            return CMPL_DOUBLE;
        }
        if (basicType == 5) {
            return CMPL_FLOAT;
        }
        if (basicType != 7) {
            return throwBadType(typeBearer);
        }
        return CMPL_LONG;
    }

    public static Rop opConst(TypeBearer typeBearer) {
        if (typeBearer.getType() == Type.KNOWN_NULL) {
            return CONST_OBJECT_NOTHROW;
        }
        int basicFrameType = typeBearer.getBasicFrameType();
        if (basicFrameType == 4) {
            return CONST_DOUBLE;
        }
        if (basicFrameType == 5) {
            return CONST_FLOAT;
        }
        if (basicFrameType == 6) {
            return CONST_INT;
        }
        if (basicFrameType == 7) {
            return CONST_LONG;
        }
        if (basicFrameType != 9) {
            return throwBadType(typeBearer);
        }
        return CONST_OBJECT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r1 != 7) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.android.p023dx.rop.code.Rop opConv(com.android.p023dx.rop.type.TypeBearer r6, com.android.p023dx.rop.type.TypeBearer r7) {
        /*
            int r0 = r6.getBasicFrameType()
            int r1 = r7.getBasicFrameType()
            r2 = 7
            r3 = 6
            r4 = 5
            r5 = 4
            if (r1 == r5) goto L_0x0044
            if (r1 == r4) goto L_0x0034
            if (r1 == r3) goto L_0x0015
            if (r1 == r2) goto L_0x001b
            goto L_0x004a
        L_0x0015:
            if (r0 == r5) goto L_0x0031
            if (r0 == r4) goto L_0x002e
            if (r0 == r2) goto L_0x002b
        L_0x001b:
            if (r0 == r5) goto L_0x0028
            if (r0 == r4) goto L_0x0025
            if (r0 == r3) goto L_0x0022
            goto L_0x0034
        L_0x0022:
            com.android.dx.rop.code.Rop r6 = CONV_L2I
            return r6
        L_0x0025:
            com.android.dx.rop.code.Rop r6 = CONV_L2F
            return r6
        L_0x0028:
            com.android.dx.rop.code.Rop r6 = CONV_L2D
            return r6
        L_0x002b:
            com.android.dx.rop.code.Rop r6 = CONV_I2L
            return r6
        L_0x002e:
            com.android.dx.rop.code.Rop r6 = CONV_I2F
            return r6
        L_0x0031:
            com.android.dx.rop.code.Rop r6 = CONV_I2D
            return r6
        L_0x0034:
            if (r0 == r5) goto L_0x0041
            if (r0 == r3) goto L_0x003e
            if (r0 == r2) goto L_0x003b
            goto L_0x0044
        L_0x003b:
            com.android.dx.rop.code.Rop r6 = CONV_F2L
            return r6
        L_0x003e:
            com.android.dx.rop.code.Rop r6 = CONV_F2I
            return r6
        L_0x0041:
            com.android.dx.rop.code.Rop r6 = CONV_F2D
            return r6
        L_0x0044:
            if (r0 == r4) goto L_0x0061
            if (r0 == r3) goto L_0x005e
            if (r0 == r2) goto L_0x005b
        L_0x004a:
            com.android.dx.rop.type.Type r6 = r6.getType()
            com.android.dx.rop.type.Type r7 = r7.getType()
            com.android.dx.rop.type.StdTypeList r6 = com.android.p023dx.rop.type.StdTypeList.make(r6, r7)
            com.android.dx.rop.code.Rop r6 = throwBadTypes(r6)
            return r6
        L_0x005b:
            com.android.dx.rop.code.Rop r6 = CONV_D2L
            return r6
        L_0x005e:
            com.android.dx.rop.code.Rop r6 = CONV_D2I
            return r6
        L_0x0061:
            com.android.dx.rop.code.Rop r6 = CONV_D2F
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.rop.code.Rops.opConv(com.android.dx.rop.type.TypeBearer, com.android.dx.rop.type.TypeBearer):com.android.dx.rop.code.Rop");
    }

    public static Rop opDiv(TypeList typeList) {
        return pickBinaryOp(typeList, DIV_CONST_INT, DIV_CONST_LONG, DIV_CONST_FLOAT, DIV_CONST_DOUBLE, DIV_INT, DIV_LONG, DIV_FLOAT, DIV_DOUBLE);
    }

    public static Rop opFilledNewArray(TypeBearer typeBearer, int i) {
        Type componentType = typeBearer.getType().getComponentType();
        if (componentType.isCategory2()) {
            return throwBadType(typeBearer);
        }
        if (i >= 0) {
            StdTypeList stdTypeList = new StdTypeList(i);
            for (int i2 = 0; i2 < i; i2++) {
                stdTypeList.set(i2, componentType);
            }
            return new Rop(42, stdTypeList, Exceptions.LIST_Error);
        }
        throw new IllegalArgumentException("count < 0");
    }

    public static Rop opGetField(TypeBearer typeBearer) {
        switch (typeBearer.getBasicType()) {
            case 1:
                return GET_FIELD_BOOLEAN;
            case 2:
                return GET_FIELD_BYTE;
            case 3:
                return GET_FIELD_CHAR;
            case 4:
                return GET_FIELD_DOUBLE;
            case 5:
                return GET_FIELD_FLOAT;
            case 6:
                return GET_FIELD_INT;
            case 7:
                return GET_FIELD_LONG;
            case 8:
                return GET_FIELD_SHORT;
            case 9:
                return GET_FIELD_OBJECT;
            default:
                return throwBadType(typeBearer);
        }
    }

    public static Rop opGetStatic(TypeBearer typeBearer) {
        switch (typeBearer.getBasicType()) {
            case 1:
                return GET_STATIC_BOOLEAN;
            case 2:
                return GET_STATIC_BYTE;
            case 3:
                return GET_STATIC_CHAR;
            case 4:
                return GET_STATIC_DOUBLE;
            case 5:
                return GET_STATIC_FLOAT;
            case 6:
                return GET_STATIC_INT;
            case 7:
                return GET_STATIC_LONG;
            case 8:
                return GET_STATIC_SHORT;
            case 9:
                return GET_STATIC_OBJECT;
            default:
                return throwBadType(typeBearer);
        }
    }

    public static Rop opIfEq(TypeList typeList) {
        return pickIf(typeList, IF_EQZ_INT, IF_EQZ_OBJECT, IF_EQ_INT, IF_EQ_OBJECT);
    }

    public static Rop opIfGe(TypeList typeList) {
        return pickIf(typeList, IF_GEZ_INT, (Rop) null, IF_GE_INT, (Rop) null);
    }

    public static Rop opIfGt(TypeList typeList) {
        return pickIf(typeList, IF_GTZ_INT, (Rop) null, IF_GT_INT, (Rop) null);
    }

    public static Rop opIfLe(TypeList typeList) {
        return pickIf(typeList, IF_LEZ_INT, (Rop) null, IF_LE_INT, (Rop) null);
    }

    public static Rop opIfLt(TypeList typeList) {
        return pickIf(typeList, IF_LTZ_INT, (Rop) null, IF_LT_INT, (Rop) null);
    }

    public static Rop opIfNe(TypeList typeList) {
        return pickIf(typeList, IF_NEZ_INT, IF_NEZ_OBJECT, IF_NE_INT, IF_NE_OBJECT);
    }

    public static Rop opInvokeDirect(Prototype prototype) {
        return new Rop(52, prototype.getParameterFrameTypes(), StdTypeList.THROWABLE);
    }

    public static Rop opInvokeInterface(Prototype prototype) {
        return new Rop(53, prototype.getParameterFrameTypes(), StdTypeList.THROWABLE);
    }

    public static Rop opInvokeStatic(Prototype prototype) {
        return new Rop(49, prototype.getParameterFrameTypes(), StdTypeList.THROWABLE);
    }

    public static Rop opInvokeSuper(Prototype prototype) {
        return new Rop(51, prototype.getParameterFrameTypes(), StdTypeList.THROWABLE);
    }

    public static Rop opInvokeVirtual(Prototype prototype) {
        return new Rop(50, prototype.getParameterFrameTypes(), StdTypeList.THROWABLE);
    }

    public static Rop opMarkLocal(TypeBearer typeBearer) {
        int basicFrameType = typeBearer.getBasicFrameType();
        if (basicFrameType == 4) {
            return MARK_LOCAL_DOUBLE;
        }
        if (basicFrameType == 5) {
            return MARK_LOCAL_FLOAT;
        }
        if (basicFrameType == 6) {
            return MARK_LOCAL_INT;
        }
        if (basicFrameType == 7) {
            return MARK_LOCAL_LONG;
        }
        if (basicFrameType != 9) {
            return throwBadType(typeBearer);
        }
        return MARK_LOCAL_OBJECT;
    }

    public static Rop opMove(TypeBearer typeBearer) {
        switch (typeBearer.getBasicFrameType()) {
            case 4:
                return MOVE_DOUBLE;
            case 5:
                return MOVE_FLOAT;
            case 6:
                return MOVE_INT;
            case 7:
                return MOVE_LONG;
            case 9:
                return MOVE_OBJECT;
            case 10:
                return MOVE_RETURN_ADDRESS;
            default:
                return throwBadType(typeBearer);
        }
    }

    public static Rop opMoveException(TypeBearer typeBearer) {
        return new Rop(4, typeBearer.getType(), StdTypeList.EMPTY, (String) null);
    }

    public static Rop opMoveParam(TypeBearer typeBearer) {
        int basicFrameType = typeBearer.getBasicFrameType();
        if (basicFrameType == 4) {
            return MOVE_PARAM_DOUBLE;
        }
        if (basicFrameType == 5) {
            return MOVE_PARAM_FLOAT;
        }
        if (basicFrameType == 6) {
            return MOVE_PARAM_INT;
        }
        if (basicFrameType == 7) {
            return MOVE_PARAM_LONG;
        }
        if (basicFrameType != 9) {
            return throwBadType(typeBearer);
        }
        return MOVE_PARAM_OBJECT;
    }

    public static Rop opMoveResult(TypeBearer typeBearer) {
        return new Rop(55, typeBearer.getType(), StdTypeList.EMPTY, (String) null);
    }

    public static Rop opMoveResultPseudo(TypeBearer typeBearer) {
        return new Rop(56, typeBearer.getType(), StdTypeList.EMPTY, (String) null);
    }

    public static Rop opMul(TypeList typeList) {
        return pickBinaryOp(typeList, MUL_CONST_INT, MUL_CONST_LONG, MUL_CONST_FLOAT, MUL_CONST_DOUBLE, MUL_INT, MUL_LONG, MUL_FLOAT, MUL_DOUBLE);
    }

    public static Rop opNeg(TypeBearer typeBearer) {
        int basicFrameType = typeBearer.getBasicFrameType();
        if (basicFrameType == 4) {
            return NEG_DOUBLE;
        }
        if (basicFrameType == 5) {
            return NEG_FLOAT;
        }
        if (basicFrameType == 6) {
            return NEG_INT;
        }
        if (basicFrameType != 7) {
            return throwBadType(typeBearer);
        }
        return NEG_LONG;
    }

    public static Rop opNewArray(TypeBearer typeBearer) {
        Type type = typeBearer.getType();
        switch (type.getComponentType().getBasicType()) {
            case 1:
                return NEW_ARRAY_BOOLEAN;
            case 2:
                return NEW_ARRAY_BYTE;
            case 3:
                return NEW_ARRAY_CHAR;
            case 4:
                return NEW_ARRAY_DOUBLE;
            case 5:
                return NEW_ARRAY_FLOAT;
            case 6:
                return NEW_ARRAY_INT;
            case 7:
                return NEW_ARRAY_LONG;
            case 8:
                return NEW_ARRAY_SHORT;
            case 9:
                return new Rop(41, type, (TypeList) StdTypeList.INT, (TypeList) Exceptions.LIST_Error_NegativeArraySizeException, "new-array-object");
            default:
                return throwBadType(type);
        }
    }

    public static Rop opNot(TypeBearer typeBearer) {
        int basicFrameType = typeBearer.getBasicFrameType();
        if (basicFrameType == 6) {
            return NOT_INT;
        }
        if (basicFrameType != 7) {
            return throwBadType(typeBearer);
        }
        return NOT_LONG;
    }

    public static Rop opOr(TypeList typeList) {
        return pickBinaryOp(typeList, OR_CONST_INT, OR_CONST_LONG, (Rop) null, (Rop) null, OR_INT, OR_LONG, (Rop) null, (Rop) null);
    }

    public static Rop opPutField(TypeBearer typeBearer) {
        switch (typeBearer.getBasicType()) {
            case 1:
                return PUT_FIELD_BOOLEAN;
            case 2:
                return PUT_FIELD_BYTE;
            case 3:
                return PUT_FIELD_CHAR;
            case 4:
                return PUT_FIELD_DOUBLE;
            case 5:
                return PUT_FIELD_FLOAT;
            case 6:
                return PUT_FIELD_INT;
            case 7:
                return PUT_FIELD_LONG;
            case 8:
                return PUT_FIELD_SHORT;
            case 9:
                return PUT_FIELD_OBJECT;
            default:
                return throwBadType(typeBearer);
        }
    }

    public static Rop opPutStatic(TypeBearer typeBearer) {
        switch (typeBearer.getBasicType()) {
            case 1:
                return PUT_STATIC_BOOLEAN;
            case 2:
                return PUT_STATIC_BYTE;
            case 3:
                return PUT_STATIC_CHAR;
            case 4:
                return PUT_STATIC_DOUBLE;
            case 5:
                return PUT_STATIC_FLOAT;
            case 6:
                return PUT_STATIC_INT;
            case 7:
                return PUT_STATIC_LONG;
            case 8:
                return PUT_STATIC_SHORT;
            case 9:
                return PUT_STATIC_OBJECT;
            default:
                return throwBadType(typeBearer);
        }
    }

    public static Rop opRem(TypeList typeList) {
        return pickBinaryOp(typeList, REM_CONST_INT, REM_CONST_LONG, REM_CONST_FLOAT, REM_CONST_DOUBLE, REM_INT, REM_LONG, REM_FLOAT, REM_DOUBLE);
    }

    public static Rop opReturn(TypeBearer typeBearer) {
        int basicFrameType = typeBearer.getBasicFrameType();
        if (basicFrameType == 0) {
            return RETURN_VOID;
        }
        if (basicFrameType == 9) {
            return RETURN_OBJECT;
        }
        if (basicFrameType == 4) {
            return RETURN_DOUBLE;
        }
        if (basicFrameType == 5) {
            return RETURN_FLOAT;
        }
        if (basicFrameType == 6) {
            return RETURN_INT;
        }
        if (basicFrameType != 7) {
            return throwBadType(typeBearer);
        }
        return RETURN_LONG;
    }

    public static Rop opShl(TypeList typeList) {
        return pickBinaryOp(typeList, SHL_CONST_INT, SHL_CONST_LONG, (Rop) null, (Rop) null, SHL_INT, SHL_LONG, (Rop) null, (Rop) null);
    }

    public static Rop opShr(TypeList typeList) {
        return pickBinaryOp(typeList, SHR_CONST_INT, SHR_CONST_LONG, (Rop) null, (Rop) null, SHR_INT, SHR_LONG, (Rop) null, (Rop) null);
    }

    public static Rop opSub(TypeList typeList) {
        return pickBinaryOp(typeList, SUB_CONST_INT, SUB_CONST_LONG, SUB_CONST_FLOAT, SUB_CONST_DOUBLE, SUB_INT, SUB_LONG, SUB_FLOAT, SUB_DOUBLE);
    }

    public static Rop opUshr(TypeList typeList) {
        return pickBinaryOp(typeList, USHR_CONST_INT, USHR_CONST_LONG, (Rop) null, (Rop) null, USHR_INT, USHR_LONG, (Rop) null, (Rop) null);
    }

    public static Rop opXor(TypeList typeList) {
        return pickBinaryOp(typeList, XOR_CONST_INT, XOR_CONST_LONG, (Rop) null, (Rop) null, XOR_INT, XOR_LONG, (Rop) null, (Rop) null);
    }

    private static Rop pickBinaryOp(TypeList typeList, Rop rop, Rop rop2, Rop rop3, Rop rop4, Rop rop5, Rop rop6, Rop rop7, Rop rop8) {
        TypeList typeList2 = typeList;
        int basicFrameType = typeList.getType(0).getBasicFrameType();
        int size = typeList.size();
        Rop rop9 = null;
        if (size != 1) {
            if (size == 2) {
                if (basicFrameType == 4) {
                    rop9 = rop8;
                } else if (basicFrameType == 5) {
                    rop9 = rop7;
                } else if (basicFrameType == 6) {
                    return rop5;
                } else {
                    if (basicFrameType == 7) {
                        return rop6;
                    }
                }
            }
        } else if (basicFrameType == 4) {
            rop9 = rop4;
        } else if (basicFrameType == 5) {
            rop9 = rop3;
        } else if (basicFrameType == 6) {
            return rop;
        } else {
            if (basicFrameType == 7) {
                return rop2;
            }
        }
        return rop9 == null ? throwBadTypes(typeList) : rop9;
    }

    private static Rop pickIf(TypeList typeList, Rop rop, Rop rop2, Rop rop3, Rop rop4) {
        int basicFrameType;
        int size = typeList.size();
        if (size == 1) {
            int basicFrameType2 = typeList.getType(0).getBasicFrameType();
            if (basicFrameType2 == 6) {
                return rop;
            }
            if (basicFrameType2 == 9 && rop2 != null) {
                return rop2;
            }
        } else if (size == 2 && (basicFrameType = typeList.getType(0).getBasicFrameType()) == typeList.getType(1).getBasicFrameType()) {
            if (basicFrameType == 6) {
                return rop3;
            }
            if (basicFrameType == 9 && rop4 != null) {
                return rop4;
            }
        }
        return throwBadTypes(typeList);
    }

    public static Rop ropFor(int i, TypeBearer typeBearer, TypeList typeList, Constant constant) {
        Type type;
        Type type2;
        switch (i) {
            case 1:
                return NOP;
            case 2:
                return opMove(typeBearer);
            case 3:
                return opMoveParam(typeBearer);
            case 4:
                return opMoveException(typeBearer);
            case 5:
                return opConst(typeBearer);
            case 6:
                return GOTO;
            case 7:
                return opIfEq(typeList);
            case 8:
                return opIfNe(typeList);
            case 9:
                return opIfLt(typeList);
            case 10:
                return opIfGe(typeList);
            case 11:
                return opIfLe(typeList);
            case 12:
                return opIfGt(typeList);
            case 13:
                return SWITCH;
            case 14:
                return opAdd(typeList);
            case 15:
                return opSub(typeList);
            case 16:
                return opMul(typeList);
            case 17:
                return opDiv(typeList);
            case 18:
                return opRem(typeList);
            case 19:
                return opNeg(typeBearer);
            case 20:
                return opAnd(typeList);
            case 21:
                return opOr(typeList);
            case 22:
                return opXor(typeList);
            case 23:
                return opShl(typeList);
            case 24:
                return opShr(typeList);
            case 25:
                return opUshr(typeList);
            case 26:
                return opNot(typeBearer);
            case 27:
                return opCmpl(typeList.getType(0));
            case 28:
                return opCmpg(typeList.getType(0));
            case 29:
                return opConv(typeBearer, typeList.getType(0));
            case 30:
                return TO_BYTE;
            case 31:
                return TO_CHAR;
            case 32:
                return TO_SHORT;
            case 33:
                if (typeList.size() == 0) {
                    return RETURN_VOID;
                }
                return opReturn(typeList.getType(0));
            case 34:
                return ARRAY_LENGTH;
            case 35:
                return THROW;
            case 36:
                return MONITOR_ENTER;
            case 37:
                return MONITOR_EXIT;
            case 38:
                Type type3 = typeList.getType(0);
                if (type3 == Type.KNOWN_NULL) {
                    type = typeBearer.getType();
                } else {
                    type = type3.getComponentType();
                }
                return opAget(type);
            case 39:
                Type type4 = typeList.getType(1);
                if (type4 == Type.KNOWN_NULL) {
                    type2 = typeList.getType(0);
                } else {
                    type2 = type4.getComponentType();
                }
                return opAput(type2);
            case 40:
                return NEW_INSTANCE;
            case 41:
                return opNewArray(typeBearer.getType());
            case 43:
                return CHECK_CAST;
            case 44:
                return INSTANCE_OF;
            case 45:
                return opGetField(typeBearer);
            case 46:
                return opGetStatic(typeBearer);
            case 47:
                return opPutField(typeList.getType(0));
            case 48:
                return opPutStatic(typeList.getType(0));
            case 49:
                return opInvokeStatic(((CstMethodRef) constant).getPrototype());
            case 50:
                CstMethodRef cstMethodRef = (CstMethodRef) constant;
                return opInvokeVirtual(cstMethodRef.getPrototype().withFirstParameter(cstMethodRef.getDefiningClass().getClassType()));
            case 51:
                CstMethodRef cstMethodRef2 = (CstMethodRef) constant;
                return opInvokeSuper(cstMethodRef2.getPrototype().withFirstParameter(cstMethodRef2.getDefiningClass().getClassType()));
            case 52:
                CstMethodRef cstMethodRef3 = (CstMethodRef) constant;
                return opInvokeDirect(cstMethodRef3.getPrototype().withFirstParameter(cstMethodRef3.getDefiningClass().getClassType()));
            case 53:
                CstMethodRef cstMethodRef4 = (CstMethodRef) constant;
                return opInvokeInterface(cstMethodRef4.getPrototype().withFirstParameter(cstMethodRef4.getDefiningClass().getClassType()));
            default:
                throw new RuntimeException("unknown opcode " + RegOps.opName(i));
        }
    }

    private static Rop throwBadType(TypeBearer typeBearer) {
        throw new IllegalArgumentException("bad type: " + typeBearer);
    }

    private static Rop throwBadTypes(TypeList typeList) {
        throw new IllegalArgumentException("bad types: " + typeList);
    }
}
