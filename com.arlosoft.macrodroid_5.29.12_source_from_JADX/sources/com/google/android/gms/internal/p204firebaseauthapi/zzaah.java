package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaah */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaah implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<zzaae> arrayList = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            if (SafeParcelReader.m4553w(E) != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                arrayList = SafeParcelReader.m4551u(parcel, E, zzaae.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzaag(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaag[i];
    }
}
