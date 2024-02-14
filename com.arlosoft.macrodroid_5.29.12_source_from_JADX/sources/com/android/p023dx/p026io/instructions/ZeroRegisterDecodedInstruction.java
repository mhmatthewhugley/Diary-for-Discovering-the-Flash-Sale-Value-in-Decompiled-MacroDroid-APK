package com.android.p023dx.p026io.instructions;

import com.android.p023dx.p026io.IndexType;

/* renamed from: com.android.dx.io.instructions.ZeroRegisterDecodedInstruction */
public final class ZeroRegisterDecodedInstruction extends DecodedInstruction {
    public ZeroRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j) {
        super(instructionCodec, i, i2, indexType, i3, j);
    }

    public int getRegisterCount() {
        return 0;
    }

    public DecodedInstruction withIndex(int i) {
        return new ZeroRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral());
    }
}
