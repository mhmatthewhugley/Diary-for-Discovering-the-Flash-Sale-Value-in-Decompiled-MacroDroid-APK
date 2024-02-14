package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzayz extends zzazd {

    /* renamed from: e */
    private final AtomicReference f26333e;

    public zzayz() {
        this((zzaze) null);
    }

    /* renamed from: g */
    protected static boolean m42864g(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    /* renamed from: h */
    private static int m42865h(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final zzayx[] mo42270e(zzatc[] zzatcArr, zzayt[] zzaytArr, int[][][] iArr) throws zzasi {
        zzaza zzaza;
        zzaza zzaza2;
        int[] iArr2;
        ArrayList arrayList;
        zzays zzays;
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3 = 2;
        zzayx[] zzayxArr = new zzayx[2];
        zzayy zzayy = (zzayy) this.f26333e.get();
        int i4 = 0;
        boolean z3 = false;
        while (true) {
            int i5 = -1;
            int i6 = 1;
            if (i4 >= i3) {
                break;
            }
            if (zzatcArr[i4].mo41889a() == i3) {
                if (!z3) {
                    zzatc zzatc = zzatcArr[i4];
                    zzayt zzayt = zzaytArr[i4];
                    int[][] iArr3 = iArr[i4];
                    int i7 = zzayy.f26325d;
                    int i8 = -1;
                    int i9 = 0;
                    zzays zzays2 = null;
                    int i10 = 0;
                    int i11 = 0;
                    while (i9 < zzayt.f26315a) {
                        zzays b = zzayt.mo42258b(i9);
                        int i12 = b.f26311a;
                        ArrayList arrayList2 = new ArrayList(i6);
                        for (int i13 = 0; i13 <= 0; i13++) {
                            arrayList2.add(Integer.valueOf(i13));
                        }
                        int[] iArr4 = iArr3[i9];
                        int i14 = 0;
                        while (i14 <= 0) {
                            zzayt zzayt2 = zzayt;
                            if (m42864g(iArr4[i14], true)) {
                                zzasw b2 = b.mo42254b(i14);
                                if (arrayList2.contains(Integer.valueOf(i14))) {
                                    int i15 = b2.f25504A;
                                    zzays = b;
                                    z2 = true;
                                    z = true;
                                } else {
                                    zzays = b;
                                    z2 = true;
                                    z = false;
                                }
                                if (z2 != z) {
                                    arrayList = arrayList2;
                                    i = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i = 2;
                                }
                                iArr2 = iArr4;
                                boolean g = m42864g(iArr4[i14], false);
                                if (g) {
                                    i += 1000;
                                }
                                boolean z4 = i > i11;
                                if (i == i11) {
                                    if (b2.mo41965a() != i8) {
                                        i2 = m42865h(b2.mo41965a(), i8);
                                    } else {
                                        i2 = m42865h(b2.f25523c, i5);
                                    }
                                    z4 = !g || !z ? i2 < 0 : i2 > 0;
                                }
                                if (z4) {
                                    i5 = b2.f25523c;
                                    i8 = b2.mo41965a();
                                    i11 = i;
                                    i10 = i14;
                                    zzays2 = zzays;
                                }
                            } else {
                                zzays = b;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i14++;
                            zzayt = zzayt2;
                            b = zzays;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        zzayt zzayt3 = zzayt;
                        i9++;
                        i6 = 1;
                    }
                    if (zzays2 == null) {
                        zzaza2 = null;
                    } else {
                        zzaza2 = new zzaza(zzays2, i10, 0, (Object) null);
                    }
                    zzayxArr[i4] = zzaza2;
                    z3 = zzaza2 != null;
                }
                int i16 = zzaytArr[i4].f26315a;
            }
            i4++;
            i3 = 2;
        }
        int i17 = 0;
        boolean z5 = false;
        while (i17 < i3) {
            if (zzatcArr[i17].mo41889a() == 1 && !z5) {
                zzayt zzayt4 = zzaytArr[i17];
                int[][] iArr5 = iArr[i17];
                String str = zzayy.f26322a;
                int i18 = 0;
                int i19 = 0;
                int i20 = -1;
                int i21 = -1;
                while (i18 < zzayt4.f26315a) {
                    zzays b3 = zzayt4.mo42258b(i18);
                    int[] iArr6 = iArr5[i18];
                    int i22 = i21;
                    int i23 = i20;
                    int i24 = i19;
                    int i25 = 0;
                    while (true) {
                        int i26 = b3.f26311a;
                        if (i25 > 0) {
                            break;
                        }
                        if (m42864g(iArr6[i25], true)) {
                            zzasw b4 = b3.mo42254b(i25);
                            int i27 = iArr6[i25];
                            int i28 = 1 != (b4.f25518O & 1) ? 1 : 2;
                            if (m42864g(i27, false)) {
                                i28 += 1000;
                            }
                            if (i28 > i24) {
                                i23 = i18;
                                i22 = i25;
                                i24 = i28;
                            }
                        }
                        i25++;
                    }
                    i18++;
                    i19 = i24;
                    i20 = i23;
                    i21 = i22;
                }
                if (i20 == -1) {
                    zzaza = null;
                } else {
                    zzaza = new zzaza(zzayt4.mo42258b(i20), i21, 0, (Object) null);
                }
                zzayxArr[i17] = zzaza;
                z5 = zzaza != null;
            }
            i17++;
            i3 = 2;
        }
        return zzayxArr;
    }

    public zzayz(zzaze zzaze) {
        this.f26333e = new AtomicReference(new zzayy());
    }
}
