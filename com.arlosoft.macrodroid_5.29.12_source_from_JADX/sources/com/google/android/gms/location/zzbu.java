package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbu implements Parcelable.Creator<SleepClassifyEvent> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        int i8 = 0;
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
                    i5 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 6:
                    i6 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 7:
                    i7 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 8:
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 9:
                    i8 = SafeParcelReader.m4520G(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new SleepClassifyEvent(i, i2, i3, i4, i5, i6, i7, z, i8);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SleepClassifyEvent[i];
    }
}
