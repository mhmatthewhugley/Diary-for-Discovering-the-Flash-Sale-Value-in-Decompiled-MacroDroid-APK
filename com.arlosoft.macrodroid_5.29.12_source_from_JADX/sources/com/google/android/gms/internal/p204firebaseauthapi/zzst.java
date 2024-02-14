package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.EmailAuthCredential;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzst */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzst implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        EmailAuthCredential emailAuthCredential = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            if (SafeParcelReader.m4553w(E) != 1) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                emailAuthCredential = (EmailAuthCredential) SafeParcelReader.m4546p(parcel, E, EmailAuthCredential.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzss(emailAuthCredential);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzss[i];
    }
}
