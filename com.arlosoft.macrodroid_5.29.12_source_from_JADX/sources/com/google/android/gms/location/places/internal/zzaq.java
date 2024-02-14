package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzaq implements Parcelable.Creator<zzal> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<zzao> arrayList = null;
        ArrayList<zzan> arrayList2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                arrayList = SafeParcelReader.m4551u(parcel, E, zzao.CREATOR);
            } else if (w != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                arrayList2 = SafeParcelReader.m4551u(parcel, E, zzan.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzal(arrayList, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzal[i];
    }
}
