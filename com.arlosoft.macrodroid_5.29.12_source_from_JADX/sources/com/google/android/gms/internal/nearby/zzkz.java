package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzkz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        byte[] bArr = null;
        zznv zznv = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 2) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 3) {
                bArr = SafeParcelReader.m4537g(parcel, E);
            } else if (w == 4) {
                i2 = SafeParcelReader.m4520G(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                zznv = (zznv) SafeParcelReader.m4546p(parcel, E, zznv.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzky(str, i, bArr, i2, zznv);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzky[i];
    }
}
