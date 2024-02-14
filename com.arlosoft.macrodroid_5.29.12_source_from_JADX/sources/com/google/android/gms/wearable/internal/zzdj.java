package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzdj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        Uri uri = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                uri = (Uri) SafeParcelReader.m4546p(parcel, E, Uri.CREATOR);
            } else if (w == 4) {
                bundle = SafeParcelReader.m4536f(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                bArr = SafeParcelReader.m4537g(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzdi(uri, bundle, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdi[i];
    }
}
