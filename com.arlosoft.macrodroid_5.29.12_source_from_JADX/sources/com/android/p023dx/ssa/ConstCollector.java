package com.android.p023dx.ssa;

import com.android.p023dx.rop.code.LocalItem;
import com.android.p023dx.rop.code.PlainCstInsn;
import com.android.p023dx.rop.code.PlainInsn;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.Rop;
import com.android.p023dx.rop.code.Rops;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.rop.code.ThrowingCstInsn;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.TypedConstant;
import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.TypeBearer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.android.dx.ssa.ConstCollector */
public class ConstCollector {
    private static boolean COLLECT_ONE_LOCAL = false;
    private static boolean COLLECT_STRINGS = false;
    private static final int MAX_COLLECTED_CONSTANTS = 5;
    /* access modifiers changed from: private */
    public final SsaMethod ssaMeth;

    private ConstCollector(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
    }

    private void fixLocalAssignment(RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        for (SsaInsn next : this.ssaMeth.getUseListForRegister(registerSpec.getReg())) {
            RegisterSpec localAssignment = next.getLocalAssignment();
            if (!(localAssignment == null || next.getResult() == null)) {
                LocalItem localItem = localAssignment.getLocalItem();
                next.setResultLocal((LocalItem) null);
                registerSpec2 = registerSpec2.withLocalItem(localItem);
                SsaInsn makeFromRop = SsaInsn.makeFromRop(new PlainInsn(Rops.opMarkLocal(registerSpec2), SourcePosition.NO_INFO, (RegisterSpec) null, RegisterSpecList.make(registerSpec2)), next.getBlock());
                ArrayList<SsaInsn> insns = next.getBlock().getInsns();
                insns.add(insns.indexOf(next) + 1, makeFromRop);
            }
        }
    }

