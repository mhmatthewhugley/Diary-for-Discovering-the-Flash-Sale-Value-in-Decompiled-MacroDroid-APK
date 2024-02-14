package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbvi extends zzarz implements zzbvk {
    zzbvi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: f0 */
    public final zzbxd mo43028f0(String str) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        Parcel t1 = mo41868t1(3, y);
        zzbxd Jb = zzbxc.m44590Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    /* renamed from: h0 */
    public final boolean mo43029h0(String str) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        Parcel t1 = mo41868t1(4, y);
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbvn mo43030t(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo41869y()
            r0.writeString(r4)
            r4 = 1
            android.os.Parcel r4 = r3.mo41868t1(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzbvn
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.zzbvn r0 = (com.google.android.gms.internal.ads.zzbvn) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.zzbvl r1 = new com.google.android.gms.internal.ads.zzbvl
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvi.mo43030t(java.lang.String):com.google.android.gms.internal.ads.zzbvn");
    }

    /* renamed from: z */
    public final boolean mo43031z(String str) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        Parcel t1 = mo41868t1(2, y);
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }
}
