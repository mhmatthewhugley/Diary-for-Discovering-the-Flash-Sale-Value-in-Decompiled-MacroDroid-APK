package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzm implements Parcelable.Creator<zzl> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        zzj zzj = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 2) {
                zzj = (zzj) SafeParcelReader.m4546p(parcel, E, zzj.CREATOR);
            } else if (w == 3) {
                iBinder = SafeParcelReader.m4519F(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                iBinder2 = SafeParcelReader.m4519F(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzl(i, zzj, iBinder, iBinder2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
