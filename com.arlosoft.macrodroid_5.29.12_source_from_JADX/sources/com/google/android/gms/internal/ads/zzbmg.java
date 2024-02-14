package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbmg extends zzarz implements zzbmi {
    zzbmg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: E9 */
    public final void mo20103E9(zzbmb zzbmb) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbmb);
        mo41865A1(8, y);
    }

    /* renamed from: V2 */
    public final void mo20104V2(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        y.writeInt(i);
        mo41865A1(5, y);
    }

    /* renamed from: Xa */
    public final void mo20105Xa(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(1, y);
    }

    /* renamed from: a5 */
    public final void mo20107a5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(6, y);
    }

    /* renamed from: d0 */
    public final void mo20108d0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(7, y);
    }

    /* renamed from: o9 */
    public final void mo20109o9(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(9, y);
    }

    /* renamed from: t */
    public final IObjectWrapper mo20110t(String str) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        Parcel t1 = mo41868t1(2, y);
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: y5 */
    public final void mo20111y5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(3, y);
    }
}
