package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzbc;
import java.io.IOException;
import java.util.Arrays;

public final class zzdr {

    /* renamed from: f */
    private static final zzdr f45383f = new zzdr(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f45384a;

    /* renamed from: b */
    private int[] f45385b;

    /* renamed from: c */
    private Object[] f45386c;

    /* renamed from: d */
    private int f45387d;

    /* renamed from: e */
    private boolean f45388e;

    private zzdr() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    static zzdr m63621b(zzdr zzdr, zzdr zzdr2) {
        int i = zzdr.f45384a + zzdr2.f45384a;
        int[] copyOf = Arrays.copyOf(zzdr.f45385b, i);
        System.arraycopy(zzdr2.f45385b, 0, copyOf, zzdr.f45384a, zzdr2.f45384a);
        Object[] copyOf2 = Arrays.copyOf(zzdr.f45386c, i);
        System.arraycopy(zzdr2.f45386c, 0, copyOf2, zzdr.f45384a, zzdr2.f45384a);
        return new zzdr(i, copyOf, copyOf2, true);
    }

    /* renamed from: g */
    private static void m63622g(int i, Object obj, zzel zzel) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzel.mo53395z(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzel.mo53392w(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzel.mo53391v(i2, (zzw) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzel.mo53386r(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzbk.m63365d());
        } else if (zzel.mo53385q() == zzbc.zze.f45273l) {
            zzel.mo53365K(i2);
            ((zzdr) obj).mo53600h(zzel);
            zzel.mo53381m(i2);
        } else {
            zzel.mo53381m(i2);
            ((zzdr) obj).mo53600h(zzel);
            zzel.mo53365K(i2);
        }
    }

    /* renamed from: i */
    public static zzdr m63623i() {
        return f45383f;
    }

    /* renamed from: j */
    static zzdr m63624j() {
        return new zzdr();
    }

    /* renamed from: a */
    public final void mo53594a() {
        this.f45388e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo53595c(zzel zzel) throws IOException {
        if (zzel.mo53385q() == zzbc.zze.f45274m) {
            for (int i = this.f45384a - 1; i >= 0; i--) {
                zzel.mo53374f(this.f45385b[i] >>> 3, this.f45386c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f45384a; i2++) {
            zzel.mo53374f(this.f45385b[i2] >>> 3, this.f45386c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo53596d(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f45384a; i2++) {
            zzcl.m63453c(sb, i, String.valueOf(this.f45385b[i2] >>> 3), this.f45386c[i2]);
        }
    }

    /* renamed from: e */
    public final int mo53597e() {
        int i;
        int i2 = this.f45387d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f45384a; i4++) {
            int i5 = this.f45385b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zzaj.m63111Y(i6, ((Long) this.f45386c[i4]).longValue());
            } else if (i7 == 1) {
                i = zzaj.m63120f0(i6, ((Long) this.f45386c[i4]).longValue());
            } else if (i7 == 2) {
                i = zzaj.m63102H(i6, (zzw) this.f45386c[i4]);
            } else if (i7 == 3) {
                i = (zzaj.m63139w0(i6) << 1) + ((zzdr) this.f45386c[i4]).mo53597e();
            } else if (i7 == 5) {
                i = zzaj.m63127n0(i6, ((Integer) this.f45386c[i4]).intValue());
            } else {
                throw new IllegalStateException(zzbk.m63365d());
            }
            i3 += i;
        }
        this.f45387d = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzdr)) {
            return false;
        }
        zzdr zzdr = (zzdr) obj;
        int i = this.f45384a;
        if (i == zzdr.f45384a) {
            int[] iArr = this.f45385b;
            int[] iArr2 = zzdr.f45385b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f45386c;
                Object[] objArr2 = zzdr.f45386c;
                int i3 = this.f45384a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo53599f(int i, Object obj) {
        if (this.f45388e) {
            int i2 = this.f45384a;
            int[] iArr = this.f45385b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f45385b = Arrays.copyOf(iArr, i3);
                this.f45386c = Arrays.copyOf(this.f45386c, i3);
            }
            int[] iArr2 = this.f45385b;
            int i4 = this.f45384a;
            iArr2[i4] = i;
            this.f45386c[i4] = obj;
            this.f45384a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public final void mo53600h(zzel zzel) throws IOException {
        if (this.f45384a != 0) {
            if (zzel.mo53385q() == zzbc.zze.f45273l) {
                for (int i = 0; i < this.f45384a; i++) {
                    m63622g(this.f45385b[i], this.f45386c[i], zzel);
                }
                return;
            }
            for (int i2 = this.f45384a - 1; i2 >= 0; i2--) {
                m63622g(this.f45385b[i2], this.f45386c[i2], zzel);
            }
        }
    }

    public final int hashCode() {
        int i = this.f45384a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f45385b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f45386c;
        int i7 = this.f45384a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: k */
    public final int mo53602k() {
        int i = this.f45387d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f45384a; i3++) {
            i2 += zzaj.m63109T(this.f45385b[i3] >>> 3, (zzw) this.f45386c[i3]);
        }
        this.f45387d = i2;
        return i2;
    }

    private zzdr(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f45387d = -1;
        this.f45384a = i;
        this.f45385b = iArr;
        this.f45386c = objArr;
        this.f45388e = z;
    }
}
