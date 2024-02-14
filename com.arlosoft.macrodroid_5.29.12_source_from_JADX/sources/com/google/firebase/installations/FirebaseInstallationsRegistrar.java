package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseInstallationsApi lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirebaseInstallations((FirebaseApp) componentContainer.mo22868a(FirebaseApp.class), componentContainer.mo22887d(HeartBeatController.class));
    }

    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.m6343c(FirebaseInstallationsApi.class).mo22885h(LIBRARY_NAME).mo22880b(Dependency.m6427j(FirebaseApp.class)).mo22880b(Dependency.m6426i(HeartBeatController.class)).mo22884f(C11274e.f54866a).mo22882d(), HeartBeatConsumerComponent.m76553a(), LibraryVersionComponent.m77170b(LIBRARY_NAME, "17.1.0")});
    }
}
