package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.core.view.PointerIconCompat;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzms implements zzko {

    /* renamed from: a */
    private final zzde f37879a;

    /* renamed from: b */
    private final zzck f37880b;

    /* renamed from: c */
    private final zzcm f37881c = new zzcm();

    /* renamed from: d */
    private final zzmr f37882d;

    /* renamed from: e */
    private final SparseArray f37883e;

    /* renamed from: f */
    private zzdt f37884f;

    /* renamed from: g */
    private zzcg f37885g;

    /* renamed from: h */
    private zzdn f37886h;

    /* renamed from: i */
    private boolean f37887i;

    public zzms(zzde zzde) {
        Objects.requireNonNull(zzde);
        this.f37879a = zzde;
        this.f37884f = new zzdt(zzen.m49160e(), zzde, zzky.f37782a);
        zzck zzck = new zzck();
        this.f37880b = zzck;
        this.f37882d = new zzmr(zzck);
        this.f37883e = new SparseArray();
    }

    /* renamed from: H */
    public static /* synthetic */ void m54176H(zzms zzms) {
        zzkp E = zzms.mo47847E();
        zzms.mo47850J(E, 1028, new zzlo(E));
        zzms.f37884f.mo44969e();
    }

    /* renamed from: K */
    private final zzkp m54177K(@Nullable zzsi zzsi) {
        zzcn zzcn;
        Objects.requireNonNull(this.f37885g);
        if (zzsi == null) {
            zzcn = null;
        } else {
            zzcn = this.f37882d.mo47839a(zzsi);
        }
        if (zzsi != null && zzcn != null) {
            return mo47848F(zzcn, zzcn.mo44134n(zzsi.f27569a, this.f37880b).f28721c, zzsi);
        }
        int c = this.f37885g.mo43514c();
        zzcn n = this.f37885g.mo43525n();
        if (c >= n.mo43601c()) {
            n = zzcn.f29060a;
        }
        return mo47848F(n, c, (zzsi) null);
    }

    /* renamed from: L */
    private final zzkp m54178L(int i, @Nullable zzsi zzsi) {
        zzcg zzcg = this.f37885g;
        Objects.requireNonNull(zzcg);
        if (zzsi == null) {
            zzcn n = zzcg.mo43525n();
            if (i >= n.mo43601c()) {
                n = zzcn.f29060a;
            }
            return mo47848F(n, i, (zzsi) null);
        } else if (this.f37882d.mo47839a(zzsi) != null) {
            return m54177K(zzsi);
        } else {
            return mo47848F(zzcn.f29060a, i, zzsi);
        }
    }

    /* renamed from: M */
    private final zzkp m54179M() {
        return m54177K(this.f37882d.mo47842d());
    }

    /* renamed from: N */
    private final zzkp m54180N() {
        return m54177K(this.f37882d.mo47843e());
    }

    /* renamed from: O */
    private final zzkp m54181O(@Nullable zzbw zzbw) {
        zzbn zzbn;
        if (!(zzbw instanceof zzha) || (zzbn = ((zzha) zzbw).zzj) == null) {
            return mo47847E();
        }
        return m54177K(new zzsi(zzbn));
    }

    /* renamed from: A */
    public final void mo47806A(Object obj, long j) {
        zzkp N = m54180N();
        mo47850J(N, 26, new zzmm(N, obj, j));
    }

    /* renamed from: A0 */
    public final void mo43365A0(@Nullable zzbg zzbg, int i) {
        zzkp E = mo47847E();
        mo47850J(E, 1, new zzmb(E, zzbg, i));
    }

    @CallSuper
    /* renamed from: B */
    public final void mo47807B(zzkr zzkr) {
        this.f37884f.mo44966b(zzkr);
    }

    /* renamed from: B0 */
    public final void mo43366B0(zzt zzt) {
        zzkp E = mo47847E();
        mo47850J(E, 29, new zzlh(E, zzt));
    }

    @CallSuper
    /* renamed from: C */
    public final void mo47808C() {
        zzdn zzdn = this.f37886h;
        zzdd.m47208b(zzdn);
        zzdn.mo44716h(new zzmh(this));
    }

    /* renamed from: C0 */
    public final void mo43367C0(zzbw zzbw) {
        zzkp O = m54181O(zzbw);
        mo47850J(O, 10, new zzlt(O, zzbw));
    }

    /* renamed from: D */
    public final void mo47809D() {
        if (!this.f37887i) {
            zzkp E = mo47847E();
            this.f37887i = true;
            mo47850J(E, -1, new zzmj(E));
        }
    }

    /* renamed from: D0 */
    public final void mo43368D0(zzcc zzcc) {
        zzkp E = mo47847E();
        mo47850J(E, 13, new zzlg(E, zzcc));
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final zzkp mo47847E() {
        return m54177K(this.f37882d.mo47840b());
    }

    /* renamed from: E0 */
    public final void mo43369E0(boolean z, int i) {
        zzkp E = mo47847E();
        mo47850J(E, -1, new zzks(E, z, i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final zzkp mo47848F(zzcn zzcn, int i, @Nullable zzsi zzsi) {
        zzcn zzcn2 = zzcn;
        int i2 = i;
        boolean z = true;
        zzsi zzsi2 = true == zzcn.mo44135o() ? null : zzsi;
        long zza = this.f37879a.zza();
        if (!zzcn2.equals(this.f37885g.mo43525n()) || i2 != this.f37885g.mo43514c()) {
            z = false;
        }
        long j = 0;
        if (zzsi2 == null || !zzsi2.mo42817b()) {
            if (z) {
                j = this.f37885g.mo43520i();
            } else if (!zzcn.mo44135o()) {
                long j2 = zzcn2.mo43603e(i2, this.f37881c, 0).f28945k;
                j = zzen.m49171j0(0);
            }
        } else if (z && this.f37885g.mo43515d() == zzsi2.f27570b && this.f37885g.mo43513b() == zzsi2.f27571c) {
            j = this.f37885g.mo43521j();
        }
        return new zzkp(zza, zzcn, i, zzsi2, j, this.f37885g.mo43525n(), this.f37885g.mo43514c(), this.f37882d.mo47840b(), this.f37885g.mo43521j(), this.f37885g.mo43522k());
    }

    /* renamed from: F0 */
    public final void mo43370F0(zzcn zzcn, int i) {
        zzmr zzmr = this.f37882d;
        zzcg zzcg = this.f37885g;
        Objects.requireNonNull(zzcg);
        zzmr.mo47846i(zzcg);
        zzkp E = mo47847E();
        mo47850J(E, 0, new zzlp(E, i));
    }

    /* renamed from: G */
    public final void mo43371G(boolean z) {
        zzkp N = m54180N();
        mo47850J(N, 23, new zzlz(N, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final /* synthetic */ void mo47849I(zzcg zzcg, zzkr zzkr, zzaa zzaa) {
        zzkr.mo43962a(zzcg, new zzkq(zzaa, this.f37883e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo47850J(zzkp zzkp, int i, zzdq zzdq) {
        this.f37883e.put(i, zzkp);
        zzdt zzdt = this.f37884f;
        zzdt.mo44968d(i, zzdq);
        zzdt.mo44967c();
    }

    /* renamed from: S0 */
    public final void mo43372S0(int i) {
        zzkp E = mo47847E();
        mo47850J(E, 4, new zzma(E, i));
    }

    /* renamed from: a */
    public final void mo47810a(zzgs zzgs) {
        zzkp M = m54179M();
        mo47850J(M, PointerIconCompat.TYPE_ALL_SCROLL, new zzmg(M, zzgs));
    }

    /* renamed from: b */
    public final void mo47811b(Exception exc) {
        zzkp N = m54180N();
        mo47850J(N, 1030, new zzlb(N, exc));
    }

    /* renamed from: c */
    public final void mo47812c(String str, long j, long j2) {
        zzkp N = m54180N();
        mo47850J(N, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, new zzlm(N, str, j2, j));
    }

    /* renamed from: d */
    public final void mo47813d(zzaf zzaf, @Nullable zzgt zzgt) {
        zzkp N = m54180N();
        mo47850J(N, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, new zzkt(N, zzaf, zzgt));
    }

    /* renamed from: d0 */
    public final void mo47814d0(String str) {
        zzkp N = m54180N();
        mo47850J(N, PointerIconCompat.TYPE_NO_DROP, new zzmq(N, str));
    }

    @CallSuper
    /* renamed from: e */
    public final void mo47815e(zzkr zzkr) {
        this.f37884f.mo44970f(zzkr);
    }

    /* renamed from: f */
    public final void mo47816f(String str) {
        zzkp N = m54180N();
        mo47850J(N, PointerIconCompat.TYPE_ZOOM_OUT, new zzku(N, str));
    }

    /* renamed from: g */
    public final void mo47817g(zzgs zzgs) {
        zzkp N = m54180N();
        mo47850J(N, PointerIconCompat.TYPE_CROSSHAIR, new zzlv(N, zzgs));
    }

    /* renamed from: h */
    public final void mo47818h(long j, int i) {
        zzkp M = m54179M();
        mo47850J(M, PointerIconCompat.TYPE_GRABBING, new zzle(M, j, i));
    }

    /* renamed from: i */
    public final void mo47819i(List list, @Nullable zzsi zzsi) {
        zzmr zzmr = this.f37882d;
        zzcg zzcg = this.f37885g;
        Objects.requireNonNull(zzcg);
        zzmr.mo47845h(list, zzsi, zzcg);
    }

    /* renamed from: j */
    public final void mo47820j(Exception exc) {
        zzkp N = m54180N();
        mo47850J(N, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, new zzld(N, exc));
    }

    /* renamed from: k */
    public final void mo47821k(Exception exc) {
        zzkp N = m54180N();
        mo47850J(N, 1029, new zzlj(N, exc));
    }

    /* renamed from: l */
    public final void mo47822l(zzgs zzgs) {
        zzkp N = m54180N();
        mo47850J(N, PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, new zzlr(N, zzgs));
    }

    /* renamed from: l0 */
    public final void mo43373l0(boolean z) {
        zzkp E = mo47847E();
        mo47850J(E, 3, new zzmp(E, z));
    }

    /* renamed from: m */
    public final void mo43374m() {
        zzkp E = mo47847E();
        mo47850J(E, -1, new zzkz(E));
    }

    /* renamed from: n */
    public final void mo47823n(String str, long j, long j2) {
        zzkp N = m54180N();
        mo47850J(N, PointerIconCompat.TYPE_TEXT, new zzlu(N, str, j2, j));
    }

    /* renamed from: o */
    public final void mo47731o(int i, @Nullable zzsi zzsi, zzrz zzrz, zzse zzse, IOException iOException, boolean z) {
        zzkp L = m54178L(i, zzsi);
        mo47850J(L, 1003, new zzln(L, zzrz, zzse, iOException, z));
    }

    /* renamed from: o0 */
    public final void mo43375o0(boolean z) {
        zzkp E = mo47847E();
        mo47850J(E, 7, new zzly(E, z));
    }

    /* renamed from: p */
    public final void mo47824p(long j) {
        zzkp N = m54180N();
        mo47850J(N, PointerIconCompat.TYPE_ALIAS, new zzmi(N, j));
    }

    /* renamed from: p0 */
    public final void mo43376p0(int i, int i2) {
        zzkp N = m54180N();
        mo47850J(N, 24, new zzmn(N, i, i2));
    }

    /* renamed from: q */
    public final void mo47825q(zzaf zzaf, @Nullable zzgt zzgt) {
        zzkp N = m54180N();
        mo47850J(N, PointerIconCompat.TYPE_VERTICAL_TEXT, new zzmf(N, zzaf, zzgt));
    }

    /* renamed from: q0 */
    public final void mo43377q0(int i) {
        zzkp E = mo47847E();
        mo47850J(E, 6, new zzmo(E, i));
    }

    /* renamed from: r */
    public final void mo47732r(int i, @Nullable zzsi zzsi, zzrz zzrz, zzse zzse) {
        zzkp L = m54178L(i, zzsi);
        mo47850J(L, 1001, new zzmc(L, zzrz, zzse));
    }

    /* renamed from: r0 */
    public final void mo43378r0(int i, boolean z) {
        zzkp E = mo47847E();
        mo47850J(E, 30, new zzlk(E, i, z));
    }

    /* renamed from: s */
    public final void mo47826s(int i, long j) {
        zzkp M = m54179M();
        mo47850J(M, PointerIconCompat.TYPE_ZOOM_IN, new zzlq(M, i, j));
    }

    /* renamed from: s0 */
    public final void mo43379s0(zzda zzda) {
        zzkp N = m54180N();
        mo47850J(N, 25, new zzmk(N, zzda));
    }

    /* renamed from: t */
    public final void mo47733t(int i, @Nullable zzsi zzsi, zzrz zzrz, zzse zzse) {
        zzkp L = m54178L(i, zzsi);
        mo47850J(L, 1000, new zzlw(L, zzrz, zzse));
    }

    /* renamed from: t0 */
    public final void mo43380t0(zzcy zzcy) {
        zzkp E = mo47847E();
        mo47850J(E, 2, new zzli(E, zzcy));
    }

    /* renamed from: u */
    public final void mo47734u(int i, @Nullable zzsi zzsi, zzse zzse) {
        zzkp L = m54178L(i, zzsi);
        mo47850J(L, 1004, new zzla(L, zzse));
    }

    /* renamed from: u0 */
    public final void mo43381u0(float f) {
        zzkp N = m54180N();
        mo47850J(N, 22, new zzkw(N, f));
    }

    /* renamed from: v */
    public final void mo47827v(zzgs zzgs) {
        zzkp M = m54179M();
        mo47850J(M, PointerIconCompat.TYPE_GRAB, new zzml(M, zzgs));
    }

    /* renamed from: v0 */
    public final void mo43382v0(zzbm zzbm) {
        zzkp E = mo47847E();
        mo47850J(E, 14, new zzme(E, zzbm));
    }

    /* renamed from: w */
    public final void mo47735w(int i, @Nullable zzsi zzsi, zzrz zzrz, zzse zzse) {
        zzkp L = m54178L(i, zzsi);
        mo47850J(L, 1002, new zzls(L, zzrz, zzse));
    }

    /* renamed from: w0 */
    public final void mo43383w0(zzcf zzcf, zzcf zzcf2, int i) {
        if (i == 1) {
            this.f37887i = false;
            i = 1;
        }
        zzmr zzmr = this.f37882d;
        zzcg zzcg = this.f37885g;
        Objects.requireNonNull(zzcg);
        zzmr.mo47844g(zzcg);
        zzkp E = mo47847E();
        mo47850J(E, 11, new zzlf(E, i, zzcf, zzcf2));
    }

    /* renamed from: x */
    public final void mo47828x(int i, long j, long j2) {
        zzkp N = m54180N();
        mo47850J(N, 1011, new zzkv(N, i, j, j2));
    }

    /* renamed from: x0 */
    public final void mo43384x0(zzby zzby) {
        zzkp E = mo47847E();
        mo47850J(E, 12, new zzkx(E, zzby));
    }

    /* renamed from: y */
    public final void mo47851y(int i, long j, long j2) {
        zzkp K = m54177K(this.f37882d.mo47841c());
        mo47850J(K, 1006, new zzlc(K, i, j, j2));
    }

    /* renamed from: y0 */
    public final void mo43385y0(boolean z, int i) {
        zzkp E = mo47847E();
        mo47850J(E, 5, new zzlx(E, z, i));
    }

    @CallSuper
    /* renamed from: z */
    public final void mo47829z(zzcg zzcg, Looper looper) {
        boolean z = true;
        if (this.f37885g != null && !this.f37882d.f37874b.isEmpty()) {
            z = false;
        }
        zzdd.m47212f(z);
        Objects.requireNonNull(zzcg);
        this.f37885g = zzcg;
        this.f37886h = this.f37879a.mo44586a(looper, (Handler.Callback) null);
        this.f37884f = this.f37884f.mo44965a(looper, new zzll(this, zzcg));
    }

    /* renamed from: z0 */
    public final void mo43386z0(@Nullable zzbw zzbw) {
        zzkp O = m54181O(zzbw);
        mo47850J(O, 10, new zzmd(O, zzbw));
    }
}
