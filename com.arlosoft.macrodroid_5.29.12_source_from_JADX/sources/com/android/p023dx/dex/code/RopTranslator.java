package com.android.p023dx.dex.code;

import com.android.p023dx.dex.DexOptions;
import com.android.p023dx.rop.code.BasicBlock;
import com.android.p023dx.rop.code.BasicBlockList;
import com.android.p023dx.rop.code.FillArrayDataInsn;
import com.android.p023dx.rop.code.Insn;
import com.android.p023dx.rop.code.LocalVariableInfo;
import com.android.p023dx.rop.code.PlainCstInsn;
import com.android.p023dx.rop.code.PlainInsn;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.Rop;
import com.android.p023dx.rop.code.RopMethod;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.rop.code.SwitchInsn;
import com.android.p023dx.rop.code.ThrowingCstInsn;
import com.android.p023dx.rop.code.ThrowingInsn;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstInteger;
import com.android.p023dx.util.Bits;
import com.android.p023dx.util.IntList;
import java.util.ArrayList;

/* renamed from: com.android.dx.dex.code.RopTranslator */
public final class RopTranslator {
    /* access modifiers changed from: private */
    public final BlockAddresses addresses;
    private final DexOptions dexOptions;
    private final LocalVariableInfo locals;
    /* access modifiers changed from: private */
    public final RopMethod method;
    private int[] order = null;
    private final OutputCollector output;
    /* access modifiers changed from: private */
    public final int paramSize;
    /* access modifiers changed from: private */
    public boolean paramsAreInOrder;
    private final int positionInfo;
    /* access modifiers changed from: private */
    public final int regCount;
    private final TranslationVisitor translationVisitor;

    /* renamed from: com.android.dx.dex.code.RopTranslator$LocalVariableAwareTranslationVisitor */
    private class LocalVariableAwareTranslationVisitor extends TranslationVisitor {
        private LocalVariableInfo locals;

        public LocalVariableAwareTranslationVisitor(OutputCollector outputCollector, LocalVariableInfo localVariableInfo) {
            super(outputCollector);
            this.locals = localVariableInfo;
        }

        public void addIntroductionIfNecessary(Insn insn) {
            RegisterSpec assignment = this.locals.getAssignment(insn);
            if (assignment != null) {
                addOutput(new LocalStart(insn.getPosition(), assignment));
            }
        }

        public void visitPlainCstInsn(PlainCstInsn plainCstInsn) {
            super.visitPlainCstInsn(plainCstInsn);
            addIntroductionIfNecessary(plainCstInsn);
        }

        public void visitPlainInsn(PlainInsn plainInsn) {
            super.visitPlainInsn(plainInsn);
            addIntroductionIfNecessary(plainInsn);
        }

        public void visitSwitchInsn(SwitchInsn switchInsn) {
            super.visitSwitchInsn(switchInsn);
            addIntroductionIfNecessary(switchInsn);
        }

        public void visitThrowingCstInsn(ThrowingCstInsn throwingCstInsn) {
            super.visitThrowingCstInsn(throwingCstInsn);
            addIntroductionIfNecessary(throwingCstInsn);
        }

        public void visitThrowingInsn(ThrowingInsn throwingInsn) {
            super.visitThrowingInsn(throwingInsn);
            addIntroductionIfNecessary(throwingInsn);
        }
    }

    /* renamed from: com.android.dx.dex.code.RopTranslator$TranslationVisitor */
    private class TranslationVisitor implements Insn.Visitor {
        private BasicBlock block;
        private CodeAddress lastAddress;
        private final OutputCollector output;

        public TranslationVisitor(OutputCollector outputCollector) {
            this.output = outputCollector;
        }

        private RegisterSpec getNextMoveResultPseudo() {
            int primarySuccessor = this.block.getPrimarySuccessor();
            if (primarySuccessor < 0) {
                return null;
            }
            Insn insn = RopTranslator.this.method.getBlocks().labelToBlock(primarySuccessor).getInsns().get(0);
            if (insn.getOpcode().getOpcode() != 56) {
                return null;
            }
            return insn.getResult();
        }

        /* access modifiers changed from: protected */
        public void addOutput(DalvInsn dalvInsn) {
            this.output.add(dalvInsn);
        }

        /* access modifiers changed from: protected */
        public void addOutputSuffix(DalvInsn dalvInsn) {
            this.output.addSuffix(dalvInsn);
        }

        public void setBlock(BasicBlock basicBlock, CodeAddress codeAddress) {
            this.block = basicBlock;
            this.lastAddress = codeAddress;
        }

