package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzaa implements Parcelable.Creator<zzz> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        Thing[] thingArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        zzc zzc = null;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel, E);
                    break;
                case 2:
                    thingArr = (Thing[]) SafeParcelReader.m4550t(parcel, E, Thing.CREATOR);
                    break;
                case 3:
                    strArr = SafeParcelReader.m4548r(parcel, E);
                    break;
                case 5:
                    strArr2 = SafeParcelReader.m4548r(parcel, E);
                    break;
                case 6:
                    zzc = (zzc) SafeParcelReader.m4546p(parcel, E, zzc.CREATOR);
                    break;
                case 7:
                    str = SafeParcelReader.m4547q(parcel, E);
                    break;
                case 8:
                    str2 = SafeParcelReader.m4547q(parcel, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzz(i, thingArr, strArr, strArr2, zzc, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzz[i];
    }
}
