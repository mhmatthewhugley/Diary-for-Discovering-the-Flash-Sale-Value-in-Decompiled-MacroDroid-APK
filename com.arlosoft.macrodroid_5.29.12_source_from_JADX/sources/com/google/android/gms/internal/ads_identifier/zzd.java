package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public final class zzd extends zza implements zzf {
    zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: a */
    public final String mo48479a() throws RemoteException {
        Parcel t1 = mo48475t1(1, mo48476y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: d */
    public final boolean mo48480d() throws RemoteException {
        Parcel t1 = mo48475t1(6, mo48476y());
        boolean b = zzc.m55587b(t1);
        t1.recycle();
        return b;
    }

    /* renamed from: o0 */
    public final boolean mo48481o0(boolean z) throws RemoteException {
        Parcel y = mo48476y();
        zzc.m55586a(y, true);
        Parcel t1 = mo48475t1(2, y);
        boolean b = zzc.m55587b(t1);
        t1.recycle();
        return b;
    }
}