        public void visitFillArrayDataInsn(FillArrayDataInsn fillArrayDataInsn) {
            SourcePosition position = fillArrayDataInsn.getPosition();
            Constant constant = fillArrayDataInsn.getConstant();
            ArrayList<Constant> initValues = fillArrayDataInsn.getInitValues();
            if (fillArrayDataInsn.getOpcode().getBranchingness() == 1) {
                CodeAddress codeAddress = new CodeAddress(position);
                ArrayData arrayData = new ArrayData(position, this.lastAddress, initValues, constant);
                TargetInsn targetInsn = new TargetInsn(Dops.FILL_ARRAY_DATA, position, RopTranslator.getRegs(fillArrayDataInsn), codeAddress);
                addOutput(this.lastAddress);
                addOutput(targetInsn);
                addOutputSuffix(new OddSpacer(position));
                addOutputSuffix(codeAddress);
                addOutputSuffix(arrayData);
                return;
            }
            throw new RuntimeException("shouldn't happen");
        }

        public void visitPlainCstInsn(PlainCstInsn plainCstInsn) {
            SourcePosition position = plainCstInsn.getPosition();
            Dop dopFor = RopToDop.dopFor(plainCstInsn);
            Rop opcode = plainCstInsn.getOpcode();
            int opcode2 = opcode.getOpcode();
            if (opcode.getBranchingness() != 1) {
                throw new RuntimeException("shouldn't happen");
            } else if (opcode2 != 3) {
                addOutput(new CstInsn(dopFor, position, RopTranslator.getRegs(plainCstInsn), plainCstInsn.getConstant()));
            } else if (!RopTranslator.this.paramsAreInOrder) {
                RegisterSpec result = plainCstInsn.getResult();
                addOutput(new SimpleInsn(dopFor, position, RegisterSpecList.make(result, RegisterSpec.make((RopTranslator.this.regCount - RopTranslator.this.paramSize) + ((CstInteger) plainCstInsn.getConstant()).getValue(), result.getType()))));
            }
        }

        public void visitPlainInsn(PlainInsn plainInsn) {
            DalvInsn dalvInsn;
            Rop opcode = plainInsn.getOpcode();
            if (opcode.getOpcode() != 54 && opcode.getOpcode() != 56) {
                SourcePosition position = plainInsn.getPosition();
                Dop dopFor = RopToDop.dopFor(plainInsn);
                int branchingness = opcode.getBranchingness();
                if (!(branchingness == 1 || branchingness == 2)) {
                    if (branchingness == 3) {
                        return;
                    }
                    if (branchingness == 4) {
                        dalvInsn = new TargetInsn(dopFor, position, RopTranslator.getRegs(plainInsn), RopTranslator.this.addresses.getStart(this.block.getSuccessors().get(1)));
                        addOutput(dalvInsn);
                    } else if (branchingness != 6) {
                        throw new RuntimeException("shouldn't happen");
                    }
                }
                dalvInsn = new SimpleInsn(dopFor, position, RopTranslator.getRegs(plainInsn));
                addOutput(dalvInsn);
            }
        }

        public void visitSwitchInsn(SwitchInsn switchInsn) {
            SourcePosition position = switchInsn.getPosition();
            IntList cases = switchInsn.getCases();
            IntList successors = this.block.getSuccessors();
            int size = cases.size();
            int size2 = successors.size();
            int primarySuccessor = this.block.getPrimarySuccessor();
            if (size == size2 - 1 && primarySuccessor == successors.get(size)) {
                CodeAddress[] codeAddressArr = new CodeAddress[size];
                for (int i = 0; i < size; i++) {
                    codeAddressArr[i] = RopTranslator.this.addresses.getStart(successors.get(i));
                }
                CodeAddress codeAddress = new CodeAddress(position);
                CodeAddress codeAddress2 = new CodeAddress(this.lastAddress.getPosition(), true);
                SwitchData switchData = new SwitchData(position, codeAddress2, cases, codeAddressArr);
                TargetInsn targetInsn = new TargetInsn(switchData.isPacked() ? Dops.PACKED_SWITCH : Dops.SPARSE_SWITCH, position, RopTranslator.getRegs(switchInsn), codeAddress);
                addOutput(codeAddress2);
                addOutput(targetInsn);
                addOutputSuffix(new OddSpacer(position));
                addOutputSuffix(codeAddress);
                addOutputSuffix(switchData);
                return;
            }
            throw new RuntimeException("shouldn't happen");
        }

