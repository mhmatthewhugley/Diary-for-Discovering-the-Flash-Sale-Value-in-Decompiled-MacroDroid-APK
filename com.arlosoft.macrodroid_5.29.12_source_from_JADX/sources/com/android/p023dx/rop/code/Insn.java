package com.android.p023dx.rop.code;

import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeList;
import com.android.p023dx.util.ToHuman;
import java.util.Objects;

/* renamed from: com.android.dx.rop.code.Insn */
public abstract class Insn implements ToHuman {
    private final Rop opcode;
    private final SourcePosition position;
    private final RegisterSpec result;
    private final RegisterSpecList sources;

    /* renamed from: com.android.dx.rop.code.Insn$BaseVisitor */
    public static class BaseVisitor implements Visitor {
        public void visitFillArrayDataInsn(FillArrayDataInsn fillArrayDataInsn) {
        }

        public void visitPlainCstInsn(PlainCstInsn plainCstInsn) {
        }

        public void visitPlainInsn(PlainInsn plainInsn) {
        }

        public void visitSwitchInsn(SwitchInsn switchInsn) {
        }

        public void visitThrowingCstInsn(ThrowingCstInsn throwingCstInsn) {
        }

        public void visitThrowingInsn(ThrowingInsn throwingInsn) {
        }
    }

    /* renamed from: com.android.dx.rop.code.Insn$Visitor */
    public interface Visitor {
        void visitFillArrayDataInsn(FillArrayDataInsn fillArrayDataInsn);

        void visitPlainCstInsn(PlainCstInsn plainCstInsn);

        void visitPlainInsn(PlainInsn plainInsn);

        void visitSwitchInsn(SwitchInsn switchInsn);

        void visitThrowingCstInsn(ThrowingCstInsn throwingCstInsn);

        void visitThrowingInsn(ThrowingInsn throwingInsn);
    }

    public Insn(Rop rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        Objects.requireNonNull(rop, "opcode == null");
        Objects.requireNonNull(sourcePosition, "position == null");
        Objects.requireNonNull(registerSpecList, "sources == null");
        this.opcode = rop;
        this.position = sourcePosition;
        this.result = registerSpec;
        this.sources = registerSpecList;
    }

    private static boolean equalsHandleNulls(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public abstract void accept(Visitor visitor);

    public final boolean canThrow() {
        return this.opcode.canThrow();
    }

    public boolean contentEquals(Insn insn) {
        return this.opcode == insn.getOpcode() && this.position.equals(insn.getPosition()) && getClass() == insn.getClass() && equalsHandleNulls(this.result, insn.getResult()) && equalsHandleNulls(this.sources, insn.getSources()) && StdTypeList.equalContents(getCatches(), insn.getCatches());
    }

    public Insn copy() {
        return withRegisterOffset(0);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract TypeList getCatches();

    public String getInlineString() {
        return null;
    }

    public final RegisterSpec getLocalAssignment() {
        RegisterSpec registerSpec;
        if (this.opcode.getOpcode() == 54) {
            registerSpec = this.sources.get(0);
        } else {
            registerSpec = this.result;
        }
        if (registerSpec == null || registerSpec.getLocalItem() == null) {
            return null;
        }
        return registerSpec;
    }

    public final Rop getOpcode() {
        return this.opcode;
    }

    public final SourcePosition getPosition() {
        return this.position;
    }

    public final RegisterSpec getResult() {
        return this.result;
    }

    public final RegisterSpecList getSources() {
        return this.sources;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public String toHuman() {
        return toHumanWithInline(getInlineString());
    }

    /* access modifiers changed from: protected */
    public final String toHumanWithInline(String str) {
        StringBuffer stringBuffer = new StringBuffer(80);
        stringBuffer.append(this.position);
        stringBuffer.append(": ");
        stringBuffer.append(this.opcode.getNickname());
        if (str != null) {
            stringBuffer.append("(");
            stringBuffer.append(str);
            stringBuffer.append(")");
        }
        if (this.result == null) {
            stringBuffer.append(" .");
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(this.result.toHuman());
        }
        stringBuffer.append(" <-");
        int size = this.sources.size();
        if (size == 0) {
            stringBuffer.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                stringBuffer.append(" ");
                stringBuffer.append(this.sources.get(i).toHuman());
            }
        }
        return stringBuffer.toString();
    }

    public String toString() {
        return toStringWithInline(getInlineString());
    }

    /* access modifiers changed from: protected */
    public final String toStringWithInline(String str) {
        StringBuffer stringBuffer = new StringBuffer(80);
        stringBuffer.append("Insn{");
        stringBuffer.append(this.position);
        stringBuffer.append(' ');
        stringBuffer.append(this.opcode);
        if (str != null) {
            stringBuffer.append(' ');
            stringBuffer.append(str);
        }
        stringBuffer.append(" :: ");
        RegisterSpec registerSpec = this.result;
        if (registerSpec != null) {
            stringBuffer.append(registerSpec);
            stringBuffer.append(" <- ");
        }
        stringBuffer.append(this.sources);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public abstract Insn withAddedCatch(Type type);

    public abstract Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList);

    public abstract Insn withRegisterOffset(int i);

    public Insn withSourceLiteral() {
        return this;
    }
}
