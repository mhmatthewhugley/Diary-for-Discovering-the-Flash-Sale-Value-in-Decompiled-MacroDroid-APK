package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfne implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    @VisibleForTesting

    /* renamed from: a */
    protected final zzfoe f36147a;

    /* renamed from: c */
    private final String f36148c;

    /* renamed from: d */
    private final String f36149d;

    /* renamed from: f */
    private final LinkedBlockingQueue f36150f = new LinkedBlockingQueue();

    /* renamed from: g */
    private final HandlerThread f36151g;

    public zzfne(Context context, String str, String str2) {
        this.f36148c = str;
        this.f36149d = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f36151g = handlerThread;
        handlerThread.start();
        zzfoe zzfoe = new zzfoe(context, handlerThread.getLooper(), this, this, 9200000);
        this.f36147a = zzfoe;
        zzfoe.mo21655v();
    }

    @VisibleForTesting
    /* renamed from: a */
    static zzana m50605a() {
        zzamk f0 = zzana.m41917f0();
        f0.mo41703v(32768);
        return (zzana) f0.mo47341h();
    }

    /* renamed from: A1 */
    public final void mo21661A1(ConnectionResult connectionResult) {
        try {
            this.f36150f.put(m50605a());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: b */
    public final zzana mo46000b(int i) {
        zzana zzana;
        try {
            zzana = (zzana) this.f36150f.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzana = null;
        }
        return zzana == null ? m50605a() : zzana;
    }

    /* renamed from: c */
    public final void mo46001c() {
        zzfoe zzfoe = this.f36147a;
        if (zzfoe == null) {
            return;
        }
        if (zzfoe.mo21641c() || this.f36147a.mo21644f()) {
            this.f36147a.mo21640b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final zzfoj mo46002d() {
        try {
            return this.f36147a.mo46024o0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: t1 */
    public final void mo21659t1(int i) {
        try {
            this.f36150f.put(m50605a());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        mo46001c();
        r3.f36151g.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.f36150f.put(m50605a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21660y(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzfoj r4 = r3.mo46002d()
            if (r4 == 0) goto L_0x0039
            com.google.android.gms.internal.ads.zzfof r0 = new com.google.android.gms.internal.ads.zzfof     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.f36148c     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r3.f36149d     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzfoh r4 = r4.mo46032Z8(r0)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzana r4 = r4.mo46028l2()     // Catch:{ all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue r0 = r3.f36150f     // Catch:{ all -> 0x0025 }
            r0.put(r4)     // Catch:{ all -> 0x0025 }
        L_0x001c:
            r3.mo46001c()
            android.os.HandlerThread r4 = r3.f36151g
            r4.quit()
            return
        L_0x0025:
            java.util.concurrent.LinkedBlockingQueue r4 = r3.f36150f     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            com.google.android.gms.internal.ads.zzana r0 = m50605a()     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            goto L_0x001c
        L_0x002f:
            r4 = move-exception
            r3.mo46001c()
            android.os.HandlerThread r0 = r3.f36151g
            r0.quit()
            throw r4
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfne.mo21660y(android.os.Bundle):void");
    }
}
