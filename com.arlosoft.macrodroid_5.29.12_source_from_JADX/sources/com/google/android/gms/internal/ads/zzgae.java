package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgae extends zzfzo {
    final /* synthetic */ zzgaf zza;
    private final Callable zzb;

    zzgae(zzgaf zzgaf, Callable callable) {
        this.zza = zzgaf;
        Objects.requireNonNull(callable);
        this.zzb = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo46604a() throws Exception {
        return this.zzb.call();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo46605b() {
        return this.zzb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo46607d(Throwable th) {
        this.zza.mo46081g(th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo46608e(Object obj) {
        this.zza.mo46080f(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo46609f() {
        return this.zza.isDone();
    }
}
