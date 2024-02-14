package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzp<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, zzq {

    /* renamed from: a */
    private final Executor f48042a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final SuccessContinuation f48043b;

    /* renamed from: c */
    private final zzw f48044c;

    public zzp(@NonNull Executor executor, @NonNull SuccessContinuation successContinuation, @NonNull zzw zzw) {
        this.f48042a = executor;
        this.f48043b = successContinuation;
        this.f48044c = zzw;
    }

    /* renamed from: a */
    public final void mo56146a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo22751b(TContinuationResult tcontinuationresult) {
        this.f48044c.mo56161x(tcontinuationresult);
    }

    /* renamed from: c */
    public final void mo22733c(@NonNull Exception exc) {
        this.f48044c.mo56160w(exc);
    }

    /* renamed from: d */
    public final void mo30644d() {
        this.f48044c.mo56162y();
    }

    /* renamed from: e */
    public final void mo56147e(@NonNull Task task) {
        this.f48042a.execute(new zzo(this, task));
    }
}
