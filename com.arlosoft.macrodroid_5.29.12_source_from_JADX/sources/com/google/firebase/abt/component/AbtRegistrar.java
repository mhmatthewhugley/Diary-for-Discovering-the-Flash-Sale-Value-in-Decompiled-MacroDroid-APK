package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import p485z5.C17518a;

@Keep
public class AbtRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    public static /* synthetic */ AbtComponent lambda$getComponents$0(ComponentContainer componentContainer) {
        return new AbtComponent((Context) componentContainer.mo22868a(Context.class), componentContainer.mo22887d(AnalyticsConnector.class));
    }

    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.m6343c(AbtComponent.class).mo22880b(Dependency.m6427j(Context.class)).mo22880b(Dependency.m6426i(AnalyticsConnector.class)).mo22884f(C17518a.f69348a).mo22882d(), LibraryVersionComponent.m77170b("fire-abt", "21.0.2")});
    }
}
