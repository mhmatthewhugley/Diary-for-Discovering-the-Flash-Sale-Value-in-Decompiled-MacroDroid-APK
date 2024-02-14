package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfuy {
    /* renamed from: a */
    static int m51067a(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* renamed from: b */
    static int m51068b(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int b = zzfvf.m51101b(obj);
        int i4 = b & i;
        int c = m51069c(obj3, i4);
        if (c != 0) {
            int i5 = ~i;
            int i6 = b & i5;
            int i7 = -1;
            while (true) {
                i2 = c - 1;
                i3 = iArr[i2];
                if ((i3 & i5) != i6 || !zzfss.m50929a(obj, objArr[i2]) || (objArr2 != null && !zzfss.m50929a(obj2, objArr2[i2]))) {
                    int i8 = i3 & i;
                    if (i8 == 0) {
                        break;
                    }
                    int i9 = i8;
                    i7 = i2;
                    c = i9;
                }
            }
            int i10 = i3 & i;
            if (i7 == -1) {
                m51071e(obj3, i4, i10);
            } else {
                iArr[i7] = (i10 & i) | (iArr[i7] & i5);
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: c */
    static int m51069c(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: d */
    static Object m51070d(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i);
        } else if (i <= 256) {
            return new byte[i];
        } else {
            return i <= 65536 ? new short[i] : new int[i];
        }
    }

    /* renamed from: e */
    static void m51071e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
