package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzat implements Parcelable.Creator<zzau> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 2) {
                str2 = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 3) {
                str3 = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 4) {
                str4 = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 6) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w != 7) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                i2 = SafeParcelReader.m4520G(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzau(str, str2, str3, str4, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzau[i];
    }
}
