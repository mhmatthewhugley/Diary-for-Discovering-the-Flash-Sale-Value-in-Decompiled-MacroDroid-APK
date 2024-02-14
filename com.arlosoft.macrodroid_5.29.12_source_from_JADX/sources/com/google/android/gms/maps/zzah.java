package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.StreetViewPanoramaFragment;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbq;

final class zzah extends zzbq {

    /* renamed from: a */
    private final /* synthetic */ OnStreetViewPanoramaReadyCallback f46363a;

    zzah(StreetViewPanoramaFragment.zza zza, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.f46363a = onStreetViewPanoramaReadyCallback;
    }

    /* renamed from: n9 */
    public final void mo54648n9(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws RemoteException {
        this.f46363a.mo54530a(new StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}
