package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzffy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 2:
                    i2 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 3:
                    i3 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 4:
                    i4 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 5:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 6:
                    i5 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 7:
                    i6 = SafeParcelReader.m4520G(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzffx(i, i2, i3, i4, str, i5, i6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzffx[i];
    }
}
