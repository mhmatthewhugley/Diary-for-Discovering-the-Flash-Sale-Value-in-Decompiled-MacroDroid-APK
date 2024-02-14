package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<zzo> arrayList = null;
        zziv zziv = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 2) {
                arrayList = SafeParcelReader.m4551u(parcel, E, zzo.CREATOR);
            } else if (w != 3) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                zziv = (zziv) SafeParcelReader.m4546p(parcel, E, zziv.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzq(i, arrayList, zziv);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
