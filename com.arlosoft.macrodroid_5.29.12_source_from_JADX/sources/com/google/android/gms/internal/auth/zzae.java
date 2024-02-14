package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzae implements Parcelable.Creator<zzad> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                str = SafeParcelReader.m4547q(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzad(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }
}
