package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zze implements Parcelable.Creator<LatLngBounds> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                latLng = (LatLng) SafeParcelReader.m4546p(parcel, E, LatLng.CREATOR);
            } else if (w != 3) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                latLng2 = (LatLng) SafeParcelReader.m4546p(parcel, E, LatLng.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
