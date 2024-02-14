package com.android.p023dx.dex.code;

import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.SourcePosition;

/* renamed from: com.android.dx.dex.code.SimpleInsn */
public final class SimpleInsn extends FixedSizeInsn {
    public SimpleInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        super(dop, sourcePosition, registerSpecList);
    }

    /* access modifiers changed from: protected */
    public String argString() {
        return null;
    }

    public DalvInsn withOpcode(Dop dop) {
        return new SimpleInsn(dop, getPosition(), getRegisters());
    }

    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new SimpleInsn(getOpcode(), getPosition(), registerSpecList);
    }
}
