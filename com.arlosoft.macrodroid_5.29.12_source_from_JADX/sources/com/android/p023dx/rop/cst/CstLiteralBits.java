package com.android.p023dx.rop.cst;

/* renamed from: com.android.dx.rop.cst.CstLiteralBits */
public abstract class CstLiteralBits extends TypedConstant {
    public boolean fitsIn16Bits() {
        if (!fitsInInt()) {
            return false;
        }
        int intBits = getIntBits();
        if (((short) intBits) == intBits) {
            return true;
        }
        return false;
    }

    public boolean fitsIn8Bits() {
        if (!fitsInInt()) {
            return false;
        }
        int intBits = getIntBits();
        if (((byte) intBits) == intBits) {
            return true;
        }
        return false;
    }

    public abstract boolean fitsInInt();

    public abstract int getIntBits();

    public abstract long getLongBits();
}
