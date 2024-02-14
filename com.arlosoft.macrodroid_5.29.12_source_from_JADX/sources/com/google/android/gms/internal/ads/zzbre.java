package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbre implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 2) {
                strArr = SafeParcelReader.m4548r(parcel, E);
            } else if (w != 3) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                strArr2 = SafeParcelReader.m4548r(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzbrd(str, strArr, strArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbrd[i];
    }
}
