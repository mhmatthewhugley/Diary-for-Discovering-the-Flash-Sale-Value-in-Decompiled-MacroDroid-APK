package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzfys extends zzfzo {
    private final Executor zza;
    final /* synthetic */ zzfyt zzb;

    zzfys(zzfyt zzfyt, Executor executor) {
        this.zzb = zzfyt;
        Objects.requireNonNull(executor);
        this.zza = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo46607d(Throwable th) {
        zzfys unused = this.zzb.f36596G = null;
        if (th instanceof ExecutionException) {
            this.zzb.mo46081g(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.mo46081g(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo46608e(Object obj) {
        zzfys unused = this.zzb.f36596G = null;
        mo46606h(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo46609f() {
        return this.zzb.isDone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo46606h(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo46610i() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.mo46081g(e);
        }
    }
}
