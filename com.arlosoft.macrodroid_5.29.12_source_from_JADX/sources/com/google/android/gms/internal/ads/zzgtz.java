package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgtz {

    /* renamed from: f */
    private static final zzgtz f37283f = new zzgtz(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f37284a;

    /* renamed from: b */
    private int[] f37285b;

    /* renamed from: c */
    private Object[] f37286c;

    /* renamed from: d */
    private int f37287d;

    /* renamed from: e */
    private boolean f37288e;

    private zzgtz() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgtz(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f37287d = -1;
        this.f37284a = i;
        this.f37285b = iArr;
        this.f37286c = objArr;
        this.f37288e = z;
    }

    /* renamed from: c */
    public static zzgtz m53355c() {
        return f37283f;
    }

    /* renamed from: d */
    static zzgtz m53356d(zzgtz zzgtz, zzgtz zzgtz2) {
        int i = zzgtz.f37284a + zzgtz2.f37284a;
        int[] copyOf = Arrays.copyOf(zzgtz.f37285b, i);
        System.arraycopy(zzgtz2.f37285b, 0, copyOf, zzgtz.f37284a, zzgtz2.f37284a);
        Object[] copyOf2 = Arrays.copyOf(zzgtz.f37286c, i);
        System.arraycopy(zzgtz2.f37286c, 0, copyOf2, zzgtz.f37284a, zzgtz2.f37284a);
        return new zzgtz(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    static zzgtz m53357e() {
        return new zzgtz(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo47489a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f37287d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f37284a; i6++) {
            int i7 = this.f37285b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f37286c[i6]).longValue();
                    i = zzgql.m52833f(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int f = zzgql.m52833f(i8 << 3);
                    int m = ((zzgpw) this.f37286c[i6]).mo47083m();
                    i5 += f + zzgql.m52833f(m) + m;
                } else if (i9 == 3) {
                    int e = zzgql.m52832e(i8);
                    i3 = e + e;
                    i2 = ((zzgtz) this.f37286c[i6]).mo47489a();
                } else if (i9 == 5) {
                    ((Integer) this.f37286c[i6]).intValue();
                    i = zzgql.m52833f(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzgrq.m53032a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f37286c[i6]).longValue();
                i3 = zzgql.m52833f(i8 << 3);
                i2 = zzgql.m52834g(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f37287d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo47490b() {
        int i = this.f37287d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f37284a; i3++) {
            int i4 = this.f37285b[i3];
            int f = zzgql.m52833f(8);
            int m = ((zzgpw) this.f37286c[i3]).mo47083m();
            i2 += f + f + zzgql.m52833f(16) + zzgql.m52833f(i4 >>> 3) + zzgql.m52833f(24) + zzgql.m52833f(m) + m;
        }
        this.f37287d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgtz)) {
            return false;
        }
        zzgtz zzgtz = (zzgtz) obj;
        int i = this.f37284a;
        if (i == zzgtz.f37284a) {
            int[] iArr = this.f37285b;
            int[] iArr2 = zzgtz.f37285b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f37286c;
                    Object[] objArr2 = zzgtz.f37286c;
                    int i3 = this.f37284a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo47492f() {
        this.f37288e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo47493g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f37284a; i2++) {
            zzgsq.m53112b(sb, i, String.valueOf(this.f37285b[i2] >>> 3), this.f37286c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo47494h(int i, Object obj) {
        if (this.f37288e) {
            int i2 = this.f37284a;
            int[] iArr = this.f37285b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f37285b = Arrays.copyOf(iArr, i3);
                this.f37286c = Arrays.copyOf(this.f37286c, i3);
            }
            int[] iArr2 = this.f37285b;
            int i4 = this.f37284a;
            iArr2[i4] = i;
            this.f37286c[i4] = obj;
            this.f37284a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f37284a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f37285b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f37286c;
        int i7 = this.f37284a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo47496i(zzgqm zzgqm) throws IOException {
        if (this.f37284a != 0) {
            for (int i = 0; i < this.f37284a; i++) {
                int i2 = this.f37285b[i];
                Object obj = this.f37286c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    zzgqm.mo47233E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzgqm.mo47262x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzgqm.mo47253o(i3, (zzgpw) obj);
                } else if (i4 == 3) {
                    zzgqm.mo47244e(i3);
                    ((zzgtz) obj).mo47496i(zzgqm);
                    zzgqm.mo47257s(i3);
                } else if (i4 == 5) {
                    zzgqm.mo47260v(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzgrq.m53032a());
                }
            }
        }
    }
}
