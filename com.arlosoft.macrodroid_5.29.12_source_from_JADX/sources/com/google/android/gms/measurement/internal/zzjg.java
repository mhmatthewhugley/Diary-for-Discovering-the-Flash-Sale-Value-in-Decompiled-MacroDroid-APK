package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzjg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzdx f47159a;

    /* renamed from: c */
    final /* synthetic */ zzjl f47160c;

    zzjg(zzjl zzjl, zzdx zzdx) {
        this.f47160c = zzjl;
        this.f47159a = zzdx;
    }

    public final void run() {
        synchronized (this.f47160c) {
            this.f47160c.f47167a = false;
            if (!this.f47160c.f47169d.mo55466x()) {
                this.f47160c.f47169d.f46899a.mo55221z().mo55102t().mo55091a("Connected to service");
                this.f47160c.f47169d.mo55464v(this.f47159a);
            }
        }
    }
}
