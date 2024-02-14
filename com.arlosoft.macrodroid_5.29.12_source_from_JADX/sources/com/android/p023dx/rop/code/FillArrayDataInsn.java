package com.android.p023dx.rop.code;

import com.android.p023dx.rop.code.Insn;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeList;
import java.util.ArrayList;

/* renamed from: com.android.dx.rop.code.FillArrayDataInsn */
public final class FillArrayDataInsn extends Insn {
    private final Constant arrayType;
    private final ArrayList<Constant> initValues;

    public FillArrayDataInsn(Rop rop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, ArrayList<Constant> arrayList, Constant constant) {
        super(rop, sourcePosition, (RegisterSpec) null, registerSpecList);
        if (rop.getBranchingness() == 1) {
            this.initValues = arrayList;
            this.arrayType = constant;
            return;
        }
        throw new IllegalArgumentException("bogus branchingness");
    }

    public void accept(Insn.Visitor visitor) {
        visitor.visitFillArrayDataInsn(this);
    }

    public TypeList getCatches() {
        return StdTypeList.EMPTY;
    }

    public Constant getConstant() {
        return this.arrayType;
    }

    public ArrayList<Constant> getInitValues() {
        return this.initValues;
    }

    public Insn withAddedCatch(Type type) {
        throw new UnsupportedOperationException("unsupported");
    }

    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new FillArrayDataInsn(getOpcode(), getPosition(), registerSpecList, this.initValues, this.arrayType);
    }

    public Insn withRegisterOffset(int i) {
        return new FillArrayDataInsn(getOpcode(), getPosition(), getSources().withOffset(i), this.initValues, this.arrayType);
    }
}
