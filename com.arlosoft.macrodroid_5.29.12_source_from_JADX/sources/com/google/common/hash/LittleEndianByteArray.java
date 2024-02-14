package com.google.common.hash;

import com.google.common.primitives.Longs;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
final class LittleEndianByteArray {

    /* renamed from: a */
    private static final LittleEndianBytes f17551a;

    private enum JavaLittleEndianBytes implements LittleEndianBytes {
        INSTANCE {
            /* renamed from: b */
            public long mo37032b(byte[] bArr, int i) {
                return Longs.m73634d(bArr[i + 7], bArr[i + 6], bArr[i + 5], bArr[i + 4], bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
            }
        }
    }

    private interface LittleEndianBytes {
        /* renamed from: b */
        long mo37032b(byte[] bArr, int i);
    }

    private enum UnsafeByteArray implements LittleEndianBytes {
        UNSAFE_LITTLE_ENDIAN {
            /* renamed from: b */
            public long mo37032b(byte[] bArr, int i) {
                return UnsafeByteArray.f17556d.getLong(bArr, ((long) i) + ((long) UnsafeByteArray.f17557f));
            }
        },
        UNSAFE_BIG_ENDIAN {
            /* renamed from: b */
            public long mo37032b(byte[] bArr, int i) {
                return Long.reverseBytes(UnsafeByteArray.f17556d.getLong(bArr, ((long) i) + ((long) UnsafeByteArray.f17557f)));
            }
        };
        
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final Unsafe f17556d = null;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final int f17557f = 0;

        static {
            Class<byte[]> cls;
            Unsafe g = m29778g();
            f17556d = g;
            f17557f = g.arrayBaseOffset(cls);
            if (g.arrayIndexScale(cls) != 1) {
                throw new AssertionError();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.C72243());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static sun.misc.Unsafe m29778g() {
            /*
                sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
                return r0
            L_0x0005:
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$3 r0 = new com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$3     // Catch:{ PrivilegedActionException -> 0x0011 }
                r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0011 }
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0011 }
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x0011 }
                return r0
            L_0x0011:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.m29778g():sun.misc.Unsafe");
        }
    }

    static {
        LittleEndianBytes littleEndianBytes = JavaLittleEndianBytes.INSTANCE;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                littleEndianBytes = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? UnsafeByteArray.UNSAFE_LITTLE_ENDIAN : UnsafeByteArray.UNSAFE_BIG_ENDIAN;
            }
        } catch (Throwable unused) {
        }
        f17551a = littleEndianBytes;
    }

    private LittleEndianByteArray() {
    }

    /* renamed from: a */
    static int m29769a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: b */
    static long m29770b(byte[] bArr, int i) {
        return f17551a.mo37032b(bArr, i);
    }

    /* renamed from: c */
    static long m29771c(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, 8);
        long j = 0;
        for (int i3 = 0; i3 < min; i3++) {
            j |= (((long) bArr[i + i3]) & 255) << (i3 * 8);
        }
        return j;
    }
}
