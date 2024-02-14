package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzy implements Parcelable.Creator<zzx> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        zzi zzi = null;
        String str = null;
        zzg zzg = null;
        String str2 = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        int i2 = -1;
        int i3 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    zzi = (zzi) SafeParcelReader.m4546p(parcel2, E, zzi.CREATOR);
                    break;
                case 2:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 3:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 4:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 5:
                    zzg = (zzg) SafeParcelReader.m4546p(parcel2, E, zzg.CREATOR);
                    break;
                case 6:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 7:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 8:
                    i3 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 9:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzx(zzi, j, i, str, zzg, z, i2, i3, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzx[i];
    }
}
