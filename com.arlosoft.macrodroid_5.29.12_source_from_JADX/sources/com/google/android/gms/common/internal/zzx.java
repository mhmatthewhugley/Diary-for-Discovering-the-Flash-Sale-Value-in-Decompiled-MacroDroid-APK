package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzx extends zza implements zzz {
    zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public final int mo21835a() throws RemoteException {
        Parcel y = mo48613y(2, mo48610A1());
        int readInt = y.readInt();
        y.recycle();
        return readInt;
    }

    /* renamed from: d */
    public final IObjectWrapper mo21836d() throws RemoteException {
        Parcel y = mo48613y(1, mo48610A1());
        IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(y.readStrongBinder());
        y.recycle();
        return t1;
    }
}
