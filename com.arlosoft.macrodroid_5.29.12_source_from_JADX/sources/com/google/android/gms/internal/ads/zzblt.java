package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzblt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        zzff zzff = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 2:
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 3:
                    i2 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 4:
                    z2 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 5:
                    i3 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 6:
                    zzff = (zzff) SafeParcelReader.m4546p(parcel, E, zzff.CREATOR);
                    break;
                case 7:
                    z3 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 8:
                    i4 = SafeParcelReader.m4520G(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzbls(i, z, i2, z2, i3, zzff, z3, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbls[i];
    }
}
