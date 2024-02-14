package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

public final class zzi implements Parcelable.Creator<PlaceFilter> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<Integer> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<zzp> arrayList3 = null;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                arrayList = SafeParcelReader.m4542l(parcel, E);
            } else if (w == 6) {
                arrayList2 = SafeParcelReader.m4549s(parcel, E);
            } else if (w == 3) {
                z = SafeParcelReader.m4554x(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                arrayList3 = SafeParcelReader.m4551u(parcel, E, zzp.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new PlaceFilter((List<Integer>) arrayList, z, (List<String>) arrayList2, (List<zzp>) arrayList3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlaceFilter[i];
    }
}
