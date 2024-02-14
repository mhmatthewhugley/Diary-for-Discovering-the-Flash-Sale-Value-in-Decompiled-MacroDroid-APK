package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzm implements Parcelable.Creator {
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
        int i = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 2:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 3:
                    str = SafeParcelReader.m4547q(parcel2, E);
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
                    str5 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 8:
                    str6 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 9:
                    b = SafeParcelReader.m4556z(parcel2, E);
                    break;
                case 10:
                    b2 = SafeParcelReader.m4556z(parcel2, E);
                    break;
                case 11:
                    b3 = SafeParcelReader.m4556z(parcel2, E);
                    break;
                case 12:
                    b4 = SafeParcelReader.m4556z(parcel2, E);
                    break;
                case 13:
                    str7 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzl(i, str, str2, str3, str4, str5, str6, b, b2, b3, b4, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
