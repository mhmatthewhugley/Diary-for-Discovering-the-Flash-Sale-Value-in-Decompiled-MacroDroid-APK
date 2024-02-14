package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zztl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        Status status = null;
        zze zze = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                status = (Status) SafeParcelReader.m4546p(parcel, E, Status.CREATOR);
            } else if (w == 2) {
                zze = (zze) SafeParcelReader.m4546p(parcel, E, zze.CREATOR);
            } else if (w == 3) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                str2 = SafeParcelReader.m4547q(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zztk(status, zze, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zztk[i];
    }
}
