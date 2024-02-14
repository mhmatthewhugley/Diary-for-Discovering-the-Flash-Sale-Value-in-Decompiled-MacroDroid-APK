package com.android.p023dx.ssa;

import com.android.p023dx.rop.code.Exceptions;
import com.android.p023dx.rop.code.FillArrayDataInsn;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstLiteralBits;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.cst.TypedConstant;
import com.android.p023dx.rop.cst.Zeroes;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeBearer;
import com.android.p023dx.ssa.SsaBasicBlock;
import com.android.p023dx.ssa.SsaInsn;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.android.dx.ssa.EscapeAnalysis */
public class EscapeAnalysis {
    private ArrayList<EscapeSet> latticeValues = new ArrayList<>();
    private int regCount;
    /* access modifiers changed from: private */
    public SsaMethod ssaMeth;

    /* renamed from: com.android.dx.ssa.EscapeAnalysis$EscapeSet */
    static class EscapeSet {
        ArrayList<EscapeSet> childSets = new ArrayList<>();
        EscapeState escape;
        ArrayList<EscapeSet> parentSets = new ArrayList<>();
        BitSet regSet;
        boolean replaceableArray = false;

        EscapeSet(int i, int i2, EscapeState escapeState) {
            BitSet bitSet = new BitSet(i2);
            this.regSet = bitSet;
            bitSet.set(i);
            this.escape = escapeState;
        }
    }

    /* renamed from: com.android.dx.ssa.EscapeAnalysis$EscapeState */
    public enum EscapeState {
        TOP,
        NONE,
        METHOD,
        INTER,
        GLOBAL
    }

    private EscapeAnalysis(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
        this.regCount = ssaMethod.getRegCount();
    }

    private void addEdge(EscapeSet escapeSet, EscapeSet escapeSet2) {
        if (!escapeSet2.parentSets.contains(escapeSet)) {
            escapeSet2.parentSets.add(escapeSet);
        }
        if (!escapeSet.childSets.contains(escapeSet2)) {
            escapeSet.childSets.add(escapeSet2);
        }
    }

    private int findSetIndex(RegisterSpec registerSpec) {
        int i = 0;
        while (i < this.latticeValues.size() && !this.latticeValues.get(i).regSet.get(registerSpec.getReg())) {
            i++;
        }
        return i;
    }

    private SsaInsn getInsnForMove(SsaInsn ssaInsn) {
        ArrayList<SsaInsn> insns = this.ssaMeth.getBlocks().get(ssaInsn.getBlock().getPredecessors().nextSetBit(0)).getInsns();
        return insns.get(insns.size() - 1);
    }

    private SsaInsn getMoveForInsn(SsaInsn ssaInsn) {
        return this.ssaMeth.getBlocks().get(ssaInsn.getBlock().getSuccessors().nextSetBit(0)).getInsns().get(0);
    }

    private void insertExceptionThrow(SsaInsn ssaInsn, RegisterSpec registerSpec, HashSet<SsaInsn> hashSet) {
        HashSet<SsaInsn> hashSet2 = hashSet;
        CstType cstType = new CstType(Exceptions.TYPE_ArrayIndexOutOfBoundsException);
        RegisterSpecList registerSpecList = RegisterSpecList.EMPTY;
        insertThrowingInsnBefore(ssaInsn, registerSpecList, (RegisterSpec) null, 40, cstType);
        SsaBasicBlock block = ssaInsn.getBlock();
        SsaBasicBlock insertNewSuccessor = block.insertNewSuccessor(block.getPrimarySuccessor());
        RegisterSpec make = RegisterSpec.make(this.ssaMeth.makeNewSsaReg(), cstType);
        insertPlainInsnBefore(insertNewSuccessor.getInsns().get(0), registerSpecList, make, 56, (Constant) null);
        SsaBasicBlock insertNewSuccessor2 = insertNewSuccessor.insertNewSuccessor(insertNewSuccessor.getPrimarySuccessor());
        SsaInsn ssaInsn2 = insertNewSuccessor2.getInsns().get(0);
        RegisterSpec registerSpec2 = registerSpec;
        SsaInsn ssaInsn3 = ssaInsn2;
        insertThrowingInsnBefore(ssaInsn3, RegisterSpecList.make(make, registerSpec), (RegisterSpec) null, 52, new CstMethodRef(cstType, new CstNat(new CstString("<init>"), new CstString("(I)V"))));
        hashSet2.add(ssaInsn2);
        SsaBasicBlock insertNewSuccessor3 = insertNewSuccessor2.insertNewSuccessor(insertNewSuccessor2.getPrimarySuccessor());
        SsaInsn ssaInsn4 = insertNewSuccessor3.getInsns().get(0);
        insertThrowingInsnBefore(ssaInsn4, RegisterSpecList.make(make), (RegisterSpec) null, 35, (Constant) null);
        insertNewSuccessor3.replaceSuccessor(insertNewSuccessor3.getPrimarySuccessorIndex(), this.ssaMeth.getExitBlock().getIndex());
        hashSet2.add(ssaInsn4);
    }

