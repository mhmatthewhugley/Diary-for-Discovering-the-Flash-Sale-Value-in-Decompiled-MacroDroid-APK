package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzb extends CancellationToken {

    /* renamed from: a */
    private final zzw f48010a = new zzw();

    zzb() {
    }

    /* renamed from: a */
    public final boolean mo56132a() {
        return this.f48010a.mo23718s();
    }

    /* renamed from: b */
    public final CancellationToken mo56133b(@NonNull OnTokenCanceledListener onTokenCanceledListener) {
        this.f48010a.mo23709j(TaskExecutors.f47996a, new zza(this, onTokenCanceledListener));
        return this;
    }

    /* renamed from: c */
    public final void mo56144c() {
        this.f48010a.mo56159A((Object) null);
    }
}
