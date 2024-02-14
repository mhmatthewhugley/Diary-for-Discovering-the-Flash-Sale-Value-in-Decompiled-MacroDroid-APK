package com.android.p023dx.rop.cst;

import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.Hex;

/* renamed from: com.android.dx.rop.cst.CstLong */
public final class CstLong extends CstLiteral64 {
    public static final CstLong VALUE_0 = make(0);
    public static final CstLong VALUE_1 = make(1);

    private CstLong(long j) {
        super(j);
    }

    public static CstLong make(long j) {
        return new CstLong(j);
    }

    public Type getType() {
        return Type.LONG;
    }

    public long getValue() {
        return getLongBits();
    }

    public String toHuman() {
        return Long.toString(getLongBits());
    }

    public String toString() {
        long longBits = getLongBits();
        return "long{0x" + Hex.m910u8(longBits) + " / " + longBits + '}';
    }

    public String typeName() {
        return "long";
    }
}
