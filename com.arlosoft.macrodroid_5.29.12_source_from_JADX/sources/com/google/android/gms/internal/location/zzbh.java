package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.zzbi;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzbh extends zzbi<LocationSettingsResult> {

    /* renamed from: t */
    final /* synthetic */ LocationSettingsRequest f41127t;

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Result mo21036h(Status status) {
        return new LocationSettingsResult(status, (LocationSettingsStates) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).mo50556D0(this.f41127t, this, (String) null);
    }
}
