package com.google.android.gms.internal.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzj implements Parcelable.Creator<zzi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        ArrayList<zzg> arrayList = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 2) {
                str2 = SafeParcelReader.m4547q(parcel, E);
            } else if (w != 6) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                arrayList = SafeParcelReader.m4551u(parcel, E, zzg.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzi(str, str2, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzi[i];
    }
}
