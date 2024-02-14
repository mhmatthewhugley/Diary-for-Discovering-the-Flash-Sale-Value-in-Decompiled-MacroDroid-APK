package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbg implements Parcelable.Creator<LocationResult> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        List<Location> list = LocationResult.f45841c;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            if (SafeParcelReader.m4553w(E) != 1) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                list = SafeParcelReader.m4551u(parcel, E, Location.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new LocationResult(list);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}
