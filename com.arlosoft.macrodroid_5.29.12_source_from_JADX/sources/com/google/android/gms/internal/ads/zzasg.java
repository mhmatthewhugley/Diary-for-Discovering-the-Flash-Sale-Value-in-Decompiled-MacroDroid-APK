package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzasg implements zzatb, zzatc {

    /* renamed from: a */
    private final int f25398a;

    /* renamed from: b */
    private zzatd f25399b;

    /* renamed from: c */
    private int f25400c;

    /* renamed from: d */
    private int f25401d;

    /* renamed from: e */
    private zzayo f25402e;

    /* renamed from: f */
    private long f25403f;

    /* renamed from: g */
    private boolean f25404g = true;

    /* renamed from: h */
    private boolean f25405h;

    public zzasg(int i) {
        this.f25398a = i;
    }

    /* renamed from: F */
    public final boolean mo41881F() {
        return this.f25404g;
    }

    /* renamed from: H */
    public final void mo41882H() throws zzasi {
        boolean z = true;
        if (this.f25401d != 1) {
            z = false;
        }
        zzbac.m42926e(z);
        this.f25401d = 2;
        mo41904q();
    }

    /* renamed from: I */
    public final void mo41883I() throws zzasi {
        zzbac.m42926e(this.f25401d == 2);
        this.f25401d = 1;
        mo41905r();
    }

    /* renamed from: R */
    public final void mo41884R(int i) {
        this.f25400c = i;
    }

    /* renamed from: T */
    public final void mo41885T(zzasw[] zzaswArr, zzayo zzayo, long j) throws zzasi {
        zzbac.m42926e(!this.f25405h);
        this.f25402e = zzayo;
        this.f25404g = false;
        this.f25403f = j;
        mo41906s(zzaswArr, j);
    }

    /* renamed from: U */
    public final void mo41886U(long j) throws zzasi {
        this.f25405h = false;
        this.f25404g = false;
        mo41903p(j, false);
    }

    /* renamed from: V */
    public final boolean mo41887V() {
        return this.f25405h;
    }

    /* renamed from: Y */
    public final void mo41888Y(zzatd zzatd, zzasw[] zzaswArr, zzayo zzayo, long j, boolean z, long j2) throws zzasi {
        zzbac.m42926e(this.f25401d == 0);
        this.f25399b = zzatd;
        this.f25401d = 1;
        mo41902o(z);
        mo41885T(zzaswArr, zzayo, j2);
        mo41903p(j, z);
    }

    /* renamed from: a */
    public final int mo41889a() {
        return this.f25398a;
    }

    /* renamed from: b */
    public int mo41890b() throws zzasi {
        throw null;
    }

    /* renamed from: c */
    public final zzatc mo41891c() {
        return this;
    }

    /* renamed from: e */
    public final zzayo mo41892e() {
        return this.f25402e;
    }

    /* renamed from: f */
    public void mo41893f(int i, Object obj) throws zzasi {
    }

    /* renamed from: g */
    public zzbag mo41894g() {
        return null;
    }

    /* renamed from: h */
    public final void mo41895h() {
        boolean z = true;
        if (this.f25401d != 1) {
            z = false;
        }
        zzbac.m42926e(z);
        this.f25401d = 0;
        this.f25402e = null;
        this.f25405h = false;
        mo41901n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo41896i() {
        return this.f25404g ? this.f25405h : this.f25402e.mo42203b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int mo41897j() {
        return this.f25400c;
    }

    /* renamed from: k */
    public final void mo41898k() throws IOException {
        this.f25402e.mo42202a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo41899l(zzasx zzasx, zzaur zzaur, boolean z) {
        zzasx zzasx2 = zzasx;
        zzaur zzaur2 = zzaur;
        int d = this.f25402e.mo42205d(zzasx2, zzaur2, z);
        if (d == -4) {
            if (zzaur.mo42069f()) {
                this.f25404g = true;
                return this.f25405h ? -4 : -3;
            }
            zzaur2.f25710d += this.f25403f;
        } else if (d == -5) {
            zzasw zzasw = zzasx2.f25531a;
            long j = zzasw.f25517N;
            if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
                zzasx2.f25531a = new zzasw(zzasw.f25522a, zzasw.f25526g, zzasw.f25527o, zzasw.f25524d, zzasw.f25523c, zzasw.f25528p, zzasw.f25504A, zzasw.f25505B, zzasw.f25506C, zzasw.f25507D, zzasw.f25508E, zzasw.f25510G, zzasw.f25509F, zzasw.f25511H, zzasw.f25512I, zzasw.f25513J, zzasw.f25514K, zzasw.f25515L, zzasw.f25516M, zzasw.f25518O, zzasw.f25519P, zzasw.f25520Q, j + this.f25403f, zzasw.f25529s, zzasw.f25530z, zzasw.f25525f);
                return -5;
            }
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final zzatd mo41900m() {
        return this.f25399b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo41901n() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo41902o(boolean z) throws zzasi {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo41903p(long j, boolean z) throws zzasi {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo41904q() throws zzasi {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo41905r() throws zzasi {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo41906s(zzasw[] zzaswArr, long j) throws zzasi {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo41907u(long j) {
        this.f25402e.mo42204c(j - this.f25403f);
    }

    /* renamed from: w */
    public final void mo41908w() {
        this.f25405h = true;
    }

    public final int zzb() {
        return this.f25401d;
    }
}
