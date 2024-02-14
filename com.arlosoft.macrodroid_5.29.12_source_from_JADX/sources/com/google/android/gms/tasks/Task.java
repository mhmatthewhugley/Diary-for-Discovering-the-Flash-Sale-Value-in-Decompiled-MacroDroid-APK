package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public abstract class Task<TResult> {
    @NonNull
    /* renamed from: a */
    public Task<TResult> mo23700a(@NonNull OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @NonNull
    /* renamed from: b */
    public Task<TResult> mo23701b(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    /* renamed from: c */
    public Task<TResult> mo23702c(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: d */
    public Task<TResult> mo23703d(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: e */
    public abstract Task<TResult> mo23704e(@NonNull Activity activity, @NonNull OnFailureListener onFailureListener);

    @NonNull
    /* renamed from: f */
    public abstract Task<TResult> mo23705f(@NonNull OnFailureListener onFailureListener);

    @NonNull
    /* renamed from: g */
    public abstract Task<TResult> mo23706g(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener);

    @NonNull
    /* renamed from: h */
    public abstract Task<TResult> mo23707h(@NonNull Activity activity, @NonNull OnSuccessListener<? super TResult> onSuccessListener);

    @NonNull
    /* renamed from: i */
    public abstract Task<TResult> mo23708i(@NonNull OnSuccessListener<? super TResult> onSuccessListener);

    @NonNull
    /* renamed from: j */
    public abstract Task<TResult> mo23709j(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener);

    @NonNull
    /* renamed from: k */
    public <TContinuationResult> Task<TContinuationResult> mo23710k(@NonNull Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: l */
    public <TContinuationResult> Task<TContinuationResult> mo23711l(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: m */
    public <TContinuationResult> Task<TContinuationResult> mo23712m(@NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @NonNull
    /* renamed from: n */
    public <TContinuationResult> Task<TContinuationResult> mo23713n(@NonNull Executor executor, @NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @Nullable
    /* renamed from: o */
    public abstract Exception mo23714o();

    /* renamed from: p */
    public abstract TResult mo23715p();

    /* renamed from: q */
    public abstract <X extends Throwable> TResult mo23716q(@NonNull Class<X> cls) throws Throwable;

    /* renamed from: r */
    public abstract boolean mo23717r();

    /* renamed from: s */
    public abstract boolean mo23718s();

    /* renamed from: t */
    public abstract boolean mo23719t();

    @NonNull
    /* renamed from: u */
    public <TContinuationResult> Task<TContinuationResult> mo23720u(@NonNull SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @NonNull
    /* renamed from: v */
    public <TContinuationResult> Task<TContinuationResult> mo23721v(@NonNull Executor executor, @NonNull SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
