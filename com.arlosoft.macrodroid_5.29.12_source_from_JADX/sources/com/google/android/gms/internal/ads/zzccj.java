package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzccj extends zzarz implements zzccl {
    zzccj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* renamed from: Fb */
    public final void mo20117Fb(zzl zzl, zzccs zzccs) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzl);
        zzasb.m42229g(y, zzccs);
        mo41865A1(14, y);
    }

    /* renamed from: Pa */
    public final void mo20121Pa(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(5, y);
    }

    /* renamed from: a */
    public final zzdh mo20122a() throws RemoteException {
        Parcel t1 = mo41868t1(12, mo41869y());
        zzdh Jb = zzdg.m2143Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: eb */
    public final void mo20125eb(zzcco zzcco) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzcco);
        mo41865A1(2, y);
    }

    /* renamed from: r7 */
    public final void mo20127r7(zzl zzl, zzccs zzccs) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzl);
        zzasb.m42229g(y, zzccs);
        mo41865A1(1, y);
    }
}
