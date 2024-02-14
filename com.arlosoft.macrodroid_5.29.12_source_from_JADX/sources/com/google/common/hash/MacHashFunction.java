package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

@ElementTypesAreNonnullByDefault
@Immutable
final class MacHashFunction extends AbstractHashFunction {

    /* renamed from: a */
    private final Mac f17560a;

    /* renamed from: c */
    private final Key f17561c;

    /* renamed from: d */
    private final String f17562d;

    /* renamed from: f */
    private final int f17563f;

    /* renamed from: g */
    private final boolean f17564g;

    private static final class MacHasher extends AbstractByteHasher {

        /* renamed from: b */
        private final Mac f17565b;

        /* renamed from: c */
        private boolean f17566c;

        /* renamed from: m */
        private void m29793m() {
            Preconditions.m5399z(!this.f17566c, "Cannot re-use a Hasher after calling hash() on it");
        }

        /* renamed from: g */
        public HashCode mo36963g() {
            m29793m();
            this.f17566c = true;
            return HashCode.m29715f(this.f17565b.doFinal());
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo36952j(byte b) {
            m29793m();
            this.f17565b.update(b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo36953k(byte[] bArr) {
            m29793m();
            this.f17565b.update(bArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public void mo36954l(byte[] bArr, int i, int i2) {
            m29793m();
            this.f17565b.update(bArr, i, i2);
        }

        private MacHasher(Mac mac) {
            this.f17565b = mac;
        }
    }

    /* renamed from: h */
    private static Mac m29790h(String str, Key key) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(key);
            return instance;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: b */
    public int mo36981b() {
        return this.f17563f;
    }

    /* renamed from: d */
    public Hasher mo36958d() {
        if (this.f17564g) {
            try {
                return new MacHasher((Mac) this.f17560a.clone());
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new MacHasher(m29790h(this.f17560a.getAlgorithm(), this.f17561c));
    }

    public String toString() {
        return this.f17562d;
    }
}
