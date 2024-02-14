package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
abstract class AbstractStreamingHasher extends AbstractHasher {

    /* renamed from: a */
    private final ByteBuffer f17509a;

    /* renamed from: b */
    private final int f17510b;

    /* renamed from: c */
    private final int f17511c;

    protected AbstractStreamingHasher(int i) {
        this(i, i);
    }

    /* renamed from: j */
    private void m29639j() {
        Java8Compatibility.m29766b(this.f17509a);
        while (this.f17509a.remaining() >= this.f17511c) {
            mo36971l(this.f17509a);
        }
        this.f17509a.compact();
    }

    /* renamed from: k */
    private void m29640k() {
        if (this.f17509a.remaining() < 8) {
            m29639j();
        }
    }

    /* renamed from: n */
    private Hasher m29641n(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.f17509a.remaining()) {
            this.f17509a.put(byteBuffer);
            m29640k();
            return this;
        }
        int position = this.f17510b - this.f17509a.position();
        for (int i = 0; i < position; i++) {
            this.f17509a.put(byteBuffer.get());
        }
        m29639j();
        while (byteBuffer.remaining() >= this.f17511c) {
            mo36971l(byteBuffer);
        }
        this.f17509a.put(byteBuffer);
        return this;
    }

    /* renamed from: g */
    public final HashCode mo36963g() {
        m29639j();
        Java8Compatibility.m29766b(this.f17509a);
        if (this.f17509a.remaining() > 0) {
            mo36972m(this.f17509a);
            ByteBuffer byteBuffer = this.f17509a;
            Java8Compatibility.m29768d(byteBuffer, byteBuffer.limit());
        }
        return mo36970i();
    }

    /* renamed from: h */
    public final Hasher mo36951h(char c) {
        this.f17509a.putChar(c);
        m29640k();
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract HashCode mo36970i();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo36971l(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo36972m(ByteBuffer byteBuffer) {
        Java8Compatibility.m29768d(byteBuffer, byteBuffer.limit());
        Java8Compatibility.m29767c(byteBuffer, this.f17511c + 7);
        while (true) {
            int position = byteBuffer.position();
            int i = this.f17511c;
            if (position < i) {
                byteBuffer.putLong(0);
            } else {
                Java8Compatibility.m29767c(byteBuffer, i);
                Java8Compatibility.m29766b(byteBuffer);
                mo36971l(byteBuffer);
                return;
            }
        }
    }

    protected AbstractStreamingHasher(int i, int i2) {
        Preconditions.m5377d(i2 % i == 0);
        this.f17509a = ByteBuffer.allocate(i2 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f17510b = i2;
        this.f17511c = i;
    }

    /* renamed from: b */
    public final Hasher m29643b(byte b) {
        this.f17509a.put(b);
        m29640k();
        return this;
    }

    /* renamed from: d */
    public final Hasher m29645d(byte[] bArr, int i, int i2) {
        return m29641n(ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN));
    }

    public final Hasher putInt(int i) {
        this.f17509a.putInt(i);
        m29640k();
        return this;
    }

    public final Hasher putLong(long j) {
        this.f17509a.putLong(j);
        m29640k();
        return this;
    }
}
