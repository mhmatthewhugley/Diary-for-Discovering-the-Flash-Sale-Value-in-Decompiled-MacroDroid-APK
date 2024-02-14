package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzy implements Parcelable.Creator<zzb> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 2:
                    z = SafeParcelReader.m4554x(parcel, E);
                    break;
                case 3:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 4:
                    str2 = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 5:
                    bArr = SafeParcelReader.m4537g(parcel, E);
                    break;
                case 6:
                    z2 = SafeParcelReader.m4554x(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzb(i, z, str, str2, bArr, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }
}
