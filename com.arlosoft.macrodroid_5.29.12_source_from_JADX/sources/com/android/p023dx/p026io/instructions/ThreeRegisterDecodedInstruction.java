package com.android.p023dx.p026io.instructions;

import com.android.p023dx.p026io.IndexType;

/* renamed from: com.android.dx.io.instructions.ThreeRegisterDecodedInstruction */
public final class ThreeRegisterDecodedInstruction extends DecodedInstruction {

    /* renamed from: a */
    private final int f1056a;

    /* renamed from: b */
    private final int f1057b;

    /* renamed from: c */
    private final int f1058c;

    public ThreeRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5, int i6) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f1056a = i4;
        this.f1057b = i5;
        this.f1058c = i6;
    }

    public int getA() {
        return this.f1056a;
    }

    public int getB() {
        return this.f1057b;
    }

    public int getC() {
        return this.f1058c;
    }

    public int getRegisterCount() {
        return 3;
    }

    public DecodedInstruction withIndex(int i) {
        return new ThreeRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f1056a, this.f1057b, this.f1058c);
    }
}
