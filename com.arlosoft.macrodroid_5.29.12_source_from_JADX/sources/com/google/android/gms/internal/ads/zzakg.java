package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzakg {

    /* renamed from: a */
    private final AtomicInteger f24887a = new AtomicInteger();

    /* renamed from: b */
    private final Set f24888b = new HashSet();

    /* renamed from: c */
    private final PriorityBlockingQueue f24889c = new PriorityBlockingQueue();

    /* renamed from: d */
    private final PriorityBlockingQueue f24890d = new PriorityBlockingQueue();

    /* renamed from: e */
    private final zzajn f24891e;

    /* renamed from: f */
    private final zzajw f24892f;

    /* renamed from: g */
    private final zzajx[] f24893g;

    /* renamed from: h */
    private zzajp f24894h;

    /* renamed from: i */
    private final List f24895i = new ArrayList();

    /* renamed from: j */
    private final List f24896j = new ArrayList();

    /* renamed from: k */
    private final zzaju f24897k;

    public zzakg(zzajn zzajn, zzajw zzajw, int i) {
        zzaju zzaju = new zzaju(new Handler(Looper.getMainLooper()));
        this.f24891e = zzajn;
        this.f24892f = zzajw;
        this.f24893g = new zzajx[4];
        this.f24897k = zzaju;
    }

    /* renamed from: a */
    public final zzakd mo41603a(zzakd zzakd) {
        zzakd.mo41587g(this);
        synchronized (this.f24888b) {
            this.f24888b.add(zzakd);
        }
        zzakd.mo41588i(this.f24887a.incrementAndGet());
        zzakd.mo41591o("add-to-queue");
        mo41605c(zzakd, 0);
        this.f24889c.add(zzakd);
        return zzakd;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo41604b(zzakd zzakd) {
        synchronized (this.f24888b) {
            this.f24888b.remove(zzakd);
        }
        synchronized (this.f24895i) {
            for (zzakf zza : this.f24895i) {
                zza.zza();
            }
        }
        mo41605c(zzakd, 5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo41605c(zzakd zzakd, int i) {
        synchronized (this.f24896j) {
            for (zzake zza : this.f24896j) {
                zza.zza();
            }
        }
    }

    /* renamed from: d */
    public final void mo41606d() {
        zzajp zzajp = this.f24894h;
        if (zzajp != null) {
            zzajp.mo41560b();
        }
        zzajx[] zzajxArr = this.f24893g;
        for (int i = 0; i < 4; i++) {
            zzajx zzajx = zzajxArr[i];
            if (zzajx != null) {
                zzajx.mo41574a();
            }
        }
        zzajp zzajp2 = new zzajp(this.f24889c, this.f24890d, this.f24891e, this.f24897k, (byte[]) null);
        this.f24894h = zzajp2;
        zzajp2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzajx zzajx2 = new zzajx(this.f24890d, this.f24892f, this.f24891e, this.f24897k, (byte[]) null);
            this.f24893g[i2] = zzajx2;
            zzajx2.start();
        }
    }
}
