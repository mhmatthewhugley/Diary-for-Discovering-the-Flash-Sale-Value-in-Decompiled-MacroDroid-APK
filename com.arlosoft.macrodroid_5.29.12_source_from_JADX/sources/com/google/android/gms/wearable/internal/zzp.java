package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        zziv zziv = null;
        String str3 = null;
        String str4 = null;
        Float f = null;
        zzs zzs = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 2:
                    str2 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 3:
                    zziv = (zziv) SafeParcelReader.m4546p(parcel, E, zziv.CREATOR);
                    break;
                case 4:
                    str3 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 5:
                    str4 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 6:
                    f = SafeParcelReader.m4517D(parcel, E);
                    break;
                case 7:
                    zzs = (zzs) SafeParcelReader.m4546p(parcel, E, zzs.CREATOR);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzo(str, str2, zziv, str3, str4, f, zzs);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
