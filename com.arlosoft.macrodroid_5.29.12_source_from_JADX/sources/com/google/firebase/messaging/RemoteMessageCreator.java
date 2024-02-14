package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class RemoteMessageCreator implements Parcelable.Creator<RemoteMessage> {
    /* renamed from: c */
    static void m76995c(RemoteMessage remoteMessage, Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4567e(parcel, 2, remoteMessage.f55015a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @Nullable
    /* renamed from: a */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            if (SafeParcelReader.m4553w(E) != 2) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                bundle = SafeParcelReader.m4536f(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new RemoteMessage(bundle);
    }

    @Nullable
    /* renamed from: b */
    public RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
