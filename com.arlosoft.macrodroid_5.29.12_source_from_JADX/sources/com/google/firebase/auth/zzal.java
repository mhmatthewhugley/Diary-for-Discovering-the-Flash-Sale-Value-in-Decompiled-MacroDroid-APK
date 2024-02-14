package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzal implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 3) {
                str2 = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 4) {
                z = SafeParcelReader.m4554x(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                z2 = SafeParcelReader.m4554x(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new UserProfileChangeRequest(str, str2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UserProfileChangeRequest[i];
    }
}
