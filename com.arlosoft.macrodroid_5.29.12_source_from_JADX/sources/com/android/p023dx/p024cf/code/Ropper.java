package com.android.p023dx.p024cf.code;

import com.android.p023dx.p024cf.code.ByteCatchList;
import com.android.p023dx.p024cf.code.LocalVariableList;
import com.android.p023dx.p024cf.iface.MethodList;
import com.android.p023dx.rop.code.BasicBlock;
import com.android.p023dx.rop.code.BasicBlockList;
import com.android.p023dx.rop.code.Insn;
import com.android.p023dx.rop.code.InsnList;
import com.android.p023dx.rop.code.PlainCstInsn;
import com.android.p023dx.rop.code.PlainInsn;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.Rop;
import com.android.p023dx.rop.code.RopMethod;
import com.android.p023dx.rop.code.Rops;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.rop.code.ThrowingCstInsn;
import com.android.p023dx.rop.code.ThrowingInsn;
import com.android.p023dx.rop.code.TranslationAdvice;
import com.android.p023dx.rop.cst.CstInteger;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeList;
import com.android.p023dx.util.Bits;
import com.android.p023dx.util.Hex;
import com.android.p023dx.util.IntList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.android.dx.cf.code.Ropper */
public final class Ropper {
    private static final int PARAM_ASSIGNMENT = -1;
    private static final int RETURN = -2;
    private static final int SPECIAL_LABEL_COUNT = 7;
    private static final int SYNCH_CATCH_1 = -6;
    private static final int SYNCH_CATCH_2 = -7;
    private static final int SYNCH_RETURN = -3;
    private static final int SYNCH_SETUP_1 = -4;
    private static final int SYNCH_SETUP_2 = -5;
    private final ByteBlockList blocks;
    private final CatchInfo[] catchInfos;
    /* access modifiers changed from: private */
    public final ExceptionSetupLabelAllocator exceptionSetupLabelAllocator;
    /* access modifiers changed from: private */
    public boolean hasSubroutines;
    private final RopperMachine machine;
    /* access modifiers changed from: private */
    public final int maxLabel;
    private final int maxLocals;
    /* access modifiers changed from: private */
    public final ConcreteMethod method;
    private final ArrayList<BasicBlock> result;
    private final ArrayList<IntList> resultSubroutines;
    private final Simulator sim;
    private final Frame[] startFrames;
    private final Subroutine[] subroutines;
    private boolean synchNeedsExceptionHandler = false;

    /* renamed from: com.android.dx.cf.code.Ropper$CatchInfo */
    private class CatchInfo {
        private final Map<Type, ExceptionHandlerSetup> setups;

        private CatchInfo() {
            this.setups = new HashMap();
        }

        /* access modifiers changed from: package-private */
        public ExceptionHandlerSetup getSetup(Type type) {
            ExceptionHandlerSetup exceptionHandlerSetup = this.setups.get(type);
            if (exceptionHandlerSetup != null) {
                return exceptionHandlerSetup;
            }
            ExceptionHandlerSetup exceptionHandlerSetup2 = new ExceptionHandlerSetup(type, Ropper.this.exceptionSetupLabelAllocator.getNextLabel());
            this.setups.put(type, exceptionHandlerSetup2);
            return exceptionHandlerSetup2;
        }

        /* access modifiers changed from: package-private */
        public Collection<ExceptionHandlerSetup> getSetups() {
            return this.setups.values();
        }
    }

    /* renamed from: com.android.dx.cf.code.Ropper$ExceptionHandlerSetup */
    private static class ExceptionHandlerSetup {
        private Type caughtType;
        private int label;

        ExceptionHandlerSetup(Type type, int i) {
            this.caughtType = type;
            this.label = i;
        }

        /* access modifiers changed from: package-private */
        public Type getCaughtType() {
            return this.caughtType;
        }

        public int getLabel() {
            return this.label;
        }
    }

    /* renamed from: com.android.dx.cf.code.Ropper$ExceptionSetupLabelAllocator */
    private class ExceptionSetupLabelAllocator extends LabelAllocator {
        int maxSetupLabel;

        ExceptionSetupLabelAllocator() {
            super(Ropper.this.maxLabel);
            this.maxSetupLabel = Ropper.this.maxLabel + Ropper.this.method.getCatches().size();
        }

