package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.StreetViewPanoramaView;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbq;

final class zzaj extends zzbq {

    /* renamed from: a */
    private final /* synthetic */ OnStreetViewPanoramaReadyCallback f46364a;

    zzaj(StreetViewPanoramaView.zza zza, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.f46364a = onStreetViewPanoramaReadyCallback;
    }

    /* renamed from: n9 */
    public final void mo54648n9(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws RemoteException {
        this.f46364a.mo54530a(new StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}
