package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzjn implements zzng {

    /* renamed from: a */
    private final zzjm f41553a;

    private zzjn(zzjm zzjm) {
        zzkn.m60543f(zzjm, "output");
        this.f41553a = zzjm;
        zzjm.f41552a = this;
    }

    /* renamed from: I */
    public static zzjn m60422I(zzjm zzjm) {
        zzjn zzjn = zzjm.f41552a;
        return zzjn != null ? zzjn : new zzjn(zzjm);
    }

    /* renamed from: A */
    public final void mo51372A(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41553a.mo51365s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjm.m60397b(((Long) list.get(i4)).longValue());
            }
            this.f41553a.mo51367u(i3);
            while (i2 < list.size()) {
                this.f41553a.mo51369w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41553a.mo51368v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo51373B(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41553a.mo51365s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f41553a.mo51367u(i3);
            while (i2 < list.size()) {
                this.f41553a.mo51358l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41553a.mo51357k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: C */
    public final void mo51374C(int i, long j) throws IOException {
        this.f41553a.mo51368v(i, j);
    }

    /* renamed from: D */
    public final void mo51375D(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41553a.mo51365s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += zzjm.m60397b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f41553a.mo51367u(i3);
            while (i2 < list.size()) {
                zzjm zzjm = this.f41553a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                zzjm.mo51369w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzjm zzjm2 = this.f41553a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzjm2.mo51368v(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: E */
    public final void mo51376E(int i) throws IOException {
        this.f41553a.mo51365s(i, 4);
    }

    /* renamed from: F */
    public final void mo51377F(int i, zzje zzje) throws IOException {
        this.f41553a.mo51356j(i, zzje);
    }

    /* renamed from: G */
    public final void mo51378G(int i, Object obj, zzlx zzlx) throws IOException {
        zzjm zzjm = this.f41553a;
        zzjm.mo51365s(i, 3);
        zzlx.mo51516h((zzlm) obj, zzjm.f41552a);
        zzjm.mo51365s(i, 4);
    }

    /* renamed from: H */
    public final void mo51379H(int i, Object obj, zzlx zzlx) throws IOException {
        zzlm zzlm = (zzlm) obj;
        zzjj zzjj = (zzjj) this.f41553a;
        zzjj.mo51367u((i << 3) | 2);
        zzjj.mo51367u(((zzio) zzlm).mo51305f(zzlx));
        zzlx.mo51516h(zzlm, zzjj.f41552a);
    }

    /* renamed from: a */
    public final void mo51380a(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41553a.mo51365s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f41553a.mo51367u(i3);
            while (i2 < list.size()) {
                this.f41553a.mo51354h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41553a.mo51355i(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo51381b(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41553a.mo51365s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f41553a.mo51367u(i3);
            while (i2 < list.size()) {
                this.f41553a.mo51360n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41553a.mo51359m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Deprecated
    /* renamed from: b0 */
    public final void mo51382b0(int i) throws IOException {
        this.f41553a.mo51365s(i, 3);
    }

    /* renamed from: c */
    public final void mo51383c(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41553a.mo51365s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f41553a.mo51367u(i3);
            while (i2 < list.size()) {
                this.f41553a.mo51358l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41553a.mo51357k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo51384d(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41553a.mo51365s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjm.m60402z(((Integer) list.get(i4)).intValue());
            }
            this.f41553a.mo51367u(i3);
            while (i2 < list.size()) {
                this.f41553a.mo51362p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41553a.mo51361o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo51385e(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41553a.mo51365s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f41553a.mo51367u(i3);
            while (i2 < list.size()) {
                this.f41553a.mo51360n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41553a.mo51359m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo51386f(int i, long j) throws IOException {
        this.f41553a.mo51359m(i, j);
    }

    /* renamed from: g */
    public final void mo51387g(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f41553a.mo51356j(i, (zzje) list.get(i2));
        }
    }

    /* renamed from: h */
    public final void mo51388h(int i, boolean z) throws IOException {
        this.f41553a.mo51355i(i, z);
    }

    /* renamed from: i */
    public final void mo51389i(int i, String str) throws IOException {
        this.f41553a.mo51364r(i, str);
    }

    /* renamed from: j */
    public final void mo51390j(int i, long j) throws IOException {
        this.f41553a.mo51368v(i, j);
    }

    /* renamed from: k */
    public final void mo51391k(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41553a.mo51365s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjm.m60402z(((Integer) list.get(i4)).intValue());
            }
            this.f41553a.mo51367u(i3);
            while (i2 < list.size()) {
                this.f41553a.mo51362p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41553a.mo51361o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo51392l(int i, double d) throws IOException {
        this.f41553a.mo51359m(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: m */
    public final void mo51393m(int i, int i2) throws IOException {
        this.f41553a.mo51357k(i, i2);
    }

    /* renamed from: n */
    public final void mo51394n(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41553a.mo51365s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjm.m60397b(((Long) list.get(i4)).longValue());
            }
            this.f41553a.mo51367u(i3);
            while (i2 < list.size()) {
                this.f41553a.mo51369w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41553a.mo51368v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo51395o(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41553a.mo51365s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f41553a.mo51367u(i3);
            while (i2 < list.size()) {
                this.f41553a.mo51358l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41553a.mo51357k(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: p */
    public final void mo51396p(int i, long j) throws IOException {
        this.f41553a.mo51368v(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: p0 */
    public final void mo51397p0(int i, int i2) throws IOException {
        this.f41553a.mo51361o(i, i2);
    }

    /* renamed from: q */
    public final void mo51398q(int i, int i2) throws IOException {
        this.f41553a.mo51366t(i, i2);
    }

    /* renamed from: r */
    public final void mo51399r(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41553a.mo51365s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f41553a.mo51367u(i3);
            while (i2 < list.size()) {
                this.f41553a.mo51360n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41553a.mo51359m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: s */
    public final void mo51400s(int i, int i2) throws IOException {
        this.f41553a.mo51357k(i, i2);
    }

    /* renamed from: t */
    public final void mo51401t(int i, long j) throws IOException {
        this.f41553a.mo51359m(i, j);
    }

    /* renamed from: u */
    public final void mo51402u(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41553a.mo51365s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjm.m60396a(((Integer) list.get(i4)).intValue());
            }
            this.f41553a.mo51367u(i3);
            while (i2 < list.size()) {
                this.f41553a.mo51367u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41553a.mo51366t(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo51403v(int i, int i2) throws IOException {
        this.f41553a.mo51366t(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: w */
    public final void mo51404w(int i, int i2) throws IOException {
        this.f41553a.mo51361o(i, i2);
    }

    /* renamed from: x */
    public final void mo51405x(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof zzku) {
            zzku zzku = (zzku) list;
            while (i2 < list.size()) {
                Object y = zzku.mo51484y(i2);
                if (y instanceof String) {
                    this.f41553a.mo51364r(i, (String) y);
                } else {
                    this.f41553a.mo51356j(i, (zzje) y);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41553a.mo51364r(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: y */
    public final void mo51406y(int i, float f) throws IOException {
        this.f41553a.mo51357k(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: z */
    public final void mo51407z(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41553a.mo51365s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += zzjm.m60396a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f41553a.mo51367u(i3);
            while (i2 < list.size()) {
                zzjm zzjm = this.f41553a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zzjm.mo51367u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzjm zzjm2 = this.f41553a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zzjm2.mo51366t(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }
}
