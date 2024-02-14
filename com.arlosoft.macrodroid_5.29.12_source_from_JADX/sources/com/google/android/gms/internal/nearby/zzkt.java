package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzkt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        zznv zznv = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 2:
                    str2 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 3:
                    str3 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 4:
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 5:
                    bArr = SafeParcelReader.m4537g(parcel, E);
                    break;
                case 6:
                    bArr2 = SafeParcelReader.m4537g(parcel, E);
                    break;
                case 7:
                    bArr3 = SafeParcelReader.m4537g(parcel, E);
                    break;
                case 8:
                    z2 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 9:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 10:
                    zznv = (zznv) SafeParcelReader.m4546p(parcel, E, zznv.CREATOR);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzks(str, str2, str3, z, bArr, bArr2, bArr3, z2, i, zznv);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzks[i];
    }
}
