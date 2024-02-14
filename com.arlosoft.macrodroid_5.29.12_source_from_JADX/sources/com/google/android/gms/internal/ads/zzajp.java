package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzajp extends Thread {

    /* renamed from: p */
    private static final boolean f24845p = zzakp.f24909b;

    /* renamed from: a */
    private final BlockingQueue f24846a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BlockingQueue f24847c;

    /* renamed from: d */
    private final zzajn f24848d;

    /* renamed from: f */
    private volatile boolean f24849f = false;

    /* renamed from: g */
    private final zzakq f24850g;

    /* renamed from: o */
    private final zzaju f24851o;

    public zzajp(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzajn zzajn, zzaju zzaju, byte[] bArr) {
        this.f24846a = blockingQueue;
        this.f24847c = blockingQueue2;
        this.f24848d = zzajn;
        this.f24851o = zzaju;
        this.f24850g = new zzakq(this, blockingQueue2, zzaju, (byte[]) null);
    }

    /* renamed from: c */
    private void m41610c() throws InterruptedException {
        zzakd zzakd = (zzakd) this.f24846a.take();
        zzakd.mo41591o("cache-queue-take");
        zzakd.mo41598x(1);
        try {
            zzakd.mo41580C();
            zzajm o = this.f24848d.mo41555o(zzakd.mo41589l());
            if (o == null) {
                zzakd.mo41591o("cache-miss");
                if (!this.f24850g.mo41611c(zzakd)) {
                    this.f24847c.put(zzakd);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (o.mo41554a(currentTimeMillis)) {
                zzakd.mo41591o("cache-hit-expired");
                zzakd.mo41586f(o);
                if (!this.f24850g.mo41611c(zzakd)) {
                    this.f24847c.put(zzakd);
                }
                zzakd.mo41598x(2);
                return;
            }
            zzakd.mo41591o("cache-hit");
            zzakj j = zzakd.mo20330j(new zzajz(o.f24835a, o.f24841g));
            zzakd.mo41591o("cache-hit-parsed");
            if (!j.mo41607c()) {
                zzakd.mo41591o("cache-parsing-failed");
                this.f24848d.mo41557q(zzakd.mo41589l(), true);
                zzakd.mo41586f((zzajm) null);
                if (!this.f24850g.mo41611c(zzakd)) {
                    this.f24847c.put(zzakd);
                }
                zzakd.mo41598x(2);
                return;
            }
            if (o.f24840f < currentTimeMillis) {
                zzakd.mo41591o("cache-hit-refresh-needed");
                zzakd.mo41586f(o);
                j.f24901d = true;
                if (!this.f24850g.mo41611c(zzakd)) {
                    this.f24851o.mo41568b(zzakd, j, new zzajo(this, zzakd));
                } else {
                    this.f24851o.mo41568b(zzakd, j, (Runnable) null);
                }
            } else {
                this.f24851o.mo41568b(zzakd, j, (Runnable) null);
            }
            zzakd.mo41598x(2);
        } finally {
            zzakd.mo41598x(2);
        }
    }

    /* renamed from: b */
    public final void mo41560b() {
        this.f24849f = true;
        interrupt();
    }

    public final void run() {
        if (f24845p) {
            zzakp.m41663d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f24848d.zzb();
        while (true) {
            try {
                m41610c();
            } catch (InterruptedException unused) {
                if (this.f24849f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzakp.m41661b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
