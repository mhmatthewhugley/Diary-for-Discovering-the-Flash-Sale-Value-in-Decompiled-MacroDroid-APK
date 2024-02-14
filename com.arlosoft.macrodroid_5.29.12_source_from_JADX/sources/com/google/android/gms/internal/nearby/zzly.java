package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class zzly implements Parcelable.Creator {
    /* renamed from: a */
    public zzlx createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            if (SafeParcelReader.m4553w(E) != 1) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m4546p(parcel, E, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzlx(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzlx[i];
    }
}
