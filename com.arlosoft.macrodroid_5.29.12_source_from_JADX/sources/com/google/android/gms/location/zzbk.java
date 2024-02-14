package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbk implements Parcelable.Creator<zzbj> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                str2 = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 2) {
                str3 = SafeParcelReader.m4547q(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                str = SafeParcelReader.m4547q(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzbj(str, str2, str3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzbj[i];
    }
}
