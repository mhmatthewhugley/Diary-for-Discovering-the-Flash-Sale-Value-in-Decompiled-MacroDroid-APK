package com.android.p023dx.dex.code.form;

import com.android.p023dx.dex.code.DalvInsn;
import com.android.p023dx.dex.code.InsnFormat;
import com.android.p023dx.util.AnnotatedOutput;

/* renamed from: com.android.dx.dex.code.form.SpecialFormat */
public final class SpecialFormat extends InsnFormat {
    public static final InsnFormat THE_ONE = new SpecialFormat();

    private SpecialFormat() {
    }

    public int codeSize() {
        throw new RuntimeException("unsupported");
    }

    public String insnArgString(DalvInsn dalvInsn) {
        throw new RuntimeException("unsupported");
    }

    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        throw new RuntimeException("unsupported");
    }

    public boolean isCompatible(DalvInsn dalvInsn) {
        return true;
    }

    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        throw new RuntimeException("unsupported");
    }
}
