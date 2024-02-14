package com.android.p023dx.ssa;

import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecSet;
import com.android.p023dx.util.MutabilityControl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.android.dx.ssa.LocalVariableInfo */
public class LocalVariableInfo extends MutabilityControl {
    private final RegisterSpecSet[] blockStarts;
    private final RegisterSpecSet emptySet;
    private final HashMap<SsaInsn, RegisterSpec> insnAssignments = new HashMap<>();
    private final int regCount;

    public LocalVariableInfo(SsaMethod ssaMethod) {
        Objects.requireNonNull(ssaMethod, "method == null");
        ArrayList<SsaBasicBlock> blocks = ssaMethod.getBlocks();
        int regCount2 = ssaMethod.getRegCount();
        this.regCount = regCount2;
        RegisterSpecSet registerSpecSet = new RegisterSpecSet(regCount2);
        this.emptySet = registerSpecSet;
        this.blockStarts = new RegisterSpecSet[blocks.size()];
        registerSpecSet.setImmutable();
    }

    private RegisterSpecSet getStarts0(int i) {
        try {
            return this.blockStarts[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus index");
        }
    }

    public void addAssignment(SsaInsn ssaInsn, RegisterSpec registerSpec) {
        throwIfImmutable();
        Objects.requireNonNull(ssaInsn, "insn == null");
        Objects.requireNonNull(registerSpec, "spec == null");
        this.insnAssignments.put(ssaInsn, registerSpec);
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

    public RegisterSpec getAssignment(SsaInsn ssaInsn) {
        return this.insnAssignments.get(ssaInsn);
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
        mutableCopy.intersect(registerSpecSet, true);
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
            throw new IllegalArgumentException("bogus index");
        }
    }

    public RegisterSpecSet getStarts(SsaBasicBlock ssaBasicBlock) {
        return getStarts(ssaBasicBlock.getIndex());
    }
}
