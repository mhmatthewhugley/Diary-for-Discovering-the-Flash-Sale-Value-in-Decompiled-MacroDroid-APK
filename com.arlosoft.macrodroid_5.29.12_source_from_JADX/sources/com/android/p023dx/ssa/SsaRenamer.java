package com.android.p023dx.ssa;

import com.android.p023dx.rop.code.LocalItem;
import com.android.p023dx.rop.code.PlainInsn;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.Rops;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.ssa.PhiInsn;
import com.android.p023dx.ssa.SsaBasicBlock;
import com.android.p023dx.ssa.SsaInsn;
import com.android.p023dx.util.IntList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.android.dx.ssa.SsaRenamer */
public class SsaRenamer implements Runnable {
    private static final boolean DEBUG = false;
    /* access modifiers changed from: private */
    public int nextSsaReg;
    private final int ropRegCount;
    /* access modifiers changed from: private */
    public final SsaMethod ssaMeth;
    private final ArrayList<LocalItem> ssaRegToLocalItems;
    private IntList ssaRegToRopReg;
    /* access modifiers changed from: private */
    public final RegisterSpec[][] startsForBlocks;
    /* access modifiers changed from: private */
    public int threshold;

    /* renamed from: com.android.dx.ssa.SsaRenamer$BlockRenamer */
    private class BlockRenamer implements SsaInsn.Visitor {
        /* access modifiers changed from: private */
        public final SsaBasicBlock block;
        /* access modifiers changed from: private */
        public final RegisterSpec[] currentMapping;
        private final HashMap<SsaInsn, SsaInsn> insnsToReplace = new HashMap<>();
        private final RenamingMapper mapper = new RenamingMapper();
        private final HashSet<SsaInsn> movesToKeep = new HashSet<>();

        /* renamed from: com.android.dx.ssa.SsaRenamer$BlockRenamer$RenamingMapper */
        private class RenamingMapper extends RegisterMapper {
            public RenamingMapper() {
            }

            public int getNewRegisterCount() {
                return SsaRenamer.this.nextSsaReg;
            }

            public RegisterSpec map(RegisterSpec registerSpec) {
                if (registerSpec == null) {
                    return null;
                }
                return registerSpec.withReg(BlockRenamer.this.currentMapping[registerSpec.getReg()].getReg());
            }
        }

        BlockRenamer(SsaBasicBlock ssaBasicBlock) {
            this.block = ssaBasicBlock;
            this.currentMapping = SsaRenamer.this.startsForBlocks[ssaBasicBlock.getIndex()];
            SsaRenamer.this.startsForBlocks[ssaBasicBlock.getIndex()] = null;
        }

        private void addMapping(int i, RegisterSpec registerSpec) {
            int reg = registerSpec.getReg();
            LocalItem localItem = registerSpec.getLocalItem();
            RegisterSpec[] registerSpecArr = this.currentMapping;
            registerSpecArr[i] = registerSpec;
            for (int length = registerSpecArr.length - 1; length >= 0; length--) {
                if (reg == this.currentMapping[length].getReg()) {
                    this.currentMapping[length] = registerSpec;
                }
            }
            if (localItem != null) {
                SsaRenamer.this.setNameForSsaReg(registerSpec);
                for (int length2 = this.currentMapping.length - 1; length2 >= 0; length2--) {
                    RegisterSpec registerSpec2 = this.currentMapping[length2];
                    if (reg != registerSpec2.getReg() && localItem.equals(registerSpec2.getLocalItem())) {
                        this.currentMapping[length2] = registerSpec2.withLocalItem((LocalItem) null);
                    }
                }
            }
        }

        private void updateSuccessorPhis() {
            C16101 r0 = new PhiInsn.Visitor() {
                public void visitPhiInsn(PhiInsn phiInsn) {
                    int ropResultReg = phiInsn.getRopResultReg();
                    if (!SsaRenamer.this.isBelowThresholdRegister(ropResultReg)) {
                        RegisterSpec registerSpec = BlockRenamer.this.currentMapping[ropResultReg];
                        if (!SsaRenamer.this.isVersionZeroRegister(registerSpec.getReg())) {
                            phiInsn.addPhiOperand(registerSpec, BlockRenamer.this.block);
                        }
                    }
                }
            };
            BitSet successors = this.block.getSuccessors();
            for (int nextSetBit = successors.nextSetBit(0); nextSetBit >= 0; nextSetBit = successors.nextSetBit(nextSetBit + 1)) {
                SsaRenamer.this.ssaMeth.getBlocks().get(nextSetBit).forEachPhiInsn(r0);
            }
        }

