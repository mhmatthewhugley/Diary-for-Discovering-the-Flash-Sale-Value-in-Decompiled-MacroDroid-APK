package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final /* synthetic */ class zzae implements RemoteCall {

    /* renamed from: a */
    private final FusedLocationProviderClient f46060a;

    /* renamed from: b */
    private final zzap f46061b;

    /* renamed from: c */
    private final LocationCallback f46062c;

    /* renamed from: d */
    private final zzan f46063d;

    /* renamed from: e */
    private final zzba f46064e;

    /* renamed from: f */
    private final ListenerHolder f46065f;

    zzae(FusedLocationProviderClient fusedLocationProviderClient, zzap zzap, LocationCallback locationCallback, zzan zzan, zzba zzba, ListenerHolder listenerHolder) {
        this.f46060a = fusedLocationProviderClient;
        this.f46061b = zzap;
        this.f46062c = locationCallback;
        this.f46063d = zzan;
        this.f46064e = zzba;
        this.f46065f = listenerHolder;
    }

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        this.f46060a.mo54152I(this.f46061b, this.f46062c, this.f46063d, this.f46064e, this.f46065f, (zzaz) obj, (TaskCompletionSource) obj2);
    }
}
