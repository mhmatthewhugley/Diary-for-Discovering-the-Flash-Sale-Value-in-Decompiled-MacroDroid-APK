package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgaf extends zzfyw implements RunnableFuture {

    /* renamed from: s */
    private volatile zzfzo f36619s;

    zzgaf(zzfym zzfym) {
        this.f36619s = new zzgad(this, zzfym);
    }

    /* renamed from: D */
    static zzgaf m51461D(Runnable runnable, Object obj) {
        return new zzgaf(Executors.callable(runnable, obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo46078d() {
        zzfzo zzfzo = this.f36619s;
        if (zzfzo == null) {
            return super.mo46078d();
        }
        return "task=[" + zzfzo + "]";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo46079e() {
        zzfzo zzfzo;
        if (mo46565w() && (zzfzo = this.f36619s) != null) {
            zzfzo.mo46633g();
        }
        this.f36619s = null;
    }

    public final void run() {
        zzfzo zzfzo = this.f36619s;
        if (zzfzo != null) {
            zzfzo.run();
        }
        this.f36619s = null;
    }

    zzgaf(Callable callable) {
        this.f36619s = new zzgae(this, callable);
    }
}
