package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzpz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        byte[] bArr = null;
        zzqv zzqv = null;
        zzrv[] zzrvArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 2:
                    i2 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 3:
                    bArr = SafeParcelReader.m4537g(parcel, E);
                    break;
                case 4:
                    zzqv = (zzqv) SafeParcelReader.m4546p(parcel, E, zzqv.CREATOR);
                    break;
                case 5:
                    i3 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 6:
                    zzrvArr = (zzrv[]) SafeParcelReader.m4550t(parcel, E, zzrv.CREATOR);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzpy(i, i2, bArr, zzqv, i3, zzrvArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpy[i];
    }
}