    /* JADX WARNING: type inference failed for: r11v4, types: [com.android.dx.rop.code.PlainInsn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void insertPlainInsnBefore(com.android.p023dx.ssa.SsaInsn r8, com.android.p023dx.rop.code.RegisterSpecList r9, com.android.p023dx.rop.code.RegisterSpec r10, int r11, com.android.p023dx.rop.cst.Constant r12) {
        /*
            r7 = this;
            com.android.dx.rop.code.Insn r0 = r8.getOriginalRopInsn()
            r1 = 56
            if (r11 != r1) goto L_0x0011
            com.android.dx.rop.type.Type r11 = r10.getType()
            com.android.dx.rop.code.Rop r11 = com.android.p023dx.rop.code.Rops.opMoveResultPseudo(r11)
            goto L_0x0015
        L_0x0011:
            com.android.dx.rop.code.Rop r11 = com.android.p023dx.rop.code.Rops.ropFor(r11, r10, r9, r12)
        L_0x0015:
            r2 = r11
            if (r12 != 0) goto L_0x0022
            com.android.dx.rop.code.PlainInsn r11 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.SourcePosition r12 = r0.getPosition()
            r11.<init>((com.android.p023dx.rop.code.Rop) r2, (com.android.p023dx.rop.code.SourcePosition) r12, (com.android.p023dx.rop.code.RegisterSpec) r10, (com.android.p023dx.rop.code.RegisterSpecList) r9)
            goto L_0x002f
        L_0x0022:
            com.android.dx.rop.code.PlainCstInsn r11 = new com.android.dx.rop.code.PlainCstInsn
            com.android.dx.rop.code.SourcePosition r3 = r0.getPosition()
            r1 = r11
            r4 = r10
            r5 = r9
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x002f:
            com.android.dx.ssa.NormalSsaInsn r9 = new com.android.dx.ssa.NormalSsaInsn
            com.android.dx.ssa.SsaBasicBlock r10 = r8.getBlock()
            r9.<init>(r11, r10)
            com.android.dx.ssa.SsaBasicBlock r10 = r8.getBlock()
            java.util.ArrayList r10 = r10.getInsns()
            int r8 = r10.lastIndexOf(r8)
            r10.add(r8, r9)
            com.android.dx.ssa.SsaMethod r8 = r7.ssaMeth
            r8.onInsnAdded(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.ssa.EscapeAnalysis.insertPlainInsnBefore(com.android.dx.ssa.SsaInsn, com.android.dx.rop.code.RegisterSpecList, com.android.dx.rop.code.RegisterSpec, int, com.android.dx.rop.cst.Constant):void");
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [com.android.dx.rop.code.ThrowingInsn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void insertThrowingInsnBefore(com.android.p023dx.ssa.SsaInsn r8, com.android.p023dx.rop.code.RegisterSpecList r9, com.android.p023dx.rop.code.RegisterSpec r10, int r11, com.android.p023dx.rop.cst.Constant r12) {
        /*
            r7 = this;
            com.android.dx.rop.code.Insn r0 = r8.getOriginalRopInsn()
            com.android.dx.rop.code.Rop r2 = com.android.p023dx.rop.code.Rops.ropFor(r11, r10, r9, r12)
            if (r12 != 0) goto L_0x0016
            com.android.dx.rop.code.ThrowingInsn r10 = new com.android.dx.rop.code.ThrowingInsn
            com.android.dx.rop.code.SourcePosition r11 = r0.getPosition()
            com.android.dx.rop.type.StdTypeList r12 = com.android.p023dx.rop.type.StdTypeList.EMPTY
            r10.<init>(r2, r11, r9, r12)
            goto L_0x0024
        L_0x0016:
            com.android.dx.rop.code.ThrowingCstInsn r10 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.code.SourcePosition r3 = r0.getPosition()
            com.android.dx.rop.type.StdTypeList r5 = com.android.p023dx.rop.type.StdTypeList.EMPTY
            r1 = r10
            r4 = r9
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0024:
            com.android.dx.ssa.NormalSsaInsn r9 = new com.android.dx.ssa.NormalSsaInsn
            com.android.dx.ssa.SsaBasicBlock r11 = r8.getBlock()
            r9.<init>(r10, r11)
            com.android.dx.ssa.SsaBasicBlock r10 = r8.getBlock()
            java.util.ArrayList r10 = r10.getInsns()
            int r8 = r10.lastIndexOf(r8)
            r10.add(r8, r9)
            com.android.dx.ssa.SsaMethod r8 = r7.ssaMeth
            r8.onInsnAdded(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.ssa.EscapeAnalysis.insertThrowingInsnBefore(com.android.dx.ssa.SsaInsn, com.android.dx.rop.code.RegisterSpecList, com.android.dx.rop.code.RegisterSpec, int, com.android.dx.rop.cst.Constant):void");
    }

    private void movePropagate() {
        for (int i = 0; i < this.ssaMeth.getRegCount(); i++) {
            SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
            if (!(definitionForRegister == null || definitionForRegister.getOpcode() == null || definitionForRegister.getOpcode().getOpcode() != 2)) {
                ArrayList[] useListCopy = this.ssaMeth.getUseListCopy();
                final RegisterSpec registerSpec = definitionForRegister.getSources().get(0);
                final RegisterSpec result = definitionForRegister.getResult();
                if (registerSpec.getReg() >= this.regCount || result.getReg() >= this.regCount) {
                    C16011 r5 = new RegisterMapper() {
                        public int getNewRegisterCount() {
                            return EscapeAnalysis.this.ssaMeth.getRegCount();
                        }

                        public RegisterSpec map(RegisterSpec registerSpec) {
                            return registerSpec.getReg() == result.getReg() ? registerSpec : registerSpec;
                        }
                    };
                    Iterator it = useListCopy[result.getReg()].iterator();
                    while (it.hasNext()) {
                        ((SsaInsn) it.next()).mapSourceRegisters(r5);
                    }
                }
            }
        }
    }

    public static void process(SsaMethod ssaMethod) {
        new EscapeAnalysis(ssaMethod).run();
    }

    /* access modifiers changed from: private */
    public void processInsn(SsaInsn ssaInsn) {
        int opcode = ssaInsn.getOpcode().getOpcode();
        RegisterSpec result = ssaInsn.getResult();
        if (opcode == 56 && result.getTypeBearer().getBasicType() == 9) {
            processRegister(result, processMoveResultPseudoInsn(ssaInsn));
        } else if (opcode == 3 && result.getTypeBearer().getBasicType() == 9) {
            EscapeSet escapeSet = new EscapeSet(result.getReg(), this.regCount, EscapeState.NONE);
            this.latticeValues.add(escapeSet);
            processRegister(result, escapeSet);
        } else if (opcode == 55 && result.getTypeBearer().getBasicType() == 9) {
            EscapeSet escapeSet2 = new EscapeSet(result.getReg(), this.regCount, EscapeState.NONE);
            this.latticeValues.add(escapeSet2);
            processRegister(result, escapeSet2);
        }
    }

