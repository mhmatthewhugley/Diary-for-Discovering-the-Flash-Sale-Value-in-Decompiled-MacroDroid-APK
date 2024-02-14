package com.android.p023dx.p026io.instructions;

import com.android.p023dx.p026io.IndexType;

/* renamed from: com.android.dx.io.instructions.TwoRegisterDecodedInstruction */
public final class TwoRegisterDecodedInstruction extends DecodedInstruction {

    /* renamed from: a */
    private final int f1059a;

    /* renamed from: b */
    private final int f1060b;

    public TwoRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f1059a = i4;
        this.f1060b = i5;
    }

    public int getA() {
        return this.f1059a;
    }

    public int getB() {
        return this.f1060b;
    }

    public int getRegisterCount() {
        return 2;
    }

    public DecodedInstruction withIndex(int i) {
        return new TwoRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f1059a, this.f1060b);
    }
}
