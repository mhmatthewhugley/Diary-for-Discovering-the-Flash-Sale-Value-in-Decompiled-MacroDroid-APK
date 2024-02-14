package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        zze zze = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 2) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 3) {
                str2 = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 4) {
                zze = (zze) SafeParcelReader.m4546p(parcel, E, zze.CREATOR);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                iBinder = SafeParcelReader.m4519F(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zze(i, str, str2, zze, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zze[i];
    }
}
