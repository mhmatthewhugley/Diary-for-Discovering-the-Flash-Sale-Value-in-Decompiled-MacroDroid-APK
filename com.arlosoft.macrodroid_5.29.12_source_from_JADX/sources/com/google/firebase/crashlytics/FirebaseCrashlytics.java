package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.ExecutorUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class FirebaseCrashlytics {
    @VisibleForTesting

    /* renamed from: a */
    final CrashlyticsCore f4834a;

    private FirebaseCrashlytics(@NonNull CrashlyticsCore crashlyticsCore) {
        this.f4834a = crashlyticsCore;
    }

    @NonNull
    /* renamed from: a */
    public static FirebaseCrashlytics m6487a() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.m74383m().mo61949j(FirebaseCrashlytics.class);
        Objects.requireNonNull(firebaseCrashlytics, "FirebaseCrashlytics component is not present.");
        return firebaseCrashlytics;
    }

    @Nullable
    /* renamed from: b */
    static FirebaseCrashlytics m6488b(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseInstallationsApi firebaseInstallationsApi, @NonNull Deferred<CrashlyticsNativeComponent> deferred, @NonNull Deferred<AnalyticsConnector> deferred2) {
        Context l = firebaseApp.mo61950l();
        String packageName = l.getPackageName();
        Logger f = Logger.m6525f();
        f.mo22958g("Initializing Firebase Crashlytics " + CrashlyticsCore.m6683i() + " for " + packageName);
        FileStore fileStore = new FileStore(l);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
        IdManager idManager = new IdManager(l, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = new CrashlyticsNativeComponentDeferredProxy(deferred);
        AnalyticsDeferredProxy analyticsDeferredProxy = new AnalyticsDeferredProxy(deferred2);
        FirebaseApp firebaseApp2 = firebaseApp;
        IdManager idManager2 = idManager;
        DataCollectionArbiter dataCollectionArbiter2 = dataCollectionArbiter;
        final CrashlyticsCore crashlyticsCore = new CrashlyticsCore(firebaseApp2, idManager2, crashlyticsNativeComponentDeferredProxy, dataCollectionArbiter2, analyticsDeferredProxy.mo22931e(), analyticsDeferredProxy.mo22930d(), fileStore, ExecutorUtils.m6744c("Crashlytics Exception Handler"));
        String c = firebaseApp.mo61952p().mo61962c();
        String n = CommonUtils.m6591n(l);
        Logger f2 = Logger.m6525f();
        f2.mo22954b("Mapping file ID is: " + n);
        try {
            AppData a = AppData.m6556a(l, idManager, c, n, new DevelopmentPlatformProvider(l));
            Logger f3 = Logger.m6525f();
            f3.mo22960i("Installer package name is: " + a.f4868c);
            ExecutorService c2 = ExecutorUtils.m6744c("com.google.firebase.crashlytics.startup");
            final SettingsController l2 = SettingsController.m7597l(l, c, idManager, new HttpRequestFactory(), a.f4870e, a.f4871f, fileStore, dataCollectionArbiter);
            l2.mo23529p(c2).mo23711l(c2, new Continuation<Void, Object>() {
                /* renamed from: a */
                public Object mo21119a(@NonNull Task<Void> task) throws Exception {
                    if (task.mo23719t()) {
                        return null;
                    }
                    Logger.m6525f().mo22957e("Error fetching settings.", task.mo23714o());
                    return null;
                }
            });
            final boolean o = crashlyticsCore.mo23024o(a, l2);
            Tasks.m66664c(c2, new Callable<Void>() {
                /* renamed from: a */
                public Void call() throws Exception {
                    if (!o) {
                        return null;
                    }
                    crashlyticsCore.mo23019g(l2);
                    return null;
                }
            });
            return new FirebaseCrashlytics(crashlyticsCore);
        } catch (PackageManager.NameNotFoundException e) {
            Logger.m6525f().mo22957e("Error retrieving app package info.", e);
            return null;
        }
    }

    /* renamed from: c */
    public void mo22935c(@NonNull String str) {
        this.f4834a.mo23020k(str);
    }

    /* renamed from: d */
    public void mo22936d(@NonNull Throwable th) {
        if (th == null) {
            Logger.m6525f().mo22962k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f4834a.mo23021l(th);
        }
    }

    /* renamed from: e */
    public void mo22937e(@NonNull String str) {
        this.f4834a.mo23025p(str);
    }
}
