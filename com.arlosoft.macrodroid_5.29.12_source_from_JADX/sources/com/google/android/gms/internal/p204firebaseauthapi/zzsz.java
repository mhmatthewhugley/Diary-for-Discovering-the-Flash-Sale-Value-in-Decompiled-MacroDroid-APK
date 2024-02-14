package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneMultiFactorInfo;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        PhoneMultiFactorInfo phoneMultiFactorInfo = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) SafeParcelReader.m4546p(parcel2, E, PhoneMultiFactorInfo.CREATOR);
                    break;
                case 2:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 3:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 4:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 5:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 6:
                    z2 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 7:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 8:
                    str4 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 9:
                    z3 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzsy(phoneMultiFactorInfo, str, str2, j, z, z2, str3, str4, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzsy[i];
    }
}
