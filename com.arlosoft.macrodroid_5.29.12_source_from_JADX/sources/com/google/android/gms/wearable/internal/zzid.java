package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.List;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzid extends zzhn {

    /* renamed from: c */
    private final List f48374c;

    zzid(BaseImplementation.ResultHolder resultHolder, List list) {
        super(resultHolder);
        this.f48374c = list;
    }

    /* renamed from: d9 */
    public final void mo56275d9(zzgu zzgu) {
        mo56496t1(new zzcq(zzhf.m67093a(zzgu.f48351a), zzgu.f48352c));
        if (zzgu.f48351a != 0) {
            for (FutureTask cancel : this.f48374c) {
                cancel.cancel(true);
            }
        }
    }
}
