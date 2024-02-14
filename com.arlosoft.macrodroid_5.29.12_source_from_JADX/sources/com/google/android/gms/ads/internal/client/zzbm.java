package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbns;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbm extends zzarz implements zzbo {
    zzbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbl mo19908b() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo41869y()
            r1 = 1
            android.os.Parcel r0 = r4.mo41868t1(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzbl
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.ads.internal.client.zzbl r1 = (com.google.android.gms.ads.internal.client.zzbl) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.ads.internal.client.zzbj r2 = new com.google.android.gms.ads.internal.client.zzbj
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbm.mo19908b():com.google.android.gms.ads.internal.client.zzbl");
    }

    /* renamed from: i7 */
    public final void mo19909i7(zzbls zzbls) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzbls);
        mo41865A1(6, y);
    }

    /* renamed from: m2 */
    public final void mo19910m2(zzbns zzbns) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbns);
        mo41865A1(10, y);
    }

    /* renamed from: m7 */
    public final void mo19911m7(zzbf zzbf) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbf);
        mo41865A1(2, y);
    }

    /* renamed from: ma */
    public final void mo19912ma(String str, zzbnl zzbnl, zzbni zzbni) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        zzasb.m42229g(y, zzbnl);
        zzasb.m42229g(y, zzbni);
        mo41865A1(5, y);
    }
}
