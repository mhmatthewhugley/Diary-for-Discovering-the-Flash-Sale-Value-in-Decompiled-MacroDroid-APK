package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final /* synthetic */ class zzgy implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzhx f46929a;

    public /* synthetic */ zzgy(zzhx zzhx) {
        this.f46929a = zzhx;
    }

    public final void run() {
        zzhx zzhx = this.f46929a;
        zzhx.mo55073e();
        if (!zzhx.f46899a.mo55189F().f46752s.mo55117b()) {
            long a = zzhx.f46899a.mo55189F().f46753t.mo55120a();
            zzhx.f46899a.mo55189F().f46753t.mo55121b(1 + a);
            zzhx.f46899a.mo55219x();
            if (a >= 5) {
                zzhx.f46899a.mo55221z().mo55103u().mo55091a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                zzhx.f46899a.mo55189F().f46752s.mo55116a(true);
                return;
            }
            zzhx.f46899a.mo55206g();
            return;
        }
        zzhx.f46899a.mo55221z().mo55097o().mo55091a("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
