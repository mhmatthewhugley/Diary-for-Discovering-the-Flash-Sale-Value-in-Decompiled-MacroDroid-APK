package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzkm implements Callable {

    /* renamed from: a */
    final /* synthetic */ zzq f47234a;

    /* renamed from: c */
    final /* synthetic */ zzkt f47235c;

    zzkm(zzkt zzkt, zzq zzq) {
        this.f47235c = zzkt;
        this.f47234a = zzq;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzai V = this.f47235c.mo55518V((String) Preconditions.m4488k(this.f47234a.f47326a));
        zzah zzah = zzah.ANALYTICS_STORAGE;
        if (V.mo54950i(zzah) && zzai.m65384b(this.f47234a.f47323M).mo54950i(zzah)) {
            return this.f47235c.mo55515S(this.f47234a).mo55289e0();
        }
        this.f47235c.mo55221z().mo55102t().mo55091a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
