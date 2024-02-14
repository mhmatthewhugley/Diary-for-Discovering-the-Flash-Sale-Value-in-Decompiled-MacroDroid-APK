package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzbc;
import java.io.IOException;
import java.util.List;
import java.util.Map;

final class zzam implements zzel {

    /* renamed from: a */
    private final zzaj f45173a;

    private zzam(zzaj zzaj) {
        zzaj zzaj2 = (zzaj) zzbd.m63344e(zzaj, "output");
        this.f45173a = zzaj2;
        zzaj2.f45161a = this;
    }

    /* renamed from: O */
    public static zzam m63205O(zzaj zzaj) {
        zzam zzam = zzaj.f45161a;
        if (zzam != null) {
            return zzam;
        }
        return new zzam(zzaj);
    }

    /* renamed from: A */
    public final void mo53355A(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45173a.mo53353z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m63098C0(list.get(i4).intValue());
            }
            this.f45173a.mo53350t0(i3);
            while (i2 < list.size()) {
                this.f45173a.mo53349s0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45173a.mo53329O(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo53356B(int i, List<?> list, zzda zzda) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo53368N(i, list.get(i2), zzda);
        }
    }

    /* renamed from: C */
    public final void mo53357C(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45173a.mo53353z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m63130q(list.get(i4).doubleValue());
            }
            this.f45173a.mo53350t0(i3);
            while (i2 < list.size()) {
                this.f45173a.mo53338g(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45173a.mo53339h(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: D */
    public final void mo53358D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45173a.mo53353z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m63143y0(list.get(i4).intValue());
            }
            this.f45173a.mo53350t0(i3);
            while (i2 < list.size()) {
                this.f45173a.mo53350t0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45173a.mo53332V(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo53359E(int i, String str) throws IOException {
        this.f45173a.mo53346n(i, str);
    }

    /* renamed from: F */
    public final void mo53360F(int i, Object obj, zzda zzda) throws IOException {
        this.f45173a.mo53343l(i, (zzck) obj, zzda);
    }

    /* renamed from: G */
    public final void mo53361G(int i, int i2) throws IOException {
        this.f45173a.mo53337d0(i, i2);
    }

    /* renamed from: H */
    public final void mo53362H(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45173a.mo53353z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m63115c0(list.get(i4).longValue());
            }
            this.f45173a.mo53350t0(i3);
            while (i2 < list.size()) {
                this.f45173a.mo53324D(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45173a.mo53341j(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: I */
    public final void mo53363I(int i, int i2) throws IOException {
        this.f45173a.mo53329O(i, i2);
    }

    /* renamed from: J */
    public final void mo53364J(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45173a.mo53353z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m63112Z(list.get(i4).longValue());
            }
            this.f45173a.mo53350t0(i3);
            while (i2 < list.size()) {
                this.f45173a.mo53324D(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45173a.mo53341j(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: K */
    public final void mo53365K(int i) throws IOException {
        this.f45173a.mo53353z(i, 3);
    }

    /* renamed from: L */
    public final void mo53366L(int i, List<?> list, zzda zzda) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo53360F(i, list.get(i2), zzda);
        }
    }

    /* renamed from: M */
    public final void mo53367M(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45173a.mo53353z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m63124j0(list.get(i4).longValue());
            }
            this.f45173a.mo53350t0(i3);
            while (i2 < list.size()) {
                this.f45173a.mo53333W(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45173a.mo53330P(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: N */
    public final void mo53368N(int i, Object obj, zzda zzda) throws IOException {
        zzaj zzaj = this.f45173a;
        zzaj.mo53353z(i, 3);
        zzda.mo53541g((zzck) obj, zzaj.f45161a);
        zzaj.mo53353z(i, 4);
    }

    /* renamed from: a */
    public final void mo53369a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45173a.mo53353z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m63096A0(list.get(i4).intValue());
            }
            this.f45173a.mo53350t0(i3);
            while (i2 < list.size()) {
                this.f45173a.mo53352v0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45173a.mo53337d0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo53370b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45173a.mo53353z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m63144z0(list.get(i4).intValue());
            }
            this.f45173a.mo53350t0(i3);
            while (i2 < list.size()) {
                this.f45173a.mo53351u0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45173a.mo53335a0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo53371c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45173a.mo53353z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m63097B0(list.get(i4).intValue());
            }
            this.f45173a.mo53350t0(i3);
            while (i2 < list.size()) {
                this.f45173a.mo53352v0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45173a.mo53337d0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo53372d(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45173a.mo53353z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m63105K(list.get(i4).booleanValue());
            }
            this.f45173a.mo53350t0(i3);
            while (i2 < list.size()) {
                this.f45173a.mo53326F(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45173a.mo53323C(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo53373e(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45173a.mo53353z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m63107R(list.get(i4).floatValue());
            }
            this.f45173a.mo53350t0(i3);
            while (i2 < list.size()) {
                this.f45173a.mo53328N(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45173a.mo53340i(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo53374f(int i, Object obj) throws IOException {
        if (obj instanceof zzw) {
            this.f45173a.mo53322B(i, (zzw) obj);
        } else {
            this.f45173a.mo53342k(i, (zzck) obj);
        }
    }

    /* renamed from: g */
    public final void mo53375g(int i, long j) throws IOException {
        this.f45173a.mo53330P(i, j);
    }

    /* renamed from: h */
    public final void mo53376h(int i, double d) throws IOException {
        this.f45173a.mo53339h(i, d);
    }

    /* renamed from: i */
    public final void mo53377i(int i, long j) throws IOException {
        this.f45173a.mo53341j(i, j);
    }

    /* renamed from: j */
    public final void mo53378j(int i, float f) throws IOException {
        this.f45173a.mo53340i(i, f);
    }

    /* renamed from: k */
    public final void mo53379k(int i, List<zzw> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f45173a.mo53344m(i, list.get(i2));
        }
    }

    /* renamed from: l */
    public final void mo53380l(int i, long j) throws IOException {
        this.f45173a.mo53321A(i, j);
    }

    /* renamed from: m */
    public final void mo53381m(int i) throws IOException {
        this.f45173a.mo53353z(i, 4);
    }

    /* renamed from: n */
    public final <K, V> void mo53382n(int i, zzcb<K, V> zzcb, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.f45173a.mo53353z(i, 2);
            this.f45173a.mo53350t0(zzcc.m63410a(zzcb, next.getKey(), next.getValue()));
            zzcc.m63411b(this.f45173a, zzcb, next.getKey(), next.getValue());
        }
    }

    /* renamed from: o */
    public final void mo53383o(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45173a.mo53353z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m63141x0(list.get(i4).intValue());
            }
            this.f45173a.mo53350t0(i3);
            while (i2 < list.size()) {
                this.f45173a.mo53349s0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45173a.mo53329O(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: p */
    public final void mo53384p(int i, int i2) throws IOException {
        this.f45173a.mo53335a0(i, i2);
    }

    /* renamed from: q */
    public final int mo53385q() {
        return zzbc.zze.f45273l;
    }

    /* renamed from: r */
    public final void mo53386r(int i, int i2) throws IOException {
        this.f45173a.mo53337d0(i, i2);
    }

    /* renamed from: r0 */
    public final void mo53387r0(int i, boolean z) throws IOException {
        this.f45173a.mo53323C(i, z);
    }

    /* renamed from: s */
    public final void mo53388s(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45173a.mo53353z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m63126l0(list.get(i4).longValue());
            }
            this.f45173a.mo53350t0(i3);
            while (i2 < list.size()) {
                this.f45173a.mo53333W(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45173a.mo53330P(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: t */
    public final void mo53389t(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzbr) {
            zzbr zzbr = (zzbr) list;
            while (i2 < list.size()) {
                Object c0 = zzbr.mo53491c0(i2);
                if (c0 instanceof String) {
                    this.f45173a.mo53346n(i, (String) c0);
                } else {
                    this.f45173a.mo53344m(i, (zzw) c0);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45173a.mo53346n(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: u */
    public final void mo53390u(int i, int i2) throws IOException {
        this.f45173a.mo53329O(i, i2);
    }

    /* renamed from: v */
    public final void mo53391v(int i, zzw zzw) throws IOException {
        this.f45173a.mo53344m(i, zzw);
    }

    /* renamed from: w */
    public final void mo53392w(int i, long j) throws IOException {
        this.f45173a.mo53330P(i, j);
    }

    /* renamed from: x */
    public final void mo53393x(int i, int i2) throws IOException {
        this.f45173a.mo53332V(i, i2);
    }

    /* renamed from: y */
    public final void mo53394y(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45173a.mo53353z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m63121g0(list.get(i4).longValue());
            }
            this.f45173a.mo53350t0(i3);
            while (i2 < list.size()) {
                this.f45173a.mo53331Q(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45173a.mo53321A(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo53395z(int i, long j) throws IOException {
        this.f45173a.mo53341j(i, j);
    }
}
