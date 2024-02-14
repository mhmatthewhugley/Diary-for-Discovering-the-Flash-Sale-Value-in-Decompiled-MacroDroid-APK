package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzbf implements zzew {

    /* renamed from: a */
    private final zzbe f45555a;

    private zzbf(zzbe zzbe) {
        zzcd.m64227f(zzbe, "output");
        this.f45555a = zzbe;
        zzbe.f45554a = this;
    }

    /* renamed from: I */
    public static zzbf m64117I(zzbe zzbe) {
        zzbf zzbf = zzbe.f45554a;
        return zzbf != null ? zzbf : new zzbf(zzbe);
    }

    /* renamed from: A */
    public final void mo53869A(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45555a.mo53862s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbe.m64092b(((Long) list.get(i4)).longValue());
            }
            this.f45555a.mo53864u(i3);
            while (i2 < list.size()) {
                this.f45555a.mo53866w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45555a.mo53865v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo53870B(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45555a.mo53862s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f45555a.mo53864u(i3);
            while (i2 < list.size()) {
                this.f45555a.mo53855l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45555a.mo53854k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: C */
    public final void mo53871C(int i, long j) throws IOException {
        this.f45555a.mo53865v(i, j);
    }

    /* renamed from: D */
    public final void mo53872D(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45555a.mo53862s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += zzbe.m64092b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f45555a.mo53864u(i3);
            while (i2 < list.size()) {
                zzbe zzbe = this.f45555a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                zzbe.mo53866w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzbe zzbe2 = this.f45555a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzbe2.mo53865v(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: E */
    public final void mo53873E(int i) throws IOException {
        this.f45555a.mo53862s(i, 4);
    }

    /* renamed from: F */
    public final void mo53874F(int i, Object obj, zzdn zzdn) throws IOException {
        zzdc zzdc = (zzdc) obj;
        zzbb zzbb = (zzbb) this.f45555a;
        zzbb.mo53864u((i << 3) | 2);
        zzag zzag = (zzag) zzdc;
        int b = zzag.mo53799b();
        if (b == -1) {
            b = zzdn.mo53996a(zzag);
            zzag.mo53800d(b);
        }
        zzbb.mo53864u(b);
        zzdn.mo53997b(zzdc, zzbb.f45554a);
    }

    /* renamed from: G */
    public final void mo53875G(int i, zzaw zzaw) throws IOException {
        this.f45555a.mo53853j(i, zzaw);
    }

    /* renamed from: H */
    public final void mo53876H(int i, Object obj, zzdn zzdn) throws IOException {
        zzbe zzbe = this.f45555a;
        zzbe.mo53862s(i, 3);
        zzdn.mo53997b((zzdc) obj, zzbe.f45554a);
        zzbe.mo53862s(i, 4);
    }

    /* renamed from: a */
    public final void mo53877a(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45555a.mo53862s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f45555a.mo53864u(i3);
            while (i2 < list.size()) {
                this.f45555a.mo53851h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45555a.mo53852i(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo53878b(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45555a.mo53862s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f45555a.mo53864u(i3);
            while (i2 < list.size()) {
                this.f45555a.mo53857n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45555a.mo53856m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Deprecated
    /* renamed from: b0 */
    public final void mo53879b0(int i) throws IOException {
        this.f45555a.mo53862s(i, 3);
    }

    /* renamed from: c */
    public final void mo53880c(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45555a.mo53862s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f45555a.mo53864u(i3);
            while (i2 < list.size()) {
                this.f45555a.mo53855l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45555a.mo53854k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo53881d(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45555a.mo53862s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbe.m64097z(((Integer) list.get(i4)).intValue());
            }
            this.f45555a.mo53864u(i3);
            while (i2 < list.size()) {
                this.f45555a.mo53859p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45555a.mo53858o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo53882e(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45555a.mo53862s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f45555a.mo53864u(i3);
            while (i2 < list.size()) {
                this.f45555a.mo53857n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45555a.mo53856m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo53883f(int i, long j) throws IOException {
        this.f45555a.mo53856m(i, j);
    }

    /* renamed from: g */
    public final void mo53884g(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f45555a.mo53853j(i, (zzaw) list.get(i2));
        }
    }

    /* renamed from: h */
    public final void mo53885h(int i, boolean z) throws IOException {
        this.f45555a.mo53852i(i, z);
    }

    /* renamed from: i */
    public final void mo53886i(int i, String str) throws IOException {
        this.f45555a.mo53861r(i, str);
    }

    /* renamed from: j */
    public final void mo53887j(int i, long j) throws IOException {
        this.f45555a.mo53865v(i, j);
    }

    /* renamed from: k */
    public final void mo53888k(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45555a.mo53862s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbe.m64097z(((Integer) list.get(i4)).intValue());
            }
            this.f45555a.mo53864u(i3);
            while (i2 < list.size()) {
                this.f45555a.mo53859p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45555a.mo53858o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo53889l(int i, double d) throws IOException {
        this.f45555a.mo53856m(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: m */
    public final void mo53890m(int i, int i2) throws IOException {
        this.f45555a.mo53854k(i, i2);
    }

    /* renamed from: n */
    public final void mo53891n(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45555a.mo53862s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbe.m64092b(((Long) list.get(i4)).longValue());
            }
            this.f45555a.mo53864u(i3);
            while (i2 < list.size()) {
                this.f45555a.mo53866w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45555a.mo53865v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo53892o(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45555a.mo53862s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f45555a.mo53864u(i3);
            while (i2 < list.size()) {
                this.f45555a.mo53855l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45555a.mo53854k(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: p */
    public final void mo53893p(int i, long j) throws IOException {
        this.f45555a.mo53865v(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: p0 */
    public final void mo53894p0(int i, int i2) throws IOException {
        this.f45555a.mo53858o(i, i2);
    }

    /* renamed from: q */
    public final void mo53895q(int i, int i2) throws IOException {
        this.f45555a.mo53863t(i, i2);
    }

    /* renamed from: r */
    public final void mo53896r(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45555a.mo53862s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f45555a.mo53864u(i3);
            while (i2 < list.size()) {
                this.f45555a.mo53857n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45555a.mo53856m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: s */
    public final void mo53897s(int i, int i2) throws IOException {
        this.f45555a.mo53854k(i, i2);
    }

    /* renamed from: t */
    public final void mo53898t(int i, long j) throws IOException {
        this.f45555a.mo53856m(i, j);
    }

    /* renamed from: u */
    public final void mo53899u(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45555a.mo53862s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbe.m64091a(((Integer) list.get(i4)).intValue());
            }
            this.f45555a.mo53864u(i3);
            while (i2 < list.size()) {
                this.f45555a.mo53864u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45555a.mo53863t(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo53900v(int i, int i2) throws IOException {
        this.f45555a.mo53863t(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: w */
    public final void mo53901w(int i, int i2) throws IOException {
        this.f45555a.mo53858o(i, i2);
    }

    /* renamed from: x */
    public final void mo53902x(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof zzck) {
            zzck zzck = (zzck) list;
            while (i2 < list.size()) {
                Object y = zzck.mo53971y(i2);
                if (y instanceof String) {
                    this.f45555a.mo53861r(i, (String) y);
                } else {
                    this.f45555a.mo53853j(i, (zzaw) y);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45555a.mo53861r(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: y */
    public final void mo53903y(int i, float f) throws IOException {
        this.f45555a.mo53854k(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: z */
    public final void mo53904z(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45555a.mo53862s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += zzbe.m64091a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f45555a.mo53864u(i3);
            while (i2 < list.size()) {
                zzbe zzbe = this.f45555a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zzbe.mo53864u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzbe zzbe2 = this.f45555a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zzbe2.mo53863t(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }
}
