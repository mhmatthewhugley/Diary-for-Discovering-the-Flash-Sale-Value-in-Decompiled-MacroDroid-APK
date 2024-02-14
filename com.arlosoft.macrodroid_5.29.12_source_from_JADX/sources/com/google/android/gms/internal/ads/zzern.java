package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzern {

    /* renamed from: a */
    public final zzfzp f34789a;

    /* renamed from: b */
    private final long f34790b;

    /* renamed from: c */
    private final Clock f34791c;

    public zzern(zzfzp zzfzp, long j, Clock clock) {
        this.f34789a = zzfzp;
        this.f34791c = clock;
        this.f34790b = clock.mo21952c() + j;
    }

    /* renamed from: a */
    public final boolean mo45447a() {
        return this.f34790b < this.f34791c.mo21952c();
    }
}
