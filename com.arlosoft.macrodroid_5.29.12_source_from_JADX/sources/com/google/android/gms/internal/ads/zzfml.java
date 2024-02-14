package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfml {

    /* renamed from: a */
    private final BlockingQueue f36116a;

    /* renamed from: b */
    private final ThreadPoolExecutor f36117b;

    /* renamed from: c */
    private final ArrayDeque f36118c = new ArrayDeque();

    /* renamed from: d */
    private zzfmk f36119d = null;

    public zzfml() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f36116a = linkedBlockingQueue;
        this.f36117b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: c */
    private final void m50564c() {
        zzfmk zzfmk = (zzfmk) this.f36118c.poll();
        this.f36119d = zzfmk;
        if (zzfmk != null) {
            zzfmk.executeOnExecutor(this.f36117b, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo45973a(zzfmk zzfmk) {
        this.f36119d = null;
        m50564c();
    }

    /* renamed from: b */
    public final void mo45974b(zzfmk zzfmk) {
        zzfmk.mo45971b(this);
        this.f36118c.add(zzfmk);
        if (this.f36119d == null) {
            m50564c();
        }
    }
}
