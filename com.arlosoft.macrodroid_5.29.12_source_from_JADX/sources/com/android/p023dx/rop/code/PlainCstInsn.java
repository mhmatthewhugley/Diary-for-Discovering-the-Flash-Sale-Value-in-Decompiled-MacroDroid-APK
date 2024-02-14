package com.android.p023dx.rop.code;

import com.android.p023dx.rop.code.Insn;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeList;

/* renamed from: com.android.dx.rop.code.PlainCstInsn */
public final class PlainCstInsn extends CstInsn {
    public PlainCstInsn(Rop rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpecList registerSpecList, Constant constant) {
        super(rop, sourcePosition, registerSpec, registerSpecList, constant);
        if (rop.getBranchingness() != 1) {
            throw new IllegalArgumentException("bogus branchingness");
        }
    }

    public void accept(Insn.Visitor visitor) {
        visitor.visitPlainCstInsn(this);
    }

    public TypeList getCatches() {
        return StdTypeList.EMPTY;
    }

    public Insn withAddedCatch(Type type) {
        throw new UnsupportedOperationException("unsupported");
    }

    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new PlainCstInsn(getOpcode(), getPosition(), registerSpec, registerSpecList, getConstant());
    }

    public Insn withRegisterOffset(int i) {
        return new PlainCstInsn(getOpcode(), getPosition(), getResult().withOffset(i), getSources().withOffset(i), getConstant());
    }
}
