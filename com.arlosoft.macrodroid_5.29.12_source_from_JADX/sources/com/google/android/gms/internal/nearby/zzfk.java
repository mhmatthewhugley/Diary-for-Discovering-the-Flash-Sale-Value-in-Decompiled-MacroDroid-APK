package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzfk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str = null;
        byte[] bArr = null;
        IBinder iBinder3 = null;
        zznv zznv = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    iBinder = SafeParcelReader.m4519F(parcel, E);
                    break;
                case 2:
                    iBinder2 = SafeParcelReader.m4519F(parcel, E);
                    break;
                case 3:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 4:
                    bArr = SafeParcelReader.m4537g(parcel, E);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.m4519F(parcel, E);
                    break;
                case 6:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 7:
                    zznv = (zznv) SafeParcelReader.m4546p(parcel, E, zznv.CREATOR);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzfj(iBinder, iBinder2, str, bArr, iBinder3, i, zznv);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfj[i];
    }
}
