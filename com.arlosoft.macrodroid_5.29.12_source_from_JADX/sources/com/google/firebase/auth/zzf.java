package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p204firebaseauthapi.zzaay;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzaay zzaay = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    zzaay = (zzaay) SafeParcelReader.m4546p(parcel, E, zzaay.CREATOR);
                    break;
                case 5:
                    str4 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 6:
                    str5 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 7:
                    str6 = SafeParcelReader.m4547q(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zze(str, str2, str3, zzaay, str4, str5, str6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zze[i];
    }
}
