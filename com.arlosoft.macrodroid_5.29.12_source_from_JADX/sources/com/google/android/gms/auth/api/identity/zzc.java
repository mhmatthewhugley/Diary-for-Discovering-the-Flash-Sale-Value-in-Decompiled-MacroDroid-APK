package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzc implements Parcelable.Creator<BeginSignInRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) SafeParcelReader.m4546p(parcel, E, BeginSignInRequest.PasswordRequestOptions.CREATOR);
            } else if (w == 2) {
                googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) SafeParcelReader.m4546p(parcel, E, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
            } else if (w == 3) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                z = SafeParcelReader.m4554x(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, str, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest[i];
    }
}
