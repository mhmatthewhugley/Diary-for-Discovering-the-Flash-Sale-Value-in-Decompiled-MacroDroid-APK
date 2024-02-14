package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzaq;

final class zzac extends zzaq {

    /* renamed from: a */
    private final /* synthetic */ OnMapReadyCallback f46358a;

    zzac(MapView.zza zza, OnMapReadyCallback onMapReadyCallback) {
        this.f46358a = onMapReadyCallback;
    }

    /* renamed from: Ha */
    public final void mo54633Ha(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
        this.f46358a.mo31728a(new GoogleMap(iGoogleMapDelegate));
    }
}
