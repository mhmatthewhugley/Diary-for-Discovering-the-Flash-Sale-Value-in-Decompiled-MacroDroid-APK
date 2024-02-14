package com.android.p023dx.dex.code;

import com.android.p023dx.dex.DexOptions;
import com.android.p023dx.dex.code.form.Form10t;
import com.android.p023dx.dex.code.form.Form10x;
import com.android.p023dx.dex.code.form.Form11n;
import com.android.p023dx.dex.code.form.Form11x;
import com.android.p023dx.dex.code.form.Form12x;
import com.android.p023dx.dex.code.form.Form20t;
import com.android.p023dx.dex.code.form.Form21c;
import com.android.p023dx.dex.code.form.Form21h;
import com.android.p023dx.dex.code.form.Form21s;
import com.android.p023dx.dex.code.form.Form21t;
import com.android.p023dx.dex.code.form.Form22b;
import com.android.p023dx.dex.code.form.Form22c;
import com.android.p023dx.dex.code.form.Form22s;
import com.android.p023dx.dex.code.form.Form22t;
import com.android.p023dx.dex.code.form.Form22x;
import com.android.p023dx.dex.code.form.Form23x;
import com.android.p023dx.dex.code.form.Form30t;
import com.android.p023dx.dex.code.form.Form31c;
import com.android.p023dx.dex.code.form.Form31i;
import com.android.p023dx.dex.code.form.Form31t;
import com.android.p023dx.dex.code.form.Form32x;
import com.android.p023dx.dex.code.form.Form35c;
import com.android.p023dx.dex.code.form.Form3rc;
import com.android.p023dx.dex.code.form.Form51l;
import com.android.p023dx.dex.code.form.SpecialFormat;
import com.android.p023dx.p026io.Opcodes;

