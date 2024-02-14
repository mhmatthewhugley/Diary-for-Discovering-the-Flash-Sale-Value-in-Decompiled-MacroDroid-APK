package com.google.firebase.crashlytics.internal;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public final class CrashlyticsNativeComponentDeferredProxy implements CrashlyticsNativeComponent {

    /* renamed from: c */
    private static final NativeSessionFileProvider f4842c = new MissingNativeSessionFileProvider();

    /* renamed from: a */
    private final Deferred<CrashlyticsNativeComponent> f4843a;

    /* renamed from: b */
    private final AtomicReference<CrashlyticsNativeComponent> f4844b = new AtomicReference<>((Object) null);

    private static final class MissingNativeSessionFileProvider implements NativeSessionFileProvider {
        private MissingNativeSessionFileProvider() {
        }

        /* renamed from: a */
        public File mo22946a() {
            return null;
        }

        /* renamed from: b */
        public File mo22947b() {
            return null;
        }

        /* renamed from: c */
        public File mo22948c() {
            return null;
        }

        /* renamed from: d */
        public File mo22949d() {
            return null;
        }

        /* renamed from: e */
        public File mo22950e() {
            return null;
        }

        /* renamed from: f */
        public File mo22951f() {
            return null;
        }
    }

    public CrashlyticsNativeComponentDeferredProxy(Deferred<CrashlyticsNativeComponent> deferred) {
        this.f4843a = deferred;
        deferred.mo22924a(new C1844a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m6504g(Provider provider) {
        Logger.m6525f().mo22954b("Crashlytics native component now available.");
        this.f4844b.set((CrashlyticsNativeComponent) provider.get());
    }

    @NonNull
    /* renamed from: a */
    public NativeSessionFileProvider mo22942a(@NonNull String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.f4844b.get();
        if (crashlyticsNativeComponent == null) {
            return f4842c;
        }
        return crashlyticsNativeComponent.mo22942a(str);
    }

    /* renamed from: b */
    public boolean mo22943b() {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.f4844b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.mo22943b();
    }

    /* renamed from: c */
    public void mo22944c(@NonNull String str, @NonNull String str2, long j, @NonNull StaticSessionData staticSessionData) {
        Logger f = Logger.m6525f();
        f.mo22960i("Deferring native open session: " + str);
        this.f4843a.mo22924a(new C1845b(str, str2, j, staticSessionData));
    }

    /* renamed from: d */
    public boolean mo22945d(@NonNull String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.f4844b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.mo22945d(str);
    }
}
