package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzell implements zzdmp {

    /* renamed from: a */
    private final Context f34376a;

    /* renamed from: b */
    private final zzduy f34377b;

    /* renamed from: c */
    private final zzfef f34378c;

    /* renamed from: d */
    private final zzcgv f34379d;

    /* renamed from: e */
    private final zzfdk f34380e;

    /* renamed from: f */
    private final zzfzp f34381f;

    /* renamed from: g */
    private final zzcmp f34382g;

    /* renamed from: h */
    private final zzbpx f34383h;

    /* renamed from: i */
    private final boolean f34384i;

    zzell(Context context, zzduy zzduy, zzfef zzfef, zzcgv zzcgv, zzfdk zzfdk, zzfzp zzfzp, zzcmp zzcmp, zzbpx zzbpx, boolean z) {
        this.f34376a = context;
        this.f34377b = zzduy;
        this.f34378c = zzfef;
        this.f34379d = zzcgv;
        this.f34380e = zzfdk;
        this.f34381f = zzfzp;
        this.f34382g = zzcmp;
        this.f34383h = zzbpx;
        this.f34384i = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44707a(boolean r22, android.content.Context r23, com.google.android.gms.internal.ads.zzddn r24) {
        /*
            r21 = this;
            r1 = r21
            com.google.android.gms.internal.ads.zzfzp r0 = r1.f34381f
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzfzg.m51422q(r0)
            com.google.android.gms.internal.ads.zzdud r0 = (com.google.android.gms.internal.ads.zzdud) r0
            com.google.android.gms.internal.ads.zzfdk r2 = r1.f34380e     // Catch:{ zzcna -> 0x00fc }
            com.google.android.gms.internal.ads.zzcmp r3 = r1.f34382g     // Catch:{ zzcna -> 0x00fc }
            boolean r3 = r3.mo44067q0()     // Catch:{ zzcna -> 0x00fc }
            r4 = 1
            if (r3 != 0) goto L_0x0019
            com.google.android.gms.internal.ads.zzcmp r2 = r1.f34382g     // Catch:{ zzcna -> 0x00fc }
        L_0x0017:
            r11 = r2
            goto L_0x007e
        L_0x0019:
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f26867G0     // Catch:{ zzcna -> 0x00fc }
            com.google.android.gms.internal.ads.zzbja r5 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ zzcna -> 0x00fc }
            java.lang.Object r3 = r5.mo42663b(r3)     // Catch:{ zzcna -> 0x00fc }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ zzcna -> 0x00fc }
            boolean r3 = r3.booleanValue()     // Catch:{ zzcna -> 0x00fc }
            if (r3 != 0) goto L_0x002e
            com.google.android.gms.internal.ads.zzcmp r2 = r1.f34382g     // Catch:{ zzcna -> 0x00fc }
            goto L_0x0017
        L_0x002e:
            com.google.android.gms.internal.ads.zzduy r3 = r1.f34377b     // Catch:{ zzcna -> 0x00fc }
            com.google.android.gms.internal.ads.zzfef r5 = r1.f34378c     // Catch:{ zzcna -> 0x00fc }
            com.google.android.gms.ads.internal.client.zzq r5 = r5.f35630e     // Catch:{ zzcna -> 0x00fc }
            r6 = 0
            com.google.android.gms.internal.ads.zzcmp r3 = r3.mo45004a(r5, r6, r6)     // Catch:{ zzcna -> 0x00fc }
            com.google.android.gms.internal.ads.zzdkw r5 = r0.mo44349i()     // Catch:{ zzcna -> 0x00fc }
            com.google.android.gms.internal.ads.zzbql.m43980b(r3, r5)     // Catch:{ zzcna -> 0x00fc }
            com.google.android.gms.internal.ads.zzdvc r5 = new com.google.android.gms.internal.ads.zzdvc     // Catch:{ zzcna -> 0x00fc }
            r5.<init>()     // Catch:{ zzcna -> 0x00fc }
            android.content.Context r7 = r1.f34376a     // Catch:{ zzcna -> 0x00fc }
            r8 = r3
            android.view.View r8 = (android.view.View) r8     // Catch:{ zzcna -> 0x00fc }
            r5.mo45007a(r7, r8)     // Catch:{ zzcna -> 0x00fc }
            com.google.android.gms.internal.ads.zzdux r7 = r0.mo44352l()     // Catch:{ zzcna -> 0x00fc }
            boolean r8 = r1.f34384i     // Catch:{ zzcna -> 0x00fc }
            if (r8 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.zzbpx r8 = r1.f34383h     // Catch:{ zzcna -> 0x00fc }
            goto L_0x0059
        L_0x0058:
            r8 = r6
        L_0x0059:
            r7.mo45003i(r3, r4, r8)     // Catch:{ zzcna -> 0x00fc }
            com.google.android.gms.internal.ads.zzcoc r7 = r3.mo44044e0()     // Catch:{ zzcna -> 0x00fc }
            com.google.android.gms.internal.ads.zzelj r8 = new com.google.android.gms.internal.ads.zzelj     // Catch:{ zzcna -> 0x00fc }
            r8.<init>(r5, r3)     // Catch:{ zzcna -> 0x00fc }
            r7.mo44085I(r8)     // Catch:{ zzcna -> 0x00fc }
            com.google.android.gms.internal.ads.zzcoc r5 = r3.mo44044e0()     // Catch:{ zzcna -> 0x00fc }
            com.google.android.gms.internal.ads.zzelk r7 = new com.google.android.gms.internal.ads.zzelk     // Catch:{ zzcna -> 0x00fc }
            r7.<init>(r3)     // Catch:{ zzcna -> 0x00fc }
            r5.mo44099d0(r7)     // Catch:{ zzcna -> 0x00fc }
            com.google.android.gms.internal.ads.zzfdp r2 = r2.f35554t     // Catch:{ zzcna -> 0x00fc }
            java.lang.String r5 = r2.f35578b     // Catch:{ zzcna -> 0x00fc }
            java.lang.String r2 = r2.f35577a     // Catch:{ zzcna -> 0x00fc }
            r3.mo44028R0(r5, r2, r6)     // Catch:{ zzcna -> 0x00fc }
            r11 = r3
        L_0x007e:
            r11.mo44030S0(r4)
            com.google.android.gms.ads.internal.zzj r2 = new com.google.android.gms.ads.internal.zzj
            boolean r3 = r1.f34384i
            r5 = 0
            if (r3 == 0) goto L_0x0090
            com.google.android.gms.internal.ads.zzbpx r3 = r1.f34383h
            boolean r3 = r3.mo42874e(r5)
            r13 = r3
            goto L_0x0091
        L_0x0090:
            r13 = 0
        L_0x0091:
            com.google.android.gms.ads.internal.zzt.m2905r()
            android.content.Context r3 = r1.f34376a
            boolean r14 = com.google.android.gms.ads.internal.util.zzs.m2754e(r3)
            boolean r3 = r1.f34384i
            if (r3 == 0) goto L_0x00a6
            com.google.android.gms.internal.ads.zzbpx r5 = r1.f34383h
            boolean r5 = r5.mo42873d()
            r15 = r5
            goto L_0x00a7
        L_0x00a6:
            r15 = 0
        L_0x00a7:
            if (r3 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.zzbpx r3 = r1.f34383h
            float r3 = r3.mo42870a()
            r16 = r3
            goto L_0x00b5
        L_0x00b2:
            r3 = 0
            r16 = 0
        L_0x00b5:
            com.google.android.gms.internal.ads.zzfdk r3 = r1.f34380e
            r17 = -1
            boolean r5 = r3.f35508P
            boolean r3 = r3.f35509Q
            r12 = r2
            r18 = r22
            r19 = r5
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r24 == 0) goto L_0x00cc
            r24.mo44579c()
        L_0x00cc:
            com.google.android.gms.ads.internal.zzt.m2898k()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzdme r9 = r0.mo44350j()
            com.google.android.gms.internal.ads.zzfdk r0 = r1.f34380e
            int r12 = r0.f35510R
            com.google.android.gms.internal.ads.zzcgv r13 = r1.f34379d
            java.lang.String r14 = r0.f35495C
            com.google.android.gms.internal.ads.zzfdp r0 = r0.f35554t
            r8 = 0
            r10 = 0
            java.lang.String r5 = r0.f35578b
            java.lang.String r0 = r0.f35577a
            com.google.android.gms.internal.ads.zzfef r6 = r1.f34378c
            java.lang.String r6 = r6.f35631f
            r7 = r3
            r15 = r2
            r16 = r5
            r17 = r0
            r18 = r6
            r19 = r24
            r7.<init>((com.google.android.gms.ads.internal.client.zza) r8, (com.google.android.gms.ads.internal.overlay.zzo) r9, (com.google.android.gms.ads.internal.overlay.zzz) r10, (com.google.android.gms.internal.ads.zzcmp) r11, (int) r12, (com.google.android.gms.internal.ads.zzcgv) r13, (java.lang.String) r14, (com.google.android.gms.ads.internal.zzj) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (com.google.android.gms.internal.ads.zzddn) r19)
            r0 = r23
            com.google.android.gms.ads.internal.overlay.zzm.m2466a(r0, r3, r4)
            return
        L_0x00fc:
            r0 = move-exception
            java.lang.String r2 = ""
            com.google.android.gms.internal.ads.zzcgp.m45227e(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzell.mo44707a(boolean, android.content.Context, com.google.android.gms.internal.ads.zzddn):void");
    }
}
