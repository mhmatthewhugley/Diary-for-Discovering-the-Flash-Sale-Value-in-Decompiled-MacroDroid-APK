package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.maps.model.LatLngBounds;

final class zzn extends zzm.zzc<zzq> {

    /* renamed from: t */
    private final /* synthetic */ String f46013t;

    /* renamed from: u */
    private final /* synthetic */ LatLngBounds f46014u;

    /* renamed from: v */
    private final /* synthetic */ AutocompleteFilter f46015v;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzq) anyClient).mo54331u0(new zzm((zzm.zzc) this), this.f46013t, this.f46014u, 1, this.f46015v);
    }
}
