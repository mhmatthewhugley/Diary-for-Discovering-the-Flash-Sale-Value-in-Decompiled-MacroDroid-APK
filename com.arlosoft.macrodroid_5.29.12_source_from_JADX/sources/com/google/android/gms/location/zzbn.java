package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbn implements Parcelable.Creator<LocationSettingsStates> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 2:
                    z2 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 3:
                    z3 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 4:
                    z4 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 5:
                    z5 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 6:
                    z6 = SafeParcelReader.m4554x(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new LocationSettingsStates(z, z2, z3, z4, z5, z6);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
