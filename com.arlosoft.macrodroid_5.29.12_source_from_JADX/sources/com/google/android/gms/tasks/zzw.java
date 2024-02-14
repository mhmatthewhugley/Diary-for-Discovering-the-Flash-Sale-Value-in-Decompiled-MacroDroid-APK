package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzw<TResult> extends Task<TResult> {

    /* renamed from: a */
    private final Object f48051a = new Object();

    /* renamed from: b */
    private final zzr f48052b = new zzr();

    /* renamed from: c */
    private boolean f48053c;

    /* renamed from: d */
    private volatile boolean f48054d;
    @Nullable

    /* renamed from: e */
    private Object f48055e;

    /* renamed from: f */
    private Exception f48056f;

    zzw() {
    }

    /* renamed from: B */
    private final void m66731B() {
        Preconditions.m4494q(this.f48053c, "Task is not yet complete");
    }

    /* renamed from: C */
    private final void m66732C() {
        if (this.f48054d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: D */
    private final void m66733D() {
        if (this.f48053c) {
            throw DuplicateTaskCompletionException.m66626a(this);
        }
    }

    /* renamed from: E */
    private final void m66734E() {
        synchronized (this.f48051a) {
            if (this.f48053c) {
                this.f48052b.mo56155b(this);
            }
        }
    }

    /* renamed from: A */
    public final boolean mo56159A(@Nullable Object obj) {
        synchronized (this.f48051a) {
            if (this.f48053c) {
                return false;
            }
            this.f48053c = true;
            this.f48055e = obj;
            this.f48052b.mo56155b(this);
            return true;
        }
    }

    @NonNull
    /* renamed from: a */
    public final Task<TResult> mo23700a(@NonNull OnCanceledListener onCanceledListener) {
        mo23701b(TaskExecutors.f47996a, onCanceledListener);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public final Task<TResult> mo23701b(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        this.f48052b.mo56154a(new zzh(executor, onCanceledListener));
        m66734E();
        return this;
    }

    @NonNull
    /* renamed from: c */
    public final Task<TResult> mo23702c(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f48052b.mo56154a(new zzj(TaskExecutors.f47996a, onCompleteListener));
        m66734E();
        return this;
    }

    @NonNull
    /* renamed from: d */
    public final Task<TResult> mo23703d(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f48052b.mo56154a(new zzj(executor, onCompleteListener));
        m66734E();
        return this;
    }

    @NonNull
    /* renamed from: e */
    public final Task<TResult> mo23704e(@NonNull Activity activity, @NonNull OnFailureListener onFailureListener) {
        zzl zzl = new zzl(TaskExecutors.f47996a, onFailureListener);
        this.f48052b.mo56154a(zzl);
        zzv.m66728l(activity).mo56158m(zzl);
        m66734E();
        return this;
    }

    @NonNull
    /* renamed from: f */
    public final Task<TResult> mo23705f(@NonNull OnFailureListener onFailureListener) {
        mo23706g(TaskExecutors.f47996a, onFailureListener);
        return this;
    }

    @NonNull
    /* renamed from: g */
    public final Task<TResult> mo23706g(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.f48052b.mo56154a(new zzl(executor, onFailureListener));
        m66734E();
        return this;
    }

    @NonNull
    /* renamed from: h */
    public final Task<TResult> mo23707h(@NonNull Activity activity, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        zzn zzn = new zzn(TaskExecutors.f47996a, onSuccessListener);
        this.f48052b.mo56154a(zzn);
        zzv.m66728l(activity).mo56158m(zzn);
        m66734E();
        return this;
    }

    @NonNull
    /* renamed from: i */
    public final Task<TResult> mo23708i(@NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        mo23709j(TaskExecutors.f47996a, onSuccessListener);
        return this;
    }

    @NonNull
    /* renamed from: j */
    public final Task<TResult> mo23709j(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        this.f48052b.mo56154a(new zzn(executor, onSuccessListener));
        m66734E();
        return this;
    }

    @NonNull
    /* renamed from: k */
    public final <TContinuationResult> Task<TContinuationResult> mo23710k(@NonNull Continuation<TResult, TContinuationResult> continuation) {
        return mo23711l(TaskExecutors.f47996a, continuation);
    }

    @NonNull
    /* renamed from: l */
    public final <TContinuationResult> Task<TContinuationResult> mo23711l(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation) {
        zzw zzw = new zzw();
        this.f48052b.mo56154a(new zzd(executor, continuation, zzw));
        m66734E();
        return zzw;
    }

    @NonNull
    /* renamed from: m */
    public final <TContinuationResult> Task<TContinuationResult> mo23712m(@NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        return mo23713n(TaskExecutors.f47996a, continuation);
    }

    @NonNull
    /* renamed from: n */
    public final <TContinuationResult> Task<TContinuationResult> mo23713n(@NonNull Executor executor, @NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        zzw zzw = new zzw();
        this.f48052b.mo56154a(new zzf(executor, continuation, zzw));
        m66734E();
        return zzw;
    }

    @Nullable
    /* renamed from: o */
    public final Exception mo23714o() {
        Exception exc;
        synchronized (this.f48051a) {
            exc = this.f48056f;
        }
        return exc;
    }

    /* renamed from: p */
    public final TResult mo23715p() {
        TResult tresult;
        synchronized (this.f48051a) {
            m66731B();
            m66732C();
            Exception exc = this.f48056f;
            if (exc == null) {
                tresult = this.f48055e;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return tresult;
    }

    /* renamed from: q */
    public final <X extends Throwable> TResult mo23716q(@NonNull Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f48051a) {
            m66731B();
            m66732C();
            if (!cls.isInstance(this.f48056f)) {
                Exception exc = this.f48056f;
                if (exc == null) {
                    tresult = this.f48055e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f48056f));
            }
        }
        return tresult;
    }

    /* renamed from: r */
    public final boolean mo23717r() {
        return this.f48054d;
    }

    /* renamed from: s */
    public final boolean mo23718s() {
        boolean z;
        synchronized (this.f48051a) {
            z = this.f48053c;
        }
        return z;
    }

    /* renamed from: t */
    public final boolean mo23719t() {
        boolean z;
        synchronized (this.f48051a) {
            z = false;
            if (this.f48053c && !this.f48054d && this.f48056f == null) {
                z = true;
            }
        }
        return z;
    }

    @NonNull
    /* renamed from: u */
    public final <TContinuationResult> Task<TContinuationResult> mo23720u(@NonNull SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        Executor executor = TaskExecutors.f47996a;
        zzw zzw = new zzw();
        this.f48052b.mo56154a(new zzp(executor, successContinuation, zzw));
        m66734E();
        return zzw;
    }

    @NonNull
    /* renamed from: v */
    public final <TContinuationResult> Task<TContinuationResult> mo23721v(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        zzw zzw = new zzw();
        this.f48052b.mo56154a(new zzp(executor, successContinuation, zzw));
        m66734E();
        return zzw;
    }

    /* renamed from: w */
    public final void mo56160w(@NonNull Exception exc) {
        Preconditions.m4489l(exc, "Exception must not be null");
        synchronized (this.f48051a) {
            m66733D();
            this.f48053c = true;
            this.f48056f = exc;
        }
        this.f48052b.mo56155b(this);
    }

    /* renamed from: x */
    public final void mo56161x(@Nullable Object obj) {
        synchronized (this.f48051a) {
            m66733D();
            this.f48053c = true;
            this.f48055e = obj;
        }
        this.f48052b.mo56155b(this);
    }

    /* renamed from: y */
    public final boolean mo56162y() {
        synchronized (this.f48051a) {
            if (this.f48053c) {
                return false;
            }
            this.f48053c = true;
            this.f48054d = true;
            this.f48052b.mo56155b(this);
            return true;
        }
    }

    /* renamed from: z */
    public final boolean mo56163z(@NonNull Exception exc) {
        Preconditions.m4489l(exc, "Exception must not be null");
        synchronized (this.f48051a) {
            if (this.f48053c) {
                return false;
            }
            this.f48053c = true;
            this.f48056f = exc;
            this.f48052b.mo56155b(this);
            return true;
        }
    }
}
