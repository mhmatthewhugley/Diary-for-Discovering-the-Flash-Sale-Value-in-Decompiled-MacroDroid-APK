package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.google.firebase.remoteconfig.internal.Personalization;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@KeepForSdk
public class RemoteConfigComponent {

    /* renamed from: j */
    private static final Clock f55204j = DefaultClock.m4871d();

    /* renamed from: k */
    private static final Random f55205k = new Random();
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<String, FirebaseRemoteConfig> f55206a;

    /* renamed from: b */
    private final Context f55207b;

    /* renamed from: c */
    private final ExecutorService f55208c;

    /* renamed from: d */
    private final FirebaseApp f55209d;

    /* renamed from: e */
    private final FirebaseInstallationsApi f55210e;

    /* renamed from: f */
    private final FirebaseABTesting f55211f;
    @Nullable

    /* renamed from: g */
    private final Provider<AnalyticsConnector> f55212g;

    /* renamed from: h */
    private final String f55213h;
    @GuardedBy("this")

    /* renamed from: i */
    private Map<String, String> f55214i;

    RemoteConfigComponent(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider<AnalyticsConnector> provider) {
        this(context, Executors.newCachedThreadPool(), firebaseApp, firebaseInstallationsApi, firebaseABTesting, provider, true);
    }

    /* renamed from: d */
    private ConfigCacheClient m77213d(String str, String str2) {
        return ConfigCacheClient.m77235h(Executors.newCachedThreadPool(), ConfigStorageClient.m77331c(this.f55207b, String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.f55213h, str, str2})));
    }

    /* renamed from: h */
    private ConfigGetParameterHandler m77214h(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        return new ConfigGetParameterHandler(this.f55208c, configCacheClient, configCacheClient2);
    }

    @VisibleForTesting
    /* renamed from: i */
    static ConfigMetadataClient m77215i(Context context, String str, String str2) {
        return new ConfigMetadataClient(context.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", str, str2, "settings"}), 0));
    }

    @Nullable
    /* renamed from: j */
    private static Personalization m77216j(FirebaseApp firebaseApp, String str, Provider<AnalyticsConnector> provider) {
        if (!m77218l(firebaseApp) || !str.equals("firebase")) {
            return null;
        }
        return new Personalization(provider);
    }

    /* renamed from: k */
    private static boolean m77217k(FirebaseApp firebaseApp, String str) {
        return str.equals("firebase") && m77218l(firebaseApp);
    }

    /* renamed from: l */
    private static boolean m77218l(FirebaseApp firebaseApp) {
        return firebaseApp.mo61951o().equals("[DEFAULT]");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ AnalyticsConnector m77219m() {
        return null;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: b */
    public synchronized FirebaseRemoteConfig mo63523b(FirebaseApp firebaseApp, String str, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient) {
        FirebaseRemoteConfig firebaseRemoteConfig;
        String str2 = str;
        synchronized (this) {
            if (!this.f55206a.containsKey(str2)) {
                FirebaseRemoteConfig firebaseRemoteConfig2 = new FirebaseRemoteConfig(this.f55207b, firebaseApp, firebaseInstallationsApi, m77217k(firebaseApp, str) ? firebaseABTesting : null, executor, configCacheClient, configCacheClient2, configCacheClient3, configFetchHandler, configGetParameterHandler, configMetadataClient);
                firebaseRemoteConfig2.mo63517y();
                this.f55206a.put(str2, firebaseRemoteConfig2);
            }
            firebaseRemoteConfig = this.f55206a.get(str2);
        }
        return firebaseRemoteConfig;
    }

    @VisibleForTesting
    @KeepForSdk
    /* renamed from: c */
    public synchronized FirebaseRemoteConfig mo63524c(String str) {
        ConfigCacheClient d;
        ConfigCacheClient d2;
        ConfigCacheClient d3;
        ConfigMetadataClient i;
        ConfigGetParameterHandler h;
        d = m77213d(str, "fetch");
        d2 = m77213d(str, "activate");
        d3 = m77213d(str, "defaults");
        i = m77215i(this.f55207b, this.f55213h, str);
        h = m77214h(d2, d3);
        Personalization j = m77216j(this.f55209d, str, this.f55212g);
        if (j != null) {
            h.mo63557b(new C11340g(j));
        }
        return mo63523b(this.f55209d, str, this.f55210e, this.f55211f, this.f55208c, d, d2, d3, mo63526f(str, d, i), h, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public FirebaseRemoteConfig mo63525e() {
        return mo63524c("firebase");
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: f */
    public synchronized ConfigFetchHandler mo63526f(String str, ConfigCacheClient configCacheClient, ConfigMetadataClient configMetadataClient) {
        return new ConfigFetchHandler(this.f55210e, m77218l(this.f55209d) ? this.f55212g : C11341h.f55225a, this.f55208c, f55204j, f55205k, configCacheClient, mo63527g(this.f55209d.mo61952p().mo61961b(), str, configMetadataClient), configMetadataClient, this.f55214i);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: g */
    public ConfigFetchHttpClient mo63527g(String str, String str2, ConfigMetadataClient configMetadataClient) {
        return new ConfigFetchHttpClient(this.f55207b, this.f55209d.mo61952p().mo61962c(), str, str2, configMetadataClient.mo63562b(), configMetadataClient.mo63562b());
    }

    @VisibleForTesting
    protected RemoteConfigComponent(Context context, ExecutorService executorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider<AnalyticsConnector> provider, boolean z) {
        this.f55206a = new HashMap();
        this.f55214i = new HashMap();
        this.f55207b = context;
        this.f55208c = executorService;
        this.f55209d = firebaseApp;
        this.f55210e = firebaseInstallationsApi;
        this.f55211f = firebaseABTesting;
        this.f55212g = provider;
        this.f55213h = firebaseApp.mo61952p().mo61962c();
        if (z) {
            Tasks.m66664c(executorService, new C11342i(this));
        }
    }
}
