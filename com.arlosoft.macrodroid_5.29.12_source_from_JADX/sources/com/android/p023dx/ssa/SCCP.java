package com.android.p023dx.ssa;

import com.android.p023dx.rop.code.PlainInsn;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.Rops;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.TypedConstant;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* renamed from: com.android.dx.ssa.SCCP */
public class SCCP {
    private static final int CONSTANT = 1;
    private static final int TOP = 0;
    private static final int VARYING = 2;
    private ArrayList<SsaInsn> branchWorklist;
    private ArrayList<SsaBasicBlock> cfgPhiWorklist = new ArrayList<>();
    private ArrayList<SsaBasicBlock> cfgWorklist = new ArrayList<>();
    private BitSet executableBlocks;
    private Constant[] latticeConstants;
    private int[] latticeValues;
    private int regCount;
    private SsaMethod ssaMeth;
    private ArrayList<SsaInsn> ssaWorklist;
    private ArrayList<SsaInsn> varyingWorklist;

    private SCCP(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
        int regCount2 = ssaMethod.getRegCount();
        this.regCount = regCount2;
        this.latticeValues = new int[regCount2];
        this.latticeConstants = new Constant[regCount2];
        this.executableBlocks = new BitSet(ssaMethod.getBlocks().size());
        this.ssaWorklist = new ArrayList<>();
        this.varyingWorklist = new ArrayList<>();
        this.branchWorklist = new ArrayList<>();
        for (int i = 0; i < this.regCount; i++) {
            this.latticeValues[i] = 0;
            this.latticeConstants[i] = null;
        }
    }

    private void addBlockToWorklist(SsaBasicBlock ssaBasicBlock) {
        if (!this.executableBlocks.get(ssaBasicBlock.getIndex())) {
            this.cfgWorklist.add(ssaBasicBlock);
            this.executableBlocks.set(ssaBasicBlock.getIndex());
            return;
        }
        this.cfgPhiWorklist.add(ssaBasicBlock);
    }

    private void addUsersToWorklist(int i, int i2) {
        if (i2 == 2) {
            for (SsaInsn add : this.ssaMeth.getUseListForRegister(i)) {
                this.varyingWorklist.add(add);
            }
            return;
        }
        for (SsaInsn add2 : this.ssaMeth.getUseListForRegister(i)) {
            this.ssaWorklist.add(add2);
        }
    }

