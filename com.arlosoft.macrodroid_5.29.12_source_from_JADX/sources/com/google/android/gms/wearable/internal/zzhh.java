package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzhh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        int i = 0;
        long j = 0;
        ArrayList<zzgq> arrayList = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 3) {
                j = SafeParcelReader.m4523J(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                arrayList = SafeParcelReader.m4551u(parcel, E, zzgq.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzhg(i, j, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzhg[i];
    }
}
