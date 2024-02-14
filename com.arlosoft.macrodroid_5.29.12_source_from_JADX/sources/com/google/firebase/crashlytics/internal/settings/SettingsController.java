package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public class SettingsController implements SettingsProvider {

    /* renamed from: a */
    private final Context f5496a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final SettingsRequest f5497b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final SettingsJsonParser f5498c;

    /* renamed from: d */
    private final CurrentTimeProvider f5499d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final CachedSettingsIo f5500e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final SettingsSpiCall f5501f;

    /* renamed from: g */
    private final DataCollectionArbiter f5502g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final AtomicReference<Settings> f5503h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AtomicReference<TaskCompletionSource<Settings>> f5504i = new AtomicReference<>(new TaskCompletionSource());

    SettingsController(Context context, SettingsRequest settingsRequest, CurrentTimeProvider currentTimeProvider, SettingsJsonParser settingsJsonParser, CachedSettingsIo cachedSettingsIo, SettingsSpiCall settingsSpiCall, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference<Settings> atomicReference = new AtomicReference<>();
        this.f5503h = atomicReference;
        this.f5496a = context;
        this.f5497b = settingsRequest;
        this.f5499d = currentTimeProvider;
        this.f5498c = settingsJsonParser;
        this.f5500e = cachedSettingsIo;
        this.f5501f = settingsSpiCall;
        this.f5502g = dataCollectionArbiter;
        atomicReference.set(DefaultSettingsJsonTransform.m7578b(currentTimeProvider));
    }

    /* renamed from: l */
    public static SettingsController m7597l(Context context, String str, IdManager idManager, HttpRequestFactory httpRequestFactory, String str2, String str3, FileStore fileStore, DataCollectionArbiter dataCollectionArbiter) {
        String g = idManager.mo23051g();
        SystemCurrentTimeProvider systemCurrentTimeProvider = new SystemCurrentTimeProvider();
        SettingsJsonParser settingsJsonParser = new SettingsJsonParser(systemCurrentTimeProvider);
        CachedSettingsIo cachedSettingsIo = new CachedSettingsIo(fileStore);
        DefaultSettingsSpiCall defaultSettingsSpiCall = new DefaultSettingsSpiCall(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[]{str}), httpRequestFactory);
        String h = idManager.mo23052h();
        String i = idManager.mo23053i();
        String j = idManager.mo23054j();
        String h2 = CommonUtils.m6585h(CommonUtils.m6591n(context), str, str3, str2);
        return new SettingsController(context, new SettingsRequest(str, h, i, j, idManager, h2, str3, str2, DeliveryMechanism.m6740b(g).mo23046d()), systemCurrentTimeProvider, settingsJsonParser, cachedSettingsIo, defaultSettingsSpiCall, dataCollectionArbiter);
    }

    /* renamed from: m */
    private Settings m7598m(SettingsCacheBehavior settingsCacheBehavior) {
        Settings settings = null;
        try {
            if (SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                return null;
            }
            JSONObject b = this.f5500e.mo23517b();
            if (b != null) {
                Settings b2 = this.f5498c.mo23531b(b);
                if (b2 != null) {
                    m7600q(b, "Loaded cached settings: ");
                    long a = this.f5499d.mo23041a();
                    if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior)) {
                        if (b2.mo23524a(a)) {
                            Logger.m6525f().mo22960i("Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        Logger.m6525f().mo22960i("Returning cached settings.");
                        return b2;
                    } catch (Exception e) {
                        e = e;
                        settings = b2;
                        Logger.m6525f().mo22957e("Failed to get cached settings", e);
                        return settings;
                    }
                } else {
                    Logger.m6525f().mo22957e("Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                Logger.m6525f().mo22954b("No cached settings data found.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            Logger.m6525f().mo22957e("Failed to get cached settings", e);
            return settings;
        }
    }

    /* renamed from: n */
    private String m7599n() {
        return CommonUtils.m6595r(this.f5496a).getString("existing_instance_identifier", "");
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m7600q(JSONObject jSONObject, String str) throws JSONException {
        Logger f = Logger.m6525f();
        f.mo22954b(str + jSONObject.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public boolean m7601r(String str) {
        SharedPreferences.Editor edit = CommonUtils.m6595r(this.f5496a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    /* renamed from: a */
    public Task<Settings> mo23525a() {
        return this.f5504i.get().mo56137a();
    }

    /* renamed from: b */
    public Settings mo23526b() {
        return this.f5503h.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo23527k() {
        return !m7599n().equals(this.f5497b.f5512f);
    }

    /* renamed from: o */
    public Task<Void> mo23528o(SettingsCacheBehavior settingsCacheBehavior, Executor executor) {
        Settings m;
        if (mo23527k() || (m = m7598m(settingsCacheBehavior)) == null) {
            Settings m2 = m7598m(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
            if (m2 != null) {
                this.f5503h.set(m2);
                this.f5504i.get().mo56141e(m2);
            }
            return this.f5502g.mo23045h(executor).mo23721v(executor, new SuccessContinuation<Void, Void>() {
                @NonNull
                /* renamed from: b */
                public Task<Void> mo21121a(@Nullable Void voidR) throws Exception {
                    JSONObject a = SettingsController.this.f5501f.mo23520a(SettingsController.this.f5497b, true);
                    if (a != null) {
                        Settings b = SettingsController.this.f5498c.mo23531b(a);
                        SettingsController.this.f5500e.mo23518c(b.f5482c, a);
                        SettingsController.this.m7600q(a, "Loaded settings: ");
                        SettingsController settingsController = SettingsController.this;
                        boolean unused = settingsController.m7601r(settingsController.f5497b.f5512f);
                        SettingsController.this.f5503h.set(b);
                        ((TaskCompletionSource) SettingsController.this.f5504i.get()).mo56141e(b);
                    }
                    return Tasks.m66667f(null);
                }
            });
        }
        this.f5503h.set(m);
        this.f5504i.get().mo56141e(m);
        return Tasks.m66667f(null);
    }

    /* renamed from: p */
    public Task<Void> mo23529p(Executor executor) {
        return mo23528o(SettingsCacheBehavior.USE_CACHE, executor);
    }
}
