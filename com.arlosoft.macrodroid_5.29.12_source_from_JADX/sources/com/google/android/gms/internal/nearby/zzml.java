package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.connection.ConnectionOptions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzml implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        IBinder iBinder4 = null;
        byte[] bArr2 = null;
        ConnectionOptions connectionOptions = null;
        zznv zznv = null;
        byte[] bArr3 = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    iBinder = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 2:
                    iBinder2 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 3:
                    iBinder3 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 4:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 5:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 6:
                    bArr = SafeParcelReader.m4537g(parcel2, E);
                    break;
                case 7:
                    iBinder4 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 8:
                    bArr2 = SafeParcelReader.m4537g(parcel2, E);
                    break;
                case 9:
                    connectionOptions = (ConnectionOptions) SafeParcelReader.m4546p(parcel2, E, ConnectionOptions.CREATOR);
                    break;
                case 10:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 11:
                    zznv = (zznv) SafeParcelReader.m4546p(parcel2, E, zznv.CREATOR);
                    break;
                case 12:
                    bArr3 = SafeParcelReader.m4537g(parcel2, E);
                    break;
                case 13:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzmk(iBinder, iBinder2, iBinder3, str, str2, bArr, iBinder4, bArr2, connectionOptions, i, zznv, bArr3, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmk[i];
    }
}
