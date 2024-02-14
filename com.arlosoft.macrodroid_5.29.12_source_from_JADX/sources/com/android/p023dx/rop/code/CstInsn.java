package com.android.p023dx.rop.code;

import com.android.p023dx.rop.cst.Constant;
import java.util.Objects;

/* renamed from: com.android.dx.rop.code.CstInsn */
public abstract class CstInsn extends Insn {
    private final Constant cst;

    public CstInsn(Rop rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpecList registerSpecList, Constant constant) {
        super(rop, sourcePosition, registerSpec, registerSpecList);
        Objects.requireNonNull(constant, "cst == null");
        this.cst = constant;
    }

    public boolean contentEquals(Insn insn) {
        return super.contentEquals(insn) && this.cst.equals(((CstInsn) insn).getConstant());
    }

    public Constant getConstant() {
        return this.cst;
    }

    public String getInlineString() {
        return this.cst.toHuman();
    }
}
