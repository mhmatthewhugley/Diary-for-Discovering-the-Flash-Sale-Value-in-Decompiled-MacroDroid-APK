package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        byte[] bArr = null;
        int[] iArr = null;
        int[] iArr2 = null;
        byte[] bArr2 = null;
        Strategy strategy = null;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = false;
        boolean z10 = true;
        boolean z11 = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 2:
                    z2 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 3:
                    z3 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 4:
                    z4 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 5:
                    z5 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 6:
                    z6 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 7:
                    z7 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 8:
                    z8 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 9:
                    bArr = SafeParcelReader.m4537g(parcel2, E);
                    break;
                case 10:
                    z9 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 11:
                    z10 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 12:
                    z11 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 13:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 14:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 15:
                    iArr = SafeParcelReader.m4541k(parcel2, E);
                    break;
                case 16:
                    iArr2 = SafeParcelReader.m4541k(parcel2, E);
                    break;
                case 17:
                    bArr2 = SafeParcelReader.m4537g(parcel2, E);
                    break;
                case 18:
                    strategy = (Strategy) SafeParcelReader.m4546p(parcel2, E, Strategy.CREATOR);
                    break;
                case 19:
                    i3 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new ConnectionOptions(z, z2, z3, z4, z5, z6, z7, z8, bArr, z9, z10, z11, i, i2, iArr, iArr2, bArr2, strategy, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionOptions[i];
    }
}
