package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f47001a;

    /* renamed from: c */
    final /* synthetic */ zzhx f47002c;

    zzhm(zzhx zzhx, AtomicReference atomicReference) {
        this.f47002c = zzhx;
        this.f47001a = atomicReference;
    }

    public final void run() {
        synchronized (this.f47001a) {
            try {
                this.f47001a.set(this.f47002c.f46899a.mo55219x().mo54939v(this.f47002c.f46899a.mo55184A().mo55063q(), zzdu.f46582M));
                this.f47001a.notify();
            } catch (Throwable th) {
                this.f47001a.notify();
                throw th;
            }
        }
    }
}
