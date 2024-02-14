package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdg {

    /* renamed from: a */
    private final zzde f32230a;

    /* renamed from: b */
    private boolean f32231b;

    public zzdg() {
        throw null;
    }

    public zzdg(zzde zzde) {
        this.f32230a = zzde;
    }

    /* renamed from: a */
    public final synchronized void mo44614a() throws InterruptedException {
        while (!this.f32231b) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized void mo44615b() {
        boolean z = false;
        while (!this.f32231b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo44616c() {
        boolean z;
        z = this.f32231b;
        this.f32231b = false;
        return z;
    }

    /* renamed from: d */
    public final synchronized boolean mo44617d() {
        return this.f32231b;
    }

    /* renamed from: e */
    public final synchronized boolean mo44618e() {
        if (this.f32231b) {
            return false;
        }
        this.f32231b = true;
        notifyAll();
        return true;
    }
}
