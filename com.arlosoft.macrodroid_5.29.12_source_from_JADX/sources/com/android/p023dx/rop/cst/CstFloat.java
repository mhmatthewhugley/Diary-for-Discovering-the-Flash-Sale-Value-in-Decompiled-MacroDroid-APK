package com.android.p023dx.rop.cst;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.Hex;

/* renamed from: com.android.dx.rop.cst.CstFloat */
public final class CstFloat extends CstLiteral32 {
    public static final CstFloat VALUE_0 = make(Float.floatToIntBits(0.0f));
    public static final CstFloat VALUE_1 = make(Float.floatToIntBits(1.0f));
    public static final CstFloat VALUE_2 = make(Float.floatToIntBits(2.0f));

    private CstFloat(int i) {
        super(i);
    }

    public static CstFloat make(int i) {
        return new CstFloat(i);
    }

    public Type getType() {
        return Type.FLOAT;
    }

    public float getValue() {
        return Float.intBitsToFloat(getIntBits());
    }

    public String toHuman() {
        return Float.toString(Float.intBitsToFloat(getIntBits()));
    }

    public String toString() {
        int intBits = getIntBits();
        return "float{0x" + Hex.m909u4(intBits) + " / " + Float.intBitsToFloat(intBits) + '}';
    }

    public String typeName() {
        return TypedValues.Custom.S_FLOAT;
    }
}