        public void visitThrowingCstInsn(ThrowingCstInsn throwingCstInsn) {
            DalvInsn dalvInsn;
            SourcePosition position = throwingCstInsn.getPosition();
            Dop dopFor = RopToDop.dopFor(throwingCstInsn);
            Rop opcode = throwingCstInsn.getOpcode();
            Constant constant = throwingCstInsn.getConstant();
            if (opcode.getBranchingness() == 6) {
                addOutput(this.lastAddress);
                if (opcode.isCallLike()) {
                    addOutput(new CstInsn(dopFor, position, throwingCstInsn.getSources(), constant));
                    return;
                }
                RegisterSpec nextMoveResultPseudo = getNextMoveResultPseudo();
                RegisterSpecList access$600 = RopTranslator.getRegs(throwingCstInsn, nextMoveResultPseudo);
                boolean z = false;
                boolean z2 = dopFor.hasResult() || opcode.getOpcode() == 43;
                if (nextMoveResultPseudo != null) {
                    z = true;
                }
                if (z2 == z) {
                    if (opcode.getOpcode() != 41 || dopFor.getOpcode() == 35) {
                        dalvInsn = new CstInsn(dopFor, position, access$600, constant);
                    } else {
                        dalvInsn = new SimpleInsn(dopFor, position, access$600);
                    }
                    addOutput(dalvInsn);
                    return;
                }
                throw new RuntimeException("Insn with result/move-result-pseudo mismatch " + throwingCstInsn);
            }
            throw new RuntimeException("shouldn't happen");
        }

        public void visitThrowingInsn(ThrowingInsn throwingInsn) {
            SourcePosition position = throwingInsn.getPosition();
            Dop dopFor = RopToDop.dopFor(throwingInsn);
            if (throwingInsn.getOpcode().getBranchingness() == 6) {
                RegisterSpec nextMoveResultPseudo = getNextMoveResultPseudo();
                if (dopFor.hasResult() == (nextMoveResultPseudo != null)) {
                    addOutput(this.lastAddress);
                    addOutput(new SimpleInsn(dopFor, position, RopTranslator.getRegs(throwingInsn, nextMoveResultPseudo)));
                    return;
                }
                throw new RuntimeException("Insn with result/move-result-pseudo mismatch" + throwingInsn);
            }
            throw new RuntimeException("shouldn't happen");
        }
    }

    private RopTranslator(RopMethod ropMethod, int i, LocalVariableInfo localVariableInfo, int i2, DexOptions dexOptions2) {
        this.dexOptions = dexOptions2;
        this.method = ropMethod;
        this.positionInfo = i;
        this.locals = localVariableInfo;
        this.addresses = new BlockAddresses(ropMethod);
        this.paramSize = i2;
        this.paramsAreInOrder = calculateParamsAreInOrder(ropMethod, i2);
        BasicBlockList blocks = ropMethod.getBlocks();
        int size = blocks.size();
        int i3 = size * 3;
        int instructionCount = blocks.getInstructionCount() + i3;
        int assignmentCount = localVariableInfo != null ? instructionCount + size + localVariableInfo.getAssignmentCount() : instructionCount;
        int regCount2 = blocks.getRegCount() + (this.paramsAreInOrder ? 0 : i2);
        this.regCount = regCount2;
        OutputCollector outputCollector = new OutputCollector(dexOptions2, assignmentCount, i3, regCount2, i2);
        this.output = outputCollector;
        if (localVariableInfo != null) {
            this.translationVisitor = new LocalVariableAwareTranslationVisitor(outputCollector, localVariableInfo);
        } else {
            this.translationVisitor = new TranslationVisitor(outputCollector);
        }
    }

    private static boolean calculateParamsAreInOrder(RopMethod ropMethod, final int i) {
        final boolean[] zArr = {true};
        final int regCount2 = ropMethod.getBlocks().getRegCount();
        ropMethod.getBlocks().forEachInsn(new Insn.BaseVisitor() {
            public void visitPlainCstInsn(PlainCstInsn plainCstInsn) {
                if (plainCstInsn.getOpcode().getOpcode() == 3) {
                    int value = ((CstInteger) plainCstInsn.getConstant()).getValue();
                    boolean[] zArr = zArr;
                    zArr[0] = zArr[0] && (regCount2 - i) + value == plainCstInsn.getResult().getReg();
                }
            }
        });
        return zArr[0];
    }

    /* access modifiers changed from: private */
    public static RegisterSpecList getRegs(Insn insn) {
        return getRegs(insn, insn.getResult());
    }

