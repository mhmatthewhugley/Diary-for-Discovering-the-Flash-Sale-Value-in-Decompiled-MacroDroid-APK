package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzo implements Parcelable.Creator<StreetViewPanoramaLocation> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        LatLng latLng = null;
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) SafeParcelReader.m4550t(parcel, E, StreetViewPanoramaLink.CREATOR);
            } else if (w == 3) {
                latLng = (LatLng) SafeParcelReader.m4546p(parcel, E, LatLng.CREATOR);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                str = SafeParcelReader.m4547q(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaLocation[i];
    }
}
