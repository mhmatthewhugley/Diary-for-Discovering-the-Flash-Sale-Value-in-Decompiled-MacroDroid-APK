package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzf implements Parcelable.Creator<zzan> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<zzao> arrayList = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 2:
                    i2 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 3:
                    i3 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 4:
                    i4 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 5:
                    i5 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 6:
                    i6 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 7:
                    arrayList = SafeParcelReader.m4551u(parcel, E, zzao.CREATOR);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzan(i, i2, i3, i4, i5, i6, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzan[i];
    }
}
