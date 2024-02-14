package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzaq;

final class zzab extends zzaq {

    /* renamed from: a */
    private final /* synthetic */ OnMapReadyCallback f46357a;

    zzab(MapFragment.zza zza, OnMapReadyCallback onMapReadyCallback) {
        this.f46357a = onMapReadyCallback;
    }

    /* renamed from: Ha */
    public final void mo54633Ha(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
        this.f46357a.mo31728a(new GoogleMap(iGoogleMapDelegate));
    }
}
