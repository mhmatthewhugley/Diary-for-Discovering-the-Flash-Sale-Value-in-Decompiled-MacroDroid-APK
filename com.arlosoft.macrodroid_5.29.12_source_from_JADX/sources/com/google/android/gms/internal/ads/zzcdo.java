package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcdo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 2:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 3:
                    str2 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 4:
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 5:
                    z2 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m4549s(parcel, E);
                    break;
                case 7:
                    z3 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 8:
                    z4 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m4549s(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzcdn(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcdn[i];
    }
}
