package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbvx extends zzarz implements zzbvz {
    zzbvx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: B8 */
    public final void mo43131B8(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(22, y);
    }

    /* renamed from: D */
    public final void mo43132D() throws RemoteException {
        mo41865A1(19, mo41869y());
    }

    /* renamed from: F */
    public final boolean mo43133F() throws RemoteException {
        Parcel t1 = mo41868t1(18, mo41869y());
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }

    /* renamed from: V */
    public final boolean mo43134V() throws RemoteException {
        Parcel t1 = mo41868t1(17, mo41869y());
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }

    /* renamed from: b */
    public final double mo43135b() throws RemoteException {
        Parcel t1 = mo41868t1(8, mo41869y());
        double readDouble = t1.readDouble();
        t1.recycle();
        return readDouble;
    }

    /* renamed from: b7 */
    public final void mo43136b7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(20, y);
    }

    /* renamed from: c */
    public final float mo43137c() throws RemoteException {
        Parcel t1 = mo41868t1(23, mo41869y());
        float readFloat = t1.readFloat();
        t1.recycle();
        return readFloat;
    }

    /* renamed from: e */
    public final float mo43138e() throws RemoteException {
        Parcel t1 = mo41868t1(24, mo41869y());
        float readFloat = t1.readFloat();
        t1.recycle();
        return readFloat;
    }

    /* renamed from: f */
    public final float mo43139f() throws RemoteException {
        Parcel t1 = mo41868t1(25, mo41869y());
        float readFloat = t1.readFloat();
        t1.recycle();
        return readFloat;
    }

    /* renamed from: g */
    public final Bundle mo43140g() throws RemoteException {
        Parcel t1 = mo41868t1(16, mo41869y());
        Bundle bundle = (Bundle) zzasb.m42223a(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle;
    }

    /* renamed from: h */
    public final zzdk mo43141h() throws RemoteException {
        Parcel t1 = mo41868t1(11, mo41869y());
        zzdk Jb = zzdj.m2156Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: i */
    public final zzblw mo43142i() throws RemoteException {
        Parcel t1 = mo41868t1(12, mo41869y());
        zzblw Jb = zzblv.m43676Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: j */
    public final zzbme mo43143j() throws RemoteException {
        Parcel t1 = mo41868t1(5, mo41869y());
        zzbme Jb = zzbmd.m43695Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: k */
    public final IObjectWrapper mo43144k() throws RemoteException {
        Parcel t1 = mo41868t1(13, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: l */
    public final IObjectWrapper mo43145l() throws RemoteException {
        Parcel t1 = mo41868t1(15, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: m */
    public final String mo43146m() throws RemoteException {
        Parcel t1 = mo41868t1(7, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: n */
    public final IObjectWrapper mo43147n() throws RemoteException {
        Parcel t1 = mo41868t1(14, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: p */
    public final String mo43148p() throws RemoteException {
        Parcel t1 = mo41868t1(2, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: q */
    public final String mo43149q() throws RemoteException {
        Parcel t1 = mo41868t1(6, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: r */
    public final String mo43150r() throws RemoteException {
        Parcel t1 = mo41868t1(10, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: s */
    public final String mo43151s() throws RemoteException {
        Parcel t1 = mo41868t1(4, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: u */
    public final String mo43152u() throws RemoteException {
        Parcel t1 = mo41868t1(9, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: w */
    public final List mo43153w() throws RemoteException {
        Parcel t1 = mo41868t1(3, mo41869y());
        ArrayList b = zzasb.m42224b(t1);
        t1.recycle();
        return b;
    }

    /* renamed from: wa */
    public final void mo43154wa(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, iObjectWrapper2);
        zzasb.m42229g(y, iObjectWrapper3);
        mo41865A1(21, y);
    }
}
