package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        zzq[] zzqArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 2:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 3:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 4:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 5:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 6:
                    i3 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 7:
                    i4 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 8:
                    zzqArr = (zzq[]) SafeParcelReader.m4550t(parcel2, E, zzq.CREATOR);
                    break;
                case 9:
                    z2 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 10:
                    z3 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 11:
                    z4 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 12:
                    z5 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 13:
                    z6 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 14:
                    z7 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 15:
                    z8 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 16:
                    z9 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzq(str, i, i2, z, i3, i4, zzqArr, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
