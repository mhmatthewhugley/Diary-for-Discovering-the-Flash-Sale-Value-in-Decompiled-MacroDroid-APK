package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zad implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        int i = 0;
        ArrayList<zac> arrayList = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                arrayList = SafeParcelReader.m4551u(parcel, E, zac.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new StringToIntConverter(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StringToIntConverter[i];
    }
}
