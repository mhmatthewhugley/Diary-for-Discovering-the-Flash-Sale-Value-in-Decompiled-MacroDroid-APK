package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgqm {

    /* renamed from: a */
    private final zzgql f37066a;

    private zzgqm(zzgql zzgql) {
        zzgro.m53028f(zzgql, "output");
        this.f37066a = zzgql;
        zzgql.f37065a = this;
    }

    /* renamed from: l */
    public static zzgqm m52859l(zzgql zzgql) {
        zzgqm zzgqm = zzgql.f37065a;
        return zzgqm != null ? zzgqm : new zzgqm(zzgql);
    }

    /* renamed from: A */
    public final void mo47229A(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f37066a.mo47224z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f37066a.mo47207B(i3);
            while (i2 < list.size()) {
                this.f37066a.mo47217s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f37066a.mo47216r(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo47230B(int i, Object obj, zzgth zzgth) throws IOException {
        zzgql zzgql = this.f37066a;
        zzgql.mo47224z(i, 3);
        zzgth.mo47420i((zzgso) obj, zzgql.f37065a);
        zzgql.mo47224z(i, 4);
    }

    /* renamed from: C */
    public final void mo47231C(int i, int i2) throws IOException {
        this.f37066a.mo47220v(i, i2);
    }

    /* renamed from: D */
    public final void mo47232D(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f37066a.mo47224z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgql.m52827G(((Integer) list.get(i4)).intValue());
            }
            this.f37066a.mo47207B(i3);
            while (i2 < list.size()) {
                this.f37066a.mo47221w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f37066a.mo47220v(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo47233E(int i, long j) throws IOException {
        this.f37066a.mo47208C(i, j);
    }

    /* renamed from: F */
    public final void mo47234F(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f37066a.mo47224z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgql.m52834g(((Long) list.get(i4)).longValue());
            }
            this.f37066a.mo47207B(i3);
            while (i2 < list.size()) {
                this.f37066a.mo47209D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f37066a.mo47208C(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo47235G(int i, Object obj, zzgth zzgth) throws IOException {
        this.f37066a.mo47222x(i, (zzgso) obj, zzgth);
    }

    /* renamed from: H */
    public final void mo47236H(int i, int i2) throws IOException {
        this.f37066a.mo47216r(i, i2);
    }

    /* renamed from: I */
    public final void mo47237I(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f37066a.mo47224z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f37066a.mo47207B(i3);
            while (i2 < list.size()) {
                this.f37066a.mo47217s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f37066a.mo47216r(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void mo47238J(int i, long j) throws IOException {
        this.f37066a.mo47218t(i, j);
    }

    /* renamed from: K */
    public final void mo47239K(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f37066a.mo47224z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f37066a.mo47207B(i3);
            while (i2 < list.size()) {
                this.f37066a.mo47219u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f37066a.mo47218t(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo47240a(int i, int i2) throws IOException {
        this.f37066a.mo47206A(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: b */
    public final void mo47241b(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f37066a.mo47224z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += zzgql.m52833f((intValue >> 31) ^ (intValue + intValue));
            }
            this.f37066a.mo47207B(i3);
            while (i2 < list.size()) {
                zzgql zzgql = this.f37066a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zzgql.mo47207B((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzgql zzgql2 = this.f37066a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zzgql2.mo47206A(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo47242c(int i, long j) throws IOException {
        this.f37066a.mo47208C(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: d */
    public final void mo47243d(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f37066a.mo47224z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += zzgql.m52834g((longValue >> 63) ^ (longValue + longValue));
            }
            this.f37066a.mo47207B(i3);
            while (i2 < list.size()) {
                zzgql zzgql = this.f37066a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                zzgql.mo47209D((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzgql zzgql2 = this.f37066a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzgql2.mo47208C(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: e */
    public final void mo47244e(int i) throws IOException {
        this.f37066a.mo47224z(i, 3);
    }

    /* renamed from: f */
    public final void mo47245f(int i, String str) throws IOException {
        this.f37066a.mo47223y(i, str);
    }

    /* renamed from: g */
    public final void mo47246g(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof zzgrw) {
            zzgrw zzgrw = (zzgrw) list;
            while (i2 < list.size()) {
                Object y = zzgrw.mo47383y(i2);
                if (y instanceof String) {
                    this.f37066a.mo47223y(i, (String) y);
                } else {
                    this.f37066a.mo47215p(i, (zzgpw) y);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f37066a.mo47223y(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo47247h(int i, int i2) throws IOException {
        this.f37066a.mo47206A(i, i2);
    }

    /* renamed from: i */
    public final void mo47248i(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f37066a.mo47224z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgql.m52833f(((Integer) list.get(i4)).intValue());
            }
            this.f37066a.mo47207B(i3);
            while (i2 < list.size()) {
                this.f37066a.mo47207B(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f37066a.mo47206A(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo47249j(int i, long j) throws IOException {
        this.f37066a.mo47208C(i, j);
    }

    /* renamed from: k */
    public final void mo47250k(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f37066a.mo47224z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgql.m52834g(((Long) list.get(i4)).longValue());
            }
            this.f37066a.mo47207B(i3);
            while (i2 < list.size()) {
                this.f37066a.mo47209D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f37066a.mo47208C(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo47251m(int i, boolean z) throws IOException {
        this.f37066a.mo47214o(i, z);
    }

    /* renamed from: n */
    public final void mo47252n(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f37066a.mo47224z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f37066a.mo47207B(i3);
            while (i2 < list.size()) {
                this.f37066a.mo47213n(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f37066a.mo47214o(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo47253o(int i, zzgpw zzgpw) throws IOException {
        this.f37066a.mo47215p(i, zzgpw);
    }

    /* renamed from: p */
    public final void mo47254p(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f37066a.mo47215p(i, (zzgpw) list.get(i2));
        }
    }

    /* renamed from: q */
    public final void mo47255q(int i, double d) throws IOException {
        this.f37066a.mo47218t(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void mo47256r(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f37066a.mo47224z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f37066a.mo47207B(i3);
            while (i2 < list.size()) {
                this.f37066a.mo47219u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f37066a.mo47218t(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: s */
    public final void mo47257s(int i) throws IOException {
        this.f37066a.mo47224z(i, 4);
    }

    /* renamed from: t */
    public final void mo47258t(int i, int i2) throws IOException {
        this.f37066a.mo47220v(i, i2);
    }

    /* renamed from: u */
    public final void mo47259u(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f37066a.mo47224z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgql.m52827G(((Integer) list.get(i4)).intValue());
            }
            this.f37066a.mo47207B(i3);
            while (i2 < list.size()) {
                this.f37066a.mo47221w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f37066a.mo47220v(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo47260v(int i, int i2) throws IOException {
        this.f37066a.mo47216r(i, i2);
    }

    /* renamed from: w */
    public final void mo47261w(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f37066a.mo47224z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f37066a.mo47207B(i3);
            while (i2 < list.size()) {
                this.f37066a.mo47217s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f37066a.mo47216r(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo47262x(int i, long j) throws IOException {
        this.f37066a.mo47218t(i, j);
    }

    /* renamed from: y */
    public final void mo47263y(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f37066a.mo47224z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f37066a.mo47207B(i3);
            while (i2 < list.size()) {
                this.f37066a.mo47219u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f37066a.mo47218t(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo47264z(int i, float f) throws IOException {
        this.f37066a.mo47216r(i, Float.floatToRawIntBits(f));
    }
}
