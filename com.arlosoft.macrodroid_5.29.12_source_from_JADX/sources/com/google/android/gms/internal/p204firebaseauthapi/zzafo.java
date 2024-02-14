package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzafo {

    /* renamed from: f */
    private static final zzafo f39837f = new zzafo(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f39838a;

    /* renamed from: b */
    private int[] f39839b;

    /* renamed from: c */
    private Object[] f39840c;

    /* renamed from: d */
    private int f39841d;

    /* renamed from: e */
    private boolean f39842e;

    private zzafo() {
        this(0, new int[8], new Object[8], true);
    }

    private zzafo(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f39841d = -1;
        this.f39838a = i;
        this.f39839b = iArr;
        this.f39840c = objArr;
        this.f39842e = z;
    }

    /* renamed from: c */
    public static zzafo m56764c() {
        return f39837f;
    }

    /* renamed from: e */
    static zzafo m56765e(zzafo zzafo, zzafo zzafo2) {
        int i = zzafo.f39838a + zzafo2.f39838a;
        int[] copyOf = Arrays.copyOf(zzafo.f39839b, i);
        System.arraycopy(zzafo2.f39839b, 0, copyOf, zzafo.f39838a, zzafo2.f39838a);
        Object[] copyOf2 = Arrays.copyOf(zzafo.f39840c, i);
        System.arraycopy(zzafo2.f39840c, 0, copyOf2, zzafo.f39838a, zzafo2.f39838a);
        return new zzafo(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    static zzafo m56766f() {
        return new zzafo(0, new int[8], new Object[8], true);
    }

    /* renamed from: l */
    private final void m56767l(int i) {
        int[] iArr = this.f39839b;
        if (i > iArr.length) {
            int i2 = this.f39838a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f39839b = Arrays.copyOf(iArr, i);
            this.f39840c = Arrays.copyOf(this.f39840c, i);
        }
    }

    /* renamed from: a */
    public final int mo49211a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f39841d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f39838a; i6++) {
            int i7 = this.f39839b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f39840c[i6]).longValue();
                    i = zzacn.m56312f(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int f = zzacn.m56312f(i8 << 3);
                    int f2 = ((zzacc) this.f39840c[i6]).mo48893f();
                    i5 += f + zzacn.m56312f(f2) + f2;
                } else if (i9 == 3) {
                    int e = zzacn.m56311e(i8);
                    i3 = e + e;
                    i2 = ((zzafo) this.f39840c[i6]).mo49211a();
                } else if (i9 == 5) {
                    ((Integer) this.f39840c[i6]).intValue();
                    i = zzacn.m56312f(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzadn.m56465a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f39840c[i6]).longValue();
                i3 = zzacn.m56312f(i8 << 3);
                i2 = zzacn.m56313g(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f39841d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo49212b() {
        int i = this.f39841d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f39838a; i3++) {
            int i4 = this.f39839b[i3];
            int f = zzacn.m56312f(8);
            int f2 = ((zzacc) this.f39840c[i3]).mo48893f();
            i2 += f + f + zzacn.m56312f(16) + zzacn.m56312f(i4 >>> 3) + zzacn.m56312f(24) + zzacn.m56312f(f2) + f2;
        }
        this.f39841d = i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final zzafo mo49213d(zzafo zzafo) {
        if (zzafo.equals(f39837f)) {
            return this;
        }
        mo49215g();
        int i = this.f39838a + zzafo.f39838a;
        m56767l(i);
        System.arraycopy(zzafo.f39839b, 0, this.f39839b, this.f39838a, zzafo.f39838a);
        System.arraycopy(zzafo.f39840c, 0, this.f39840c, this.f39838a, zzafo.f39838a);
        this.f39838a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzafo)) {
            return false;
        }
        zzafo zzafo = (zzafo) obj;
        int i = this.f39838a;
        if (i == zzafo.f39838a) {
            int[] iArr = this.f39839b;
            int[] iArr2 = zzafo.f39839b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f39840c;
                    Object[] objArr2 = zzafo.f39840c;
                    int i3 = this.f39838a;
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
    public final void mo49215g() {
        if (!this.f39842e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void mo49216h() {
        this.f39842e = false;
    }

    public final int hashCode() {
        int i = this.f39838a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f39839b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f39840c;
        int i7 = this.f39838a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo49218i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f39838a; i2++) {
            zzaem.m56536b(sb, i, String.valueOf(this.f39839b[i2] >>> 3), this.f39840c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo49219j(int i, Object obj) {
        mo49215g();
        m56767l(this.f39838a + 1);
        int[] iArr = this.f39839b;
        int i2 = this.f39838a;
        iArr[i2] = i;
        this.f39840c[i2] = obj;
        this.f39838a = i2 + 1;
    }

    /* renamed from: k */
    public final void mo49220k(zzaco zzaco) throws IOException {
        if (this.f39838a != 0) {
            for (int i = 0; i < this.f39838a; i++) {
                int i2 = this.f39839b[i];
                Object obj = this.f39840c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    zzaco.mo49000E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzaco.mo49029x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzaco.mo49020o(i3, (zzacc) obj);
                } else if (i4 == 3) {
                    zzaco.mo49011e(i3);
                    ((zzafo) obj).mo49220k(zzaco);
                    zzaco.mo49024s(i3);
                } else if (i4 == 5) {
                    zzaco.mo49027v(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzadn.m56465a());
                }
            }
        }
    }
}
