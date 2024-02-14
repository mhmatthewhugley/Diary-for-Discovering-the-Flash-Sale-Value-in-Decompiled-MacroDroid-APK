package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.zzb;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeig implements zzehj {

    /* renamed from: a */
    private final Context f34097a;

    /* renamed from: b */
    private final zzcxz f34098b;

    /* renamed from: c */
    private final Executor f34099c;

    public zzeig(Context context, zzcxz zzcxz, Executor executor) {
        this.f34097a = context;
        this.f34098b = zzcxz;
        this.f34099c = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo45309a(com.google.android.gms.internal.ads.zzfdw r7, com.google.android.gms.internal.ads.zzfdk r8, com.google.android.gms.internal.ads.zzehf r9) throws com.google.android.gms.internal.ads.zzfek, com.google.android.gms.internal.ads.zzekr {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26903J6
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r1.mo42663b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0077
            boolean r0 = r8.f35536i0
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r9.f34016b
            com.google.android.gms.internal.ads.zzffa r0 = (com.google.android.gms.internal.ads.zzffa) r0
            com.google.android.gms.internal.ads.zzbvt r0 = r0.mo45650f()
            if (r0 == 0) goto L_0x0067
            com.google.android.gms.dynamic.IObjectWrapper r2 = r0.mo43089b()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.m5050A1(r2)     // Catch:{ RemoteException -> 0x0060 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ RemoteException -> 0x0060 }
            boolean r0 = r0.mo43090c()     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0053
            if (r0 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.zzfzp r0 = com.google.android.gms.internal.ads.zzfzg.m51414i(r1)
            com.google.android.gms.internal.ads.zzeif r3 = new com.google.android.gms.internal.ads.zzeif
            r3.<init>(r6, r2, r8)
            com.google.android.gms.internal.ads.zzfzq r2 = com.google.android.gms.internal.ads.zzchc.f28460e
            com.google.android.gms.internal.ads.zzfzp r0 = com.google.android.gms.internal.ads.zzfzg.m51419n(r0, r3, r2)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            r2 = r0
            android.view.View r2 = (android.view.View) r2     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            goto L_0x007f
        L_0x004a:
            r7 = move-exception
            goto L_0x004d
        L_0x004c:
            r7 = move-exception
        L_0x004d:
            com.google.android.gms.internal.ads.zzfek r8 = new com.google.android.gms.internal.ads.zzfek
            r8.<init>(r7)
            throw r8
        L_0x0053:
            com.google.android.gms.internal.ads.zzfek r7 = new com.google.android.gms.internal.ads.zzfek
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "BannerAdapterWrapper interscrollerView should not be null"
            r8.<init>(r9)
            r7.<init>(r8)
            throw r7
        L_0x0060:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzfek r8 = new com.google.android.gms.internal.ads.zzfek
            r8.<init>(r7)
            throw r8
        L_0x0067:
            java.lang.String r7 = "getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."
            com.google.android.gms.internal.ads.zzcgp.m45226d(r7)
            com.google.android.gms.internal.ads.zzfek r8 = new com.google.android.gms.internal.ads.zzfek
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>(r7)
            r8.<init>(r9)
            throw r8
        L_0x0077:
            java.lang.Object r0 = r9.f34016b
            com.google.android.gms.internal.ads.zzffa r0 = (com.google.android.gms.internal.ads.zzffa) r0
            android.view.View r2 = r0.mo45648d()
        L_0x007f:
            com.google.android.gms.internal.ads.zzcxz r0 = r6.f34098b
            com.google.android.gms.internal.ads.zzczt r3 = new com.google.android.gms.internal.ads.zzczt
            java.lang.String r4 = r9.f34015a
            r3.<init>(r7, r8, r4)
            com.google.android.gms.internal.ads.zzcxj r7 = new com.google.android.gms.internal.ads.zzcxj
            java.lang.Object r4 = r9.f34016b
            com.google.android.gms.internal.ads.zzffa r4 = (com.google.android.gms.internal.ads.zzffa) r4
            com.google.android.gms.internal.ads.zzeie r5 = new com.google.android.gms.internal.ads.zzeie
            r5.<init>(r4)
            java.util.List r8 = r8.f35556v
            r4 = 0
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.zzfdl r8 = (com.google.android.gms.internal.ads.zzfdl) r8
            r7.<init>(r2, r1, r5, r8)
            com.google.android.gms.internal.ads.zzcxd r7 = r0.mo44291a(r3, r7)
            com.google.android.gms.internal.ads.zzdki r8 = r7.mo44281i()
            r8.mo44684M0(r2)
            com.google.android.gms.internal.ads.zzddz r8 = r7.mo44277c()
            com.google.android.gms.internal.ads.zzcuq r0 = new com.google.android.gms.internal.ads.zzcuq
            java.lang.Object r1 = r9.f34016b
            com.google.android.gms.internal.ads.zzffa r1 = (com.google.android.gms.internal.ads.zzffa) r1
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r6.f34099c
            r8.mo44629G0(r0, r1)
            com.google.android.gms.internal.ads.zzdek r8 = r9.f34017c
            com.google.android.gms.internal.ads.zzeix r8 = (com.google.android.gms.internal.ads.zzeix) r8
            com.google.android.gms.internal.ads.zzemd r9 = r7.mo44279g()
            r8.mo45330Kb(r9)
            com.google.android.gms.internal.ads.zzcxc r7 = r7.mo44280h()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeig.mo45309a(com.google.android.gms.internal.ads.zzfdw, com.google.android.gms.internal.ads.zzfdk, com.google.android.gms.internal.ads.zzehf):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo45310b(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek {
        zzq a;
        zzq zzq = zzfdw.f35589a.f35583a.f35630e;
        if (zzq.f2023E) {
            a = new zzq(this.f34097a, zzb.m3104d(zzq.f2029g, zzq.f2026c));
        } else {
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26903J6)).booleanValue() || !zzfdk.f35536i0) {
                a = zzfej.m50010a(this.f34097a, zzfdk.f35556v);
            } else {
                a = new zzq(this.f34097a, zzb.m3105e(zzq.f2029g, zzq.f2026c));
            }
        }
        zzq zzq2 = a;
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26903J6)).booleanValue() || !zzfdk.f35536i0) {
            ((zzffa) zzehf.f34016b).mo45659o(this.f34097a, zzq2, zzfdw.f35589a.f35583a.f35629d, zzfdk.f35557w.toString(), zzbu.m2602l(zzfdk.f35554t), (zzbvq) zzehf.f34017c);
        } else {
            ((zzffa) zzehf.f34016b).mo45660p(this.f34097a, zzq2, zzfdw.f35589a.f35583a.f35629d, zzfdk.f35557w.toString(), zzbu.m2602l(zzfdk.f35554t), (zzbvq) zzehf.f34017c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzfzp mo45321c(View view, zzfdk zzfdk, Object obj) throws Exception {
        return zzfzg.m51414i(zzcyq.m47038a(this.f34097a, view, zzfdk));
    }
}
