package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzl implements Parcelable.Creator<zzk> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        zzs zzs = null;
        byte[] bArr = null;
        int i = -1;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 3) {
                zzs = (zzs) SafeParcelReader.m4546p(parcel, E, zzs.CREATOR);
            } else if (w == 4) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                bArr = SafeParcelReader.m4537g(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzk(str, zzs, i, bArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}
