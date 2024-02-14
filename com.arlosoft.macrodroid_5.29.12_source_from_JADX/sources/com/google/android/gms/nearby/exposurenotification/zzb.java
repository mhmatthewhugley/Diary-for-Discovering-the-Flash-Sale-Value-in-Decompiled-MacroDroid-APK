package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<Double> arrayList = null;
        ArrayList<Double> arrayList2 = null;
        ArrayList<Integer> arrayList3 = null;
        ArrayList<Double> arrayList4 = null;
        double d = 0.0d;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    arrayList = SafeParcelReader.m4539i(parcel, E);
                    break;
                case 2:
                    arrayList2 = SafeParcelReader.m4539i(parcel, E);
                    break;
                case 3:
                    arrayList3 = SafeParcelReader.m4542l(parcel, E);
                    break;
                case 4:
                    arrayList4 = SafeParcelReader.m4539i(parcel, E);
                    break;
                case 5:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 6:
                    d = SafeParcelReader.m4514A(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new DailySummariesConfig(arrayList, arrayList2, arrayList3, arrayList4, i, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DailySummariesConfig[i];
    }
}
