package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaak */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaak implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzaac zzaac = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 3) {
                str2 = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 4) {
                str3 = SafeParcelReader.m4547q(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                zzaac = (zzaac) SafeParcelReader.m4546p(parcel, E, zzaac.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzaaj(str, str2, str3, zzaac);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaaj[i];
    }
}
