package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 2) {
                i2 = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 3) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                j = SafeParcelReader.m4523J(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzs(i, i2, str, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