        /* access modifiers changed from: package-private */
        public int getNextLabel() {
            int i = this.nextAvailableLabel;
            if (i < this.maxSetupLabel) {
                this.nextAvailableLabel = i + 1;
                return i;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: com.android.dx.cf.code.Ropper$LabelAllocator */
    private static class LabelAllocator {
        int nextAvailableLabel;

        LabelAllocator(int i) {
            this.nextAvailableLabel = i;
        }

        /* access modifiers changed from: package-private */
        public int getNextLabel() {
            int i = this.nextAvailableLabel;
            this.nextAvailableLabel = i + 1;
            return i;
        }
    }

    /* renamed from: com.android.dx.cf.code.Ropper$SubroutineInliner */
    private class SubroutineInliner {
        private final LabelAllocator labelAllocator;
        private final ArrayList<IntList> labelToSubroutines;
        private final HashMap<Integer, Integer> origLabelToCopiedLabel = new HashMap<>();
        private int subroutineStart;
        private int subroutineSuccessor;
        private final BitSet workList;

        SubroutineInliner(LabelAllocator labelAllocator2, ArrayList<IntList> arrayList) {
            this.workList = new BitSet(Ropper.this.maxLabel);
            this.labelAllocator = labelAllocator2;
            this.labelToSubroutines = arrayList;
        }

        private void copyBlock(int i, int i2) {
            IntList intList;
            BasicBlock access$300 = Ropper.this.labelToBlock(i);
            IntList successors = access$300.getSuccessors();
            int i3 = -1;
            if (Ropper.this.isSubroutineCaller(access$300)) {
                intList = IntList.makeImmutable(mapOrAllocateLabel(successors.get(0)), successors.get(1));
            } else {
                Subroutine access$900 = Ropper.this.subroutineFromRetBlock(i);
                if (access$900 == null) {
                    int primarySuccessor = access$300.getPrimarySuccessor();
                    int size = successors.size();
                    IntList intList2 = new IntList(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        int i5 = successors.get(i4);
                        int mapOrAllocateLabel = mapOrAllocateLabel(i5);
                        intList2.add(mapOrAllocateLabel);
                        if (primarySuccessor == i5) {
                            i3 = mapOrAllocateLabel;
                        }
                    }
                    intList2.setImmutable();
                    intList = intList2;
                } else if (access$900.startBlock == this.subroutineStart) {
                    intList = IntList.makeImmutable(this.subroutineSuccessor);
                    i3 = this.subroutineSuccessor;
                } else {
                    throw new RuntimeException("ret instruction returns to label " + Hex.m907u2(access$900.startBlock) + " expected: " + Hex.m907u2(this.subroutineStart));
                }
            }
            Ropper ropper = Ropper.this;
            ropper.addBlock(new BasicBlock(i2, ropper.filterMoveReturnAddressInsns(access$300.getInsns()), intList, i3), this.labelToSubroutines.get(i2));
        }

        private boolean involvedInSubroutine(int i, int i2) {
            IntList intList = this.labelToSubroutines.get(i);
            return intList != null && intList.size() > 0 && intList.top() == i2;
        }

        private int mapOrAllocateLabel(int i) {
            Integer num = this.origLabelToCopiedLabel.get(Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
            if (!involvedInSubroutine(i, this.subroutineStart)) {
                return i;
            }
            int nextLabel = this.labelAllocator.getNextLabel();
            this.workList.set(i);
            this.origLabelToCopiedLabel.put(Integer.valueOf(i), Integer.valueOf(nextLabel));
            while (this.labelToSubroutines.size() <= nextLabel) {
                this.labelToSubroutines.add((Object) null);
            }
            ArrayList<IntList> arrayList = this.labelToSubroutines;
            arrayList.set(nextLabel, arrayList.get(i));
            return nextLabel;
        }

        /* access modifiers changed from: package-private */
        public void inlineSubroutineCalledFrom(BasicBlock basicBlock) {
            this.subroutineSuccessor = basicBlock.getSuccessors().get(0);
            int i = basicBlock.getSuccessors().get(1);
            this.subroutineStart = i;
            int mapOrAllocateLabel = mapOrAllocateLabel(i);
            int nextSetBit = this.workList.nextSetBit(0);
            while (nextSetBit >= 0) {
                this.workList.clear(nextSetBit);
                int intValue = this.origLabelToCopiedLabel.get(Integer.valueOf(nextSetBit)).intValue();
                copyBlock(nextSetBit, intValue);
                Ropper ropper = Ropper.this;
                if (ropper.isSubroutineCaller(ropper.labelToBlock(nextSetBit))) {
                    new SubroutineInliner(this.labelAllocator, this.labelToSubroutines).inlineSubroutineCalledFrom(Ropper.this.labelToBlock(intValue));
                }
                nextSetBit = this.workList.nextSetBit(0);
            }
            boolean unused = Ropper.this.addOrReplaceBlockNoDelete(new BasicBlock(basicBlock.getLabel(), basicBlock.getInsns(), IntList.makeImmutable(mapOrAllocateLabel), mapOrAllocateLabel), this.labelToSubroutines.get(basicBlock.getLabel()));
        }
    }

    private Ropper(ConcreteMethod concreteMethod, TranslationAdvice translationAdvice, MethodList methodList) {
        Objects.requireNonNull(concreteMethod, "method == null");
        Objects.requireNonNull(translationAdvice, "advice == null");
        this.method = concreteMethod;
        ByteBlockList identifyBlocks = BasicBlocker.identifyBlocks(concreteMethod);
        this.blocks = identifyBlocks;
        int maxLabel2 = identifyBlocks.getMaxLabel();
        this.maxLabel = maxLabel2;
        int maxLocals2 = concreteMethod.getMaxLocals();
        this.maxLocals = maxLocals2;
        RopperMachine ropperMachine = new RopperMachine(this, concreteMethod, translationAdvice, methodList);
        this.machine = ropperMachine;
        this.sim = new Simulator(ropperMachine, concreteMethod);
        Frame[] frameArr = new Frame[maxLabel2];
        this.startFrames = frameArr;
        this.subroutines = new Subroutine[maxLabel2];
        this.result = new ArrayList<>((identifyBlocks.size() * 2) + 10);
        this.resultSubroutines = new ArrayList<>((identifyBlocks.size() * 2) + 10);
        this.catchInfos = new CatchInfo[maxLabel2];
        frameArr[0] = new Frame(maxLocals2, concreteMethod.getMaxStack());
        this.exceptionSetupLabelAllocator = new ExceptionSetupLabelAllocator();
    }

    /* access modifiers changed from: private */
    public void addBlock(BasicBlock basicBlock, IntList intList) {
        Objects.requireNonNull(basicBlock, "block == null");
        this.result.add(basicBlock);
        intList.throwIfMutable();
        this.resultSubroutines.add(intList);
    }

    private void addExceptionSetupBlocks() {
        int length = this.catchInfos.length;
        for (int i = 0; i < length; i++) {
            CatchInfo catchInfo = this.catchInfos[i];
            if (catchInfo != null) {
                for (ExceptionHandlerSetup next : catchInfo.getSetups()) {
                    SourcePosition position = labelToBlock(i).getFirstInsn().getPosition();
                    InsnList insnList = new InsnList(2);
                    Rop opMoveException = Rops.opMoveException(next.getCaughtType());
                    RegisterSpec make = RegisterSpec.make(this.maxLocals, next.getCaughtType());
                    RegisterSpecList registerSpecList = RegisterSpecList.EMPTY;
                    insnList.set(0, new PlainInsn(opMoveException, position, make, registerSpecList));
                    insnList.set(1, new PlainInsn(Rops.GOTO, position, (RegisterSpec) null, registerSpecList));
                    insnList.setImmutable();
                    addBlock(new BasicBlock(next.getLabel(), insnList, IntList.makeImmutable(i), i), this.startFrames[i].getSubroutines());
                }
            }
        }
    }

    private boolean addOrReplaceBlock(BasicBlock basicBlock, IntList intList) {
        boolean z;
        Objects.requireNonNull(basicBlock, "block == null");
        int labelToResultIndex = labelToResultIndex(basicBlock.getLabel());
        if (labelToResultIndex < 0) {
            z = false;
        } else {
            removeBlockAndSpecialSuccessors(labelToResultIndex);
            z = true;
        }
        this.result.add(basicBlock);
        intList.throwIfMutable();
        this.resultSubroutines.add(intList);
        return z;
    }

    /* access modifiers changed from: private */
    public boolean addOrReplaceBlockNoDelete(BasicBlock basicBlock, IntList intList) {
        boolean z;
        Objects.requireNonNull(basicBlock, "block == null");
        int labelToResultIndex = labelToResultIndex(basicBlock.getLabel());
        if (labelToResultIndex < 0) {
            z = false;
        } else {
            this.result.remove(labelToResultIndex);
            this.resultSubroutines.remove(labelToResultIndex);
            z = true;
        }
        this.result.add(basicBlock);
        intList.throwIfMutable();
        this.resultSubroutines.add(intList);
        return z;
    }

    private void addReturnBlock() {
        RegisterSpecList registerSpecList;
        Rop returnOp = this.machine.getReturnOp();
        if (returnOp != null) {
            SourcePosition returnPosition = this.machine.getReturnPosition();
            int specialLabel = getSpecialLabel(-2);
            if (isSynchronized()) {
                InsnList insnList = new InsnList(1);
                insnList.set(0, new ThrowingInsn(Rops.MONITOR_EXIT, returnPosition, RegisterSpecList.make(getSynchReg()), StdTypeList.EMPTY));
                insnList.setImmutable();
                int specialLabel2 = getSpecialLabel(-3);
                addBlock(new BasicBlock(specialLabel, insnList, IntList.makeImmutable(specialLabel2), specialLabel2), IntList.EMPTY);
                specialLabel = specialLabel2;
            }
            InsnList insnList2 = new InsnList(1);
            TypeList sources = returnOp.getSources();
            if (sources.size() == 0) {
                registerSpecList = RegisterSpecList.EMPTY;
            } else {
                registerSpecList = RegisterSpecList.make(RegisterSpec.make(0, sources.getType(0)));
            }
            insnList2.set(0, new PlainInsn(returnOp, returnPosition, (RegisterSpec) null, registerSpecList));
            insnList2.setImmutable();
            IntList intList = IntList.EMPTY;
            addBlock(new BasicBlock(specialLabel, insnList2, intList, -1), intList);
        }
    }

    private void addSetupBlocks() {
        InsnList insnList;
        RegisterSpec registerSpec;
        LocalVariableList localVariables = this.method.getLocalVariables();
        int i = 0;
        SourcePosition makeSourcePosistion = this.method.makeSourcePosistion(0);
        StdTypeList parameterTypes = this.method.getEffectiveDescriptor().getParameterTypes();
        int size = parameterTypes.size();
        InsnList insnList2 = new InsnList(size + 1);
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            Type type = parameterTypes.get(i2);
            LocalVariableList.Item pcAndIndexToLocal = localVariables.pcAndIndexToLocal(i, i3);
            if (pcAndIndexToLocal == null) {
                registerSpec = RegisterSpec.make(i3, type);
            } else {
                registerSpec = RegisterSpec.makeLocalOptional(i3, type, pcAndIndexToLocal.getLocalItem());
            }
            PlainCstInsn plainCstInsn = r4;
            PlainCstInsn plainCstInsn2 = new PlainCstInsn(Rops.opMoveParam(type), makeSourcePosistion, registerSpec, RegisterSpecList.EMPTY, CstInteger.make(i3));
            insnList2.set(i2, plainCstInsn);
            i3 += type.getCategory();
            i2++;
            i = 0;
        }
        Rop rop = Rops.GOTO;
        RegisterSpecList registerSpecList = RegisterSpecList.EMPTY;
        insnList2.set(size, new PlainInsn(rop, makeSourcePosistion, (RegisterSpec) null, registerSpecList));
        insnList2.setImmutable();
        boolean isSynchronized = isSynchronized();
        int specialLabel = isSynchronized ? getSpecialLabel(-4) : 0;
        BasicBlock basicBlock = new BasicBlock(getSpecialLabel(-1), insnList2, IntList.makeImmutable(specialLabel), specialLabel);
        IntList intList = IntList.EMPTY;
        addBlock(basicBlock, intList);
        if (isSynchronized) {
            RegisterSpec synchReg = getSynchReg();
            if (isStatic()) {
                ThrowingCstInsn throwingCstInsn = new ThrowingCstInsn(Rops.CONST_OBJECT, makeSourcePosistion, registerSpecList, StdTypeList.EMPTY, this.method.getDefiningClass());
                insnList = new InsnList(1);
                insnList.set(0, throwingCstInsn);
            } else {
                PlainCstInsn plainCstInsn3 = r4;
                InsnList insnList3 = new InsnList(2);
                PlainCstInsn plainCstInsn4 = new PlainCstInsn(Rops.MOVE_PARAM_OBJECT, makeSourcePosistion, synchReg, registerSpecList, CstInteger.VALUE_0);
                insnList3.set(0, plainCstInsn3);
                insnList3.set(1, new PlainInsn(rop, makeSourcePosistion, (RegisterSpec) null, registerSpecList));
                insnList = insnList3;
            }
            int specialLabel2 = getSpecialLabel(SYNCH_SETUP_2);
            insnList.setImmutable();
            addBlock(new BasicBlock(specialLabel, insnList, IntList.makeImmutable(specialLabel2), specialLabel2), intList);
            InsnList insnList4 = new InsnList(isStatic() ? 2 : 1);
            if (isStatic()) {
                insnList4.set(0, new PlainInsn(Rops.opMoveResultPseudo(synchReg), makeSourcePosistion, synchReg, registerSpecList));
            }
            insnList4.set(isStatic() ? 1 : 0, new ThrowingInsn(Rops.MONITOR_ENTER, makeSourcePosistion, RegisterSpecList.make(synchReg), StdTypeList.EMPTY));
            insnList4.setImmutable();
            addBlock(new BasicBlock(specialLabel2, insnList4, IntList.makeImmutable(0), 0), intList);
        }
    }

    private void addSynchExceptionHandlerBlock() {
        if (this.synchNeedsExceptionHandler) {
            SourcePosition makeSourcePosistion = this.method.makeSourcePosistion(0);
            Type type = Type.THROWABLE;
            RegisterSpec make = RegisterSpec.make(0, type);
            InsnList insnList = new InsnList(2);
            insnList.set(0, new PlainInsn(Rops.opMoveException(type), makeSourcePosistion, make, RegisterSpecList.EMPTY));
            Rop rop = Rops.MONITOR_EXIT;
            RegisterSpecList make2 = RegisterSpecList.make(getSynchReg());
            StdTypeList stdTypeList = StdTypeList.EMPTY;
            insnList.set(1, new ThrowingInsn(rop, makeSourcePosistion, make2, stdTypeList));
            insnList.setImmutable();
            int specialLabel = getSpecialLabel(SYNCH_CATCH_2);
            BasicBlock basicBlock = new BasicBlock(getSpecialLabel(SYNCH_CATCH_1), insnList, IntList.makeImmutable(specialLabel), specialLabel);
            IntList intList = IntList.EMPTY;
            addBlock(basicBlock, intList);
            InsnList insnList2 = new InsnList(1);
            insnList2.set(0, new ThrowingInsn(Rops.THROW, makeSourcePosistion, RegisterSpecList.make(make), stdTypeList));
            insnList2.setImmutable();
            addBlock(new BasicBlock(specialLabel, insnList2, intList, -1), intList);
        }
    }

    public static RopMethod convert(ConcreteMethod concreteMethod, TranslationAdvice translationAdvice, MethodList methodList) {
        try {
            Ropper ropper = new Ropper(concreteMethod, translationAdvice, methodList);
            ropper.doit();
            return ropper.getRopMethod();
        } catch (SimException e) {
            e.addContext("...while working on method " + concreteMethod.getNat().toHuman());
            throw e;
        }
    }

    private void deleteUnreachableBlocks() {
        final IntList intList = new IntList(this.result.size());
        this.resultSubroutines.clear();
        forEachNonSubBlockDepthFirst(getSpecialLabel(-1), new BasicBlock.Visitor() {
            public void visitBlock(BasicBlock basicBlock) {
                intList.add(basicBlock.getLabel());
            }
        });
        intList.sort();
        for (int size = this.result.size() - 1; size >= 0; size--) {
            if (intList.indexOf(this.result.get(size).getLabel()) < 0) {
                this.result.remove(size);
            }
        }
    }

    private void doit() {
        int[] makeBitSet = Bits.makeBitSet(this.maxLabel);
        Bits.set(makeBitSet, 0);
        addSetupBlocks();
        setFirstFrame();
        while (true) {
            int findFirst = Bits.findFirst(makeBitSet, 0);
            if (findFirst < 0) {
                break;
            }
            Bits.clear(makeBitSet, findFirst);
            try {
                processBlock(this.blocks.labelToBlock(findFirst), this.startFrames[findFirst], makeBitSet);
            } catch (SimException e) {
                e.addContext("...while working on block " + Hex.m907u2(findFirst));
                throw e;
            }
        }
        addReturnBlock();
        addSynchExceptionHandlerBlock();
        addExceptionSetupBlocks();
        if (this.hasSubroutines) {
            inlineSubroutines();
        }
    }

    /* access modifiers changed from: private */
    public InsnList filterMoveReturnAddressInsns(InsnList insnList) {
        int size = insnList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (insnList.get(i2).getOpcode() != Rops.MOVE_RETURN_ADDRESS) {
                i++;
            }
        }
        if (i == size) {
            return insnList;
        }
        InsnList insnList2 = new InsnList(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Insn insn = insnList.get(i4);
            if (insn.getOpcode() != Rops.MOVE_RETURN_ADDRESS) {
                insnList2.set(i3, insn);
                i3++;
            }
        }
        insnList2.setImmutable();
        return insnList2;
    }

    private void forEachNonSubBlockDepthFirst(int i, BasicBlock.Visitor visitor) {
        forEachNonSubBlockDepthFirst0(labelToBlock(i), visitor, new BitSet(this.maxLabel));
    }

    private void forEachNonSubBlockDepthFirst0(BasicBlock basicBlock, BasicBlock.Visitor visitor, BitSet bitSet) {
        int labelToResultIndex;
        visitor.visitBlock(basicBlock);
        bitSet.set(basicBlock.getLabel());
        IntList successors = basicBlock.getSuccessors();
        int size = successors.size();
        for (int i = 0; i < size; i++) {
            int i2 = successors.get(i);
            if (!bitSet.get(i2) && ((!isSubroutineCaller(basicBlock) || i <= 0) && (labelToResultIndex = labelToResultIndex(i2)) >= 0)) {
                forEachNonSubBlockDepthFirst0(this.result.get(labelToResultIndex), visitor, bitSet);
            }
        }
    }

    private int getAvailableLabel() {
        int minimumUnreservedLabel = getMinimumUnreservedLabel();
        Iterator<BasicBlock> it = this.result.iterator();
        while (it.hasNext()) {
            int label = it.next().getLabel();
            if (label >= minimumUnreservedLabel) {
                minimumUnreservedLabel = label + 1;
            }
        }
        return minimumUnreservedLabel;
    }

    private int getMinimumUnreservedLabel() {
        return this.maxLabel + this.method.getCatches().size() + 7;
    }

    private int getNormalRegCount() {
        return this.maxLocals + this.method.getMaxStack();
    }

    private RopMethod getRopMethod() {
        int size = this.result.size();
        BasicBlockList basicBlockList = new BasicBlockList(size);
        for (int i = 0; i < size; i++) {
            basicBlockList.set(i, this.result.get(i));
        }
        basicBlockList.setImmutable();
        return new RopMethod(basicBlockList, getSpecialLabel(-1));
    }

    private int getSpecialLabel(int i) {
        return this.maxLabel + this.method.getCatches().size() + (~i);
    }

    private RegisterSpec getSynchReg() {
        int normalRegCount = getNormalRegCount();
        if (normalRegCount < 1) {
            normalRegCount = 1;
        }
        return RegisterSpec.make(normalRegCount, Type.OBJECT);
    }

    private void inlineSubroutines() {
        final IntList intList = new IntList(4);
        forEachNonSubBlockDepthFirst(0, new BasicBlock.Visitor() {
            public void visitBlock(BasicBlock basicBlock) {
                if (Ropper.this.isSubroutineCaller(basicBlock)) {
                    intList.add(basicBlock.getLabel());
                }
            }
        });
        int availableLabel = getAvailableLabel();
        ArrayList arrayList = new ArrayList(availableLabel);
        for (int i = 0; i < availableLabel; i++) {
            arrayList.add((Object) null);
        }
        for (int i2 = 0; i2 < this.result.size(); i2++) {
            BasicBlock basicBlock = this.result.get(i2);
            if (basicBlock != null) {
                arrayList.set(basicBlock.getLabel(), this.resultSubroutines.get(i2));
            }
        }
        int size = intList.size();
        for (int i3 = 0; i3 < size; i3++) {
            new SubroutineInliner(new LabelAllocator(getAvailableLabel()), arrayList).inlineSubroutineCalledFrom(labelToBlock(intList.get(i3)));
        }
        deleteUnreachableBlocks();
    }

    private boolean isStatic() {
        return (this.method.getAccessFlags() & 8) != 0;
    }

    /* access modifiers changed from: private */
    public boolean isSubroutineCaller(BasicBlock basicBlock) {
        IntList successors = basicBlock.getSuccessors();
        if (successors.size() < 2) {
            return false;
        }
        int i = successors.get(1);
        Subroutine[] subroutineArr = this.subroutines;
        if (i >= subroutineArr.length || subroutineArr[i] == null) {
            return false;
        }
        return true;
    }

    private boolean isSynchronized() {
        return (this.method.getAccessFlags() & 32) != 0;
    }

    /* access modifiers changed from: private */
    public BasicBlock labelToBlock(int i) {
        int labelToResultIndex = labelToResultIndex(i);
        if (labelToResultIndex >= 0) {
            return this.result.get(labelToResultIndex);
        }
        throw new IllegalArgumentException("no such label " + Hex.m907u2(i));
    }

    private int labelToResultIndex(int i) {
        int size = this.result.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.result.get(i2).getLabel() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public void mergeAndWorkAsNecessary(int i, int i2, Subroutine subroutine, Frame frame, int[] iArr) {
        Frame frame2;
        Frame[] frameArr = this.startFrames;
        Frame frame3 = frameArr[i];
        if (frame3 != null) {
            if (subroutine != null) {
                frame2 = frame3.mergeWithSubroutineCaller(frame, subroutine.getStartBlock(), i2);
            } else {
                frame2 = frame3.mergeWith(frame);
            }
            if (frame2 != frame3) {
                this.startFrames[i] = frame2;
                Bits.set(iArr, i);
                return;
            }
            return;
        }
        if (subroutine != null) {
            frameArr[i] = frame.makeNewSubroutineStartFrame(i, i2);
        } else {
            frameArr[i] = frame;
        }
        Bits.set(iArr, i);
    }

    private void processBlock(ByteBlock byteBlock, Frame frame, int[] iArr) {
        Subroutine subroutine;
        IntList intList;
        int i;
        int i2;
        IntList intList2;
        int i3;
        int i4;
        Insn insn;
        SourcePosition sourcePosition;
        IntList intList3;
        ByteCatchList catches = byteBlock.getCatches();
        this.machine.startBlock(catches.toRopCatchList());
        Frame copy = frame.copy();
        this.sim.simulate(byteBlock, copy);
        copy.setImmutable();
        int extraBlockCount = this.machine.getExtraBlockCount();
        ArrayList<Insn> insns = this.machine.getInsns();
        int size = insns.size();
        int size2 = catches.size();
        IntList successors = byteBlock.getSuccessors();
        if (this.machine.hasJsr()) {
            int i5 = successors.get(1);
            Subroutine[] subroutineArr = this.subroutines;
            if (subroutineArr[i5] == null) {
                subroutineArr[i5] = new Subroutine(i5);
            }
            this.subroutines[i5].addCallerBlock(byteBlock.getLabel());
            int[] iArr2 = iArr;
            intList = successors;
            subroutine = this.subroutines[i5];
            i = 1;
        } else {
            if (this.machine.hasRet()) {
                int subroutineAddress = this.machine.getReturnAddress().getSubroutineAddress();
                Subroutine[] subroutineArr2 = this.subroutines;
                if (subroutineArr2[subroutineAddress] == null) {
                    subroutineArr2[subroutineAddress] = new Subroutine(this, subroutineAddress, byteBlock.getLabel());
                } else {
                    subroutineArr2[subroutineAddress].addRetBlock(byteBlock.getLabel());
                }
                IntList successors2 = this.subroutines[subroutineAddress].getSuccessors();
                this.subroutines[subroutineAddress].mergeToSuccessors(copy, iArr);
                i = successors2.size();
                intList = successors2;
            } else {
                int[] iArr3 = iArr;
                if (this.machine.wereCatchesUsed()) {
                    intList = successors;
                    i = size2;
                } else {
                    intList = successors;
                    subroutine = null;
                    i = 0;
                }
            }
            subroutine = null;
        }
        int size3 = intList.size();
        int i6 = i;
        while (i6 < size3) {
            int i7 = intList.get(i6);
            try {
                int i8 = i6;
                int i9 = size3;
                IntList intList4 = intList;
                mergeAndWorkAsNecessary(i7, byteBlock.getLabel(), subroutine, copy, iArr);
                i6 = i8 + 1;
                int[] iArr4 = iArr;
                intList = intList4;
                size3 = i9;
            } catch (SimException e) {
                e.addContext("...while merging to block " + Hex.m907u2(i7));
                throw e;
            }
        }
        int i10 = size3;
        IntList intList5 = intList;
        if (i10 != 0 || !this.machine.returns()) {
            intList2 = intList5;
            i2 = i10;
        } else {
            intList2 = IntList.makeImmutable(getSpecialLabel(-2));
            i2 = 1;
        }
        if (i2 == 0) {
            i3 = -1;
        } else {
            int primarySuccessorIndex = this.machine.getPrimarySuccessorIndex();
            if (primarySuccessorIndex >= 0) {
                primarySuccessorIndex = intList2.get(primarySuccessorIndex);
            }
            i3 = primarySuccessorIndex;
        }
        boolean z = isSynchronized() && this.machine.canThrow();
        if (z || size2 != 0) {
            IntList intList6 = new IntList(i2);
            boolean z2 = false;
            int i11 = 0;
            while (i11 < size2) {
                ByteCatchList.Item item = catches.get(i11);
                CstType exceptionClass = item.getExceptionClass();
                int handlerPc = item.getHandlerPc();
                boolean z3 = z2 | (exceptionClass == CstType.OBJECT);
                try {
                    CstType cstType = exceptionClass;
                    IntList intList7 = intList6;
                    int i12 = i3;
                    int i13 = i11;
                    mergeAndWorkAsNecessary(handlerPc, byteBlock.getLabel(), (Subroutine) null, copy.makeExceptionHandlerStartFrame(exceptionClass), iArr);
                    CatchInfo catchInfo = this.catchInfos[handlerPc];
                    if (catchInfo == null) {
                        catchInfo = new CatchInfo();
                        this.catchInfos[handlerPc] = catchInfo;
                    }
                    intList7.add(catchInfo.getSetup(cstType.getClassType()).getLabel());
                    i11 = i13 + 1;
                    intList6 = intList7;
                    z2 = z3;
                    i3 = i12;
                } catch (SimException e2) {
                    e2.addContext("...while merging exception to block " + Hex.m907u2(handlerPc));
                    throw e2;
                }
            }
            IntList intList8 = intList6;
            int i14 = i3;
            if (z && !z2) {
                intList8.add(getSpecialLabel(SYNCH_CATCH_1));
                this.synchNeedsExceptionHandler = true;
                for (int i15 = (size - extraBlockCount) - 1; i15 < size; i15++) {
                    Insn insn2 = insns.get(i15);
                    if (insn2.canThrow()) {
                        insns.set(i15, insn2.withAddedCatch(Type.OBJECT));
                    }
                }
            }
            i4 = i14;
            if (i4 >= 0) {
                intList8.add(i4);
            }
            intList8.setImmutable();
            intList2 = intList8;
        } else {
            i4 = i3;
        }
        int indexOf = intList2.indexOf(i4);
        int i16 = i4;
        while (extraBlockCount > 0) {
            size--;
            Insn insn3 = insns.get(size);
            boolean z4 = insn3.getOpcode().getBranchingness() == 1;
            InsnList insnList = new InsnList(z4 ? 2 : 1);
            insnList.set(0, insn3);
            if (z4) {
                insnList.set(1, new PlainInsn(Rops.GOTO, insn3.getPosition(), (RegisterSpec) null, RegisterSpecList.EMPTY));
                intList3 = IntList.makeImmutable(i16);
            } else {
                intList3 = intList2;
            }
            insnList.setImmutable();
            int availableLabel = getAvailableLabel();
            addBlock(new BasicBlock(availableLabel, insnList, intList3, i16), copy.getSubroutines());
            intList2 = intList2.mutableCopy();
            intList2.set(indexOf, availableLabel);
            intList2.setImmutable();
            extraBlockCount--;
            i16 = availableLabel;
        }
        if (size == 0) {
            insn = null;
        } else {
            insn = insns.get(size - 1);
        }
        if (insn == null || insn.getOpcode().getBranchingness() == 1) {
            if (insn == null) {
                sourcePosition = SourcePosition.NO_INFO;
            } else {
                sourcePosition = insn.getPosition();
            }
            insns.add(new PlainInsn(Rops.GOTO, sourcePosition, (RegisterSpec) null, RegisterSpecList.EMPTY));
            size++;
        }
        InsnList insnList2 = new InsnList(size);
        for (int i17 = 0; i17 < size; i17++) {
            insnList2.set(i17, insns.get(i17));
        }
        insnList2.setImmutable();
        addOrReplaceBlock(new BasicBlock(byteBlock.getLabel(), insnList2, intList2, i16), copy.getSubroutines());
    }

    private void removeBlockAndSpecialSuccessors(int i) {
        int minimumUnreservedLabel = getMinimumUnreservedLabel();
        IntList successors = this.result.get(i).getSuccessors();
        int size = successors.size();
        this.result.remove(i);
        this.resultSubroutines.remove(i);
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = successors.get(i2);
            if (i3 >= minimumUnreservedLabel) {
                int labelToResultIndex = labelToResultIndex(i3);
                if (labelToResultIndex >= 0) {
                    removeBlockAndSpecialSuccessors(labelToResultIndex);
                } else {
                    throw new RuntimeException("Invalid label " + Hex.m907u2(i3));
                }
            }
        }
    }

    private void setFirstFrame() {
        this.startFrames[0].initializeWithParameters(this.method.getEffectiveDescriptor().getParameterTypes());
        this.startFrames[0].setImmutable();
    }

    /* access modifiers changed from: private */
    public Subroutine subroutineFromRetBlock(int i) {
        for (int length = this.subroutines.length - 1; length >= 0; length--) {
            Subroutine[] subroutineArr = this.subroutines;
            if (subroutineArr[length] != null) {
                Subroutine subroutine = subroutineArr[length];
                if (subroutine.retBlocks.get(i)) {
                    return subroutine;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int getFirstTempStackReg() {
        int normalRegCount = getNormalRegCount();
        return isSynchronized() ? normalRegCount + 1 : normalRegCount;
    }

    /* renamed from: com.android.dx.cf.code.Ropper$Subroutine */
    private class Subroutine {
        private BitSet callerBlocks;
        /* access modifiers changed from: private */
        public BitSet retBlocks;
        /* access modifiers changed from: private */
        public int startBlock;

        Subroutine(int i) {
            this.startBlock = i;
            this.retBlocks = new BitSet(Ropper.this.maxLabel);
            this.callerBlocks = new BitSet(Ropper.this.maxLabel);
            boolean unused = Ropper.this.hasSubroutines = true;
        }

        /* access modifiers changed from: package-private */
        public void addCallerBlock(int i) {
            this.callerBlocks.set(i);
        }

        /* access modifiers changed from: package-private */
        public void addRetBlock(int i) {
            this.retBlocks.set(i);
        }

        /* access modifiers changed from: package-private */
        public int getStartBlock() {
            return this.startBlock;
        }

        /* access modifiers changed from: package-private */
        public IntList getSuccessors() {
            IntList intList = new IntList(this.callerBlocks.size());
            int nextSetBit = this.callerBlocks.nextSetBit(0);
            while (nextSetBit >= 0) {
                intList.add(Ropper.this.labelToBlock(nextSetBit).getSuccessors().get(0));
                nextSetBit = this.callerBlocks.nextSetBit(nextSetBit + 1);
            }
            intList.setImmutable();
            return intList;
        }

        /* access modifiers changed from: package-private */
        public void mergeToSuccessors(Frame frame, int[] iArr) {
            int nextSetBit = this.callerBlocks.nextSetBit(0);
            while (nextSetBit >= 0) {
                int i = Ropper.this.labelToBlock(nextSetBit).getSuccessors().get(0);
                Frame subFrameForLabel = frame.subFrameForLabel(this.startBlock, nextSetBit);
                if (subFrameForLabel != null) {
                    Ropper.this.mergeAndWorkAsNecessary(i, -1, (Subroutine) null, subFrameForLabel, iArr);
                } else {
                    Bits.set(iArr, nextSetBit);
                }
                nextSetBit = this.callerBlocks.nextSetBit(nextSetBit + 1);
            }
        }

        Subroutine(Ropper ropper, int i, int i2) {
            this(i);
            addRetBlock(i2);
        }
    }
}
