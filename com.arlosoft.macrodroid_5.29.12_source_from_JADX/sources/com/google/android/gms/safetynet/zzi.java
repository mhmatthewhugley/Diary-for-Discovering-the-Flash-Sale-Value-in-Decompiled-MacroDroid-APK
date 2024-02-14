package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzi implements Parcelable.Creator<zzh> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w != 3) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                z = SafeParcelReader.m4554x(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzh(i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}
