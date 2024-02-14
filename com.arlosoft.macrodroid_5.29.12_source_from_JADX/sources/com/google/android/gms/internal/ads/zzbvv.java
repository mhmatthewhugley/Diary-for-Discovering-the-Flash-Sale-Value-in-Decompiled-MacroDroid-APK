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
public final class zzbvv extends zzarz {
    zzbvv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* renamed from: D */
    public final boolean mo43091D() throws RemoteException {
        Parcel t1 = mo41868t1(14, mo41869y());
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }

    /* renamed from: H */
    public final boolean mo43092H() throws RemoteException {
        Parcel t1 = mo41868t1(13, mo41869y());
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }

    /* renamed from: Ib */
    public final IObjectWrapper mo43093Ib() throws RemoteException {
        Parcel t1 = mo41868t1(18, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: Jb */
    public final IObjectWrapper mo43094Jb() throws RemoteException {
        Parcel t1 = mo41868t1(20, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: Kb */
    public final List mo43095Kb() throws RemoteException {
        Parcel t1 = mo41868t1(3, mo41869y());
        ArrayList b = zzasb.m42224b(t1);
        t1.recycle();
        return b;
    }

    /* renamed from: Lb */
    public final void mo43096Lb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(11, y);
    }

    /* renamed from: Mb */
    public final void mo43097Mb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(12, y);
    }

    /* renamed from: Nb */
    public final void mo43098Nb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, iObjectWrapper2);
        zzasb.m42229g(y, iObjectWrapper3);
        mo41865A1(22, y);
    }

    /* renamed from: Z8 */
    public final zzdk mo43099Z8() throws RemoteException {
        Parcel t1 = mo41868t1(17, mo41869y());
        zzdk Jb = zzdj.m2156Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: b */
    public final double mo43100b() throws RemoteException {
        Parcel t1 = mo41868t1(7, mo41869y());
        double readDouble = t1.readDouble();
        t1.recycle();
        return readDouble;
    }

    /* renamed from: b7 */
    public final void mo43101b7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(16, y);
    }

    /* renamed from: c */
    public final Bundle mo43102c() throws RemoteException {
        Parcel t1 = mo41868t1(15, mo41869y());
        Bundle bundle = (Bundle) zzasb.m42223a(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle;
    }

    /* renamed from: ia */
    public final zzblw mo43103ia() throws RemoteException {
        Parcel t1 = mo41868t1(19, mo41869y());
        zzblw Jb = zzblv.m43676Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: j */
    public final IObjectWrapper mo43104j() throws RemoteException {
        Parcel t1 = mo41868t1(21, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: k */
    public final String mo43105k() throws RemoteException {
        Parcel t1 = mo41868t1(4, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: l */
    public final String mo43106l() throws RemoteException {
        Parcel t1 = mo41868t1(2, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: m */
    public final String mo43107m() throws RemoteException {
        Parcel t1 = mo41868t1(9, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: n */
    public final String mo43108n() throws RemoteException {
        Parcel t1 = mo41868t1(6, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: r */
    public final void mo43109r() throws RemoteException {
        mo41865A1(10, mo41869y());
    }

    /* renamed from: s */
    public final String mo43110s() throws RemoteException {
        Parcel t1 = mo41868t1(8, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: sb */
    public final zzbme mo43111sb() throws RemoteException {
        Parcel t1 = mo41868t1(5, mo41869y());
        zzbme Jb = zzbmd.m43695Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }
}
