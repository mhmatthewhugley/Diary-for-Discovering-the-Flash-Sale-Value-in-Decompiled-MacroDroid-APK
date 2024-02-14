package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.location.LocationRequestCompat;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzgr implements zzka, zzkb {

    /* renamed from: A */
    private long f37141A = Long.MIN_VALUE;

    /* renamed from: B */
    private boolean f37142B;

    /* renamed from: C */
    private boolean f37143C;

    /* renamed from: a */
    private final int f37144a;

    /* renamed from: c */
    private final zzjg f37145c = new zzjg();
    @Nullable

    /* renamed from: d */
    private zzkc f37146d;

    /* renamed from: f */
    private int f37147f;

    /* renamed from: g */
    private zznb f37148g;

    /* renamed from: o */
    private int f37149o;
    @Nullable

    /* renamed from: p */
    private zztz f37150p;
    @Nullable

    /* renamed from: s */
    private zzaf[] f37151s;

    /* renamed from: z */
    private long f37152z;

    public zzgr(int i) {
        this.f37144a = i;
    }

    /* renamed from: l */
    private final void m52935l(long j, boolean z) throws zzha {
        this.f37142B = false;
        this.f37141A = j;
        mo47332x(j, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo47300A() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo47301B(zzaf[] zzafArr, long j, long j2) throws zzha {
        throw null;
    }

    /* renamed from: F */
    public final void mo47302F() {
        zzdd.m47212f(this.f37149o == 0);
        zzjg zzjg = this.f37145c;
        zzjg.f37625b = null;
        zzjg.f37624a = null;
        mo47333y();
    }

    /* renamed from: J */
    public final boolean mo47303J() {
        return this.f37141A == Long.MIN_VALUE;
    }

    /* renamed from: P */
    public final void mo47304P() throws zzha {
        boolean z = true;
        if (this.f37149o != 1) {
            z = false;
        }
        zzdd.m47212f(z);
        this.f37149o = 2;
        mo47334z();
    }

    /* renamed from: Q */
    public final int mo47305Q() {
        return this.f37149o;
    }

    /* renamed from: R */
    public final boolean mo47306R() {
        return this.f37142B;
    }

    /* renamed from: S */
    public final void mo47307S(long j) throws zzha {
        m52935l(j, false);
    }

    /* renamed from: U */
    public /* synthetic */ void mo47308U(float f, float f2) {
    }

    /* renamed from: V */
    public final void mo47309V(zzaf[] zzafArr, zztz zztz, long j, long j2) throws zzha {
        zzdd.m47212f(!this.f37142B);
        this.f37150p = zztz;
        if (this.f37141A == Long.MIN_VALUE) {
            this.f37141A = j;
        }
        this.f37151s = zzafArr;
        this.f37152z = j2;
        mo47301B(zzafArr, j, j2);
    }

    /* renamed from: W */
    public final void mo47310W(int i, zznb zznb) {
        this.f37147f = i;
        this.f37148g = zznb;
    }

    /* renamed from: X */
    public final void mo47311X(zzkc zzkc, zzaf[] zzafArr, zztz zztz, long j, boolean z, boolean z2, long j2, long j3) throws zzha {
        boolean z3 = z;
        zzdd.m47212f(this.f37149o == 0);
        this.f37146d = zzkc;
        this.f37149o = 1;
        mo47331w(z, z2);
        mo47309V(zzafArr, zztz, j2, j3);
        long j4 = j;
        m52935l(j, z);
    }

    /* renamed from: b */
    public int mo47312b() throws zzha {
        return 0;
    }

    /* renamed from: c */
    public final long mo47313c() {
        return this.f37141A;
    }

    /* renamed from: e */
    public void mo47314e(int i, @Nullable Object obj) throws zzha {
    }

    @Nullable
    /* renamed from: g */
    public zzji mo47315g() {
        return null;
    }

    /* renamed from: h */
    public final zzkb mo47316h() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo47317i() {
        if (mo47303J()) {
            return this.f37142B;
        }
        zztz zztz = this.f37150p;
        Objects.requireNonNull(zztz);
        return zztz.mo48124b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final zzaf[] mo47318j() {
        zzaf[] zzafArr = this.f37151s;
        Objects.requireNonNull(zzafArr);
        return zzafArr;
    }

    /* renamed from: j0 */
    public final void mo47319j0() {
        this.f37142B = true;
    }

    @Nullable
    /* renamed from: k */
    public final zztz mo47320k() {
        return this.f37150p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo47321m(zzjg zzjg, zzgi zzgi, int i) {
        zztz zztz = this.f37150p;
        Objects.requireNonNull(zztz);
        int a = zztz.mo48123a(zzjg, zzgi, i);
        if (a == -4) {
            if (zzgi.mo46725g()) {
                this.f37141A = Long.MIN_VALUE;
                return this.f37142B ? -4 : -3;
            }
            long j = zzgi.f36863e + this.f37152z;
            zzgi.f36863e = j;
            this.f37141A = Math.max(this.f37141A, j);
        } else if (a == -5) {
            zzaf zzaf = zzjg.f37624a;
            Objects.requireNonNull(zzaf);
            long j2 = zzaf.f24217p;
            if (j2 != LocationRequestCompat.PASSIVE_INTERVAL) {
                zzad b = zzaf.mo41422b();
                b.mo41347w(j2 + this.f37152z);
                zzjg.f37624a = b.mo41349y();
                return -5;
            }
        }
        return a;
    }

    /* renamed from: n */
    public final void mo47322n() {
        boolean z = true;
        if (this.f37149o != 1) {
            z = false;
        }
        zzdd.m47212f(z);
        zzjg zzjg = this.f37145c;
        zzjg.f37625b = null;
        zzjg.f37624a = null;
        this.f37149o = 0;
        this.f37150p = null;
        this.f37151s = null;
        this.f37142B = false;
        mo47330v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final zzha mo47323o(Throwable th, @Nullable zzaf zzaf, boolean z, int i) {
        int i2;
        if (zzaf != null && !this.f37143C) {
            this.f37143C = true;
            try {
                int d = mo47775d(zzaf) & 7;
                this.f37143C = false;
                i2 = d;
            } catch (zzha unused) {
                this.f37143C = false;
            } catch (Throwable th2) {
                this.f37143C = false;
                throw th2;
            }
            return zzha.m53675b(th, mo47770L(), this.f37147f, zzaf, i2, z, i);
        }
        i2 = 4;
        return zzha.m53675b(th, mo47770L(), this.f37147f, zzaf, i2, z, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo47324p(long j) {
        zztz zztz = this.f37150p;
        Objects.requireNonNull(zztz);
        return zztz.mo48125c(j - this.f37152z);
    }

    /* renamed from: q */
    public final void mo47325q() throws IOException {
        zztz zztz = this.f37150p;
        Objects.requireNonNull(zztz);
        zztz.mo48126d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final zzjg mo47326r() {
        zzjg zzjg = this.f37145c;
        zzjg.f37625b = null;
        zzjg.f37624a = null;
        return zzjg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final zzkc mo47327s() {
        zzkc zzkc = this.f37146d;
        Objects.requireNonNull(zzkc);
        return zzkc;
    }

    /* renamed from: t */
    public final void mo47328t() {
        zzdd.m47212f(this.f37149o == 2);
        this.f37149o = 1;
        mo47300A();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final zznb mo47329u() {
        zznb zznb = this.f37148g;
        Objects.requireNonNull(zznb);
        return zznb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo47330v() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo47331w(boolean z, boolean z2) throws zzha {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo47332x(long j, boolean z) throws zzha {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo47333y() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo47334z() throws zzha {
    }

    public final int zzb() {
        return this.f37144a;
    }
}
