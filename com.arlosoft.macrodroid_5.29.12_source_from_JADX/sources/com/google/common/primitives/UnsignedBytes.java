package com.google.common.primitives;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.nio.ByteOrder;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class UnsignedBytes {

    @VisibleForTesting
    static class LexicographicalComparatorHolder {

        /* renamed from: a */
        static final String f53246a = LexicographicalComparatorHolder.class.getName().concat("$UnsafeComparator");

        /* renamed from: b */
        static final Comparator<byte[]> f53247b = m73669a();

        enum PureJavaComparator implements Comparator<byte[]> {
            INSTANCE;

            /* renamed from: d */
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                for (int i = 0; i < min; i++) {
                    int a = UnsignedBytes.m73666a(bArr[i], bArr2[i]);
                    if (a != 0) {
                        return a;
                    }
                }
                return bArr.length - bArr2.length;
            }

            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        @VisibleForTesting
        enum UnsafeComparator implements Comparator<byte[]> {
            INSTANCE;
            

            /* renamed from: c */
            static final boolean f53251c = false;

            /* renamed from: d */
            static final Unsafe f53252d = null;

            /* renamed from: f */
            static final int f53253f = 0;

            static {
                Class<byte[]> cls;
                f53251c = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
                Unsafe e = m73673e();
                f53252d = e;
                int arrayBaseOffset = e.arrayBaseOffset(cls);
                f53253f = arrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || arrayBaseOffset % 8 != 0 || e.arrayIndexScale(cls) != 1) {
                    throw new Error();
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
                return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.C109211());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
                throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
            /* renamed from: e */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static sun.misc.Unsafe m73673e() {
                /*
                    sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
                    return r0
                L_0x0005:
                    com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1 r0 = new com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1     // Catch:{ PrivilegedActionException -> 0x0011 }
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.m73673e():sun.misc.Unsafe");
            }

            /* renamed from: d */
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                int i = min & -8;
                int i2 = 0;
                while (i2 < i) {
                    Unsafe unsafe = f53252d;
                    int i3 = f53253f;
                    long j = (long) i2;
                    long j2 = unsafe.getLong(bArr, ((long) i3) + j);
                    long j3 = unsafe.getLong(bArr2, ((long) i3) + j);
                    if (j2 == j3) {
                        i2 += 8;
                    } else if (f53251c) {
                        return UnsignedLongs.m73686a(j2, j3);
                    } else {
                        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j2 ^ j3) & -8;
                        return ((int) ((j2 >>> numberOfTrailingZeros) & 255)) - ((int) ((j3 >>> numberOfTrailingZeros) & 255));
                    }
                }
                while (i2 < min) {
                    int a = UnsignedBytes.m73666a(bArr[i2], bArr2[i2]);
                    if (a != 0) {
                        return a;
                    }
                    i2++;
                }
                return bArr.length - bArr2.length;
            }

            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        LexicographicalComparatorHolder() {
        }

        /* renamed from: a */
        static Comparator<byte[]> m73669a() {
            try {
                Object[] enumConstants = Class.forName(f53246a).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return UnsignedBytes.m73667b();
            }
        }
    }

    private UnsignedBytes() {
    }

    /* renamed from: a */
    public static int m73666a(byte b, byte b2) {
        return m73668c(b) - m73668c(b2);
    }

    @VisibleForTesting
    /* renamed from: b */
    static Comparator<byte[]> m73667b() {
        return LexicographicalComparatorHolder.PureJavaComparator.INSTANCE;
    }

    /* renamed from: c */
    public static int m73668c(byte b) {
        return b & 255;
    }
}
