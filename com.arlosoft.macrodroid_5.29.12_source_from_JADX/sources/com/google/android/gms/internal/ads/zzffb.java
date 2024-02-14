package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzffb {

    /* renamed from: a */
    private final Deque f35678a = new LinkedBlockingDeque();

    /* renamed from: b */
    private final Callable f35679b;

    /* renamed from: c */
    private final zzfzq f35680c;

    public zzffb(Callable callable, zzfzq zzfzq) {
        this.f35679b = callable;
        this.f35680c = zzfzq;
    }

    /* renamed from: a */
    public final synchronized zzfzp mo45671a() {
        mo45673c(1);
        return (zzfzp) this.f35678a.poll();
    }

    /* renamed from: b */
    public final synchronized void mo45672b(zzfzp zzfzp) {
        this.f35678a.addFirst(zzfzp);
    }

    /* renamed from: c */
    public final synchronized void mo45673c(int i) {
        int size = i - this.f35678a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f35678a.add(this.f35680c.mo46579F(this.f35679b));
        }
    }
}
