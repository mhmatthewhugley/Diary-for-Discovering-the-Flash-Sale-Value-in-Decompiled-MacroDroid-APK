package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f46993a;

    /* renamed from: c */
    final /* synthetic */ String f46994c;

    /* renamed from: d */
    final /* synthetic */ String f46995d;

    /* renamed from: f */
    final /* synthetic */ boolean f46996f;

    /* renamed from: g */
    final /* synthetic */ zzhx f46997g;

    zzhj(zzhx zzhx, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f46997g = zzhx;
        this.f46993a = atomicReference;
        this.f46994c = str2;
        this.f46995d = str3;
        this.f46996f = z;
    }

    public final void run() {
        this.f46997g.f46899a.mo55194L().mo55454X(this.f46993a, (String) null, this.f46994c, this.f46995d, this.f46996f);
    }
}
