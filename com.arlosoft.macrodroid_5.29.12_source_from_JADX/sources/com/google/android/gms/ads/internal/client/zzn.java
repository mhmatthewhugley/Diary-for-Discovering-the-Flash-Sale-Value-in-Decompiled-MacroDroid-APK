package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        zzfb zzfb = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        zzc zzc = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 2:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 3:
                    bundle = SafeParcelReader.m4536f(parcel2, E);
                    break;
                case 4:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 5:
                    arrayList = SafeParcelReader.m4549s(parcel2, E);
                    break;
                case 6:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 7:
                    i3 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 8:
                    z2 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 9:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 10:
                    zzfb = (zzfb) SafeParcelReader.m4546p(parcel2, E, zzfb.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.m4546p(parcel2, E, Location.CREATOR);
                    break;
                case 12:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 13:
                    bundle2 = SafeParcelReader.m4536f(parcel2, E);
                    break;
                case 14:
                    bundle3 = SafeParcelReader.m4536f(parcel2, E);
                    break;
                case 15:
                    arrayList2 = SafeParcelReader.m4549s(parcel2, E);
                    break;
                case 16:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 17:
                    str4 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 18:
                    z3 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 19:
                    zzc = (zzc) SafeParcelReader.m4546p(parcel2, E, zzc.CREATOR);
                    break;
                case 20:
                    i4 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 21:
                    str5 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 22:
                    arrayList3 = SafeParcelReader.m4549s(parcel2, E);
                    break;
                case 23:
                    i5 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 24:
                    str6 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzl(i, j, bundle, i2, arrayList, z, i3, z2, str, zzfb, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, zzc, i4, str5, arrayList3, i5, str6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
