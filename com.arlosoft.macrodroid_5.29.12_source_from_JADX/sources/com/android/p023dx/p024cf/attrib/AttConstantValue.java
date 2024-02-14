package com.android.p023dx.p024cf.attrib;

import com.android.p023dx.rop.cst.CstDouble;
import com.android.p023dx.rop.cst.CstFloat;
import com.android.p023dx.rop.cst.CstInteger;
import com.android.p023dx.rop.cst.CstLong;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.TypedConstant;
import java.util.Objects;

/* renamed from: com.android.dx.cf.attrib.AttConstantValue */
public final class AttConstantValue extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "ConstantValue";
    private final TypedConstant constantValue;

    public AttConstantValue(TypedConstant typedConstant) {
        super(ATTRIBUTE_NAME);
        if ((typedConstant instanceof CstString) || (typedConstant instanceof CstInteger) || (typedConstant instanceof CstLong) || (typedConstant instanceof CstFloat) || (typedConstant instanceof CstDouble)) {
            this.constantValue = typedConstant;
        } else {
            Objects.requireNonNull(typedConstant, "constantValue == null");
            throw new IllegalArgumentException("bad type for constantValue");
        }
    }

    public int byteLength() {
        return 8;
    }

    public TypedConstant getConstantValue() {
        return this.constantValue;
    }
}
