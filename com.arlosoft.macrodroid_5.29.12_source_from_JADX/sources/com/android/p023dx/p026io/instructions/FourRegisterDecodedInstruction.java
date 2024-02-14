package com.android.p023dx.p026io.instructions;

import com.android.p023dx.p026io.IndexType;

/* renamed from: com.android.dx.io.instructions.FourRegisterDecodedInstruction */
public final class FourRegisterDecodedInstruction extends DecodedInstruction {

    /* renamed from: a */
    private final int f1050a;

    /* renamed from: b */
    private final int f1051b;

    /* renamed from: c */
    private final int f1052c;

    /* renamed from: d */
    private final int f1053d;

    public FourRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5, int i6, int i7) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f1050a = i4;
        this.f1051b = i5;
        this.f1052c = i6;
        this.f1053d = i7;
    }

    public int getA() {
        return this.f1050a;
    }

    public int getB() {
        return this.f1051b;
    }

    public int getC() {
        return this.f1052c;
    }

    public int getD() {
        return this.f1053d;
    }

    public int getRegisterCount() {
        return 4;
    }

    public DecodedInstruction withIndex(int i) {
        return new FourRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f1050a, this.f1051b, this.f1052c, this.f1053d);
    }
}
