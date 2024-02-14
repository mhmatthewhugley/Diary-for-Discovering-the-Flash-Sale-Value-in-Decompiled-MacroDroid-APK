package com.android.p023dx.ssa;

import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecSet;
import com.android.p023dx.util.IntList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;

/* renamed from: com.android.dx.ssa.LocalVariableExtractor */
public class LocalVariableExtractor {
    private final ArrayList<SsaBasicBlock> blocks;
    private final SsaMethod method;
    private final LocalVariableInfo resultInfo;
    private final BitSet workSet;

    private LocalVariableExtractor(SsaMethod ssaMethod) {
        Objects.requireNonNull(ssaMethod, "method == null");
        ArrayList<SsaBasicBlock> blocks2 = ssaMethod.getBlocks();
        this.method = ssaMethod;
        this.blocks = blocks2;
        this.resultInfo = new LocalVariableInfo(ssaMethod);
        this.workSet = new BitSet(blocks2.size());
    }

    private LocalVariableInfo doit() {
        if (this.method.getRegCount() > 0) {
            int entryBlockIndex = this.method.getEntryBlockIndex();
            while (entryBlockIndex >= 0) {
                this.workSet.clear(entryBlockIndex);
                processBlock(entryBlockIndex);
                entryBlockIndex = this.workSet.nextSetBit(0);
            }
        }
        this.resultInfo.setImmutable();
        return this.resultInfo;
    }

    public static LocalVariableInfo extract(SsaMethod ssaMethod) {
        return new LocalVariableExtractor(ssaMethod).doit();
    }

    private void processBlock(int i) {
        RegisterSpecSet mutableCopyOfStarts = this.resultInfo.mutableCopyOfStarts(i);
        SsaBasicBlock ssaBasicBlock = this.blocks.get(i);
        ArrayList<SsaInsn> insns = ssaBasicBlock.getInsns();
        int size = insns.size();
        if (i != this.method.getExitBlockIndex()) {
            int i2 = size - 1;
            SsaInsn ssaInsn = insns.get(i2);
            boolean z = true;
            if (!(ssaInsn.getOriginalRopInsn().getCatches().size() != 0) || ssaInsn.getResult() == null) {
                z = false;
            }
            RegisterSpecSet registerSpecSet = mutableCopyOfStarts;
            for (int i3 = 0; i3 < size; i3++) {
                if (z && i3 == i2) {
                    registerSpecSet.setImmutable();
                    registerSpecSet = registerSpecSet.mutableCopy();
                }
                SsaInsn ssaInsn2 = insns.get(i3);
                RegisterSpec localAssignment = ssaInsn2.getLocalAssignment();
                if (localAssignment == null) {
                    RegisterSpec result = ssaInsn2.getResult();
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
                        this.resultInfo.addAssignment(ssaInsn2, withSimpleType);
                        registerSpecSet.put(withSimpleType);
                    }
                }
            }
            registerSpecSet.setImmutable();
            IntList successorList = ssaBasicBlock.getSuccessorList();
            int size2 = successorList.size();
            int primarySuccessorIndex = ssaBasicBlock.getPrimarySuccessorIndex();
            for (int i4 = 0; i4 < size2; i4++) {
                int i5 = successorList.get(i4);
                if (this.resultInfo.mergeStarts(i5, i5 == primarySuccessorIndex ? registerSpecSet : mutableCopyOfStarts)) {
                    this.workSet.set(i5);
                }
            }
        }
    }
}
