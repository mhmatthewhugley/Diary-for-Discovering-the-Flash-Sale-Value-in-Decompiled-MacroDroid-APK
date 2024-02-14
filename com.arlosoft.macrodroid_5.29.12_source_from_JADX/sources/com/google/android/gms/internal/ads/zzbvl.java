package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbvl extends zzarz implements zzbvn {
    zzbvl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* renamed from: A7 */
    public final void mo43032A7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(21, y);
    }

    /* renamed from: G2 */
    public final void mo43033G2(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbvq zzbvq) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42227e(y, zzl);
        y.writeString(str);
        y.writeString(str2);
        zzasb.m42229g(y, zzbvq);
        mo41865A1(7, y);
    }

    /* renamed from: J */
    public final void mo43034J() throws RemoteException {
        mo41865A1(4, mo41869y());
    }

    /* renamed from: L */
    public final boolean mo43035L() throws RemoteException {
        Parcel t1 = mo41868t1(22, mo41869y());
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbvw mo43036M() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo41869y()
            r1 = 16
            android.os.Parcel r0 = r4.mo41868t1(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbvw
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbvw r1 = (com.google.android.gms.internal.ads.zzbvw) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbvw r2 = new com.google.android.gms.internal.ads.zzbvw
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvl.mo43036M():com.google.android.gms.internal.ads.zzbvw");
    }

    /* renamed from: P */
    public final void mo43037P() throws RemoteException {
        mo41865A1(9, mo41869y());
    }

    /* renamed from: P4 */
    public final void mo43038P4(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbvq zzbvq) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42227e(y, zzq);
        zzasb.m42227e(y, zzl);
        y.writeString(str);
        y.writeString(str2);
        zzasb.m42229g(y, zzbvq);
        mo41865A1(35, y);
    }

    /* renamed from: Q */
    public final void mo43039Q() throws RemoteException {
        mo41865A1(12, mo41869y());
    }

    /* renamed from: Q2 */
    public final void mo43040Q2(IObjectWrapper iObjectWrapper, zzbru zzbru, List list) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, zzbru);
        y.writeTypedList(list);
        mo41865A1(31, y);
    }

    /* renamed from: Q9 */
    public final void mo43041Q9(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(37, y);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbvv mo43042T() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo41869y()
            r1 = 15
            android.os.Parcel r0 = r4.mo41868t1(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbvv
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbvv r1 = (com.google.android.gms.internal.ads.zzbvv) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbvv r2 = new com.google.android.gms.internal.ads.zzbvv
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvl.mo43042T():com.google.android.gms.internal.ads.zzbvv");
    }

    /* renamed from: X9 */
    public final void mo43043X9(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(30, y);
    }

    /* renamed from: d4 */
    public final void mo43044d4(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbvq zzbvq) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42227e(y, zzq);
        zzasb.m42227e(y, zzl);
        y.writeString(str);
        y.writeString(str2);
        zzasb.m42229g(y, zzbvq);
        mo41865A1(6, y);
    }

    /* renamed from: e */
    public final zzdk mo43045e() throws RemoteException {
        Parcel t1 = mo41868t1(26, mo41869y());
        zzdk Jb = zzdj.m2156Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: e8 */
    public final void mo43046e8(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzccd zzccd, String str2) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42227e(y, zzl);
        y.writeString((String) null);
        zzasb.m42229g(y, zzccd);
        y.writeString(str2);
        mo41865A1(10, y);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbvt mo43047h() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo41869y()
            r1 = 36
            android.os.Parcel r0 = r4.mo41868t1(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbvt
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbvt r1 = (com.google.android.gms.internal.ads.zzbvt) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbvr r2 = new com.google.android.gms.internal.ads.zzbvr
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvl.mo43047h():com.google.android.gms.internal.ads.zzbvt");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbvz mo43048i() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo41869y()
            r1 = 27
            android.os.Parcel r0 = r4.mo41868t1(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbvz
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbvz r1 = (com.google.android.gms.internal.ads.zzbvz) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbvx r2 = new com.google.android.gms.internal.ads.zzbvx
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvl.mo43048i():com.google.android.gms.internal.ads.zzbvz");
    }

    /* renamed from: i4 */
    public final void mo43049i4(boolean z) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42226d(y, z);
        mo41865A1(25, y);
    }

    /* renamed from: j */
    public final zzbxq mo43050j() throws RemoteException {
        Parcel t1 = mo41868t1(33, mo41869y());
        zzbxq zzbxq = (zzbxq) zzasb.m42223a(t1, zzbxq.CREATOR);
        t1.recycle();
        return zzbxq;
    }

    /* renamed from: k */
    public final zzbxq mo43051k() throws RemoteException {
        Parcel t1 = mo41868t1(34, mo41869y());
        zzbxq zzbxq = (zzbxq) zzasb.m42223a(t1, zzbxq.CREATOR);
        t1.recycle();
        return zzbxq;
    }

    /* renamed from: l */
    public final void mo43052l() throws RemoteException {
        mo41865A1(5, mo41869y());
    }

    /* renamed from: m4 */
    public final void mo43053m4(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbvq zzbvq) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42227e(y, zzl);
        y.writeString(str);
        zzasb.m42229g(y, zzbvq);
        mo41865A1(32, y);
    }

    /* renamed from: n */
    public final IObjectWrapper mo43054n() throws RemoteException {
        Parcel t1 = mo41868t1(2, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: o2 */
    public final void mo43055o2(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbvq zzbvq) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42227e(y, zzl);
        y.writeString(str);
        zzasb.m42229g(y, zzbvq);
        mo41865A1(28, y);
    }

    /* renamed from: o3 */
    public final void mo43056o3(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbvq zzbvq, zzbls zzbls, List list) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42227e(y, zzl);
        y.writeString(str);
        y.writeString(str2);
        zzasb.m42229g(y, zzbvq);
        zzasb.m42227e(y, zzbls);
        y.writeStringList(list);
        mo41865A1(14, y);
    }

    /* renamed from: p0 */
    public final void mo43057p0() throws RemoteException {
        mo41865A1(8, mo41869y());
    }

    /* renamed from: u0 */
    public final boolean mo43058u0() throws RemoteException {
        Parcel t1 = mo41868t1(13, mo41869y());
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }

    /* renamed from: w2 */
    public final void mo43059w2(IObjectWrapper iObjectWrapper, zzccd zzccd, List list) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, zzccd);
        y.writeStringList(list);
        mo41865A1(23, y);
    }

    /* renamed from: w5 */
    public final void mo43060w5(zzl zzl, String str) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzl);
        y.writeString(str);
        mo41865A1(11, y);
    }
}
