package com.android.p023dx.merge;

import com.android.dex.DexException;
import com.android.dex.DexIndexOverflowException;
import com.android.p023dx.p026io.CodeReader;
import com.android.p023dx.p026io.instructions.DecodedInstruction;
import com.android.p023dx.p026io.instructions.ShortArrayCodeOutput;

/* renamed from: com.android.dx.merge.InstructionTransformer */
final class InstructionTransformer {
    /* access modifiers changed from: private */
    public IndexMap indexMap;
    private int mappedAt;
    /* access modifiers changed from: private */
    public DecodedInstruction[] mappedInstructions;
    private final CodeReader reader;

    /* renamed from: com.android.dx.merge.InstructionTransformer$FieldVisitor */
    private class FieldVisitor implements CodeReader.Visitor {
        private FieldVisitor() {
        }

        public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
            int adjustField = InstructionTransformer.this.indexMap.adjustField(decodedInstruction.getIndex());
            InstructionTransformer.jumboCheck(decodedInstruction.getOpcode() == 27, adjustField);
            InstructionTransformer.this.mappedInstructions[InstructionTransformer.access$608(InstructionTransformer.this)] = decodedInstruction.withIndex(adjustField);
        }
    }

    /* renamed from: com.android.dx.merge.InstructionTransformer$GenericVisitor */
    private class GenericVisitor implements CodeReader.Visitor {
        private GenericVisitor() {
        }

        public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
            InstructionTransformer.this.mappedInstructions[InstructionTransformer.access$608(InstructionTransformer.this)] = decodedInstruction;
        }
    }

    /* renamed from: com.android.dx.merge.InstructionTransformer$MethodVisitor */
    private class MethodVisitor implements CodeReader.Visitor {
        private MethodVisitor() {
        }

        public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
            int adjustMethod = InstructionTransformer.this.indexMap.adjustMethod(decodedInstruction.getIndex());
            InstructionTransformer.jumboCheck(decodedInstruction.getOpcode() == 27, adjustMethod);
            InstructionTransformer.this.mappedInstructions[InstructionTransformer.access$608(InstructionTransformer.this)] = decodedInstruction.withIndex(adjustMethod);
        }
    }

    /* renamed from: com.android.dx.merge.InstructionTransformer$StringVisitor */
    private class StringVisitor implements CodeReader.Visitor {
        private StringVisitor() {
        }

        public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
            int adjustString = InstructionTransformer.this.indexMap.adjustString(decodedInstruction.getIndex());
            InstructionTransformer.jumboCheck(decodedInstruction.getOpcode() == 27, adjustString);
            InstructionTransformer.this.mappedInstructions[InstructionTransformer.access$608(InstructionTransformer.this)] = decodedInstruction.withIndex(adjustString);
        }
    }

    /* renamed from: com.android.dx.merge.InstructionTransformer$TypeVisitor */
    private class TypeVisitor implements CodeReader.Visitor {
        private TypeVisitor() {
        }

        public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
            int adjustType = InstructionTransformer.this.indexMap.adjustType(decodedInstruction.getIndex());
            InstructionTransformer.jumboCheck(decodedInstruction.getOpcode() == 27, adjustType);
            InstructionTransformer.this.mappedInstructions[InstructionTransformer.access$608(InstructionTransformer.this)] = decodedInstruction.withIndex(adjustType);
        }
    }

    public InstructionTransformer() {
        CodeReader codeReader = new CodeReader();
        this.reader = codeReader;
        codeReader.setAllVisitors(new GenericVisitor());
        codeReader.setStringVisitor(new StringVisitor());
        codeReader.setTypeVisitor(new TypeVisitor());
        codeReader.setFieldVisitor(new FieldVisitor());
        codeReader.setMethodVisitor(new MethodVisitor());
    }

    static /* synthetic */ int access$608(InstructionTransformer instructionTransformer) {
        int i = instructionTransformer.mappedAt;
        instructionTransformer.mappedAt = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    public static void jumboCheck(boolean z, int i) {
        if (!z && i > 65535) {
            throw new DexIndexOverflowException("Cannot merge new index " + i + " into a non-jumbo instruction!");
        }
    }

    public short[] transform(IndexMap indexMap2, short[] sArr) throws DexException {
        DecodedInstruction[] decodeAll = DecodedInstruction.decodeAll(sArr);
        int length = decodeAll.length;
        this.indexMap = indexMap2;
        this.mappedInstructions = new DecodedInstruction[length];
        this.mappedAt = 0;
        this.reader.visitAll(decodeAll);
        ShortArrayCodeOutput shortArrayCodeOutput = new ShortArrayCodeOutput(length);
        for (DecodedInstruction decodedInstruction : this.mappedInstructions) {
            if (decodedInstruction != null) {
                decodedInstruction.encode(shortArrayCodeOutput);
            }
        }
        this.indexMap = null;
        return shortArrayCodeOutput.getArray();
    }
}
