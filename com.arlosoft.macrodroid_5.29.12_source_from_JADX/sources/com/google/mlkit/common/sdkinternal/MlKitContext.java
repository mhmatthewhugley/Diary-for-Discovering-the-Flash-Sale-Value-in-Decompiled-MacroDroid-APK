package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentRuntime;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class MlKitContext {

    /* renamed from: b */
    private static final Object f56299b = new Object();
    @Nullable

    /* renamed from: c */
    private static MlKitContext f56300c;
    @Nullable

    /* renamed from: a */
    private ComponentRuntime f56301a;

    private MlKitContext() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public static MlKitContext m79040c() {
        MlKitContext mlKitContext;
        synchronized (f56299b) {
            Preconditions.m4494q(f56300c != null, "MlKitContext has not been initialized");
            mlKitContext = (MlKitContext) Preconditions.m4488k(f56300c);
        }
        return mlKitContext;
    }

    @NonNull
    /* renamed from: d */
    public static MlKitContext m79041d(@NonNull Context context) {
        MlKitContext mlKitContext;
        synchronized (f56299b) {
            Preconditions.m4494q(f56300c == null, "MlKitContext is already initialized");
            MlKitContext mlKitContext2 = new MlKitContext();
            f56300c = mlKitContext2;
            Context e = m79042e(context);
            ComponentRuntime e2 = ComponentRuntime.m6388i(TaskExecutors.f47996a).mo22897d(ComponentDiscovery.m6375c(e, MlKitComponentDiscoveryService.class).mo22889b()).mo22895b(Component.m6349q(e, Context.class, new Class[0])).mo22895b(Component.m6349q(mlKitContext2, MlKitContext.class, new Class[0])).mo22898e();
            mlKitContext2.f56301a = e2;
            e2.mo22894l(true);
            mlKitContext = f56300c;
        }
        return mlKitContext;
    }

    /* renamed from: e */
    private static Context m79042e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public <T> T mo64553a(@NonNull Class<T> cls) {
        Preconditions.m4494q(f56300c == this, "MlKitContext has been deleted");
        Preconditions.m4488k(this.f56301a);
        return this.f56301a.mo22868a(cls);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public Context mo64554b() {
        return (Context) mo64553a(Context.class);
    }
}
