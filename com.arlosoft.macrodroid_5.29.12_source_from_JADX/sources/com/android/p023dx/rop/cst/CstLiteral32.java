package com.android.p023dx.rop.cst;

/* renamed from: com.android.dx.rop.cst.CstLiteral32 */
public abstract class CstLiteral32 extends CstLiteralBits {
    private final int bits;

    CstLiteral32(int i) {
        this.bits = i;
    }

    /* access modifiers changed from: protected */
    public int compareTo0(Constant constant) {
        int i = ((CstLiteral32) constant).bits;
        int i2 = this.bits;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.bits == ((CstLiteral32) obj).bits;
    }

    public final boolean fitsInInt() {
        return true;
    }

    public final int getIntBits() {
        return this.bits;
    }

    public final long getLongBits() {
        return (long) this.bits;
    }

    public final int hashCode() {
        return this.bits;
    }

    public final boolean isCategory2() {
        return false;
    }
}
