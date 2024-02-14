package com.android.p023dx.rop.code;

import com.android.p023dx.util.Bits;
import com.android.p023dx.util.IntList;
import java.util.Objects;

/* renamed from: com.android.dx.rop.code.LocalVariableExtractor */
public final class LocalVariableExtractor {
    private final BasicBlockList blocks;
    private final RopMethod method;
    private final LocalVariableInfo resultInfo;
    private final int[] workSet;

    private LocalVariableExtractor(RopMethod ropMethod) {
        Objects.requireNonNull(ropMethod, "method == null");
        BasicBlockList blocks2 = ropMethod.getBlocks();
        int maxLabel = blocks2.getMaxLabel();
        this.method = ropMethod;
        this.blocks = blocks2;
        this.resultInfo = new LocalVariableInfo(ropMethod);
        this.workSet = Bits.makeBitSet(maxLabel);
    }

    private LocalVariableInfo doit() {
        int firstLabel = this.method.getFirstLabel();
        while (firstLabel >= 0) {
            Bits.clear(this.workSet, firstLabel);
            processBlock(firstLabel);
            firstLabel = Bits.findFirst(this.workSet, 0);
        }
        this.resultInfo.setImmutable();
        return this.resultInfo;
    }

    public static LocalVariableInfo extract(RopMethod ropMethod) {
        return new LocalVariableExtractor(ropMethod).doit();
    }

    private void processBlock(int i) {
        RegisterSpecSet mutableCopyOfStarts = this.resultInfo.mutableCopyOfStarts(i);
        BasicBlock labelToBlock = this.blocks.labelToBlock(i);
        InsnList insns = labelToBlock.getInsns();
        int size = insns.size();
        boolean z = labelToBlock.hasExceptionHandlers() && insns.getLast().getResult() != null;
        int i2 = size - 1;
        RegisterSpecSet registerSpecSet = mutableCopyOfStarts;
        for (int i3 = 0; i3 < size; i3++) {
            if (z && i3 == i2) {
                registerSpecSet.setImmutable();
                registerSpecSet = registerSpecSet.mutableCopy();
            }
            Insn insn = insns.get(i3);
            RegisterSpec localAssignment = insn.getLocalAssignment();
            if (localAssignment == null) {
                RegisterSpec result = insn.getResult();
                if (!(result == null || registerSpecSet.get(result.getReg()) == null)) {
                    registerSpecSet.remove(registerSpecSet.get(result.getReg()));
                }
            } else {
                RegisterSpec withSimpleType = localAssignment.withSimpleType();
                if (!withSimpleType.equals(registerSpecSet.get(withSimpleType))) {
                    RegisterSpec localItemToSpec = registerSpecSet.localItemToSpec(withSimpleType.getLocalItem());
                    if (!(localItemToSpec == null || localItemToSpec.getReg() == withSimpleType.getReg())) {
                        registerSpecSet.remove(localItemToSpec);
                    }
                    this.resultInfo.addAssignment(insn, withSimpleType);
                    registerSpecSet.put(withSimpleType);
                }
            }
        }
        registerSpecSet.setImmutable();
        IntList successors = labelToBlock.getSuccessors();
        int size2 = successors.size();
        int primarySuccessor = labelToBlock.getPrimarySuccessor();
        for (int i4 = 0; i4 < size2; i4++) {
            int i5 = successors.get(i4);
            if (this.resultInfo.mergeStarts(i5, i5 == primarySuccessor ? registerSpecSet : mutableCopyOfStarts)) {
                Bits.set(this.workSet, i5);
            }
        }
    }
}
