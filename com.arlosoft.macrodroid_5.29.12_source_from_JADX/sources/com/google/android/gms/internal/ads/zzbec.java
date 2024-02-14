package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbec implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 2:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 3:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 4:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 5:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 6:
                    str4 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 7:
                    bundle = SafeParcelReader.m4536f(parcel2, E);
                    break;
                case 8:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 9:
                    j2 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 10:
                    str5 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 11:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzbeb(str, j, str2, str3, str4, bundle, z, j2, str5, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbeb[i];
    }
}
