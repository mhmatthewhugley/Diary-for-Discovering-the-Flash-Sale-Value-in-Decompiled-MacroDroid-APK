package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        Strategy strategy = null;
        ParcelUuid parcelUuid = null;
        byte[] bArr = null;
        int[] iArr = null;
        long j = 0;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = false;
        int i = 0;
        int i2 = 0;
        boolean z9 = true;
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
                    parcelUuid = (ParcelUuid) SafeParcelReader.m4546p(parcel2, E, ParcelUuid.CREATOR);
                    break;
                case 8:
                    z5 = SafeParcelReader.m4554x(parcel2, E);
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
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 13:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 14:
                    bArr = SafeParcelReader.m4537g(parcel2, E);
                    break;
                case 15:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 16:
                    iArr = SafeParcelReader.m4541k(parcel2, E);
                    break;
                case 17:
                    z9 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new DiscoveryOptions(strategy, z, z2, z3, z4, parcelUuid, z5, z6, z7, z8, i, i2, bArr, j, iArr, z9);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DiscoveryOptions[i];
    }
}
