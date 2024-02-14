package com.android.p023dx.dex.code;

import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.util.AnnotatedOutput;

/* renamed from: com.android.dx.dex.code.HighRegisterPrefix */
public final class HighRegisterPrefix extends VariableSizeInsn {
    private SimpleInsn[] insns;

    public HighRegisterPrefix(SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        super(sourcePosition, registerSpecList);
        if (registerSpecList.size() != 0) {
            this.insns = null;
            return;
        }
        throw new IllegalArgumentException("registers.size() == 0");
    }

    private void calculateInsnsIfNecessary() {
        if (this.insns == null) {
            RegisterSpecList registers = getRegisters();
            int size = registers.size();
            this.insns = new SimpleInsn[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RegisterSpec registerSpec = registers.get(i2);
                this.insns[i2] = moveInsnFor(registerSpec, i);
                i += registerSpec.getCategory();
            }
        }
    }

    private static SimpleInsn moveInsnFor(RegisterSpec registerSpec, int i) {
        return DalvInsn.makeMove(SourcePosition.NO_INFO, RegisterSpec.make(i, registerSpec.getType()), registerSpec);
    }

    /* access modifiers changed from: protected */
    public String argString() {
        return null;
    }

    public int codeSize() {
        calculateInsnsIfNecessary();
        int i = 0;
        for (SimpleInsn codeSize : this.insns) {
            i += codeSize.codeSize();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public String listingString0(boolean z) {
        RegisterSpecList registers = getRegisters();
        int size = registers.size();
        StringBuffer stringBuffer = new StringBuffer(100);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RegisterSpec registerSpec = registers.get(i2);
            SimpleInsn moveInsnFor = moveInsnFor(registerSpec, i);
            if (i2 != 0) {
                stringBuffer.append(10);
            }
            stringBuffer.append(moveInsnFor.listingString0(z));
            i += registerSpec.getCategory();
        }
        return stringBuffer.toString();
    }

    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new HighRegisterPrefix(getPosition(), registerSpecList);
    }

    public void writeTo(AnnotatedOutput annotatedOutput) {
        calculateInsnsIfNecessary();
        for (SimpleInsn writeTo : this.insns) {
            writeTo.writeTo(annotatedOutput);
        }
    }
}
