package com.android.p023dx.rop.code;

import com.android.p023dx.rop.code.Insn;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeList;
import java.util.Objects;

/* renamed from: com.android.dx.rop.code.ThrowingInsn */
public final class ThrowingInsn extends Insn {
    private final TypeList catches;

    public ThrowingInsn(Rop rop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, TypeList typeList) {
        super(rop, sourcePosition, (RegisterSpec) null, registerSpecList);
        if (rop.getBranchingness() == 6) {
            Objects.requireNonNull(typeList, "catches == null");
            this.catches = typeList;
            return;
        }
        throw new IllegalArgumentException("bogus branchingness");
    }

    public static String toCatchString(TypeList typeList) {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append("catch");
        int size = typeList.size();
        for (int i = 0; i < size; i++) {
            stringBuffer.append(" ");
            stringBuffer.append(typeList.getType(i).toHuman());
        }
        return stringBuffer.toString();
    }

    public void accept(Insn.Visitor visitor) {
        visitor.visitThrowingInsn(this);
    }

    public TypeList getCatches() {
        return this.catches;
    }

    public String getInlineString() {
        return toCatchString(this.catches);
    }

    public Insn withAddedCatch(Type type) {
        return new ThrowingInsn(getOpcode(), getPosition(), getSources(), this.catches.withAddedType(type));
    }

    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new ThrowingInsn(getOpcode(), getPosition(), registerSpecList, this.catches);
    }

    public Insn withRegisterOffset(int i) {
        return new ThrowingInsn(getOpcode(), getPosition(), getSources().withOffset(i), this.catches);
    }
}
