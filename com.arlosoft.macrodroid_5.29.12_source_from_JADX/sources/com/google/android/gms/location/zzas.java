package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final /* synthetic */ class zzas implements RemoteCall {

    /* renamed from: a */
    private final List f46083a;

    zzas(List list) {
        this.f46083a = list;
    }

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        ((zzaz) obj).mo50565M0(this.f46083a, new zzat((TaskCompletionSource) obj2));
    }
}
