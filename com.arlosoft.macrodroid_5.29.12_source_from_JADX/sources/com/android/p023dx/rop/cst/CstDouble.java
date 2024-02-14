package com.android.p023dx.rop.cst;

import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.Hex;

/* renamed from: com.android.dx.rop.cst.CstDouble */
public final class CstDouble extends CstLiteral64 {
    public static final CstDouble VALUE_0 = new CstDouble(Double.doubleToLongBits(0.0d));
    public static final CstDouble VALUE_1 = new CstDouble(Double.doubleToLongBits(1.0d));

    private CstDouble(long j) {
        super(j);
    }

    public static CstDouble make(long j) {
        return new CstDouble(j);
    }

    public Type getType() {
        return Type.DOUBLE;
    }

    public double getValue() {
        return Double.longBitsToDouble(getLongBits());
    }

    public String toHuman() {
        return Double.toString(Double.longBitsToDouble(getLongBits()));
    }

    public String toString() {
        long longBits = getLongBits();
        return "double{0x" + Hex.m910u8(longBits) + " / " + Double.longBitsToDouble(longBits) + '}';
    }

    public String typeName() {
        return "double";
    }
}
