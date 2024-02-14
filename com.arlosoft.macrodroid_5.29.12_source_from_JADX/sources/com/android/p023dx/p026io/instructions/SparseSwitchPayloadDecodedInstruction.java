package com.android.p023dx.p026io.instructions;

import com.android.p023dx.p026io.IndexType;

/* renamed from: com.android.dx.io.instructions.SparseSwitchPayloadDecodedInstruction */
public final class SparseSwitchPayloadDecodedInstruction extends DecodedInstruction {
    private final int[] keys;
    private final int[] targets;

    public SparseSwitchPayloadDecodedInstruction(InstructionCodec instructionCodec, int i, int[] iArr, int[] iArr2) {
        super(instructionCodec, i, 0, (IndexType) null, 0, 0);
        if (iArr.length == iArr2.length) {
            this.keys = iArr;
            this.targets = iArr2;
            return;
        }
        throw new IllegalArgumentException("keys/targets length mismatch");
    }

    public int[] getKeys() {
        return this.keys;
    }

    public int getRegisterCount() {
        return 0;
    }

    public int[] getTargets() {
        return this.targets;
    }

    public DecodedInstruction withIndex(int i) {
        throw new UnsupportedOperationException("no index in instruction");
    }
}
