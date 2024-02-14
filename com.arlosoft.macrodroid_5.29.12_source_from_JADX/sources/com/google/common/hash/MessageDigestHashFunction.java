package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
@Immutable
final class MessageDigestHashFunction extends AbstractHashFunction implements Serializable {
    private final int bytes;
    private final MessageDigest prototype;
    private final boolean supportsClone;
    private final String toString;

    private static final class MessageDigestHasher extends AbstractByteHasher {

        /* renamed from: b */
        private final MessageDigest f17567b;

        /* renamed from: c */
        private final int f17568c;

        /* renamed from: d */
        private boolean f17569d;

        /* renamed from: m */
        private void m29802m() {
            Preconditions.m5399z(!this.f17569d, "Cannot re-use a Hasher after calling hash() on it");
        }

        /* renamed from: g */
        public HashCode mo36963g() {
            m29802m();
            this.f17569d = true;
            if (this.f17568c == this.f17567b.getDigestLength()) {
                return HashCode.m29715f(this.f17567b.digest());
            }
            return HashCode.m29715f(Arrays.copyOf(this.f17567b.digest(), this.f17568c));
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo36952j(byte b) {
            m29802m();
            this.f17567b.update(b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public void mo36954l(byte[] bArr, int i, int i2) {
            m29802m();
            this.f17567b.update(bArr, i, i2);
        }

        private MessageDigestHasher(MessageDigest messageDigest, int i) {
            this.f17567b = messageDigest;
            this.f17568c = i;
        }
    }

    private static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final String algorithmName;
        private final int bytes;
        private final String toString;

        private Object readResolve() {
            return new MessageDigestHashFunction(this.algorithmName, this.bytes, this.toString);
        }

        private SerializedForm(String str, int i, String str2) {
            this.algorithmName = str;
            this.bytes = i;
            this.toString = str2;
        }
    }

    MessageDigestHashFunction(String str, String str2) {
        MessageDigest h = m29798h(str);
        this.prototype = h;
        this.bytes = h.getDigestLength();
        this.toString = (String) Preconditions.m5392s(str2);
        this.supportsClone = m29799i(h);
    }

    /* renamed from: h */
    private static MessageDigest m29798h(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: i */
    private static boolean m29799i(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public int mo36981b() {
        return this.bytes * 8;
    }

    /* renamed from: d */
    public Hasher mo36958d() {
        if (this.supportsClone) {
            try {
                return new MessageDigestHasher((MessageDigest) this.prototype.clone(), this.bytes);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new MessageDigestHasher(m29798h(this.prototype.getAlgorithm()), this.bytes);
    }

    public String toString() {
        return this.toString;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(this.prototype.getAlgorithm(), this.bytes, this.toString);
    }

    MessageDigestHashFunction(String str, int i, String str2) {
        this.toString = (String) Preconditions.m5392s(str2);
        MessageDigest h = m29798h(str);
        this.prototype = h;
        int digestLength = h.getDigestLength();
        Preconditions.m5382i(i >= 4 && i <= digestLength, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.bytes = i;
        this.supportsClone = m29799i(h);
    }
}
