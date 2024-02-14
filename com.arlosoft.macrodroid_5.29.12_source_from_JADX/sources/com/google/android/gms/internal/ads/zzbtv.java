package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbtv extends zzcho {

    /* renamed from: c */
    private final Object f27763c = new Object();

    /* renamed from: d */
    private final zzbb f27764d;

    /* renamed from: e */
    private boolean f27765e;

    /* renamed from: f */
    private int f27766f;

    public zzbtv(zzbb zzbb) {
        this.f27764d = zzbb;
        this.f27765e = false;
        this.f27766f = 0;
    }

    /* renamed from: f */
    public final zzbtq mo42985f() {
        zzbtq zzbtq = new zzbtq(this);
        synchronized (this.f27763c) {
            mo43584e(new zzbtr(this, zzbtq), new zzbts(this, zzbtq));
            Preconditions.m4493p(this.f27766f >= 0);
            this.f27766f++;
        }
        return zzbtq;
    }

    /* renamed from: g */
    public final void mo42986g() {
        synchronized (this.f27763c) {
            Preconditions.m4493p(this.f27766f >= 0);
            zze.m2645k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f27765e = true;
            mo42987h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo42987h() {
        synchronized (this.f27763c) {
            Preconditions.m4493p(this.f27766f >= 0);
            if (!this.f27765e || this.f27766f != 0) {
                zze.m2645k("There are still references to the engine. Not destroying.");
            } else {
                zze.m2645k("No reference is left (including root). Cleaning up engine.");
                mo43584e(new zzbtu(this), new zzchk());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo42988i() {
        synchronized (this.f27763c) {
            Preconditions.m4493p(this.f27766f > 0);
            zze.m2645k("Releasing 1 reference for JS Engine");
            this.f27766f--;
            mo42987h();
        }
    }
}
