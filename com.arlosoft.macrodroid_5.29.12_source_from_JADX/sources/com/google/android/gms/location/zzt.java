package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzt implements Parcelable.Creator<zzs> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                z = SafeParcelReader.m4554x(parcel2, E);
            } else if (w == 2) {
                j = SafeParcelReader.m4523J(parcel2, E);
            } else if (w == 3) {
                f = SafeParcelReader.m4516C(parcel2, E);
            } else if (w == 4) {
                j2 = SafeParcelReader.m4523J(parcel2, E);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel2, E);
            } else {
                i = SafeParcelReader.m4520G(parcel2, E);
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzs(z, j, f, j2, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
