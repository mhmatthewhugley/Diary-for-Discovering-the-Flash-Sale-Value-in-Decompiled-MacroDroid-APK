package com.android.p023dx.rop.cst;

import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.Hex;

/* renamed from: com.android.dx.rop.cst.CstByte */
public final class CstByte extends CstLiteral32 {
    public static final CstByte VALUE_0 = make((byte) 0);

    private CstByte(byte b) {
        super(b);
    }

    public static CstByte make(byte b) {
        return new CstByte(b);
    }

    public Type getType() {
        return Type.BYTE;
    }

    public byte getValue() {
        return (byte) getIntBits();
    }

    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public String toString() {
        int intBits = getIntBits();
        return "byte{0x" + Hex.m906u1(intBits) + " / " + intBits + '}';
    }

    public String typeName() {
        return "byte";
    }

    public static CstByte make(int i) {
        byte b = (byte) i;
        if (b == i) {
            return make(b);
        }
        throw new IllegalArgumentException("bogus byte value: " + i);
    }
}
