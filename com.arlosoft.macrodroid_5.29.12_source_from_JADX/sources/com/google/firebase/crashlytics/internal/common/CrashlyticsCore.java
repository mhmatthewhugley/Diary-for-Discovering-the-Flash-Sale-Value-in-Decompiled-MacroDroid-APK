package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CrashlyticsCore {

    /* renamed from: a */
    private final Context f4954a;

    /* renamed from: b */
    private final FirebaseApp f4955b;

    /* renamed from: c */
    private final DataCollectionArbiter f4956c;

    /* renamed from: d */
    private final OnDemandCounter f4957d = new OnDemandCounter();

    /* renamed from: e */
    private final long f4958e = System.currentTimeMillis();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public CrashlyticsFileMarker f4959f;

    /* renamed from: g */
    private CrashlyticsFileMarker f4960g;

    /* renamed from: h */
    private boolean f4961h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public CrashlyticsController f4962i;

    /* renamed from: j */
    private final IdManager f4963j;

    /* renamed from: k */
    private final FileStore f4964k;
    @VisibleForTesting

    /* renamed from: l */
    public final BreadcrumbSource f4965l;

    /* renamed from: m */
    private final AnalyticsEventLogger f4966m;

    /* renamed from: n */
    private final ExecutorService f4967n;

    /* renamed from: o */
    private final CrashlyticsBackgroundWorker f4968o;

    /* renamed from: p */
    private final CrashlyticsNativeComponent f4969p;

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, FileStore fileStore, ExecutorService executorService) {
        this.f4955b = firebaseApp;
        this.f4956c = dataCollectionArbiter;
        this.f4954a = firebaseApp.mo61950l();
        this.f4963j = idManager;
        this.f4969p = crashlyticsNativeComponent;
        this.f4965l = breadcrumbSource;
        this.f4966m = analyticsEventLogger;
        this.f4967n = executorService;
        this.f4964k = fileStore;
        this.f4968o = new CrashlyticsBackgroundWorker(executorService);
    }

    /* renamed from: d */
    private void m6680d() {
        try {
            this.f4961h = Boolean.TRUE.equals((Boolean) Utils.m6804d(this.f4968o.mo22983h(new Callable<Boolean>() {
                /* renamed from: a */
                public Boolean call() throws Exception {
                    return Boolean.valueOf(CrashlyticsCore.this.f4962i.mo22998s());
                }
            })));
        } catch (Exception unused) {
            this.f4961h = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public Task<Void> m6681f(SettingsProvider settingsProvider) {
        mo23023n();
        try {
            this.f4965l.mo22941a(new C1871b(this));
            if (!settingsProvider.mo23526b().f5481b.f5488a) {
                Logger.m6525f().mo22954b("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.m66666e(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f4962i.mo23001z(settingsProvider)) {
                Logger.m6525f().mo22962k("Previous sessions could not be finalized.");
            }
            Task<Void> O = this.f4962i.mo22995O(settingsProvider.mo23525a());
            mo23022m();
            return O;
        } catch (Exception e) {
            Logger.m6525f().mo22957e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return Tasks.m66666e(e);
        } finally {
            mo23022m();
        }
    }

    /* renamed from: h */
    private void m6682h(final SettingsProvider settingsProvider) {
        Future<?> submit = this.f4967n.submit(new Runnable() {
            public void run() {
                Task unused = CrashlyticsCore.this.m6681f(settingsProvider);
            }
        });
        Logger.m6525f().mo22954b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Logger.m6525f().mo22957e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            Logger.m6525f().mo22957e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Logger.m6525f().mo22957e("Crashlytics timed out during initialization.", e3);
        }
    }

    /* renamed from: i */
    public static String m6683i() {
        return "18.3.2";
    }

    /* renamed from: j */
    static boolean m6684j(String str, boolean z) {
        if (!z) {
            Logger.m6525f().mo22960i("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo23018e() {
        return this.f4959f.mo23034c();
    }

    /* renamed from: g */
    public Task<Void> mo23019g(final SettingsProvider settingsProvider) {
        return Utils.m6806f(this.f4967n, new Callable<Task<Void>>() {
            /* renamed from: a */
            public Task<Void> call() throws Exception {
                return CrashlyticsCore.this.m6681f(settingsProvider);
            }
        });
    }

    /* renamed from: k */
    public void mo23020k(String str) {
        this.f4962i.mo22997S(System.currentTimeMillis() - this.f4958e, str);
    }

    /* renamed from: l */
    public void mo23021l(@NonNull Throwable th) {
        this.f4962i.mo22996R(Thread.currentThread(), th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo23022m() {
        this.f4968o.mo22983h(new Callable<Boolean>() {
            /* renamed from: a */
            public Boolean call() throws Exception {
                try {
                    boolean d = CrashlyticsCore.this.f4959f.mo23035d();
                    if (!d) {
                        Logger.m6525f().mo22962k("Initialization marker file was not properly removed.");
                    }
                    return Boolean.valueOf(d);
                } catch (Exception e) {
                    Logger.m6525f().mo22957e("Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo23023n() {
        this.f4968o.mo22980b();
        this.f4959f.mo23033a();
        Logger.m6525f().mo22960i("Initialization marker file was created.");
    }

    /* renamed from: o */
    public boolean mo23024o(AppData appData, SettingsProvider settingsProvider) {
        SettingsProvider settingsProvider2 = settingsProvider;
        if (m6684j(appData.f4867b, CommonUtils.m6588k(this.f4954a, "com.crashlytics.RequireBuildId", true))) {
            String clsuuid = new CLSUUID(this.f4963j).toString();
            try {
                this.f4960g = new CrashlyticsFileMarker("crash_marker", this.f4964k);
                this.f4959f = new CrashlyticsFileMarker("initialization_marker", this.f4964k);
                UserMetadata userMetadata = new UserMetadata(clsuuid, this.f4964k, this.f4968o);
                LogFileManager logFileManager = new LogFileManager(this.f4964k);
                AppData appData2 = appData;
                LogFileManager logFileManager2 = logFileManager;
                UserMetadata userMetadata2 = userMetadata;
                SessionReportingCoordinator g = SessionReportingCoordinator.m6783g(this.f4954a, this.f4963j, this.f4964k, appData2, logFileManager2, userMetadata2, new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10)), settingsProvider, this.f4957d);
                Context context = this.f4954a;
                CrashlyticsBackgroundWorker crashlyticsBackgroundWorker = this.f4968o;
                IdManager idManager = this.f4963j;
                DataCollectionArbiter dataCollectionArbiter = this.f4956c;
                FileStore fileStore = this.f4964k;
                CrashlyticsFileMarker crashlyticsFileMarker = this.f4960g;
                UserMetadata userMetadata3 = userMetadata;
                Context context2 = context;
                String str = clsuuid;
                CrashlyticsBackgroundWorker crashlyticsBackgroundWorker2 = crashlyticsBackgroundWorker;
                IdManager idManager2 = idManager;
                DataCollectionArbiter dataCollectionArbiter2 = dataCollectionArbiter;
                FileStore fileStore2 = fileStore;
                CrashlyticsFileMarker crashlyticsFileMarker2 = crashlyticsFileMarker;
                AppData appData3 = appData;
                this.f4962i = new CrashlyticsController(context2, crashlyticsBackgroundWorker2, idManager2, dataCollectionArbiter2, fileStore2, crashlyticsFileMarker2, appData3, userMetadata3, logFileManager, g, this.f4969p, this.f4966m);
                boolean e = mo23018e();
                m6680d();
                this.f4962i.mo23000x(str, Thread.getDefaultUncaughtExceptionHandler(), settingsProvider2);
                if (!e || !CommonUtils.m6580c(this.f4954a)) {
                    Logger.m6525f().mo22954b("Successfully configured exception handler.");
                    return true;
                }
                Logger.m6525f().mo22954b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                m6682h(settingsProvider2);
                return false;
            } catch (Exception e2) {
                Logger.m6525f().mo22957e("Crashlytics was not started due to an exception during initialization", e2);
                this.f4962i = null;
                return false;
            }
        } else {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
    }

    /* renamed from: p */
    public void mo23025p(String str) {
        this.f4962i.mo22994N(str);
    }
}
