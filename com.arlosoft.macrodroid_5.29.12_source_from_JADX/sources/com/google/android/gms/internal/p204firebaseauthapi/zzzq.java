package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        zzzt zzzt = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            if (SafeParcelReader.m4553w(E) != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                zzzt = (zzzt) SafeParcelReader.m4546p(parcel, E, zzzt.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzzp(zzzt);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzzp[i];
    }
}