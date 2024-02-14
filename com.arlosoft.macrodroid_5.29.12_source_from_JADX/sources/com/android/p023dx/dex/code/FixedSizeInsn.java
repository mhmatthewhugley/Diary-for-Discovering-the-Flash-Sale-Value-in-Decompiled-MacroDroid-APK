package com.android.p023dx.dex.code;

import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.util.AnnotatedOutput;

/* renamed from: com.android.dx.dex.code.FixedSizeInsn */
public abstract class FixedSizeInsn extends DalvInsn {
    public FixedSizeInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        super(dop, sourcePosition, registerSpecList);
    }

    public final int codeSize() {
        return getOpcode().getFormat().codeSize();
    }

    /* access modifiers changed from: protected */
    public final String listingString0(boolean z) {
        return getOpcode().getFormat().listingString(this, z);
    }

    public final DalvInsn withRegisterOffset(int i) {
        return withRegisters(getRegisters().withOffset(i));
    }

    public final void writeTo(AnnotatedOutput annotatedOutput) {
        getOpcode().getFormat().writeTo(annotatedOutput, this);
    }
}
