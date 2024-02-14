package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzab implements Parcelable.Creator<zzaa> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        Status status = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            if (SafeParcelReader.m4553w(E) != 1) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                status = (Status) SafeParcelReader.m4546p(parcel, E, Status.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzaa(status);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzaa[i];
    }
}