    private static String latticeValName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "VARYING" : "CONSTANT" : "TOP";
    }

    public static void process(SsaMethod ssaMethod) {
        new SCCP(ssaMethod).run();
    }

    private void replaceBranches() {
        Iterator<SsaInsn> it = this.branchWorklist.iterator();
        while (it.hasNext()) {
            SsaInsn next = it.next();
            SsaBasicBlock block = next.getBlock();
            int size = block.getSuccessorList().size();
            int i = -1;
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = block.getSuccessorList().get(i2);
                if (!this.executableBlocks.get(i3)) {
                    i = i3;
                }
            }
            if (size == 2 && i != -1) {
                block.replaceLastInsn(new PlainInsn(Rops.GOTO, next.getOriginalRopInsn().getPosition(), (RegisterSpec) null, RegisterSpecList.EMPTY));
                block.removeSuccessor(i);
            }
        }
    }

    private void replaceConstants() {
        for (int i = 0; i < this.regCount; i++) {
            if (this.latticeValues[i] == 1 && (this.latticeConstants[i] instanceof TypedConstant)) {
                SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
                if (!definitionForRegister.getResult().getTypeBearer().isConstant()) {
                    definitionForRegister.setResult(definitionForRegister.getResult().withType((TypedConstant) this.latticeConstants[i]));
                    for (SsaInsn next : this.ssaMeth.getUseListForRegister(i)) {
                        if (!next.isPhiOrMove()) {
                            RegisterSpecList sources = next.getSources();
                            int indexOfRegister = sources.indexOfRegister(i);
                            ((NormalSsaInsn) next).changeOneSource(indexOfRegister, sources.get(indexOfRegister).withType((TypedConstant) this.latticeConstants[i]));
                        }
                    }
                }
            }
        }
    }

    private void run() {
        addBlockToWorklist(this.ssaMeth.getEntryBlock());
        while (true) {
            if (!this.cfgWorklist.isEmpty() || !this.cfgPhiWorklist.isEmpty() || !this.ssaWorklist.isEmpty() || !this.varyingWorklist.isEmpty()) {
                while (!this.cfgWorklist.isEmpty()) {
                    simulateBlock(this.cfgWorklist.remove(this.cfgWorklist.size() - 1));
                }
                while (!this.cfgPhiWorklist.isEmpty()) {
                    simulatePhiBlock(this.cfgPhiWorklist.remove(this.cfgPhiWorklist.size() - 1));
                }
                while (!this.varyingWorklist.isEmpty()) {
                    SsaInsn remove = this.varyingWorklist.remove(this.varyingWorklist.size() - 1);
                    if (this.executableBlocks.get(remove.getBlock().getIndex())) {
                        if (remove instanceof PhiInsn) {
                            simulatePhi((PhiInsn) remove);
                        } else {
                            simulateStmt(remove);
                        }
                    }
                }
                while (!this.ssaWorklist.isEmpty()) {
                    SsaInsn remove2 = this.ssaWorklist.remove(this.ssaWorklist.size() - 1);
                    if (this.executableBlocks.get(remove2.getBlock().getIndex())) {
                        if (remove2 instanceof PhiInsn) {
                            simulatePhi((PhiInsn) remove2);
                        } else {
                            simulateStmt(remove2);
                        }
                    }
                }
            } else {
                replaceConstants();
                replaceBranches();
                return;
            }
        }
    }

    private boolean setLatticeValueTo(int i, int i2, Constant constant) {
        if (i2 != 1) {
            int[] iArr = this.latticeValues;
            if (iArr[i] == i2) {
                return false;
            }
            iArr[i] = i2;
            return true;
        } else if (this.latticeValues[i] == i2 && this.latticeConstants[i].equals(constant)) {
            return false;
        } else {
            this.latticeValues[i] = i2;
            this.latticeConstants[i] = constant;
            return true;
        }
    }

    private void simulateBlock(SsaBasicBlock ssaBasicBlock) {
        Iterator<SsaInsn> it = ssaBasicBlock.getInsns().iterator();
        while (it.hasNext()) {
            SsaInsn next = it.next();
            if (next instanceof PhiInsn) {
                simulatePhi((PhiInsn) next);
            } else {
                simulateStmt(next);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.android.dx.rop.cst.CstInteger} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.android.dx.rop.cst.CstInteger} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        if (r1 > 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r1 <= 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        if (r1 >= 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        if (r1 < 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        if (r1 != 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (r1 == 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b5, code lost:
        if (r1 > r2) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b8, code lost:
        if (r1 <= r2) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bb, code lost:
        if (r1 >= r2) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00be, code lost:
        if (r1 < r2) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c1, code lost:
        if (r1 != r2) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c4, code lost:
        if (r1 == r2) goto L_0x0089;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f7 A[LOOP:0: B:55:0x00f7->B:57:0x0101, LOOP_START, PHI: r3 
      PHI: (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:50:0x00cd, B:57:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void simulateBranch(com.android.p023dx.ssa.SsaInsn r10) {
        /*
            r9 = this;
            com.android.dx.rop.code.Rop r0 = r10.getOpcode()
            com.android.dx.rop.code.RegisterSpecList r1 = r10.getSources()
            int r2 = r0.getBranchingness()
            r3 = 0
            r4 = 1
            r5 = 4
            if (r2 != r5) goto L_0x00c7
            com.android.dx.rop.code.RegisterSpec r2 = r1.get(r3)
            int r5 = r2.getReg()
            com.android.dx.ssa.SsaMethod r6 = r9.ssaMeth
            boolean r2 = r6.isRegALocal(r2)
            r6 = 0
            if (r2 != 0) goto L_0x002d
            int[] r2 = r9.latticeValues
            r2 = r2[r5]
            if (r2 != r4) goto L_0x002d
            com.android.dx.rop.cst.Constant[] r2 = r9.latticeConstants
            r2 = r2[r5]
            goto L_0x002e
        L_0x002d:
            r2 = r6
        L_0x002e:
            int r5 = r1.size()
            r7 = 2
            if (r5 != r7) goto L_0x004f
            com.android.dx.rop.code.RegisterSpec r5 = r1.get(r4)
            int r7 = r5.getReg()
            com.android.dx.ssa.SsaMethod r8 = r9.ssaMeth
            boolean r5 = r8.isRegALocal(r5)
            if (r5 != 0) goto L_0x004f
            int[] r5 = r9.latticeValues
            r5 = r5[r7]
            if (r5 != r4) goto L_0x004f
            com.android.dx.rop.cst.Constant[] r5 = r9.latticeConstants
            r6 = r5[r7]
        L_0x004f:
            java.lang.String r5 = "Unexpected op"
            r7 = 6
            if (r2 == 0) goto L_0x008e
            int r1 = r1.size()
            if (r1 != r4) goto L_0x008e
            r1 = r2
            com.android.dx.rop.cst.TypedConstant r1 = (com.android.p023dx.rop.cst.TypedConstant) r1
            int r1 = r1.getBasicType()
            if (r1 == r7) goto L_0x0065
            goto L_0x00c7
        L_0x0065:
            com.android.dx.rop.cst.CstInteger r2 = (com.android.p023dx.rop.cst.CstInteger) r2
            int r1 = r2.getValue()
            int r0 = r0.getOpcode()
            switch(r0) {
                case 7: goto L_0x0087;
                case 8: goto L_0x0084;
                case 9: goto L_0x0081;
                case 10: goto L_0x007e;
                case 11: goto L_0x007b;
                case 12: goto L_0x0078;
                default: goto L_0x0072;
            }
        L_0x0072:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r5)
            throw r10
        L_0x0078:
            if (r1 <= 0) goto L_0x008b
            goto L_0x0089
        L_0x007b:
            if (r1 > 0) goto L_0x008b
            goto L_0x0089
        L_0x007e:
            if (r1 < 0) goto L_0x008b
            goto L_0x0089
        L_0x0081:
            if (r1 >= 0) goto L_0x008b
            goto L_0x0089
        L_0x0084:
            if (r1 == 0) goto L_0x008b
            goto L_0x0089
        L_0x0087:
            if (r1 != 0) goto L_0x008b
        L_0x0089:
            r0 = 1
            goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            r1 = 1
            goto L_0x00c9
        L_0x008e:
            if (r2 == 0) goto L_0x00c7
            if (r6 == 0) goto L_0x00c7
            r1 = r2
            com.android.dx.rop.cst.TypedConstant r1 = (com.android.p023dx.rop.cst.TypedConstant) r1
            int r1 = r1.getBasicType()
            if (r1 == r7) goto L_0x009c
            goto L_0x00c7
        L_0x009c:
            com.android.dx.rop.cst.CstInteger r2 = (com.android.p023dx.rop.cst.CstInteger) r2
            int r1 = r2.getValue()
            com.android.dx.rop.cst.CstInteger r6 = (com.android.p023dx.rop.cst.CstInteger) r6
            int r2 = r6.getValue()
            int r0 = r0.getOpcode()
            switch(r0) {
                case 7: goto L_0x00c4;
                case 8: goto L_0x00c1;
                case 9: goto L_0x00be;
                case 10: goto L_0x00bb;
                case 11: goto L_0x00b8;
                case 12: goto L_0x00b5;
                default: goto L_0x00af;
            }
        L_0x00af:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r5)
            throw r10
        L_0x00b5:
            if (r1 <= r2) goto L_0x008b
            goto L_0x0089
        L_0x00b8:
            if (r1 > r2) goto L_0x008b
            goto L_0x0089
        L_0x00bb:
            if (r1 < r2) goto L_0x008b
            goto L_0x0089
        L_0x00be:
            if (r1 >= r2) goto L_0x008b
            goto L_0x0089
        L_0x00c1:
            if (r1 == r2) goto L_0x008b
            goto L_0x0089
        L_0x00c4:
            if (r1 != r2) goto L_0x008b
            goto L_0x0089
        L_0x00c7:
            r0 = 0
            r1 = 0
        L_0x00c9:
            com.android.dx.ssa.SsaBasicBlock r2 = r10.getBlock()
            if (r1 == 0) goto L_0x00f7
            if (r0 == 0) goto L_0x00da
            com.android.dx.util.IntList r0 = r2.getSuccessorList()
            int r0 = r0.get(r4)
            goto L_0x00e2
        L_0x00da:
            com.android.dx.util.IntList r0 = r2.getSuccessorList()
            int r0 = r0.get(r3)
        L_0x00e2:
            com.android.dx.ssa.SsaMethod r1 = r9.ssaMeth
            java.util.ArrayList r1 = r1.getBlocks()
            java.lang.Object r0 = r1.get(r0)
            com.android.dx.ssa.SsaBasicBlock r0 = (com.android.p023dx.ssa.SsaBasicBlock) r0
            r9.addBlockToWorklist(r0)
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r9.branchWorklist
            r0.add(r10)
            goto L_0x011b
        L_0x00f7:
            com.android.dx.util.IntList r10 = r2.getSuccessorList()
            int r10 = r10.size()
            if (r3 >= r10) goto L_0x011b
            com.android.dx.util.IntList r10 = r2.getSuccessorList()
            int r10 = r10.get(r3)
            com.android.dx.ssa.SsaMethod r0 = r9.ssaMeth
            java.util.ArrayList r0 = r0.getBlocks()
            java.lang.Object r10 = r0.get(r10)
            com.android.dx.ssa.SsaBasicBlock r10 = (com.android.p023dx.ssa.SsaBasicBlock) r10
            r9.addBlockToWorklist(r10)
            int r3 = r3 + 1
            goto L_0x00f7
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.ssa.SCCP.simulateBranch(com.android.dx.ssa.SsaInsn):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        r8 = 0;
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        if (r2 == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return com.android.p023dx.rop.cst.CstInteger.make(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.android.p023dx.rop.cst.Constant simulateMath(com.android.p023dx.ssa.SsaInsn r8, int r9) {
        /*
            r7 = this;
            com.android.dx.rop.code.Insn r0 = r8.getOriginalRopInsn()
            com.android.dx.rop.code.Rop r1 = r8.getOpcode()
            int r1 = r1.getOpcode()
            com.android.dx.rop.code.RegisterSpecList r8 = r8.getSources()
            r2 = 0
            com.android.dx.rop.code.RegisterSpec r3 = r8.get(r2)
            int r3 = r3.getReg()
            int[] r4 = r7.latticeValues
            r4 = r4[r3]
            r5 = 0
            r6 = 1
            if (r4 == r6) goto L_0x0023
            r3 = r5
            goto L_0x0027
        L_0x0023:
            com.android.dx.rop.cst.Constant[] r4 = r7.latticeConstants
            r3 = r4[r3]
        L_0x0027:
            int r4 = r8.size()
            if (r4 != r6) goto L_0x0034
            com.android.dx.rop.code.CstInsn r0 = (com.android.p023dx.rop.code.CstInsn) r0
            com.android.dx.rop.cst.Constant r0 = r0.getConstant()
            goto L_0x0048
        L_0x0034:
            com.android.dx.rop.code.RegisterSpec r0 = r8.get(r6)
            int r0 = r0.getReg()
            int[] r4 = r7.latticeValues
            r4 = r4[r0]
            if (r4 == r6) goto L_0x0044
            r0 = r5
            goto L_0x0048
        L_0x0044:
            com.android.dx.rop.cst.Constant[] r4 = r7.latticeConstants
            r0 = r4[r0]
        L_0x0048:
            if (r3 == 0) goto L_0x009d
            if (r0 != 0) goto L_0x004d
            goto L_0x009d
        L_0x004d:
            r4 = 6
            if (r9 == r4) goto L_0x0051
            return r5
        L_0x0051:
            com.android.dx.rop.cst.CstInteger r3 = (com.android.p023dx.rop.cst.CstInteger) r3
            int r9 = r3.getValue()
            com.android.dx.rop.cst.CstInteger r0 = (com.android.p023dx.rop.cst.CstInteger) r0
            int r0 = r0.getValue()
            switch(r1) {
                case 14: goto L_0x0094;
                case 15: goto L_0x0089;
                case 16: goto L_0x0086;
                case 17: goto L_0x007f;
                case 18: goto L_0x007a;
                case 19: goto L_0x0060;
                case 20: goto L_0x0077;
                case 21: goto L_0x0074;
                case 22: goto L_0x0071;
                case 23: goto L_0x006e;
                case 24: goto L_0x006b;
                case 25: goto L_0x0068;
                default: goto L_0x0060;
            }
        L_0x0060:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Unexpected op"
            r8.<init>(r9)
            throw r8
        L_0x0068:
            int r8 = r9 >>> r0
            goto L_0x0096
        L_0x006b:
            int r8 = r9 >> r0
            goto L_0x0096
        L_0x006e:
            int r8 = r9 << r0
            goto L_0x0096
        L_0x0071:
            r8 = r9 ^ r0
            goto L_0x0096
        L_0x0074:
            r8 = r9 | r0
            goto L_0x0096
        L_0x0077:
            r8 = r9 & r0
            goto L_0x0096
        L_0x007a:
            if (r0 != 0) goto L_0x007d
            goto L_0x0081
        L_0x007d:
            int r9 = r9 % r0
            goto L_0x0095
        L_0x007f:
            if (r0 != 0) goto L_0x0084
        L_0x0081:
            r8 = 0
            r2 = 1
            goto L_0x0096
        L_0x0084:
            int r9 = r9 / r0
            goto L_0x0095
        L_0x0086:
            int r9 = r9 * r0
            goto L_0x0095
        L_0x0089:
            int r8 = r8.size()
            if (r8 != r6) goto L_0x0092
            int r0 = r0 - r9
            r8 = r0
            goto L_0x0096
        L_0x0092:
            int r9 = r9 - r0
            goto L_0x0095
        L_0x0094:
            int r9 = r9 + r0
        L_0x0095:
            r8 = r9
        L_0x0096:
            if (r2 == 0) goto L_0x0099
            goto L_0x009d
        L_0x0099:
            com.android.dx.rop.cst.CstInteger r5 = com.android.p023dx.rop.cst.CstInteger.make(r8)
        L_0x009d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.ssa.SCCP.simulateMath(com.android.dx.ssa.SsaInsn, int):com.android.dx.rop.cst.Constant");
    }

    private void simulatePhi(PhiInsn phiInsn) {
        int reg = phiInsn.getResult().getReg();
        int i = 2;
        if (this.latticeValues[reg] != 2) {
            RegisterSpecList sources = phiInsn.getSources();
            Constant constant = null;
            int size = sources.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= size) {
                    i = i3;
                    break;
                }
                int predBlockIndexForSourcesIndex = phiInsn.predBlockIndexForSourcesIndex(i2);
                int reg2 = sources.get(i2).getReg();
                int i4 = this.latticeValues[reg2];
                if (this.executableBlocks.get(predBlockIndexForSourcesIndex)) {
                    if (i4 != 1) {
                        i = i4;
                        break;
                    } else if (constant == null) {
                        constant = this.latticeConstants[reg2];
                        i3 = 1;
                    } else if (!this.latticeConstants[reg2].equals(constant)) {
                        break;
                    }
                }
                i2++;
            }
            if (setLatticeValueTo(reg, i, constant)) {
                addUsersToWorklist(reg, i);
            }
        }
    }

    private void simulatePhiBlock(SsaBasicBlock ssaBasicBlock) {
        Iterator<SsaInsn> it = ssaBasicBlock.getInsns().iterator();
        while (it.hasNext()) {
            SsaInsn next = it.next();
            if (next instanceof PhiInsn) {
                simulatePhi((PhiInsn) next);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r6 == null) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void simulateStmt(com.android.p023dx.ssa.SsaInsn r9) {
        /*
            r8 = this;
            com.android.dx.rop.code.Insn r0 = r9.getOriginalRopInsn()
            com.android.dx.rop.code.Rop r1 = r0.getOpcode()
            int r1 = r1.getBranchingness()
            r2 = 1
            if (r1 != r2) goto L_0x0019
            com.android.dx.rop.code.Rop r1 = r0.getOpcode()
            boolean r1 = r1.isCallLike()
            if (r1 == 0) goto L_0x001c
        L_0x0019:
            r8.simulateBranch(r9)
        L_0x001c:
            com.android.dx.rop.code.Rop r1 = r9.getOpcode()
            int r1 = r1.getOpcode()
            com.android.dx.rop.code.RegisterSpec r3 = r9.getResult()
            r4 = 0
            if (r3 != 0) goto L_0x004b
            r3 = 17
            if (r1 == r3) goto L_0x0035
            r3 = 18
            if (r1 != r3) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            return
        L_0x0035:
            com.android.dx.ssa.SsaBasicBlock r3 = r9.getBlock()
            com.android.dx.ssa.SsaBasicBlock r3 = r3.getPrimarySuccessor()
            java.util.ArrayList r3 = r3.getInsns()
            java.lang.Object r3 = r3.get(r4)
            com.android.dx.ssa.SsaInsn r3 = (com.android.p023dx.ssa.SsaInsn) r3
            com.android.dx.rop.code.RegisterSpec r3 = r3.getResult()
        L_0x004b:
            int r5 = r3.getReg()
            r6 = 0
            r7 = 2
            if (r1 == r7) goto L_0x0080
            r4 = 5
            if (r1 == r4) goto L_0x0079
            r0 = 56
            if (r1 == r0) goto L_0x006c
            switch(r1) {
                case 14: goto L_0x0061;
                case 15: goto L_0x0061;
                case 16: goto L_0x0061;
                case 17: goto L_0x0061;
                case 18: goto L_0x0061;
                default: goto L_0x005d;
            }
        L_0x005d:
            switch(r1) {
                case 20: goto L_0x0061;
                case 21: goto L_0x0061;
                case 22: goto L_0x0061;
                case 23: goto L_0x0061;
                case 24: goto L_0x0061;
                case 25: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x009f
        L_0x0061:
            int r0 = r3.getBasicType()
            com.android.dx.rop.cst.Constant r6 = r8.simulateMath(r9, r0)
            if (r6 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x006c:
            int[] r9 = r8.latticeValues
            r0 = r9[r5]
            if (r0 != r2) goto L_0x009f
            r2 = r9[r5]
            com.android.dx.rop.cst.Constant[] r9 = r8.latticeConstants
            r6 = r9[r5]
            goto L_0x00a0
        L_0x0079:
            com.android.dx.rop.code.CstInsn r0 = (com.android.p023dx.rop.code.CstInsn) r0
            com.android.dx.rop.cst.Constant r6 = r0.getConstant()
            goto L_0x00a0
        L_0x0080:
            com.android.dx.rop.code.RegisterSpecList r0 = r9.getSources()
            int r0 = r0.size()
            if (r0 != r2) goto L_0x009f
            com.android.dx.rop.code.RegisterSpecList r9 = r9.getSources()
            com.android.dx.rop.code.RegisterSpec r9 = r9.get(r4)
            int r9 = r9.getReg()
            int[] r0 = r8.latticeValues
            r2 = r0[r9]
            com.android.dx.rop.cst.Constant[] r0 = r8.latticeConstants
            r6 = r0[r9]
            goto L_0x00a0
        L_0x009f:
            r2 = 2
        L_0x00a0:
            boolean r9 = r8.setLatticeValueTo(r5, r2, r6)
            if (r9 == 0) goto L_0x00a9
            r8.addUsersToWorklist(r5, r2)
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.ssa.SCCP.simulateStmt(com.android.dx.ssa.SsaInsn):void");
    }
}
