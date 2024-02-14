package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zal implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ConnectionResult connectionResult = null;
        zav zav = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.m4546p(parcel, E, ConnectionResult.CREATOR);
            } else if (w != 3) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                zav = (zav) SafeParcelReader.m4546p(parcel, E, zav.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zak(i, connectionResult, zav);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
