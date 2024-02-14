package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zze implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        int[] iArr = null;
        int[] iArr2 = null;
        int[] iArr3 = null;
        int[] iArr4 = null;
        int[] iArr5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 2:
                    iArr = SafeParcelReader.m4541k(parcel, E);
                    break;
                case 3:
                    i2 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 4:
                    iArr2 = SafeParcelReader.m4541k(parcel, E);
                    break;
                case 5:
                    i3 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 6:
                    iArr3 = SafeParcelReader.m4541k(parcel, E);
                    break;
                case 7:
                    i4 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 8:
                    iArr4 = SafeParcelReader.m4541k(parcel, E);
                    break;
                case 9:
                    i5 = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 10:
                    iArr5 = SafeParcelReader.m4541k(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new ExposureConfiguration(i, iArr, i2, iArr2, i3, iArr3, i4, iArr4, i5, iArr5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExposureConfiguration[i];
    }
}
