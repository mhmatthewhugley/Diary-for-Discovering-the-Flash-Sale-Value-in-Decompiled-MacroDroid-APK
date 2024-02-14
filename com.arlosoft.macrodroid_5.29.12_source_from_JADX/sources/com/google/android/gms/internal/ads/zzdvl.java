package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdvl {

    /* renamed from: a */
    private final zzfey f33220a;

    /* renamed from: b */
    private final zzdvi f33221b;

    zzdvl(zzfey zzfey, zzdvi zzdvi) {
        this.f33220a = zzfey;
        this.f33221b = zzdvi;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: a */
    public final zzbvk mo45015a() throws RemoteException {
        zzbvk b = this.f33220a.mo45633b();
        if (b != null) {
            return b;
        }
        zzcgp.m45229g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    /* renamed from: b */
    public final zzbxd mo45016b(String str) throws RemoteException {
        zzbxd f0 = mo45015a().mo43028f0(str);
        this.f33221b.mo45014e(str, f0);
        return f0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(r6) != false) goto L_0x003c;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzffa mo45017c(java.lang.String r6, org.json.JSONObject r7) throws com.google.android.gms.internal.ads.zzfek {
        /*
            r5 = this;
            java.lang.String r0 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            com.google.android.gms.internal.ads.zzffa r1 = new com.google.android.gms.internal.ads.zzffa     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x0017
            com.google.android.gms.internal.ads.zzbwj r7 = new com.google.android.gms.internal.ads.zzbwj     // Catch:{ all -> 0x0070 }
            com.google.ads.mediation.admob.AdMobAdapter r0 = new com.google.ads.mediation.admob.AdMobAdapter     // Catch:{ all -> 0x0070 }
            r0.<init>()     // Catch:{ all -> 0x0070 }
            r7.<init>((com.google.android.gms.ads.mediation.MediationAdapter) r0)     // Catch:{ all -> 0x0070 }
            goto L_0x0067
        L_0x0017:
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobCustomTabsAdapter"
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.zzbwj r7 = new com.google.android.gms.internal.ads.zzbwj     // Catch:{ all -> 0x0070 }
            com.google.android.gms.internal.ads.zzbxu r0 = new com.google.android.gms.internal.ads.zzbxu     // Catch:{ all -> 0x0070 }
            r0.<init>()     // Catch:{ all -> 0x0070 }
            r7.<init>((com.google.android.gms.ads.mediation.MediationAdapter) r0)     // Catch:{ all -> 0x0070 }
            goto L_0x0067
        L_0x002a:
            com.google.android.gms.internal.ads.zzbvk r2 = r5.mo45015a()     // Catch:{ all -> 0x0070 }
            boolean r3 = r0.equals(r6)     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            if (r3 != 0) goto L_0x003c
            boolean r3 = r4.equals(r6)     // Catch:{ all -> 0x0070 }
            if (r3 == 0) goto L_0x0063
        L_0x003c:
            java.lang.String r3 = "class_name"
            java.lang.String r7 = r7.getString(r3)     // Catch:{ JSONException -> 0x005d }
            boolean r3 = r2.mo43031z(r7)     // Catch:{ JSONException -> 0x005d }
            if (r3 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.zzbvn r7 = r2.mo43030t(r0)     // Catch:{ JSONException -> 0x005d }
            goto L_0x0067
        L_0x004d:
            boolean r0 = r2.mo43029h0(r7)     // Catch:{ JSONException -> 0x005d }
            if (r0 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.zzbvn r7 = r2.mo43030t(r7)     // Catch:{ JSONException -> 0x005d }
            goto L_0x0067
        L_0x0058:
            com.google.android.gms.internal.ads.zzbvn r7 = r2.mo43030t(r4)     // Catch:{ JSONException -> 0x005d }
            goto L_0x0067
        L_0x005d:
            r7 = move-exception
            java.lang.String r0 = "Invalid custom event."
            com.google.android.gms.internal.ads.zzcgp.m45227e(r0, r7)     // Catch:{ all -> 0x0070 }
        L_0x0063:
            com.google.android.gms.internal.ads.zzbvn r7 = r2.mo43030t(r6)     // Catch:{ all -> 0x0070 }
        L_0x0067:
            r1.<init>(r7)     // Catch:{ all -> 0x0070 }
            com.google.android.gms.internal.ads.zzdvi r7 = r5.f33221b
            r7.mo45013d(r6, r1)
            return r1
        L_0x0070:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27060Z7
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r1.mo42663b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0089
            com.google.android.gms.internal.ads.zzdvi r0 = r5.f33221b
            r1 = 0
            r0.mo45013d(r6, r1)
        L_0x0089:
            com.google.android.gms.internal.ads.zzfek r6 = new com.google.android.gms.internal.ads.zzfek
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvl.mo45017c(java.lang.String, org.json.JSONObject):com.google.android.gms.internal.ads.zzffa");
    }

    /* renamed from: d */
    public final boolean mo45018d() {
        return this.f33220a.mo45633b() != null;
    }
}
