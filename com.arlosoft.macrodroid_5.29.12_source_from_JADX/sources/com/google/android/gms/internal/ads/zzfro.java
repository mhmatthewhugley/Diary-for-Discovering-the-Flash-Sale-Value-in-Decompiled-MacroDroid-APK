package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzfro implements Runnable {
    @Nullable

    /* renamed from: a */
    private final TaskCompletionSource f36304a;

    zzfro() {
        this.f36304a = null;
    }

    public zzfro(@Nullable TaskCompletionSource taskCompletionSource) {
        this.f36304a = taskCompletionSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo46131a();

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public final TaskCompletionSource mo46145b() {
        return this.f36304a;
    }

    /* renamed from: c */
    public final void mo46146c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f36304a;
        if (taskCompletionSource != null) {
            taskCompletionSource.mo56140d(exc);
        }
    }

    public final void run() {
        try {
            mo46131a();
        } catch (Exception e) {
            mo46146c(e);
        }
    }
}