/* renamed from: com.android.dx.dex.code.Dops */
public final class Dops {
    public static final Dop ADD_DOUBLE;
    public static final Dop ADD_DOUBLE_2ADDR;
    public static final Dop ADD_FLOAT;
    public static final Dop ADD_FLOAT_2ADDR;
    public static final Dop ADD_INT;
    public static final Dop ADD_INT_2ADDR;
    public static final Dop ADD_INT_LIT16;
    public static final Dop ADD_INT_LIT8;
    public static final Dop ADD_LONG;
    public static final Dop ADD_LONG_2ADDR;
    public static final Dop AGET;
    public static final Dop AGET_BOOLEAN;
    public static final Dop AGET_BYTE;
    public static final Dop AGET_CHAR;
    public static final Dop AGET_OBJECT;
    public static final Dop AGET_SHORT;
    public static final Dop AGET_WIDE;
    public static final Dop AND_INT;
    public static final Dop AND_INT_2ADDR;
    public static final Dop AND_INT_LIT16;
    public static final Dop AND_INT_LIT8;
    public static final Dop AND_LONG;
    public static final Dop AND_LONG_2ADDR;
    public static final Dop APUT;
    public static final Dop APUT_BOOLEAN;
    public static final Dop APUT_BYTE;
    public static final Dop APUT_CHAR;
    public static final Dop APUT_OBJECT;
    public static final Dop APUT_SHORT;
    public static final Dop APUT_WIDE;
    public static final Dop ARRAY_LENGTH;
    public static final Dop CHECK_CAST;
    public static final Dop CMPG_DOUBLE;
    public static final Dop CMPG_FLOAT;
    public static final Dop CMPL_DOUBLE;
    public static final Dop CMPL_FLOAT;
    public static final Dop CMP_LONG;
    public static final Dop CONST;
    public static final Dop CONST_16;
    public static final Dop CONST_4;
    public static final Dop CONST_CLASS;
    public static final Dop CONST_HIGH16;
    public static final Dop CONST_STRING;
    public static final Dop CONST_STRING_JUMBO;
    public static final Dop CONST_WIDE;
    public static final Dop CONST_WIDE_16;
    public static final Dop CONST_WIDE_32;
    public static final Dop CONST_WIDE_HIGH16;
    public static final Dop DIV_DOUBLE;
    public static final Dop DIV_DOUBLE_2ADDR;
    public static final Dop DIV_FLOAT;
    public static final Dop DIV_FLOAT_2ADDR;
    public static final Dop DIV_INT;
    public static final Dop DIV_INT_2ADDR;
    public static final Dop DIV_INT_LIT16;
    public static final Dop DIV_INT_LIT8;
    public static final Dop DIV_LONG;
    public static final Dop DIV_LONG_2ADDR;
    private static final Dop[] DOPS = new Dop[65537];
    public static final Dop DOUBLE_TO_FLOAT;
    public static final Dop DOUBLE_TO_INT;
    public static final Dop DOUBLE_TO_LONG;
    public static final Dop FILLED_NEW_ARRAY;
    public static final Dop FILLED_NEW_ARRAY_RANGE;
    public static final Dop FILL_ARRAY_DATA;
    public static final Dop FLOAT_TO_DOUBLE;
    public static final Dop FLOAT_TO_INT;
    public static final Dop FLOAT_TO_LONG;
    public static final Dop GOTO;
    public static final Dop GOTO_16;
    public static final Dop GOTO_32;
    public static final Dop IF_EQ;
    public static final Dop IF_EQZ;
    public static final Dop IF_GE;
    public static final Dop IF_GEZ;
    public static final Dop IF_GT;
    public static final Dop IF_GTZ;
    public static final Dop IF_LE;
    public static final Dop IF_LEZ;
    public static final Dop IF_LT;
    public static final Dop IF_LTZ;
    public static final Dop IF_NE;
    public static final Dop IF_NEZ;
    public static final Dop IGET;
    public static final Dop IGET_BOOLEAN;
    public static final Dop IGET_BYTE;
    public static final Dop IGET_CHAR;
    public static final Dop IGET_OBJECT;
    public static final Dop IGET_SHORT;
    public static final Dop IGET_WIDE;
    public static final Dop INSTANCE_OF;
    public static final Dop INT_TO_BYTE;
    public static final Dop INT_TO_CHAR;
    public static final Dop INT_TO_DOUBLE;
    public static final Dop INT_TO_FLOAT;
    public static final Dop INT_TO_LONG;
    public static final Dop INT_TO_SHORT;
    public static final Dop INVOKE_DIRECT;
    public static final Dop INVOKE_DIRECT_RANGE;
    public static final Dop INVOKE_INTERFACE;
    public static final Dop INVOKE_INTERFACE_RANGE;
    public static final Dop INVOKE_STATIC;
    public static final Dop INVOKE_STATIC_RANGE;
    public static final Dop INVOKE_SUPER;
    public static final Dop INVOKE_SUPER_RANGE;
    public static final Dop INVOKE_VIRTUAL;
    public static final Dop INVOKE_VIRTUAL_RANGE;
    public static final Dop IPUT;
    public static final Dop IPUT_BOOLEAN;
    public static final Dop IPUT_BYTE;
    public static final Dop IPUT_CHAR;
    public static final Dop IPUT_OBJECT;
    public static final Dop IPUT_SHORT;
    public static final Dop IPUT_WIDE;
    public static final Dop LONG_TO_DOUBLE;
    public static final Dop LONG_TO_FLOAT;
    public static final Dop LONG_TO_INT;
    public static final Dop MONITOR_ENTER;
    public static final Dop MONITOR_EXIT;
    public static final Dop MOVE;
    public static final Dop MOVE_16;
    public static final Dop MOVE_EXCEPTION;
    public static final Dop MOVE_FROM16;
    public static final Dop MOVE_OBJECT;
    public static final Dop MOVE_OBJECT_16;
    public static final Dop MOVE_OBJECT_FROM16;
    public static final Dop MOVE_RESULT;
    public static final Dop MOVE_RESULT_OBJECT;
    public static final Dop MOVE_RESULT_WIDE;
    public static final Dop MOVE_WIDE;
    public static final Dop MOVE_WIDE_16;
    public static final Dop MOVE_WIDE_FROM16;
    public static final Dop MUL_DOUBLE;
    public static final Dop MUL_DOUBLE_2ADDR;
    public static final Dop MUL_FLOAT;
    public static final Dop MUL_FLOAT_2ADDR;
    public static final Dop MUL_INT;
    public static final Dop MUL_INT_2ADDR;
    public static final Dop MUL_INT_LIT16;
    public static final Dop MUL_INT_LIT8;
    public static final Dop MUL_LONG;
    public static final Dop MUL_LONG_2ADDR;
    public static final Dop NEG_DOUBLE;
    public static final Dop NEG_FLOAT;
    public static final Dop NEG_INT;
    public static final Dop NEG_LONG;
    public static final Dop NEW_ARRAY;
    public static final Dop NEW_INSTANCE;
    public static final Dop NOP;
    public static final Dop NOT_INT;
    public static final Dop NOT_LONG;
    public static final Dop OR_INT;
    public static final Dop OR_INT_2ADDR;
    public static final Dop OR_INT_LIT16;
    public static final Dop OR_INT_LIT8;
    public static final Dop OR_LONG;
    public static final Dop OR_LONG_2ADDR;
    public static final Dop PACKED_SWITCH;
    public static final Dop REM_DOUBLE;
    public static final Dop REM_DOUBLE_2ADDR;
    public static final Dop REM_FLOAT;
    public static final Dop REM_FLOAT_2ADDR;
    public static final Dop REM_INT;
    public static final Dop REM_INT_2ADDR;
    public static final Dop REM_INT_LIT16;
    public static final Dop REM_INT_LIT8;
    public static final Dop REM_LONG;
    public static final Dop REM_LONG_2ADDR;
    public static final Dop RETURN;
    public static final Dop RETURN_OBJECT;
    public static final Dop RETURN_VOID;
    public static final Dop RETURN_WIDE;
    public static final Dop RSUB_INT;
    public static final Dop RSUB_INT_LIT8;
    public static final Dop SGET;
    public static final Dop SGET_BOOLEAN;
    public static final Dop SGET_BYTE;
    public static final Dop SGET_CHAR;
    public static final Dop SGET_OBJECT;
    public static final Dop SGET_SHORT;
    public static final Dop SGET_WIDE;
    public static final Dop SHL_INT;
    public static final Dop SHL_INT_2ADDR;
    public static final Dop SHL_INT_LIT8;
    public static final Dop SHL_LONG;
    public static final Dop SHL_LONG_2ADDR;
    public static final Dop SHR_INT;
    public static final Dop SHR_INT_2ADDR;
    public static final Dop SHR_INT_LIT8;
    public static final Dop SHR_LONG;
    public static final Dop SHR_LONG_2ADDR;
    public static final Dop SPARSE_SWITCH;
    public static final Dop SPECIAL_FORMAT;
    public static final Dop SPUT;
    public static final Dop SPUT_BOOLEAN;
    public static final Dop SPUT_BYTE;
    public static final Dop SPUT_CHAR;
    public static final Dop SPUT_OBJECT;
    public static final Dop SPUT_SHORT;
    public static final Dop SPUT_WIDE;
    public static final Dop SUB_DOUBLE;
    public static final Dop SUB_DOUBLE_2ADDR;
    public static final Dop SUB_FLOAT;
    public static final Dop SUB_FLOAT_2ADDR;
    public static final Dop SUB_INT;
    public static final Dop SUB_INT_2ADDR;
    public static final Dop SUB_LONG;
    public static final Dop SUB_LONG_2ADDR;
    public static final Dop THROW;
    public static final Dop USHR_INT;
    public static final Dop USHR_INT_2ADDR;
    public static final Dop USHR_INT_LIT8;
    public static final Dop USHR_LONG;
    public static final Dop USHR_LONG_2ADDR;
    public static final Dop XOR_INT;
    public static final Dop XOR_INT_2ADDR;
    public static final Dop XOR_INT_LIT16;
    public static final Dop XOR_INT_LIT8;
    public static final Dop XOR_LONG;
    public static final Dop XOR_LONG_2ADDR;

