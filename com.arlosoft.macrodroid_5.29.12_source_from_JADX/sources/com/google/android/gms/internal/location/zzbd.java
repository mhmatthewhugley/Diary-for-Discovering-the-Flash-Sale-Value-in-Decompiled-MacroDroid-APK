package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbd implements Parcelable.Creator<zzbc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        zzba zzba = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 2:
                    zzba = (zzba) SafeParcelReader.m4546p(parcel, E, zzba.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.m4519F(parcel, E);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.m4546p(parcel, E, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = SafeParcelReader.m4519F(parcel, E);
                    break;
                case 6:
                    iBinder3 = SafeParcelReader.m4519F(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzbc(i, zzba, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzbc[i];
    }
}
