package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzeg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        int i = 0;
        ConnectionConfiguration[] connectionConfigurationArr = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w != 3) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                connectionConfigurationArr = (ConnectionConfiguration[]) SafeParcelReader.m4550t(parcel, E, ConnectionConfiguration.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzef(i, connectionConfigurationArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzef[i];
    }
}
