package com.android.p023dx.rop.code;

import com.android.p023dx.rop.code.Insn;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeList;
import java.util.Objects;

/* renamed from: com.android.dx.rop.code.ThrowingCstInsn */
public final class ThrowingCstInsn extends CstInsn {
    private final TypeList catches;

    public ThrowingCstInsn(Rop rop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, TypeList typeList, Constant constant) {
        super(rop, sourcePosition, (RegisterSpec) null, registerSpecList, constant);
        if (rop.getBranchingness() == 6) {
            Objects.requireNonNull(typeList, "catches == null");
            this.catches = typeList;
            return;
        }
        throw new IllegalArgumentException("bogus branchingness");
    }

    public void accept(Insn.Visitor visitor) {
        visitor.visitThrowingCstInsn(this);
    }

    public TypeList getCatches() {
        return this.catches;
    }

    public String getInlineString() {
        Constant constant = getConstant();
        String human = constant.toHuman();
        if (constant instanceof CstString) {
            human = ((CstString) constant).toQuoted();
        }
        return human + " " + ThrowingInsn.toCatchString(this.catches);
    }

    public Insn withAddedCatch(Type type) {
        return new ThrowingCstInsn(getOpcode(), getPosition(), getSources(), this.catches.withAddedType(type), getConstant());
    }

    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new ThrowingCstInsn(getOpcode(), getPosition(), registerSpecList, this.catches, getConstant());
    }

    public Insn withRegisterOffset(int i) {
        return new ThrowingCstInsn(getOpcode(), getPosition(), getSources().withOffset(i), this.catches, getConstant());
    }
}
