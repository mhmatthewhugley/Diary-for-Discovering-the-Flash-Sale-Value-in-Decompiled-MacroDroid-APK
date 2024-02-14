package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzk implements Parcelable.Creator<TokenData> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        Long l = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 2:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 3:
                    l = SafeParcelReader.m4524K(parcel, E);
                    break;
                case 4:
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 5:
                    z2 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m4549s(parcel, E);
                    break;
                case 7:
                    str2 = SafeParcelReader.m4547q(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new TokenData(i, str, l, z, z2, arrayList, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
