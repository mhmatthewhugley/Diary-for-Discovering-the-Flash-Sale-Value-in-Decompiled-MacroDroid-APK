package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        Long l2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 3) {
                str2 = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 4) {
                l = SafeParcelReader.m4524K(parcel, E);
            } else if (w == 5) {
                str3 = SafeParcelReader.m4547q(parcel, E);
            } else if (w != 6) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                l2 = SafeParcelReader.m4524K(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzzy(str, str2, l, str3, l2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzzy[i];
    }
}
