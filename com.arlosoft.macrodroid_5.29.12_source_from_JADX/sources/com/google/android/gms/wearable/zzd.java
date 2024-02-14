package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList<String> arrayList = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
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
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 5:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 6:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 7:
                    z2 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 8:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 9:
                    z3 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 10:
                    str4 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 11:
                    str5 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 12:
                    i3 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 13:
                    arrayList = SafeParcelReader.m4549s(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new ConnectionConfiguration(str, str2, i, i2, z, z2, str3, z3, str4, str5, i3, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
