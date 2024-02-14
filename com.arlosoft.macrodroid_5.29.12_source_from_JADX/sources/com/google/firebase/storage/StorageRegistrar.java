package com.google.firebase.storage;

import androidx.annotation.Keep;
import androidx.annotation.RestrictTo;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.interop.InternalAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

@Keep
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseStorageComponent lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirebaseStorageComponent((FirebaseApp) componentContainer.mo22868a(FirebaseApp.class), componentContainer.mo22887d(InternalAuthProvider.class), componentContainer.mo22887d(InternalAppCheckTokenProvider.class));
    }

    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.m6343c(FirebaseStorageComponent.class).mo22885h(LIBRARY_NAME).mo22880b(Dependency.m6427j(FirebaseApp.class)).mo22880b(Dependency.m6426i(InternalAuthProvider.class)).mo22880b(Dependency.m6426i(InternalAppCheckTokenProvider.class)).mo22884f(C11368a.f55464a).mo22882d(), LibraryVersionComponent.m77170b(LIBRARY_NAME, "20.1.0")});
    }
}
