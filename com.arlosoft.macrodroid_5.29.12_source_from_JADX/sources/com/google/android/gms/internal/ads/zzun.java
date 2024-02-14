package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzun extends zzup {

    /* renamed from: f */
    private final zzwh f38630f;

    /* renamed from: g */
    private final zzfvn f38631g;

    /* renamed from: h */
    private final zzde f38632h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected zzun(zzcp zzcp, int[] iArr, int i, zzwh zzwh, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzde zzde) {
        super(zzcp, iArr, 0);
        zzcp zzcp2 = zzcp;
        int[] iArr2 = iArr;
        this.f38630f = zzwh;
        this.f38631g = zzfvn.m51133t(list);
        this.f38632h = zzde;
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ zzfvn m55154c(zzvs[] zzvsArr) {
        int i;
        int i2;
        double d;
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i3 >= 2) {
                break;
            }
            zzvs zzvs = zzvsArr[i3];
            if (zzvs == null || zzvs.f38746b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                zzfvk m = zzfvn.m51129m();
                m.mo46428f(new zzul(0, 0));
                arrayList.add(m);
            }
            i3++;
        }
        long[][] jArr = new long[2][];
        for (int i4 = 0; i4 < 2; i4++) {
            zzvs zzvs2 = zzvsArr[i4];
            if (zzvs2 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[zzvs2.f38746b.length];
                int i5 = 0;
                while (true) {
                    int[] iArr = zzvs2.f38746b;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    jArr[i4][i5] = (long) zzvs2.f38745a.mo44231b(iArr[i5]).f24209h;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr2 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            long[] jArr3 = jArr[i6];
            jArr2[i6] = jArr3.length == 0 ? 0 : jArr3[0];
        }
        m55155d(arrayList, jArr2);
        zzfvy c2 = zzfwq.m51200b(zzfwv.m51208c()).mo46507b(2).mo46506c();
        int i7 = 0;
        while (i7 < i) {
            int length = jArr[i7].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr4 = jArr[i7];
                    double d2 = 0.0d;
                    if (i8 >= jArr4.length) {
                        break;
                    }
                    long j = jArr4[i8];
                    if (j != -1) {
                        d2 = Math.log((double) j);
                    }
                    dArr[i8] = d2;
                    i8++;
                }
                int i9 = length - 1;
                double d3 = dArr[i9] - dArr[c];
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = i10 + 1;
                    double d4 = (dArr[i10] + dArr[i11]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d4 - dArr[c]) / d3;
                    }
                    c2.mo46316a(Double.valueOf(d), Integer.valueOf(i7));
                    i10 = i11;
                    c = 0;
                }
            }
            i7++;
            c = 0;
            i = 2;
            i2 = 1;
        }
        zzfvn t = zzfvn.m51133t(c2.mo46339r());
        for (int i12 = 0; i12 < t.size(); i12++) {
            int intValue = ((Integer) t.get(i12)).intValue();
            int i13 = iArr2[intValue] + 1;
            iArr2[intValue] = i13;
            jArr2[intValue] = jArr[intValue][i13];
            m55155d(arrayList, jArr2);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j2 = jArr2[i14];
                jArr2[i14] = j2 + j2;
            }
        }
        m55155d(arrayList, jArr2);
        zzfvk m2 = zzfvn.m51129m();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            zzfvk zzfvk = (zzfvk) arrayList.get(i15);
            m2.mo46428f(zzfvk == null ? zzfvn.m51135w() : zzfvk.mo46430h());
        }
        return m2.mo46430h();
    }

    /* renamed from: d */
    private static void m55155d(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfvk zzfvk = (zzfvk) list.get(i2);
            if (zzfvk != null) {
                zzfvk.mo46428f(new zzul(j, jArr[i2]));
            }
        }
    }
}
