package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbqr;
import com.google.android.gms.internal.ads.zzbqt;
import com.google.android.gms.internal.ads.zzbqu;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbyu;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzcck;
import com.google.android.gms.internal.ads.zzccl;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcfg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzca extends zzarz implements zzcc {
    zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* renamed from: B3 */
    public final zzccl mo19854B3(IObjectWrapper iObjectWrapper, String str, zzbvk zzbvk, int i) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        y.writeString(str);
        zzasb.m42229g(y, zzbvk);
        y.writeInt(223104000);
        Parcel t1 = mo41868t1(12, y);
        zzccl Jb = zzcck.m44883Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: D1 */
    public final zzbzc mo19855D1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        Parcel t1 = mo41868t1(8, y);
        zzbzc Jb = zzbzb.m44712Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: E4 */
    public final zzbmi mo19856E4(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, iObjectWrapper2);
        Parcel t1 = mo41868t1(5, y);
        zzbmi Jb = zzbmh.m43714Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: F9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbs mo19857F9(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.ads.internal.client.zzq r2, java.lang.String r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r4 = r0.mo41869y()
            com.google.android.gms.internal.ads.zzasb.m42229g(r4, r1)
            com.google.android.gms.internal.ads.zzasb.m42227e(r4, r2)
            r4.writeString(r3)
            r1 = 223104000(0xd4c4c00, float:6.2953835E-31)
            r4.writeInt(r1)
            r1 = 10
            android.os.Parcel r1 = r0.mo41868t1(r1, r4)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0021
            r2 = 0
            goto L_0x0035
        L_0x0021:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.internal.client.zzbs
            if (r4 == 0) goto L_0x002f
            r2 = r3
            com.google.android.gms.ads.internal.client.zzbs r2 = (com.google.android.gms.ads.internal.client.zzbs) r2
            goto L_0x0035
        L_0x002f:
            com.google.android.gms.ads.internal.client.zzbq r3 = new com.google.android.gms.ads.internal.client.zzbq
            r3.<init>(r2)
            r2 = r3
        L_0x0035:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzca.mo19857F9(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.ads.internal.client.zzq, java.lang.String, int):com.google.android.gms.ads.internal.client.zzbs");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: G8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbs mo19858G8(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.ads.internal.client.zzq r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbvk r4, int r5) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r5 = r0.mo41869y()
            com.google.android.gms.internal.ads.zzasb.m42229g(r5, r1)
            com.google.android.gms.internal.ads.zzasb.m42227e(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.zzasb.m42229g(r5, r4)
            r1 = 223104000(0xd4c4c00, float:6.2953835E-31)
            r5.writeInt(r1)
            r1 = 13
            android.os.Parcel r1 = r0.mo41868t1(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0024
            r2 = 0
            goto L_0x0038
        L_0x0024:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.internal.client.zzbs
            if (r4 == 0) goto L_0x0032
            r2 = r3
            com.google.android.gms.ads.internal.client.zzbs r2 = (com.google.android.gms.ads.internal.client.zzbs) r2
            goto L_0x0038
        L_0x0032:
            com.google.android.gms.ads.internal.client.zzbq r3 = new com.google.android.gms.ads.internal.client.zzbq
            r3.<init>(r2)
            r2 = r3
        L_0x0038:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzca.mo19858G8(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.ads.internal.client.zzq, java.lang.String, com.google.android.gms.internal.ads.zzbvk, int):com.google.android.gms.ads.internal.client.zzbs");
    }

    /* renamed from: H8 */
    public final zzcfg mo19859H8(IObjectWrapper iObjectWrapper, zzbvk zzbvk, int i) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, zzbvk);
        y.writeInt(223104000);
        Parcel t1 = mo41868t1(14, y);
        zzcfg Jb = zzcff.m45072Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: K1 */
    public final zzbqu mo19860K1(IObjectWrapper iObjectWrapper, zzbvk zzbvk, int i, zzbqr zzbqr) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, zzbvk);
        y.writeInt(223104000);
        zzasb.m42229g(y, zzbqr);
        Parcel t1 = mo41868t1(16, y);
        zzbqu Jb = zzbqt.m43990Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzcm mo19861L0(com.google.android.gms.dynamic.IObjectWrapper r3, int r4) throws android.os.RemoteException {
        /*
            r2 = this;
            android.os.Parcel r4 = r2.mo41869y()
            com.google.android.gms.internal.ads.zzasb.m42229g(r4, r3)
            r3 = 223104000(0xd4c4c00, float:6.2953835E-31)
            r4.writeInt(r3)
            r3 = 9
            android.os.Parcel r3 = r2.mo41868t1(r3, r4)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x001b
            r4 = 0
            goto L_0x002f
        L_0x001b:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.internal.client.zzcm
            if (r1 == 0) goto L_0x0029
            r4 = r0
            com.google.android.gms.ads.internal.client.zzcm r4 = (com.google.android.gms.ads.internal.client.zzcm) r4
            goto L_0x002f
        L_0x0029:
            com.google.android.gms.ads.internal.client.zzck r0 = new com.google.android.gms.ads.internal.client.zzck
            r0.<init>(r4)
            r4 = r0
        L_0x002f:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzca.mo19861L0(com.google.android.gms.dynamic.IObjectWrapper, int):com.google.android.gms.ads.internal.client.zzcm");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Y7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbs mo19863Y7(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.ads.internal.client.zzq r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbvk r4, int r5) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r5 = r0.mo41869y()
            com.google.android.gms.internal.ads.zzasb.m42229g(r5, r1)
            com.google.android.gms.internal.ads.zzasb.m42227e(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.zzasb.m42229g(r5, r4)
            r1 = 223104000(0xd4c4c00, float:6.2953835E-31)
            r5.writeInt(r1)
            r1 = 1
            android.os.Parcel r1 = r0.mo41868t1(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0023
            r2 = 0
            goto L_0x0037
        L_0x0023:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.internal.client.zzbs
            if (r4 == 0) goto L_0x0031
            r2 = r3
            com.google.android.gms.ads.internal.client.zzbs r2 = (com.google.android.gms.ads.internal.client.zzbs) r2
            goto L_0x0037
        L_0x0031:
            com.google.android.gms.ads.internal.client.zzbq r3 = new com.google.android.gms.ads.internal.client.zzbq
            r3.<init>(r2)
            r2 = r3
        L_0x0037:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzca.mo19863Y7(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.ads.internal.client.zzq, java.lang.String, com.google.android.gms.internal.ads.zzbvk, int):com.google.android.gms.ads.internal.client.zzbs");
    }

    /* renamed from: ha */
    public final zzbyv mo19864ha(IObjectWrapper iObjectWrapper, zzbvk zzbvk, int i) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, zzbvk);
        y.writeInt(223104000);
        Parcel t1 = mo41868t1(15, y);
        zzbyv Jb = zzbyu.m44688Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: lb */
    public final zzbmo mo19865lb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, iObjectWrapper2);
        zzasb.m42229g(y, iObjectWrapper3);
        Parcel t1 = mo41868t1(11, y);
        zzbmo Jb = zzbmn.m43728Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: p7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbs mo19866p7(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.ads.internal.client.zzq r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbvk r4, int r5) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r5 = r0.mo41869y()
            com.google.android.gms.internal.ads.zzasb.m42229g(r5, r1)
            com.google.android.gms.internal.ads.zzasb.m42227e(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.zzasb.m42229g(r5, r4)
            r1 = 223104000(0xd4c4c00, float:6.2953835E-31)
            r5.writeInt(r1)
            r1 = 2
            android.os.Parcel r1 = r0.mo41868t1(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0023
            r2 = 0
            goto L_0x0037
        L_0x0023:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.internal.client.zzbs
            if (r4 == 0) goto L_0x0031
            r2 = r3
            com.google.android.gms.ads.internal.client.zzbs r2 = (com.google.android.gms.ads.internal.client.zzbs) r2
            goto L_0x0037
        L_0x0031:
            com.google.android.gms.ads.internal.client.zzbq r3 = new com.google.android.gms.ads.internal.client.zzbq
            r3.<init>(r2)
            r2 = r3
        L_0x0037:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzca.mo19866p7(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.ads.internal.client.zzq, java.lang.String, com.google.android.gms.internal.ads.zzbvk, int):com.google.android.gms.ads.internal.client.zzbs");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: yb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbo mo19867yb(com.google.android.gms.dynamic.IObjectWrapper r1, java.lang.String r2, com.google.android.gms.internal.ads.zzbvk r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r4 = r0.mo41869y()
            com.google.android.gms.internal.ads.zzasb.m42229g(r4, r1)
            r4.writeString(r2)
            com.google.android.gms.internal.ads.zzasb.m42229g(r4, r3)
            r1 = 223104000(0xd4c4c00, float:6.2953835E-31)
            r4.writeInt(r1)
            r1 = 3
            android.os.Parcel r1 = r0.mo41868t1(r1, r4)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0020
            r2 = 0
            goto L_0x0034
        L_0x0020:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.internal.client.zzbo
            if (r4 == 0) goto L_0x002e
            r2 = r3
            com.google.android.gms.ads.internal.client.zzbo r2 = (com.google.android.gms.ads.internal.client.zzbo) r2
            goto L_0x0034
        L_0x002e:
            com.google.android.gms.ads.internal.client.zzbm r3 = new com.google.android.gms.ads.internal.client.zzbm
            r3.<init>(r2)
            r2 = r3
        L_0x0034:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzca.mo19867yb(com.google.android.gms.dynamic.IObjectWrapper, java.lang.String, com.google.android.gms.internal.ads.zzbvk, int):com.google.android.gms.ads.internal.client.zzbo");
    }
}
