package com.google.android.gms.internal.mlkit_translate;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzao {

    /* renamed from: a */
    private final String f43110a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final char[] f43111b;

    /* renamed from: c */
    final int f43112c;

    /* renamed from: d */
    final int f43113d;

    /* renamed from: e */
    final int f43114e;

    /* renamed from: f */
    private final byte[] f43115f;

    /* renamed from: g */
    private final boolean[] f43116g;

    zzao(String str, char[] cArr) {
        this.f43110a = str;
        Objects.requireNonNull(cArr);
        this.f43111b = cArr;
        try {
            int b = zzax.m61605b(cArr.length, RoundingMode.UNNECESSARY);
            this.f43112c = b;
            int min = Math.min(8, Integer.lowestOneBit(b));
            try {
                this.f43113d = 8 / min;
                this.f43114e = b / min;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                int i = 0;
                while (true) {
                    boolean z = true;
                    if (i >= cArr.length) {
                        break;
                    }
                    char c = cArr[i];
                    zzj.m61891d(c < 128, "Non-ASCII character: %s", c);
                    if (bArr[c] != -1) {
                        z = false;
                    }
                    zzj.m61891d(z, "Duplicate character: %s", c);
                    bArr[c] = (byte) i;
                    i++;
                }
                this.f43115f = bArr;
                boolean[] zArr = new boolean[this.f43113d];
                for (int i2 = 0; i2 < this.f43114e; i2++) {
                    zArr[zzax.m61604a(i2 * 8, this.f43112c, RoundingMode.CEILING)] = true;
                }
                this.f43116g = zArr;
            } catch (ArithmeticException e) {
                throw new IllegalArgumentException("Illegal alphabet ".concat(new String(cArr)), e);
            }
        } catch (ArithmeticException e2) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final char mo52055a(int i) {
        return this.f43111b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo52056b(char c) throws zzar {
        if (c <= 127) {
            byte b = this.f43115f[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                throw new zzar("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
            }
            throw new zzar("Unrecognized character: " + c);
        }
        throw new zzar("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo52057c(int i) {
        return this.f43116g[i % this.f43113d];
    }

    /* renamed from: d */
    public final boolean mo52058d(char c) {
        return c < 128 && this.f43115f[c] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzao) {
            return Arrays.equals(this.f43111b, ((zzao) obj).f43111b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f43111b);
    }

    public final String toString() {
        return this.f43110a;
    }
}
