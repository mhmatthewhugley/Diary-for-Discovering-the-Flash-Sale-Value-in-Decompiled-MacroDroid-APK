package com.android.p023dx.rop.cst;

import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.Hex;

/* renamed from: com.android.dx.rop.cst.CstChar */
public final class CstChar extends CstLiteral32 {
    public static final CstChar VALUE_0 = make(0);

    private CstChar(char c) {
        super(c);
    }

    public static CstChar make(char c) {
        return new CstChar(c);
    }

    public Type getType() {
        return Type.CHAR;
    }

    public char getValue() {
        return (char) getIntBits();
    }

    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public String toString() {
        int intBits = getIntBits();
        return "char{0x" + Hex.m907u2(intBits) + " / " + intBits + '}';
    }

    public String typeName() {
        return "char";
    }

    public static CstChar make(int i) {
        char c = (char) i;
        if (c == i) {
            return make(c);
        }
        throw new IllegalArgumentException("bogus char value: " + i);
    }
}
