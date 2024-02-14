package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsResult;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzay extends zzan {

    /* renamed from: a */
    private BaseImplementation.ResultHolder<LocationSettingsResult> f41098a;

    public zzay(BaseImplementation.ResultHolder<LocationSettingsResult> resultHolder) {
        Preconditions.m4479b(resultHolder != null, "listener can't be null.");
        this.f41098a = resultHolder;
    }

    /* renamed from: E2 */
    public final void mo50532E2(LocationSettingsResult locationSettingsResult) throws RemoteException {
        this.f41098a.mo21038a(locationSettingsResult);
        this.f41098a = null;
    }
}
