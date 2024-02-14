package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.exposurenotification.DailySummariesConfig;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzbf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        IBinder iBinder = null;
        DailySummariesConfig dailySummariesConfig = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                iBinder = SafeParcelReader.m4519F(parcel, E);
            } else if (w != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                dailySummariesConfig = (DailySummariesConfig) SafeParcelReader.m4546p(parcel, E, DailySummariesConfig.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzbe(iBinder, dailySummariesConfig);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbe[i];
    }
}
