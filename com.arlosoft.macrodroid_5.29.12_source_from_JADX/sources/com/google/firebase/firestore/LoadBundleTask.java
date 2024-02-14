package com.google.firebase.firestore;

import android.app.Activity;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.firestore.LoadBundleTaskProgress;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

public class LoadBundleTask extends Task<LoadBundleTaskProgress> {

    /* renamed from: a */
    private final Object f5705a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    private LoadBundleTaskProgress f5706b = LoadBundleTaskProgress.f5716g;

    /* renamed from: c */
    private final TaskCompletionSource<LoadBundleTaskProgress> f5707c;

    /* renamed from: d */
    private final Task<LoadBundleTaskProgress> f5708d;
    @GuardedBy("lock")

    /* renamed from: e */
    private final Queue<ManagedListener> f5709e;

    private static class ManagedListener {

        /* renamed from: a */
        Executor f5710a;

        /* renamed from: b */
        OnProgressListener<LoadBundleTaskProgress> f5711b;

        ManagedListener(@Nullable Executor executor, OnProgressListener<LoadBundleTaskProgress> onProgressListener) {
            this.f5710a = executor == null ? TaskExecutors.f47996a : executor;
            this.f5711b = onProgressListener;
        }

        /* renamed from: a */
        public void mo23724a(LoadBundleTaskProgress loadBundleTaskProgress) {
            this.f5710a.execute(LoadBundleTask$ManagedListener$$Lambda$1.m7903a(this, loadBundleTaskProgress));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f5711b.equals(((ManagedListener) obj).f5711b);
        }

