package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzd implements Parcelable.Creator<zzc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzb zzb = null;
        String str5 = null;
        Bundle bundle = null;
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
                    str3 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 4:
                    str4 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 5:
                    zzb = (zzb) SafeParcelReader.m4546p(parcel, E, zzb.CREATOR);
                    break;
                case 6:
                    str5 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 7:
                    bundle = SafeParcelReader.m4536f(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzc(str, str2, str3, str4, zzb, str5, bundle);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
