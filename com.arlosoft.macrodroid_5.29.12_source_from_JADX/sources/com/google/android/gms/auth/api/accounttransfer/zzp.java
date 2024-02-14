package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzp implements Parcelable.Creator<zzo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        ArrayList<String> arrayList4 = null;
        ArrayList<String> arrayList5 = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m4549s(parcel, E);
                    break;
                case 3:
                    arrayList2 = SafeParcelReader.m4549s(parcel, E);
                    break;
                case 4:
                    arrayList3 = SafeParcelReader.m4549s(parcel, E);
                    break;
                case 5:
                    arrayList4 = SafeParcelReader.m4549s(parcel, E);
                    break;
                case 6:
                    arrayList5 = SafeParcelReader.m4549s(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzo(i, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
