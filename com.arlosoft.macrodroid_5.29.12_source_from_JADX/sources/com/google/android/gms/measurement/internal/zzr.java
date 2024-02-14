package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        String str = "";
        String str2 = str;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str10 = null;
        String str11 = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 2:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 3:
                    str4 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 4:
                    str5 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 5:
                    str6 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 6:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 7:
                    j2 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 8:
                    str7 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 9:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 10:
                    z2 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 11:
                    j6 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 12:
                    str8 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 13:
                    j3 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 14:
                    j4 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 15:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 16:
                    z3 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 18:
                    z4 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 19:
                    str9 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 21:
                    bool = SafeParcelReader.m4555y(parcel2, E);
                    break;
                case 22:
                    j5 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 23:
                    arrayList = SafeParcelReader.m4549s(parcel2, E);
                    break;
                case 24:
                    str10 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 25:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 26:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 27:
                    str11 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzq(str3, str4, str5, str6, j, j2, str7, z, z2, j6, str8, j3, j4, i, z3, z4, str9, bool, j5, (List) arrayList, str10, str, str2, str11);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
