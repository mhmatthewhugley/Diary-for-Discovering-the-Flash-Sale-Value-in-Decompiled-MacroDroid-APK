package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzll implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        PayloadTransferUpdate payloadTransferUpdate = null;
        zznv zznv = null;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 1) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 2) {
                payloadTransferUpdate = (PayloadTransferUpdate) SafeParcelReader.m4546p(parcel, E, PayloadTransferUpdate.CREATOR);
            } else if (w == 3) {
                i = SafeParcelReader.m4520G(parcel, E);
            } else if (w != 4) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                zznv = (zznv) SafeParcelReader.m4546p(parcel, E, zznv.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzlk(str, payloadTransferUpdate, i, zznv);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzlk[i];
    }
}
