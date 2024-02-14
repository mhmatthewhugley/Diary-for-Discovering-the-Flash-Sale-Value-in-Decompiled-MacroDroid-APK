package com.android.p023dx.dex.code.form;

import com.android.p023dx.dex.code.DalvInsn;
import com.android.p023dx.dex.code.InsnFormat;
import com.android.p023dx.dex.code.TargetInsn;
import com.android.p023dx.util.AnnotatedOutput;

/* renamed from: com.android.dx.dex.code.form.Form30t */
public final class Form30t extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form30t();

    private Form30t() {
    }

    public boolean branchFits(TargetInsn targetInsn) {
        return true;
    }

    public int codeSize() {
        return 3;
    }

    public String insnArgString(DalvInsn dalvInsn) {
        return InsnFormat.branchString(dalvInsn);
    }

    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return InsnFormat.branchComment(dalvInsn);
    }

    public boolean isCompatible(DalvInsn dalvInsn) {
        return (dalvInsn instanceof TargetInsn) && dalvInsn.getRegisters().size() == 0;
    }

    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, 0), ((TargetInsn) dalvInsn).getTargetOffset());
    }
}
