package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzqb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        zzpu zzpu = null;
        zzpu zzpu2 = null;
        zzpu zzpu3 = null;
        long j = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                zzpu = (zzpu) SafeParcelReader.m4546p(parcel, E, zzpu.CREATOR);
            } else if (w == 2) {
                zzpu2 = (zzpu) SafeParcelReader.m4546p(parcel, E, zzpu.CREATOR);
            } else if (w == 3) {
                zzpu3 = (zzpu) SafeParcelReader.m4546p(parcel, E, zzpu.CREATOR);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                j = SafeParcelReader.m4523J(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzqa(zzpu, zzpu2, zzpu3, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzqa[i];
    }
}
