package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.UserProfileChangeRequest;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzth */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzth implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        UserProfileChangeRequest userProfileChangeRequest = null;
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                userProfileChangeRequest = (UserProfileChangeRequest) SafeParcelReader.m4546p(parcel, E, UserProfileChangeRequest.CREATOR);
            } else if (w != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                str = SafeParcelReader.m4547q(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zztg(userProfileChangeRequest, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zztg[i];
    }
}
