package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zznb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            SafeParcelReader.m4553w(E);
            SafeParcelReader.m4527N(parcel, E);
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzna();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzna[i];
    }
}
