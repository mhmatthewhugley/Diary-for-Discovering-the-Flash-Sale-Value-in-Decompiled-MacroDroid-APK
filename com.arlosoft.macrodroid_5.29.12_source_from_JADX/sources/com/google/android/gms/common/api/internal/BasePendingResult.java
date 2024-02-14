package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zau;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {

    /* renamed from: p */
    static final ThreadLocal f3157p = new zaq();

    /* renamed from: q */
    public static final /* synthetic */ int f3158q = 0;

    /* renamed from: a */
    private final Object f3159a;
    @NonNull

    /* renamed from: b */
    protected final CallbackHandler f3160b;
    @NonNull

    /* renamed from: c */
    protected final WeakReference f3161c;

    /* renamed from: d */
    private final CountDownLatch f3162d;

    /* renamed from: e */
    private final ArrayList f3163e;
    @Nullable

    /* renamed from: f */
    private ResultCallback f3164f;

    /* renamed from: g */
    private final AtomicReference f3165g;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: h */
    public Result f3166h;

    /* renamed from: i */
    private Status f3167i;

    /* renamed from: j */
    private volatile boolean f3168j;

    /* renamed from: k */
    private boolean f3169k;

    /* renamed from: l */
    private boolean f3170l;
    @Nullable

    /* renamed from: m */
    private ICancelToken f3171m;
    @KeepName
    private zas mResultGuardian;

    /* renamed from: n */
    private volatile zada f3172n;

    /* renamed from: o */
    private boolean f3173o;

    @Deprecated
    BasePendingResult() {
        this.f3159a = new Object();
        this.f3162d = new CountDownLatch(1);
        this.f3163e = new ArrayList();
        this.f3165g = new AtomicReference();
        this.f3173o = false;
        this.f3160b = new CallbackHandler(Looper.getMainLooper());
        this.f3161c = new WeakReference((Object) null);
    }

    /* renamed from: m */
    private final Result m3724m() {
        Result result;
        synchronized (this.f3159a) {
            Preconditions.m4494q(!this.f3168j, "Result has already been consumed.");
            Preconditions.m4494q(mo21328k(), "Result is not ready.");
            result = this.f3166h;
            this.f3166h = null;
            this.f3164f = null;
            this.f3168j = true;
        }
        zadb zadb = (zadb) this.f3165g.getAndSet((Object) null);
        if (zadb != null) {
            zadb.f3449a.f3451a.remove(this);
        }
        return (Result) Preconditions.m4488k(result);
    }

    /* renamed from: n */
    private final void m3725n(Result result) {
        this.f3166h = result;
        this.f3167i = result.getStatus();
        this.f3171m = null;
        this.f3162d.countDown();
        if (this.f3169k) {
            this.f3164f = null;
        } else {
            ResultCallback resultCallback = this.f3164f;
            if (resultCallback != null) {
                this.f3160b.removeMessages(2);
                this.f3160b.mo21333a(resultCallback, m3724m());
            } else if (this.f3166h instanceof Releasable) {
                this.mResultGuardian = new zas(this, (zar) null);
            }
        }
        ArrayList arrayList = this.f3163e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((PendingResult.StatusListener) arrayList.get(i)).mo21274a(this.f3167i);
        }
        this.f3163e.clear();
    }

    /* renamed from: q */
    public static void m3727q(@Nullable Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(result)), e);
            }
        }
    }

    /* renamed from: c */
    public final void mo21270c(@NonNull PendingResult.StatusListener statusListener) {
        Preconditions.m4479b(statusListener != null, "Callback cannot be null.");
        synchronized (this.f3159a) {
            if (mo21328k()) {
                statusListener.mo21274a(this.f3167i);
            } else {
                this.f3163e.add(statusListener);
            }
        }
    }

    @NonNull
    /* renamed from: d */
    public final R mo21271d() {
        Preconditions.m4487j("await must not be called on the UI thread");
        boolean z = true;
        Preconditions.m4494q(!this.f3168j, "Result has already been consumed");
        if (this.f3172n != null) {
            z = false;
        }
        Preconditions.m4494q(z, "Cannot await if then() has been called.");
        try {
            this.f3162d.await();
        } catch (InterruptedException unused) {
            mo21326i(Status.f3139s);
        }
        Preconditions.m4494q(mo21328k(), "Result is not ready.");
        return m3724m();
    }

    @NonNull
    /* renamed from: e */
    public final R mo21272e(long j, @NonNull TimeUnit timeUnit) {
        if (j > 0) {
            Preconditions.m4487j("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        Preconditions.m4494q(!this.f3168j, "Result has already been consumed.");
        if (this.f3172n != null) {
            z = false;
        }
        Preconditions.m4494q(z, "Cannot await if then() has been called.");
        try {
            if (!this.f3162d.await(j, timeUnit)) {
                mo21326i(Status.f3133A);
            }
        } catch (InterruptedException unused) {
            mo21326i(Status.f3139s);
        }
        Preconditions.m4494q(mo21328k(), "Result is not ready.");
        return m3724m();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0013 */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21212f() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f3159a
            monitor-enter(r0)
            boolean r1 = r2.f3169k     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0026
            boolean r1 = r2.f3168j     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0026
        L_0x000c:
            com.google.android.gms.common.internal.ICancelToken r1 = r2.f3171m     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0013
            r1.cancel()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0013:
            com.google.android.gms.common.api.Result r1 = r2.f3166h     // Catch:{ all -> 0x0028 }
            m3727q(r1)     // Catch:{ all -> 0x0028 }
            r1 = 1
            r2.f3169k = r1     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f3134B     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.Result r1 = r2.mo21036h(r1)     // Catch:{ all -> 0x0028 }
            r2.m3725n(r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo21212f():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21273g(@androidx.annotation.Nullable com.google.android.gms.common.api.ResultCallback<? super R> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f3159a
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000a
            r5 = 0
            r4.f3164f = r5     // Catch:{ all -> 0x003a }
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x000a:
            boolean r1 = r4.f3168j     // Catch:{ all -> 0x003a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.m4494q(r1, r3)     // Catch:{ all -> 0x003a }
            com.google.android.gms.common.api.internal.zada r1 = r4.f3172n     // Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.Preconditions.m4494q(r2, r1)     // Catch:{ all -> 0x003a }
            boolean r1 = r4.mo21327j()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x0026:
            boolean r1 = r4.mo21328k()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0036
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r1 = r4.f3160b     // Catch:{ all -> 0x003a }
            com.google.android.gms.common.api.Result r2 = r4.m3724m()     // Catch:{ all -> 0x003a }
            r1.mo21333a(r5, r2)     // Catch:{ all -> 0x003a }
            goto L_0x0038
        L_0x0036:
            r4.f3164f = r5     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x003a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo21273g(com.google.android.gms.common.api.ResultCallback):void");
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: h */
    public abstract R mo21036h(@NonNull Status status);

    @KeepForSdk
    @Deprecated
    /* renamed from: i */
    public final void mo21326i(@NonNull Status status) {
        synchronized (this.f3159a) {
            if (!mo21328k()) {
                mo21329l(mo21036h(status));
                this.f3170l = true;
            }
        }
    }

    /* renamed from: j */
    public final boolean mo21327j() {
        boolean z;
        synchronized (this.f3159a) {
            z = this.f3169k;
        }
        return z;
    }

    @KeepForSdk
    /* renamed from: k */
    public final boolean mo21328k() {
        return this.f3162d.getCount() == 0;
    }

    @KeepForSdk
    /* renamed from: l */
    public final void mo21329l(@NonNull R r) {
        synchronized (this.f3159a) {
            if (this.f3170l || this.f3169k) {
                m3727q(r);
                return;
            }
            mo21328k();
            Preconditions.m4494q(!mo21328k(), "Results have already been set");
            Preconditions.m4494q(!this.f3168j, "Result has already been consumed");
            m3725n(r);
        }
    }

    /* renamed from: p */
    public final void mo21330p() {
        boolean z = true;
        if (!this.f3173o && !((Boolean) f3157p.get()).booleanValue()) {
            z = false;
        }
        this.f3173o = z;
    }

    /* renamed from: r */
    public final boolean mo21331r() {
        boolean j;
        synchronized (this.f3159a) {
            if (((GoogleApiClient) this.f3161c.get()) == null || !this.f3173o) {
                mo21212f();
            }
            j = mo21327j();
        }
        return j;
    }

    /* renamed from: s */
    public final void mo21332s(@Nullable zadb zadb) {
        this.f3165g.set(zadb);
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class CallbackHandler<R extends Result> extends zau {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        /* renamed from: a */
        public final void mo21333a(@NonNull ResultCallback resultCallback, @NonNull Result result) {
            int i = BasePendingResult.f3158q;
            sendMessage(obtainMessage(1, new Pair((ResultCallback) Preconditions.m4488k(resultCallback), result)));
        }

        public final void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.mo21280A(result);
                } catch (RuntimeException e) {
                    BasePendingResult.m3727q(result);
                    throw e;
                }
            } else if (i != 2) {
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i, new Exception());
            } else {
                ((BasePendingResult) message.obj).mo21326i(Status.f3133A);
            }
        }

        public CallbackHandler(@NonNull Looper looper) {
            super(looper);
        }
    }

    @KeepForSdk
    protected BasePendingResult(@Nullable GoogleApiClient googleApiClient) {
        this.f3159a = new Object();
        this.f3162d = new CountDownLatch(1);
        this.f3163e = new ArrayList();
        this.f3165g = new AtomicReference();
        this.f3173o = false;
        this.f3160b = new CallbackHandler(googleApiClient != null ? googleApiClient.mo21254k() : Looper.getMainLooper());
        this.f3161c = new WeakReference(googleApiClient);
    }
}
