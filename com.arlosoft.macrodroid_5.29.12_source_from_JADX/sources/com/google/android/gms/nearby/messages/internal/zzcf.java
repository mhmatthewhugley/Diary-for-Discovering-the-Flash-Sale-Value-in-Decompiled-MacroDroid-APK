package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzcf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        zzae zzae = null;
        IBinder iBinder = null;
        String str = null;
        String str2 = null;
        ClientAppContext clientAppContext = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 2:
                    zzae = (zzae) SafeParcelReader.m4546p(parcel, E, zzae.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.m4519F(parcel, E);
                    break;
                case 4:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 5:
                    str2 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 6:
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 7:
                    clientAppContext = (ClientAppContext) SafeParcelReader.m4546p(parcel, E, ClientAppContext.CREATOR);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzce(i, zzae, iBinder, str, str2, z, clientAppContext);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzce[i];
    }
}
