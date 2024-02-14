package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgad extends zzfzo {
    final /* synthetic */ zzgaf zza;
    private final zzfym zzb;

    zzgad(zzgaf zzgaf, zzfym zzfym) {
        this.zza = zzgaf;
        Objects.requireNonNull(zzfym);
        this.zzb = zzfym;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo46604a() throws Exception {
        zzfzp zza2 = this.zzb.zza();
        zzfsx.m50939d(zza2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return zza2;
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
    public final /* synthetic */ void mo46608e(Object obj) {
        this.zza.mo46564v((zzfzp) obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo46609f() {
        return this.zza.isDone();
    }
}
