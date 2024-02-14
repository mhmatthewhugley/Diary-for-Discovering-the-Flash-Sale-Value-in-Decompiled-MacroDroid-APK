package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbm implements Parcelable.Creator<LocationSettingsResult> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                status = (Status) SafeParcelReader.m4546p(parcel, E, Status.CREATOR);
            } else if (w != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                locationSettingsStates = (LocationSettingsStates) SafeParcelReader.m4546p(parcel, E, LocationSettingsStates.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
