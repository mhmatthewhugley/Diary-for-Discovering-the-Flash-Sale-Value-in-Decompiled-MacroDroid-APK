package com.android.p023dx.p026io.instructions;

import com.android.p023dx.p026io.IndexType;

/* renamed from: com.android.dx.io.instructions.OneRegisterDecodedInstruction */
public final class OneRegisterDecodedInstruction extends DecodedInstruction {

    /* renamed from: a */
    private final int f1054a;

    public OneRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f1054a = i4;
    }

    public int getA() {
        return this.f1054a;
    }

    public int getRegisterCount() {
        return 1;
    }

    public DecodedInstruction withIndex(int i) {
        return new OneRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f1054a);
    }
}
