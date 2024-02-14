package com.android.p023dx.dex.code.form;

import com.android.p023dx.dex.code.DalvInsn;
import com.android.p023dx.dex.code.InsnFormat;
import com.android.p023dx.dex.code.TargetInsn;
import com.android.p023dx.util.AnnotatedOutput;

/* renamed from: com.android.dx.dex.code.form.Form20t */
public final class Form20t extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form20t();

    private Form20t() {
    }

    public boolean branchFits(TargetInsn targetInsn) {
        int targetOffset = targetInsn.getTargetOffset();
        return targetOffset != 0 && InsnFormat.signedFitsInShort(targetOffset);
    }

    public int codeSize() {
        return 2;
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
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, 0), (short) ((TargetInsn) dalvInsn).getTargetOffset());
    }
}
