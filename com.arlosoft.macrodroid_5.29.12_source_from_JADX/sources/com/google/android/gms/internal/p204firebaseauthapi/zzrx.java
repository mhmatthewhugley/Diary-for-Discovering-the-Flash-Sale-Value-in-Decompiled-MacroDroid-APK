package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrx */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzrx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        zzaay zzaay = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                zzaay = (zzaay) SafeParcelReader.m4546p(parcel, E, zzaay.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzrw(str, zzaay);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzrw[i];
    }
}
