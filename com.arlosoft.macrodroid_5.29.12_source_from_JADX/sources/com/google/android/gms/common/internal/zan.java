package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zan implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 2:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 3:
                    i3 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 4:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 5:
                    j2 = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 6:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 7:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 8:
                    i4 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 9:
                    i5 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new MethodInvocation(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
