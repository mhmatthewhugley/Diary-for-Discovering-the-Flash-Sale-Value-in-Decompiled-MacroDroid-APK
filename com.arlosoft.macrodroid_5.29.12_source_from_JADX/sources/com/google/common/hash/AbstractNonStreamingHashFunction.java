package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
@Immutable
abstract class AbstractNonStreamingHashFunction extends AbstractHashFunction {

    private final class BufferingHasher extends AbstractHasher {

        /* renamed from: a */
        final ExposedByteArrayOutputStream f17507a;

        BufferingHasher(int i) {
            this.f17507a = new ExposedByteArrayOutputStream(i);
        }

        /* renamed from: g */
        public HashCode mo36963g() {
            return AbstractNonStreamingHashFunction.this.mo36967g(this.f17507a.mo36968b(), 0, this.f17507a.mo36969c());
        }

        /* renamed from: b */
        public Hasher m29633b(byte b) {
            this.f17507a.write(b);
            return this;
        }

        /* renamed from: d */
        public Hasher m29635d(byte[] bArr, int i, int i2) {
            this.f17507a.write(bArr, i, i2);
            return this;
        }
    }

    private static final class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        ExposedByteArrayOutputStream(int i) {
            super(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public byte[] mo36968b() {
            return this.buf;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo36969c() {
            return this.count;
        }
    }

    AbstractNonStreamingHashFunction() {
    }

    /* renamed from: a */
    public HashCode mo36964a(CharSequence charSequence, Charset charset) {
        return mo36966f(charSequence.toString().getBytes(charset));
    }

    /* renamed from: c */
    public Hasher mo36957c(int i) {
        Preconditions.m5377d(i >= 0);
        return new BufferingHasher(i);
    }

    /* renamed from: d */
    public Hasher mo36958d() {
        return mo36957c(32);
    }

    /* renamed from: g */
    public abstract HashCode mo36967g(byte[] bArr, int i, int i2);
}
