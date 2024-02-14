package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzu implements Parcelable.Creator<TileOverlayOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        IBinder iBinder = null;
        boolean z = false;
        float f = 0.0f;
        boolean z2 = true;
        float f2 = 0.0f;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                iBinder = SafeParcelReader.m4519F(parcel, E);
            } else if (w == 3) {
                z = SafeParcelReader.m4554x(parcel, E);
            } else if (w == 4) {
                f = SafeParcelReader.m4516C(parcel, E);
            } else if (w == 5) {
                z2 = SafeParcelReader.m4554x(parcel, E);
            } else if (w != 6) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                f2 = SafeParcelReader.m4516C(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new TileOverlayOptions(iBinder, z, f, z2, f2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
