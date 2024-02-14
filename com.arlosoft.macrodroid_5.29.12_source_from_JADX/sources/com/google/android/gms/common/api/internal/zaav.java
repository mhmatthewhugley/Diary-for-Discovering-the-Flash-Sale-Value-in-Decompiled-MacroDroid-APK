package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
abstract class zaav implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zaaw f3288a;

    /* synthetic */ zaav(zaaw zaaw, zaau zaau) {
        this.f3288a = zaaw;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public abstract void mo21445a();

    @WorkerThread
    public final void run() {
        Lock z;
        this.f3288a.f3290b.lock();
        try {
            if (Thread.interrupted()) {
                z = this.f3288a.f3290b;
            } else {
                mo21445a();
                z = this.f3288a.f3290b;
            }
        } catch (RuntimeException e) {
            this.f3288a.f3289a.mo21463r(e);
            z = this.f3288a.f3290b;
        } catch (Throwable th) {
            this.f3288a.f3290b.unlock();
            throw th;
        }
        z.unlock();
    }
}
