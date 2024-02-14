package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class ConfigFetchHandler {

    /* renamed from: j */
    public static final long f55243j = TimeUnit.HOURS.toSeconds(12);
    @VisibleForTesting

    /* renamed from: k */
    static final int[] f55244k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a */
    private final FirebaseInstallationsApi f55245a;

    /* renamed from: b */
    private final Provider<AnalyticsConnector> f55246b;

    /* renamed from: c */
    private final Executor f55247c;

    /* renamed from: d */
    private final Clock f55248d;

    /* renamed from: e */
    private final Random f55249e;

    /* renamed from: f */
    private final ConfigCacheClient f55250f;

    /* renamed from: g */
    private final ConfigFetchHttpClient f55251g;

    /* renamed from: h */
    private final ConfigMetadataClient f55252h;

    /* renamed from: i */
    private final Map<String, String> f55253i;

    public static class FetchResponse {

        /* renamed from: a */
        private final Date f55254a;

        /* renamed from: b */
        private final int f55255b;

        /* renamed from: c */
        private final ConfigContainer f55256c;
        @Nullable

        /* renamed from: d */
        private final String f55257d;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Status {
        }

        private FetchResponse(Date date, int i, ConfigContainer configContainer, @Nullable String str) {
            this.f55254a = date;
            this.f55255b = i;
            this.f55256c = configContainer;
            this.f55257d = str;
        }

        /* renamed from: a */
        public static FetchResponse m77287a(Date date) {
            return new FetchResponse(date, 1, (ConfigContainer) null, (String) null);
        }

        /* renamed from: b */
        public static FetchResponse m77288b(ConfigContainer configContainer, String str) {
            return new FetchResponse(configContainer.mo63539e(), 0, configContainer, str);
        }

        /* renamed from: c */
        public static FetchResponse m77289c(Date date) {
            return new FetchResponse(date, 2, (ConfigContainer) null, (String) null);
        }

        /* renamed from: d */
        public ConfigContainer mo63552d() {
            return this.f55256c;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        /* renamed from: e */
        public String mo63553e() {
            return this.f55257d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo63554f() {
            return this.f55255b;
        }
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider<AnalyticsConnector> provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigMetadataClient configMetadataClient, Map<String, String> map) {
        this.f55245a = firebaseInstallationsApi;
        this.f55246b = provider;
        this.f55247c = executor;
        this.f55248d = clock;
        this.f55249e = random;
        this.f55250f = configCacheClient;
        this.f55251g = configFetchHttpClient;
        this.f55252h = configMetadataClient;
        this.f55253i = map;
    }

    /* renamed from: e */
    private boolean m77266e(long j, Date date) {
        Date d = this.f55252h.mo63564d();
        if (d.equals(ConfigMetadataClient.f55273d)) {
            return false;
        }
        return date.before(new Date(d.getTime() + TimeUnit.SECONDS.toMillis(j)));
    }

    /* renamed from: f */
    private FirebaseRemoteConfigServerException m77267f(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int a = firebaseRemoteConfigServerException.mo63518a();
        if (a == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (a == 429) {
            throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else if (a != 500) {
            switch (a) {
                case 502:
                case 503:
                case 504:
                    str = "The server is unavailable. Please try again later.";
                    break;
                default:
                    str = "The server returned an unexpected error.";
                    break;
            }
        } else {
            str = "There was an internal server error.";
        }
        int a2 = firebaseRemoteConfigServerException.mo63518a();
        return new FirebaseRemoteConfigServerException(a2, "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    /* renamed from: g */
    private String m77268g(long j) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j))});
    }

    @WorkerThread
    /* renamed from: j */
    private FetchResponse m77269j(String str, String str2, Date date) throws FirebaseRemoteConfigException {
        try {
            FetchResponse fetch = this.f55251g.fetch(this.f55251g.mo63555d(), str, str2, m77275p(), this.f55252h.mo63563c(), this.f55253i, m77273n(), date);
            if (fetch.mo63553e() != null) {
                this.f55252h.mo63569i(fetch.mo63553e());
            }
            this.f55252h.mo63566f();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e) {
            ConfigMetadataClient.BackoffMetadata w = m77282w(e.mo63518a(), date);
            if (m77281v(w, e.mo63518a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(w.mo63573a().getTime());
            }
            throw m77267f(e);
        }
    }

    /* renamed from: k */
    private Task<FetchResponse> m77270k(String str, String str2, Date date) {
        try {
            FetchResponse j = m77269j(str, str2, date);
            if (j.mo63554f() != 0) {
                return Tasks.m66667f(j);
            }
            return this.f55250f.mo63534k(j.mo63552d()).mo23721v(this.f55247c, new C11352g(j));
        } catch (FirebaseRemoteConfigException e) {
            return Tasks.m66666e(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public Task<FetchResponse> m77277r(Task<ConfigContainer> task, long j) {
        Task<TContinuationResult> task2;
        Date date = new Date(this.f55248d.mo21950a());
        if (task.mo23719t() && m77266e(j, date)) {
            return Tasks.m66667f(FetchResponse.m77289c(date));
        }
        Date m = m77272m(date);
        if (m != null) {
            task2 = Tasks.m66666e(new FirebaseRemoteConfigFetchThrottledException(m77268g(m.getTime() - date.getTime()), m.getTime()));
        } else {
            Task<String> id = this.f55245a.getId();
            Task<InstallationTokenResult> a = this.f55245a.mo63232a(false);
            task2 = Tasks.m66671j(id, a).mo23713n(this.f55247c, new C11350e(this, id, a, date));
        }
        return task2.mo23713n(this.f55247c, new C11351f(this, date));
    }

    @Nullable
    /* renamed from: m */
    private Date m77272m(Date date) {
        Date a = this.f55252h.mo63561a().mo63573a();
        if (date.before(a)) {
            return a;
        }
        return null;
    }

    @WorkerThread
    /* renamed from: n */
    private Long m77273n() {
        AnalyticsConnector analyticsConnector = this.f55246b.get();
        if (analyticsConnector == null) {
            return null;
        }
        return (Long) analyticsConnector.mo61996d(true).get("_fot");
    }

    /* renamed from: o */
    private long m77274o(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f55244k;
        long millis = timeUnit.toMillis((long) iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f55249e.nextInt((int) millis));
    }

    @WorkerThread
    /* renamed from: p */
    private Map<String, String> m77275p() {
        HashMap hashMap = new HashMap();
        AnalyticsConnector analyticsConnector = this.f55246b.get();
        if (analyticsConnector == null) {
            return hashMap;
        }
        for (Map.Entry next : analyticsConnector.mo61996d(false).entrySet()) {
            hashMap.put((String) next.getKey(), next.getValue().toString());
        }
        return hashMap;
    }

    /* renamed from: q */
    private boolean m77276q(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ Task m77279t(Task task, Task task2, Date date, Task task3) throws Exception {
        if (!task.mo23719t()) {
            return Tasks.m66666e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.mo23714o()));
        }
        if (!task2.mo23719t()) {
            return Tasks.m66666e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.mo23714o()));
        }
        return m77270k((String) task.mo23715p(), ((InstallationTokenResult) task2.mo23715p()).mo63221b(), date);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ Task m77280u(Date date, Task task) throws Exception {
        m77284y(task, date);
        return task;
    }

    /* renamed from: v */
    private boolean m77281v(ConfigMetadataClient.BackoffMetadata backoffMetadata, int i) {
        return backoffMetadata.mo63574b() > 1 || i == 429;
    }

    /* renamed from: w */
    private ConfigMetadataClient.BackoffMetadata m77282w(int i, Date date) {
        if (m77276q(i)) {
            m77283x(date);
        }
        return this.f55252h.mo63561a();
    }

    /* renamed from: x */
    private void m77283x(Date date) {
        int b = this.f55252h.mo63561a().mo63574b() + 1;
        this.f55252h.mo63567g(b, new Date(date.getTime() + m77274o(b)));
    }

    /* renamed from: y */
    private void m77284y(Task<FetchResponse> task, Date date) {
        if (task.mo23719t()) {
            this.f55252h.mo63571k(date);
            return;
        }
        Exception o = task.mo23714o();
        if (o != null) {
            if (o instanceof FirebaseRemoteConfigFetchThrottledException) {
                this.f55252h.mo63572l();
            } else {
                this.f55252h.mo63570j();
            }
        }
    }

    /* renamed from: h */
    public Task<FetchResponse> mo63550h() {
        return mo63551i(this.f55252h.mo63565e());
    }

    /* renamed from: i */
    public Task<FetchResponse> mo63551i(long j) {
        return this.f55250f.mo63531e().mo23713n(this.f55247c, new C11349d(this, j));
    }
}
