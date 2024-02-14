package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzm;
import com.google.android.gms.maps.model.CameraPosition;

final class zzt extends zzm {

    /* renamed from: a */
    private final /* synthetic */ GoogleMap.OnCameraChangeListener f46385a;

    zzt(GoogleMap googleMap, GoogleMap.OnCameraChangeListener onCameraChangeListener) {
        this.f46385a = onCameraChangeListener;
    }

    /* renamed from: A0 */
    public final void mo54660A0(CameraPosition cameraPosition) {
        this.f46385a.mo54462A0(cameraPosition);
    }
}
