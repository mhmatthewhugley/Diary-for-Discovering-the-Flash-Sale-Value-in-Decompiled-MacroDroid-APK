package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
abstract class AbstractByteHasher extends AbstractHasher {

    /* renamed from: a */
    private final ByteBuffer f17503a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    AbstractByteHasher() {
    }

    /* renamed from: i */
    private Hasher m29585i(int i) {
        try {
            mo36954l(this.f17503a.array(), 0, i);
            return this;
        } finally {
            Java8Compatibility.m29765a(this.f17503a);
        }
    }

    /* renamed from: h */
    public Hasher mo36951h(char c) {
        this.f17503a.putChar(c);
        return m29585i(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo36952j(byte b);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo36953k(byte[] bArr) {
        mo36954l(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo36954l(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            mo36952j(bArr[i3]);
        }
    }

    /* renamed from: a */
    public Hasher m29587a(byte[] bArr) {
        Preconditions.m5392s(bArr);
        mo36953k(bArr);
        return this;
    }

    /* renamed from: b */
    public Hasher m29589b(byte b) {
        mo36952j(b);
        return this;
    }

    /* renamed from: d */
    public Hasher m29591d(byte[] bArr, int i, int i2) {
        Preconditions.m5397x(i, i + i2, bArr.length);
        mo36954l(bArr, i, i2);
        return this;
    }

    public Hasher putInt(int i) {
        this.f17503a.putInt(i);
        return m29585i(4);
    }

    public Hasher putLong(long j) {
        this.f17503a.putLong(j);
        return m29585i(8);
    }
}
