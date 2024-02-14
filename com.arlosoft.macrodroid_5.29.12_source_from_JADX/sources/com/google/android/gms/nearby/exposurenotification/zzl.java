package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.exposurenotification.DailySummary;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                d = SafeParcelReader.m4514A(parcel, E);
            } else if (w == 2) {
                d2 = SafeParcelReader.m4514A(parcel, E);
            } else if (w != 3) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                d3 = SafeParcelReader.m4514A(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new DailySummary.ExposureSummaryData(d, d2, d3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DailySummary.ExposureSummaryData[i];
    }
}
