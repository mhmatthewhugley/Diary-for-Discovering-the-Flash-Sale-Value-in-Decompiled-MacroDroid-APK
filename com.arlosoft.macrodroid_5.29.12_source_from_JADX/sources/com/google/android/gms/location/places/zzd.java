package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzd implements Parcelable.Creator<AutocompleteFilter> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<Integer> arrayList = null;
        String str = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                z = SafeParcelReader.m4554x(parcel, E);
            } else if (w == 2) {
                arrayList = SafeParcelReader.m4542l(parcel, E);
            } else if (w == 3) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w != 1000) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                i = SafeParcelReader.m4520G(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new AutocompleteFilter(i, z, arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutocompleteFilter[i];
    }
}
