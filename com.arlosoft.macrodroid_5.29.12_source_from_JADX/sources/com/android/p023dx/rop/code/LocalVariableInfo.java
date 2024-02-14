package com.android.p023dx.rop.code;

import com.android.p023dx.util.MutabilityControl;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.android.dx.rop.code.LocalVariableInfo */
public final class LocalVariableInfo extends MutabilityControl {
    private final RegisterSpecSet[] blockStarts;
    private final RegisterSpecSet emptySet;
    private final HashMap<Insn, RegisterSpec> insnAssignments;
    private final int regCount;

    public LocalVariableInfo(RopMethod ropMethod) {
        Objects.requireNonNull(ropMethod, "method == null");
        BasicBlockList blocks = ropMethod.getBlocks();
        int maxLabel = blocks.getMaxLabel();
        int regCount2 = blocks.getRegCount();
        this.regCount = regCount2;
        RegisterSpecSet registerSpecSet = new RegisterSpecSet(regCount2);
        this.emptySet = registerSpecSet;
        this.blockStarts = new RegisterSpecSet[maxLabel];
        this.insnAssignments = new HashMap<>(blocks.getInstructionCount());
        registerSpecSet.setImmutable();
    }

    private RegisterSpecSet getStarts0(int i) {
        try {
            return this.blockStarts[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    public void addAssignment(Insn insn, RegisterSpec registerSpec) {
        throwIfImmutable();
        Objects.requireNonNull(insn, "insn == null");
        Objects.requireNonNull(registerSpec, "spec == null");
        this.insnAssignments.put(insn, registerSpec);
    }

    public void debugDump() {
        int i = 0;
        while (true) {
            RegisterSpecSet[] registerSpecSetArr = this.blockStarts;
            if (i < registerSpecSetArr.length) {
                if (registerSpecSetArr[i] != null) {
                    if (registerSpecSetArr[i] == this.emptySet) {
                        System.out.printf("%04x: empty set\n", new Object[]{Integer.valueOf(i)});
                    } else {
                        System.out.printf("%04x: %s\n", new Object[]{Integer.valueOf(i), this.blockStarts[i]});
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public RegisterSpec getAssignment(Insn insn) {
        return this.insnAssignments.get(insn);
    }

    public int getAssignmentCount() {
        return this.insnAssignments.size();
    }

    public RegisterSpecSet getStarts(int i) {
        RegisterSpecSet starts0 = getStarts0(i);
        return starts0 != null ? starts0 : this.emptySet;
    }

    public boolean mergeStarts(int i, RegisterSpecSet registerSpecSet) {
        RegisterSpecSet starts0 = getStarts0(i);
        if (starts0 == null) {
            setStarts(i, registerSpecSet);
            return true;
        }
        RegisterSpecSet mutableCopy = starts0.mutableCopy();
        if (starts0.size() != 0) {
            mutableCopy.intersect(registerSpecSet, true);
        } else {
            mutableCopy = registerSpecSet.mutableCopy();
        }
        if (starts0.equals(mutableCopy)) {
            return false;
        }
        mutableCopy.setImmutable();
        setStarts(i, mutableCopy);
        return true;
    }

    public RegisterSpecSet mutableCopyOfStarts(int i) {
        RegisterSpecSet starts0 = getStarts0(i);
        return starts0 != null ? starts0.mutableCopy() : new RegisterSpecSet(this.regCount);
    }

    public void setStarts(int i, RegisterSpecSet registerSpecSet) {
        throwIfImmutable();
        Objects.requireNonNull(registerSpecSet, "specs == null");
        try {
            this.blockStarts[i] = registerSpecSet;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    public RegisterSpecSet getStarts(BasicBlock basicBlock) {
        return getStarts(basicBlock.getLabel());
    }
}
