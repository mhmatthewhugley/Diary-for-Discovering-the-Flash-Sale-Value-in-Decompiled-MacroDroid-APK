package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zam extends zaa {
    zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    /* renamed from: Z8 */
    public final IObjectWrapper mo21765Z8(IObjectWrapper iObjectWrapper, zax zax) throws RemoteException {
        Parcel y = mo48578y();
        zac.m55857e(y, iObjectWrapper);
        zac.m55856d(y, zax);
        Parcel t1 = mo48577t1(2, y);
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }
}
