package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzt implements Parcelable.Creator<zzs> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzm[] zzmArr = null;
        String str4 = null;
        zzu zzu = null;
        boolean z = false;
        int i = 1;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 11) {
                str4 = SafeParcelReader.m4547q(parcel, E);
            } else if (w != 12) {
                switch (w) {
                    case 1:
                        str = SafeParcelReader.m4547q(parcel, E);
                        break;
                    case 2:
                        str2 = SafeParcelReader.m4547q(parcel, E);
                        break;
                    case 3:
                        z = SafeParcelReader.m4554x(parcel, E);
                        break;
                    case 4:
                        i = SafeParcelReader.m4520G(parcel, E);
                        break;
                    case 5:
                        z2 = SafeParcelReader.m4554x(parcel, E);
                        break;
                    case 6:
                        str3 = SafeParcelReader.m4547q(parcel, E);
                        break;
                    case 7:
                        zzmArr = (zzm[]) SafeParcelReader.m4550t(parcel, E, zzm.CREATOR);
                        break;
                    default:
                        SafeParcelReader.m4527N(parcel, E);
                        break;
                }
            } else {
                zzu = (zzu) SafeParcelReader.m4546p(parcel, E, zzu.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzs(str, str2, z, i, z2, str3, zzmArr, str4, zzu);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
