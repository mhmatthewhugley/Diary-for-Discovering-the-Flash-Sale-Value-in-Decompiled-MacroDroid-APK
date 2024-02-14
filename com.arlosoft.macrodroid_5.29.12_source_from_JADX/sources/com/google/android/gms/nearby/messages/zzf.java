package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w != 1000) {
                switch (w) {
                    case 1:
                        i2 = SafeParcelReader.m4520G(parcel, E);
                        break;
                    case 2:
                        i3 = SafeParcelReader.m4520G(parcel, E);
                        break;
                    case 3:
                        i4 = SafeParcelReader.m4520G(parcel, E);
                        break;
                    case 4:
                        z = SafeParcelReader.m4554x(parcel, E);
                        break;
                    case 5:
                        i5 = SafeParcelReader.m4520G(parcel, E);
                        break;
                    case 6:
                        i6 = SafeParcelReader.m4520G(parcel, E);
                        break;
                    case 7:
                        i7 = SafeParcelReader.m4520G(parcel, E);
                        break;
                    default:
                        SafeParcelReader.m4527N(parcel, E);
                        break;
                }
            } else {
                i = SafeParcelReader.m4520G(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new Strategy(i, i2, i3, i4, z, i5, i6, i7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Strategy[i];
    }
}
