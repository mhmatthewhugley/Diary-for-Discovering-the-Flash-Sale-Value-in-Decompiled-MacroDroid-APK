package com.android.p023dx.ssa.back;

import com.android.p023dx.rop.code.BasicBlock;
import com.android.p023dx.rop.code.BasicBlockList;
import com.android.p023dx.rop.code.InsnList;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.Rop;
import com.android.p023dx.rop.code.RopMethod;
import com.android.p023dx.rop.code.Rops;
import com.android.p023dx.ssa.BasicRegisterMapper;
import com.android.p023dx.ssa.PhiInsn;
import com.android.p023dx.ssa.RegisterMapper;
import com.android.p023dx.ssa.SsaBasicBlock;
import com.android.p023dx.ssa.SsaInsn;
import com.android.p023dx.ssa.SsaMethod;
import com.android.p023dx.util.Hex;
import com.android.p023dx.util.IntList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.android.dx.ssa.back.SsaToRop */
public class SsaToRop {
    private static final boolean DEBUG = false;
    private final InterferenceGraph interference;
    private final boolean minimizeRegisters;
    /* access modifiers changed from: private */
    public final SsaMethod ssaMeth;

    /* renamed from: com.android.dx.ssa.back.SsaToRop$PhiVisitor */
    private static class PhiVisitor implements PhiInsn.Visitor {
        private final ArrayList<SsaBasicBlock> blocks;

        public PhiVisitor(ArrayList<SsaBasicBlock> arrayList) {
            this.blocks = arrayList;
        }

        public void visitPhiInsn(PhiInsn phiInsn) {
            RegisterSpecList sources = phiInsn.getSources();
            RegisterSpec result = phiInsn.getResult();
            int size = sources.size();
            for (int i = 0; i < size; i++) {
                this.blocks.get(phiInsn.predBlockIndexForSourcesIndex(i)).addMoveToEnd(result, sources.get(i));
            }
        }
    }

    private SsaToRop(SsaMethod ssaMethod, boolean z) {
        this.minimizeRegisters = z;
        this.ssaMeth = ssaMethod;
        this.interference = LivenessAnalyzer.constructInterferenceGraph(ssaMethod);
    }

    private RopMethod convert() {
        FirstFitLocalCombiningAllocator firstFitLocalCombiningAllocator = new FirstFitLocalCombiningAllocator(this.ssaMeth, this.interference, this.minimizeRegisters);
        RegisterMapper allocateRegisters = firstFitLocalCombiningAllocator.allocateRegisters();
        this.ssaMeth.setBackMode();
        this.ssaMeth.mapRegisters(allocateRegisters);
        removePhiFunctions();
        if (firstFitLocalCombiningAllocator.wantsParamsMovedHigh()) {
            moveParametersToHighRegisters();
        }
        removeEmptyGotos();
        BasicBlockList convertBasicBlocks = convertBasicBlocks();
        SsaMethod ssaMethod = this.ssaMeth;
        return new IdenticalBlockCombiner(new RopMethod(convertBasicBlocks, ssaMethod.blockIndexToRopLabel(ssaMethod.getEntryBlockIndex()))).process();
    }

    private BasicBlock convertBasicBlock(SsaBasicBlock ssaBasicBlock) {
        int i;
        IntList ropLabelSuccessorList = ssaBasicBlock.getRopLabelSuccessorList();
        int primarySuccessorRopLabel = ssaBasicBlock.getPrimarySuccessorRopLabel();
        SsaBasicBlock exitBlock = this.ssaMeth.getExitBlock();
        if (exitBlock == null) {
            i = -1;
        } else {
            i = exitBlock.getRopLabel();
        }
        if (ropLabelSuccessorList.contains(i)) {
            if (ropLabelSuccessorList.size() <= 1) {
                ropLabelSuccessorList = IntList.EMPTY;
                verifyValidExitPredecessor(ssaBasicBlock);
                primarySuccessorRopLabel = -1;
            } else {
                throw new RuntimeException("Exit predecessor must have no other successors" + Hex.m907u2(ssaBasicBlock.getRopLabel()));
            }
        }
        ropLabelSuccessorList.setImmutable();
        return new BasicBlock(ssaBasicBlock.getRopLabel(), convertInsns(ssaBasicBlock.getInsns()), ropLabelSuccessorList, primarySuccessorRopLabel);
    }

