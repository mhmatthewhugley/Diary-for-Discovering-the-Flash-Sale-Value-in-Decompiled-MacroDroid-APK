package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.zip.Checksum;

@ElementTypesAreNonnullByDefault
@Immutable
final class ChecksumHashFunction extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public final int bits;
    private final ImmutableSupplier<? extends Checksum> checksumSupplier;
    private final String toString;

    private final class ChecksumHasher extends AbstractByteHasher {

        /* renamed from: b */
        private final Checksum f17517b;

        /* renamed from: g */
        public HashCode mo36963g() {
            long value = this.f17517b.getValue();
            if (ChecksumHashFunction.this.bits == 32) {
                return HashCode.m29716g((int) value);
            }
            return HashCode.m29717h(value);
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo36952j(byte b) {
            this.f17517b.update(b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public void mo36954l(byte[] bArr, int i, int i2) {
            this.f17517b.update(bArr, i, i2);
        }

        private ChecksumHasher(Checksum checksum) {
            this.f17517b = (Checksum) Preconditions.m5392s(checksum);
        }
    }

    ChecksumHashFunction(ImmutableSupplier<? extends Checksum> immutableSupplier, int i, String str) {
        this.checksumSupplier = (ImmutableSupplier) Preconditions.m5392s(immutableSupplier);
        Preconditions.m5381h(i == 32 || i == 64, "bits (%s) must be either 32 or 64", i);
        this.bits = i;
        this.toString = (String) Preconditions.m5392s(str);
    }

    /* renamed from: b */
    public int mo36981b() {
        return this.bits;
    }

    /* renamed from: d */
    public Hasher mo36958d() {
        return new ChecksumHasher((Checksum) this.checksumSupplier.get());
    }

    public String toString() {
        return this.toString;
    }
}
