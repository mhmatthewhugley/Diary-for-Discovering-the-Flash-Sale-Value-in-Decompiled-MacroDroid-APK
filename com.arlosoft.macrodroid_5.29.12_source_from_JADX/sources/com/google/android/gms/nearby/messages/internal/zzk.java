package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        int i = 0;
        ClientAppContext clientAppContext = null;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w == 2) {
                clientAppContext = (ClientAppContext) SafeParcelReader.m4546p(parcel, E, ClientAppContext.CREATOR);
            } else if (w != 3) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                i2 = SafeParcelReader.m4520G(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzj(i, clientAppContext, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
