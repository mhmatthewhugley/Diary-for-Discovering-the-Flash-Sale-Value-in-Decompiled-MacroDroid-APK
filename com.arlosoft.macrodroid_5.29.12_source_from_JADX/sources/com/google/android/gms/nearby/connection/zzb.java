package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        Strategy strategy = null;
        byte[] bArr = null;
        ParcelUuid parcelUuid = null;
        byte[] bArr2 = null;
        zzu[] zzuArr = null;
        int[] iArr = null;
        int[] iArr2 = null;
        byte[] bArr3 = null;
        long j = 0;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        int i = 0;
        int i2 = 0;
        boolean z12 = false;
        boolean z13 = true;
        boolean z14 = false;
        boolean z15 = true;
        boolean z16 = true;
        int i3 = 0;
        boolean z17 = true;
        int i4 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    strategy = (Strategy) SafeParcelReader.m4546p(parcel2, E, Strategy.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 3:
                    z2 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 4:
                    z3 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 5:
                    z4 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 6:
                    bArr = SafeParcelReader.m4537g(parcel2, E);
                    break;
                case 7:
                    z5 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 8:
                    parcelUuid = (ParcelUuid) SafeParcelReader.m4546p(parcel2, E, ParcelUuid.CREATOR);
                    break;
                case 9:
                    z6 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 10:
                    z7 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 11:
                    z8 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 12:
                    z9 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 13:
                    z10 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 14:
                    z11 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 15:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 16:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 17:
                    bArr2 = SafeParcelReader.m4537g(parcel2, E);
                    break;
                case 18:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 19:
                    zzuArr = (zzu[]) SafeParcelReader.m4550t(parcel2, E, zzu.CREATOR);
                    break;
                case 20:
                    z12 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 21:
                    z13 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 22:
                    z14 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 23:
                    z15 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 24:
                    iArr = SafeParcelReader.m4541k(parcel2, E);
                    break;
                case 25:
                    iArr2 = SafeParcelReader.m4541k(parcel2, E);
                    break;
                case 26:
                    z16 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 27:
                    i3 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 28:
                    bArr3 = SafeParcelReader.m4537g(parcel2, E);
                    break;
                case 29:
                    z17 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 30:
                    i4 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new AdvertisingOptions(strategy, z, z2, z3, z4, bArr, z5, parcelUuid, z6, z7, z8, z9, z10, z11, i, i2, bArr2, j, zzuArr, z12, z13, z14, z15, iArr, iArr2, z16, i3, bArr3, z17, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdvertisingOptions[i];
    }
}
