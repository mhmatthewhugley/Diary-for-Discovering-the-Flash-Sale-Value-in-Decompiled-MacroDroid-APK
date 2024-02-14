package com.android.p023dx.dex.code.form;

import com.android.p023dx.dex.code.DalvInsn;
import com.android.p023dx.dex.code.InsnFormat;
import com.android.p023dx.dex.code.SimpleInsn;
import com.android.p023dx.util.AnnotatedOutput;

/* renamed from: com.android.dx.dex.code.form.Form10x */
public final class Form10x extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form10x();

    private Form10x() {
    }

    public int codeSize() {
        return 1;
    }

    public String insnArgString(DalvInsn dalvInsn) {
        return "";
    }

    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return "";
    }

    public boolean isCompatible(DalvInsn dalvInsn) {
        return (dalvInsn instanceof SimpleInsn) && dalvInsn.getRegisters().size() == 0;
    }

    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, 0));
    }
}
