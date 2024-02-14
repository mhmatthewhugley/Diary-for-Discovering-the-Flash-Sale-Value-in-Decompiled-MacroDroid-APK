package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final /* synthetic */ class zzh implements RemoteCall {

    /* renamed from: a */
    private final PendingIntent f46110a;

    zzh(PendingIntent pendingIntent) {
        this.f46110a = pendingIntent;
    }

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        ((zzaz) obj).mo50561I0(this.f46110a, new zzj((TaskCompletionSource) obj2));
    }
}
