package com.android.p023dx.dex.code;

import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.util.AnnotatedOutput;

/* renamed from: com.android.dx.dex.code.OddSpacer */
public final class OddSpacer extends VariableSizeInsn {
    public OddSpacer(SourcePosition sourcePosition) {
        super(sourcePosition, RegisterSpecList.EMPTY);
    }

    /* access modifiers changed from: protected */
    public String argString() {
        return null;
    }

    public int codeSize() {
        return getAddress() & 1;
    }

    /* access modifiers changed from: protected */
    public String listingString0(boolean z) {
        if (codeSize() == 0) {
            return null;
        }
        return "nop // spacer";
    }

    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new OddSpacer(getPosition());
    }

    public void writeTo(AnnotatedOutput annotatedOutput) {
        if (codeSize() != 0) {
            annotatedOutput.writeShort(InsnFormat.codeUnit(0, 0));
        }
    }
}
