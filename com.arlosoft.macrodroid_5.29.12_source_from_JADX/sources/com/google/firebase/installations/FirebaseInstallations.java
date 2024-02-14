package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Lazy;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class FirebaseInstallations implements FirebaseInstallationsApi {

    /* renamed from: m */
    private static final Object f54830m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f54831n = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f54844a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f54844a.getAndIncrement())}));
        }
    };

    /* renamed from: a */
    private final FirebaseApp f54832a;

    /* renamed from: b */
    private final FirebaseInstallationServiceClient f54833b;

    /* renamed from: c */
    private final PersistedInstallation f54834c;

    /* renamed from: d */
    private final Utils f54835d;

    /* renamed from: e */
    private final Lazy<IidStore> f54836e;

    /* renamed from: f */
    private final RandomFidGenerator f54837f;

    /* renamed from: g */
    private final Object f54838g;

    /* renamed from: h */
    private final ExecutorService f54839h;

    /* renamed from: i */
    private final ExecutorService f54840i;
    @GuardedBy("this")

    /* renamed from: j */
    private String f54841j;
    @GuardedBy("FirebaseInstallations.this")

    /* renamed from: k */
    private Set<FidListener> f54842k;
    @GuardedBy("lock")

    /* renamed from: l */
    private final List<StateListener> f54843l;

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$2 */
    class C112632 implements FidListenerHandle {
    }

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$3 */
    static /* synthetic */ class C112643 {

        /* renamed from: a */
        static final /* synthetic */ int[] f54845a;

        /* renamed from: b */
        static final /* synthetic */ int[] f54846b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.remote.TokenResult$ResponseCode[] r0 = com.google.firebase.installations.remote.TokenResult.ResponseCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f54846b = r0
                r1 = 1
                com.google.firebase.installations.remote.TokenResult$ResponseCode r2 = com.google.firebase.installations.remote.TokenResult.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f54846b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f54846b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode[] r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f54845a = r2
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r3 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f54845a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.FirebaseInstallations.C112643.<clinit>():void");
        }
    }

    FirebaseInstallations(FirebaseApp firebaseApp, @NonNull Provider<HeartBeatController> provider) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f54831n), firebaseApp, new FirebaseInstallationServiceClient(firebaseApp.mo61950l(), provider), new PersistedInstallation(firebaseApp), Utils.m76642c(), new Lazy(new C11270a(firebaseApp)), new RandomFidGenerator());
    }

    /* renamed from: A */
    private String m76594A(PersistedInstallationEntry persistedInstallationEntry) {
        if ((!this.f54832a.mo61951o().equals("CHIME_ANDROID_SDK") && !this.f54832a.mo61956w()) || !persistedInstallationEntry.mo63276m()) {
            return this.f54837f.mo63240a();
        }
        String f = m76611o().mo63268f();
        return TextUtils.isEmpty(f) ? this.f54837f.mo63240a() : f;
    }

    /* renamed from: B */
    private PersistedInstallationEntry m76595B(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        InstallationResponse d = this.f54833b.mo63307d(mo63234l(), persistedInstallationEntry.mo63251d(), mo63236t(), mo63235m(), (persistedInstallationEntry.mo63251d() == null || persistedInstallationEntry.mo63251d().length() != 11) ? null : m76611o().mo63269i());
        int i = C112643.f54845a[d.mo63286e().ordinal()];
        if (i == 1) {
            return persistedInstallationEntry.mo63281s(d.mo63284c(), d.mo63285d(), this.f54835d.mo63242b(), d.mo63283b().mo63298c(), d.mo63283b().mo63299d());
        } else if (i == 2) {
            return persistedInstallationEntry.mo63279q("BAD CONFIG");
        } else {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: C */
    private void m76596C(Exception exc) {
        synchronized (this.f54838g) {
            Iterator<StateListener> it = this.f54843l.iterator();
            while (it.hasNext()) {
                if (it.next().onException(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: D */
    private void m76597D(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.f54838g) {
            Iterator<StateListener> it = this.f54843l.iterator();
            while (it.hasNext()) {
                if (it.next().mo63238a(persistedInstallationEntry)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: E */
    private synchronized void m76598E(String str) {
        this.f54841j = str;
    }

    /* renamed from: F */
    private synchronized void m76599F(PersistedInstallationEntry persistedInstallationEntry, PersistedInstallationEntry persistedInstallationEntry2) {
        if (this.f54842k.size() != 0 && !TextUtils.equals(persistedInstallationEntry.mo63251d(), persistedInstallationEntry2.mo63251d())) {
            for (FidListener a : this.f54842k) {
                a.mo63248a(persistedInstallationEntry2.mo63251d());
            }
        }
    }

    /* renamed from: f */
    private Task<InstallationTokenResult> m76604f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m76606h(new GetAuthTokenListener(this.f54835d, taskCompletionSource));
        return taskCompletionSource.mo56137a();
    }

    /* renamed from: g */
    private Task<String> m76605g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m76606h(new GetIdListener(taskCompletionSource));
        return taskCompletionSource.mo56137a();
    }

    /* renamed from: h */
    private void m76606h(StateListener stateListener) {
        synchronized (this.f54838g) {
            this.f54843l.add(stateListener);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m76617v(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r2.m76614r()
            boolean r1 = r0.mo63272i()     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mo63275l()     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.Utils r3 = r2.f54835d     // Catch:{ FirebaseInstallationsException -> 0x005f }
            boolean r3 = r3.mo63244f(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.google.firebase.installations.local.PersistedInstallationEntry r3 = r2.m76609k(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
            goto L_0x0026
        L_0x0022:
            com.google.firebase.installations.local.PersistedInstallationEntry r3 = r2.m76595B(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
        L_0x0026:
            r2.m76616u(r3)
            r2.m76599F(r0, r3)
            boolean r0 = r3.mo63274k()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.mo63251d()
            r2.m76598E(r0)
        L_0x0039:
            boolean r0 = r3.mo63272i()
            if (r0 == 0) goto L_0x004a
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r0 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r3.<init>(r0)
            r2.m76596C(r3)
            goto L_0x005e
        L_0x004a:
            boolean r0 = r3.mo63273j()
            if (r0 == 0) goto L_0x005b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.m76596C(r3)
            goto L_0x005e
        L_0x005b:
            r2.m76597D(r3)
        L_0x005e:
            return
        L_0x005f:
            r3 = move-exception
            r2.m76596C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.FirebaseInstallations.m76617v(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m76619x(boolean z) {
        PersistedInstallationEntry s = m76615s();
        if (z) {
            s = s.mo63278p();
        }
        m76597D(s);
        this.f54840i.execute(new C11272c(this, z));
    }

    /* renamed from: k */
    private PersistedInstallationEntry m76609k(@NonNull PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        TokenResult e = this.f54833b.mo63308e(mo63234l(), persistedInstallationEntry.mo63251d(), mo63236t(), persistedInstallationEntry.mo63254f());
        int i = C112643.f54846b[e.mo63297b().ordinal()];
        if (i == 1) {
            return persistedInstallationEntry.mo63277o(e.mo63298c(), e.mo63299d(), this.f54835d.mo63242b());
        } else if (i == 2) {
            return persistedInstallationEntry.mo63279q("BAD CONFIG");
        } else {
            if (i == 3) {
                m76598E((String) null);
                return persistedInstallationEntry.mo63280r();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: n */
    private synchronized String m76610n() {
        return this.f54841j;
    }

    /* renamed from: o */
    private IidStore m76611o() {
        return this.f54836e.get();
    }

    @NonNull
    /* renamed from: p */
    public static FirebaseInstallations m76612p() {
        return m76613q(FirebaseApp.m74383m());
    }

    @NonNull
    /* renamed from: q */
    public static FirebaseInstallations m76613q(@NonNull FirebaseApp firebaseApp) {
        Preconditions.m4479b(firebaseApp != null, "Null is not a valid value of FirebaseApp.");
        return (FirebaseInstallations) firebaseApp.mo61949j(FirebaseInstallationsApi.class);
    }

    /* renamed from: r */
    private PersistedInstallationEntry m76614r() {
        PersistedInstallationEntry d;
        synchronized (f54830m) {
            CrossProcessLock a = CrossProcessLock.m76592a(this.f54832a.mo61950l(), "generatefid.lock");
            try {
                d = this.f54834c.mo63271d();
                if (a != null) {
                    a.mo63231b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo63231b();
                }
                throw th;
            }
        }
        return d;
    }

    /* renamed from: s */
    private PersistedInstallationEntry m76615s() {
        PersistedInstallationEntry d;
        synchronized (f54830m) {
            CrossProcessLock a = CrossProcessLock.m76592a(this.f54832a.mo61950l(), "generatefid.lock");
            try {
                d = this.f54834c.mo63271d();
                if (d.mo63273j()) {
                    d = this.f54834c.mo63270b(d.mo63282t(m76594A(d)));
                }
                if (a != null) {
                    a.mo63231b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo63231b();
                }
                throw th;
            }
        }
        return d;
    }

    /* renamed from: u */
    private void m76616u(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (f54830m) {
            CrossProcessLock a = CrossProcessLock.m76592a(this.f54832a.mo61950l(), "generatefid.lock");
            try {
                this.f54834c.mo63270b(persistedInstallationEntry);
                if (a != null) {
                    a.mo63231b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo63231b();
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m76618w() {
        m76619x(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static /* synthetic */ IidStore m76620y(FirebaseApp firebaseApp) {
        return new IidStore(firebaseApp);
    }

    /* renamed from: z */
    private void m76621z() {
        Preconditions.m4485h(mo63235m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m4485h(mo63236t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m4485h(mo63234l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m4479b(Utils.m76645h(mo63235m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m4479b(Utils.m76644g(mo63234l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @NonNull
    /* renamed from: a */
    public Task<InstallationTokenResult> mo63232a(boolean z) {
        m76621z();
        Task<InstallationTokenResult> f = m76604f();
        this.f54839h.execute(new C11273d(this, z));
        return f;
    }

    @NonNull
    public Task<String> getId() {
        m76621z();
        String n = m76610n();
        if (n != null) {
            return Tasks.m66667f(n);
        }
        Task<String> g = m76605g();
        this.f54839h.execute(new C11271b(this));
        return g;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: l */
    public String mo63234l() {
        return this.f54832a.mo61952p().mo61961b();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: m */
    public String mo63235m() {
        return this.f54832a.mo61952p().mo61962c();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: t */
    public String mo63236t() {
        return this.f54832a.mo61952p().mo61964e();
    }

    FirebaseInstallations(ExecutorService executorService, FirebaseApp firebaseApp, FirebaseInstallationServiceClient firebaseInstallationServiceClient, PersistedInstallation persistedInstallation, Utils utils, Lazy<IidStore> lazy, RandomFidGenerator randomFidGenerator) {
        this.f54838g = new Object();
        this.f54842k = new HashSet();
        this.f54843l = new ArrayList();
        this.f54832a = firebaseApp;
        this.f54833b = firebaseInstallationServiceClient;
        this.f54834c = persistedInstallation;
        this.f54835d = utils;
        this.f54836e = lazy;
        this.f54837f = randomFidGenerator;
        this.f54839h = executorService;
        this.f54840i = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f54831n);
    }
}
