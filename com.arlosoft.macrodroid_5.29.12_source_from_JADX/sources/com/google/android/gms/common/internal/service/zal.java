package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zal extends zaa {
    zal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    /* renamed from: Z8 */
    public final void mo21745Z8(zak zak) throws RemoteException {
        Parcel y = mo48578y();
        zac.m55857e(y, zak);
        mo48576g8(1, y);
    }
}
