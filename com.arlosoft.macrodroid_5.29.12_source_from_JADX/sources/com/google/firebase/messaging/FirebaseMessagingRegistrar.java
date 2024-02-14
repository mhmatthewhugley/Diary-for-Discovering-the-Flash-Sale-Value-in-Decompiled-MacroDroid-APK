package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirebaseMessaging((FirebaseApp) componentContainer.mo22868a(FirebaseApp.class), (FirebaseInstanceIdInternal) componentContainer.mo22868a(FirebaseInstanceIdInternal.class), componentContainer.mo22887d(UserAgentPublisher.class), componentContainer.mo22887d(HeartBeatInfo.class), (FirebaseInstallationsApi) componentContainer.mo22868a(FirebaseInstallationsApi.class), (TransportFactory) componentContainer.mo22868a(TransportFactory.class), (Subscriber) componentContainer.mo22868a(Subscriber.class));
    }

    @Keep
    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.m6343c(FirebaseMessaging.class).mo22885h(LIBRARY_NAME).mo22880b(Dependency.m6427j(FirebaseApp.class)).mo22880b(Dependency.m6425h(FirebaseInstanceIdInternal.class)).mo22880b(Dependency.m6426i(UserAgentPublisher.class)).mo22880b(Dependency.m6426i(HeartBeatInfo.class)).mo22880b(Dependency.m6425h(TransportFactory.class)).mo22880b(Dependency.m6427j(FirebaseInstallationsApi.class)).mo22880b(Dependency.m6427j(Subscriber.class)).mo22884f(C11316q.f55109a).mo22881c().mo22882d(), LibraryVersionComponent.m77170b(LIBRARY_NAME, "23.1.0")});
    }
}
