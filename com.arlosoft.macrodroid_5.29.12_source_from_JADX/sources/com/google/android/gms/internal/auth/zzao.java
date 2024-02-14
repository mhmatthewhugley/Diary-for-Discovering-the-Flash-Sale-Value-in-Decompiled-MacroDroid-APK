package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

public final class zzao extends zza implements zzan {
    zzao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    /* renamed from: A2 */
    public final void mo48557A2(zzal zzal, ProxyRequest proxyRequest) throws RemoteException {
        Parcel y = mo48537y();
        zzc.m55793c(y, zzal);
        zzc.m55794d(y, proxyRequest);
        mo48534A1(1, y);
    }

    /* renamed from: ja */
    public final void mo48558ja(zzal zzal) throws RemoteException {
        Parcel y = mo48537y();
        zzc.m55793c(y, zzal);
        mo48534A1(3, y);
    }
}
