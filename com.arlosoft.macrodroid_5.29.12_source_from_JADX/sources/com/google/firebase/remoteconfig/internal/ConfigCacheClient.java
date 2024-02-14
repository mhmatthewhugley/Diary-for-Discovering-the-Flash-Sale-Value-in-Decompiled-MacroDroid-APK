package com.google.firebase.remoteconfig.internal;

import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.auth.C0271a;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@AnyThread
public class ConfigCacheClient {
    @GuardedBy("ConfigCacheClient.class")

    /* renamed from: d */
    private static final Map<String, ConfigCacheClient> f55227d = new HashMap();

    /* renamed from: e */
    private static final Executor f55228e = C0271a.f317a;

    /* renamed from: a */
    private final ExecutorService f55229a;

    /* renamed from: b */
    private final ConfigStorageClient f55230b;
    @GuardedBy("this")
    @Nullable

    /* renamed from: c */
    private Task<ConfigContainer> f55231c = null;

    private static class AwaitListener<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: a */
        private final CountDownLatch f55232a;

        private AwaitListener() {
            this.f55232a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public boolean mo63536a(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f55232a.await(j, timeUnit);
        }

        /* renamed from: b */
        public void mo22751b(TResult tresult) {
            this.f55232a.countDown();
        }

        /* renamed from: c */
        public void mo22733c(@NonNull Exception exc) {
            this.f55232a.countDown();
        }

        /* renamed from: d */
        public void mo30644d() {
            this.f55232a.countDown();
        }
    }

    private ConfigCacheClient(ExecutorService executorService, ConfigStorageClient configStorageClient) {
        this.f55229a = executorService;
        this.f55230b = configStorageClient;
    }

    /* renamed from: c */
    private static <TResult> TResult m77234c(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        AwaitListener awaitListener = new AwaitListener();
        Executor executor = f55228e;
        task.mo23709j(executor, awaitListener);
        task.mo23706g(executor, awaitListener);
        task.mo23701b(executor, awaitListener);
        if (!awaitListener.mo63536a(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (task.mo23719t()) {
            return task.mo23715p();
        } else {
            throw new ExecutionException(task.mo23714o());
        }
    }

    /* renamed from: h */
    public static synchronized ConfigCacheClient m77235h(ExecutorService executorService, ConfigStorageClient configStorageClient) {
        ConfigCacheClient configCacheClient;
        synchronized (ConfigCacheClient.class) {
            String b = configStorageClient.mo63576b();
            Map<String, ConfigCacheClient> map = f55227d;
            if (!map.containsKey(b)) {
                map.put(b, new ConfigCacheClient(executorService, configStorageClient));
            }
            configCacheClient = map.get(b);
        }
        return configCacheClient;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Void m77236i(ConfigContainer configContainer) throws Exception {
        return this.f55230b.mo63578e(configContainer);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Task m77237j(boolean z, ConfigContainer configContainer, Void voidR) throws Exception {
        if (z) {
            m77238m(configContainer);
        }
        return Tasks.m66667f(configContainer);
    }

    /* renamed from: m */
    private synchronized void m77238m(ConfigContainer configContainer) {
        this.f55231c = Tasks.m66667f(configContainer);
    }

    /* renamed from: d */
    public void mo63530d() {
        synchronized (this) {
            this.f55231c = Tasks.m66667f(null);
        }
        this.f55230b.mo63575a();
    }

    /* renamed from: e */
    public synchronized Task<ConfigContainer> mo63531e() {
        Task<ConfigContainer> task = this.f55231c;
        if (task == null || (task.mo23718s() && !this.f55231c.mo23719t())) {
            ExecutorService executorService = this.f55229a;
            ConfigStorageClient configStorageClient = this.f55230b;
            Objects.requireNonNull(configStorageClient);
            this.f55231c = Tasks.m66664c(executorService, new C11348c(configStorageClient));
        }
        return this.f55231c;
    }

    @Nullable
    /* renamed from: f */
    public ConfigContainer mo63532f() {
        return mo63533g(5);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return (com.google.firebase.remoteconfig.internal.ConfigContainer) m77234c(mo63531e(), r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return null;
     */
    @androidx.annotation.VisibleForTesting
    @androidx.annotation.Nullable
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.ConfigContainer mo63533g(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> r0 = r2.f55231c     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.mo23719t()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0015
            com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> r3 = r2.f55231c     // Catch:{ all -> 0x0025 }
            java.lang.Object r3 = r3.mo23715p()     // Catch:{ all -> 0x0025 }
            com.google.firebase.remoteconfig.internal.ConfigContainer r3 = (com.google.firebase.remoteconfig.internal.ConfigContainer) r3     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            return r3
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.tasks.Task r0 = r2.mo63531e()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0023 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0023 }
            java.lang.Object r3 = m77234c(r0, r3, r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0023 }
            com.google.firebase.remoteconfig.internal.ConfigContainer r3 = (com.google.firebase.remoteconfig.internal.ConfigContainer) r3     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0023 }
            return r3
        L_0x0023:
            r3 = 0
            return r3
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigCacheClient.mo63533g(long):com.google.firebase.remoteconfig.internal.ConfigContainer");
    }

    /* renamed from: k */
    public Task<ConfigContainer> mo63534k(ConfigContainer configContainer) {
        return mo63535l(configContainer, true);
    }

    /* renamed from: l */
    public Task<ConfigContainer> mo63535l(ConfigContainer configContainer, boolean z) {
        return Tasks.m66664c(this.f55229a, new C11347b(this, configContainer)).mo23721v(this.f55229a, new C11346a(this, z, configContainer));
    }
}