    private EscapeSet processMoveResultPseudoInsn(SsaInsn ssaInsn) {
        EscapeSet escapeSet;
        RegisterSpec result = ssaInsn.getResult();
        SsaInsn insnForMove = getInsnForMove(ssaInsn);
        int opcode = insnForMove.getOpcode().getOpcode();
        if (opcode != 5) {
            if (!(opcode == 38 || opcode == 45)) {
                if (opcode != 46) {
                    switch (opcode) {
                        case 40:
                            break;
                        case 41:
                        case 42:
                            if (!insnForMove.getSources().get(0).getTypeBearer().isConstant()) {
                                escapeSet = new EscapeSet(result.getReg(), this.regCount, EscapeState.GLOBAL);
                                break;
                            } else {
                                escapeSet = new EscapeSet(result.getReg(), this.regCount, EscapeState.NONE);
                                escapeSet.replaceableArray = true;
                                break;
                            }
                        case 43:
                            break;
                        default:
                            return null;
                    }
                } else {
                    escapeSet = new EscapeSet(result.getReg(), this.regCount, EscapeState.GLOBAL);
                }
                this.latticeValues.add(escapeSet);
                return escapeSet;
            }
            RegisterSpec registerSpec = insnForMove.getSources().get(0);
            int findSetIndex = findSetIndex(registerSpec);
            if (findSetIndex != this.latticeValues.size()) {
                EscapeSet escapeSet2 = this.latticeValues.get(findSetIndex);
                escapeSet2.regSet.set(result.getReg());
                return escapeSet2;
            }
            if (registerSpec.getType() == Type.KNOWN_NULL) {
                escapeSet = new EscapeSet(result.getReg(), this.regCount, EscapeState.NONE);
            } else {
                escapeSet = new EscapeSet(result.getReg(), this.regCount, EscapeState.GLOBAL);
            }
            this.latticeValues.add(escapeSet);
            return escapeSet;
        }
        escapeSet = new EscapeSet(result.getReg(), this.regCount, EscapeState.NONE);
        this.latticeValues.add(escapeSet);
        return escapeSet;
    }

