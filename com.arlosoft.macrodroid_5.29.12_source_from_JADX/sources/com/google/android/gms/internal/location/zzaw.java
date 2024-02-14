package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationStatusCodes;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzaw extends zzaj {

    /* renamed from: a */
    private BaseImplementation.ResultHolder<Status> f41096a;

    public zzaw(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f41096a = resultHolder;
    }

    /* renamed from: F5 */
    public final void mo50510F5(int i, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult", new Exception());
    }

    /* renamed from: Hb */
    public final void mo50511Hb(int i, String[] strArr) {
        if (this.f41096a == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times", new Exception());
            return;
        }
        this.f41096a.mo21038a(LocationStatusCodes.m64690b(LocationStatusCodes.m64689a(i)));
        this.f41096a = null;
    }

    /* renamed from: d2 */
    public final void mo50512d2(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult", new Exception());
    }
}
