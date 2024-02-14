package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbck {

    /* renamed from: a */
    private final Object f26592a = new Object();

    /* renamed from: b */
    private zzbci f26593b = null;

    /* renamed from: c */
    private boolean f26594c = false;

    @Nullable
    /* renamed from: a */
    public final Activity mo42460a() {
        synchronized (this.f26592a) {
            zzbci zzbci = this.f26593b;
            if (zzbci == null) {
                return null;
            }
            Activity a = zzbci.mo42447a();
            return a;
        }
    }

    @Nullable
    /* renamed from: b */
    public final Context mo42461b() {
        synchronized (this.f26592a) {
            zzbci zzbci = this.f26593b;
            if (zzbci == null) {
                return null;
            }
            Context b = zzbci.mo42448b();
            return b;
        }
    }

    /* renamed from: c */
    public final void mo42462c(zzbcj zzbcj) {
        synchronized (this.f26592a) {
            if (this.f26593b == null) {
                this.f26593b = new zzbci();
            }
            this.f26593b.mo42449f(zzbcj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42463d(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f26592a
            monitor-enter(r0)
            boolean r1 = r3.f26594c     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0032
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x000e
            r1 = r4
        L_0x000e:
            boolean r2 = r1 instanceof android.app.Application     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0015
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0034 }
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            if (r1 != 0) goto L_0x001f
            java.lang.String r4 = "Can not cast Context to Application"
            com.google.android.gms.internal.ads.zzcgp.m45229g(r4)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x001f:
            com.google.android.gms.internal.ads.zzbci r2 = r3.f26593b     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.zzbci r2 = new com.google.android.gms.internal.ads.zzbci     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            r3.f26593b = r2     // Catch:{ all -> 0x0034 }
        L_0x002a:
            com.google.android.gms.internal.ads.zzbci r2 = r3.f26593b     // Catch:{ all -> 0x0034 }
            r2.mo42450g(r1, r4)     // Catch:{ all -> 0x0034 }
            r4 = 1
            r3.f26594c = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbck.mo42463d(android.content.Context):void");
    }

    /* renamed from: e */
    public final void mo42464e(zzbcj zzbcj) {
        synchronized (this.f26592a) {
            zzbci zzbci = this.f26593b;
            if (zzbci != null) {
                zzbci.mo42451h(zzbcj);
            }
        }
    }
}
