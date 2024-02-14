package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbza extends zzarz implements zzbzc {
    zzbza(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: P */
    public final boolean mo20189P() throws RemoteException {
        Parcel t1 = mo41868t1(11, mo41869y());
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }

    /* renamed from: T0 */
    public final void mo20193T0(Bundle bundle) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, bundle);
        mo41865A1(1, y);
    }

    /* renamed from: V8 */
    public final void mo20194V8(int i, int i2, Intent intent) throws RemoteException {
        Parcel y = mo41869y();
        y.writeInt(i);
        y.writeInt(i2);
        zzasb.m42227e(y, intent);
        mo41865A1(12, y);
    }

    /* renamed from: e */
    public final void mo20199e() throws RemoteException {
        mo41865A1(10, mo41869y());
    }

    /* renamed from: i0 */
    public final void mo20200i0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(13, y);
    }

    /* renamed from: j */
    public final void mo20201j() throws RemoteException {
        mo41865A1(8, mo41869y());
    }

    /* renamed from: k0 */
    public final void mo20204k0(Bundle bundle) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, bundle);
        Parcel t1 = mo41868t1(6, y);
        if (t1.readInt() != 0) {
            bundle.readFromParcel(t1);
        }
        t1.recycle();
    }

    /* renamed from: l */
    public final void mo20205l() throws RemoteException {
        mo41865A1(2, mo41869y());
    }

    /* renamed from: m */
    public final void mo20206m() throws RemoteException {
        mo41865A1(4, mo41869y());
    }

    /* renamed from: n */
    public final void mo20207n() throws RemoteException {
        mo41865A1(5, mo41869y());
    }

    /* renamed from: p */
    public final void mo20208p() throws RemoteException {
        mo41865A1(7, mo41869y());
    }

    /* renamed from: q */
    public final void mo20210q() throws RemoteException {
        mo41865A1(3, mo41869y());
    }

    /* renamed from: r */
    public final void mo20211r() throws RemoteException {
        mo41865A1(14, mo41869y());
    }

    /* renamed from: w */
    public final void mo20212w() throws RemoteException {
        mo41865A1(9, mo41869y());
    }
}
