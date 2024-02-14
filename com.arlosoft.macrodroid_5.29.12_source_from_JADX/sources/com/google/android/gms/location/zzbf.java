package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbf implements Parcelable.Creator<LocationRequest> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 2:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 3:
                    j2 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 4:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 5:
                    j3 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 6:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 7:
                    f = SafeParcelReader.m4516C(parcel2, E);
                    break;
                case 8:
                    j4 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 9:
                    z2 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
