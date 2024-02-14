package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhe implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f46981a;

    /* renamed from: c */
    final /* synthetic */ zzhx f46982c;

    zzhe(zzhx zzhx, long j) {
        this.f46982c = zzhx;
        this.f46981a = j;
    }

    public final void run() {
        this.f46982c.mo55380x(this.f46981a, true);
        this.f46982c.f46899a.mo55194L().mo55449S(new AtomicReference());
    }
}
