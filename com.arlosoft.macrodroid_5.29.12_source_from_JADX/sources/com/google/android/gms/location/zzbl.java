package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbl implements Parcelable.Creator<LocationSettingsRequest> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        boolean z = false;
        ArrayList<LocationRequest> arrayList = null;
        zzbj zzbj = null;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                arrayList = SafeParcelReader.m4551u(parcel, E, LocationRequest.CREATOR);
            } else if (w == 2) {
                z = SafeParcelReader.m4554x(parcel, E);
            } else if (w == 3) {
                z2 = SafeParcelReader.m4554x(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                zzbj = (zzbj) SafeParcelReader.m4546p(parcel, E, zzbj.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new LocationSettingsRequest(arrayList, z, z2, zzbj);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
