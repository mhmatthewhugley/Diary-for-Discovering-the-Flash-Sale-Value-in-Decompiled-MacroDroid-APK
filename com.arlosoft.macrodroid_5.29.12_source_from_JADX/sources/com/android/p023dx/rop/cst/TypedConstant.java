package com.android.p023dx.rop.cst;

import com.android.p023dx.rop.type.TypeBearer;

/* renamed from: com.android.dx.rop.cst.TypedConstant */
public abstract class TypedConstant extends Constant implements TypeBearer {
    public final int getBasicFrameType() {
        return getType().getBasicFrameType();
    }

    public final int getBasicType() {
        return getType().getBasicType();
    }

    public final TypeBearer getFrameType() {
        return this;
    }

    public final boolean isConstant() {
        return true;
    }
}
