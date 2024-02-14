package com.android.p023dx.rop.cst;

import com.android.p023dx.rop.type.Type;

/* renamed from: com.android.dx.rop.cst.CstKnownNull */
public final class CstKnownNull extends CstLiteralBits {
    public static final CstKnownNull THE_ONE = new CstKnownNull();

    private CstKnownNull() {
    }

    /* access modifiers changed from: protected */
    public int compareTo0(Constant constant) {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj instanceof CstKnownNull;
    }

    public boolean fitsInInt() {
        return true;
    }

    public int getIntBits() {
        return 0;
    }

    public long getLongBits() {
        return 0;
    }

    public Type getType() {
        return Type.KNOWN_NULL;
    }

    public int hashCode() {
        return 1147565434;
    }

    public boolean isCategory2() {
        return false;
    }

    public String toHuman() {
        return "null";
    }

    public String toString() {
        return "known-null";
    }

    public String typeName() {
        return "known-null";
    }
}
