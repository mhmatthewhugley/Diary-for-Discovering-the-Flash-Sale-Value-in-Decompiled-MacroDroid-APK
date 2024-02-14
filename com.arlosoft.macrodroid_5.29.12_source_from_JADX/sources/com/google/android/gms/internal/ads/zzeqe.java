package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeqe implements zzeve {

    /* renamed from: a */
    private final zzfzq f34701a;

    /* renamed from: b */
    private final zzdvl f34702b;

    /* renamed from: c */
    private final zzdzs f34703c;

    /* renamed from: d */
    private final zzeqh f34704d;

    public zzeqe(zzfzq zzfzq, zzdvl zzdvl, zzdzs zzdzs, zzeqh zzeqh) {
        this.f34701a = zzfzq;
        this.f34702b = zzdvl;
        this.f34703c = zzdzs;
        this.f34704d = zzeqh;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:3|4|5|6|7|(1:9)|10|11|(1:13)|14|15|21|19|1) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053 A[Catch:{ zzfek -> 0x005c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeqg mo45431a() throws java.lang.Exception {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27163k1
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r1.mo42663b(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.zzdvl r3 = r7.f34702b     // Catch:{ zzfek -> 0x0060 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ zzfek -> 0x0060 }
            r4.<init>()     // Catch:{ zzfek -> 0x0060 }
            com.google.android.gms.internal.ads.zzffa r3 = r3.mo45017c(r2, r4)     // Catch:{ zzfek -> 0x0060 }
            r3.mo45645a()     // Catch:{ zzfek -> 0x0060 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ zzfek -> 0x0060 }
            r4.<init>()     // Catch:{ zzfek -> 0x0060 }
            com.google.android.gms.internal.ads.zzbxq r5 = r3.mo45653i()     // Catch:{ zzfek -> 0x004d }
            if (r5 == 0) goto L_0x004d
            java.lang.String r6 = "sdk_version"
            java.lang.String r5 = r5.toString()     // Catch:{ zzfek -> 0x004d }
            r4.putString(r6, r5)     // Catch:{ zzfek -> 0x004d }
        L_0x004d:
            com.google.android.gms.internal.ads.zzbxq r3 = r3.mo45652h()     // Catch:{ zzfek -> 0x005c }
            if (r3 == 0) goto L_0x005c
            java.lang.String r5 = "adapter_version"
            java.lang.String r3 = r3.toString()     // Catch:{ zzfek -> 0x005c }
            r4.putString(r5, r3)     // Catch:{ zzfek -> 0x005c }
        L_0x005c:
            r1.putBundle(r2, r4)     // Catch:{ zzfek -> 0x0060 }
            goto L_0x001f
        L_0x0060:
            goto L_0x001f
        L_0x0062:
            com.google.android.gms.internal.ads.zzeqg r0 = new com.google.android.gms.internal.ads.zzeqg
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeqe.mo45431a():com.google.android.gms.internal.ads.zzeqg");
    }

    public final int zza() {
        return 1;
    }

    public final zzfzp zzb() {
        if (zzftm.m50973d((String) zzay.m1924c().mo42663b(zzbjc.f27163k1)) || this.f34704d.mo45433b() || !this.f34703c.mo45106t()) {
            return zzfzg.m51414i(new zzeqg(new Bundle(), (zzeqf) null));
        }
        this.f34704d.mo45432a(true);
        return this.f34701a.mo46579F(new zzeqd(this));
    }
}
