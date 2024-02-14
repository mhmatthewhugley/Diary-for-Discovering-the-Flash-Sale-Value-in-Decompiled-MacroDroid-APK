package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.SupportStreetViewPanoramaFragment;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbq;

final class zzal extends zzbq {

    /* renamed from: a */
    private final /* synthetic */ OnStreetViewPanoramaReadyCallback f46366a;

    zzal(SupportStreetViewPanoramaFragment.zza zza, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.f46366a = onStreetViewPanoramaReadyCallback;
    }

    /* renamed from: n9 */
    public final void mo54648n9(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws RemoteException {
        this.f46366a.mo54530a(new StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}
