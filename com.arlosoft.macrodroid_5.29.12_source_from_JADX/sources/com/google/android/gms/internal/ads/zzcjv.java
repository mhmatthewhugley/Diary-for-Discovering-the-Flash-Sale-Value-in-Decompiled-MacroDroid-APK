package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcjv {

    /* renamed from: a */
    private final zzazp f28701a = new zzazp(true, 65536);

    /* renamed from: b */
    private long f28702b = 15000000;

    /* renamed from: c */
    private long f28703c = 30000000;

    /* renamed from: d */
    private long f28704d = 2500000;

    /* renamed from: e */
    private long f28705e = 5000000;

    /* renamed from: f */
    private int f28706f;

    /* renamed from: g */
    private boolean f28707g;

    zzcjv() {
    }

    /* renamed from: a */
    public final void mo43835a() {
        mo43839e(false);
    }

    /* renamed from: b */
    public final void mo43836b() {
        mo43839e(true);
    }

    /* renamed from: c */
    public final void mo43837c() {
        mo43839e(true);
    }

    /* renamed from: d */
    public final void mo43838d(zzatb[] zzatbArr, zzayt zzayt, zzazf zzazf) {
        this.f28706f = 0;
        for (int i = 0; i < 2; i++) {
            if (zzazf.mo42274a(i) != null) {
                this.f28706f += zzbar.m42990f(zzatbArr[i].mo41889a());
            }
        }
        this.f28701a.mo42292f(this.f28706f);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: e */
    public final void mo43839e(boolean z) {
        this.f28706f = 0;
        this.f28707g = false;
        if (z) {
            this.f28701a.mo42291e();
        }
    }

    /* renamed from: f */
    public final synchronized void mo43840f(int i) {
        this.f28704d = ((long) i) * 1000;
    }

    /* renamed from: g */
    public final synchronized void mo43841g(int i) {
        this.f28705e = ((long) i) * 1000;
    }

    /* renamed from: h */
    public final synchronized void mo43842h(int i) {
        this.f28703c = ((long) i) * 1000;
    }

    /* renamed from: i */
    public final synchronized void mo43843i(int i) {
        this.f28702b = ((long) i) * 1000;
    }

    /* renamed from: j */
    public final synchronized boolean mo43844j(long j) {
        boolean z;
        z = true;
        char c = j > this.f28703c ? 0 : j < this.f28702b ? (char) 2 : 1;
        int a = this.f28701a.mo42287a();
        int i = this.f28706f;
        if (c != 2) {
            if (c != 1 || !this.f28707g || a >= i) {
                z = false;
            }
        }
        this.f28707g = z;
        return z;
    }

    /* renamed from: k */
    public final synchronized boolean mo43845k(long j, boolean z) {
        long j2;
        j2 = z ? this.f28705e : this.f28704d;
        return j2 <= 0 || j >= j2;
    }

    /* renamed from: l */
    public final zzazp mo43846l() {
        return this.f28701a;
    }
}
