package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                j = SafeParcelReader.m4523J(parcel, E);
            } else if (w != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                j2 = SafeParcelReader.m4523J(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzz(j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzz[i];
    }
}
