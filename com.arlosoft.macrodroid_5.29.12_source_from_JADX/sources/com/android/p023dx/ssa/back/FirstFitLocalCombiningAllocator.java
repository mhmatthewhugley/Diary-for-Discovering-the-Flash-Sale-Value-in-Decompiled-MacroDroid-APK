package com.android.p023dx.ssa.back;

import com.android.p023dx.rop.code.CstInsn;
import com.android.p023dx.rop.code.LocalItem;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.Rop;
import com.android.p023dx.rop.cst.CstInteger;
import com.android.p023dx.ssa.InterferenceRegisterMapper;
import com.android.p023dx.ssa.NormalSsaInsn;
import com.android.p023dx.ssa.Optimizer;
import com.android.p023dx.ssa.PhiInsn;
import com.android.p023dx.ssa.RegisterMapper;
import com.android.p023dx.ssa.SsaInsn;
import com.android.p023dx.ssa.SsaMethod;
import com.android.p023dx.util.IntIterator;
import com.android.p023dx.util.IntSet;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.android.dx.ssa.back.FirstFitLocalCombiningAllocator */
public class FirstFitLocalCombiningAllocator extends RegisterAllocator {
    private static final boolean DEBUG = false;
    /* access modifiers changed from: private */
    public final ArrayList<NormalSsaInsn> invokeRangeInsns = new ArrayList<>();
    /* access modifiers changed from: private */
    public final Map<LocalItem, ArrayList<RegisterSpec>> localVariables = new TreeMap();
    private final InterferenceRegisterMapper mapper;
    private final boolean minimizeRegisters;
    /* access modifiers changed from: private */
    public final ArrayList<NormalSsaInsn> moveResultPseudoInsns = new ArrayList<>();
    private final int paramRangeEnd;
    /* access modifiers changed from: private */
    public final ArrayList<PhiInsn> phiInsns = new ArrayList<>();
    private final BitSet reservedRopRegs;
    private final BitSet ssaRegsMapped;
    private final BitSet usedRopRegs;

    /* renamed from: com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment */
    private enum Alignment {
        EVEN {
            /* access modifiers changed from: package-private */
            public int nextClearBit(BitSet bitSet, int i) {
                int nextClearBit = bitSet.nextClearBit(i);
                while (!FirstFitLocalCombiningAllocator.isEven(nextClearBit)) {
                    nextClearBit = bitSet.nextClearBit(nextClearBit + 1);
                }
                return nextClearBit;
            }
        },
        ODD {
            /* access modifiers changed from: package-private */
            public int nextClearBit(BitSet bitSet, int i) {
                int nextClearBit = bitSet.nextClearBit(i);
                while (FirstFitLocalCombiningAllocator.isEven(nextClearBit)) {
                    nextClearBit = bitSet.nextClearBit(nextClearBit + 1);
                }
                return nextClearBit;
            }
        },
        UNSPECIFIED {
            /* access modifiers changed from: package-private */
            public int nextClearBit(BitSet bitSet, int i) {
                return bitSet.nextClearBit(i);
            }
        };

        /* access modifiers changed from: package-private */
        public abstract int nextClearBit(BitSet bitSet, int i);
    }

    /* renamed from: com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Multiset */
    private static class Multiset {
        private final int[] count;
        private final int[] reg;
        private int size = 0;

        public Multiset(int i) {
            this.reg = new int[i];
            this.count = new int[i];
        }

        public void add(int i) {
            int i2 = 0;
            while (true) {
                int i3 = this.size;
                if (i2 >= i3) {
                    this.reg[i3] = i;
                    this.count[i3] = 1;
                    this.size = i3 + 1;
                    return;
                } else if (this.reg[i2] == i) {
                    int[] iArr = this.count;
                    iArr[i2] = iArr[i2] + 1;
                    return;
                } else {
                    i2++;
                }
            }
        }

        public int getAndRemoveHighestCount() {
            int i = -1;
            int i2 = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < this.size; i4++) {
                int[] iArr = this.count;
                if (i3 < iArr[i4]) {
                    int i5 = this.reg[i4];
                    i3 = iArr[i4];
                    i2 = i5;
                    i = i4;
                }
            }
            this.count[i] = 0;
            return i2;
        }

