package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzd implements zzq {

    /* renamed from: a */
    private final Executor f48013a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Continuation f48014b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzw f48015c;

    public zzd(@NonNull Executor executor, @NonNull Continuation continuation, @NonNull zzw zzw) {
        this.f48013a = executor;
        this.f48014b = continuation;
        this.f48015c = zzw;
    }

    /* renamed from: a */
    public final void mo56146a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void mo56147e(@NonNull Task task) {
        this.f48013a.execute(new zzc(this, task));
    }
}
