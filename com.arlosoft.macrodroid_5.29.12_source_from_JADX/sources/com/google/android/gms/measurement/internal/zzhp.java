package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f47007a;

    /* renamed from: c */
    final /* synthetic */ zzhx f47008c;

    zzhp(zzhx zzhx, AtomicReference atomicReference) {
        this.f47008c = zzhx;
        this.f47007a = atomicReference;
    }

    public final void run() {
        synchronized (this.f47007a) {
            try {
                this.f47007a.set(Double.valueOf(this.f47008c.f46899a.mo55219x().mo54926i(this.f47008c.f46899a.mo55184A().mo55063q(), zzdu.f46585P)));
                this.f47007a.notify();
            } catch (Throwable th) {
                this.f47007a.notify();
                throw th;
            }
        }
    }
}
