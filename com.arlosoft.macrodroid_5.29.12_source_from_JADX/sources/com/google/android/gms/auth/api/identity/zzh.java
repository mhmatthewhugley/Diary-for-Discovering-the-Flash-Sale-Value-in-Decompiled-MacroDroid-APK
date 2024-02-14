package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzh implements Parcelable.Creator<BeginSignInRequest.GoogleIdTokenRequestOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 2:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 3:
                    str2 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 4:
                    z2 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 5:
                    str3 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m4549s(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(z, str, str2, z2, str3, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
    }
}
