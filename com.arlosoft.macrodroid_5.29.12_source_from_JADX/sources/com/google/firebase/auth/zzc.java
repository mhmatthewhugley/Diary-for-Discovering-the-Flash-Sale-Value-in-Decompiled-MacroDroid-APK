package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
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
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 6:
                    str5 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 7:
                    z2 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 8:
                    str6 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 9:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 10:
                    str7 = SafeParcelReader.m4547q(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new ActionCodeSettings(str, str2, str3, str4, z, str5, z2, str6, i, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActionCodeSettings[i];
    }
}
