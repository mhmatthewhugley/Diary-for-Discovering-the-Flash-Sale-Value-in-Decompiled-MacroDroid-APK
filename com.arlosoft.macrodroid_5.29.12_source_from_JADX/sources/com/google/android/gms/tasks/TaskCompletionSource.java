package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public class TaskCompletionSource<TResult> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzw f47995a = new zzw();

    public TaskCompletionSource() {
    }

    public TaskCompletionSource(@NonNull CancellationToken cancellationToken) {
        cancellationToken.mo56133b(new zzs(this));
    }

    @NonNull
    /* renamed from: a */
    public Task<TResult> mo56137a() {
        return this.f47995a;
    }

    /* renamed from: b */
    public void mo56138b(@NonNull Exception exc) {
        this.f47995a.mo56160w(exc);
    }

    /* renamed from: c */
    public void mo56139c(@Nullable TResult tresult) {
        this.f47995a.mo56161x(tresult);
    }

    /* renamed from: d */
    public boolean mo56140d(@NonNull Exception exc) {
        return this.f47995a.mo56163z(exc);
    }

    /* renamed from: e */
    public boolean mo56141e(@Nullable TResult tresult) {
        return this.f47995a.mo56159A(tresult);
    }
}
