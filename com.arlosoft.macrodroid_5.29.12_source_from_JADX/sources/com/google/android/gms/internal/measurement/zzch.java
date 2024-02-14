package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class zzch extends zzbn implements zzci {
    public zzch() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50775y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            long readLong = parcel.readLong();
            zzbo.m59532c(parcel);
            mo50833M1(parcel.readString(), parcel.readString(), (Bundle) zzbo.m59530a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int d = mo50834d();
            parcel2.writeNoException();
            parcel2.writeInt(d);
        }
        return true;
    }
}
