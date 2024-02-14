package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzpt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                z = SafeParcelReader.m4554x(parcel, E);
            } else if (w == 2) {
                z2 = SafeParcelReader.m4554x(parcel, E);
            } else if (w == 3) {
                z3 = SafeParcelReader.m4554x(parcel, E);
            } else if (w == 4) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                i2 = SafeParcelReader.m4520G(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzps(z, z2, z3, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzps[i];
    }
}
