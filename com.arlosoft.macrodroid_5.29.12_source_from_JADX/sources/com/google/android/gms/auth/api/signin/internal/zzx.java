package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzx implements Parcelable.Creator<SignInConfiguration> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                googleSignInOptions = (GoogleSignInOptions) SafeParcelReader.m4546p(parcel, E, GoogleSignInOptions.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
