package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzji implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzdx f47163a;

    /* renamed from: c */
    final /* synthetic */ zzjl f47164c;

    zzji(zzjl zzjl, zzdx zzdx) {
        this.f47164c = zzjl;
        this.f47163a = zzdx;
    }

    public final void run() {
        synchronized (this.f47164c) {
            this.f47164c.f47167a = false;
            if (!this.f47164c.f47169d.mo55466x()) {
                this.f47164c.f47169d.f46899a.mo55221z().mo55097o().mo55091a("Connected to remote service");
                this.f47164c.f47169d.mo55464v(this.f47163a);
            }
        }
    }
}
