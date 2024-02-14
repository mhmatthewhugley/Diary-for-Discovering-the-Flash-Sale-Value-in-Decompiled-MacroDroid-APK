package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzi implements Parcelable.Creator<BeginSignInRequest.PasswordRequestOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            if (SafeParcelReader.m4553w(E) != 1) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                z = SafeParcelReader.m4554x(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new BeginSignInRequest.PasswordRequestOptions(z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.PasswordRequestOptions[i];
    }
}
