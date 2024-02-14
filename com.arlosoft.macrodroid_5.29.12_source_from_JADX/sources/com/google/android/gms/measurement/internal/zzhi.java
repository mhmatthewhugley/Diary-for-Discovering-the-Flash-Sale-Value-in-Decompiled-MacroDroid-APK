package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f46991a;

    /* renamed from: c */
    final /* synthetic */ zzhx f46992c;

    zzhi(zzhx zzhx, AtomicReference atomicReference) {
        this.f46992c = zzhx;
        this.f46991a = atomicReference;
    }

    public final void run() {
        synchronized (this.f46991a) {
            try {
                this.f46991a.set(Boolean.valueOf(this.f46992c.f46899a.mo55219x().mo54919A(this.f46992c.f46899a.mo55184A().mo55063q(), zzdu.f46581L)));
                this.f46991a.notify();
            } catch (Throwable th) {
                this.f46991a.notify();
                throw th;
            }
        }
    }
}
