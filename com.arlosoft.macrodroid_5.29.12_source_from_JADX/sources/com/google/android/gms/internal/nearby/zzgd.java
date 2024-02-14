package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;
import com.google.android.gms.nearby.connection.zzl;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzgd extends zzgp {

    /* renamed from: a */
    final /* synthetic */ zzle f44656a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgd(zzgg zzgg, zzle zzle) {
        super((zzgo) null);
        this.f44656a = zzle;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        EndpointDiscoveryCallback endpointDiscoveryCallback = (EndpointDiscoveryCallback) obj;
        if (zzgg.m62489A1(this.f44656a)) {
            zzl zzl = new zzl();
            zzl.mo55726d(this.f44656a.mo52858o2());
            zzl.mo55723a(this.f44656a.mo52855l2());
            endpointDiscoveryCallback.mo37365a("__UNRECOGNIZED_BLUETOOTH_DEVICE__", zzl.mo55727e());
            return;
        }
        String m2 = this.f44656a.mo52856m2();
        zzl zzl2 = new zzl();
        zzl2.mo55726d(this.f44656a.mo52858o2());
        zzl2.mo55725c(this.f44656a.mo52857n2());
        zzl2.mo55724b(this.f44656a.mo52859p2());
        endpointDiscoveryCallback.mo37365a(m2, zzl2.mo55727e());
    }
}
