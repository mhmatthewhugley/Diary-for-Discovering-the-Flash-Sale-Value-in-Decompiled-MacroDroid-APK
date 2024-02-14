package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zav implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zaaa f3484a;

    zav(zaaa zaaa) {
        this.f3484a = zaaa;
    }

    public final void run() {
        this.f3484a.f3247D.lock();
        try {
            zaaa.m3884A(this.f3484a);
        } finally {
            this.f3484a.f3247D.unlock();
        }
    }
}
