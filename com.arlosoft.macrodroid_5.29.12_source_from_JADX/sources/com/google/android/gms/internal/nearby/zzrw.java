package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzrw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        zzqq zzqq = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            if (SafeParcelReader.m4553w(E) != 1) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                zzqq = (zzqq) SafeParcelReader.m4546p(parcel, E, zzqq.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzrv(zzqq);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzrv[i];
    }
}
