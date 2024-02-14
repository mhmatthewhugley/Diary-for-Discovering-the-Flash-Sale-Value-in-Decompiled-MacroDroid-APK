package com.android.p023dx.rop.cst;

import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.Hex;

/* renamed from: com.android.dx.rop.cst.CstShort */
public final class CstShort extends CstLiteral32 {
    public static final CstShort VALUE_0 = make(0);

    private CstShort(short s) {
        super(s);
    }

    public static CstShort make(short s) {
        return new CstShort(s);
    }

    public Type getType() {
        return Type.SHORT;
    }

    public short getValue() {
        return (short) getIntBits();
    }

    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public String toString() {
        int intBits = getIntBits();
        return "short{0x" + Hex.m907u2(intBits) + " / " + intBits + '}';
    }

    public String typeName() {
        return "short";
    }

    public static CstShort make(int i) {
        short s = (short) i;
        if (s == i) {
            return make(s);
        }
        throw new IllegalArgumentException("bogus short value: " + i);
    }
}
