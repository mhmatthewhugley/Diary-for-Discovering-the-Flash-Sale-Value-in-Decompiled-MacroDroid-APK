package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        zze zze = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 2:
                    j = SafeParcelReader.m4523J(parcel, E);
                    break;
                case 3:
                    zze = (zze) SafeParcelReader.m4546p(parcel, E, zze.CREATOR);
                    break;
                case 4:
                    bundle = SafeParcelReader.m4536f(parcel, E);
                    break;
                case 5:
                    str2 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 6:
                    str3 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 7:
                    str4 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 8:
                    str5 = SafeParcelReader.m4547q(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzu(str, j, zze, bundle, str2, str3, str4, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzu[i];
    }
}
