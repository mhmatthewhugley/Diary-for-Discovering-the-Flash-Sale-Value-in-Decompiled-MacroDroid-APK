package com.android.p023dx.rop.cst;

/* renamed from: com.android.dx.rop.cst.CstLiteral64 */
public abstract class CstLiteral64 extends CstLiteralBits {
    private final long bits;

    CstLiteral64(long j) {
        this.bits = j;
    }

    /* access modifiers changed from: protected */
    public int compareTo0(Constant constant) {
        long j = ((CstLiteral64) constant).bits;
        long j2 = this.bits;
        if (j2 < j) {
            return -1;
        }
        return j2 > j ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.bits == ((CstLiteral64) obj).bits;
    }

    public final boolean fitsInInt() {
        long j = this.bits;
        return ((long) ((int) j)) == j;
    }

    public final int getIntBits() {
        return (int) this.bits;
    }

    public final long getLongBits() {
        return this.bits;
    }

    public final int hashCode() {
        long j = this.bits;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public final boolean isCategory2() {
        return true;
    }
}
