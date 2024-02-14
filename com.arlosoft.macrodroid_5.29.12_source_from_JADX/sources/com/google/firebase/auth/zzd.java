package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneAuthProvider;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            SafeParcelReader.m4553w(E);
            SafeParcelReader.m4527N(parcel, E);
        }
        SafeParcelReader.m4552v(parcel, O);
        return new PhoneAuthProvider.ForceResendingToken();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PhoneAuthProvider.ForceResendingToken[i];
    }
}
