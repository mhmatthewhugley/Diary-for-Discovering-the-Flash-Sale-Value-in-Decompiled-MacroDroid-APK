package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbyk extends NativeAd {

    /* renamed from: a */
    private final zzbob f28002a;

    /* renamed from: b */
    private final List f28003b = new ArrayList();
    @Nullable

    /* renamed from: c */
    private final zzbyj f28004c;
    @Nullable

    /* renamed from: d */
    private final NativeAd.AdChoicesInfo f28005d;

    /* renamed from: e */
    private final List f28006e = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0097 A[Catch:{ RemoteException -> 0x00a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzbyk(com.google.android.gms.internal.ads.zzbob r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f28003b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f28006e = r1
            r5.f28002a = r6
            r1 = 0
            java.util.List r6 = r6.mo42842u()     // Catch:{ RemoteException -> 0x0043 }
            if (r6 == 0) goto L_0x0047
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x0043 }
        L_0x0020:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x0043 }
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x0043 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0043 }
            if (r3 == 0) goto L_0x0035
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0043 }
            com.google.android.gms.internal.ads.zzbme r2 = com.google.android.gms.internal.ads.zzbmd.m43695Jb(r2)     // Catch:{ RemoteException -> 0x0043 }
            goto L_0x0036
        L_0x0035:
            r2 = r1
        L_0x0036:
            if (r2 == 0) goto L_0x0020
            java.util.List r3 = r5.f28003b     // Catch:{ RemoteException -> 0x0043 }
            com.google.android.gms.internal.ads.zzbyj r4 = new com.google.android.gms.internal.ads.zzbyj     // Catch:{ RemoteException -> 0x0043 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0043 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0043 }
            goto L_0x0020
        L_0x0043:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcgp.m45227e(r0, r6)
        L_0x0047:
            com.google.android.gms.internal.ads.zzbob r6 = r5.f28002a     // Catch:{ RemoteException -> 0x0076 }
            java.util.List r6 = r6.mo42843w()     // Catch:{ RemoteException -> 0x0076 }
            if (r6 == 0) goto L_0x007a
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x0076 }
        L_0x0053:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x0076 }
            if (r2 == 0) goto L_0x007a
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x0076 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0076 }
            if (r3 == 0) goto L_0x0068
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0076 }
            com.google.android.gms.ads.internal.client.zzcu r2 = com.google.android.gms.ads.internal.client.zzct.m2122Jb(r2)     // Catch:{ RemoteException -> 0x0076 }
            goto L_0x0069
        L_0x0068:
            r2 = r1
        L_0x0069:
            if (r2 == 0) goto L_0x0053
            java.util.List r3 = r5.f28006e     // Catch:{ RemoteException -> 0x0076 }
            com.google.android.gms.ads.internal.client.zzcv r4 = new com.google.android.gms.ads.internal.client.zzcv     // Catch:{ RemoteException -> 0x0076 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0076 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0076 }
            goto L_0x0053
        L_0x0076:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcgp.m45227e(r0, r6)
        L_0x007a:
            com.google.android.gms.internal.ads.zzbob r6 = r5.f28002a     // Catch:{ RemoteException -> 0x0088 }
            com.google.android.gms.internal.ads.zzbme r6 = r6.mo42833i()     // Catch:{ RemoteException -> 0x0088 }
            if (r6 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.zzbyj r2 = new com.google.android.gms.internal.ads.zzbyj     // Catch:{ RemoteException -> 0x0088 }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x0088 }
            goto L_0x008d
        L_0x0088:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcgp.m45227e(r0, r6)
        L_0x008c:
            r2 = r1
        L_0x008d:
            r5.f28004c = r2
            com.google.android.gms.internal.ads.zzbob r6 = r5.f28002a     // Catch:{ RemoteException -> 0x00a4 }
            com.google.android.gms.internal.ads.zzblw r6 = r6.mo42832g()     // Catch:{ RemoteException -> 0x00a4 }
            if (r6 == 0) goto L_0x00a8
            com.google.android.gms.internal.ads.zzbyh r6 = new com.google.android.gms.internal.ads.zzbyh     // Catch:{ RemoteException -> 0x00a4 }
            com.google.android.gms.internal.ads.zzbob r2 = r5.f28002a     // Catch:{ RemoteException -> 0x00a4 }
            com.google.android.gms.internal.ads.zzblw r2 = r2.mo42832g()     // Catch:{ RemoteException -> 0x00a4 }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x00a4 }
            r1 = r6
            goto L_0x00a8
        L_0x00a4:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcgp.m45227e(r0, r6)
        L_0x00a8:
            r5.f28005d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyk.<init>(com.google.android.gms.internal.ads.zzbob):void");
    }

    @Nullable
    /* renamed from: a */
    public final ResponseInfo mo20590a() {
        zzdh zzdh;
        try {
            zzdh = this.f28002a.mo42831f();
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
            zzdh = null;
        }
        return ResponseInfo.m1738d(zzdh);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo20591b() {
        try {
            return this.f28002a.mo42835k();
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
            return null;
        }
    }
}
