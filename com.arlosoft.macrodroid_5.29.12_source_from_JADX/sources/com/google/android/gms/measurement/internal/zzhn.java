package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f47003a;

    /* renamed from: c */
    final /* synthetic */ zzhx f47004c;

    zzhn(zzhx zzhx, AtomicReference atomicReference) {
        this.f47004c = zzhx;
        this.f47003a = atomicReference;
    }

    public final void run() {
        synchronized (this.f47003a) {
            try {
                this.f47003a.set(Long.valueOf(this.f47004c.f46899a.mo55219x().mo54933p(this.f47004c.f46899a.mo55184A().mo55063q(), zzdu.f46583N)));
                this.f47003a.notify();
            } catch (Throwable th) {
                this.f47003a.notify();
                throw th;
            }
        }
    }
}
