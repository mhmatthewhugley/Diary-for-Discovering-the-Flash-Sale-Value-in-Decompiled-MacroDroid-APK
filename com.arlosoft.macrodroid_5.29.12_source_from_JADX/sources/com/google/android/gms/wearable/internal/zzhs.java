package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzhs extends zzhn {
    public zzhs(BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
    }

    /* renamed from: a3 */
    public final void mo56274a3(zzdp zzdp) {
        zzac zzac;
        Status a = zzhf.m67093a(zzdp.f48254a);
        zzao zzao = zzdp.f48255c;
        if (zzao == null) {
            zzac = null;
        } else {
            zzac = new zzac(zzao);
        }
        mo56496t1(new zzae(a, zzac));
    }
}
