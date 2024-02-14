package com.android.p023dx.rop.type;

import com.android.p023dx.util.ToHuman;

/* renamed from: com.android.dx.rop.type.TypeBearer */
public interface TypeBearer extends ToHuman {
    int getBasicFrameType();

    int getBasicType();

    TypeBearer getFrameType();

    Type getType();

    boolean isConstant();
}
