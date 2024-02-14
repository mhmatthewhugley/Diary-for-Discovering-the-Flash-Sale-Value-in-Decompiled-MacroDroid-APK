package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final /* synthetic */ class zzaq implements RemoteCall {

    /* renamed from: a */
    private final GeofencingRequest f46080a;

    /* renamed from: b */
    private final PendingIntent f46081b;

    zzaq(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.f46080a = geofencingRequest;
        this.f46081b = pendingIntent;
    }

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        ((zzaz) obj).mo50562J0(this.f46080a, this.f46081b, new zzat((TaskCompletionSource) obj2));
    }
}
