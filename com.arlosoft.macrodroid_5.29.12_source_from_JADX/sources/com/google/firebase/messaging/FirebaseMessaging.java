package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.Store;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseMessaging {

    /* renamed from: o */
    private static final long f54975o = TimeUnit.HOURS.toSeconds(8);
    @GuardedBy("FirebaseMessaging.class")

    /* renamed from: p */
    private static Store f54976p;
    @VisibleForTesting
    @Nullable

    /* renamed from: q */
    static TransportFactory f54977q;
    @VisibleForTesting
    @GuardedBy("FirebaseMessaging.class")

    /* renamed from: r */
    static ScheduledExecutorService f54978r;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final FirebaseApp f54979a;
    @Nullable

    /* renamed from: b */
    private final FirebaseInstanceIdInternal f54980b;

    /* renamed from: c */
    private final FirebaseInstallationsApi f54981c;

    /* renamed from: d */
    private final Context f54982d;

    /* renamed from: e */
    private final GmsRpc f54983e;

    /* renamed from: f */
    private final RequestDeduplicator f54984f;

    /* renamed from: g */
    private final AutoInit f54985g;

    /* renamed from: h */
    private final Executor f54986h;

    /* renamed from: i */
    private final Executor f54987i;

    /* renamed from: j */
    private final Executor f54988j;

    /* renamed from: k */
    private final Task<TopicsSubscriber> f54989k;

    /* renamed from: l */
    private final Metadata f54990l;
    @GuardedBy("this")

    /* renamed from: m */
    private boolean f54991m;

    /* renamed from: n */
    private final Application.ActivityLifecycleCallbacks f54992n;

    private class AutoInit {

        /* renamed from: a */
        private final Subscriber f54993a;
        @GuardedBy("this")

        /* renamed from: b */
        private boolean f54994b;
        @GuardedBy("this")
        @Nullable

        /* renamed from: c */
        private EventHandler<DataCollectionDefaultChange> f54995c;
        @GuardedBy("this")
        @Nullable

        /* renamed from: d */
        private Boolean f54996d;

        AutoInit(Subscriber subscriber) {
            this.f54993a = subscriber;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m76884d(Event event) {
            if (mo63356c()) {
                FirebaseMessaging.this.m76851G();
            }
        }

        @Nullable
        /* renamed from: e */
        private Boolean m76885e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context l = FirebaseMessaging.this.f54979a.mo61950l();
            SharedPreferences sharedPreferences = l.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = l.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(l.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo63355b() {
            if (!this.f54994b) {
                Boolean e = m76885e();
                this.f54996d = e;
                if (e == null) {
                    C11315p pVar = new C11315p(this);
                    this.f54995c = pVar;
                    this.f54993a.mo22917a(DataCollectionDefaultChange.class, pVar);
                }
                this.f54994b = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized boolean mo63356c() {
            boolean z;
            mo63355b();
            Boolean bool = this.f54996d;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = FirebaseMessaging.this.f54979a.mo61955v();
            }
            return z;
        }
    }

    FirebaseMessaging(FirebaseApp firebaseApp, @Nullable FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, @Nullable TransportFactory transportFactory, Subscriber subscriber) {
        this(firebaseApp, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, transportFactory, subscriber, new Metadata(firebaseApp.mo61950l()));
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m76846A(TopicsSubscriber topicsSubscriber) {
        if (mo63353u()) {
            topicsSubscriber.mo63434q();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m76847B() {
        ProxyNotificationInitializer.m76986c(this.f54982d);
    }

    /* renamed from: F */
    private synchronized void m76850F() {
        if (!this.f54991m) {
            mo63345I(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m76851G() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f54980b;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.mo63218a();
        } else if (mo63346J(mo63352r())) {
            m76850F();
        }
    }

    @NonNull
    @Keep
    static synchronized FirebaseMessaging getInstance(@NonNull FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) firebaseApp.mo61949j(cls);
            Preconditions.m4489l(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    @NonNull
    /* renamed from: n */
    public static synchronized FirebaseMessaging m76862n() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(FirebaseApp.m74383m());
        }
        return instance;
    }

    @NonNull
    /* renamed from: o */
    private static synchronized Store m76863o(Context context) {
        Store store;
        synchronized (FirebaseMessaging.class) {
            if (f54976p == null) {
                f54976p = new Store(context);
            }
            store = f54976p;
        }
        return store;
    }

    /* renamed from: p */
    private String m76864p() {
        if ("[DEFAULT]".equals(this.f54979a.mo61951o())) {
            return "";
        }
        return this.f54979a.mo61953q();
    }

    @Nullable
    /* renamed from: s */
    public static TransportFactory m76865s() {
        return f54977q;
    }

    /* renamed from: t */
    private void m76866t(String str) {
        if ("[DEFAULT]".equals(this.f54979a.mo61951o())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invoking onNewToken for app: ");
                sb.append(this.f54979a.mo61951o());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new FcmBroadcastProcessor(this.f54982d).mo63334i(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ Task m76867w(String str, Store.Token token) {
        return this.f54983e.mo63360e().mo23721v(this.f54988j, new C11307h(this, str, token));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ Task m76868x(String str, Store.Token token, String str2) throws Exception {
        m76863o(this.f54982d).mo63412f(m76864p(), str, str2, this.f54990l.mo63367a());
        if (token == null || !str2.equals(token.f55032a)) {
            m76866t(str2);
        }
        return Tasks.m66667f(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m76869y(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.mo56139c(mo63348k());
        } catch (Exception e) {
            taskCompletionSource.mo56138b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m76870z() {
        if (mo63353u()) {
            m76851G();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public synchronized void mo63343E(boolean z) {
        this.f54991m = z;
    }

    @NonNull
    /* renamed from: H */
    public Task<Void> mo63344H(@NonNull String str) {
        return this.f54989k.mo23720u(new C11309j(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public synchronized void mo63345I(long j) {
        mo63349l(new SyncTask(this, Math.min(Math.max(30, 2 * j), f54975o)), j);
        this.f54991m = true;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: J */
    public boolean mo63346J(@Nullable Store.Token token) {
        return token == null || token.mo63413b(this.f54990l.mo63367a());
    }

    @NonNull
    /* renamed from: K */
    public Task<Void> mo63347K(@NonNull String str) {
        return this.f54989k.mo23720u(new C11308i(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo63348k() throws IOException {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f54980b;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) Tasks.m66662a(firebaseInstanceIdInternal.mo63219b());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        } else {
            Store.Token r = mo63352r();
            if (!mo63346J(r)) {
                return r.f55032a;
            }
            String c = Metadata.m76948c(this.f54979a);
            try {
                return (String) Tasks.m66662a(this.f54984f.mo63399b(c, new C11311l(this, c, r)));
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo63349l(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (f54978r == null) {
                f54978r = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f54978r.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Context mo63350m() {
        return this.f54982d;
    }

    @NonNull
    /* renamed from: q */
    public Task<String> mo63351q() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f54980b;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.mo63219b();
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f54986h.execute(new C11314o(this, taskCompletionSource));
        return taskCompletionSource.mo56137a();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    @Nullable
    /* renamed from: r */
    public Store.Token mo63352r() {
        return m76863o(this.f54982d).mo63410d(m76864p(), Metadata.m76948c(this.f54979a));
    }

    /* renamed from: u */
    public boolean mo63353u() {
        return this.f54985g.mo63356c();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: v */
    public boolean mo63354v() {
        return this.f54990l.mo63371g();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FirebaseMessaging(com.google.firebase.FirebaseApp r12, @androidx.annotation.Nullable com.google.firebase.iid.internal.FirebaseInstanceIdInternal r13, com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> r14, com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> r15, com.google.firebase.installations.FirebaseInstallationsApi r16, @androidx.annotation.Nullable com.google.android.datatransport.TransportFactory r17, com.google.firebase.events.Subscriber r18, com.google.firebase.messaging.Metadata r19) {
        /*
            r11 = this;
            com.google.firebase.messaging.GmsRpc r7 = new com.google.firebase.messaging.GmsRpc
            r0 = r7
            r1 = r12
            r2 = r19
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r8 = com.google.firebase.messaging.FcmExecutors.m76841f()
            java.util.concurrent.ScheduledExecutorService r9 = com.google.firebase.messaging.FcmExecutors.m76838c()
            java.util.concurrent.Executor r10 = com.google.firebase.messaging.FcmExecutors.m76837b()
            r0 = r11
            r2 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.<init>(com.google.firebase.FirebaseApp, com.google.firebase.iid.internal.FirebaseInstanceIdInternal, com.google.firebase.inject.Provider, com.google.firebase.inject.Provider, com.google.firebase.installations.FirebaseInstallationsApi, com.google.android.datatransport.TransportFactory, com.google.firebase.events.Subscriber, com.google.firebase.messaging.Metadata):void");
    }

    FirebaseMessaging(FirebaseApp firebaseApp, @Nullable FirebaseInstanceIdInternal firebaseInstanceIdInternal, FirebaseInstallationsApi firebaseInstallationsApi, @Nullable TransportFactory transportFactory, Subscriber subscriber, Metadata metadata, GmsRpc gmsRpc, Executor executor, Executor executor2, Executor executor3) {
        this.f54991m = false;
        f54977q = transportFactory;
        this.f54979a = firebaseApp;
        this.f54980b = firebaseInstanceIdInternal;
        this.f54981c = firebaseInstallationsApi;
        this.f54985g = new AutoInit(subscriber);
        Context l = firebaseApp.mo61950l();
        this.f54982d = l;
        FcmLifecycleCallbacks fcmLifecycleCallbacks = new FcmLifecycleCallbacks();
        this.f54992n = fcmLifecycleCallbacks;
        this.f54990l = metadata;
        this.f54987i = executor;
        this.f54983e = gmsRpc;
        this.f54984f = new RequestDeduplicator(executor);
        this.f54986h = executor2;
        this.f54988j = executor3;
        Context l2 = firebaseApp.mo61950l();
        if (l2 instanceof Application) {
            ((Application) l2).registerActivityLifecycleCallbacks(fcmLifecycleCallbacks);
        } else {
            Log.w("FirebaseMessaging", "Context " + l2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.mo63220c(new C11310k(this));
        }
        executor2.execute(new C11313n(this));
        Task<TopicsSubscriber> f = TopicsSubscriber.m77051f(this, metadata, gmsRpc, l, FcmExecutors.m76842g());
        this.f54989k = f;
        f.mo23709j(executor2, new C11306g(this));
        executor2.execute(new C11312m(this));
    }
}
