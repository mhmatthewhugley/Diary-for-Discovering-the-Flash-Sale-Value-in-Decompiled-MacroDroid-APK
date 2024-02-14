package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzrz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        PhoneAuthCredential phoneAuthCredential = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                phoneAuthCredential = (PhoneAuthCredential) SafeParcelReader.m4546p(parcel, E, PhoneAuthCredential.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzry(str, phoneAuthCredential);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzry[i];
    }
}
