package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzac implements IGmsServiceBroker {

    /* renamed from: a */
    private final IBinder f3743a;

    zzac(IBinder iBinder) {
        this.f3743a = iBinder;
    }

    /* renamed from: P7 */
    public final void mo21715P7(IGmsCallbacks iGmsCallbacks, @Nullable GetServiceRequest getServiceRequest) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(iGmsCallbacks != null ? iGmsCallbacks.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                zzm.m4692a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f3743a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3743a;
    }
}
