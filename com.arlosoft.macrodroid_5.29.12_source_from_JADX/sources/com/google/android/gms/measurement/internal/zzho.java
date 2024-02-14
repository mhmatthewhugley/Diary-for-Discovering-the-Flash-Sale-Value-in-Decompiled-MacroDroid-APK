package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzho implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f47005a;

    /* renamed from: c */
    final /* synthetic */ zzhx f47006c;

    zzho(zzhx zzhx, AtomicReference atomicReference) {
        this.f47006c = zzhx;
        this.f47005a = atomicReference;
    }

    public final void run() {
        synchronized (this.f47005a) {
            try {
                this.f47005a.set(Integer.valueOf(this.f47006c.f46899a.mo55219x().mo54930m(this.f47006c.f46899a.mo55184A().mo55063q(), zzdu.f46584O)));
                this.f47005a.notify();
            } catch (Throwable th) {
                this.f47005a.notify();
                throw th;
            }
        }
    }
}
