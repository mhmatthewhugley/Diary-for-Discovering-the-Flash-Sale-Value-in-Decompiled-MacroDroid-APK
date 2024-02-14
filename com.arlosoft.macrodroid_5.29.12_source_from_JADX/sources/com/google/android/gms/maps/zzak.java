package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzaq;

final class zzak extends zzaq {

    /* renamed from: a */
    private final /* synthetic */ OnMapReadyCallback f46365a;

    zzak(SupportMapFragment.zza zza, OnMapReadyCallback onMapReadyCallback) {
        this.f46365a = onMapReadyCallback;
    }

    /* renamed from: Ha */
    public final void mo54633Ha(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
        this.f46365a.mo31728a(new GoogleMap(iGoogleMapDelegate));
    }
}
