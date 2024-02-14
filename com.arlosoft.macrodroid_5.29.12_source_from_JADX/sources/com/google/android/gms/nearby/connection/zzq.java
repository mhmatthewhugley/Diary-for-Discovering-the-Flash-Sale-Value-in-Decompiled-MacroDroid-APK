package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                j = SafeParcelReader.m4523J(parcel, E);
            } else if (w == 2) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 3) {
                j2 = SafeParcelReader.m4523J(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                j3 = SafeParcelReader.m4523J(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new PayloadTransferUpdate(j, i, j2, j3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PayloadTransferUpdate[i];
    }
}
