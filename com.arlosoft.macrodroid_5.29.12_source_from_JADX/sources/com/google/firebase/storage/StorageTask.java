package com.google.firebase.storage;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.StorageTask.ProvideError;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

public abstract class StorageTask<ResultT extends ProvideError> extends ControllableTask<ResultT> {

    /* renamed from: j */
    private static final HashMap<Integer, HashSet<Integer>> f55378j;

    /* renamed from: k */
    private static final HashMap<Integer, HashSet<Integer>> f55379k;

    /* renamed from: a */
    protected final Object f55380a = new Object();
    @VisibleForTesting

    /* renamed from: b */
    final TaskListenerImpl<OnSuccessListener<? super ResultT>, ResultT> f55381b = new TaskListenerImpl<>(this, 128, new C11381n(this));
    @VisibleForTesting

    /* renamed from: c */
    final TaskListenerImpl<OnFailureListener, ResultT> f55382c = new TaskListenerImpl<>(this, 64, new C11380m(this));
    @VisibleForTesting

    /* renamed from: d */
    final TaskListenerImpl<OnCompleteListener<ResultT>, ResultT> f55383d = new TaskListenerImpl<>(this, 448, new C11379l(this));
    @VisibleForTesting

    /* renamed from: e */
    final TaskListenerImpl<OnCanceledListener, ResultT> f55384e = new TaskListenerImpl<>(this, 256, new C11378k(this));
    @VisibleForTesting

    /* renamed from: f */
    final TaskListenerImpl<OnProgressListener<? super ResultT>, ResultT> f55385f = new TaskListenerImpl<>(this, -465, C11371d.f55467a);
    @VisibleForTesting

    /* renamed from: g */
    final TaskListenerImpl<OnPausedListener<? super ResultT>, ResultT> f55386g = new TaskListenerImpl<>(this, 16, C11370c.f55466a);

    /* renamed from: h */
    private volatile int f55387h = 1;

    /* renamed from: i */
    private ResultT f55388i;

    protected interface ProvideError {
        /* renamed from: a */
        Exception mo63671a();
    }

    public class SnapshotBase implements ProvideError {

        /* renamed from: a */
        private final Exception f55389a;

        public SnapshotBase(@Nullable Exception exc) {
            if (exc != null) {
                this.f55389a = exc;
            } else if (StorageTask.this.mo23717r()) {
                this.f55389a = StorageException.m77379c(Status.f3134B);
            } else if (StorageTask.this.mo63656S() == 64) {
                this.f55389a = StorageException.m77379c(Status.f3140z);
            } else {
                this.f55389a = null;
            }
        }

        @Nullable
        /* renamed from: a */
        public Exception mo63671a() {
            return this.f55389a;
        }
    }

    static {
        HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();
        f55378j = hashMap;
        HashMap<Integer, HashSet<Integer>> hashMap2 = new HashMap<>();
        f55379k = hashMap2;
        hashMap.put(1, new HashSet(Arrays.asList(new Integer[]{16, 256})));
        hashMap.put(2, new HashSet(Arrays.asList(new Integer[]{8, 32})));
        hashMap.put(4, new HashSet(Arrays.asList(new Integer[]{8, 32})));
        hashMap.put(16, new HashSet(Arrays.asList(new Integer[]{2, 256})));
        hashMap.put(64, new HashSet(Arrays.asList(new Integer[]{2, 256})));
        hashMap2.put(1, new HashSet(Arrays.asList(new Integer[]{2, 64})));
        hashMap2.put(2, new HashSet(Arrays.asList(new Integer[]{4, 64, 128})));
        hashMap2.put(4, new HashSet(Arrays.asList(new Integer[]{4, 64, 128})));
        hashMap2.put(8, new HashSet(Arrays.asList(new Integer[]{16, 64, 128})));
        hashMap2.put(32, new HashSet(Arrays.asList(new Integer[]{256, 64, 128})));
    }

    protected StorageTask() {
    }

