package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcap implements Parcelable.Creator {
    /* renamed from: a */
    public static final zzcao m44771a(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        long j = 0;
        long j2 = 0;
        Bundle bundle = null;
        zzl zzl = null;
        zzq zzq = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzcgv zzcgv = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        zzbls zzbls = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        zzdo zzdo = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        zzbsc zzbsc = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 2:
                    bundle = SafeParcelReader.m4536f(parcel2, E);
                    break;
                case 3:
                    zzl = (zzl) SafeParcelReader.m4546p(parcel2, E, zzl.CREATOR);
                    break;
                case 4:
                    zzq = (zzq) SafeParcelReader.m4546p(parcel2, E, zzq.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.m4546p(parcel2, E, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.m4546p(parcel2, E, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 9:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 10:
                    str4 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 11:
                    zzcgv = (zzcgv) SafeParcelReader.m4546p(parcel2, E, zzcgv.CREATOR);
                    break;
                case 12:
                    bundle2 = SafeParcelReader.m4536f(parcel2, E);
                    break;
                case 13:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 14:
                    arrayList = SafeParcelReader.m4549s(parcel2, E);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.m4536f(parcel2, E);
                    break;
                case 16:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 18:
                    i3 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 19:
                    i4 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 20:
                    f = SafeParcelReader.m4516C(parcel2, E);
                    break;
                case 21:
                    str5 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 25:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 26:
                    str6 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 27:
                    arrayList2 = SafeParcelReader.m4549s(parcel2, E);
                    break;
                case 28:
                    str7 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 29:
                    zzbls = (zzbls) SafeParcelReader.m4546p(parcel2, E, zzbls.CREATOR);
                    break;
                case 30:
                    arrayList3 = SafeParcelReader.m4549s(parcel2, E);
                    break;
                case 31:
                    j2 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 33:
                    str8 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 34:
                    f2 = SafeParcelReader.m4516C(parcel2, E);
                    break;
                case 35:
                    i5 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 36:
                    i6 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 37:
                    z3 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 39:
                    str9 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 40:
                    z2 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 41:
                    str10 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 42:
                    z4 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 43:
                    i7 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 44:
                    bundle4 = SafeParcelReader.m4536f(parcel2, E);
                    break;
                case 45:
                    str11 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 46:
                    zzdo = (zzdo) SafeParcelReader.m4546p(parcel2, E, zzdo.CREATOR);
                    break;
                case 47:
                    z5 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 48:
                    bundle5 = SafeParcelReader.m4536f(parcel2, E);
                    break;
                case 49:
                    str12 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 50:
                    str13 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 51:
                    str14 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 52:
                    z6 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 53:
                    arrayList4 = SafeParcelReader.m4542l(parcel2, E);
                    break;
                case 54:
                    str15 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 55:
                    arrayList5 = SafeParcelReader.m4549s(parcel2, E);
                    break;
                case 56:
                    i8 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 57:
                    z7 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 58:
                    z8 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 59:
                    z9 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 60:
                    arrayList6 = SafeParcelReader.m4549s(parcel2, E);
                    break;
                case 61:
                    str16 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 63:
                    zzbsc = (zzbsc) SafeParcelReader.m4546p(parcel2, E, zzbsc.CREATOR);
                    break;
                case 64:
                    str17 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 65:
                    bundle6 = SafeParcelReader.m4536f(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzcao(i, bundle, zzl, zzq, str, applicationInfo, packageInfo, str2, str3, str4, zzcgv, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, zzbls, arrayList3, j2, str8, f2, z2, i5, i6, z3, str9, str10, z4, i7, bundle4, str11, zzdo, z5, bundle5, str12, str13, str14, z6, arrayList4, str15, arrayList5, i8, z7, z8, z9, arrayList6, str16, zzbsc, str17, bundle6);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m44771a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcao[i];
    }
}
