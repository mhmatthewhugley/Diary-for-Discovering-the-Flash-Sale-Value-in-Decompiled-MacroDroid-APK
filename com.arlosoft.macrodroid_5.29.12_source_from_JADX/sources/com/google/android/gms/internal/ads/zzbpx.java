package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbpx {

    /* renamed from: a */
    private boolean f27630a = false;

    /* renamed from: b */
    private boolean f27631b = false;

    /* renamed from: c */
    private float f27632c = 0.0f;

    /* renamed from: d */
    private final AtomicBoolean f27633d = new AtomicBoolean(false);

    /* renamed from: a */
    public final synchronized float mo42870a() {
        return this.f27632c;
    }

    /* renamed from: b */
    public final synchronized void mo42871b(boolean z, float f) {
        this.f27631b = z;
        this.f27632c = f;
    }

    /* renamed from: c */
    public final synchronized void mo42872c(boolean z) {
        this.f27630a = z;
        this.f27633d.set(true);
    }

    /* renamed from: d */
    public final synchronized boolean mo42873d() {
        return this.f27631b;
    }

    /* renamed from: e */
    public final synchronized boolean mo42874e(boolean z) {
        if (!this.f27633d.get()) {
            return z;
        }
        return this.f27630a;
    }
}
