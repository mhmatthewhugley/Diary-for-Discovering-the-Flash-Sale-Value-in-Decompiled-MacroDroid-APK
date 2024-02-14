package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationStatusCodes;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzax extends zzaj {

    /* renamed from: a */
    private BaseImplementation.ResultHolder<Status> f41097a;

    public zzax(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f41097a = resultHolder;
    }

    /* renamed from: A */
    private final void m59224A(int i) {
        if (this.f41097a == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new Exception());
            return;
        }
        this.f41097a.mo21038a(LocationStatusCodes.m64690b(LocationStatusCodes.m64689a(i)));
        this.f41097a = null;
    }

    /* renamed from: F5 */
    public final void mo50510F5(int i, PendingIntent pendingIntent) {
        m59224A(i);
    }

    /* renamed from: Hb */
    public final void mo50511Hb(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new Exception());
    }

    /* renamed from: d2 */
    public final void mo50512d2(int i, String[] strArr) {
        m59224A(i);
    }
}
