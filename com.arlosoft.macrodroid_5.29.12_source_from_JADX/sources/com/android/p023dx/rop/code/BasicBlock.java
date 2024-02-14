package com.android.p023dx.rop.code;

import com.android.p023dx.rop.type.TypeList;
import com.android.p023dx.util.Hex;
import com.android.p023dx.util.IntList;
import com.android.p023dx.util.LabeledItem;

/* renamed from: com.android.dx.rop.code.BasicBlock */
public final class BasicBlock implements LabeledItem {
    private final InsnList insns;
    private final int label;
    private final int primarySuccessor;
    private final IntList successors;

    /* renamed from: com.android.dx.rop.code.BasicBlock$Visitor */
    public interface Visitor {
        void visitBlock(BasicBlock basicBlock);
    }

    public BasicBlock(int i, InsnList insnList, IntList intList, int i2) {
        if (i >= 0) {
            try {
                insnList.throwIfMutable();
                int size = insnList.size();
                if (size != 0) {
                    int i3 = size - 2;
                    while (i3 >= 0) {
                        if (insnList.get(i3).getOpcode().getBranchingness() == 1) {
                            i3--;
                        } else {
                            throw new IllegalArgumentException("insns[" + i3 + "] is a branch or can throw");
                        }
                    }
                    if (insnList.get(size - 1).getOpcode().getBranchingness() != 1) {
                        try {
                            intList.throwIfMutable();
                            if (i2 < -1) {
                                throw new IllegalArgumentException("primarySuccessor < -1");
                            } else if (i2 < 0 || intList.contains(i2)) {
                                this.label = i;
                                this.insns = insnList;
                                this.successors = intList;
                                this.primarySuccessor = i2;
                            } else {
                                throw new IllegalArgumentException("primarySuccessor " + i2 + " not in successors " + intList);
                            }
                        } catch (NullPointerException unused) {
                            throw new NullPointerException("successors == null");
                        }
                    } else {
                        throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
                    }
                } else {
                    throw new IllegalArgumentException("insns.size() == 0");
                }
            } catch (NullPointerException unused2) {
                throw new NullPointerException("insns == null");
            }
        } else {
            throw new IllegalArgumentException("label < 0");
        }
    }

    public boolean canThrow() {
        return this.insns.getLast().canThrow();
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public TypeList getExceptionHandlerTypes() {
        return this.insns.getLast().getCatches();
    }

    public Insn getFirstInsn() {
        return this.insns.get(0);
    }

    public InsnList getInsns() {
        return this.insns;
    }

    public int getLabel() {
        return this.label;
    }

    public Insn getLastInsn() {
        return this.insns.getLast();
    }

    public int getPrimarySuccessor() {
        return this.primarySuccessor;
    }

    public int getSecondarySuccessor() {
        if (this.successors.size() == 2) {
            int i = this.successors.get(0);
            return i == this.primarySuccessor ? this.successors.get(1) : i;
        }
        throw new UnsupportedOperationException("block doesn't have exactly two successors");
    }

    public IntList getSuccessors() {
        return this.successors;
    }

    public boolean hasExceptionHandlers() {
        return this.insns.getLast().getCatches().size() != 0;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public String toString() {
        return '{' + Hex.m907u2(this.label) + '}';
    }

    public BasicBlock withRegisterOffset(int i) {
        return new BasicBlock(this.label, this.insns.withRegisterOffset(i), this.successors, this.primarySuccessor);
    }
}
