package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbae {

    /* renamed from: a */
    private boolean f26396a;

    /* renamed from: a */
    public final synchronized void mo42308a() throws InterruptedException {
        while (!this.f26396a) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo42309b() {
        boolean z;
        z = this.f26396a;
        this.f26396a = false;
        return z;
    }

    /* renamed from: c */
    public final synchronized boolean mo42310c() {
        if (this.f26396a) {
            return false;
        }
        this.f26396a = true;
        notifyAll();
        return true;
    }
}
