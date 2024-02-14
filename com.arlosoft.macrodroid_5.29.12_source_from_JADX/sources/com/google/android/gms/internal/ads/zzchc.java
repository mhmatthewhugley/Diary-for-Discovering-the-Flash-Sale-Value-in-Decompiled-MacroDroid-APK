package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzchc {

    /* renamed from: a */
    public static final zzfzq f28456a;

    /* renamed from: b */
    public static final zzfzq f28457b;

    /* renamed from: c */
    public static final zzfzq f28458c;

    /* renamed from: d */
    public static final ScheduledExecutorService f28459d = new zzcgx(3, new zzcgy("Schedule"));

    /* renamed from: e */
    public static final zzfzq f28460e = new zzchb(new zzcgz(), (zzcha) null);

    /* renamed from: f */
    public static final zzfzq f28461f = new zzchb(zzfzw.m51438b(), (zzcha) null);

    /* JADX WARNING: type inference failed for: r0v11, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: type inference failed for: r0v14, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: type inference failed for: r0v18, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.m4857a()
            java.lang.String r1 = "Default"
            if (r0 == 0) goto L_0x0019
            com.google.android.gms.internal.ads.zzfpy.m50764a()
            com.google.android.gms.internal.ads.zzcgy r0 = new com.google.android.gms.internal.ads.zzcgy
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool(r0)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            goto L_0x0031
        L_0x0019:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue
            r7.<init>()
            com.google.android.gms.internal.ads.zzcgy r8 = new com.google.android.gms.internal.ads.zzcgy
            r8.<init>(r1)
            r2 = 2
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 10
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)
        L_0x0031:
            com.google.android.gms.internal.ads.zzchb r1 = new com.google.android.gms.internal.ads.zzchb
            r2 = 0
            r1.<init>(r0, r2)
            f28456a = r1
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.m4857a()
            java.lang.String r1 = "Loader"
            r3 = 1
            if (r0 == 0) goto L_0x0051
            com.google.android.gms.internal.ads.zzfpv r0 = com.google.android.gms.internal.ads.zzfpy.m50764a()
            com.google.android.gms.internal.ads.zzcgy r4 = new com.google.android.gms.internal.ads.zzcgy
            r4.<init>(r1)
            r1 = 5
            java.util.concurrent.ExecutorService r0 = r0.mo46075b(r1, r4, r3)
            goto L_0x006a
        L_0x0051:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            com.google.android.gms.internal.ads.zzcgy r11 = new com.google.android.gms.internal.ads.zzcgy
            r11.<init>(r1)
            r5 = 5
            r6 = 5
            r7 = 10
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11)
            r0.allowCoreThreadTimeOut(r3)
        L_0x006a:
            com.google.android.gms.internal.ads.zzchb r1 = new com.google.android.gms.internal.ads.zzchb
            r1.<init>(r0, r2)
            f28457b = r1
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.m4857a()
            java.lang.String r1 = "Activeview"
            if (r0 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.zzfpv r0 = com.google.android.gms.internal.ads.zzfpy.m50764a()
            com.google.android.gms.internal.ads.zzcgy r4 = new com.google.android.gms.internal.ads.zzcgy
            r4.<init>(r1)
            java.util.concurrent.ExecutorService r0 = r0.mo46074a(r4, r3)
            goto L_0x00a0
        L_0x0087:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            com.google.android.gms.internal.ads.zzcgy r11 = new com.google.android.gms.internal.ads.zzcgy
            r11.<init>(r1)
            r5 = 1
            r6 = 1
            r7 = 10
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11)
            r0.allowCoreThreadTimeOut(r3)
        L_0x00a0:
            com.google.android.gms.internal.ads.zzchb r1 = new com.google.android.gms.internal.ads.zzchb
            r1.<init>(r0, r2)
            f28458c = r1
            com.google.android.gms.internal.ads.zzcgx r0 = new com.google.android.gms.internal.ads.zzcgx
            com.google.android.gms.internal.ads.zzcgy r1 = new com.google.android.gms.internal.ads.zzcgy
            java.lang.String r3 = "Schedule"
            r1.<init>(r3)
            r3 = 3
            r0.<init>(r3, r1)
            f28459d = r0
            com.google.android.gms.internal.ads.zzcgz r0 = new com.google.android.gms.internal.ads.zzcgz
            r0.<init>()
            com.google.android.gms.internal.ads.zzchb r1 = new com.google.android.gms.internal.ads.zzchb
            r1.<init>(r0, r2)
            f28460e = r1
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzfzw.m51438b()
            com.google.android.gms.internal.ads.zzchb r1 = new com.google.android.gms.internal.ads.zzchb
            r1.<init>(r0, r2)
            f28461f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchc.<clinit>():void");
    }
}
