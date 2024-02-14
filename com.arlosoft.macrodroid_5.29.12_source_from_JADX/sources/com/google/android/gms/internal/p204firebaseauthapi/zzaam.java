package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaam */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaam implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 2:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 3:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 4:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 5:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 6:
                    str4 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 7:
                    z2 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 8:
                    str5 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzaal(str, j, z, str2, str3, str4, z2, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaal[i];
    }
}
