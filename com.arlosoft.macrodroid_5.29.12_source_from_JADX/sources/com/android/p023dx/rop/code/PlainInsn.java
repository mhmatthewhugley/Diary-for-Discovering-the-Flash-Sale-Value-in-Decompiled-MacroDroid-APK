package com.android.p023dx.rop.code;

import com.android.p023dx.rop.code.Insn;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstInteger;
import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeBearer;
import com.android.p023dx.rop.type.TypeList;

/* renamed from: com.android.dx.rop.code.PlainInsn */
public final class PlainInsn extends Insn {
    public PlainInsn(Rop rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        super(rop, sourcePosition, registerSpec, registerSpecList);
        int branchingness = rop.getBranchingness();
        if (branchingness == 5 || branchingness == 6) {
            throw new IllegalArgumentException("bogus branchingness");
        } else if (registerSpec != null && rop.getBranchingness() != 1) {
            throw new IllegalArgumentException("can't mix branchingness with result");
        }
    }

    public void accept(Insn.Visitor visitor) {
        visitor.visitPlainInsn(this);
    }

    public TypeList getCatches() {
        return StdTypeList.EMPTY;
    }

    public Insn withAddedCatch(Type type) {
        throw new UnsupportedOperationException("unsupported");
    }

    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new PlainInsn(getOpcode(), getPosition(), registerSpec, registerSpecList);
    }

    public Insn withRegisterOffset(int i) {
        return new PlainInsn(getOpcode(), getPosition(), getResult().withOffset(i), getSources().withOffset(i));
    }

    public Insn withSourceLiteral() {
        RegisterSpecList sources = getSources();
        int size = sources.size();
        if (size == 0) {
            return this;
        }
        TypeBearer typeBearer = sources.get(size - 1).getTypeBearer();
        if (!typeBearer.isConstant()) {
            TypeBearer typeBearer2 = sources.get(0).getTypeBearer();
            if (size != 2 || !typeBearer2.isConstant()) {
                return this;
            }
            Constant constant = (Constant) typeBearer2;
            RegisterSpecList withoutFirst = sources.withoutFirst();
            return new PlainCstInsn(Rops.ropFor(getOpcode().getOpcode(), getResult(), withoutFirst, constant), getPosition(), getResult(), withoutFirst, constant);
        }
        Constant constant2 = (Constant) typeBearer;
        RegisterSpecList withoutLast = sources.withoutLast();
        try {
            int opcode = getOpcode().getOpcode();
            if (opcode == 15 && (constant2 instanceof CstInteger)) {
                opcode = 14;
                constant2 = CstInteger.make(-((CstInteger) constant2).getValue());
            }
            Constant constant3 = constant2;
            return new PlainCstInsn(Rops.ropFor(opcode, getResult(), withoutLast, constant3), getPosition(), getResult(), withoutLast, constant3);
        } catch (IllegalArgumentException unused) {
            return this;
        }
    }

    public PlainInsn(Rop rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        this(rop, sourcePosition, registerSpec, RegisterSpecList.make(registerSpec2));
    }
}
