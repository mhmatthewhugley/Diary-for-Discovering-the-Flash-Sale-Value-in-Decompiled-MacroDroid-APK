package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfyr extends zzfys {
    final /* synthetic */ zzfyt zza;
    private final Callable zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfyr(zzfyt zzfyt, Callable callable, Executor executor) {
        super(zzfyt, executor);
        this.zza = zzfyt;
        Objects.requireNonNull(callable);
        this.zzc = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo46604a() throws Exception {
        return this.zzc.call();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo46605b() {
        return this.zzc.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo46606h(Object obj) {
        this.zza.mo46080f(obj);
    }
}
