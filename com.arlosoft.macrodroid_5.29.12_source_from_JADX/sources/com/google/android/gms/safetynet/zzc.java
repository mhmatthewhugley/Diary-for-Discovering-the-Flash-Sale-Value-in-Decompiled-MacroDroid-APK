package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzc implements Parcelable.Creator<HarmfulAppsData> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        byte[] bArr = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 3) {
                bArr = SafeParcelReader.m4537g(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                i = SafeParcelReader.m4520G(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new HarmfulAppsData(str, bArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HarmfulAppsData[i];
    }
}