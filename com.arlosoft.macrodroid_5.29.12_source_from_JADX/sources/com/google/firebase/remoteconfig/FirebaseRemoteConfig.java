package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.XmlRes;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseRemoteConfig {

    /* renamed from: l */
    public static final byte[] f55188l = new byte[0];

    /* renamed from: a */
    private final Context f55189a;

    /* renamed from: b */
    private final FirebaseApp f55190b;
    @Nullable

    /* renamed from: c */
    private final FirebaseABTesting f55191c;

    /* renamed from: d */
    private final Executor f55192d;

    /* renamed from: e */
    private final ConfigCacheClient f55193e;

    /* renamed from: f */
    private final ConfigCacheClient f55194f;

    /* renamed from: g */
    private final ConfigCacheClient f55195g;

    /* renamed from: h */
    private final ConfigFetchHandler f55196h;

    /* renamed from: i */
    private final ConfigGetParameterHandler f55197i;

    /* renamed from: j */
    private final ConfigMetadataClient f55198j;

    /* renamed from: k */
    private final FirebaseInstallationsApi f55199k;

    FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, @Nullable FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient) {
        this.f55189a = context;
        this.f55190b = firebaseApp;
        this.f55199k = firebaseInstallationsApi;
        this.f55191c = firebaseABTesting;
        this.f55192d = executor;
        this.f55193e = configCacheClient;
        this.f55194f = configCacheClient2;
        this.f55195g = configCacheClient3;
        this.f55196h = configFetchHandler;
        this.f55197i = configGetParameterHandler;
        this.f55198j = configMetadataClient;
    }

    @NonNull
    /* renamed from: k */
    public static FirebaseRemoteConfig m77184k() {
        return m77185l(FirebaseApp.m74383m());
    }

    @NonNull
    /* renamed from: l */
    public static FirebaseRemoteConfig m77185l(@NonNull FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent) firebaseApp.mo61949j(RemoteConfigComponent.class)).mo63525e();
    }

    /* renamed from: o */
    private static boolean m77186o(ConfigContainer configContainer, @Nullable ConfigContainer configContainer2) {
        return configContainer2 == null || !configContainer.mo63539e().equals(configContainer2.mo63539e());
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Task m77187p(Task task, Task task2, Task task3) throws Exception {
        if (!task.mo23719t() || task.mo23715p() == null) {
            return Tasks.m66667f(Boolean.FALSE);
        }
        ConfigContainer configContainer = (ConfigContainer) task.mo23715p();
        if (!task2.mo23719t() || m77186o(configContainer, (ConfigContainer) task2.mo23715p())) {
            return this.f55194f.mo63534k(configContainer).mo23711l(this.f55192d, new C11334a(this));
        }
        return Tasks.m66667f(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Task m77189r(Void voidR) throws Exception {
        return mo63509g();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Void m77190s(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) throws Exception {
        this.f55198j.mo63568h(firebaseRemoteConfigSettings);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public boolean m77192u(Task<ConfigContainer> task) {
        if (!task.mo23719t()) {
            return false;
        }
        this.f55193e.mo63530d();
        if (task.mo23715p() != null) {
            mo63508A(task.mo23715p().mo63537c());
            return true;
        }
        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
        return true;
    }

    /* renamed from: x */
    private Task<Void> m77193x(Map<String, String> map) {
        try {
            return this.f55195g.mo63534k(ConfigContainer.m77251g().mo63545b(map).mo63544a()).mo23720u(C11337d.f55220a);
        } catch (JSONException e) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e);
            return Tasks.m66667f(null);
        }
    }

    @VisibleForTesting
    /* renamed from: z */
    static List<Map<String, String>> m77194z(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: A */
    public void mo63508A(@NonNull JSONArray jSONArray) {
        if (this.f55191c != null) {
            try {
                this.f55191c.mo61986k(m77194z(jSONArray));
            } catch (JSONException e) {
                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e);
            } catch (AbtException e2) {
                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
            }
        }
    }

    @NonNull
    /* renamed from: g */
    public Task<Boolean> mo63509g() {
        Task<ConfigContainer> e = this.f55193e.mo63531e();
        Task<ConfigContainer> e2 = this.f55194f.mo63531e();
        return Tasks.m66671j(e, e2).mo23713n(this.f55192d, new C11335b(this, e, e2));
    }

    @NonNull
    /* renamed from: h */
    public Task<Void> mo63510h() {
        return this.f55196h.mo63550h().mo23720u(C11338e.f55221a);
    }

    @NonNull
    /* renamed from: i */
    public Task<Boolean> mo63511i() {
        return mo63510h().mo23721v(this.f55192d, new C11336c(this));
    }

    /* renamed from: j */
    public boolean mo63512j(@NonNull String str) {
        return this.f55197i.mo63558d(str);
    }

    /* renamed from: m */
    public long mo63513m(@NonNull String str) {
        return this.f55197i.mo63559f(str);
    }

    @NonNull
    /* renamed from: n */
    public String mo63514n(@NonNull String str) {
        return this.f55197i.mo63560h(str);
    }

    @NonNull
    /* renamed from: v */
    public Task<Void> mo63515v(@NonNull FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return Tasks.m66664c(this.f55192d, new C11339f(this, firebaseRemoteConfigSettings));
    }

    @NonNull
    /* renamed from: w */
    public Task<Void> mo63516w(@XmlRes int i) {
        return m77193x(DefaultsXmlParser.m77336a(this.f55189a, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo63517y() {
        this.f55194f.mo63531e();
        this.f55195g.mo63531e();
        this.f55193e.mo63531e();
    }
}
