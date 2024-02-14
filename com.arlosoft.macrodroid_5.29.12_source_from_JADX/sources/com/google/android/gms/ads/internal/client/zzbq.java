package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzbdm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbq extends zzarz implements zzbs {
    zzbq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* renamed from: D */
    public final void mo19922D() throws RemoteException {
        mo41865A1(2, mo41869y());
    }

    /* renamed from: Eb */
    public final void mo19923Eb(boolean z) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42226d(y, z);
        mo41865A1(22, y);
    }

    /* renamed from: I */
    public final void mo19924I() throws RemoteException {
        mo41865A1(5, mo41869y());
    }

    /* renamed from: M4 */
    public final void mo19925M4(zzw zzw) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzw);
        mo41865A1(39, y);
    }

    /* renamed from: N3 */
    public final void mo19926N3(zzbc zzbc) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbc);
        mo41865A1(20, y);
    }

    /* renamed from: V */
    public final void mo19927V() throws RemoteException {
        mo41865A1(6, mo41869y());
    }

    /* renamed from: c3 */
    public final void mo19928c3(zzl zzl, zzbi zzbi) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzl);
        zzasb.m42229g(y, zzbi);
        mo41865A1(43, y);
    }

    /* renamed from: f */
    public final zzq mo19929f() throws RemoteException {
        Parcel t1 = mo41868t1(12, mo41869y());
        zzq zzq = (zzq) zzasb.m42223a(t1, zzq.CREATOR);
        t1.recycle();
        return zzq;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbf mo19930g() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo41869y()
            r1 = 33
            android.os.Parcel r0 = r4.mo41868t1(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzbf
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzbf r1 = (com.google.android.gms.ads.internal.client.zzbf) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzbd r2 = new com.google.android.gms.ads.internal.client.zzbd
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbq.mo19930g():com.google.android.gms.ads.internal.client.zzbf");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbz mo19931h() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo41869y()
            r1 = 32
            android.os.Parcel r0 = r4.mo41868t1(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzbz
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzbz r1 = (com.google.android.gms.ads.internal.client.zzbz) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzbx r2 = new com.google.android.gms.ads.internal.client.zzbx
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbq.mo19931h():com.google.android.gms.ads.internal.client.zzbz");
    }

    /* renamed from: h6 */
    public final boolean mo19932h6(zzl zzl) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzl);
        Parcel t1 = mo41868t1(4, y);
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzdh mo19933i() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo41869y()
            r1 = 41
            android.os.Parcel r0 = r4.mo41868t1(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzdh
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzdh r1 = (com.google.android.gms.ads.internal.client.zzdh) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzdf r2 = new com.google.android.gms.ads.internal.client.zzdf
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbq.mo19933i():com.google.android.gms.ads.internal.client.zzdh");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzdk mo19934j() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo41869y()
            r1 = 26
            android.os.Parcel r0 = r4.mo41868t1(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzdk
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzdk r1 = (com.google.android.gms.ads.internal.client.zzdk) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzdi r2 = new com.google.android.gms.ads.internal.client.zzdi
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbq.mo19934j():com.google.android.gms.ads.internal.client.zzdk");
    }

    /* renamed from: l9 */
    public final void mo19935l9(zzde zzde) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzde);
        mo41865A1(42, y);
    }

    /* renamed from: m8 */
    public final void mo19936m8(zzcg zzcg) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzcg);
        mo41865A1(45, y);
    }

    /* renamed from: n */
    public final IObjectWrapper mo19937n() throws RemoteException {
        Parcel t1 = mo41868t1(1, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: o7 */
    public final void mo19938o7(zzbz zzbz) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbz);
        mo41865A1(8, y);
    }

    /* renamed from: oa */
    public final void mo19939oa(zzq zzq) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzq);
        mo41865A1(13, y);
    }

    /* renamed from: q */
    public final String mo19940q() throws RemoteException {
        Parcel t1 = mo41868t1(31, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: q9 */
    public final void mo19941q9(zzbdm zzbdm) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbdm);
        mo41865A1(40, y);
    }

    /* renamed from: t8 */
    public final void mo19942t8(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(44, y);
    }

    /* renamed from: xa */
    public final void mo19943xa(zzbf zzbf) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbf);
        mo41865A1(7, y);
    }

    /* renamed from: y9 */
    public final void mo19944y9(zzff zzff) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzff);
        mo41865A1(29, y);
    }

    /* renamed from: ya */
    public final void mo19945ya(boolean z) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42226d(y, z);
        mo41865A1(34, y);
    }
}
