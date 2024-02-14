package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzby;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
abstract class zzap {

    /* renamed from: d */
    private static volatile Handler f46450d;

    /* renamed from: a */
    private final zzgm f46451a;

    /* renamed from: b */
    private final Runnable f46452b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile long f46453c;

    zzap(zzgm zzgm) {
        Preconditions.m4488k(zzgm);
        this.f46451a = zzgm;
        this.f46452b = new zzao(this, zzgm);
    }

    /* renamed from: f */
    private final Handler m65449f() {
        Handler handler;
        if (f46450d != null) {
            return f46450d;
        }
        synchronized (zzap.class) {
            if (f46450d == null) {
                f46450d = new zzby(this.f46451a.mo55202c().getMainLooper());
            }
            handler = f46450d;
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo54996b() {
        this.f46453c = 0;
        m65449f().removeCallbacks(this.f46452b);
    }

    /* renamed from: c */
    public abstract void mo54997c();

    /* renamed from: d */
    public final void mo54998d(long j) {
        mo54996b();
        if (j >= 0) {
            this.f46453c = this.f46451a.mo55201a().mo21950a();
            if (!m65449f().postDelayed(this.f46452b, j)) {
                this.f46451a.mo55221z().mo55098p().mo55092b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo54999e() {
        return this.f46453c != 0;
    }
}
