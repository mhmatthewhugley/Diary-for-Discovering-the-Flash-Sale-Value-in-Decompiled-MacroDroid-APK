package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzp implements Parcelable.Creator<zzo> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        Status status = null;
        ArrayList<zzx> arrayList = null;
        String[] strArr = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                status = (Status) SafeParcelReader.m4546p(parcel, E, Status.CREATOR);
            } else if (w == 2) {
                arrayList = SafeParcelReader.m4551u(parcel, E, zzx.CREATOR);
            } else if (w != 3) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                strArr = SafeParcelReader.m4548r(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzo(status, arrayList, strArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
