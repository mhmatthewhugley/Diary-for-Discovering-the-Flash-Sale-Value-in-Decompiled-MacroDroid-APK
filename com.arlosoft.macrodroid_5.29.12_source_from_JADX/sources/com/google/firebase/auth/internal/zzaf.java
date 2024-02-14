package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<PhoneMultiFactorInfo> arrayList = null;
        zzag zzag = null;
        String str = null;
        zze zze = null;
        zzx zzx = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                arrayList = SafeParcelReader.m4551u(parcel, E, PhoneMultiFactorInfo.CREATOR);
            } else if (w == 2) {
                zzag = (zzag) SafeParcelReader.m4546p(parcel, E, zzag.CREATOR);
            } else if (w == 3) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 4) {
                zze = (zze) SafeParcelReader.m4546p(parcel, E, zze.CREATOR);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                zzx = (zzx) SafeParcelReader.m4546p(parcel, E, zzx.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzae(arrayList, zzag, str, zze, zzx);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzae[i];
    }
}
