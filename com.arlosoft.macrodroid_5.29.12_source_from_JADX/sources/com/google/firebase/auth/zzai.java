package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzai implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 2) {
                str2 = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 3) {
                j = SafeParcelReader.m4523J(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                str3 = SafeParcelReader.m4547q(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new PhoneMultiFactorInfo(str, str2, j, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PhoneMultiFactorInfo[i];
    }
}
