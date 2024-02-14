package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfzf {

    /* renamed from: a */
    private final boolean f36603a;

    /* renamed from: b */
    private final zzfvn f36604b;

    /* synthetic */ zzfzf(boolean z, zzfvn zzfvn, zzfzd zzfzd) {
        this.f36603a = z;
        this.f36604b = zzfvn;
    }

    /* renamed from: a */
    public final zzfzp mo46623a(Callable callable, Executor executor) {
        return new zzfyt(this.f36604b, this.f36603a, executor, callable);
    }
}
