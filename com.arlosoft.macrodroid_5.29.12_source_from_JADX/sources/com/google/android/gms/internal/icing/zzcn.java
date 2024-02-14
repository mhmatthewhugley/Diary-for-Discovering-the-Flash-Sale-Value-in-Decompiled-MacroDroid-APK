package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzcn {

    /* renamed from: a */
    private final zzcm f40805a;

    private zzcn(zzcm zzcm) {
        zzdh.m58817b(zzcm, "output");
        this.f40805a = zzcm;
        zzcm.f40804a = this;
    }

    /* renamed from: j */
    public static zzcn m58729j(zzcm zzcm) {
        zzcn zzcn = zzcm.f40804a;
        return zzcn != null ? zzcn : new zzcn(zzcm);
    }

    /* renamed from: A */
    public final void mo50249A(int i, Object obj, zzep zzep) throws IOException {
        zzee zzee = (zzee) obj;
        zzck zzck = (zzck) this.f40805a;
        zzck.mo50241r((i << 3) | 2);
        zzbs zzbs = (zzbs) zzee;
        int b = zzbs.mo50183b();
        if (b == -1) {
            b = zzep.mo50356a(zzbs);
            zzbs.mo50184c(b);
        }
        zzck.mo50241r(b);
        zzep.mo50360e(zzee, zzck.f40804a);
    }

    /* renamed from: B */
    public final void mo50250B(int i, Object obj, zzep zzep) throws IOException {
        zzcm zzcm = this.f40805a;
        zzcm.mo50230g(i, 3);
        zzep.mo50360e((zzee) obj, zzcm.f40804a);
        zzcm.mo50230g(i, 4);
    }

    /* renamed from: C */
    public final void mo50251C(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f40805a.mo50230g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzcm.m58709z(list.get(i4).intValue());
            }
            this.f40805a.mo50241r(i3);
            while (i2 < list.size()) {
                this.f40805a.mo50240q(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f40805a.mo50231h(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: D */
    public final void mo50252D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f40805a.mo50230g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f40805a.mo50241r(i3);
            while (i2 < list.size()) {
                this.f40805a.mo50242s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f40805a.mo50233j(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo50253E(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f40805a.mo50230g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzcm.m58700B(list.get(i4).longValue());
            }
            this.f40805a.mo50241r(i3);
            while (i2 < list.size()) {
                this.f40805a.mo50243t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f40805a.mo50234k(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: F */
    public final void mo50254F(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f40805a.mo50230g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzcm.m58700B(list.get(i4).longValue());
            }
            this.f40805a.mo50241r(i3);
            while (i2 < list.size()) {
                this.f40805a.mo50243t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f40805a.mo50234k(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo50255G(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f40805a.mo50230g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f40805a.mo50241r(i3);
            while (i2 < list.size()) {
                this.f40805a.mo50244u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f40805a.mo50235l(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: H */
    public final void mo50256H(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f40805a.mo50230g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f40805a.mo50241r(i3);
            while (i2 < list.size()) {
                this.f40805a.mo50242s(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f40805a.mo50233j(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    /* renamed from: I */
    public final void mo50257I(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f40805a.mo50230g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f40805a.mo50241r(i3);
            while (i2 < list.size()) {
                this.f40805a.mo50244u(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f40805a.mo50235l(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo50258a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f40805a.mo50230g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzcm.m58709z(list.get(i4).intValue());
            }
            this.f40805a.mo50241r(i3);
            while (i2 < list.size()) {
                this.f40805a.mo50240q(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f40805a.mo50231h(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo50259b(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f40805a.mo50230g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f40805a.mo50241r(i3);
            while (i2 < list.size()) {
                this.f40805a.mo50239p(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f40805a.mo50236m(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo50260c(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzdo) {
            zzdo zzdo = (zzdo) list;
            while (i2 < list.size()) {
                Object x = zzdo.mo50332x(i2);
                if (x instanceof String) {
                    this.f40805a.mo50237n(i, (String) x);
                } else {
                    this.f40805a.mo50238o(i, (zzcf) x);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f40805a.mo50237n(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo50261d(int i, List<zzcf> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f40805a.mo50238o(i, list.get(i2));
        }
    }

    /* renamed from: e */
    public final void mo50262e(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f40805a.mo50230g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzcm.m58699A(list.get(i4).intValue());
            }
            this.f40805a.mo50241r(i3);
            while (i2 < list.size()) {
                this.f40805a.mo50241r(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f40805a.mo50232i(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo50263f(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f40805a.mo50230g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f40805a.mo50241r(i3);
            while (i2 < list.size()) {
                this.f40805a.mo50242s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f40805a.mo50233j(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo50264g(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f40805a.mo50230g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f40805a.mo50241r(i3);
            while (i2 < list.size()) {
                this.f40805a.mo50244u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f40805a.mo50235l(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo50265h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f40805a.mo50230g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += zzcm.m58699A((intValue >> 31) ^ (intValue + intValue));
            }
            this.f40805a.mo50241r(i3);
            while (i2 < list.size()) {
                zzcm zzcm = this.f40805a;
                int intValue2 = list.get(i2).intValue();
                zzcm.mo50241r((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzcm zzcm2 = this.f40805a;
            int intValue3 = list.get(i2).intValue();
            zzcm2.mo50232i(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo50266i(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f40805a.mo50230g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += zzcm.m58700B((longValue >> 63) ^ (longValue + longValue));
            }
            this.f40805a.mo50241r(i3);
            while (i2 < list.size()) {
                zzcm zzcm = this.f40805a;
                long longValue2 = list.get(i2).longValue();
                zzcm.mo50243t((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzcm zzcm2 = this.f40805a;
            long longValue3 = list.get(i2).longValue();
            zzcm2.mo50234k(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo50267k(int i, int i2) throws IOException {
        this.f40805a.mo50233j(i, i2);
    }

    /* renamed from: l */
    public final void mo50268l(int i, long j) throws IOException {
        this.f40805a.mo50234k(i, j);
    }

    /* renamed from: m */
    public final void mo50269m(int i, long j) throws IOException {
        this.f40805a.mo50235l(i, j);
    }

    /* renamed from: n */
    public final void mo50270n(int i, float f) throws IOException {
        this.f40805a.mo50233j(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: o */
    public final void mo50271o(int i, double d) throws IOException {
        this.f40805a.mo50235l(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: p */
    public final void mo50272p(int i, int i2) throws IOException {
        this.f40805a.mo50231h(i, i2);
    }

    /* renamed from: q */
    public final void mo50273q(int i, long j) throws IOException {
        this.f40805a.mo50234k(i, j);
    }

    /* renamed from: r */
    public final void mo50274r(int i, int i2) throws IOException {
        this.f40805a.mo50231h(i, i2);
    }

    /* renamed from: s */
    public final void mo50275s(int i, long j) throws IOException {
        this.f40805a.mo50235l(i, j);
    }

    /* renamed from: t */
    public final void mo50276t(int i, int i2) throws IOException {
        this.f40805a.mo50233j(i, i2);
    }

    /* renamed from: u */
    public final void mo50277u(int i, boolean z) throws IOException {
        this.f40805a.mo50236m(i, z);
    }

    /* renamed from: v */
    public final void mo50278v(int i, String str) throws IOException {
        this.f40805a.mo50237n(i, str);
    }

    /* renamed from: w */
    public final void mo50279w(int i, zzcf zzcf) throws IOException {
        this.f40805a.mo50238o(i, zzcf);
    }

    /* renamed from: x */
    public final void mo50280x(int i, int i2) throws IOException {
        this.f40805a.mo50232i(i, i2);
    }

    /* renamed from: y */
    public final void mo50281y(int i, int i2) throws IOException {
        this.f40805a.mo50232i(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: z */
    public final void mo50282z(int i, long j) throws IOException {
        this.f40805a.mo50234k(i, (j >> 63) ^ (j + j));
    }
}