        public void process() {
            RegisterSpec[] registerSpecArr;
            this.block.forEachInsn(this);
            updateSuccessorPhis();
            ArrayList<SsaInsn> insns = this.block.getInsns();
            boolean z = true;
            for (int size = insns.size() - 1; size >= 0; size--) {
                SsaInsn ssaInsn = insns.get(size);
                SsaInsn ssaInsn2 = this.insnsToReplace.get(ssaInsn);
                if (ssaInsn2 != null) {
                    insns.set(size, ssaInsn2);
                } else if (ssaInsn.isNormalMoveInsn() && !this.movesToKeep.contains(ssaInsn)) {
                    insns.remove(size);
                }
            }
            Iterator<SsaBasicBlock> it = this.block.getDomChildren().iterator();
            while (it.hasNext()) {
                SsaBasicBlock next = it.next();
                if (next != this.block) {
                    if (z) {
                        registerSpecArr = this.currentMapping;
                    } else {
                        registerSpecArr = SsaRenamer.dupArray(this.currentMapping);
                    }
                    SsaRenamer.this.startsForBlocks[next.getIndex()] = registerSpecArr;
                    z = false;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void processResultReg(SsaInsn ssaInsn) {
            RegisterSpec result = ssaInsn.getResult();
            if (result != null) {
                int reg = result.getReg();
                if (!SsaRenamer.this.isBelowThresholdRegister(reg)) {
                    ssaInsn.changeResultReg(SsaRenamer.this.nextSsaReg);
                    addMapping(reg, ssaInsn.getResult());
                    SsaRenamer.access$108(SsaRenamer.this);
                }
            }
        }

        public void visitMoveInsn(NormalSsaInsn normalSsaInsn) {
            RegisterSpec result = normalSsaInsn.getResult();
            int reg = result.getReg();
            boolean z = false;
            int reg2 = normalSsaInsn.getSources().get(0).getReg();
            normalSsaInsn.mapSourceRegisters(this.mapper);
            int reg3 = normalSsaInsn.getSources().get(0).getReg();
            LocalItem localItem = this.currentMapping[reg2].getLocalItem();
            LocalItem localItem2 = result.getLocalItem();
            if (localItem2 == null) {
                localItem2 = localItem;
            }
            LocalItem access$500 = SsaRenamer.this.getLocalForNewReg(reg3);
            if (access$500 == null || localItem2 == null || localItem2.equals(access$500)) {
                z = true;
            }
            RegisterSpec makeLocalOptional = RegisterSpec.makeLocalOptional(reg3, result.getType(), localItem2);
            if (!Optimizer.getPreserveLocals() || (z && SsaRenamer.equalsHandlesNulls(localItem2, localItem) && SsaRenamer.this.threshold == 0)) {
                addMapping(reg, makeLocalOptional);
            } else if (z && localItem == null && SsaRenamer.this.threshold == 0) {
                this.insnsToReplace.put(normalSsaInsn, SsaInsn.makeFromRop(new PlainInsn(Rops.opMarkLocal(makeLocalOptional), SourcePosition.NO_INFO, (RegisterSpec) null, RegisterSpecList.make(RegisterSpec.make(makeLocalOptional.getReg(), makeLocalOptional.getType(), localItem2))), this.block));
                addMapping(reg, makeLocalOptional);
            } else {
                processResultReg(normalSsaInsn);
                this.movesToKeep.add(normalSsaInsn);
            }
        }

        public void visitNonMoveInsn(NormalSsaInsn normalSsaInsn) {
            normalSsaInsn.mapSourceRegisters(this.mapper);
            processResultReg(normalSsaInsn);
        }

        public void visitPhiInsn(PhiInsn phiInsn) {
            processResultReg(phiInsn);
        }
    }

    public SsaRenamer(SsaMethod ssaMethod) {
        int regCount = ssaMethod.getRegCount();
        this.ropRegCount = regCount;
        this.ssaMeth = ssaMethod;
        this.nextSsaReg = regCount;
        this.threshold = 0;
        this.startsForBlocks = new RegisterSpec[ssaMethod.getBlocks().size()][];
        this.ssaRegToLocalItems = new ArrayList<>();
        RegisterSpec[] registerSpecArr = new RegisterSpec[regCount];
        for (int i = 0; i < this.ropRegCount; i++) {
            registerSpecArr[i] = RegisterSpec.make(i, Type.VOID);
        }
        this.startsForBlocks[ssaMethod.getEntryBlockIndex()] = registerSpecArr;
    }

    static /* synthetic */ int access$108(SsaRenamer ssaRenamer) {
        int i = ssaRenamer.nextSsaReg;
        ssaRenamer.nextSsaReg = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    public static RegisterSpec[] dupArray(RegisterSpec[] registerSpecArr) {
        RegisterSpec[] registerSpecArr2 = new RegisterSpec[registerSpecArr.length];
        System.arraycopy(registerSpecArr, 0, registerSpecArr2, 0, registerSpecArr.length);
        return registerSpecArr2;
    }

    /* access modifiers changed from: private */
    public static boolean equalsHandlesNulls(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* access modifiers changed from: private */
    public LocalItem getLocalForNewReg(int i) {
        if (i < this.ssaRegToLocalItems.size()) {
            return this.ssaRegToLocalItems.get(i);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public boolean isBelowThresholdRegister(int i) {
        return i < this.threshold;
    }

    /* access modifiers changed from: private */
    public boolean isVersionZeroRegister(int i) {
        return i < this.ropRegCount;
    }

    /* access modifiers changed from: private */
    public void setNameForSsaReg(RegisterSpec registerSpec) {
        int reg = registerSpec.getReg();
        LocalItem localItem = registerSpec.getLocalItem();
        this.ssaRegToLocalItems.ensureCapacity(reg + 1);
        while (this.ssaRegToLocalItems.size() <= reg) {
            this.ssaRegToLocalItems.add((Object) null);
        }
        this.ssaRegToLocalItems.set(reg, localItem);
    }

    public void run() {
        this.ssaMeth.forEachBlockDepthFirstDom(new SsaBasicBlock.Visitor() {
            public void visitBlock(SsaBasicBlock ssaBasicBlock, SsaBasicBlock ssaBasicBlock2) {
                new BlockRenamer(ssaBasicBlock).process();
            }
        });
        this.ssaMeth.setNewRegCount(this.nextSsaReg);
        this.ssaMeth.onInsnsChanged();
    }

    public SsaRenamer(SsaMethod ssaMethod, int i) {
        this(ssaMethod);
        this.threshold = i;
    }
}
