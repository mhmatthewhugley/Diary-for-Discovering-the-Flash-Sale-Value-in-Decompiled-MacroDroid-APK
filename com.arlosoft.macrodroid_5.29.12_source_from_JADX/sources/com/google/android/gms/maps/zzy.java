package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzak;
import com.google.android.gms.maps.model.LatLng;

final class zzy extends zzak {

    /* renamed from: a */
    private final /* synthetic */ GoogleMap.OnMapClickListener f46390a;

    zzy(GoogleMap googleMap, GoogleMap.OnMapClickListener onMapClickListener) {
        this.f46390a = onMapClickListener;
    }

    /* renamed from: K0 */
    public final void mo54630K0(LatLng latLng) {
        this.f46390a.mo31727K0(latLng);
    }
}
