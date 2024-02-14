package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcbd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        Bundle bundle = null;
        zzcgv zzcgv = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        zzffx zzffx = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    bundle = SafeParcelReader.m4536f(parcel2, E);
                    break;
                case 2:
                    zzcgv = (zzcgv) SafeParcelReader.m4546p(parcel2, E, zzcgv.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.m4546p(parcel2, E, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 5:
                    arrayList = SafeParcelReader.m4549s(parcel2, E);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.m4546p(parcel2, E, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 9:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 10:
                    zzffx = (zzffx) SafeParcelReader.m4546p(parcel2, E, zzffx.CREATOR);
                    break;
                case 11:
                    str4 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 12:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzcbc(bundle, zzcgv, applicationInfo, str, arrayList, packageInfo, str2, str3, zzffx, str4, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcbc[i];
    }
}
