package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzk implements Parcelable.Creator<PolygonOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList<LatLng> arrayList2 = null;
        ArrayList<PatternItem> arrayList3 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 2:
                    arrayList2 = SafeParcelReader.m4551u(parcel, E, LatLng.CREATOR);
                    break;
                case 3:
                    SafeParcelReader.m4522I(parcel, E, arrayList, zzk.class.getClassLoader());
                    break;
                case 4:
                    f = SafeParcelReader.m4516C(parcel, E);
                    break;
                case 5:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 6:
                    i2 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 7:
                    f2 = SafeParcelReader.m4516C(parcel, E);
                    break;
                case 8:
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 9:
                    z2 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 10:
                    z3 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 11:
                    i3 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 12:
                    arrayList3 = SafeParcelReader.m4551u(parcel, E, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new PolygonOptions(arrayList2, arrayList, f, i, i2, f2, z, z2, z3, i3, arrayList3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
