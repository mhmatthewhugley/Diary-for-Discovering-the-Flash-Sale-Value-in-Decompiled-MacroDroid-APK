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
public final class zzbvw extends zzarz {
    zzbvw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* renamed from: Ib */
    public final IObjectWrapper mo43112Ib() throws RemoteException {
        Parcel t1 = mo41868t1(20, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: Jb */
    public final IObjectWrapper mo43113Jb() throws RemoteException {
        Parcel t1 = mo41868t1(21, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: K */
    public final boolean mo43114K() throws RemoteException {
        Parcel t1 = mo41868t1(11, mo41869y());
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }

    /* renamed from: Kb */
    public final List mo43115Kb() throws RemoteException {
        Parcel t1 = mo41868t1(3, mo41869y());
        ArrayList b = zzasb.m42224b(t1);
        t1.recycle();
        return b;
    }

    /* renamed from: Lb */
    public final void mo43116Lb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(9, y);
    }

    /* renamed from: Mb */
    public final void mo43117Mb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(10, y);
    }

    /* renamed from: Nb */
    public final void mo43118Nb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, iObjectWrapper2);
        zzasb.m42229g(y, iObjectWrapper3);
        mo41865A1(22, y);
    }

    /* renamed from: Ob */
    public final void mo43119Ob(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(14, y);
    }

    /* renamed from: Z8 */
    public final zzdk mo43120Z8() throws RemoteException {
        Parcel t1 = mo41868t1(16, mo41869y());
        zzdk Jb = zzdj.m2156Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: b */
    public final Bundle mo43121b() throws RemoteException {
        Parcel t1 = mo41868t1(13, mo41869y());
        Bundle bundle = (Bundle) zzasb.m42223a(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle;
    }

    /* renamed from: g */
    public final IObjectWrapper mo43122g() throws RemoteException {
        Parcel t1 = mo41868t1(15, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: ia */
    public final zzblw mo43123ia() throws RemoteException {
        Parcel t1 = mo41868t1(19, mo41869y());
        zzblw Jb = zzblv.m43676Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: j */
    public final String mo43124j() throws RemoteException {
        Parcel t1 = mo41868t1(7, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: k */
    public final String mo43125k() throws RemoteException {
        Parcel t1 = mo41868t1(4, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: l */
    public final String mo43126l() throws RemoteException {
        Parcel t1 = mo41868t1(2, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: n */
    public final String mo43127n() throws RemoteException {
        Parcel t1 = mo41868t1(6, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: q */
    public final void mo43128q() throws RemoteException {
        mo41865A1(8, mo41869y());
    }

    /* renamed from: sb */
    public final zzbme mo43129sb() throws RemoteException {
        Parcel t1 = mo41868t1(5, mo41869y());
        zzbme Jb = zzbmd.m43695Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: w */
    public final boolean mo43130w() throws RemoteException {
        Parcel t1 = mo41868t1(12, mo41869y());
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }
}
