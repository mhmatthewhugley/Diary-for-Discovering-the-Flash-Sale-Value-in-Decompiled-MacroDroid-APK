package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbrg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 2:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 3:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 4:
                    bArr = SafeParcelReader.m4537g(parcel2, E);
                    break;
                case 5:
                    strArr = SafeParcelReader.m4548r(parcel2, E);
                    break;
                case 6:
                    strArr2 = SafeParcelReader.m4548r(parcel2, E);
                    break;
                case 7:
                    z2 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 8:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzbrf(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbrf[i];
    }
}
