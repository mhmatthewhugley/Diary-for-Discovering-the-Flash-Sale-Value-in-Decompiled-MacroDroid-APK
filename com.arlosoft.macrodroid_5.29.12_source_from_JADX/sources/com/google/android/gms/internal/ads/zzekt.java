package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzekt implements zzfyn {

    /* renamed from: a */
    private final zzfih f34311a;

    /* renamed from: b */
    private final zzddc f34312b;

    /* renamed from: c */
    private final zzfki f34313c;

    /* renamed from: d */
    private final zzfkm f34314d;

    /* renamed from: e */
    private final Executor f34315e;

    /* renamed from: f */
    private final ScheduledExecutorService f34316f;

    /* renamed from: g */
    private final zzczh f34317g;

    /* renamed from: h */
    private final zzeko f34318h;

    /* renamed from: i */
    private final zzehh f34319i;

    /* renamed from: j */
    private final Context f34320j;

    /* renamed from: k */
    private final zzfju f34321k;

    zzekt(Context context, zzfih zzfih, zzeko zzeko, zzddc zzddc, zzfki zzfki, zzfkm zzfkm, zzczh zzczh, Executor executor, ScheduledExecutorService scheduledExecutorService, zzehh zzehh, zzfju zzfju) {
        this.f34320j = context;
        this.f34311a = zzfih;
        this.f34318h = zzeko;
        this.f34312b = zzddc;
        this.f34313c = zzfki;
        this.f34314d = zzfkm;
        this.f34317g = zzczh;
        this.f34315e = executor;
        this.f34316f = scheduledExecutorService;
        this.f34319i = zzehh;
        this.f34321k = zzfju;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfzp mo20417a(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzfdw r9 = (com.google.android.gms.internal.ads.zzfdw) r9
            com.google.android.gms.internal.ads.zzfdv r0 = r9.f35590b
            com.google.android.gms.internal.ads.zzfdn r0 = r0.f35587b
            int r0 = r0.f35569e
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 300(0x12c, float:4.2E-43)
            if (r0 == 0) goto L_0x0042
            if (r0 < r1) goto L_0x0027
            if (r0 >= r2) goto L_0x0027
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26831C4
            com.google.android.gms.internal.ads.zzbja r3 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r3.mo42663b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "No fill."
            goto L_0x0044
        L_0x0027:
            if (r0 < r2) goto L_0x0030
            r3 = 400(0x190, float:5.6E-43)
            if (r0 >= r3) goto L_0x0030
            java.lang.String r0 = "No location header to follow redirect or too many redirects."
            goto L_0x0044
        L_0x0030:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Received error HTTP response code: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x0044
        L_0x0042:
            java.lang.String r0 = "No ad config."
        L_0x0044:
            com.google.android.gms.internal.ads.zzfdv r3 = r9.f35590b
            com.google.android.gms.internal.ads.zzfdn r3 = r3.f35587b
            com.google.android.gms.internal.ads.zzfdm r4 = r3.f35573i
            if (r4 == 0) goto L_0x0050
            java.lang.String r0 = r4.mo45600a()
        L_0x0050:
            com.google.android.gms.internal.ads.zzehh r4 = r8.f34319i
            r4.mo45308g(r3)
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f27129g7
            com.google.android.gms.internal.ads.zzbja r4 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r3 = r4.mo42663b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 3
            if (r3 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.zzfdv r3 = r9.f35590b
            com.google.android.gms.internal.ads.zzfdn r3 = r3.f35587b
            int r3 = r3.f35569e
            if (r3 == 0) goto L_0x007f
            if (r3 < r1) goto L_0x0074
            if (r3 < r2) goto L_0x007f
        L_0x0074:
            com.google.android.gms.internal.ads.zzekr r9 = new com.google.android.gms.internal.ads.zzekr
            r9.<init>(r4, r0)
            com.google.android.gms.internal.ads.zzfzp r9 = com.google.android.gms.internal.ads.zzfzg.m51413h(r9)
            goto L_0x015d
        L_0x007f:
            com.google.android.gms.internal.ads.zzfih r1 = r8.f34311a
            com.google.android.gms.internal.ads.zzfib r2 = com.google.android.gms.internal.ads.zzfib.RENDER_CONFIG_INIT
            com.google.android.gms.internal.ads.zzekr r3 = new com.google.android.gms.internal.ads.zzekr
            r3.<init>(r4, r0)
            com.google.android.gms.internal.ads.zzfzp r0 = com.google.android.gms.internal.ads.zzfzg.m51413h(r3)
            com.google.android.gms.internal.ads.zzfhy r0 = com.google.android.gms.internal.ads.zzfhr.m50181c(r0, r2, r1)
            com.google.android.gms.internal.ads.zzfhm r0 = r0.mo45742a()
            com.google.android.gms.internal.ads.zzfdv r1 = r9.f35590b
            java.util.List r1 = r1.f35586a
            java.util.Iterator r1 = r1.iterator()
        L_0x009c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00de
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.zzfdk r2 = (com.google.android.gms.internal.ads.zzfdk) r2
            com.google.android.gms.internal.ads.zzehh r3 = r8.f34319i
            r3.mo45305d(r2)
            java.util.List r3 = r2.f35519a
            java.util.Iterator r3 = r3.iterator()
        L_0x00b3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00d0
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.internal.ads.zzczh r5 = r8.f34317g
            int r6 = r2.f35521b
            com.google.android.gms.internal.ads.zzehc r4 = r5.mo44501a(r6, r4)
            if (r4 == 0) goto L_0x00b3
            boolean r4 = r4.mo45298a(r9, r2)
            if (r4 == 0) goto L_0x00b3
            goto L_0x009c
        L_0x00d0:
            com.google.android.gms.internal.ads.zzehh r3 = r8.f34319i
            r4 = 0
            r6 = 1
            r7 = 0
            com.google.android.gms.ads.internal.client.zze r6 = com.google.android.gms.internal.ads.zzffe.m50085d(r6, r7, r7)
            r3.mo45306e(r2, r4, r6)
            goto L_0x009c
        L_0x00de:
            com.google.android.gms.internal.ads.zzddc r1 = r8.f34312b
            com.google.android.gms.internal.ads.zzcur r2 = new com.google.android.gms.internal.ads.zzcur
            com.google.android.gms.internal.ads.zzfkm r3 = r8.f34314d
            com.google.android.gms.internal.ads.zzfki r4 = r8.f34313c
            r2.<init>(r9, r3, r4)
            java.util.concurrent.Executor r3 = r8.f34315e
            r1.mo44629G0(r2, r3)
            com.google.android.gms.internal.ads.zzfdv r1 = r9.f35590b
            java.util.List r1 = r1.f35586a
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x00f7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x015c
            java.lang.Object r3 = r1.next()
            com.google.android.gms.internal.ads.zzfdk r3 = (com.google.android.gms.internal.ads.zzfdk) r3
            java.util.List r4 = r3.f35519a
            java.util.Iterator r4 = r4.iterator()
        L_0x0109:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0159
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzczh r6 = r8.f34317g
            int r7 = r3.f35521b
            com.google.android.gms.internal.ads.zzehc r6 = r6.mo44501a(r7, r5)
            if (r6 == 0) goto L_0x0109
            boolean r7 = r6.mo45298a(r9, r3)
            if (r7 == 0) goto L_0x0109
            com.google.android.gms.internal.ads.zzfih r4 = r8.f34311a
            com.google.android.gms.internal.ads.zzfib r7 = com.google.android.gms.internal.ads.zzfib.RENDER_CONFIG_WATERFALL
            com.google.android.gms.internal.ads.zzfhy r0 = r4.mo45752b(r7, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "render-config-"
            r4.append(r7)
            r4.append(r2)
            java.lang.String r7 = "-"
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.ads.zzfhy r0 = r0.mo45749h(r4)
            com.google.android.gms.internal.ads.zzeks r4 = new com.google.android.gms.internal.ads.zzeks
            r4.<init>(r8, r3, r9, r6)
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.android.gms.internal.ads.zzfhy r0 = r0.mo45744c(r3, r4)
            com.google.android.gms.internal.ads.zzfhm r0 = r0.mo45742a()
        L_0x0159:
            int r2 = r2 + 1
            goto L_0x00f7
        L_0x015c:
            r9 = r0
        L_0x015d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekt.mo20417a(java.lang.Object):com.google.android.gms.internal.ads.zzfzp");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzfzp mo45354b(zzfdk zzfdk, zzfdw zzfdw, zzehc zzehc, Throwable th) throws Exception {
        zzfjj a = zzfji.m50258a(this.f34320j, 12);
        a.mo45797f0(zzfdk.f35498F);
        a.mo45794c();
        zzeko zzeko = this.f34318h;
        zzfzp o = zzfzg.m51420o(zzehc.mo45299b(zzfdw, zzfdk), (long) zzfdk.f35511S, TimeUnit.MILLISECONDS, this.f34316f);
        zzeko.mo45350e(zzfdw, zzfdk, o, this.f34313c);
        zzfjt.m50318a(o, this.f34321k, a);
        return o;
    }
}
