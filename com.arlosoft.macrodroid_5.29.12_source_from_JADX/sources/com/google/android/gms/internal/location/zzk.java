package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzs;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzk implements Parcelable.Creator<zzj> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        zzs zzs = zzj.f41146g;
        List<ClientIdentity> list = zzj.f41145f;
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                zzs = (zzs) SafeParcelReader.m4546p(parcel, E, zzs.CREATOR);
            } else if (w == 2) {
                list = SafeParcelReader.m4551u(parcel, E, ClientIdentity.CREATOR);
            } else if (w != 3) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                str = SafeParcelReader.m4547q(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzj(zzs, list, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