    private void outputBlock(BasicBlock basicBlock, int i) {
        CodeAddress start = this.addresses.getStart(basicBlock);
        this.output.add(start);
        LocalVariableInfo localVariableInfo = this.locals;
        if (localVariableInfo != null) {
            this.output.add(new LocalSnapshot(start.getPosition(), localVariableInfo.getStarts(basicBlock)));
        }
        this.translationVisitor.setBlock(basicBlock, this.addresses.getLast(basicBlock));
        basicBlock.getInsns().forEach(this.translationVisitor);
        this.output.add(this.addresses.getEnd(basicBlock));
        int primarySuccessor = basicBlock.getPrimarySuccessor();
        Insn lastInsn = basicBlock.getLastInsn();
        if (primarySuccessor >= 0 && primarySuccessor != i) {
            if (lastInsn.getOpcode().getBranchingness() == 4 && basicBlock.getSecondarySuccessor() == i) {
                this.output.reverseBranch(1, this.addresses.getStart(primarySuccessor));
                return;
            }
            this.output.add(new TargetInsn(Dops.GOTO, lastInsn.getPosition(), RegisterSpecList.EMPTY, this.addresses.getStart(primarySuccessor)));
        }
    }

    private void outputInstructions() {
        BasicBlockList blocks = this.method.getBlocks();
        int[] iArr = this.order;
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            outputBlock(blocks.labelToBlock(iArr[i]), i2 == iArr.length ? -1 : iArr[i2]);
            i = i2;
        }
    }

    private void pickOrder() {
        int i;
        BasicBlockList blocks = this.method.getBlocks();
        int size = blocks.size();
        int maxLabel = blocks.getMaxLabel();
        int[] makeBitSet = Bits.makeBitSet(maxLabel);
        int[] makeBitSet2 = Bits.makeBitSet(maxLabel);
        for (int i2 = 0; i2 < size; i2++) {
            Bits.set(makeBitSet, blocks.get(i2).getLabel());
        }
        int[] iArr = new int[size];
        int firstLabel = this.method.getFirstLabel();
        int i3 = 0;
        while (firstLabel != -1) {
            while (true) {
                IntList labelToPredecessors = this.method.labelToPredecessors(i);
                int size2 = labelToPredecessors.size();
                int i4 = 0;
                while (i4 < size2) {
                    int i5 = labelToPredecessors.get(i4);
                    if (Bits.get(makeBitSet2, i5)) {
                        break;
                    } else if (Bits.get(makeBitSet, i5) && blocks.labelToBlock(i5).getPrimarySuccessor() == i) {
                        Bits.set(makeBitSet2, i5);
                        firstLabel = i5;
                    } else {
                        i4++;
                    }
                }
                break;
            }
            while (i != -1) {
                Bits.clear(makeBitSet, i);
                Bits.clear(makeBitSet2, i);
                iArr[i3] = i;
                i3++;
                BasicBlock labelToBlock = blocks.labelToBlock(i);
                BasicBlock preferredSuccessorOf = blocks.preferredSuccessorOf(labelToBlock);
                if (preferredSuccessorOf == null) {
                    break;
                }
                int label = preferredSuccessorOf.getLabel();
                int primarySuccessor = labelToBlock.getPrimarySuccessor();
                if (Bits.get(makeBitSet, label)) {
                    i = label;
                } else if (primarySuccessor == label || primarySuccessor < 0 || !Bits.get(makeBitSet, primarySuccessor)) {
                    IntList successors = labelToBlock.getSuccessors();
                    int size3 = successors.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size3) {
                            i = -1;
                            break;
                        }
                        int i7 = successors.get(i6);
                        if (Bits.get(makeBitSet, i7)) {
                            i = i7;
                            break;
                        }
                        i6++;
                    }
                } else {
                    i = primarySuccessor;
                }
            }
            firstLabel = Bits.findFirst(makeBitSet, 0);
        }
        if (i3 == size) {
            this.order = iArr;
            return;
        }
        throw new RuntimeException("shouldn't happen");
    }

    public static DalvCode translate(RopMethod ropMethod, int i, LocalVariableInfo localVariableInfo, int i2, DexOptions dexOptions2) {
        return new RopTranslator(ropMethod, i, localVariableInfo, i2, dexOptions2).translateAndGetResult();
    }

    private DalvCode translateAndGetResult() {
        pickOrder();
        outputInstructions();
        return new DalvCode(this.positionInfo, this.output.getFinisher(), new StdCatchBuilder(this.method, this.order, this.addresses));
    }

    /* access modifiers changed from: private */
    public static RegisterSpecList getRegs(Insn insn, RegisterSpec registerSpec) {
        RegisterSpecList sources = insn.getSources();
        if (insn.getOpcode().isCommutative() && sources.size() == 2 && registerSpec.getReg() == sources.get(1).getReg()) {
            sources = RegisterSpecList.make(sources.get(1), sources.get(0));
        }
        if (registerSpec == null) {
            return sources;
        }
        return sources.withFirst(registerSpec);
    }
}
