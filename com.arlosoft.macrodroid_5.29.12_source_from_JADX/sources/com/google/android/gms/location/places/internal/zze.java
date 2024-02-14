package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zze implements Parcelable.Creator<zzc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        ArrayList<Integer> arrayList = null;
        String str2 = null;
        ArrayList<zzb> arrayList2 = null;
        String str3 = null;
        ArrayList<zzb> arrayList3 = null;
        String str4 = null;
        ArrayList<zzb> arrayList4 = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    str2 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 2:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 3:
                    arrayList = SafeParcelReader.m4542l(parcel, E);
                    break;
                case 4:
                    arrayList2 = SafeParcelReader.m4551u(parcel, E, zzb.CREATOR);
                    break;
                case 5:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 6:
                    str3 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 7:
                    arrayList3 = SafeParcelReader.m4551u(parcel, E, zzb.CREATOR);
                    break;
                case 8:
                    str4 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 9:
                    arrayList4 = SafeParcelReader.m4551u(parcel, E, zzb.CREATOR);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzc(str, arrayList, i, str2, arrayList2, str3, arrayList3, str4, arrayList4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
