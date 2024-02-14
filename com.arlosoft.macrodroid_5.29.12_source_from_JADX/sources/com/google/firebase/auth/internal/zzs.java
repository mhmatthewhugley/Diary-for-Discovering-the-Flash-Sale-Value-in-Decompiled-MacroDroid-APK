package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.zze;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        zzx zzx = null;
        zzp zzp = null;
        zze zze = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                zzx = (zzx) SafeParcelReader.m4546p(parcel, E, zzx.CREATOR);
            } else if (w == 2) {
                zzp = (zzp) SafeParcelReader.m4546p(parcel, E, zzp.CREATOR);
            } else if (w != 3) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                zze = (zze) SafeParcelReader.m4546p(parcel, E, zze.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzr(zzx, zzp, zze);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
