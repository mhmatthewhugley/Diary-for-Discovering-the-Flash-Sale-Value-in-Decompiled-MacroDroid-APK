package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AnalyticsDeferredProxy {

    /* renamed from: a */
    private final Deferred<AnalyticsConnector> f4827a;

    /* renamed from: b */
    private volatile AnalyticsEventLogger f4828b;

    /* renamed from: c */
    private volatile BreadcrumbSource f4829c;
    @GuardedBy("this")

    /* renamed from: d */
    private final List<BreadcrumbHandler> f4830d;

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred) {
        this(deferred, new DisabledBreadcrumbSource(), new UnavailableAnalyticsEventLogger());
    }

    /* renamed from: f */
    private void m6473f() {
        this.f4827a.mo22924a(new C1840c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m6474g(String str, Bundle bundle) {
        this.f4828b.mo22940a(str, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m6475h(BreadcrumbHandler breadcrumbHandler) {
        synchronized (this) {
            if (this.f4829c instanceof DisabledBreadcrumbSource) {
                this.f4830d.add(breadcrumbHandler);
            }
            this.f4829c.mo22941a(breadcrumbHandler);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m6476i(Provider provider) {
        Logger.m6525f().mo22954b("AnalyticsConnector now available.");
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        CrashlyticsAnalyticsListener crashlyticsAnalyticsListener = new CrashlyticsAnalyticsListener();
        if (m6477j(analyticsConnector, crashlyticsAnalyticsListener) != null) {
            Logger.m6525f().mo22954b("Registered Firebase Analytics listener.");
            BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
            BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (BreadcrumbHandler a : this.f4830d) {
                    breadcrumbAnalyticsEventReceiver.mo22941a(a);
                }
                crashlyticsAnalyticsListener.mo22933d(breadcrumbAnalyticsEventReceiver);
                crashlyticsAnalyticsListener.mo22934e(blockingAnalyticsEventLogger);
                this.f4829c = breadcrumbAnalyticsEventReceiver;
                this.f4828b = blockingAnalyticsEventLogger;
            }
            return;
        }
        Logger.m6525f().mo22962k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    @DeferredApi
    /* renamed from: j */
    private static AnalyticsConnector.AnalyticsConnectorHandle m6477j(@NonNull AnalyticsConnector analyticsConnector, @NonNull CrashlyticsAnalyticsListener crashlyticsAnalyticsListener) {
        AnalyticsConnector.AnalyticsConnectorHandle g = analyticsConnector.mo61999g("clx", crashlyticsAnalyticsListener);
        if (g == null) {
            Logger.m6525f().mo22954b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            g = analyticsConnector.mo61999g("crash", crashlyticsAnalyticsListener);
            if (g != null) {
                Logger.m6525f().mo22962k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return g;
    }

    /* renamed from: d */
    public AnalyticsEventLogger mo22930d() {
        return new C1838a(this);
    }

    /* renamed from: e */
    public BreadcrumbSource mo22931e() {
        return new C1839b(this);
    }

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred, @NonNull BreadcrumbSource breadcrumbSource, @NonNull AnalyticsEventLogger analyticsEventLogger) {
        this.f4827a = deferred;
        this.f4829c = breadcrumbSource;
        this.f4830d = new ArrayList();
        this.f4828b = analyticsEventLogger;
        m6473f();
    }
}
