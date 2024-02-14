package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
abstract class zabg {

    /* renamed from: a */
    private final zabf f3346a;

    protected zabg(zabf zabf) {
        this.f3346a = zabf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo21433a();

    /* renamed from: b */
    public final void mo21456b(zabi zabi) {
        Lock m;
        zabi.f3354a.lock();
        try {
            if (zabi.f3349B != this.f3346a) {
                m = zabi.f3354a;
            } else {
                mo21433a();
                m = zabi.f3354a;
            }
            m.unlock();
        } catch (Throwable th) {
            zabi.f3354a.unlock();
            throw th;
        }
    }
}
