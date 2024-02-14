package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzpp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        zzrv zzrv = null;
        zzqa zzqa = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                zzrv = (zzrv) SafeParcelReader.m4546p(parcel, E, zzrv.CREATOR);
            } else if (w != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                zzqa = (zzqa) SafeParcelReader.m4546p(parcel, E, zzqa.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzpo(zzrv, zzqa);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpo[i];
    }
}
