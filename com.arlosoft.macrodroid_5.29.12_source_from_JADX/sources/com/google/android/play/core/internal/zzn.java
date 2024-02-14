package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzn extends zzk implements zzp {
    zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* renamed from: P9 */
    public final void mo59896P9(String str, Bundle bundle, zzr zzr) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        zzm.m70975b(y, bundle);
        zzm.m70976c(y, zzr);
        mo59892t1(2, y);
    }

    /* renamed from: cb */
    public final void mo59897cb(String str, Bundle bundle, zzr zzr) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        zzm.m70975b(y, bundle);
        zzm.m70976c(y, zzr);
        mo59892t1(3, y);
    }
}