    private BasicBlockList convertBasicBlocks() {
        ArrayList<SsaBasicBlock> blocks = this.ssaMeth.getBlocks();
        SsaBasicBlock exitBlock = this.ssaMeth.getExitBlock();
        this.ssaMeth.computeReachability();
        int i = 0;
        BasicBlockList basicBlockList = new BasicBlockList(this.ssaMeth.getCountReachableBlocks() - ((exitBlock == null || !exitBlock.isReachable()) ? 0 : 1));
        Iterator<SsaBasicBlock> it = blocks.iterator();
        while (it.hasNext()) {
            SsaBasicBlock next = it.next();
            if (next.isReachable() && next != exitBlock) {
                basicBlockList.set(i, convertBasicBlock(next));
                i++;
            }
        }
        if (exitBlock == null || exitBlock.getInsns().size() == 0) {
            return basicBlockList;
        }
        throw new RuntimeException("Exit block must have no insns when leaving SSA form");
    }

    private InsnList convertInsns(ArrayList<SsaInsn> arrayList) {
        int size = arrayList.size();
        InsnList insnList = new InsnList(size);
        for (int i = 0; i < size; i++) {
            insnList.set(i, arrayList.get(i).toRopInsn());
        }
        insnList.setImmutable();
        return insnList;
    }

    public static RopMethod convertToRopMethod(SsaMethod ssaMethod, boolean z) {
        return new SsaToRop(ssaMethod, z).convert();
    }

    private void moveParametersToHighRegisters() {
        int paramWidth = this.ssaMeth.getParamWidth();
        BasicRegisterMapper basicRegisterMapper = new BasicRegisterMapper(this.ssaMeth.getRegCount());
        int regCount = this.ssaMeth.getRegCount();
        for (int i = 0; i < regCount; i++) {
            if (i < paramWidth) {
                basicRegisterMapper.addMapping(i, (regCount - paramWidth) + i, 1);
            } else {
                basicRegisterMapper.addMapping(i, i - paramWidth, 1);
            }
        }
        this.ssaMeth.mapRegisters(basicRegisterMapper);
    }

    private void removeEmptyGotos() {
        final ArrayList<SsaBasicBlock> blocks = this.ssaMeth.getBlocks();
        this.ssaMeth.forEachBlockDepthFirst(false, new SsaBasicBlock.Visitor() {
            public void visitBlock(SsaBasicBlock ssaBasicBlock, SsaBasicBlock ssaBasicBlock2) {
                ArrayList<SsaInsn> insns = ssaBasicBlock.getInsns();
                if (insns.size() == 1 && insns.get(0).getOpcode() == Rops.GOTO) {
                    BitSet bitSet = (BitSet) ssaBasicBlock.getPredecessors().clone();
                    for (int nextSetBit = bitSet.nextSetBit(0); nextSetBit >= 0; nextSetBit = bitSet.nextSetBit(nextSetBit + 1)) {
                        ((SsaBasicBlock) blocks.get(nextSetBit)).replaceSuccessor(ssaBasicBlock.getIndex(), ssaBasicBlock.getPrimarySuccessorIndex());
                    }
                }
            }
        });
    }

    private void removePhiFunctions() {
        ArrayList<SsaBasicBlock> blocks = this.ssaMeth.getBlocks();
        Iterator<SsaBasicBlock> it = blocks.iterator();
        while (it.hasNext()) {
            SsaBasicBlock next = it.next();
            next.forEachPhiInsn(new PhiVisitor(blocks));
            next.removeAllPhiInsns();
        }
        Iterator<SsaBasicBlock> it2 = blocks.iterator();
        while (it2.hasNext()) {
            it2.next().scheduleMovesFromPhis();
        }
    }

    private void verifyValidExitPredecessor(SsaBasicBlock ssaBasicBlock) {
        ArrayList<SsaInsn> insns = ssaBasicBlock.getInsns();
        Rop opcode = insns.get(insns.size() - 1).getOpcode();
        if (opcode.getBranchingness() != 2 && opcode != Rops.THROW) {
            throw new RuntimeException("Exit predecessor must end in valid exit statement.");
        }
    }

    public int[] getRegistersByFrequency() {
        int regCount = this.ssaMeth.getRegCount();
        Integer[] numArr = new Integer[regCount];
        for (int i = 0; i < regCount; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        Arrays.sort(numArr, new Comparator<Integer>() {
            public int compare(Integer num, Integer num2) {
                return SsaToRop.this.ssaMeth.getUseListForRegister(num2.intValue()).size() - SsaToRop.this.ssaMeth.getUseListForRegister(num.intValue()).size();
            }
        });
        int[] iArr = new int[regCount];
        for (int i2 = 0; i2 < regCount; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }
}
