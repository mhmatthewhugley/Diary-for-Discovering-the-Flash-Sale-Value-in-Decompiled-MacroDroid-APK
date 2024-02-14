package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfdj {

    /* renamed from: a */
    private final Clock f35489a;

    /* renamed from: b */
    private final Object f35490b = new Object();

    /* renamed from: c */
    private volatile long f35491c = 0;

    /* renamed from: d */
    private volatile int f35492d = 1;

    public zzfdj(Clock clock) {
        this.f35489a = clock;
    }

    /* renamed from: e */
    private final void m49934e() {
        long a = this.f35489a.mo21950a();
        synchronized (this.f35490b) {
            if (this.f35492d == 3) {
                if (this.f35491c + ((Long) zzay.m1924c().mo42663b(zzbjc.f27067a5)).longValue() <= a) {
                    this.f35492d = 1;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m49935f(int r5, int r6) {
        /*
            r4 = this;
            r4.m49934e()
            com.google.android.gms.common.util.Clock r0 = r4.f35489a
            long r0 = r0.mo21950a()
            java.lang.Object r2 = r4.f35490b
            monitor-enter(r2)
            int r3 = r4.f35492d     // Catch:{ all -> 0x001d }
            if (r3 == r5) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            r4.f35492d = r6     // Catch:{ all -> 0x001d }
            int r5 = r4.f35492d     // Catch:{ all -> 0x001d }
            r6 = 3
            if (r5 != r6) goto L_0x001b
            r4.f35491c = r0     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdj.m49935f(int, int):void");
    }

    /* renamed from: a */
    public final void mo45596a() {
        m49935f(2, 3);
    }

    /* renamed from: b */
    public final void mo45597b(boolean z) {
        if (z) {
            m49935f(1, 2);
        } else {
            m49935f(2, 1);
        }
    }

    /* renamed from: c */
    public final boolean mo45598c() {
        boolean z;
        synchronized (this.f35490b) {
            m49934e();
            z = this.f35492d == 3;
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo45599d() {
        boolean z;
        synchronized (this.f35490b) {
            m49934e();
            z = this.f35492d == 2;
        }
        return z;
    }
}
