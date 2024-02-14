package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzdl extends zzarz implements zzdn {
    zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* renamed from: A5 */
    public final void mo20011A5(boolean z) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42226d(y, z);
        mo41865A1(5, y);
    }

    /* renamed from: b */
    public final void mo20012b() throws RemoteException {
        mo41865A1(4, mo41869y());
    }

    /* renamed from: e */
    public final void mo20013e() throws RemoteException {
        mo41865A1(2, mo41869y());
    }

    /* renamed from: f */
    public final void mo20014f() throws RemoteException {
        mo41865A1(3, mo41869y());
    }

    /* renamed from: g */
    public final void mo20015g() throws RemoteException {
        mo41865A1(1, mo41869y());
    }
}
