package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zznk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                i2 = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 2) {
                bArr = SafeParcelReader.m4537g(parcel, E);
            } else if (w == 3) {
                z = SafeParcelReader.m4554x(parcel, E);
            } else if (w != 1000) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                i = SafeParcelReader.m4520G(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zznj(i, i2, bArr, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zznj[i];
    }
}
