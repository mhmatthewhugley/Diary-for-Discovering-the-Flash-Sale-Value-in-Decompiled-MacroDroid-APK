package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzbg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        int i = 0;
        zzbq zzbq = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                zzbq = (zzbq) SafeParcelReader.m4546p(parcel, E, zzbq.CREATOR);
            } else if (w == 3) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 4) {
                i2 = SafeParcelReader.m4520G(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                i3 = SafeParcelReader.m4520G(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzbf(zzbq, i, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbf[i];
    }
}
