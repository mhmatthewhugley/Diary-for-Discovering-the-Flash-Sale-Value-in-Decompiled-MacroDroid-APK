package com.google.android.gms.internal.p203authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.auth-api.zzs */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzs implements Parcelable.Creator<zzt> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            if (SafeParcelReader.m4553w(E) != 1) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                credential = (Credential) SafeParcelReader.m4546p(parcel, E, Credential.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzt(credential);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzt[i];
    }
}