    @NonNull
    /* renamed from: O */
    private <ContinuationResultT> Task<ContinuationResultT> m77444O(@Nullable Executor executor, @NonNull Continuation<ResultT, ContinuationResultT> continuation) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f55383d.mo63691d((Activity) null, executor, new C11373f(this, continuation, taskCompletionSource));
        return taskCompletionSource.mo56137a();
    }

    @NonNull
    /* renamed from: P */
    private <ContinuationResultT> Task<ContinuationResultT> m77445P(@Nullable Executor executor, @NonNull Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.mo56135b());
        this.f55383d.mo63691d((Activity) null, executor, new C11374g(this, continuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.mo56137a();
    }

    /* renamed from: Q */
    private void m77446Q() {
        if (!mo23718s() && !mo63661a0() && mo63656S() != 2 && !mo63669v0(256, false)) {
            mo63669v0(64, false);
        }
    }

    /* renamed from: R */
    private ResultT m77447R() {
        ResultT resultt = this.f55388i;
        if (resultt != null) {
            return resultt;
        }
        if (!mo23718s()) {
            return null;
        }
        if (this.f55388i == null) {
            this.f55388i = mo63668s0();
        }
        return this.f55388i;
    }

    /* renamed from: W */
    private String m77448W(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? i != 64 ? i != 128 ? i != 256 ? "Unknown Internal State!" : "INTERNAL_STATE_CANCELED" : "INTERNAL_STATE_SUCCESS" : "INTERNAL_STATE_FAILURE" : "INTERNAL_STATE_CANCELING" : "INTERNAL_STATE_PAUSED" : "INTERNAL_STATE_PAUSING" : "INTERNAL_STATE_IN_PROGRESS" : "INTERNAL_STATE_QUEUED" : "INTERNAL_STATE_NOT_STARTED";
    }

    /* renamed from: X */
    private String m77449X(int[] iArr) {
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int W : iArr) {
            sb.append(m77448W(W));
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m77450b0(Continuation continuation, TaskCompletionSource taskCompletionSource, Task task) {
        try {
            Object a = continuation.mo21119a(this);
            if (!taskCompletionSource.mo56137a().mo23718s()) {
                taskCompletionSource.mo56139c(a);
            }
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                taskCompletionSource.mo56138b((Exception) e.getCause());
            } else {
                taskCompletionSource.mo56138b(e);
            }
        } catch (Exception e2) {
            taskCompletionSource.mo56138b(e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m77451c0(Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, Task task) {
        try {
            Task task2 = (Task) continuation.mo21119a(this);
            if (taskCompletionSource.mo56137a().mo23718s()) {
                return;
            }
            if (task2 == null) {
                taskCompletionSource.mo56138b(new NullPointerException("Continuation returned null"));
                return;
            }
            task2.mo23708i(new C11377j(taskCompletionSource));
            task2.mo23705f(new C11375h(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            task2.mo23700a(new C11369b(cancellationTokenSource));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                taskCompletionSource.mo56138b((Exception) e.getCause());
            } else {
                taskCompletionSource.mo56138b(e);
            }
        } catch (Exception e2) {
            taskCompletionSource.mo56138b(e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m77452d0() {
        try {
            mo63587q0();
        } finally {
            m77446Q();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m77453e0(OnSuccessListener onSuccessListener, ProvideError provideError) {
        StorageTaskManager.m77517b().mo63673c(this);
        onSuccessListener.mo22751b(provideError);
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m77454f0(OnFailureListener onFailureListener, ProvideError provideError) {
        StorageTaskManager.m77517b().mo63673c(this);
        onFailureListener.mo22733c(provideError.mo63671a());
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ void m77455g0(OnCompleteListener onCompleteListener, ProvideError provideError) {
        StorageTaskManager.m77517b().mo63673c(this);
        onCompleteListener.mo21120a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m77456h0(OnCanceledListener onCanceledListener, ProvideError provideError) {
        StorageTaskManager.m77517b().mo63673c(this);
        onCanceledListener.mo30644d();
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public static /* synthetic */ void m77457i0(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, ProvideError provideError) {
        try {
            Task a = successContinuation.mo21121a(provideError);
            Objects.requireNonNull(taskCompletionSource);
            a.mo23708i(new C11377j(taskCompletionSource));
            a.mo23705f(new C11375h(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            a.mo23700a(new C11369b(cancellationTokenSource));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                taskCompletionSource.mo56138b((Exception) e.getCause());
            } else {
                taskCompletionSource.mo56138b(e);
            }
        } catch (Exception e2) {
            taskCompletionSource.mo56138b(e2);
        }
    }

    @NonNull
    /* renamed from: u0 */
    private <ContinuationResultT> Task<ContinuationResultT> m77458u0(@Nullable Executor executor, @NonNull SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.mo56135b());
        this.f55381b.mo63691d((Activity) null, executor, new C11376i(successContinuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.mo56137a();
    }

    @NonNull
    /* renamed from: E */
    public StorageTask<ResultT> mo23700a(@NonNull OnCanceledListener onCanceledListener) {
        Preconditions.m4488k(onCanceledListener);
        this.f55384e.mo63691d((Activity) null, (Executor) null, onCanceledListener);
        return this;
    }

    @NonNull
    /* renamed from: F */
    public StorageTask<ResultT> mo23701b(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        Preconditions.m4488k(onCanceledListener);
        Preconditions.m4488k(executor);
        this.f55384e.mo63691d((Activity) null, executor, onCanceledListener);
        return this;
    }

    @NonNull
    /* renamed from: G */
    public StorageTask<ResultT> mo23702c(@NonNull OnCompleteListener<ResultT> onCompleteListener) {
        Preconditions.m4488k(onCompleteListener);
        this.f55383d.mo63691d((Activity) null, (Executor) null, onCompleteListener);
        return this;
    }

    @NonNull
    /* renamed from: H */
    public StorageTask<ResultT> mo23703d(@NonNull Executor executor, @NonNull OnCompleteListener<ResultT> onCompleteListener) {
        Preconditions.m4488k(onCompleteListener);
        Preconditions.m4488k(executor);
        this.f55383d.mo63691d((Activity) null, executor, onCompleteListener);
        return this;
    }

    @NonNull
    /* renamed from: I */
    public StorageTask<ResultT> mo23704e(@NonNull Activity activity, @NonNull OnFailureListener onFailureListener) {
        Preconditions.m4488k(onFailureListener);
        Preconditions.m4488k(activity);
        this.f55382c.mo63691d(activity, (Executor) null, onFailureListener);
        return this;
    }

    @NonNull
    /* renamed from: J */
    public StorageTask<ResultT> mo23705f(@NonNull OnFailureListener onFailureListener) {
        Preconditions.m4488k(onFailureListener);
        this.f55382c.mo63691d((Activity) null, (Executor) null, onFailureListener);
        return this;
    }

    @NonNull
    /* renamed from: K */
    public StorageTask<ResultT> mo23706g(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        Preconditions.m4488k(onFailureListener);
        Preconditions.m4488k(executor);
        this.f55382c.mo63691d((Activity) null, executor, onFailureListener);
        return this;
    }

    @NonNull
    /* renamed from: L */
    public StorageTask<ResultT> mo23707h(@NonNull Activity activity, @NonNull OnSuccessListener<? super ResultT> onSuccessListener) {
        Preconditions.m4488k(activity);
        Preconditions.m4488k(onSuccessListener);
        this.f55381b.mo63691d(activity, (Executor) null, onSuccessListener);
        return this;
    }

    @NonNull
    /* renamed from: M */
    public StorageTask<ResultT> mo23708i(@NonNull OnSuccessListener<? super ResultT> onSuccessListener) {
        Preconditions.m4488k(onSuccessListener);
        this.f55381b.mo63691d((Activity) null, (Executor) null, onSuccessListener);
        return this;
    }

    @NonNull
    /* renamed from: N */
    public StorageTask<ResultT> mo23709j(@NonNull Executor executor, @NonNull OnSuccessListener<? super ResultT> onSuccessListener) {
        Preconditions.m4488k(executor);
        Preconditions.m4488k(onSuccessListener);
        this.f55381b.mo63691d((Activity) null, executor, onSuccessListener);
        return this;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: S */
    public int mo63656S() {
        return this.f55387h;
    }

    @NonNull
    /* renamed from: T */
    public ResultT mo23715p() {
        if (m77447R() != null) {
            Exception a = m77447R().mo63671a();
            if (a == null) {
                return m77447R();
            }
            throw new RuntimeExecutionException(a);
        }
        throw new IllegalStateException();
    }

    @NonNull
    /* renamed from: U */
    public <X extends Throwable> ResultT mo23716q(@NonNull Class<X> cls) throws Throwable {
        if (m77447R() == null) {
            throw new IllegalStateException();
        } else if (!cls.isInstance(m77447R().mo63671a())) {
            Exception a = m77447R().mo63671a();
            if (a == null) {
                return m77447R();
            }
            throw new RuntimeExecutionException(a);
        } else {
            throw ((Throwable) cls.cast(m77447R().mo63671a()));
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: V */
    public Runnable mo63659V() {
        return new C11372e(this);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: Y */
    public abstract StorageReference mo63585Y();

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: Z */
    public Object mo63660Z() {
        return this.f55380a;
    }

    /* renamed from: a0 */
    public boolean mo63661a0() {
        return (mo63656S() & 16) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public void mo63586j0() {
    }

    @NonNull
    /* renamed from: k */
    public <ContinuationResultT> Task<ContinuationResultT> mo23710k(@NonNull Continuation<ResultT, ContinuationResultT> continuation) {
        return m77444O((Executor) null, continuation);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public void mo63662k0() {
    }

    @NonNull
    /* renamed from: l */
    public <ContinuationResultT> Task<ContinuationResultT> mo23711l(@NonNull Executor executor, @NonNull Continuation<ResultT, ContinuationResultT> continuation) {
        return m77444O(executor, continuation);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public void mo63663l0() {
    }

    @NonNull
    /* renamed from: m */
    public <ContinuationResultT> Task<ContinuationResultT> mo23712m(@NonNull Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        return m77445P((Executor) null, continuation);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public void mo63664m0() {
    }

    @NonNull
    /* renamed from: n */
    public <ContinuationResultT> Task<ContinuationResultT> mo23713n(@NonNull Executor executor, @NonNull Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        return m77445P(executor, continuation);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public void mo63665n0() {
    }

    @Nullable
    /* renamed from: o */
    public Exception mo23714o() {
        if (m77447R() == null) {
            return null;
        }
        return m77447R().mo63671a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public void mo63666o0() {
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: p0 */
    public boolean mo63667p0() {
        if (!mo63669v0(2, false)) {
            return false;
        }
        mo63588r0();
        return true;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: q0 */
    public abstract void mo63587q0();

    /* renamed from: r */
    public boolean mo23717r() {
        return mo63656S() == 256;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: r0 */
    public abstract void mo63588r0();

    /* renamed from: s */
    public boolean mo23718s() {
        return (mo63656S() & 448) != 0;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    @NonNull
    /* renamed from: s0 */
    public ResultT mo63668s0() {
        ResultT t0;
        synchronized (this.f55380a) {
            t0 = mo63589t0();
        }
        return t0;
    }

    /* renamed from: t */
    public boolean mo23719t() {
        return (mo63656S() & 128) != 0;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    @NonNull
    /* renamed from: t0 */
    public abstract ResultT mo63589t0();

    @NonNull
    /* renamed from: u */
    public <ContinuationResultT> Task<ContinuationResultT> mo23720u(@NonNull SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        return m77458u0((Executor) null, successContinuation);
    }

    @NonNull
    /* renamed from: v */
    public <ContinuationResultT> Task<ContinuationResultT> mo23721v(@NonNull Executor executor, @NonNull SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        return m77458u0(executor, successContinuation);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: v0 */
    public boolean mo63669v0(int i, boolean z) {
        return mo63670w0(new int[]{i}, z);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b3, code lost:
        return true;
     */
    @androidx.annotation.VisibleForTesting
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo63670w0(int[] r9, boolean r10) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x0005
            java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.Integer>> r0 = f55378j
            goto L_0x0007
        L_0x0005:
            java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.Integer>> r0 = f55379k
        L_0x0007:
            java.lang.Object r1 = r8.f55380a
            monitor-enter(r1)
            int r2 = r9.length     // Catch:{ all -> 0x00eb }
            r3 = 0
            r4 = 0
        L_0x000d:
            if (r4 >= r2) goto L_0x00b9
            r5 = r9[r4]     // Catch:{ all -> 0x00eb }
            int r6 = r8.mo63656S()     // Catch:{ all -> 0x00eb }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00eb }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x00eb }
            java.util.HashSet r6 = (java.util.HashSet) r6     // Catch:{ all -> 0x00eb }
            if (r6 == 0) goto L_0x00b5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00eb }
            boolean r6 = r6.contains(r7)     // Catch:{ all -> 0x00eb }
            if (r6 == 0) goto L_0x00b5
            r8.f55387h = r5     // Catch:{ all -> 0x00eb }
            int r9 = r8.f55387h     // Catch:{ all -> 0x00eb }
            r0 = 2
            if (r9 == r0) goto L_0x005a
            r0 = 4
            if (r9 == r0) goto L_0x0056
            r0 = 16
            if (r9 == r0) goto L_0x0052
            r0 = 64
            if (r9 == r0) goto L_0x004e
            r0 = 128(0x80, float:1.794E-43)
            if (r9 == r0) goto L_0x004a
            r0 = 256(0x100, float:3.59E-43)
            if (r9 == r0) goto L_0x0046
            goto L_0x0064
        L_0x0046:
            r8.mo63586j0()     // Catch:{ all -> 0x00eb }
            goto L_0x0064
        L_0x004a:
            r8.mo63666o0()     // Catch:{ all -> 0x00eb }
            goto L_0x0064
        L_0x004e:
            r8.mo63662k0()     // Catch:{ all -> 0x00eb }
            goto L_0x0064
        L_0x0052:
            r8.mo63663l0()     // Catch:{ all -> 0x00eb }
            goto L_0x0064
        L_0x0056:
            r8.mo63664m0()     // Catch:{ all -> 0x00eb }
            goto L_0x0064
        L_0x005a:
            com.google.firebase.storage.StorageTaskManager r9 = com.google.firebase.storage.StorageTaskManager.m77517b()     // Catch:{ all -> 0x00eb }
            r9.mo63672a(r8)     // Catch:{ all -> 0x00eb }
            r8.mo63665n0()     // Catch:{ all -> 0x00eb }
        L_0x0064:
            com.google.firebase.storage.TaskListenerImpl<com.google.android.gms.tasks.OnSuccessListener<? super ResultT>, ResultT> r9 = r8.f55381b     // Catch:{ all -> 0x00eb }
            r9.mo63692h()     // Catch:{ all -> 0x00eb }
            com.google.firebase.storage.TaskListenerImpl<com.google.android.gms.tasks.OnFailureListener, ResultT> r9 = r8.f55382c     // Catch:{ all -> 0x00eb }
            r9.mo63692h()     // Catch:{ all -> 0x00eb }
            com.google.firebase.storage.TaskListenerImpl<com.google.android.gms.tasks.OnCanceledListener, ResultT> r9 = r8.f55384e     // Catch:{ all -> 0x00eb }
            r9.mo63692h()     // Catch:{ all -> 0x00eb }
            com.google.firebase.storage.TaskListenerImpl<com.google.android.gms.tasks.OnCompleteListener<ResultT>, ResultT> r9 = r8.f55383d     // Catch:{ all -> 0x00eb }
            r9.mo63692h()     // Catch:{ all -> 0x00eb }
            com.google.firebase.storage.TaskListenerImpl<com.google.firebase.storage.OnPausedListener<? super ResultT>, ResultT> r9 = r8.f55386g     // Catch:{ all -> 0x00eb }
            r9.mo63692h()     // Catch:{ all -> 0x00eb }
            com.google.firebase.storage.TaskListenerImpl<com.google.firebase.storage.OnProgressListener<? super ResultT>, ResultT> r9 = r8.f55385f     // Catch:{ all -> 0x00eb }
            r9.mo63692h()     // Catch:{ all -> 0x00eb }
            java.lang.String r9 = "StorageTask"
            r0 = 3
            boolean r9 = android.util.Log.isLoggable(r9, r0)     // Catch:{ all -> 0x00eb }
            if (r9 == 0) goto L_0x00b2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            r9.<init>()     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "changed internal state to: "
            r9.append(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = r8.m77448W(r5)     // Catch:{ all -> 0x00eb }
            r9.append(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = " isUser: "
            r9.append(r0)     // Catch:{ all -> 0x00eb }
            r9.append(r10)     // Catch:{ all -> 0x00eb }
            java.lang.String r10 = " from state:"
            r9.append(r10)     // Catch:{ all -> 0x00eb }
            int r10 = r8.f55387h     // Catch:{ all -> 0x00eb }
            java.lang.String r10 = r8.m77448W(r10)     // Catch:{ all -> 0x00eb }
            r9.append(r10)     // Catch:{ all -> 0x00eb }
        L_0x00b2:
            monitor-exit(r1)     // Catch:{ all -> 0x00eb }
            r9 = 1
            return r9
        L_0x00b5:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x00b9:
            java.lang.String r0 = "StorageTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            r2.<init>()     // Catch:{ all -> 0x00eb }
            java.lang.String r4 = "unable to change internal state to: "
            r2.append(r4)     // Catch:{ all -> 0x00eb }
            java.lang.String r9 = r8.m77449X(r9)     // Catch:{ all -> 0x00eb }
            r2.append(r9)     // Catch:{ all -> 0x00eb }
            java.lang.String r9 = " isUser: "
            r2.append(r9)     // Catch:{ all -> 0x00eb }
            r2.append(r10)     // Catch:{ all -> 0x00eb }
            java.lang.String r9 = " from state:"
            r2.append(r9)     // Catch:{ all -> 0x00eb }
            int r9 = r8.f55387h     // Catch:{ all -> 0x00eb }
            java.lang.String r9 = r8.m77448W(r9)     // Catch:{ all -> 0x00eb }
            r2.append(r9)     // Catch:{ all -> 0x00eb }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x00eb }
            android.util.Log.w(r0, r9)     // Catch:{ all -> 0x00eb }
            monitor-exit(r1)     // Catch:{ all -> 0x00eb }
            return r3
        L_0x00eb:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00eb }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.StorageTask.mo63670w0(int[], boolean):boolean");
    }
}
