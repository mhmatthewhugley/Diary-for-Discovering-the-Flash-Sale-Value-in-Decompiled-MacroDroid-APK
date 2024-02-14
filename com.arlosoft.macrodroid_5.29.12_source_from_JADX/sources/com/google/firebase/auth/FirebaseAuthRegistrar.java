package com.google.firebase.auth;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.auth.internal.zzv;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    static /* synthetic */ FirebaseAuth lambda$getComponents$0(ComponentContainer componentContainer) {
        return new zzv((FirebaseApp) componentContainer.mo22868a(FirebaseApp.class), componentContainer.mo22887d(HeartBeatController.class));
    }

    @NonNull
    @Keep
    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.m6344d(FirebaseAuth.class, InternalAuthProvider.class).mo22880b(Dependency.m6427j(FirebaseApp.class)).mo22880b(Dependency.m6428k(HeartBeatController.class)).mo22884f(zzx.f4746a).mo22883e().mo22882d(), HeartBeatConsumerComponent.m76553a(), LibraryVersionComponent.m77170b("fire-auth", "21.1.0")});
    }
}
