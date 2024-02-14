package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbdz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m4546p(parcel, E, ParcelFileDescriptor.CREATOR);
            } else if (w == 3) {
                z = SafeParcelReader.m4554x(parcel, E);
            } else if (w == 4) {
                z2 = SafeParcelReader.m4554x(parcel, E);
            } else if (w == 5) {
                j = SafeParcelReader.m4523J(parcel, E);
            } else if (w != 6) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                z3 = SafeParcelReader.m4554x(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzbdy(parcelFileDescriptor, z, z2, j, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbdy[i];
    }
}
