package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbf {

    /* renamed from: a */
    private final String[] f2210a;

    /* renamed from: b */
    private final double[] f2211b;

    /* renamed from: c */
    private final double[] f2212c;

    /* renamed from: d */
    private final int[] f2213d;

    /* renamed from: e */
    private int f2214e = 0;

    /* synthetic */ zzbf(zzbd zzbd, zzbe zzbe) {
        int size = zzbd.f2208b.size();
        this.f2210a = (String[]) zzbd.f2207a.toArray(new String[size]);
        this.f2211b = m2576c(zzbd.f2208b);
        this.f2212c = m2576c(zzbd.f2209c);
        this.f2213d = new int[size];
    }

    /* renamed from: c */
    private static final double[] m2576c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public final List mo20322a() {
        ArrayList arrayList = new ArrayList(this.f2210a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f2210a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d = this.f2212c[i];
            double d2 = this.f2211b[i];
            int i2 = this.f2213d[i];
            arrayList.add(new zzbc(str, d, d2, ((double) i2) / ((double) this.f2214e), i2));
            i++;
        }
    }

    /* renamed from: b */
    public final void mo20323b(double d) {
        this.f2214e++;
        int i = 0;
        while (true) {
            double[] dArr = this.f2212c;
            if (i < dArr.length) {
                double d2 = dArr[i];
                if (d2 <= d && d < this.f2211b[i]) {
                    int[] iArr = this.f2213d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d >= d2) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
