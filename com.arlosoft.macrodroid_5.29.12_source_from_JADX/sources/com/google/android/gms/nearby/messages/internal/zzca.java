package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.messages.Strategy;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzca implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        zzae zzae = null;
        Strategy strategy = null;
        IBinder iBinder = null;
        String str = null;
        String str2 = null;
        IBinder iBinder2 = null;
        ClientAppContext clientAppContext = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 2:
                    zzae = (zzae) SafeParcelReader.m4546p(parcel2, E, zzae.CREATOR);
                    break;
                case 3:
                    strategy = (Strategy) SafeParcelReader.m4546p(parcel2, E, Strategy.CREATOR);
                    break;
                case 4:
                    iBinder = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 5:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 6:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 7:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 8:
                    iBinder2 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 9:
                    z2 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 10:
                    clientAppContext = (ClientAppContext) SafeParcelReader.m4546p(parcel2, E, ClientAppContext.CREATOR);
                    break;
                case 11:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzbz(i, zzae, strategy, iBinder, str, str2, z, iBinder2, z2, clientAppContext, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbz[i];
    }
}
