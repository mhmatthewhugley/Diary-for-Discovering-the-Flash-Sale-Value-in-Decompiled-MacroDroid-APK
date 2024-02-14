package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 2:
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 3:
                    z2 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 4:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 5:
                    z3 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 6:
                    f = SafeParcelReader.m4516C(parcel, E);
                    break;
                case 7:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 8:
                    z4 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 9:
                    z5 = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 10:
                    z6 = SafeParcelReader.m4554x(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzj(z, z2, str, z3, f, i, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
