package com.android.p023dx.rop.cst;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.p023dx.rop.type.Type;

/* renamed from: com.android.dx.rop.cst.CstBoolean */
public final class CstBoolean extends CstLiteral32 {
    public static final CstBoolean VALUE_FALSE = new CstBoolean(false);
    public static final CstBoolean VALUE_TRUE = new CstBoolean(true);

    private CstBoolean(boolean z) {
        super(z ? 1 : 0);
    }

    public static CstBoolean make(boolean z) {
        return z ? VALUE_TRUE : VALUE_FALSE;
    }

    public Type getType() {
        return Type.BOOLEAN;
    }

    public boolean getValue() {
        return getIntBits() != 0;
    }

    public String toHuman() {
        return getValue() ? "true" : "false";
    }

    public String toString() {
        return getValue() ? "boolean{true}" : "boolean{false}";
    }

    public String typeName() {
        return TypedValues.Custom.S_BOOLEAN;
    }

    public static CstBoolean make(int i) {
        if (i == 0) {
            return VALUE_FALSE;
        }
        if (i == 1) {
            return VALUE_TRUE;
        }
        throw new IllegalArgumentException("bogus value: " + i);
    }
}
