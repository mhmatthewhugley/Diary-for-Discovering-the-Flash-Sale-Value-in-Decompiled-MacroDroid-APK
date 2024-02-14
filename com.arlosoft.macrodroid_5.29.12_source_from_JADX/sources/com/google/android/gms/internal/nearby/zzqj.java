package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzqj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        IBinder iBinder = null;
        zzpy zzpy = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                iBinder = SafeParcelReader.m4519F(parcel, E);
            } else if (w == 2) {
                zzpy = (zzpy) SafeParcelReader.m4546p(parcel, E, zzpy.CREATOR);
            } else if (w != 3) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                iBinder2 = SafeParcelReader.m4519F(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzqi(iBinder, zzpy, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzqi[i];
    }
}
