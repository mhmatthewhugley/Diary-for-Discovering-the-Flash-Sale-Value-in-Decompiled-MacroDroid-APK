package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class zza implements Parcelable.Creator<CloudMessage> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            if (SafeParcelReader.m4553w(E) != 1) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                intent = (Intent) SafeParcelReader.m4546p(parcel, E, Intent.CREATOR);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new CloudMessage(intent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CloudMessage[i];
    }
}