    private void processPhiUse(SsaInsn ssaInsn, EscapeSet escapeSet, ArrayList<RegisterSpec> arrayList) {
        int findSetIndex = findSetIndex(ssaInsn.getResult());
        if (findSetIndex != this.latticeValues.size()) {
            EscapeSet escapeSet2 = this.latticeValues.get(findSetIndex);
            if (escapeSet2 != escapeSet) {
                escapeSet.replaceableArray = false;
                escapeSet.regSet.or(escapeSet2.regSet);
                if (escapeSet.escape.compareTo(escapeSet2.escape) < 0) {
                    escapeSet.escape = escapeSet2.escape;
                }
                replaceNode(escapeSet, escapeSet2);
                this.latticeValues.remove(findSetIndex);
                return;
            }
            return;
        }
        escapeSet.regSet.set(ssaInsn.getResult().getReg());
        arrayList.add(ssaInsn.getResult());
    }

    private void processRegister(RegisterSpec registerSpec, EscapeSet escapeSet) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(registerSpec);
        while (!arrayList.isEmpty()) {
            RegisterSpec registerSpec2 = (RegisterSpec) arrayList.remove(arrayList.size() - 1);
            for (SsaInsn next : this.ssaMeth.getUseListForRegister(registerSpec2.getReg())) {
                if (next.getOpcode() == null) {
                    processPhiUse(next, escapeSet, arrayList);
                } else {
                    processUse(registerSpec2, next, escapeSet, arrayList);
                }
            }
        }
    }

    private void processUse(RegisterSpec registerSpec, SsaInsn ssaInsn, EscapeSet escapeSet, ArrayList<RegisterSpec> arrayList) {
        int opcode = ssaInsn.getOpcode().getOpcode();
        if (opcode != 2) {
            if (!(opcode == 33 || opcode == 35)) {
                if (opcode == 43 || opcode == 7 || opcode == 8) {
                    EscapeState escapeState = escapeSet.escape;
                    EscapeState escapeState2 = EscapeState.METHOD;
                    if (escapeState.compareTo(escapeState2) < 0) {
                        escapeSet.escape = escapeState2;
                        return;
                    }
                    return;
                } else if (opcode != 38) {
                    if (opcode != 39) {
                        switch (opcode) {
                            case 47:
                                break;
                            case 48:
                                escapeSet.escape = EscapeState.GLOBAL;
                                return;
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                                break;
                            default:
                                return;
                        }
                    } else if (!ssaInsn.getSources().get(2).getTypeBearer().isConstant()) {
                        escapeSet.replaceableArray = false;
                    }
                    if (ssaInsn.getSources().get(0).getTypeBearer().getBasicType() == 9) {
                        escapeSet.replaceableArray = false;
                        RegisterSpecList sources = ssaInsn.getSources();
                        if (sources.get(0).getReg() == registerSpec.getReg()) {
                            int findSetIndex = findSetIndex(sources.get(1));
                            if (findSetIndex != this.latticeValues.size()) {
                                EscapeSet escapeSet2 = this.latticeValues.get(findSetIndex);
                                addEdge(escapeSet2, escapeSet);
                                if (escapeSet.escape.compareTo(escapeSet2.escape) < 0) {
                                    escapeSet.escape = escapeSet2.escape;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        int findSetIndex2 = findSetIndex(sources.get(0));
                        if (findSetIndex2 != this.latticeValues.size()) {
                            EscapeSet escapeSet3 = this.latticeValues.get(findSetIndex2);
                            addEdge(escapeSet, escapeSet3);
                            if (escapeSet3.escape.compareTo(escapeSet.escape) < 0) {
                                escapeSet3.escape = escapeSet.escape;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!ssaInsn.getSources().get(1).getTypeBearer().isConstant()) {
                    escapeSet.replaceableArray = false;
                    return;
                } else {
                    return;
                }
            }
            escapeSet.escape = EscapeState.INTER;
            return;
        }
        escapeSet.regSet.set(ssaInsn.getResult().getReg());
        arrayList.add(ssaInsn.getResult());
    }

    private void replaceDef(SsaInsn ssaInsn, SsaInsn ssaInsn2, int i, ArrayList<RegisterSpec> arrayList) {
        Type type = ssaInsn.getResult().getType();
        for (int i2 = 0; i2 < i; i2++) {
            Constant zeroFor = Zeroes.zeroFor(type.getComponentType());
            RegisterSpec make = RegisterSpec.make(this.ssaMeth.makeNewSsaReg(), (TypedConstant) zeroFor);
            arrayList.add(make);
            insertPlainInsnBefore(ssaInsn, RegisterSpecList.EMPTY, make, 5, zeroFor);
        }
    }

    private void replaceNode(EscapeSet escapeSet, EscapeSet escapeSet2) {
        Iterator<EscapeSet> it = escapeSet2.parentSets.iterator();
        while (it.hasNext()) {
            EscapeSet next = it.next();
            next.childSets.remove(escapeSet2);
            next.childSets.add(escapeSet);
            escapeSet.parentSets.add(next);
        }
        Iterator<EscapeSet> it2 = escapeSet2.childSets.iterator();
        while (it2.hasNext()) {
            EscapeSet next2 = it2.next();
            next2.parentSets.remove(escapeSet2);
            next2.parentSets.add(escapeSet);
            escapeSet.childSets.add(next2);
        }
    }

    private void replaceUse(SsaInsn ssaInsn, SsaInsn ssaInsn2, ArrayList<RegisterSpec> arrayList, HashSet<SsaInsn> hashSet) {
        int size = arrayList.size();
        int opcode = ssaInsn.getOpcode().getOpcode();
        if (opcode == 34) {
            TypeBearer typeBearer = ssaInsn2.getSources().get(0).getTypeBearer();
            SsaInsn moveForInsn = getMoveForInsn(ssaInsn);
            insertPlainInsnBefore(moveForInsn, RegisterSpecList.EMPTY, moveForInsn.getResult(), 5, (Constant) typeBearer);
            hashSet.add(moveForInsn);
        } else if (opcode == 57) {
            ArrayList<Constant> initValues = ((FillArrayDataInsn) ssaInsn.getOriginalRopInsn()).getInitValues();
            for (int i = 0; i < size; i++) {
                RegisterSpec make = RegisterSpec.make(arrayList.get(i).getReg(), (TypeBearer) initValues.get(i));
                insertPlainInsnBefore(ssaInsn, RegisterSpecList.EMPTY, make, 5, initValues.get(i));
                arrayList.set(i, make);
            }
        } else if (opcode == 38) {
            SsaInsn moveForInsn2 = getMoveForInsn(ssaInsn);
            RegisterSpecList sources = ssaInsn.getSources();
            int intBits = ((CstLiteralBits) sources.get(1).getTypeBearer()).getIntBits();
            if (intBits < size) {
                RegisterSpec registerSpec = arrayList.get(intBits);
                SsaInsn ssaInsn3 = moveForInsn2;
                insertPlainInsnBefore(ssaInsn3, RegisterSpecList.make(registerSpec), registerSpec.withReg(moveForInsn2.getResult().getReg()), 2, (Constant) null);
            } else {
                insertExceptionThrow(moveForInsn2, sources.get(1), hashSet);
                hashSet.add(moveForInsn2.getBlock().getInsns().get(2));
            }
            hashSet.add(moveForInsn2);
        } else if (opcode == 39) {
            RegisterSpecList sources2 = ssaInsn.getSources();
            int intBits2 = ((CstLiteralBits) sources2.get(2).getTypeBearer()).getIntBits();
            if (intBits2 < size) {
                RegisterSpec registerSpec2 = sources2.get(0);
                RegisterSpec withReg = registerSpec2.withReg(arrayList.get(intBits2).getReg());
                insertPlainInsnBefore(ssaInsn, RegisterSpecList.make(registerSpec2), withReg, 2, (Constant) null);
                arrayList.set(intBits2, withReg.withSimpleType());
                return;
            }
            insertExceptionThrow(ssaInsn, sources2.get(2), hashSet);
        }
    }

    private void run() {
        this.ssaMeth.forEachBlockDepthFirstDom(new SsaBasicBlock.Visitor() {
            public void visitBlock(SsaBasicBlock ssaBasicBlock, SsaBasicBlock ssaBasicBlock2) {
                ssaBasicBlock.forEachInsn(new SsaInsn.Visitor() {
                    public void visitMoveInsn(NormalSsaInsn normalSsaInsn) {
                    }

                    public void visitNonMoveInsn(NormalSsaInsn normalSsaInsn) {
                        EscapeAnalysis.this.processInsn(normalSsaInsn);
                    }

                    public void visitPhiInsn(PhiInsn phiInsn) {
                    }
                });
            }
        });
        Iterator<EscapeSet> it = this.latticeValues.iterator();
        while (it.hasNext()) {
            EscapeSet next = it.next();
            if (next.escape != EscapeState.NONE) {
                Iterator<EscapeSet> it2 = next.childSets.iterator();
                while (it2.hasNext()) {
                    EscapeSet next2 = it2.next();
                    if (next.escape.compareTo(next2.escape) > 0) {
                        next2.escape = next.escape;
                    }
                }
            }
        }
        scalarReplacement();
    }

    private void scalarReplacement() {
        Iterator<EscapeSet> it = this.latticeValues.iterator();
        while (it.hasNext()) {
            EscapeSet next = it.next();
            if (next.replaceableArray && next.escape == EscapeState.NONE) {
                int nextSetBit = next.regSet.nextSetBit(0);
                SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(nextSetBit);
                SsaInsn insnForMove = getInsnForMove(definitionForRegister);
                int intBits = ((CstLiteralBits) insnForMove.getSources().get(0).getTypeBearer()).getIntBits();
                ArrayList arrayList = new ArrayList(intBits);
                HashSet hashSet = new HashSet();
                replaceDef(definitionForRegister, insnForMove, intBits, arrayList);
                hashSet.add(insnForMove);
                hashSet.add(definitionForRegister);
                for (SsaInsn next2 : this.ssaMeth.getUseListForRegister(nextSetBit)) {
                    replaceUse(next2, insnForMove, arrayList, hashSet);
                    hashSet.add(next2);
                }
                this.ssaMeth.deleteInsns(hashSet);
                this.ssaMeth.onInsnsChanged();
                SsaConverter.updateSsaMethod(this.ssaMeth, this.regCount);
                movePropagate();
            }
        }
    }
}
