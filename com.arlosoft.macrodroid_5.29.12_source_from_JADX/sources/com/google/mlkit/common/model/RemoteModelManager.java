package com.google.mlkit.common.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.inject.Provider;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public class RemoteModelManager {

    /* renamed from: a */
    private final Map f56283a = new HashMap();

    @KeepForSdk
    /* compiled from: com.google.mlkit:common@@18.5.0 */
    public static class RemoteModelManagerRegistration {

        /* renamed from: a */
        private final Class f56284a;

        /* renamed from: b */
        private final Provider f56285b;

        @KeepForSdk
        public <RemoteT extends RemoteModel> RemoteModelManagerRegistration(@NonNull Class<RemoteT> cls, @NonNull Provider<? extends RemoteModelManagerInterface<RemoteT>> provider) {
            this.f56284a = cls;
            this.f56285b = provider;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Provider mo64537a() {
            return this.f56285b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final Class mo64538b() {
            return this.f56284a;
        }
    }

    @KeepForSdk
    public RemoteModelManager(@NonNull Set<RemoteModelManagerRegistration> set) {
        for (RemoteModelManagerRegistration next : set) {
            this.f56283a.put(next.mo64538b(), next.mo64537a());
        }
    }

    @NonNull
    /* renamed from: b */
    public static synchronized RemoteModelManager m79019b() {
        RemoteModelManager remoteModelManager;
        Class cls = RemoteModelManager.class;
        synchronized (cls) {
            remoteModelManager = (RemoteModelManager) MlKitContext.m79040c().mo64553a(cls);
        }
        return remoteModelManager;
    }

    @NonNull
    /* renamed from: a */
    public <T extends RemoteModel> Task<Set<T>> mo64536a(@NonNull Class<T> cls) {
        return ((RemoteModelManagerInterface) ((Provider) Preconditions.m4488k((Provider) this.f56283a.get(cls))).get()).mo64515a();
    }
}
