package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbf implements Parcelable.Creator<zzbe> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        long j = 0;
        int i = 0;
        short s = 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 2:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 3:
                    s = SafeParcelReader.m4525L(parcel2, E);
                    break;
                case 4:
                    d = SafeParcelReader.m4514A(parcel2, E);
                    break;
                case 5:
                    d2 = SafeParcelReader.m4514A(parcel2, E);
                    break;
                case 6:
                    f = SafeParcelReader.m4516C(parcel2, E);
                    break;
                case 7:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 8:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 9:
                    i3 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzbe(str, i, s, d, d2, f, j, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzbe[i];
    }
}
