package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzx implements Parcelable.Creator<zzac> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        Bundle bundle = null;
        Bundle bundle2 = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                z = SafeParcelReader.m4554x(parcel, E);
            } else if (w == 2) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 3) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 4) {
                bundle = SafeParcelReader.m4536f(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                bundle2 = SafeParcelReader.m4536f(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzac(z, i, str, bundle, bundle2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzac[i];
    }
}
