package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzf<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, zzq {

    /* renamed from: a */
    private final Executor f48018a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Continuation f48019b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzw f48020c;

    public zzf(@NonNull Executor executor, @NonNull Continuation continuation, @NonNull zzw zzw) {
        this.f48018a = executor;
        this.f48019b = continuation;
        this.f48020c = zzw;
    }

    /* renamed from: a */
    public final void mo56146a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo22751b(TContinuationResult tcontinuationresult) {
        this.f48020c.mo56161x(tcontinuationresult);
    }

    /* renamed from: c */
    public final void mo22733c(@NonNull Exception exc) {
        this.f48020c.mo56160w(exc);
    }

    /* renamed from: d */
    public final void mo30644d() {
        this.f48020c.mo56162y();
    }

    /* renamed from: e */
    public final void mo56147e(@NonNull Task task) {
        this.f48018a.execute(new zze(this, task));
    }
}
