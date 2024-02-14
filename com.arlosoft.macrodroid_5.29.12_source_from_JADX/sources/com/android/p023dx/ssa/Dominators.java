package com.android.p023dx.ssa;

import com.android.p023dx.ssa.DomFront;
import com.android.p023dx.ssa.SsaBasicBlock;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;

/* renamed from: com.android.dx.ssa.Dominators */
public final class Dominators {
    private final ArrayList<SsaBasicBlock> blocks;
    private final DomFront.DomInfo[] domInfos;
    /* access modifiers changed from: private */
    public final DFSInfo[] info;
    private final SsaMethod meth;
    private final boolean postdom;
    /* access modifiers changed from: private */
    public final ArrayList<SsaBasicBlock> vertex = new ArrayList<>();

    /* renamed from: com.android.dx.ssa.Dominators$DFSInfo */
    private static final class DFSInfo {
        public SsaBasicBlock ancestor;
        public ArrayList<SsaBasicBlock> bucket = new ArrayList<>();
        public SsaBasicBlock parent;
        public SsaBasicBlock rep;
        public int semidom;
    }

    /* renamed from: com.android.dx.ssa.Dominators$DfsWalker */
    private class DfsWalker implements SsaBasicBlock.Visitor {
        private int dfsNum;

        private DfsWalker() {
            this.dfsNum = 0;
        }

        public void visitBlock(SsaBasicBlock ssaBasicBlock, SsaBasicBlock ssaBasicBlock2) {
            DFSInfo dFSInfo = new DFSInfo();
            int i = this.dfsNum + 1;
            this.dfsNum = i;
            dFSInfo.semidom = i;
            dFSInfo.rep = ssaBasicBlock;
            dFSInfo.parent = ssaBasicBlock2;
            Dominators.this.vertex.add(ssaBasicBlock);
            Dominators.this.info[ssaBasicBlock.getIndex()] = dFSInfo;
        }
    }

    private Dominators(SsaMethod ssaMethod, DomFront.DomInfo[] domInfoArr, boolean z) {
        this.meth = ssaMethod;
        this.domInfos = domInfoArr;
        this.postdom = z;
        ArrayList<SsaBasicBlock> blocks2 = ssaMethod.getBlocks();
        this.blocks = blocks2;
        this.info = new DFSInfo[(blocks2.size() + 2)];
    }

    private void compress(SsaBasicBlock ssaBasicBlock) {
        if (this.info[this.info[ssaBasicBlock.getIndex()].ancestor.getIndex()].ancestor != null) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            arrayList.add(ssaBasicBlock);
            while (!arrayList.isEmpty()) {
                int size = arrayList.size() - 1;
                DFSInfo dFSInfo = this.info[((SsaBasicBlock) arrayList.get(size)).getIndex()];
                SsaBasicBlock ssaBasicBlock2 = dFSInfo.ancestor;
                DFSInfo dFSInfo2 = this.info[ssaBasicBlock2.getIndex()];
                if (!hashSet.add(ssaBasicBlock2) || dFSInfo2.ancestor == null) {
                    arrayList.remove(size);
                    if (dFSInfo2.ancestor != null) {
                        SsaBasicBlock ssaBasicBlock3 = dFSInfo2.rep;
                        if (this.info[ssaBasicBlock3.getIndex()].semidom < this.info[dFSInfo.rep.getIndex()].semidom) {
                            dFSInfo.rep = ssaBasicBlock3;
                        }
                        dFSInfo.ancestor = dFSInfo2.ancestor;
                    }
                } else {
                    arrayList.add(ssaBasicBlock2);
                }
            }
        }
    }

    private SsaBasicBlock eval(SsaBasicBlock ssaBasicBlock) {
        DFSInfo dFSInfo = this.info[ssaBasicBlock.getIndex()];
        if (dFSInfo.ancestor == null) {
            return ssaBasicBlock;
        }
        compress(ssaBasicBlock);
        return dFSInfo.rep;
    }

    private BitSet getPreds(SsaBasicBlock ssaBasicBlock) {
        if (this.postdom) {
            return ssaBasicBlock.getSuccessors();
        }
        return ssaBasicBlock.getPredecessors();
    }

    private BitSet getSuccs(SsaBasicBlock ssaBasicBlock) {
        if (this.postdom) {
            return ssaBasicBlock.getPredecessors();
        }
        return ssaBasicBlock.getSuccessors();
    }

    public static Dominators make(SsaMethod ssaMethod, DomFront.DomInfo[] domInfoArr, boolean z) {
        Dominators dominators = new Dominators(ssaMethod, domInfoArr, z);
        dominators.run();
        return dominators;
    }

    private void run() {
        int i;
        int i2;
        SsaBasicBlock exitBlock = this.postdom ? this.meth.getExitBlock() : this.meth.getEntryBlock();
        if (exitBlock != null) {
            this.vertex.add(exitBlock);
            this.domInfos[exitBlock.getIndex()].idom = exitBlock.getIndex();
        }
        this.meth.forEachBlockDepthFirst(this.postdom, new DfsWalker());
        int size = this.vertex.size() - 1;
        int i3 = size;
        while (true) {
            if (i3 < 2) {
                break;
            }
            SsaBasicBlock ssaBasicBlock = this.vertex.get(i3);
            DFSInfo dFSInfo = this.info[ssaBasicBlock.getIndex()];
            BitSet preds = getPreds(ssaBasicBlock);
            for (int nextSetBit = preds.nextSetBit(0); nextSetBit >= 0; nextSetBit = preds.nextSetBit(nextSetBit + 1)) {
                SsaBasicBlock ssaBasicBlock2 = this.blocks.get(nextSetBit);
                if (this.info[ssaBasicBlock2.getIndex()] != null && (i2 = this.info[eval(ssaBasicBlock2).getIndex()].semidom) < dFSInfo.semidom) {
                    dFSInfo.semidom = i2;
                }
            }
            this.info[this.vertex.get(dFSInfo.semidom).getIndex()].bucket.add(ssaBasicBlock);
            SsaBasicBlock ssaBasicBlock3 = dFSInfo.parent;
            dFSInfo.ancestor = ssaBasicBlock3;
            ArrayList<SsaBasicBlock> arrayList = this.info[ssaBasicBlock3.getIndex()].bucket;
            while (!arrayList.isEmpty()) {
                SsaBasicBlock remove = arrayList.remove(arrayList.size() - 1);
                SsaBasicBlock eval = eval(remove);
                if (this.info[eval.getIndex()].semidom < this.info[remove.getIndex()].semidom) {
                    this.domInfos[remove.getIndex()].idom = eval.getIndex();
                } else {
                    this.domInfos[remove.getIndex()].idom = dFSInfo.parent.getIndex();
                }
            }
            i3--;
        }
        for (i = 2; i <= size; i++) {
            SsaBasicBlock ssaBasicBlock4 = this.vertex.get(i);
            if (this.domInfos[ssaBasicBlock4.getIndex()].idom != this.vertex.get(this.info[ssaBasicBlock4.getIndex()].semidom).getIndex()) {
                DomFront.DomInfo domInfo = this.domInfos[ssaBasicBlock4.getIndex()];
                DomFront.DomInfo[] domInfoArr = this.domInfos;
                domInfo.idom = domInfoArr[domInfoArr[ssaBasicBlock4.getIndex()].idom].idom;
            }
        }
    }
}
