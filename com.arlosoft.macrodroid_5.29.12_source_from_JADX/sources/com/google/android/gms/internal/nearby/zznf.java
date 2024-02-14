package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zznf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ParcelUuid parcelUuid = null;
        ParcelUuid parcelUuid2 = null;
        ParcelUuid parcelUuid3 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w != 1) {
                switch (w) {
                    case 4:
                        parcelUuid = (ParcelUuid) SafeParcelReader.m4546p(parcel, E, ParcelUuid.CREATOR);
                        break;
                    case 5:
                        parcelUuid2 = (ParcelUuid) SafeParcelReader.m4546p(parcel, E, ParcelUuid.CREATOR);
                        break;
                    case 6:
                        parcelUuid3 = (ParcelUuid) SafeParcelReader.m4546p(parcel, E, ParcelUuid.CREATOR);
                        break;
                    case 7:
                        bArr = SafeParcelReader.m4537g(parcel, E);
                        break;
                    case 8:
                        bArr2 = SafeParcelReader.m4537g(parcel, E);
                        break;
                    case 9:
                        i2 = SafeParcelReader.m4520G(parcel, E);
                        break;
                    case 10:
                        bArr3 = SafeParcelReader.m4537g(parcel, E);
                        break;
                    case 11:
                        bArr4 = SafeParcelReader.m4537g(parcel, E);
                        break;
                    default:
                        SafeParcelReader.m4527N(parcel, E);
                        break;
                }
            } else {
                i = SafeParcelReader.m4520G(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzne(i, parcelUuid, parcelUuid2, parcelUuid3, bArr, bArr2, i2, bArr3, bArr4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzne[i];
    }
}
