package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                i2 = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 2) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m4546p(parcel, E, PendingIntent.CREATOR);
            } else if (w == 4) {
                connectionResult = (ConnectionResult) SafeParcelReader.m4546p(parcel, E, ConnectionResult.CREATOR);
            } else if (w != 1000) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                i = SafeParcelReader.m4520G(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new Status(i, i2, str, pendingIntent, connectionResult);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
