package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzajx extends Thread {

    /* renamed from: a */
    private final BlockingQueue f24861a;

    /* renamed from: c */
    private final zzajw f24862c;

    /* renamed from: d */
    private final zzajn f24863d;

    /* renamed from: f */
    private volatile boolean f24864f = false;

    /* renamed from: g */
    private final zzaju f24865g;

    public zzajx(BlockingQueue blockingQueue, zzajw zzajw, zzajn zzajn, zzaju zzaju, byte[] bArr) {
        this.f24861a = blockingQueue;
        this.f24862c = zzajw;
        this.f24863d = zzajn;
        this.f24865g = zzaju;
    }

    /* renamed from: b */
    private void m41620b() throws InterruptedException {
        zzakd zzakd = (zzakd) this.f24861a.take();
        SystemClock.elapsedRealtime();
        zzakd.mo41598x(3);
        try {
            zzakd.mo41591o("network-queue-take");
            zzakd.mo41580C();
            TrafficStats.setThreadStatsTag(zzakd.mo41584d());
            zzajz a = this.f24862c.mo20311a(zzakd);
            zzakd.mo41591o("network-http-complete");
            if (!a.f24870e || !zzakd.mo41579A()) {
                zzakj j = zzakd.mo20330j(a);
                zzakd.mo41591o("network-parse-complete");
                if (j.f24899b != null) {
                    this.f24863d.mo41556p(zzakd.mo41589l(), j.f24899b);
                    zzakd.mo41591o("network-cache-written");
                }
                zzakd.mo41594t();
                this.f24865g.mo41568b(zzakd, j, (Runnable) null);
                zzakd.mo41597w(j);
                zzakd.mo41598x(4);
                return;
            }
            zzakd.mo41593s("not-modified");
            zzakd.mo41596v();
        } catch (zzakm e) {
            SystemClock.elapsedRealtime();
            this.f24865g.mo41567a(zzakd, e);
            zzakd.mo41596v();
        } catch (Exception e2) {
            zzakp.m41662c(e2, "Unhandled exception %s", e2.toString());
            zzakm zzakm = new zzakm((Throwable) e2);
            SystemClock.elapsedRealtime();
            this.f24865g.mo41567a(zzakd, zzakm);
            zzakd.mo41596v();
        } finally {
            zzakd.mo41598x(4);
        }
    }

    /* renamed from: a */
    public final void mo41574a() {
        this.f24864f = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m41620b();
            } catch (InterruptedException unused) {
                if (this.f24864f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzakp.m41661b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
