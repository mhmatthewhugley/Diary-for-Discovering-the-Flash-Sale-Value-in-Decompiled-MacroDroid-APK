package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcec implements zzbbq {

    /* renamed from: a */
    private final Context f28291a;

    /* renamed from: c */
    private final Object f28292c;

    /* renamed from: d */
    private final String f28293d;

    /* renamed from: f */
    private boolean f28294f;

    public zzcec(Context context, String str) {
        this.f28291a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f28293d = str;
        this.f28294f = false;
        this.f28292c = new Object();
    }

    /* renamed from: O0 */
    public final void mo42396O0(zzbbp zzbbp) {
        mo43422b(zzbbp.f26529j);
    }

    /* renamed from: a */
    public final String mo43421a() {
        return this.f28293d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43422b(boolean r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzceu r0 = com.google.android.gms.ads.internal.zzt.m2903p()
            android.content.Context r1 = r3.f28291a
            boolean r0 = r0.mo43449z(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r3.f28292c
            monitor-enter(r0)
            boolean r1 = r3.f28294f     // Catch:{ all -> 0x003f }
            if (r1 != r4) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0016:
            r3.f28294f = r4     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r3.f28293d     // Catch:{ all -> 0x003f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0022:
            boolean r4 = r3.f28294f     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.zzceu r4 = com.google.android.gms.ads.internal.zzt.m2903p()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f28291a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f28293d     // Catch:{ all -> 0x003f }
            r4.mo43436m(r1, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0032:
            com.google.android.gms.internal.ads.zzceu r4 = com.google.android.gms.ads.internal.zzt.m2903p()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f28291a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f28293d     // Catch:{ all -> 0x003f }
            r4.mo43437n(r1, r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcec.mo43422b(boolean):void");
    }
}
