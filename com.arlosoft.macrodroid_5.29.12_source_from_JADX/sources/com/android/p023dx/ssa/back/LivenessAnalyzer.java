package com.android.p023dx.ssa.back;

import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.ssa.PhiInsn;
import com.android.p023dx.ssa.SsaBasicBlock;
import com.android.p023dx.ssa.SsaInsn;
import com.android.p023dx.ssa.SsaMethod;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.android.dx.ssa.back.LivenessAnalyzer */
public class LivenessAnalyzer {
    private SsaBasicBlock blockN;
    private final InterferenceGraph interference;
    private final BitSet liveOutBlocks;
    private NextFunction nextFunction;
    private final int regV;
    private final SsaMethod ssaMeth;
    private int statementIndex;
    private final BitSet visitedBlocks;

    /* renamed from: com.android.dx.ssa.back.LivenessAnalyzer$1 */
    static /* synthetic */ class C16151 {
        static final /* synthetic */ int[] $SwitchMap$com$android$dx$ssa$back$LivenessAnalyzer$NextFunction;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction[] r0 = com.android.p023dx.ssa.back.LivenessAnalyzer.NextFunction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$android$dx$ssa$back$LivenessAnalyzer$NextFunction = r0
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r1 = com.android.p023dx.ssa.back.LivenessAnalyzer.NextFunction.LIVE_IN_AT_STATEMENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$android$dx$ssa$back$LivenessAnalyzer$NextFunction     // Catch:{ NoSuchFieldError -> 0x001d }
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r1 = com.android.p023dx.ssa.back.LivenessAnalyzer.NextFunction.LIVE_OUT_AT_STATEMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$android$dx$ssa$back$LivenessAnalyzer$NextFunction     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r1 = com.android.p023dx.ssa.back.LivenessAnalyzer.NextFunction.LIVE_OUT_AT_BLOCK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.ssa.back.LivenessAnalyzer.C16151.<clinit>():void");
        }
    }

    /* renamed from: com.android.dx.ssa.back.LivenessAnalyzer$NextFunction */
    private enum NextFunction {
        LIVE_IN_AT_STATEMENT,
        LIVE_OUT_AT_STATEMENT,
        LIVE_OUT_AT_BLOCK,
        DONE
    }

    private LivenessAnalyzer(SsaMethod ssaMethod, int i, InterferenceGraph interferenceGraph) {
        int size = ssaMethod.getBlocks().size();
        this.ssaMeth = ssaMethod;
        this.regV = i;
        this.visitedBlocks = new BitSet(size);
        this.liveOutBlocks = new BitSet(size);
        this.interference = interferenceGraph;
    }

    private static void coInterferePhis(SsaMethod ssaMethod, InterferenceGraph interferenceGraph) {
        Iterator<SsaBasicBlock> it = ssaMethod.getBlocks().iterator();
        while (it.hasNext()) {
            List<SsaInsn> phiInsns = it.next().getPhiInsns();
            int size = phiInsns.size();
            for (int i = 0; i < size; i++) {
                for (int i2 = 0; i2 < size; i2++) {
                    if (i != i2) {
                        interferenceGraph.add(phiInsns.get(i).getResult().getReg(), phiInsns.get(i2).getResult().getReg());
                    }
                }
            }
        }
    }

    public static InterferenceGraph constructInterferenceGraph(SsaMethod ssaMethod) {
        int regCount = ssaMethod.getRegCount();
        InterferenceGraph interferenceGraph = new InterferenceGraph(regCount);
        for (int i = 0; i < regCount; i++) {
            new LivenessAnalyzer(ssaMethod, i, interferenceGraph).run();
        }
        coInterferePhis(ssaMethod, interferenceGraph);
        return interferenceGraph;
    }

    private void handleTailRecursion() {
        while (true) {
            NextFunction nextFunction2 = this.nextFunction;
            NextFunction nextFunction3 = NextFunction.DONE;
            if (nextFunction2 != nextFunction3) {
                int i = C16151.$SwitchMap$com$android$dx$ssa$back$LivenessAnalyzer$NextFunction[nextFunction2.ordinal()];
                if (i == 1) {
                    this.nextFunction = nextFunction3;
                    liveInAtStatement();
                } else if (i == 2) {
                    this.nextFunction = nextFunction3;
                    liveOutAtStatement();
                } else if (i == 3) {
                    this.nextFunction = nextFunction3;
                    liveOutAtBlock();
                }
            } else {
                return;
            }
        }
    }

    private void liveInAtStatement() {
        int i = this.statementIndex;
        if (i == 0) {
            this.blockN.addLiveIn(this.regV);
            this.liveOutBlocks.or(this.blockN.getPredecessors());
            return;
        }
        this.statementIndex = i - 1;
        this.nextFunction = NextFunction.LIVE_OUT_AT_STATEMENT;
    }

    private void liveOutAtBlock() {
        if (!this.visitedBlocks.get(this.blockN.getIndex())) {
            this.visitedBlocks.set(this.blockN.getIndex());
            this.blockN.addLiveOut(this.regV);
            this.statementIndex = this.blockN.getInsns().size() - 1;
            this.nextFunction = NextFunction.LIVE_OUT_AT_STATEMENT;
        }
    }

    private void liveOutAtStatement() {
        SsaInsn ssaInsn = this.blockN.getInsns().get(this.statementIndex);
        RegisterSpec result = ssaInsn.getResult();
        if (!ssaInsn.isResultReg(this.regV)) {
            if (result != null) {
                this.interference.add(this.regV, result.getReg());
            }
            this.nextFunction = NextFunction.LIVE_IN_AT_STATEMENT;
        }
    }

    public void run() {
        for (SsaInsn next : this.ssaMeth.getUseListForRegister(this.regV)) {
            this.nextFunction = NextFunction.DONE;
            if (next instanceof PhiInsn) {
                for (SsaBasicBlock ssaBasicBlock : ((PhiInsn) next).predBlocksForReg(this.regV, this.ssaMeth)) {
                    this.blockN = ssaBasicBlock;
                    this.nextFunction = NextFunction.LIVE_OUT_AT_BLOCK;
                    handleTailRecursion();
                }
            } else {
                SsaBasicBlock block = next.getBlock();
                this.blockN = block;
                int indexOf = block.getInsns().indexOf(next);
                this.statementIndex = indexOf;
                if (indexOf >= 0) {
                    this.nextFunction = NextFunction.LIVE_IN_AT_STATEMENT;
                    handleTailRecursion();
                } else {
                    throw new RuntimeException("insn not found in it's own block");
                }
            }
        }
        while (true) {
            int nextSetBit = this.liveOutBlocks.nextSetBit(0);
            if (nextSetBit >= 0) {
                this.blockN = this.ssaMeth.getBlocks().get(nextSetBit);
                this.liveOutBlocks.clear(nextSetBit);
                this.nextFunction = NextFunction.LIVE_OUT_AT_BLOCK;
                handleTailRecursion();
            } else {
                return;
            }
        }
    }
}
