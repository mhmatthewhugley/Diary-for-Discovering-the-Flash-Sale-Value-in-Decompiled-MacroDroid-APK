package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbnz extends zzarz implements zzbob {
    zzbnz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* renamed from: b */
    public final double mo42829b() throws RemoteException {
        Parcel t1 = mo41868t1(8, mo41869y());
        double readDouble = t1.readDouble();
        t1.recycle();
        return readDouble;
    }

    /* renamed from: e */
    public final zzdk mo42830e() throws RemoteException {
        Parcel t1 = mo41868t1(11, mo41869y());
        zzdk Jb = zzdj.m2156Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: f */
    public final zzdh mo42831f() throws RemoteException {
        Parcel t1 = mo41868t1(31, mo41869y());
        zzdh Jb = zzdg.m2143Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzblw mo42832g() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo41869y()
            r1 = 14
            android.os.Parcel r0 = r4.mo41868t1(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzblw
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzblw r1 = (com.google.android.gms.internal.ads.zzblw) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzblu r2 = new com.google.android.gms.internal.ads.zzblu
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbnz.mo42832g():com.google.android.gms.internal.ads.zzblw");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbme mo42833i() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo41869y()
            r1 = 5
            android.os.Parcel r0 = r4.mo41868t1(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbme
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.zzbme r1 = (com.google.android.gms.internal.ads.zzbme) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.zzbmc r2 = new com.google.android.gms.internal.ads.zzbmc
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbnz.mo42833i():com.google.android.gms.internal.ads.zzbme");
    }

    /* renamed from: j */
    public final IObjectWrapper mo42834j() throws RemoteException {
        Parcel t1 = mo41868t1(19, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: k */
    public final IObjectWrapper mo42835k() throws RemoteException {
        Parcel t1 = mo41868t1(18, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: l */
    public final String mo42836l() throws RemoteException {
        Parcel t1 = mo41868t1(4, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: m */
    public final String mo42837m() throws RemoteException {
        Parcel t1 = mo41868t1(6, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: n */
    public final String mo42838n() throws RemoteException {
        Parcel t1 = mo41868t1(7, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: p */
    public final String mo42839p() throws RemoteException {
        Parcel t1 = mo41868t1(10, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: r */
    public final String mo42840r() throws RemoteException {
        Parcel t1 = mo41868t1(9, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: s */
    public final String mo42841s() throws RemoteException {
        Parcel t1 = mo41868t1(2, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: u */
    public final List mo42842u() throws RemoteException {
        Parcel t1 = mo41868t1(3, mo41869y());
        ArrayList b = zzasb.m42224b(t1);
        t1.recycle();
        return b;
    }

    /* renamed from: w */
    public final List mo42843w() throws RemoteException {
        Parcel t1 = mo41868t1(23, mo41869y());
        ArrayList b = zzasb.m42224b(t1);
        t1.recycle();
        return b;
    }
}
