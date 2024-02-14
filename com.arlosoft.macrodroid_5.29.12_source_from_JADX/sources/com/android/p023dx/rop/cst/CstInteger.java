package com.android.p023dx.rop.cst;

import androidx.core.app.FrameMetricsAggregator;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.Hex;

/* renamed from: com.android.dx.rop.cst.CstInteger */
public final class CstInteger extends CstLiteral32 {
    public static final CstInteger VALUE_0 = make(0);
    public static final CstInteger VALUE_1 = make(1);
    public static final CstInteger VALUE_2 = make(2);
    public static final CstInteger VALUE_3 = make(3);
    public static final CstInteger VALUE_4 = make(4);
    public static final CstInteger VALUE_5 = make(5);
    public static final CstInteger VALUE_M1 = make(-1);
    private static final CstInteger[] cache = new CstInteger[FrameMetricsAggregator.EVERY_DURATION];

    private CstInteger(int i) {
        super(i);
    }

    public static CstInteger make(int i) {
        CstInteger[] cstIntegerArr = cache;
        int length = (Integer.MAX_VALUE & i) % cstIntegerArr.length;
        CstInteger cstInteger = cstIntegerArr[length];
        if (cstInteger != null && cstInteger.getValue() == i) {
            return cstInteger;
        }
        CstInteger cstInteger2 = new CstInteger(i);
        cstIntegerArr[length] = cstInteger2;
        return cstInteger2;
    }

    public Type getType() {
        return Type.INT;
    }

    public int getValue() {
        return getIntBits();
    }

    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public String toString() {
        int intBits = getIntBits();
        return "int{0x" + Hex.m909u4(intBits) + " / " + intBits + '}';
    }

    public String typeName() {
        return "int";
    }
}
