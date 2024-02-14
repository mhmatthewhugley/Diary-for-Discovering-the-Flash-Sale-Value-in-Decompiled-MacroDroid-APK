package com.google.firebase.crashlytics;

import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public FirebaseCrashlytics m6486b(ComponentContainer componentContainer) {
        return FirebaseCrashlytics.m6488b((FirebaseApp) componentContainer.mo22868a(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.mo22868a(FirebaseInstallationsApi.class), componentContainer.mo22888e(CrashlyticsNativeComponent.class), componentContainer.mo22888e(AnalyticsConnector.class));
    }

    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.m6343c(FirebaseCrashlytics.class).mo22885h("fire-cls").mo22880b(Dependency.m6427j(FirebaseApp.class)).mo22880b(Dependency.m6427j(FirebaseInstallationsApi.class)).mo22880b(Dependency.m6423a(CrashlyticsNativeComponent.class)).mo22880b(Dependency.m6423a(AnalyticsConnector.class)).mo22884f(new C1841d(this)).mo22883e().mo22882d(), LibraryVersionComponent.m77170b("fire-cls", "18.3.2")});
    }
}
