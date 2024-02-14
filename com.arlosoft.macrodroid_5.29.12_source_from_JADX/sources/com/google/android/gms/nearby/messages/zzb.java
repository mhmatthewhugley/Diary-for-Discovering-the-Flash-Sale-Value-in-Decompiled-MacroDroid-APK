package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzne;
import com.google.android.gms.internal.nearby.zznj;
import com.google.android.gms.nearby.messages.internal.zzac;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        ArrayList<zzac> arrayList = null;
        ArrayList<zznj> arrayList2 = null;
        ArrayList<zzne> arrayList3 = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                arrayList = SafeParcelReader.m4551u(parcel, E, zzac.CREATOR);
            } else if (w == 2) {
                arrayList2 = SafeParcelReader.m4551u(parcel, E, zznj.CREATOR);
            } else if (w == 3) {
                z = SafeParcelReader.m4554x(parcel, E);
            } else if (w == 4) {
                arrayList3 = SafeParcelReader.m4551u(parcel, E, zzne.CREATOR);
            } else if (w == 5) {
                i2 = SafeParcelReader.m4520G(parcel, E);
            } else if (w != 1000) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                i = SafeParcelReader.m4520G(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new MessageFilter(i, arrayList, arrayList2, z, arrayList3, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MessageFilter[i];
    }
}
