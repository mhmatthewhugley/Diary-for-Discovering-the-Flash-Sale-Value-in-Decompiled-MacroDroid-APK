package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.exposurenotification.DailySummary;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<DailySummary.ExposureSummaryData> arrayList = null;
        DailySummary.ExposureSummaryData exposureSummaryData = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 2) {
                arrayList = SafeParcelReader.m4551u(parcel, E, DailySummary.ExposureSummaryData.CREATOR);
            } else if (w == 3) {
                exposureSummaryData = (DailySummary.ExposureSummaryData) SafeParcelReader.m4546p(parcel, E, DailySummary.ExposureSummaryData.CREATOR);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                str = SafeParcelReader.m4547q(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new DailySummary(i, arrayList, exposureSummaryData, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DailySummary[i];
    }
}
