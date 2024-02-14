package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.util.Arrays;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

@ElementTypesAreNonnullByDefault
public final class Hashing {

    /* renamed from: a */
    static final int f17540a = ((int) System.currentTimeMillis());

    @Immutable
    enum ChecksumType implements ImmutableSupplier<Checksum> {
        CRC_32("Hashing.crc32()") {
            /* renamed from: d */
            public Checksum get() {
                return new CRC32();
            }
        },
        ADLER_32("Hashing.adler32()") {
            /* renamed from: d */
            public Checksum get() {
                return new Adler32();
            }
        };
        
        public final HashFunction hashFunction;

        private ChecksumType(String str) {
            this.hashFunction = new ChecksumHashFunction(this, 32, str);
        }
    }

    private static final class ConcatenatedHashFunction extends AbstractCompositeHashFunction {
        /* renamed from: b */
        public int mo36981b() {
            int i = 0;
            for (HashFunction b : this.f17504a) {
                i += b.mo36981b();
            }
            return i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ConcatenatedHashFunction) {
                return Arrays.equals(this.f17504a, ((ConcatenatedHashFunction) obj).f17504a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f17504a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public HashCode mo36959i(Hasher[] hasherArr) {
            byte[] bArr = new byte[(mo36981b() / 8)];
            int i = 0;
            for (Hasher g : hasherArr) {
                HashCode g2 = g.mo36963g();
                i += g2.mo37016j(bArr, i, g2.mo37011d() / 8);
            }
            return HashCode.m29715f(bArr);
        }
    }

    private static final class LinearCongruentialGenerator {
    }

    private static class Md5Holder {

        /* renamed from: a */
        static final HashFunction f17544a = new MessageDigestHashFunction(KeyPropertiesCompact.DIGEST_MD5, "Hashing.md5()");

        private Md5Holder() {
        }
    }

    private static class Sha1Holder {

        /* renamed from: a */
        static final HashFunction f17545a = new MessageDigestHashFunction(KeyPropertiesCompact.DIGEST_SHA1, "Hashing.sha1()");

        private Sha1Holder() {
        }
    }

    private static class Sha256Holder {

        /* renamed from: a */
        static final HashFunction f17546a = new MessageDigestHashFunction(KeyPropertiesCompact.DIGEST_SHA256, "Hashing.sha256()");

        private Sha256Holder() {
        }
    }

    private static class Sha384Holder {

        /* renamed from: a */
        static final HashFunction f17547a = new MessageDigestHashFunction(KeyPropertiesCompact.DIGEST_SHA384, "Hashing.sha384()");

        private Sha384Holder() {
        }
    }

    private static class Sha512Holder {

        /* renamed from: a */
        static final HashFunction f17548a = new MessageDigestHashFunction(KeyPropertiesCompact.DIGEST_SHA512, "Hashing.sha512()");

        private Sha512Holder() {
        }
    }

    private Hashing() {
    }

    @Deprecated
    /* renamed from: a */
    public static HashFunction m29758a() {
        return Md5Holder.f17544a;
    }

    /* renamed from: b */
    public static HashFunction m29759b() {
        return Murmur3_128HashFunction.f17570a;
    }
}
