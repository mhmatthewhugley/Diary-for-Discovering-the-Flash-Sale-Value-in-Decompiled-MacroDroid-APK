package com.google.android.gms.maps;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public class StreetViewPanorama {

    /* renamed from: a */
    private final IStreetViewPanoramaDelegate f46173a;

    public interface OnStreetViewPanoramaCameraChangeListener {
        /* renamed from: l1 */
        void mo54532l1(StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    public interface OnStreetViewPanoramaChangeListener {
        /* renamed from: B0 */
        void mo54533B0(StreetViewPanoramaLocation streetViewPanoramaLocation);
    }

    public interface OnStreetViewPanoramaClickListener {
        /* renamed from: B1 */
        void mo54534B1(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public interface OnStreetViewPanoramaLongClickListener {
        /* renamed from: g1 */
        void mo54535g1(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public StreetViewPanorama(@NonNull IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.f46173a = (IStreetViewPanoramaDelegate) Preconditions.m4489l(iStreetViewPanoramaDelegate, "delegate");
    }
}
