package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
abstract class AbstractHasher implements Hasher {
    AbstractHasher() {
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ PrimitiveSink mo36949b(byte b) {
        return mo36949b(b);
    }

    /* renamed from: f */
    public <T> Hasher mo36962f(@ParametricNullness T t, Funnel<? super T> funnel) {
        funnel.mo36986S(t, this);
        return this;
    }

    /* renamed from: h */
    public Hasher mo36951h(char c) {
        mo36949b((byte) c);
        mo36949b((byte) (c >>> 8));
        return this;
    }

    /* renamed from: a */
    public Hasher m29618a(byte[] bArr) {
        return m29623d(bArr, 0, bArr.length);
    }

    /* renamed from: c */
    public Hasher m29621c(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            mo36951h(charSequence.charAt(i));
        }
        return this;
    }

    /* renamed from: d */
    public Hasher m29623d(byte[] bArr, int i, int i2) {
        Preconditions.m5397x(i, i + i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            mo36949b(bArr[i + i3]);
        }
        return this;
    }

    /* renamed from: e */
    public Hasher m29625e(CharSequence charSequence, Charset charset) {
        return m29618a(charSequence.toString().getBytes(charset));
    }

    public Hasher putInt(int i) {
        mo36949b((byte) i);
        mo36949b((byte) (i >>> 8));
        mo36949b((byte) (i >>> 16));
        mo36949b((byte) (i >>> 24));
        return this;
    }

    public Hasher putLong(long j) {
        for (int i = 0; i < 64; i += 8) {
            mo36949b((byte) ((int) (j >>> i)));
        }
        return this;
    }
}
