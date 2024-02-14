package com.android.p023dx.p026io.instructions;

import com.android.p023dx.p026io.IndexType;

/* renamed from: com.android.dx.io.instructions.FiveRegisterDecodedInstruction */
public final class FiveRegisterDecodedInstruction extends DecodedInstruction {

    /* renamed from: a */
    private final int f1045a;

    /* renamed from: b */
    private final int f1046b;

    /* renamed from: c */
    private final int f1047c;

    /* renamed from: d */
    private final int f1048d;

    /* renamed from: e */
    private final int f1049e;

    public FiveRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5, int i6, int i7, int i8) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f1045a = i4;
        this.f1046b = i5;
        this.f1047c = i6;
        this.f1048d = i7;
        this.f1049e = i8;
    }

    public int getA() {
        return this.f1045a;
    }

    public int getB() {
        return this.f1046b;
    }

    public int getC() {
        return this.f1047c;
    }

    public int getD() {
        return this.f1048d;
    }

    public int getE() {
        return this.f1049e;
    }

    public int getRegisterCount() {
        return 5;
    }

    public DecodedInstruction withIndex(int i) {
        return new FiveRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f1045a, this.f1046b, this.f1047c, this.f1048d, this.f1049e);
    }
}