    private ArrayList<TypedConstant> getConstsSortedByCountUse() {
        int regCount = this.ssaMeth.getRegCount();
        final HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < regCount; i++) {
            SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
            if (!(definitionForRegister == null || definitionForRegister.getOpcode() == null)) {
                RegisterSpec result = definitionForRegister.getResult();
                TypeBearer typeBearer = result.getTypeBearer();
                if (typeBearer.isConstant()) {
                    TypedConstant typedConstant = (TypedConstant) typeBearer;
                    if (definitionForRegister.getOpcode().getOpcode() == 56) {
                        ArrayList<SsaInsn> insns = this.ssaMeth.getBlocks().get(definitionForRegister.getBlock().getPredecessors().nextSetBit(0)).getInsns();
                        definitionForRegister = insns.get(insns.size() - 1);
                    }
                    if (!definitionForRegister.canThrow() || ((typedConstant instanceof CstString) && COLLECT_STRINGS && definitionForRegister.getBlock().getSuccessors().cardinality() <= 1)) {
                        if (this.ssaMeth.isRegALocal(result)) {
                            if (COLLECT_ONE_LOCAL && !hashSet.contains(typedConstant)) {
                                hashSet.add(typedConstant);
                            }
                        }
                        Integer num = (Integer) hashMap.get(typedConstant);
                        if (num == null) {
                            hashMap.put(typedConstant, 1);
                        } else {
                            hashMap.put(typedConstant, Integer.valueOf(num.intValue() + 1));
                        }
                    }
                }
            }
        }
        ArrayList<TypedConstant> arrayList = new ArrayList<>();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > 1) {
                arrayList.add(entry.getKey());
            }
        }
        Collections.sort(arrayList, new Comparator<Constant>() {
            public boolean equals(Object obj) {
                return obj == this;
            }

            public int compare(Constant constant, Constant constant2) {
                int intValue = ((Integer) hashMap.get(constant2)).intValue() - ((Integer) hashMap.get(constant)).intValue();
                return intValue == 0 ? constant.compareTo(constant2) : intValue;
            }
        });
        return arrayList;
    }

    public static void process(SsaMethod ssaMethod) {
        new ConstCollector(ssaMethod).run();
    }

    private void run() {
        int i;
        ArrayList<TypedConstant> arrayList;
        SsaBasicBlock ssaBasicBlock;
        int regCount = this.ssaMeth.getRegCount();
        ArrayList<TypedConstant> constsSortedByCountUse = getConstsSortedByCountUse();
        int min = Math.min(constsSortedByCountUse.size(), 5);
        SsaBasicBlock entryBlock = this.ssaMeth.getEntryBlock();
        HashMap hashMap = new HashMap(min);
        int i2 = 0;
        while (i2 < min) {
            TypedConstant typedConstant = constsSortedByCountUse.get(i2);
            RegisterSpec make = RegisterSpec.make(this.ssaMeth.makeNewSsaReg(), typedConstant);
            Rop opConst = Rops.opConst(typedConstant);
            if (opConst.getBranchingness() == 1) {
                entryBlock.addInsnToHead(new PlainCstInsn(Rops.opConst(typedConstant), SourcePosition.NO_INFO, make, RegisterSpecList.EMPTY, typedConstant));
                arrayList = constsSortedByCountUse;
                i = min;
                ssaBasicBlock = entryBlock;
            } else {
                SsaBasicBlock entryBlock2 = this.ssaMeth.getEntryBlock();
                SsaBasicBlock primarySuccessor = entryBlock2.getPrimarySuccessor();
                SsaBasicBlock insertNewSuccessor = entryBlock2.insertNewSuccessor(primarySuccessor);
                SourcePosition sourcePosition = SourcePosition.NO_INFO;
                RegisterSpecList registerSpecList = RegisterSpecList.EMPTY;
                arrayList = constsSortedByCountUse;
                i = min;
                ThrowingCstInsn throwingCstInsn = r8;
                ssaBasicBlock = entryBlock;
                SsaBasicBlock ssaBasicBlock2 = insertNewSuccessor;
                ThrowingCstInsn throwingCstInsn2 = new ThrowingCstInsn(opConst, sourcePosition, registerSpecList, StdTypeList.EMPTY, typedConstant);
                ssaBasicBlock2.replaceLastInsn(throwingCstInsn);
                ssaBasicBlock2.insertNewSuccessor(primarySuccessor).addInsnToHead(new PlainInsn(Rops.opMoveResultPseudo(make.getTypeBearer()), sourcePosition, make, registerSpecList));
            }
            hashMap.put(typedConstant, make);
            i2++;
            entryBlock = ssaBasicBlock;
            constsSortedByCountUse = arrayList;
            min = i;
        }
        updateConstUses(hashMap, regCount);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        r3 = (com.android.p023dx.rop.cst.TypedConstant) r3;
        r5 = r9.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateConstUses(java.util.HashMap<com.android.p023dx.rop.cst.TypedConstant, com.android.p023dx.rop.code.RegisterSpec> r9, int r10) {
        /*
            r8 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.android.dx.ssa.SsaMethod r1 = r8.ssaMeth
            java.util.ArrayList[] r1 = r1.getUseListCopy()
            r2 = 0
        L_0x000c:
            if (r2 >= r10) goto L_0x008f
            com.android.dx.ssa.SsaMethod r3 = r8.ssaMeth
            com.android.dx.ssa.SsaInsn r3 = r3.getDefinitionForRegister(r2)
            if (r3 != 0) goto L_0x0018
            goto L_0x008b
        L_0x0018:
            com.android.dx.rop.code.RegisterSpec r4 = r3.getResult()
            com.android.dx.rop.code.RegisterSpec r3 = r3.getResult()
            com.android.dx.rop.type.TypeBearer r3 = r3.getTypeBearer()
            boolean r5 = r3.isConstant()
            if (r5 != 0) goto L_0x002b
            goto L_0x008b
        L_0x002b:
            com.android.dx.rop.cst.TypedConstant r3 = (com.android.p023dx.rop.cst.TypedConstant) r3
            java.lang.Object r5 = r9.get(r3)
            com.android.dx.rop.code.RegisterSpec r5 = (com.android.p023dx.rop.code.RegisterSpec) r5
            if (r5 != 0) goto L_0x0036
            goto L_0x008b
        L_0x0036:
            com.android.dx.ssa.SsaMethod r6 = r8.ssaMeth
            boolean r6 = r6.isRegALocal(r4)
            if (r6 == 0) goto L_0x0056
            boolean r6 = COLLECT_ONE_LOCAL
            if (r6 != 0) goto L_0x0043
            goto L_0x008b
        L_0x0043:
            boolean r6 = r0.contains(r3)
            if (r6 == 0) goto L_0x004a
            goto L_0x008b
        L_0x004a:
            r0.add(r3)
            java.lang.Object r3 = r9.get(r3)
            com.android.dx.rop.code.RegisterSpec r3 = (com.android.p023dx.rop.code.RegisterSpec) r3
            r8.fixLocalAssignment(r4, r3)
        L_0x0056:
            com.android.dx.ssa.ConstCollector$2 r3 = new com.android.dx.ssa.ConstCollector$2
            r3.<init>(r4, r5)
            int r4 = r4.getReg()
            r4 = r1[r4]
            java.util.Iterator r4 = r4.iterator()
        L_0x0065:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x008b
            java.lang.Object r5 = r4.next()
            com.android.dx.ssa.SsaInsn r5 = (com.android.p023dx.ssa.SsaInsn) r5
            boolean r6 = r5.canThrow()
            if (r6 == 0) goto L_0x0087
            com.android.dx.ssa.SsaBasicBlock r6 = r5.getBlock()
            java.util.BitSet r6 = r6.getSuccessors()
            int r6 = r6.cardinality()
            r7 = 1
            if (r6 <= r7) goto L_0x0087
            goto L_0x0065
        L_0x0087:
            r5.mapSourceRegisters(r3)
            goto L_0x0065
        L_0x008b:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.ssa.ConstCollector.updateConstUses(java.util.HashMap, int):void");
    }
}
