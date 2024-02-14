package com.google.android.gms.internal.nearby;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zztb {

    /* renamed from: a */
    private final String f45126a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final char[] f45127b;

    /* renamed from: c */
    final int f45128c;

    /* renamed from: d */
    final int f45129d;

    /* renamed from: e */
    final int f45130e;

    /* renamed from: f */
    final int f45131f;

    /* renamed from: g */
    private final byte[] f45132g;

    /* renamed from: h */
    private final boolean[] f45133h;

    zztb(String str, char[] cArr) {
        this.f45126a = str;
        Objects.requireNonNull(cArr);
        this.f45127b = cArr;
        try {
            int length = cArr.length;
            int b = zztj.m63067b(length, RoundingMode.UNNECESSARY);
            this.f45129d = b;
            int min = Math.min(8, Integer.lowestOneBit(b));
            try {
                this.f45130e = 8 / min;
                this.f45131f = b / min;
                this.f45128c = length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                int i = 0;
                while (true) {
                    boolean z = true;
                    if (i >= cArr.length) {
                        break;
                    }
                    char c = cArr[i];
                    zzsg.m62987e(c < 128, "Non-ASCII character: %s", c);
                    if (bArr[c] != -1) {
                        z = false;
                    }
                    zzsg.m62987e(z, "Duplicate character: %s", c);
                    bArr[c] = (byte) i;
                    i++;
                }
                this.f45132g = bArr;
                boolean[] zArr = new boolean[this.f45130e];
                for (int i2 = 0; i2 < this.f45131f; i2++) {
                    zArr[zztj.m63066a(i2 * 8, this.f45129d, RoundingMode.CEILING)] = true;
                }
                this.f45133h = zArr;
            } catch (ArithmeticException e) {
                throw new IllegalArgumentException("Illegal alphabet ".concat(new String(cArr)), e);
            }
        } catch (ArithmeticException e2) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final char mo53290a(int i) {
        return this.f45127b[i];
    }

    /* renamed from: b */
    public final boolean mo53291b(char c) {
        return c < 128 && this.f45132g[c] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zztb) {
            return Arrays.equals(this.f45127b, ((zztb) obj).f45127b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45127b);
    }

    public final String toString() {
        return this.f45126a;
    }
}
