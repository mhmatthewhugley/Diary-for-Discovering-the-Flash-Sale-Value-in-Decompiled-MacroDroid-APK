package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcfl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        String str2 = null;
        zzq zzq = null;
        zzl zzl = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 2) {
                str2 = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 3) {
                zzq = (zzq) SafeParcelReader.m4546p(parcel, E, zzq.CREATOR);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                zzl = (zzl) SafeParcelReader.m4546p(parcel, E, zzl.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzcfk(str, str2, zzq, zzl);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcfk[i];
    }
}
