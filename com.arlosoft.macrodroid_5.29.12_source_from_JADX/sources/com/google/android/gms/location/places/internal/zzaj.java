package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzaj implements Parcelable.Creator<zzak> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        PlaceEntity placeEntity = null;
        float f = 0.0f;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                placeEntity = (PlaceEntity) SafeParcelReader.m4546p(parcel, E, PlaceEntity.CREATOR);
            } else if (w != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                f = SafeParcelReader.m4516C(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzak(placeEntity, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzak[i];
    }
}
