package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzef {

    /* renamed from: f */
    private static final zzef f45723f = new zzef(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f45724a;

    /* renamed from: b */
    private int[] f45725b;

    /* renamed from: c */
    private Object[] f45726c;

    /* renamed from: d */
    private int f45727d;

    /* renamed from: e */
    private boolean f45728e;

    private zzef() {
        this(0, new int[8], new Object[8], true);
    }

    private zzef(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f45727d = -1;
        this.f45724a = i;
        this.f45725b = iArr;
        this.f45726c = objArr;
        this.f45728e = z;
    }

    /* renamed from: c */
    public static zzef m64434c() {
        return f45723f;
    }

    /* renamed from: d */
    static zzef m64435d(zzef zzef, zzef zzef2) {
        int i = zzef.f45724a + zzef2.f45724a;
        int[] copyOf = Arrays.copyOf(zzef.f45725b, i);
        System.arraycopy(zzef2.f45725b, 0, copyOf, zzef.f45724a, zzef2.f45724a);
        Object[] copyOf2 = Arrays.copyOf(zzef.f45726c, i);
        System.arraycopy(zzef2.f45726c, 0, copyOf2, zzef.f45724a, zzef2.f45724a);
        return new zzef(i, copyOf, copyOf2, true);
    }

    /* renamed from: a */
    public final int mo54051a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f45727d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f45724a; i6++) {
            int i7 = this.f45725b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f45726c[i6]).longValue();
                    i = zzbe.m64091a(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int a = zzbe.m64091a(i8 << 3);
                    int f = ((zzaw) this.f45726c[i6]).mo53831f();
                    i5 += a + zzbe.m64091a(f) + f;
                } else if (i9 == 3) {
                    int D = zzbe.m64090D(i8);
                    i3 = D + D;
                    i2 = ((zzef) this.f45726c[i6]).mo54051a();
                } else if (i9 == 5) {
                    ((Integer) this.f45726c[i6]).intValue();
                    i = zzbe.m64091a(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzcf.m64231a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f45726c[i6]).longValue();
                i3 = zzbe.m64091a(i8 << 3);
                i2 = zzbe.m64092b(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f45727d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo54052b() {
        int i = this.f45727d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f45724a; i3++) {
            int i4 = this.f45725b[i3];
            int a = zzbe.m64091a(8);
            int f = ((zzaw) this.f45726c[i3]).mo53831f();
            i2 += a + a + zzbe.m64091a(16) + zzbe.m64091a(i4 >>> 3) + zzbe.m64091a(24) + zzbe.m64091a(f) + f;
        }
        this.f45727d = i2;
        return i2;
    }

    /* renamed from: e */
    public final void mo54053e() {
        this.f45728e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzef)) {
            return false;
        }
        zzef zzef = (zzef) obj;
        int i = this.f45724a;
        if (i == zzef.f45724a) {
            int[] iArr = this.f45725b;
            int[] iArr2 = zzef.f45725b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f45726c;
                    Object[] objArr2 = zzef.f45726c;
                    int i3 = this.f45724a;
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
    /* renamed from: f */
    public final void mo54055f(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f45724a; i2++) {
            zzde.m64289b(sb, i, String.valueOf(this.f45725b[i2] >>> 3), this.f45726c[i2]);
        }
    }

    /* renamed from: g */
    public final void mo54056g(zzew zzew) throws IOException {
        if (this.f45724a != 0) {
            for (int i = 0; i < this.f45724a; i++) {
                int i2 = this.f45725b[i];
                Object obj = this.f45726c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    zzew.mo53887j(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzew.mo53883f(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzew.mo53875G(i3, (zzaw) obj);
                } else if (i4 == 3) {
                    zzew.mo53879b0(i3);
                    ((zzef) obj).mo54056g(zzew);
                    zzew.mo53873E(i3);
                } else if (i4 == 5) {
                    zzew.mo53897s(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzcf.m64231a());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.f45724a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f45725b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f45726c;
        int i7 = this.f45724a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
