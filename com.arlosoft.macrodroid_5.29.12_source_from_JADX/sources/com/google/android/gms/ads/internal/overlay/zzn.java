package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzcgv;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        zzc zzc = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        zzcgv zzcgv = null;
        String str4 = null;
        zzj zzj = null;
        IBinder iBinder6 = null;
        String str5 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        IBinder iBinder10 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder11 = null;
        IBinder iBinder12 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 2:
                    zzc = (zzc) SafeParcelReader.m4546p(parcel2, E, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 7:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 8:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 9:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 10:
                    iBinder5 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 11:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 12:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 13:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 14:
                    zzcgv = (zzcgv) SafeParcelReader.m4546p(parcel2, E, zzcgv.CREATOR);
                    break;
                case 16:
                    str4 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 17:
                    zzj = (zzj) SafeParcelReader.m4546p(parcel2, E, zzj.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 19:
                    str5 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 20:
                    iBinder7 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 21:
                    iBinder8 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 22:
                    iBinder9 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 23:
                    iBinder10 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 24:
                    str6 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 25:
                    str7 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 26:
                    iBinder11 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 27:
                    iBinder12 = SafeParcelReader.m4519F(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new AdOverlayInfoParcel(zzc, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, zzcgv, str4, zzj, iBinder6, str5, iBinder7, iBinder8, iBinder9, iBinder10, str6, str7, iBinder11, iBinder12);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
