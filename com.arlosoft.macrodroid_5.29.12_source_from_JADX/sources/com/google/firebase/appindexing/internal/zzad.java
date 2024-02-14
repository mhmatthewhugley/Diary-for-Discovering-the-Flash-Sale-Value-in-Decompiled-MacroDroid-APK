package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzad implements Parcelable.Creator<Thing> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        Bundle bundle = null;
        zzac zzac = null;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                bundle = SafeParcelReader.m4536f(parcel, E);
            } else if (w == 2) {
                zzac = (zzac) SafeParcelReader.m4546p(parcel, E, zzac.CREATOR);
            } else if (w == 3) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 4) {
                str2 = SafeParcelReader.m4547q(parcel, E);
            } else if (w != 1000) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                i = SafeParcelReader.m4520G(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new Thing(i, bundle, zzac, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Thing[i];
    }
}
