package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzad implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        zzkw zzkw = null;
        String str3 = null;
        zzaw zzaw = null;
        zzaw zzaw2 = null;
        zzaw zzaw3 = null;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 2:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 3:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 4:
                    zzkw = (zzkw) SafeParcelReader.m4546p(parcel2, E, zzkw.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 6:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 7:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 8:
                    zzaw = (zzaw) SafeParcelReader.m4546p(parcel2, E, zzaw.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 10:
                    zzaw2 = (zzaw) SafeParcelReader.m4546p(parcel2, E, zzaw.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 12:
                    zzaw3 = (zzaw) SafeParcelReader.m4546p(parcel2, E, zzaw.CREATOR);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzac(str, str2, zzkw, j, z, str3, zzaw, j2, zzaw2, j3, zzaw3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzac[i];
    }
}
