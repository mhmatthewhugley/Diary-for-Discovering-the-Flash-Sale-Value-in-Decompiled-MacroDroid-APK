package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzj implements Parcelable.Creator<SavePasswordRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        SignInPassword signInPassword = null;
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                signInPassword = (SignInPassword) SafeParcelReader.m4546p(parcel, E, SignInPassword.CREATOR);
            } else if (w != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                str = SafeParcelReader.m4547q(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new SavePasswordRequest(signInPassword, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SavePasswordRequest[i];
    }
}
