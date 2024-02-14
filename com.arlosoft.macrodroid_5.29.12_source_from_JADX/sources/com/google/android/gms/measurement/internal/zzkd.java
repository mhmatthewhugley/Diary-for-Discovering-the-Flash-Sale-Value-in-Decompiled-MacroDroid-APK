package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzkd {

    /* renamed from: a */
    private final Clock f47221a;

    /* renamed from: b */
    private long f47222b;

    public zzkd(Clock clock) {
        Preconditions.m4488k(clock);
        this.f47221a = clock;
    }

    /* renamed from: a */
    public final void mo55498a() {
        this.f47222b = 0;
    }

    /* renamed from: b */
    public final void mo55499b() {
        this.f47222b = this.f47221a.mo21952c();
    }

    /* renamed from: c */
    public final boolean mo55500c(long j) {
        return this.f47222b == 0 || this.f47221a.mo21952c() - this.f47222b >= 3600000;
    }
}
