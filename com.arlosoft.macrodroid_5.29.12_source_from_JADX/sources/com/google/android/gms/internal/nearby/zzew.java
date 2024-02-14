package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzew implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        IBinder iBinder = null;
        ExposureConfiguration exposureConfiguration = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 3) {
                iBinder = SafeParcelReader.m4519F(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                exposureConfiguration = (ExposureConfiguration) SafeParcelReader.m4546p(parcel, E, ExposureConfiguration.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzev(iBinder, exposureConfiguration);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzev[i];
    }
}