        public int getSize() {
            return this.size;
        }
    }

    public FirstFitLocalCombiningAllocator(SsaMethod ssaMethod, InterferenceGraph interferenceGraph, boolean z) {
        super(ssaMethod, interferenceGraph);
        this.ssaRegsMapped = new BitSet(ssaMethod.getRegCount());
        this.mapper = new InterferenceRegisterMapper(interferenceGraph, ssaMethod.getRegCount());
        this.minimizeRegisters = z;
        int paramWidth = ssaMethod.getParamWidth();
        this.paramRangeEnd = paramWidth;
        BitSet bitSet = new BitSet(paramWidth * 2);
        this.reservedRopRegs = bitSet;
        bitSet.set(0, paramWidth);
        this.usedRopRegs = new BitSet(paramWidth * 2);
    }

    private void addMapping(RegisterSpec registerSpec, int i) {
        int reg = registerSpec.getReg();
        if (this.ssaRegsMapped.get(reg) || !canMapReg(registerSpec, i)) {
            throw new RuntimeException("attempt to add invalid register mapping");
        }
        int category = registerSpec.getCategory();
        this.mapper.addMapping(registerSpec.getReg(), i, category);
        this.ssaRegsMapped.set(reg);
        this.usedRopRegs.set(i, category + i);
    }

    private void adjustAndMapSourceRangeRange(NormalSsaInsn normalSsaInsn) {
        int findRangeAndAdjust = findRangeAndAdjust(normalSsaInsn);
        RegisterSpecList sources = normalSsaInsn.getSources();
        int size = sources.size();
        int i = 0;
        while (i < size) {
            RegisterSpec registerSpec = sources.get(i);
            int reg = registerSpec.getReg();
            int category = registerSpec.getCategory();
            int i2 = findRangeAndAdjust + category;
            if (!this.ssaRegsMapped.get(reg)) {
                LocalItem localItemForReg = getLocalItemForReg(reg);
                addMapping(registerSpec, findRangeAndAdjust);
                if (localItemForReg != null) {
                    markReserved(findRangeAndAdjust, category);
                    ArrayList arrayList = this.localVariables.get(localItemForReg);
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        RegisterSpec registerSpec2 = (RegisterSpec) arrayList.get(i3);
                        if (-1 == sources.indexOfRegister(registerSpec2.getReg())) {
                            tryMapReg(registerSpec2, findRangeAndAdjust, category);
                        }
                    }
                }
            }
            i++;
            findRangeAndAdjust = i2;
        }
    }

    private void analyzeInstructions() {
        this.ssaMeth.forEachInsn(new SsaInsn.Visitor() {
            private void processInsn(SsaInsn ssaInsn) {
                RegisterSpec localAssignment = ssaInsn.getLocalAssignment();
                if (localAssignment != null) {
                    LocalItem localItem = localAssignment.getLocalItem();
                    ArrayList arrayList = (ArrayList) FirstFitLocalCombiningAllocator.this.localVariables.get(localItem);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        FirstFitLocalCombiningAllocator.this.localVariables.put(localItem, arrayList);
                    }
                    arrayList.add(localAssignment);
                }
                if (ssaInsn instanceof NormalSsaInsn) {
                    if (ssaInsn.getOpcode().getOpcode() == 56) {
                        FirstFitLocalCombiningAllocator.this.moveResultPseudoInsns.add((NormalSsaInsn) ssaInsn);
                    } else if (Optimizer.getAdvice().requiresSourcesInOrder(ssaInsn.getOriginalRopInsn().getOpcode(), ssaInsn.getSources())) {
                        FirstFitLocalCombiningAllocator.this.invokeRangeInsns.add((NormalSsaInsn) ssaInsn);
                    }
                } else if (ssaInsn instanceof PhiInsn) {
                    FirstFitLocalCombiningAllocator.this.phiInsns.add((PhiInsn) ssaInsn);
                }
            }

            public void visitMoveInsn(NormalSsaInsn normalSsaInsn) {
                processInsn(normalSsaInsn);
            }

            public void visitNonMoveInsn(NormalSsaInsn normalSsaInsn) {
                processInsn(normalSsaInsn);
            }

            public void visitPhiInsn(PhiInsn phiInsn) {
                processInsn(phiInsn);
            }
        });
    }

    private boolean canMapReg(RegisterSpec registerSpec, int i) {
        return !spansParamRange(i, registerSpec.getCategory()) && !this.mapper.interferes(registerSpec, i);
    }

    private boolean canMapRegs(ArrayList<RegisterSpec> arrayList, int i) {
        Iterator<RegisterSpec> it = arrayList.iterator();
        while (it.hasNext()) {
            RegisterSpec next = it.next();
            if (!this.ssaRegsMapped.get(next.getReg()) && !canMapReg(next, i)) {
                return false;
            }
        }
        return true;
    }

    private int findAnyFittingRange(NormalSsaInsn normalSsaInsn, int i, int[] iArr, BitSet bitSet) {
        Alignment alignment = Alignment.UNSPECIFIED;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            if (i5 == 2) {
                if (isEven(i4)) {
                    i3++;
                } else {
                    i2++;
                }
                i4 += 2;
            } else {
                i4++;
            }
        }
        if (i2 > i3) {
            if (isEven(this.paramRangeEnd)) {
                alignment = Alignment.ODD;
            } else {
                alignment = Alignment.EVEN;
            }
        } else if (i3 > 0) {
            if (isEven(this.paramRangeEnd)) {
                alignment = Alignment.EVEN;
            } else {
                alignment = Alignment.ODD;
            }
        }
        int i6 = this.paramRangeEnd;
        while (true) {
            int findNextUnreservedRopReg = findNextUnreservedRopReg(i6, i, alignment);
            if (fitPlanForRange(findNextUnreservedRopReg, normalSsaInsn, iArr, bitSet) >= 0) {
                return findNextUnreservedRopReg;
            }
            i6 = findNextUnreservedRopReg + 1;
            bitSet.clear();
        }
    }

    private int findNextUnreservedRopReg(int i, int i2) {
        return findNextUnreservedRopReg(i, i2, getAlignment(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        r14 = new java.util.BitSet(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int findRangeAndAdjust(com.android.p023dx.ssa.NormalSsaInsn r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.android.dx.rop.code.RegisterSpecList r2 = r18.getSources()
            int r3 = r2.size()
            int[] r4 = new int[r3]
            r6 = 0
            r7 = 0
        L_0x0010:
            if (r6 >= r3) goto L_0x0022
            com.android.dx.rop.code.RegisterSpec r8 = r2.get(r6)
            int r8 = r8.getCategory()
            r4[r6] = r8
            r8 = r4[r6]
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x0010
        L_0x0022:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 0
            r9 = -1
            r10 = 0
            r11 = 0
            r12 = -1
        L_0x0029:
            if (r10 >= r3) goto L_0x0070
            com.android.dx.rop.code.RegisterSpec r13 = r2.get(r10)
            int r13 = r13.getReg()
            if (r10 == 0) goto L_0x003a
            int r14 = r10 + -1
            r14 = r4[r14]
            int r11 = r11 - r14
        L_0x003a:
            java.util.BitSet r14 = r0.ssaRegsMapped
            boolean r14 = r14.get(r13)
            if (r14 != 0) goto L_0x0043
            goto L_0x006d
        L_0x0043:
            com.android.dx.ssa.InterferenceRegisterMapper r14 = r0.mapper
            int r13 = r14.oldToNew(r13)
            int r13 = r13 + r11
            if (r13 < 0) goto L_0x006d
            boolean r14 = r0.spansParamRange(r13, r7)
            if (r14 == 0) goto L_0x0053
            goto L_0x006d
        L_0x0053:
            java.util.BitSet r14 = new java.util.BitSet
            r14.<init>(r3)
            int r15 = r0.fitPlanForRange(r13, r1, r4, r14)
            if (r15 >= 0) goto L_0x005f
            goto L_0x006d
        L_0x005f:
            int r16 = r14.cardinality()
            int r5 = r15 - r16
            if (r5 <= r6) goto L_0x006a
            r6 = r5
            r12 = r13
            r8 = r14
        L_0x006a:
            if (r15 != r7) goto L_0x006d
            goto L_0x0070
        L_0x006d:
            int r10 = r10 + 1
            goto L_0x0029
        L_0x0070:
            if (r12 != r9) goto L_0x007b
            java.util.BitSet r8 = new java.util.BitSet
            r8.<init>(r3)
            int r12 = r0.findAnyFittingRange(r1, r7, r4, r8)
        L_0x007b:
            r3 = 0
            int r3 = r8.nextSetBit(r3)
        L_0x0080:
            if (r3 < 0) goto L_0x0094
            com.android.dx.rop.code.RegisterSpec r4 = r2.get(r3)
            com.android.dx.rop.code.RegisterSpec r4 = r0.insertMoveBefore(r1, r4)
            r1.changeOneSource(r3, r4)
            int r3 = r3 + 1
            int r3 = r8.nextSetBit(r3)
            goto L_0x0080
        L_0x0094:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.ssa.back.FirstFitLocalCombiningAllocator.findRangeAndAdjust(com.android.dx.ssa.NormalSsaInsn):int");
    }

    private int findRopRegForLocal(int i, int i2) {
        Alignment alignment = getAlignment(i2);
        int nextClearBit = alignment.nextClearBit(this.usedRopRegs, i);
        while (true) {
            int i3 = 1;
            while (i3 < i2 && !this.usedRopRegs.get(nextClearBit + i3)) {
                i3++;
            }
            if (i3 == i2) {
                return nextClearBit;
            }
            nextClearBit = alignment.nextClearBit(this.usedRopRegs, nextClearBit + i3);
        }
    }

    private int fitPlanForRange(int i, NormalSsaInsn normalSsaInsn, int[] iArr, BitSet bitSet) {
        RegisterSpecList sources = normalSsaInsn.getSources();
        int size = sources.size();
        RegisterSpecList ssaSetToSpecs = ssaSetToSpecs(normalSsaInsn.getBlock().getLiveOutRegs());
        BitSet bitSet2 = new BitSet(this.ssaMeth.getRegCount());
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RegisterSpec registerSpec = sources.get(i3);
            int reg = registerSpec.getReg();
            int i4 = iArr[i3];
            if (i3 != 0) {
                i += iArr[i3 - 1];
            }
            if (!this.ssaRegsMapped.get(reg) || this.mapper.oldToNew(reg) != i) {
                if (!rangeContainsReserved(i, i4)) {
                    if (this.ssaRegsMapped.get(reg) || !canMapReg(registerSpec, i) || bitSet2.get(reg)) {
                        if (!this.mapper.areAnyPinned(ssaSetToSpecs, i, i4) && !this.mapper.areAnyPinned(sources, i, i4)) {
                            bitSet.set(i3);
                            bitSet2.set(reg);
                        }
                    }
                }
                return -1;
            }
            i2 += i4;
            bitSet2.set(reg);
        }
        return i2;
    }

    private Alignment getAlignment(int i) {
        Alignment alignment = Alignment.UNSPECIFIED;
        if (i != 2) {
            return alignment;
        }
        if (isEven(this.paramRangeEnd)) {
            return Alignment.EVEN;
        }
        return Alignment.ODD;
    }

    private LocalItem getLocalItemForReg(int i) {
        for (Map.Entry next : this.localVariables.entrySet()) {
            Iterator it = ((ArrayList) next.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((RegisterSpec) it.next()).getReg() == i) {
                        return (LocalItem) next.getKey();
                    }
                }
            }
        }
        return null;
    }

    private int getParameterIndexForReg(int i) {
        Rop opcode;
        SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
        if (definitionForRegister == null || (opcode = definitionForRegister.getOpcode()) == null || opcode.getOpcode() != 3) {
            return -1;
        }
        return ((CstInteger) ((CstInsn) definitionForRegister.getOriginalRopInsn()).getConstant()).getValue();
    }

    private void handleCheckCastResults() {
        Iterator<NormalSsaInsn> it = this.moveResultPseudoInsns.iterator();
        while (it.hasNext()) {
            NormalSsaInsn next = it.next();
            RegisterSpec result = next.getResult();
            int reg = result.getReg();
            BitSet predecessors = next.getBlock().getPredecessors();
            boolean z = true;
            if (predecessors.cardinality() == 1) {
                ArrayList<SsaInsn> insns = this.ssaMeth.getBlocks().get(predecessors.nextSetBit(0)).getInsns();
                SsaInsn ssaInsn = insns.get(insns.size() - 1);
                if (ssaInsn.getOpcode().getOpcode() == 43) {
                    RegisterSpec registerSpec = ssaInsn.getSources().get(0);
                    int reg2 = registerSpec.getReg();
                    int category = registerSpec.getCategory();
                    boolean z2 = this.ssaRegsMapped.get(reg);
                    boolean z3 = this.ssaRegsMapped.get(reg2);
                    if ((!z3) && z2) {
                        z3 = tryMapReg(registerSpec, this.mapper.oldToNew(reg), category);
                    }
                    if ((!z2) && z3) {
                        z2 = tryMapReg(result, this.mapper.oldToNew(reg2), category);
                    }
                    if (!z2 || !z3) {
                        int findNextUnreservedRopReg = findNextUnreservedRopReg(this.paramRangeEnd, category);
                        ArrayList arrayList = new ArrayList(2);
                        arrayList.add(result);
                        arrayList.add(registerSpec);
                        while (!tryMapRegs(arrayList, findNextUnreservedRopReg, category, false)) {
                            findNextUnreservedRopReg = findNextUnreservedRopReg(findNextUnreservedRopReg + 1, category);
                        }
                    }
                    if (ssaInsn.getOriginalRopInsn().getCatches().size() == 0) {
                        z = false;
                    }
                    int oldToNew = this.mapper.oldToNew(reg);
                    if (oldToNew != this.mapper.oldToNew(reg2) && !z) {
                        ((NormalSsaInsn) ssaInsn).changeOneSource(0, insertMoveBefore(ssaInsn, registerSpec));
                        addMapping(ssaInsn.getSources().get(0), oldToNew);
                    }
                }
            }
        }
    }

    private void handleInvokeRangeInsns() {
        Iterator<NormalSsaInsn> it = this.invokeRangeInsns.iterator();
        while (it.hasNext()) {
            adjustAndMapSourceRangeRange(it.next());
        }
    }

    private void handleLocalAssociatedOther() {
        for (ArrayList next : this.localVariables.values()) {
            int i = this.paramRangeEnd;
            boolean z = false;
            do {
                int size = next.size();
                int i2 = 1;
                for (int i3 = 0; i3 < size; i3++) {
                    RegisterSpec registerSpec = (RegisterSpec) next.get(i3);
                    int category = registerSpec.getCategory();
                    if (!this.ssaRegsMapped.get(registerSpec.getReg()) && category > i2) {
                        i2 = category;
                    }
                }
                int findRopRegForLocal = findRopRegForLocal(i, i2);
                if (canMapRegs(next, findRopRegForLocal)) {
                    z = tryMapRegs(next, findRopRegForLocal, i2, true);
                }
                i = findRopRegForLocal + 1;
            } while (!z);
        }
    }

    private void handleLocalAssociatedParams() {
        for (ArrayList next : this.localVariables.values()) {
            int size = next.size();
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                RegisterSpec registerSpec = (RegisterSpec) next.get(i3);
                int parameterIndexForReg = getParameterIndexForReg(registerSpec.getReg());
                if (parameterIndexForReg >= 0) {
                    i2 = registerSpec.getCategory();
                    addMapping(registerSpec, parameterIndexForReg);
                    i = parameterIndexForReg;
                    break;
                }
                i3++;
                i = parameterIndexForReg;
            }
            if (i >= 0) {
                tryMapRegs(next, i, i2, true);
            }
        }
    }

    private void handleNormalUnassociated() {
        RegisterSpec definitionSpecForSsaReg;
        int regCount = this.ssaMeth.getRegCount();
        for (int i = 0; i < regCount; i++) {
            if (!this.ssaRegsMapped.get(i) && (definitionSpecForSsaReg = getDefinitionSpecForSsaReg(i)) != null) {
                int category = definitionSpecForSsaReg.getCategory();
                int findNextUnreservedRopReg = findNextUnreservedRopReg(this.paramRangeEnd, category);
                while (!canMapReg(definitionSpecForSsaReg, findNextUnreservedRopReg)) {
                    findNextUnreservedRopReg = findNextUnreservedRopReg(findNextUnreservedRopReg + 1, category);
                }
                addMapping(definitionSpecForSsaReg, findNextUnreservedRopReg);
            }
        }
    }

    private void handlePhiInsns() {
        Iterator<PhiInsn> it = this.phiInsns.iterator();
        while (it.hasNext()) {
            processPhiInsn(it.next());
        }
    }

    private void handleUnassociatedParameters() {
        int regCount = this.ssaMeth.getRegCount();
        for (int i = 0; i < regCount; i++) {
            if (!this.ssaRegsMapped.get(i)) {
                int parameterIndexForReg = getParameterIndexForReg(i);
                RegisterSpec definitionSpecForSsaReg = getDefinitionSpecForSsaReg(i);
                if (parameterIndexForReg >= 0) {
                    addMapping(definitionSpecForSsaReg, parameterIndexForReg);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static boolean isEven(int i) {
        return (i & 1) == 0;
    }

    private boolean isThisPointerReg(int i) {
        return i == 0 && !this.ssaMeth.isStatic();
    }

    private void markReserved(int i, int i2) {
        this.reservedRopRegs.set(i, i2 + i, true);
    }

    private void printLocalVars() {
        System.out.println("Printing local vars");
        for (Map.Entry next : this.localVariables.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append('{');
            sb.append(' ');
            Iterator it = ((ArrayList) next.getValue()).iterator();
            while (it.hasNext()) {
                sb.append('v');
                sb.append(((RegisterSpec) it.next()).getReg());
                sb.append(' ');
            }
            sb.append('}');
            System.out.printf("Local: %s Registers: %s\n", new Object[]{next.getKey(), sb});
        }
    }

    private void processPhiInsn(PhiInsn phiInsn) {
        RegisterSpec result = phiInsn.getResult();
        int reg = result.getReg();
        int category = result.getCategory();
        RegisterSpecList sources = phiInsn.getSources();
        int size = sources.size();
        ArrayList arrayList = new ArrayList();
        Multiset multiset = new Multiset(size + 1);
        if (this.ssaRegsMapped.get(reg)) {
            multiset.add(this.mapper.oldToNew(reg));
        } else {
            arrayList.add(result);
        }
        for (int i = 0; i < size; i++) {
            RegisterSpec result2 = this.ssaMeth.getDefinitionForRegister(sources.get(i).getReg()).getResult();
            int reg2 = result2.getReg();
            if (this.ssaRegsMapped.get(reg2)) {
                multiset.add(this.mapper.oldToNew(reg2));
            } else {
                arrayList.add(result2);
            }
        }
        for (int i2 = 0; i2 < multiset.getSize(); i2++) {
            tryMapRegs(arrayList, multiset.getAndRemoveHighestCount(), category, false);
        }
        int findNextUnreservedRopReg = findNextUnreservedRopReg(this.paramRangeEnd, category);
        while (!tryMapRegs(arrayList, findNextUnreservedRopReg, category, false)) {
            findNextUnreservedRopReg = findNextUnreservedRopReg(findNextUnreservedRopReg + 1, category);
        }
    }

    private boolean rangeContainsReserved(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (this.reservedRopRegs.get(i3)) {
                return true;
            }
        }
        return false;
    }

    private boolean spansParamRange(int i, int i2) {
        int i3 = this.paramRangeEnd;
        return i < i3 && i + i2 > i3;
    }

    private boolean tryMapReg(RegisterSpec registerSpec, int i, int i2) {
        if (registerSpec.getCategory() > i2 || this.ssaRegsMapped.get(registerSpec.getReg()) || !canMapReg(registerSpec, i)) {
            return false;
        }
        addMapping(registerSpec, i);
        return true;
    }

    private boolean tryMapRegs(ArrayList<RegisterSpec> arrayList, int i, int i2, boolean z) {
        Iterator<RegisterSpec> it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            RegisterSpec next = it.next();
            if (!this.ssaRegsMapped.get(next.getReg())) {
                boolean tryMapReg = tryMapReg(next, i, i2);
                z2 = !tryMapReg || z2;
                if (tryMapReg && z) {
                    markReserved(i, next.getCategory());
                }
            }
        }
        return !z2;
    }

    public RegisterMapper allocateRegisters() {
        analyzeInstructions();
        handleLocalAssociatedParams();
        handleUnassociatedParameters();
        handleInvokeRangeInsns();
        handleLocalAssociatedOther();
        handleCheckCastResults();
        handlePhiInsns();
        handleNormalUnassociated();
        return this.mapper;
    }

    /* access modifiers changed from: package-private */
    public RegisterSpecList ssaSetToSpecs(IntSet intSet) {
        RegisterSpecList registerSpecList = new RegisterSpecList(intSet.elements());
        IntIterator it = intSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            registerSpecList.set(i, getDefinitionSpecForSsaReg(it.next()));
            i++;
        }
        return registerSpecList;
    }

    public boolean wantsParamsMovedHigh() {
        return true;
    }

    private int findNextUnreservedRopReg(int i, int i2, Alignment alignment) {
        int nextClearBit = alignment.nextClearBit(this.reservedRopRegs, i);
        while (true) {
            int i3 = 1;
            while (i3 < i2 && !this.reservedRopRegs.get(nextClearBit + i3)) {
                i3++;
            }
            if (i3 == i2) {
                return nextClearBit;
            }
            nextClearBit = alignment.nextClearBit(this.reservedRopRegs, nextClearBit + i3);
        }
    }
}
