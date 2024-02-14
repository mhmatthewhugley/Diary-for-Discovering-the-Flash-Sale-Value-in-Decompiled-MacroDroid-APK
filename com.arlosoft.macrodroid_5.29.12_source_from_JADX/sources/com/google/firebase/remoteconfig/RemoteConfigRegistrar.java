package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.component.AbtComponent;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* access modifiers changed from: private */
    public static /* synthetic */ RemoteConfigComponent lambda$getComponents$0(ComponentContainer componentContainer) {
        return new RemoteConfigComponent((Context) componentContainer.mo22868a(Context.class), (FirebaseApp) componentContainer.mo22868a(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.mo22868a(FirebaseInstallationsApi.class), ((AbtComponent) componentContainer.mo22868a(AbtComponent.class)).mo61988b("frc"), componentContainer.mo22887d(AnalyticsConnector.class));
    }

    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.m6343c(RemoteConfigComponent.class).mo22885h(LIBRARY_NAME).mo22880b(Dependency.m6427j(Context.class)).mo22880b(Dependency.m6427j(FirebaseApp.class)).mo22880b(Dependency.m6427j(FirebaseInstallationsApi.class)).mo22880b(Dependency.m6427j(AbtComponent.class)).mo22880b(Dependency.m6426i(AnalyticsConnector.class)).mo22884f(C11354j.f55303a).mo22883e().mo22882d(), LibraryVersionComponent.m77170b(LIBRARY_NAME, "21.2.0")});
    }
}