        public int hashCode() {
            return this.f5711b.hashCode();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public LoadBundleTask() {
        TaskCompletionSource<LoadBundleTaskProgress> taskCompletionSource = new TaskCompletionSource<>();
        this.f5707c = taskCompletionSource;
        this.f5708d = taskCompletionSource.mo56137a();
        this.f5709e = new ArrayDeque();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m7873z(@NonNull OnProgressListener<LoadBundleTaskProgress> onProgressListener) {
        synchronized (this.f5705a) {
            this.f5709e.remove(new ManagedListener((Executor) null, onProgressListener));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: A */
    public void mo23697A(@NonNull Exception exc) {
        synchronized (this.f5705a) {
            LoadBundleTaskProgress loadBundleTaskProgress = new LoadBundleTaskProgress(this.f5706b.mo23730d(), this.f5706b.mo23734g(), this.f5706b.mo23729c(), this.f5706b.mo23733f(), exc, LoadBundleTaskProgress.TaskState.ERROR);
            this.f5706b = loadBundleTaskProgress;
            for (ManagedListener a : this.f5709e) {
                a.mo23724a(loadBundleTaskProgress);
            }
            this.f5709e.clear();
        }
        this.f5707c.mo56138b(exc);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: B */
    public void mo23698B(@NonNull LoadBundleTaskProgress loadBundleTaskProgress) {
        boolean equals = loadBundleTaskProgress.mo23731e().equals(LoadBundleTaskProgress.TaskState.SUCCESS);
        Assert.m76443d(equals, "Expected success, but was " + loadBundleTaskProgress.mo23731e(), new Object[0]);
        synchronized (this.f5705a) {
            this.f5706b = loadBundleTaskProgress;
            for (ManagedListener a : this.f5709e) {
                a.mo23724a(this.f5706b);
            }
            this.f5709e.clear();
        }
        this.f5707c.mo56139c(loadBundleTaskProgress);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: C */
    public void mo23699C(@NonNull LoadBundleTaskProgress loadBundleTaskProgress) {
        synchronized (this.f5705a) {
            this.f5706b = loadBundleTaskProgress;
            for (ManagedListener a : this.f5709e) {
                a.mo23724a(loadBundleTaskProgress);
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public Task<LoadBundleTaskProgress> mo23700a(@NonNull OnCanceledListener onCanceledListener) {
        return this.f5708d.mo23700a(onCanceledListener);
    }

    @NonNull
    /* renamed from: b */
    public Task<LoadBundleTaskProgress> mo23701b(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        return this.f5708d.mo23701b(executor, onCanceledListener);
    }

    @NonNull
    /* renamed from: c */
    public Task<LoadBundleTaskProgress> mo23702c(@NonNull OnCompleteListener<LoadBundleTaskProgress> onCompleteListener) {
        return this.f5708d.mo23702c(onCompleteListener);
    }

    @NonNull
    /* renamed from: d */
    public Task<LoadBundleTaskProgress> mo23703d(@NonNull Executor executor, @NonNull OnCompleteListener<LoadBundleTaskProgress> onCompleteListener) {
        return this.f5708d.mo23703d(executor, onCompleteListener);
    }

    @NonNull
    /* renamed from: e */
    public Task<LoadBundleTaskProgress> mo23704e(@NonNull Activity activity, @NonNull OnFailureListener onFailureListener) {
        return this.f5708d.mo23704e(activity, onFailureListener);
    }

    @NonNull
    /* renamed from: f */
    public Task<LoadBundleTaskProgress> mo23705f(@NonNull OnFailureListener onFailureListener) {
        return this.f5708d.mo23705f(onFailureListener);
    }

    @NonNull
    /* renamed from: g */
    public Task<LoadBundleTaskProgress> mo23706g(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        return this.f5708d.mo23706g(executor, onFailureListener);
    }

    @NonNull
    /* renamed from: h */
    public Task<LoadBundleTaskProgress> mo23707h(@NonNull Activity activity, @NonNull OnSuccessListener<? super LoadBundleTaskProgress> onSuccessListener) {
        return this.f5708d.mo23707h(activity, onSuccessListener);
    }

    @NonNull
    /* renamed from: i */
    public Task<LoadBundleTaskProgress> mo23708i(@NonNull OnSuccessListener<? super LoadBundleTaskProgress> onSuccessListener) {
        return this.f5708d.mo23708i(onSuccessListener);
    }

    @NonNull
    /* renamed from: j */
    public Task<LoadBundleTaskProgress> mo23709j(@NonNull Executor executor, @NonNull OnSuccessListener<? super LoadBundleTaskProgress> onSuccessListener) {
        return this.f5708d.mo23709j(executor, onSuccessListener);
    }

    @NonNull
    /* renamed from: k */
    public <TContinuationResult> Task<TContinuationResult> mo23710k(@NonNull Continuation<LoadBundleTaskProgress, TContinuationResult> continuation) {
        return this.f5708d.mo23710k(continuation);
    }

    @NonNull
    /* renamed from: l */
    public <TContinuationResult> Task<TContinuationResult> mo23711l(@NonNull Executor executor, @NonNull Continuation<LoadBundleTaskProgress, TContinuationResult> continuation) {
        return this.f5708d.mo23711l(executor, continuation);
    }

    @NonNull
    /* renamed from: m */
    public <TContinuationResult> Task<TContinuationResult> mo23712m(@NonNull Continuation<LoadBundleTaskProgress, Task<TContinuationResult>> continuation) {
        return this.f5708d.mo23712m(continuation);
    }

    @NonNull
    /* renamed from: n */
    public <TContinuationResult> Task<TContinuationResult> mo23713n(@NonNull Executor executor, @NonNull Continuation<LoadBundleTaskProgress, Task<TContinuationResult>> continuation) {
        return this.f5708d.mo23713n(executor, continuation);
    }

    @Nullable
    /* renamed from: o */
    public Exception mo23714o() {
        return this.f5708d.mo23714o();
    }

    /* renamed from: r */
    public boolean mo23717r() {
        return this.f5708d.mo23717r();
    }

    /* renamed from: s */
    public boolean mo23718s() {
        return this.f5708d.mo23718s();
    }

    /* renamed from: t */
    public boolean mo23719t() {
        return this.f5708d.mo23719t();
    }

    @NonNull
    /* renamed from: u */
    public <TContinuationResult> Task<TContinuationResult> mo23720u(@NonNull SuccessContinuation<LoadBundleTaskProgress, TContinuationResult> successContinuation) {
        return this.f5708d.mo23720u(successContinuation);
    }

    @NonNull
    /* renamed from: v */
    public <TContinuationResult> Task<TContinuationResult> mo23721v(@NonNull Executor executor, @NonNull SuccessContinuation<LoadBundleTaskProgress, TContinuationResult> successContinuation) {
        return this.f5708d.mo23721v(executor, successContinuation);
    }

    @NonNull
    /* renamed from: w */
    public LoadBundleTaskProgress mo23715p() {
        return this.f5708d.mo23715p();
    }

    @NonNull
    /* renamed from: x */
    public <X extends Throwable> LoadBundleTaskProgress mo23716q(@NonNull Class<X> cls) throws Throwable {
        return this.f5708d.mo23716q(cls);
    }
}
