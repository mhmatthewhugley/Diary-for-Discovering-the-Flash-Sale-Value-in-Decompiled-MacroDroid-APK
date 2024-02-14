package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzmp {

    /* renamed from: f */
    private static final zzmp f41725f = new zzmp(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f41726a;

    /* renamed from: b */
    private int[] f41727b;

    /* renamed from: c */
    private Object[] f41728c;

    /* renamed from: d */
    private int f41729d;

    /* renamed from: e */
    private boolean f41730e;

    private zzmp() {
        this(0, new int[8], new Object[8], true);
    }

    private zzmp(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f41729d = -1;
        this.f41726a = i;
        this.f41727b = iArr;
        this.f41728c = objArr;
        this.f41730e = z;
    }

    /* renamed from: c */
    public static zzmp m60784c() {
        return f41725f;
    }

    /* renamed from: e */
    static zzmp m60785e(zzmp zzmp, zzmp zzmp2) {
        int i = zzmp.f41726a + zzmp2.f41726a;
        int[] copyOf = Arrays.copyOf(zzmp.f41727b, i);
        System.arraycopy(zzmp2.f41727b, 0, copyOf, zzmp.f41726a, zzmp2.f41726a);
        Object[] copyOf2 = Arrays.copyOf(zzmp.f41728c, i);
        System.arraycopy(zzmp2.f41728c, 0, copyOf2, zzmp.f41726a, zzmp2.f41726a);
        return new zzmp(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    static zzmp m60786f() {
        return new zzmp(0, new int[8], new Object[8], true);
    }

    /* renamed from: l */
    private final void m60787l(int i) {
        int[] iArr = this.f41727b;
        if (i > iArr.length) {
            int i2 = this.f41726a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f41727b = Arrays.copyOf(iArr, i);
            this.f41728c = Arrays.copyOf(this.f41728c, i);
        }
    }

    /* renamed from: a */
    public final int mo51568a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f41729d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f41726a; i6++) {
            int i7 = this.f41727b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f41728c[i6]).longValue();
                    i = zzjm.m60396a(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int a = zzjm.m60396a(i8 << 3);
                    int f = ((zzje) this.f41728c[i6]).mo51336f();
                    i5 += a + zzjm.m60396a(f) + f;
                } else if (i9 == 3) {
                    int D = zzjm.m60395D(i8);
                    i3 = D + D;
                    i2 = ((zzmp) this.f41728c[i6]).mo51568a();
                } else if (i9 == 5) {
                    ((Integer) this.f41728c[i6]).intValue();
                    i = zzjm.m60396a(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzkp.m60546a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f41728c[i6]).longValue();
                i3 = zzjm.m60396a(i8 << 3);
                i2 = zzjm.m60397b(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f41729d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo51569b() {
        int i = this.f41729d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f41726a; i3++) {
            int i4 = this.f41727b[i3];
            int a = zzjm.m60396a(8);
            int f = ((zzje) this.f41728c[i3]).mo51336f();
            i2 += a + a + zzjm.m60396a(16) + zzjm.m60396a(i4 >>> 3) + zzjm.m60396a(24) + zzjm.m60396a(f) + f;
        }
        this.f41729d = i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final zzmp mo51570d(zzmp zzmp) {
        if (zzmp.equals(f41725f)) {
            return this;
        }
        mo51572g();
        int i = this.f41726a + zzmp.f41726a;
        m60787l(i);
        System.arraycopy(zzmp.f41727b, 0, this.f41727b, this.f41726a, zzmp.f41726a);
        System.arraycopy(zzmp.f41728c, 0, this.f41728c, this.f41726a, zzmp.f41726a);
        this.f41726a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmp)) {
            return false;
        }
        zzmp zzmp = (zzmp) obj;
        int i = this.f41726a;
        if (i == zzmp.f41726a) {
            int[] iArr = this.f41727b;
            int[] iArr2 = zzmp.f41727b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f41728c;
                    Object[] objArr2 = zzmp.f41728c;
                    int i3 = this.f41726a;
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

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo51572g() {
        if (!this.f41730e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void mo51573h() {
        this.f41730e = false;
    }

    public final int hashCode() {
        int i = this.f41726a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f41727b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f41728c;
        int i7 = this.f41726a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo51575i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f41726a; i2++) {
            zzlo.m60612b(sb, i, String.valueOf(this.f41727b[i2] >>> 3), this.f41728c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo51576j(int i, Object obj) {
        mo51572g();
        m60787l(this.f41726a + 1);
        int[] iArr = this.f41727b;
        int i2 = this.f41726a;
        iArr[i2] = i;
        this.f41728c[i2] = obj;
        this.f41726a = i2 + 1;
    }

    /* renamed from: k */
    public final void mo51577k(zzng zzng) throws IOException {
        if (this.f41726a != 0) {
            for (int i = 0; i < this.f41726a; i++) {
                int i2 = this.f41727b[i];
                Object obj = this.f41728c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    zzng.mo51390j(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzng.mo51386f(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzng.mo51377F(i3, (zzje) obj);
                } else if (i4 == 3) {
                    zzng.mo51382b0(i3);
                    ((zzmp) obj).mo51577k(zzng);
                    zzng.mo51376E(i3);
                } else if (i4 == 5) {
                    zzng.mo51400s(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkp.m60546a());
                }
            }
        }
    }
}
