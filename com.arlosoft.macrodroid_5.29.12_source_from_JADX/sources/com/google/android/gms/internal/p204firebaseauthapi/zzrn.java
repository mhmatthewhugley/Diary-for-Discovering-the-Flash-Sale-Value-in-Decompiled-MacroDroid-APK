package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzrn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        PhoneAuthCredential phoneAuthCredential = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                phoneAuthCredential = (PhoneAuthCredential) SafeParcelReader.m4546p(parcel, E, PhoneAuthCredential.CREATOR);
            } else if (w == 2) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w != 3) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                str2 = SafeParcelReader.m4547q(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzrm(phoneAuthCredential, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzrm[i];
    }
}
