package com.android.p023dx.dex.code.form;

import com.android.p023dx.dex.code.DalvInsn;
import com.android.p023dx.dex.code.InsnFormat;
import com.android.p023dx.dex.code.TargetInsn;
import com.android.p023dx.util.AnnotatedOutput;

/* renamed from: com.android.dx.dex.code.form.Form10t */
public final class Form10t extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form10t();

    private Form10t() {
    }

    public boolean branchFits(TargetInsn targetInsn) {
        int targetOffset = targetInsn.getTargetOffset();
        return targetOffset != 0 && InsnFormat.signedFitsInByte(targetOffset);
    }

    public int codeSize() {
        return 1;
    }

    public String insnArgString(DalvInsn dalvInsn) {
        return InsnFormat.branchString(dalvInsn);
    }

    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return InsnFormat.branchComment(dalvInsn);
    }

    public boolean isCompatible(DalvInsn dalvInsn) {
        if (!(dalvInsn instanceof TargetInsn) || dalvInsn.getRegisters().size() != 0) {
            return false;
        }
        TargetInsn targetInsn = (TargetInsn) dalvInsn;
        if (targetInsn.hasTargetOffset()) {
            return branchFits(targetInsn);
        }
        return true;
    }

    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, ((TargetInsn) dalvInsn).getTargetOffset() & 255));
    }
}
