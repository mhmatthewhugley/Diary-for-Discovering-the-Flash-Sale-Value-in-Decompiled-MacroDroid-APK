package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzdi extends zzarz implements zzdk {
    zzdi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: E6 */
    public final void mo19998E6(zzdn zzdn) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzdn);
        mo41865A1(8, y);
    }

    /* renamed from: b */
    public final float mo19999b() throws RemoteException {
        throw null;
    }

    /* renamed from: c */
    public final float mo20000c() throws RemoteException {
        throw null;
    }

    /* renamed from: f */
    public final float mo20001f() throws RemoteException {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzdn mo20002g() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo41869y()
            r1 = 11
            android.os.Parcel r0 = r4.mo41868t1(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzdn
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzdn r1 = (com.google.android.gms.ads.internal.client.zzdn) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzdl r2 = new com.google.android.gms.ads.internal.client.zzdl
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzdi.mo20002g():com.google.android.gms.ads.internal.client.zzdn");
    }
}
