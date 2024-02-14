package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Keep
    @NonNull
    @KeepForSdk
    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.m6343c(AnalyticsConnector.class).mo22880b(Dependency.m6427j(FirebaseApp.class)).mo22880b(Dependency.m6427j(Context.class)).mo22880b(Dependency.m6427j(Subscriber.class)).mo22884f(zzb.f53804a).mo22883e().mo22882d(), LibraryVersionComponent.m77170b("fire-analytics", "21.2.0")});
    }
}
