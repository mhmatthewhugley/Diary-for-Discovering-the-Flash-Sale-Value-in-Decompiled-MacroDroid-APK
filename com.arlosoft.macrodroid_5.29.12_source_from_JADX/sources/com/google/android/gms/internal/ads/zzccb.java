package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzccb extends zzarz implements zzccd {
    zzccb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: D1 */
    public final void mo43333D1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(1, y);
    }

    /* renamed from: J4 */
    public final void mo43334J4(IObjectWrapper iObjectWrapper, zzcce zzcce) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42227e(y, zzcce);
        mo41865A1(7, y);
    }

    /* renamed from: L0 */
    public final void mo43335L0(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        y.writeInt(i);
        mo41865A1(9, y);
    }

    /* renamed from: O2 */
    public final void mo43336O2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(11, y);
    }

    /* renamed from: f1 */
    public final void mo43337f1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(6, y);
    }

    /* renamed from: i0 */
    public final void mo43338i0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(4, y);
    }

    /* renamed from: k2 */
    public final void mo43339k2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(5, y);
    }

    /* renamed from: y0 */
    public final void mo43340y0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(3, y);
    }

    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(8, y);
    }
}
