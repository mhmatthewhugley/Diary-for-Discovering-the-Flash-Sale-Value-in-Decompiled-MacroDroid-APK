package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
public final class zzb implements Parcelable.Creator<UserAddress> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
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
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 5:
                    str4 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 6:
                    str5 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 7:
                    str6 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 8:
                    str7 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 9:
                    str8 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 10:
                    str9 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 11:
                    str10 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 12:
                    str11 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 13:
                    str12 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 14:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 15:
                    str13 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 16:
                    str14 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new UserAddress(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, str13, str14);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserAddress[i];
    }
}
