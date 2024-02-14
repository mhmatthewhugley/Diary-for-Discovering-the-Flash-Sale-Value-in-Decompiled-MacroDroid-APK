package com.android.p023dx.p026io.instructions;

import com.android.p023dx.p026io.IndexType;

/* renamed from: com.android.dx.io.instructions.RegisterRangeDecodedInstruction */
public final class RegisterRangeDecodedInstruction extends DecodedInstruction {

    /* renamed from: a */
    private final int f1055a;
    private final int registerCount;

    public RegisterRangeDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f1055a = i4;
        this.registerCount = i5;
    }

    public int getA() {
        return this.f1055a;
    }

    public int getRegisterCount() {
        return this.registerCount;
    }

    public DecodedInstruction withIndex(int i) {
        return new RegisterRangeDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f1055a, this.registerCount);
    }
}
