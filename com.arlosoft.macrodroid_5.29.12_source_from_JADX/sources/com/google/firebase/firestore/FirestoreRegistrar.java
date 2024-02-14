package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RestrictTo;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.firestore.remote.FirebaseClientGrpcMetadataProvider;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

@Keep
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FirestoreRegistrar implements ComponentRegistrar {
    static /* synthetic */ FirestoreMultiDbComponent lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirestoreMultiDbComponent((Context) componentContainer.mo22868a(Context.class), (FirebaseApp) componentContainer.mo22868a(FirebaseApp.class), componentContainer.mo22888e(InternalAuthProvider.class), new FirebaseClientGrpcMetadataProvider(componentContainer.mo22887d(UserAgentPublisher.class), componentContainer.mo22887d(HeartBeatInfo.class), (FirebaseOptions) componentContainer.mo22868a(FirebaseOptions.class)));
    }

    @Keep
    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.m6343c(FirestoreMultiDbComponent.class).mo22880b(Dependency.m6427j(FirebaseApp.class)).mo22880b(Dependency.m6427j(Context.class)).mo22880b(Dependency.m6426i(HeartBeatInfo.class)).mo22880b(Dependency.m6426i(UserAgentPublisher.class)).mo22880b(Dependency.m6423a(InternalAuthProvider.class)).mo22880b(Dependency.m6425h(FirebaseOptions.class)).mo22884f(FirestoreRegistrar$$Lambda$1.m7869b()).mo22882d(), LibraryVersionComponent.m77170b("fire-fst", "22.1.2")});
    }
}
