package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.wearable.zzb;
import com.google.android.gms.internal.wearable.zzc;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public abstract class zzet extends zzb implements zzeu {
    public zzet() {
        super("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo53847y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        zzc.m64214b(parcel);
        mo56333g2(readInt, readInt2);
        parcel2.writeNoException();
        return true;
    }
}