    static {
        Dop dop = new Dop(-1, -1, -1, SpecialFormat.THE_ONE, false);
        SPECIAL_FORMAT = dop;
        InsnFormat insnFormat = Form10x.THE_ONE;
        Dop dop2 = new Dop(0, 0, -1, insnFormat, false);
        NOP = dop2;
        InsnFormat insnFormat2 = Form12x.THE_ONE;
        Dop dop3 = new Dop(1, 1, 2, insnFormat2, true);
        MOVE = dop3;
        InsnFormat insnFormat3 = Form22x.THE_ONE;
        Dop dop4 = new Dop(2, 1, 3, insnFormat3, true);
        MOVE_FROM16 = dop4;
        InsnFormat insnFormat4 = Form32x.THE_ONE;
        Dop dop5 = new Dop(3, 1, -1, insnFormat4, true);
        MOVE_16 = dop5;
        Dop dop6 = new Dop(4, 4, 5, insnFormat2, true);
        MOVE_WIDE = dop6;
        Dop dop7 = new Dop(5, 4, 6, insnFormat3, true);
        MOVE_WIDE_FROM16 = dop7;
        Dop dop8 = new Dop(6, 4, -1, insnFormat4, true);
        MOVE_WIDE_16 = dop8;
        Dop dop9 = new Dop(7, 7, 8, insnFormat2, true);
        MOVE_OBJECT = dop9;
        Dop dop10 = new Dop(8, 7, 9, insnFormat3, true);
        MOVE_OBJECT_FROM16 = dop10;
        Dop dop11 = new Dop(9, 7, -1, insnFormat4, true);
        MOVE_OBJECT_16 = dop11;
        InsnFormat insnFormat5 = Form11x.THE_ONE;
        Dop dop12 = new Dop(10, 10, -1, insnFormat5, true);
        MOVE_RESULT = dop12;
        InsnFormat insnFormat6 = insnFormat5;
        Dop dop13 = new Dop(11, 11, -1, insnFormat6, true);
        MOVE_RESULT_WIDE = dop13;
        Dop dop14 = new Dop(12, 12, -1, insnFormat6, true);
        MOVE_RESULT_OBJECT = dop14;
        Dop dop15 = new Dop(13, 13, -1, insnFormat6, true);
        MOVE_EXCEPTION = dop15;
        Dop dop16 = new Dop(14, 14, -1, insnFormat, false);
        RETURN_VOID = dop16;
        InsnFormat insnFormat7 = insnFormat5;
        Dop dop17 = new Dop(15, 15, -1, insnFormat7, false);
        RETURN = dop17;
        Dop dop18 = new Dop(16, 16, -1, insnFormat7, false);
        RETURN_WIDE = dop18;
        Dop dop19 = new Dop(17, 17, -1, insnFormat7, false);
        RETURN_OBJECT = dop19;
        Dop dop20 = new Dop(18, 20, 19, Form11n.THE_ONE, true);
        CONST_4 = dop20;
        InsnFormat insnFormat8 = Form21s.THE_ONE;
        Dop dop21 = new Dop(19, 20, 21, insnFormat8, true);
        CONST_16 = dop21;
        InsnFormat insnFormat9 = Form31i.THE_ONE;
        Dop dop22 = new Dop(20, 20, -1, insnFormat9, true);
        CONST = dop22;
        InsnFormat insnFormat10 = Form21h.THE_ONE;
        Dop dop23 = new Dop(21, 20, 20, insnFormat10, true);
        CONST_HIGH16 = dop23;
        Dop dop24 = new Dop(22, 24, 25, insnFormat8, true);
        CONST_WIDE_16 = dop24;
        Dop dop25 = new Dop(23, 24, 24, insnFormat9, true);
        CONST_WIDE_32 = dop25;
        Dop dop26 = new Dop(24, 24, -1, Form51l.THE_ONE, true);
        CONST_WIDE = dop26;
        Dop dop27 = new Dop(25, 24, 23, insnFormat10, true);
        CONST_WIDE_HIGH16 = dop27;
        InsnFormat insnFormat11 = Form21c.THE_ONE;
        Dop dop28 = new Dop(26, 26, 27, insnFormat11, true);
        CONST_STRING = dop28;
        Dop dop29 = new Dop(27, 26, -1, Form31c.THE_ONE, true);
        CONST_STRING_JUMBO = dop29;
        Dop dop30 = new Dop(28, 28, -1, insnFormat11, true);
        CONST_CLASS = dop30;
        InsnFormat insnFormat12 = insnFormat5;
        Dop dop31 = new Dop(29, 29, -1, insnFormat12, false);
        MONITOR_ENTER = dop31;
        Dop dop32 = new Dop(30, 30, -1, insnFormat12, false);
        MONITOR_EXIT = dop32;
        Dop dop33 = new Dop(31, 31, -1, insnFormat11, true);
        CHECK_CAST = dop33;
        InsnFormat insnFormat13 = Form22c.THE_ONE;
        Dop dop34 = new Dop(32, 32, -1, insnFormat13, true);
        INSTANCE_OF = dop34;
        Dop dop35 = new Dop(33, 33, -1, insnFormat2, true);
        ARRAY_LENGTH = dop35;
        Dop dop36 = new Dop(34, 34, -1, insnFormat11, true);
        NEW_INSTANCE = dop36;
        Dop dop37 = new Dop(35, 35, -1, insnFormat13, true);
        NEW_ARRAY = dop37;
        InsnFormat insnFormat14 = Form35c.THE_ONE;
        Dop dop38 = new Dop(36, 36, 37, insnFormat14, false);
        FILLED_NEW_ARRAY = dop38;
        InsnFormat insnFormat15 = Form3rc.THE_ONE;
        Dop dop39 = new Dop(37, 36, -1, insnFormat15, false);
        FILLED_NEW_ARRAY_RANGE = dop39;
        InsnFormat insnFormat16 = Form31t.THE_ONE;
        Dop dop40 = new Dop(38, 38, -1, insnFormat16, false);
        FILL_ARRAY_DATA = dop40;
        Dop dop41 = new Dop(39, 39, -1, insnFormat5, false);
        THROW = dop41;
        Dop dop42 = new Dop(40, 40, 41, Form10t.THE_ONE, false);
        GOTO = dop42;
        Dop dop43 = new Dop(41, 40, 42, Form20t.THE_ONE, false);
        GOTO_16 = dop43;
        Dop dop44 = new Dop(42, 40, -1, Form30t.THE_ONE, false);
        GOTO_32 = dop44;
        InsnFormat insnFormat17 = insnFormat16;
        Dop dop45 = new Dop(43, 43, -1, insnFormat17, false);
        PACKED_SWITCH = dop45;
        Dop dop46 = new Dop(44, 44, -1, insnFormat17, false);
        SPARSE_SWITCH = dop46;
        InsnFormat insnFormat18 = Form23x.THE_ONE;
        Dop dop47 = new Dop(45, 45, -1, insnFormat18, true);
        CMPL_FLOAT = dop47;
        InsnFormat insnFormat19 = insnFormat18;
        Dop dop48 = new Dop(46, 46, -1, insnFormat19, true);
        CMPG_FLOAT = dop48;
        Dop dop49 = new Dop(47, 47, -1, insnFormat19, true);
        CMPL_DOUBLE = dop49;
        Dop dop50 = new Dop(48, 48, -1, insnFormat19, true);
        CMPG_DOUBLE = dop50;
        Dop dop51 = new Dop(49, 49, -1, insnFormat19, true);
        CMP_LONG = dop51;
        InsnFormat insnFormat20 = Form22t.THE_ONE;
        Dop dop52 = new Dop(50, 50, -1, insnFormat20, false);
        IF_EQ = dop52;
        InsnFormat insnFormat21 = insnFormat20;
        Dop dop53 = new Dop(51, 51, -1, insnFormat21, false);
        IF_NE = dop53;
        Dop dop54 = new Dop(52, 52, -1, insnFormat21, false);
        IF_LT = dop54;
        Dop dop55 = new Dop(53, 53, -1, insnFormat21, false);
        IF_GE = dop55;
        Dop dop56 = new Dop(54, 54, -1, insnFormat21, false);
        IF_GT = dop56;
        Dop dop57 = new Dop(55, 55, -1, insnFormat21, false);
        IF_LE = dop57;
        InsnFormat insnFormat22 = Form21t.THE_ONE;
        Dop dop58 = new Dop(56, 56, -1, insnFormat22, false);
        IF_EQZ = dop58;
        InsnFormat insnFormat23 = insnFormat22;
        Dop dop59 = new Dop(57, 57, -1, insnFormat23, false);
        IF_NEZ = dop59;
        Dop dop60 = new Dop(58, 58, -1, insnFormat23, false);
        IF_LTZ = dop60;
        Dop dop61 = new Dop(59, 59, -1, insnFormat23, false);
        IF_GEZ = dop61;
        Dop dop62 = new Dop(60, 60, -1, insnFormat23, false);
        IF_GTZ = dop62;
        Dop dop63 = new Dop(61, 61, -1, insnFormat23, false);
        IF_LEZ = dop63;
        InsnFormat insnFormat24 = insnFormat18;
        Dop dop64 = new Dop(68, 68, -1, insnFormat24, true);
        AGET = dop64;
        Dop dop65 = new Dop(69, 69, -1, insnFormat24, true);
        AGET_WIDE = dop65;
        Dop dop66 = new Dop(70, 70, -1, insnFormat24, true);
        AGET_OBJECT = dop66;
        Dop dop67 = new Dop(71, 71, -1, insnFormat24, true);
        AGET_BOOLEAN = dop67;
        Dop dop68 = new Dop(72, 72, -1, insnFormat24, true);
        AGET_BYTE = dop68;
        Dop dop69 = new Dop(73, 73, -1, insnFormat24, true);
        AGET_CHAR = dop69;
        Dop dop70 = new Dop(74, 74, -1, insnFormat24, true);
        AGET_SHORT = dop70;
        Dop dop71 = new Dop(75, 75, -1, insnFormat24, false);
        APUT = dop71;
        Dop dop72 = new Dop(76, 76, -1, insnFormat24, false);
        APUT_WIDE = dop72;
        Dop dop73 = new Dop(77, 77, -1, insnFormat24, false);
        APUT_OBJECT = dop73;
        Dop dop74 = new Dop(78, 78, -1, insnFormat24, false);
        APUT_BOOLEAN = dop74;
        Dop dop75 = new Dop(79, 79, -1, insnFormat24, false);
        APUT_BYTE = dop75;
        Dop dop76 = new Dop(80, 80, -1, insnFormat24, false);
        APUT_CHAR = dop76;
        Dop dop77 = new Dop(81, 81, -1, insnFormat24, false);
        APUT_SHORT = dop77;
        InsnFormat insnFormat25 = insnFormat13;
        Dop dop78 = new Dop(82, 82, -1, insnFormat25, true);
        IGET = dop78;
        Dop dop79 = new Dop(83, 83, -1, insnFormat25, true);
        IGET_WIDE = dop79;
        Dop dop80 = new Dop(84, 84, -1, insnFormat25, true);
        IGET_OBJECT = dop80;
        Dop dop81 = new Dop(85, 85, -1, insnFormat25, true);
        IGET_BOOLEAN = dop81;
        Dop dop82 = new Dop(86, 86, -1, insnFormat25, true);
        IGET_BYTE = dop82;
        Dop dop83 = new Dop(87, 87, -1, insnFormat25, true);
        IGET_CHAR = dop83;
        Dop dop84 = new Dop(88, 88, -1, insnFormat25, true);
        IGET_SHORT = dop84;
        Dop dop85 = new Dop(89, 89, -1, insnFormat25, false);
        IPUT = dop85;
        Dop dop86 = new Dop(90, 90, -1, insnFormat25, false);
        IPUT_WIDE = dop86;
        Dop dop87 = new Dop(91, 91, -1, insnFormat25, false);
        IPUT_OBJECT = dop87;
        Dop dop88 = new Dop(92, 92, -1, insnFormat25, false);
        IPUT_BOOLEAN = dop88;
        Dop dop89 = new Dop(93, 93, -1, insnFormat25, false);
        IPUT_BYTE = dop89;
        Dop dop90 = new Dop(94, 94, -1, insnFormat25, false);
        IPUT_CHAR = dop90;
        Dop dop91 = new Dop(95, 95, -1, insnFormat25, false);
        IPUT_SHORT = dop91;
        InsnFormat insnFormat26 = insnFormat11;
        Dop dop92 = new Dop(96, 96, -1, insnFormat26, true);
        SGET = dop92;
        Dop dop93 = new Dop(97, 97, -1, insnFormat26, true);
        SGET_WIDE = dop93;
        Dop dop94 = new Dop(98, 98, -1, insnFormat26, true);
        SGET_OBJECT = dop94;
        Dop dop95 = new Dop(99, 99, -1, insnFormat26, true);
        SGET_BOOLEAN = dop95;
        Dop dop96 = new Dop(100, 100, -1, insnFormat26, true);
        SGET_BYTE = dop96;
        Dop dop97 = new Dop(101, 101, -1, insnFormat26, true);
        SGET_CHAR = dop97;
        Dop dop98 = new Dop(102, 102, -1, insnFormat26, true);
        SGET_SHORT = dop98;
        Dop dop99 = new Dop(103, 103, -1, insnFormat26, false);
        SPUT = dop99;
        Dop dop100 = new Dop(104, 104, -1, insnFormat26, false);
        SPUT_WIDE = dop100;
        Dop dop101 = new Dop(105, 105, -1, insnFormat26, false);
        SPUT_OBJECT = dop101;
        Dop dop102 = new Dop(106, 106, -1, insnFormat26, false);
        SPUT_BOOLEAN = dop102;
        Dop dop103 = new Dop(107, 107, -1, insnFormat26, false);
        SPUT_BYTE = dop103;
        Dop dop104 = new Dop(108, 108, -1, insnFormat26, false);
        SPUT_CHAR = dop104;
        Dop dop105 = new Dop(109, 109, -1, insnFormat26, false);
        SPUT_SHORT = dop105;
        InsnFormat insnFormat27 = insnFormat14;
        Dop dop106 = new Dop(110, 110, 116, insnFormat27, false);
        INVOKE_VIRTUAL = dop106;
        Dop dop107 = new Dop(111, 111, 117, insnFormat27, false);
        INVOKE_SUPER = dop107;
        Dop dop108 = new Dop(112, 112, 118, insnFormat27, false);
        INVOKE_DIRECT = dop108;
        Dop dop109 = new Dop(113, 113, 119, insnFormat27, false);
        INVOKE_STATIC = dop109;
        Dop dop110 = new Dop(114, 114, 120, insnFormat27, false);
        INVOKE_INTERFACE = dop110;
        InsnFormat insnFormat28 = insnFormat15;
        Dop dop111 = new Dop(116, 110, -1, insnFormat28, false);
        INVOKE_VIRTUAL_RANGE = dop111;
        Dop dop112 = new Dop(117, 111, -1, insnFormat28, false);
        INVOKE_SUPER_RANGE = dop112;
        Dop dop113 = new Dop(118, 112, -1, insnFormat28, false);
        INVOKE_DIRECT_RANGE = dop113;
        Dop dop114 = new Dop(119, 113, -1, insnFormat28, false);
        INVOKE_STATIC_RANGE = dop114;
        Dop dop115 = new Dop(120, 114, -1, insnFormat28, false);
        INVOKE_INTERFACE_RANGE = dop115;
        InsnFormat insnFormat29 = insnFormat2;
        Dop dop116 = new Dop(123, 123, -1, insnFormat29, true);
        NEG_INT = dop116;
        Dop dop117 = new Dop(124, 124, -1, insnFormat29, true);
        NOT_INT = dop117;
        Dop dop118 = new Dop(125, 125, -1, insnFormat29, true);
        NEG_LONG = dop118;
        Dop dop119 = new Dop(126, 126, -1, insnFormat29, true);
        NOT_LONG = dop119;
        Dop dop120 = new Dop(127, 127, -1, insnFormat29, true);
        NEG_FLOAT = dop120;
        Dop dop121 = new Dop(128, 128, -1, insnFormat29, true);
        NEG_DOUBLE = dop121;
        Dop dop122 = new Dop(129, 129, -1, insnFormat29, true);
        INT_TO_LONG = dop122;
        Dop dop123 = new Dop(130, 130, -1, insnFormat29, true);
        INT_TO_FLOAT = dop123;
        Dop dop124 = new Dop(131, 131, -1, insnFormat29, true);
        INT_TO_DOUBLE = dop124;
        Dop dop125 = new Dop(132, 132, -1, insnFormat29, true);
        LONG_TO_INT = dop125;
        Dop dop126 = new Dop(133, 133, -1, insnFormat29, true);
        LONG_TO_FLOAT = dop126;
        Dop dop127 = new Dop(134, 134, -1, insnFormat29, true);
        LONG_TO_DOUBLE = dop127;
        Dop dop128 = new Dop(135, 135, -1, insnFormat29, true);
        FLOAT_TO_INT = dop128;
        Dop dop129 = new Dop(136, 136, -1, insnFormat29, true);
        FLOAT_TO_LONG = dop129;
        Dop dop130 = new Dop(137, 137, -1, insnFormat29, true);
        FLOAT_TO_DOUBLE = dop130;
        Dop dop131 = new Dop(138, 138, -1, insnFormat29, true);
        DOUBLE_TO_INT = dop131;
        Dop dop132 = new Dop(139, 139, -1, insnFormat29, true);
        DOUBLE_TO_LONG = dop132;
        Dop dop133 = new Dop(140, 140, -1, insnFormat29, true);
        DOUBLE_TO_FLOAT = dop133;
        Dop dop134 = new Dop(141, 141, -1, insnFormat29, true);
        INT_TO_BYTE = dop134;
        Dop dop135 = new Dop(142, 142, -1, insnFormat29, true);
        INT_TO_CHAR = dop135;
        Dop dop136 = new Dop(143, 143, -1, insnFormat29, true);
        INT_TO_SHORT = dop136;
        InsnFormat insnFormat30 = insnFormat18;
        Dop dop137 = new Dop(144, 144, -1, insnFormat30, true);
        ADD_INT = dop137;
        Dop dop138 = new Dop(145, 145, -1, insnFormat30, true);
        SUB_INT = dop138;
        Dop dop139 = new Dop(146, 146, -1, insnFormat30, true);
        MUL_INT = dop139;
        Dop dop140 = new Dop(147, 147, -1, insnFormat30, true);
        DIV_INT = dop140;
        Dop dop141 = new Dop(148, 148, -1, insnFormat30, true);
        REM_INT = dop141;
        Dop dop142 = new Dop(149, 149, -1, insnFormat30, true);
        AND_INT = dop142;
        Dop dop143 = new Dop(150, 150, -1, insnFormat30, true);
        OR_INT = dop143;
        Dop dop144 = new Dop(151, 151, -1, insnFormat30, true);
        XOR_INT = dop144;
        Dop dop145 = new Dop(152, 152, -1, insnFormat30, true);
        SHL_INT = dop145;
        Dop dop146 = new Dop(153, 153, -1, insnFormat30, true);
        SHR_INT = dop146;
        Dop dop147 = new Dop(154, 154, -1, insnFormat30, true);
        USHR_INT = dop147;
        Dop dop148 = new Dop(155, 155, -1, insnFormat30, true);
        ADD_LONG = dop148;
        Dop dop149 = new Dop(156, 156, -1, insnFormat30, true);
        SUB_LONG = dop149;
        Dop dop150 = new Dop(157, 157, -1, insnFormat30, true);
        MUL_LONG = dop150;
        Dop dop151 = new Dop(158, 158, -1, insnFormat30, true);
        DIV_LONG = dop151;
        Dop dop152 = new Dop(159, 159, -1, insnFormat30, true);
        REM_LONG = dop152;
        Dop dop153 = new Dop(160, 160, -1, insnFormat30, true);
        AND_LONG = dop153;
        Dop dop154 = new Dop(161, 161, -1, insnFormat30, true);
        OR_LONG = dop154;
        Dop dop155 = new Dop(162, 162, -1, insnFormat30, true);
        XOR_LONG = dop155;
        Dop dop156 = new Dop(163, 163, -1, insnFormat30, true);
        SHL_LONG = dop156;
        Dop dop157 = new Dop(164, 164, -1, insnFormat30, true);
        SHR_LONG = dop157;
        Dop dop158 = new Dop(165, 165, -1, insnFormat30, true);
        USHR_LONG = dop158;
        Dop dop159 = new Dop(166, 166, -1, insnFormat30, true);
        ADD_FLOAT = dop159;
        Dop dop160 = new Dop(167, 167, -1, insnFormat30, true);
        SUB_FLOAT = dop160;
        Dop dop161 = new Dop(168, 168, -1, insnFormat30, true);
        MUL_FLOAT = dop161;
        Dop dop162 = new Dop(169, 169, -1, insnFormat30, true);
        DIV_FLOAT = dop162;
        Dop dop163 = new Dop(170, 170, -1, insnFormat30, true);
        REM_FLOAT = dop163;
        Dop dop164 = new Dop(171, 171, -1, insnFormat30, true);
        ADD_DOUBLE = dop164;
        Dop dop165 = new Dop(172, 172, -1, insnFormat30, true);
        SUB_DOUBLE = dop165;
        Dop dop166 = new Dop(173, 173, -1, insnFormat30, true);
        MUL_DOUBLE = dop166;
        Dop dop167 = new Dop(174, 174, -1, insnFormat30, true);
        DIV_DOUBLE = dop167;
        Dop dop168 = new Dop(175, 175, -1, insnFormat30, true);
        REM_DOUBLE = dop168;
        InsnFormat insnFormat31 = insnFormat2;
        Dop dop169 = new Dop(176, 144, 144, insnFormat31, true);
        ADD_INT_2ADDR = dop169;
        Dop dop170 = new Dop(177, 145, 145, insnFormat31, true);
        SUB_INT_2ADDR = dop170;
        Dop dop171 = new Dop(178, 146, 146, insnFormat31, true);
        MUL_INT_2ADDR = dop171;
        Dop dop172 = new Dop(179, 147, 147, insnFormat31, true);
        DIV_INT_2ADDR = dop172;
        Dop dop173 = new Dop(180, 148, 148, insnFormat31, true);
        REM_INT_2ADDR = dop173;
        Dop dop174 = new Dop(181, 149, 149, insnFormat31, true);
        AND_INT_2ADDR = dop174;
        Dop dop175 = new Dop(182, 150, 150, insnFormat31, true);
        OR_INT_2ADDR = dop175;
        Dop dop176 = new Dop(183, 151, 151, insnFormat31, true);
        XOR_INT_2ADDR = dop176;
        Dop dop177 = new Dop(184, 152, 152, insnFormat31, true);
        SHL_INT_2ADDR = dop177;
        Dop dop178 = new Dop(185, 153, 153, insnFormat31, true);
        SHR_INT_2ADDR = dop178;
        Dop dop179 = new Dop(186, 154, 154, insnFormat31, true);
        USHR_INT_2ADDR = dop179;
        Dop dop180 = new Dop(187, 155, 155, insnFormat31, true);
        ADD_LONG_2ADDR = dop180;
        Dop dop181 = new Dop(188, 156, 156, insnFormat31, true);
        SUB_LONG_2ADDR = dop181;
        Dop dop182 = new Dop(189, 157, 157, insnFormat31, true);
        MUL_LONG_2ADDR = dop182;
        Dop dop183 = new Dop(190, 158, 158, insnFormat31, true);
        DIV_LONG_2ADDR = dop183;
        Dop dop184 = new Dop(191, 159, 159, insnFormat31, true);
        REM_LONG_2ADDR = dop184;
        Dop dop185 = new Dop(192, 160, 160, insnFormat31, true);
        AND_LONG_2ADDR = dop185;
        Dop dop186 = new Dop(193, 161, 161, insnFormat31, true);
        OR_LONG_2ADDR = dop186;
        Dop dop187 = new Dop(194, 162, 162, insnFormat31, true);
        XOR_LONG_2ADDR = dop187;
        Dop dop188 = new Dop(195, 163, 163, insnFormat31, true);
        SHL_LONG_2ADDR = dop188;
        Dop dop189 = new Dop(196, 164, 164, insnFormat31, true);
        SHR_LONG_2ADDR = dop189;
        Dop dop190 = new Dop(197, 165, 165, insnFormat31, true);
        USHR_LONG_2ADDR = dop190;
        Dop dop191 = new Dop(198, 166, 166, insnFormat31, true);
        ADD_FLOAT_2ADDR = dop191;
        Dop dop192 = new Dop(199, 167, 167, insnFormat31, true);
        SUB_FLOAT_2ADDR = dop192;
        Dop dop193 = new Dop(200, 168, 168, insnFormat31, true);
        MUL_FLOAT_2ADDR = dop193;
        Dop dop194 = new Dop(201, 169, 169, insnFormat31, true);
        DIV_FLOAT_2ADDR = dop194;
        Dop dop195 = new Dop(202, 170, 170, insnFormat31, true);
        REM_FLOAT_2ADDR = dop195;
        Dop dop196 = new Dop(203, 171, 171, insnFormat31, true);
        ADD_DOUBLE_2ADDR = dop196;
        Dop dop197 = new Dop(204, 172, 172, insnFormat31, true);
        SUB_DOUBLE_2ADDR = dop197;
        Dop dop198 = new Dop(205, 173, 173, insnFormat31, true);
        MUL_DOUBLE_2ADDR = dop198;
        Dop dop199 = new Dop(206, 174, 174, insnFormat31, true);
        DIV_DOUBLE_2ADDR = dop199;
        Dop dop200 = new Dop(207, 175, 175, insnFormat31, true);
        REM_DOUBLE_2ADDR = dop200;
        InsnFormat insnFormat32 = Form22s.THE_ONE;
        Dop dop201 = new Dop(Opcodes.ADD_INT_LIT16, 144, -1, insnFormat32, true);
        ADD_INT_LIT16 = dop201;
        InsnFormat insnFormat33 = insnFormat32;
        Dop dop202 = new Dop(Opcodes.RSUB_INT, Opcodes.RSUB_INT, -1, insnFormat33, true);
        RSUB_INT = dop202;
        Dop dop203 = new Dop(Opcodes.MUL_INT_LIT16, 146, -1, insnFormat33, true);
        MUL_INT_LIT16 = dop203;
        Dop dop204 = new Dop(Opcodes.DIV_INT_LIT16, 147, -1, insnFormat33, true);
        DIV_INT_LIT16 = dop204;
        Dop dop205 = new Dop(Opcodes.REM_INT_LIT16, 148, -1, insnFormat33, true);
        REM_INT_LIT16 = dop205;
        Dop dop206 = new Dop(Opcodes.AND_INT_LIT16, 149, -1, insnFormat33, true);
        AND_INT_LIT16 = dop206;
        Dop dop207 = new Dop(Opcodes.OR_INT_LIT16, 150, -1, insnFormat33, true);
        OR_INT_LIT16 = dop207;
        Dop dop208 = new Dop(Opcodes.XOR_INT_LIT16, 151, -1, insnFormat33, true);
        XOR_INT_LIT16 = dop208;
        InsnFormat insnFormat34 = Form22b.THE_ONE;
        Dop dop209 = new Dop(Opcodes.ADD_INT_LIT8, 144, Opcodes.ADD_INT_LIT16, insnFormat34, true);
        ADD_INT_LIT8 = dop209;
        Dop dop210 = new Dop(Opcodes.RSUB_INT_LIT8, Opcodes.RSUB_INT, Opcodes.RSUB_INT, insnFormat34, true);
        RSUB_INT_LIT8 = dop210;
        Dop dop211 = new Dop(Opcodes.MUL_INT_LIT8, 146, Opcodes.MUL_INT_LIT16, insnFormat34, true);
        MUL_INT_LIT8 = dop211;
        Dop dop212 = new Dop(Opcodes.DIV_INT_LIT8, 147, Opcodes.DIV_INT_LIT16, insnFormat34, true);
        DIV_INT_LIT8 = dop212;
        Dop dop213 = new Dop(Opcodes.REM_INT_LIT8, 148, Opcodes.REM_INT_LIT16, insnFormat34, true);
        REM_INT_LIT8 = dop213;
        Dop dop214 = new Dop(Opcodes.AND_INT_LIT8, 149, Opcodes.AND_INT_LIT16, insnFormat34, true);
        AND_INT_LIT8 = dop214;
        Dop dop215 = new Dop(Opcodes.OR_INT_LIT8, 150, Opcodes.OR_INT_LIT16, insnFormat34, true);
        OR_INT_LIT8 = dop215;
        Dop dop216 = new Dop(Opcodes.XOR_INT_LIT8, 151, Opcodes.XOR_INT_LIT16, insnFormat34, true);
        XOR_INT_LIT8 = dop216;
        Dop dop217 = new Dop(Opcodes.SHL_INT_LIT8, 152, -1, insnFormat34, true);
        SHL_INT_LIT8 = dop217;
        Dop dop218 = new Dop(Opcodes.SHR_INT_LIT8, 153, -1, insnFormat34, true);
        SHR_INT_LIT8 = dop218;
        Dop dop219 = new Dop(Opcodes.USHR_INT_LIT8, 154, -1, insnFormat34, true);
        USHR_INT_LIT8 = dop219;
        set(dop);
        set(dop2);
        set(dop3);
        set(dop4);
        set(dop5);
        set(dop6);
        set(dop7);
        set(dop8);
        set(dop9);
        set(dop10);
        set(dop11);
        set(dop12);
        set(dop13);
        set(dop14);
        set(dop15);
        set(dop16);
        set(dop17);
        set(dop18);
        set(dop19);
        set(dop20);
        set(dop21);
        set(dop22);
        set(dop23);
        set(dop24);
        set(dop25);
        set(dop26);
        set(dop27);
        set(dop28);
        set(dop29);
        set(dop30);
        set(dop31);
        set(dop32);
        set(dop33);
        set(dop34);
        set(dop35);
        set(dop36);
        set(dop37);
        set(dop38);
        set(dop39);
        set(dop40);
        set(dop41);
        set(dop42);
        set(dop43);
        set(dop44);
        set(dop45);
        set(dop46);
        set(dop47);
        set(dop48);
        set(dop49);
        set(dop50);
        set(dop51);
        set(dop52);
        set(dop53);
        set(dop54);
        set(dop55);
        set(dop56);
        set(dop57);
        set(dop58);
        set(dop59);
        set(dop60);
        set(dop61);
        set(dop62);
        set(dop63);
        set(dop64);
        set(dop65);
        set(dop66);
        set(dop67);
        set(dop68);
        set(dop69);
        set(dop70);
        set(dop71);
        set(dop72);
        set(dop73);
        set(dop74);
        set(dop75);
        set(dop76);
        set(dop77);
        set(dop78);
        set(dop79);
        set(dop80);
        set(dop81);
        set(dop82);
        set(dop83);
        set(dop84);
        set(dop85);
        set(dop86);
        set(dop87);
        set(dop88);
        set(dop89);
        set(dop90);
        set(dop91);
        set(dop92);
        set(dop93);
        set(dop94);
        set(dop95);
        set(dop96);
        set(dop97);
        set(dop98);
        set(dop99);
        set(dop100);
        set(dop101);
        set(dop102);
        set(dop103);
        set(dop104);
        set(dop105);
        set(dop106);
        set(dop107);
        set(dop108);
        set(dop109);
        set(dop110);
        set(dop111);
        set(dop112);
        set(dop113);
        set(dop114);
        set(dop115);
        set(dop116);
        set(dop117);
        set(dop118);
        set(dop119);
        set(dop120);
        set(dop121);
        set(dop122);
        set(dop123);
        set(dop124);
        set(dop125);
        set(dop126);
        set(dop127);
        set(dop128);
        set(dop129);
        set(dop130);
        set(dop131);
        set(dop132);
        set(dop133);
        set(dop134);
        set(dop135);
        set(dop136);
        set(dop137);
        set(dop138);
        set(dop139);
        set(dop140);
        set(dop141);
        set(dop142);
        set(dop143);
        set(dop144);
        set(dop145);
        set(dop146);
        set(dop147);
        set(dop148);
        set(dop149);
        set(dop150);
        set(dop151);
        set(dop152);
        set(dop153);
        set(dop154);
        set(dop155);
        set(dop156);
        set(dop157);
        set(dop158);
        set(dop159);
        set(dop160);
        set(dop161);
        set(dop162);
        set(dop163);
        set(dop164);
        set(dop165);
        set(dop166);
        set(dop167);
        set(dop168);
        set(dop169);
        set(dop170);
        set(dop171);
        set(dop172);
        set(dop173);
        set(dop174);
        set(dop175);
        set(dop176);
        set(dop177);
        set(dop178);
        set(dop179);
        set(dop180);
        set(dop181);
        set(dop182);
        set(dop183);
        set(dop184);
        set(dop185);
        set(dop186);
        set(dop187);
        set(dop188);
        set(dop189);
        set(dop190);
        set(dop191);
        set(dop192);
        set(dop193);
        set(dop194);
        set(dop195);
        set(dop196);
        set(dop197);
        set(dop198);
        set(dop199);
        set(dop200);
        set(dop201);
        set(dop202);
        set(dop203);
        set(dop204);
        set(dop205);
        set(dop206);
        set(dop207);
        set(dop208);
        set(dop209);
        set(dop210);
        set(dop211);
        set(dop212);
        set(dop213);
        set(dop214);
        set(dop215);
        set(dop216);
        set(dop217);
        set(dop218);
        set(dop219);
    }

    private Dops() {
    }

    public static Dop get(int i) {
        try {
            Dop dop = DOPS[i + 1];
            if (dop != null) {
                return dop;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        throw new IllegalArgumentException("bogus opcode");
    }

    public static Dop getNextOrNull(Dop dop, DexOptions dexOptions) {
        int nextOpcode = dop.getNextOpcode();
        if (nextOpcode == -1) {
            return null;
        }
        return get(nextOpcode);
    }

    private static void set(Dop dop) {
        DOPS[dop.getOpcode() + 1] = dop;
    }
}
