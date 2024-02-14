package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbxb extends zzarz implements zzbxd {
    zzbxb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: C7 */
    public final void mo43170C7(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbwx zzbwx, zzbvq zzbvq) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        y.writeString(str2);
        zzasb.m42227e(y, zzl);
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, zzbwx);
        zzasb.m42229g(y, zzbvq);
        mo41865A1(18, y);
    }

    /* renamed from: D5 */
    public final void mo43171D5(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbxa zzbxa, zzbvq zzbvq) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        y.writeString(str2);
        zzasb.m42227e(y, zzl);
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, zzbxa);
        zzasb.m42229g(y, zzbvq);
        mo41865A1(20, y);
    }

    /* renamed from: M2 */
    public final void mo43172M2(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbwr zzbwr, zzbvq zzbvq, zzq zzq) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        y.writeString(str2);
        zzasb.m42227e(y, zzl);
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, zzbwr);
        zzasb.m42229g(y, zzbvq);
        zzasb.m42227e(y, zzq);
        mo41865A1(21, y);
    }

    /* renamed from: T9 */
    public final void mo43173T9(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzq zzq, zzbxg zzbxg) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        y.writeString(str);
        zzasb.m42227e(y, bundle);
        zzasb.m42227e(y, bundle2);
        zzasb.m42227e(y, zzq);
        zzasb.m42229g(y, zzbxg);
        mo41865A1(1, y);
    }

    /* renamed from: V4 */
    public final void mo43174V4(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbxa zzbxa, zzbvq zzbvq) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        y.writeString(str2);
        zzasb.m42227e(y, zzl);
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, zzbxa);
        zzasb.m42229g(y, zzbvq);
        mo41865A1(16, y);
    }

    /* renamed from: X1 */
    public final void mo43175X1(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbwr zzbwr, zzbvq zzbvq, zzq zzq) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        y.writeString(str2);
        zzasb.m42227e(y, zzl);
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, zzbwr);
        zzasb.m42229g(y, zzbvq);
        zzasb.m42227e(y, zzq);
        mo41865A1(13, y);
    }

    /* renamed from: a0 */
    public final void mo43176a0(String str) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        mo41865A1(19, y);
    }

    /* renamed from: b */
    public final zzdk mo43177b() throws RemoteException {
        Parcel t1 = mo41868t1(5, mo41869y());
        zzdk Jb = zzdj.m2156Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: c */
    public final zzbxq mo43178c() throws RemoteException {
        Parcel t1 = mo41868t1(2, mo41869y());
        zzbxq zzbxq = (zzbxq) zzasb.m42223a(t1, zzbxq.CREATOR);
        t1.recycle();
        return zzbxq;
    }

    /* renamed from: c0 */
    public final boolean mo43179c0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        Parcel t1 = mo41868t1(17, y);
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }

    /* renamed from: f */
    public final zzbxq mo43180f() throws RemoteException {
        Parcel t1 = mo41868t1(3, mo41869y());
        zzbxq zzbxq = (zzbxq) zzasb.m42223a(t1, zzbxq.CREATOR);
        t1.recycle();
        return zzbxq;
    }

    /* renamed from: q3 */
    public final boolean mo43181q3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        Parcel t1 = mo41868t1(15, y);
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }

    /* renamed from: t2 */
    public final void mo43182t2(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbwu zzbwu, zzbvq zzbvq) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        y.writeString(str2);
        zzasb.m42227e(y, zzl);
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, zzbwu);
        zzasb.m42229g(y, zzbvq);
        mo41865A1(14, y);
    }

    /* renamed from: v4 */
    public final void mo43183v4(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbwx zzbwx, zzbvq zzbvq, zzbls zzbls) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        y.writeString(str2);
        zzasb.m42227e(y, zzl);
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, zzbwx);
        zzasb.m42229g(y, zzbvq);
        zzasb.m42227e(y, zzbls);
        mo41865A1(22, y);
    }
}
