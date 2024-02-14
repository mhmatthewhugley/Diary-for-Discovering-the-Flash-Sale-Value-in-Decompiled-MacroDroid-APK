package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbe implements Parcelable.Creator<LocationAvailability> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        long j = 0;
        zzbo[] zzboArr = null;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                i2 = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 2) {
                i3 = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 3) {
                j = SafeParcelReader.m4523J(parcel, E);
            } else if (w == 4) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                zzboArr = (zzbo[]) SafeParcelReader.m4550t(parcel, E, zzbo.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new LocationAvailability(i, i2, i3, j, zzboArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
