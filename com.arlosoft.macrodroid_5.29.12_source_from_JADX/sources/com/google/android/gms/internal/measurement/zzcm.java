package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzcm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 2:
                    j2 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 3:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 4:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 5:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 6:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 7:
                    bundle = SafeParcelReader.m4536f(parcel2, E);
                    break;
                case 8:
                    str4 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzcl(j, j2, z, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcl[i];
    }
}
