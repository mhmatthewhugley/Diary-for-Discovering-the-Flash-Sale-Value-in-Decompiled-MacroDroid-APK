package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzmp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        IBinder iBinder = null;
        String[] strArr = null;
        zzmb zzmb = null;
        zznv zznv = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    iBinder = SafeParcelReader.m4519F(parcel, E);
                    break;
                case 2:
                    strArr = SafeParcelReader.m4548r(parcel, E);
                    break;
                case 3:
                    zzmb = (zzmb) SafeParcelReader.m4546p(parcel, E, zzmb.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 5:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 6:
                    zznv = (zznv) SafeParcelReader.m4546p(parcel, E, zznv.CREATOR);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzmo(iBinder, strArr, zzmb, z, i, zznv);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmo[i];
    }
}
