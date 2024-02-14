package com.android.p023dx.dex.code;

import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.util.AnnotatedOutput;

/* renamed from: com.android.dx.dex.code.ZeroSizeInsn */
public abstract class ZeroSizeInsn extends DalvInsn {
    public ZeroSizeInsn(SourcePosition sourcePosition) {
        super(Dops.SPECIAL_FORMAT, sourcePosition, RegisterSpecList.EMPTY);
    }

    public final int codeSize() {
        return 0;
    }

    public final DalvInsn withOpcode(Dop dop) {
        throw new RuntimeException("unsupported");
    }

    public DalvInsn withRegisterOffset(int i) {
        return withRegisters(getRegisters().withOffset(i));
    }

    public final void writeTo(AnnotatedOutput annotatedOutput) {
    }
}
