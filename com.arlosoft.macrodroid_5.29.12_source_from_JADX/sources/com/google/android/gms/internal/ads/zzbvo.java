package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbvo extends zzarz implements zzbvq {
    zzbvo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: A9 */
    public final void mo43068A9(zzcci zzcci) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzcci);
        mo41865A1(16, y);
    }

    /* renamed from: D */
    public final void mo43069D() throws RemoteException {
        mo41865A1(20, mo41869y());
    }

    /* renamed from: H */
    public final void mo43070H() throws RemoteException {
        mo41865A1(13, mo41869y());
    }

    /* renamed from: K */
    public final void mo43071K() throws RemoteException {
        mo41865A1(15, mo41869y());
    }

    /* renamed from: L2 */
    public final void mo43072L2(zzcce zzcce) throws RemoteException {
        throw null;
    }

    /* renamed from: M0 */
    public final void mo43073M0(zze zze) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zze);
        mo41865A1(24, y);
    }

    /* renamed from: S0 */
    public final void mo43074S0(int i) throws RemoteException {
        throw null;
    }

    /* renamed from: T2 */
    public final void mo43075T2(zzbmy zzbmy, String str) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbmy);
        y.writeString(str);
        mo41865A1(10, y);
    }

    /* renamed from: b */
    public final void mo43076b() throws RemoteException {
        mo41865A1(1, mo41869y());
    }

    /* renamed from: c */
    public final void mo43077c() throws RemoteException {
        mo41865A1(2, mo41869y());
    }

    /* renamed from: f2 */
    public final void mo43078f2(int i, String str) throws RemoteException {
        Parcel y = mo41869y();
        y.writeInt(i);
        y.writeString(str);
        mo41865A1(22, y);
    }

    /* renamed from: k */
    public final void mo43079k() throws RemoteException {
        mo41865A1(8, mo41869y());
    }

    /* renamed from: l */
    public final void mo43080l() throws RemoteException {
        mo41865A1(6, mo41869y());
    }

    /* renamed from: m */
    public final void mo43081m() throws RemoteException {
        mo41865A1(5, mo41869y());
    }

    /* renamed from: m0 */
    public final void mo43082m0(String str) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        mo41865A1(21, y);
    }

    /* renamed from: n */
    public final void mo43083n() throws RemoteException {
        mo41865A1(4, mo41869y());
    }

    /* renamed from: ta */
    public final void mo43084ta(String str, String str2) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        y.writeString(str2);
        mo41865A1(9, y);
    }

    /* renamed from: u */
    public final void mo43085u() throws RemoteException {
        mo41865A1(18, mo41869y());
    }

    /* renamed from: u2 */
    public final void mo43086u2(zze zze) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zze);
        mo41865A1(23, y);
    }

    /* renamed from: w */
    public final void mo43087w() throws RemoteException {
        mo41865A1(11, mo41869y());
    }

    /* renamed from: x */
    public final void mo43088x(int i) throws RemoteException {
        Parcel y = mo41869y();
        y.writeInt(i);
        mo41865A1(3, y);
    }
}
