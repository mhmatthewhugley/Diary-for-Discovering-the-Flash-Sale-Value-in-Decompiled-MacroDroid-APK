package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class TopicsSubscriber {

    /* renamed from: i */
    private static final long f55048i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    private final Context f55049a;

    /* renamed from: b */
    private final Metadata f55050b;

    /* renamed from: c */
    private final GmsRpc f55051c;

    /* renamed from: d */
    private final FirebaseMessaging f55052d;
    @GuardedBy("pendingOperations")

    /* renamed from: e */
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f55053e = new ArrayMap();

    /* renamed from: f */
    private final ScheduledExecutorService f55054f;
    @GuardedBy("this")

    /* renamed from: g */
    private boolean f55055g = false;

    /* renamed from: h */
    private final TopicsStore f55056h;

    private TopicsSubscriber(FirebaseMessaging firebaseMessaging, Metadata metadata, TopicsStore topicsStore, GmsRpc gmsRpc, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f55052d = firebaseMessaging;
        this.f55050b = metadata;
        this.f55056h = topicsStore;
        this.f55051c = gmsRpc;
        this.f55049a = context;
        this.f55054f = scheduledExecutorService;
    }

    /* renamed from: b */
    private void m77047b(TopicOperation topicOperation, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque arrayDeque;
        synchronized (this.f55053e) {
            String e = topicOperation.mo63422e();
            if (this.f55053e.containsKey(e)) {
                arrayDeque = this.f55053e.get(e);
            } else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                this.f55053e.put(e, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(taskCompletionSource);
        }
    }

    @WorkerThread
    /* renamed from: c */
    private static <T> void m77048c(Task<T> task) throws IOException {
        try {
            Tasks.m66663b(task, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    @WorkerThread
    /* renamed from: d */
    private void m77049d(String str) throws IOException {
        m77048c(this.f55051c.mo63361k(this.f55052d.mo63348k(), str));
    }

    @WorkerThread
    /* renamed from: e */
    private void m77050e(String str) throws IOException {
        m77048c(this.f55051c.mo63362l(this.f55052d.mo63348k(), str));
    }

    @VisibleForTesting
    /* renamed from: f */
    static Task<TopicsSubscriber> m77051f(FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        return Tasks.m66664c(scheduledExecutorService, new C11324y(context, scheduledExecutorService, firebaseMessaging, metadata, gmsRpc));
    }

    /* renamed from: h */
    static boolean m77052h() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ TopicsSubscriber m77053j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc) throws Exception {
        return new TopicsSubscriber(firebaseMessaging, metadata, TopicsStore.m77041b(context, scheduledExecutorService), gmsRpc, context, scheduledExecutorService);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m77054k(com.google.firebase.messaging.TopicOperation r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r0 = r4.f55053e
            monitor-enter(r0)
            java.lang.String r5 = r5.mo63422e()     // Catch:{ all -> 0x0032 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r1 = r4.f55053e     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0011:
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r1 = r4.f55053e     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0032 }
            com.google.android.gms.tasks.TaskCompletionSource r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            r3 = 0
            r2.mo56139c(r3)     // Catch:{ all -> 0x0032 }
        L_0x0025:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r1 = r4.f55053e     // Catch:{ all -> 0x0032 }
            r1.remove(r5)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.TopicsSubscriber.m77054k(com.google.firebase.messaging.TopicOperation):void");
    }

    /* renamed from: p */
    private void m77055p() {
        if (!mo63429i()) {
            mo63437t(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo63428g() {
        return this.f55056h.mo63426c() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized boolean mo63429i() {
        return this.f55055g;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: l */
    public boolean mo63430l(TopicOperation topicOperation) throws IOException {
        try {
            String b = topicOperation.mo63420b();
            char c = 65535;
            int hashCode = b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85) {
                    if (b.equals("U")) {
                        c = 1;
                    }
                }
            } else if (b.equals(ExifInterface.LATITUDE_SOUTH)) {
                c = 0;
            }
            if (c == 0) {
                m77049d(topicOperation.mo63421c());
                if (m77052h()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Subscribe to topic: ");
                    sb.append(topicOperation.mo63421c());
                    sb.append(" succeeded.");
                }
            } else if (c == 1) {
                m77050e(topicOperation.mo63421c());
                if (m77052h()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unsubscribe from topic: ");
                    sb2.append(topicOperation.mo63421c());
                    sb2.append(" succeeded.");
                }
            } else if (m77052h()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown topic operation");
                sb3.append(topicOperation);
                sb3.append(".");
            }
            return true;
        } catch (IOException e) {
            if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            } else if (e.getMessage() == null) {
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            } else {
                throw e;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo63431m(Runnable runnable, long j) {
        this.f55054f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: n */
    public Task<Void> mo63432n(TopicOperation topicOperation) {
        this.f55056h.mo63425a(topicOperation);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m77047b(topicOperation, taskCompletionSource);
        return taskCompletionSource.mo56137a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public synchronized void mo63433o(boolean z) {
        this.f55055g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo63434q() {
        if (mo63428g()) {
            m77055p();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Task<Void> mo63435r(String str) {
        Task<Void> n = mo63432n(TopicOperation.m77036f(str));
        mo63434q();
        return n;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (mo63430l(r0) != false) goto L_0x0019;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo63436s() throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            com.google.firebase.messaging.TopicsStore r0 = r2.f55056h     // Catch:{ all -> 0x0022 }
            com.google.firebase.messaging.TopicOperation r0 = r0.mo63426c()     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0010
            boolean r0 = m77052h()     // Catch:{ all -> 0x0022 }
            r0 = 1
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r0
        L_0x0010:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            boolean r1 = r2.mo63430l(r0)
            if (r1 != 0) goto L_0x0019
            r0 = 0
            return r0
        L_0x0019:
            com.google.firebase.messaging.TopicsStore r1 = r2.f55056h
            r1.mo63427e(r0)
            r2.m77054k(r0)
            goto L_0x0000
        L_0x0022:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.TopicsSubscriber.mo63436s():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo63437t(long j) {
        mo63431m(new TopicsSyncTask(this, this.f55049a, this.f55050b, Math.min(Math.max(30, 2 * j), f55048i)), j);
        mo63433o(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public Task<Void> mo63438u(String str) {
        Task<Void> n = mo63432n(TopicOperation.m77037g(str));
        mo63434q();
        return n;
    }
}
