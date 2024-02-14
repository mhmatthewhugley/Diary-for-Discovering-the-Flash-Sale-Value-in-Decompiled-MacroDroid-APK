package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

public class ConfigGetParameterHandler {
    @VisibleForTesting(otherwise = 3)

    /* renamed from: e */
    public static final Charset f55266e = Charset.forName("UTF-8");

    /* renamed from: f */
    static final Pattern f55267f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g */
    static final Pattern f55268g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a */
    private final Set<BiConsumer<String, ConfigContainer>> f55269a = new HashSet();

    /* renamed from: b */
    private final Executor f55270b;

    /* renamed from: c */
    private final ConfigCacheClient f55271c;

    /* renamed from: d */
    private final ConfigCacheClient f55272d;

    public ConfigGetParameterHandler(Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.f55270b = executor;
        this.f55271c = configCacheClient;
        this.f55272d = configCacheClient2;
    }

    /* renamed from: c */
    private void m77307c(String str, ConfigContainer configContainer) {
        if (configContainer != null) {
            synchronized (this.f55269a) {
                for (BiConsumer<String, ConfigContainer> hVar : this.f55269a) {
                    this.f55270b.execute(new C11353h(hVar, str, configContainer));
                }
            }
        }
    }

    @Nullable
    /* renamed from: e */
    private static ConfigContainer m77308e(ConfigCacheClient configCacheClient) {
        return configCacheClient.mo63532f();
    }

    @Nullable
    /* renamed from: g */
    private static Long m77309g(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer e = m77308e(configCacheClient);
        if (e == null) {
            return null;
        }
        try {
            return Long.valueOf(e.mo63538d().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: i */
    private static String m77310i(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer e = m77308e(configCacheClient);
        if (e == null) {
            return null;
        }
        try {
            return e.mo63538d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: k */
    private static void m77312k(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", new Object[]{str2, str}));
    }

    /* renamed from: b */
    public void mo63557b(BiConsumer<String, ConfigContainer> biConsumer) {
        synchronized (this.f55269a) {
            this.f55269a.add(biConsumer);
        }
    }

    /* renamed from: d */
    public boolean mo63558d(String str) {
        String i = m77310i(this.f55271c, str);
        if (i != null) {
            if (f55267f.matcher(i).matches()) {
                m77307c(str, m77308e(this.f55271c));
                return true;
            } else if (f55268g.matcher(i).matches()) {
                m77307c(str, m77308e(this.f55271c));
                return false;
            }
        }
        String i2 = m77310i(this.f55272d, str);
        if (i2 != null) {
            if (f55267f.matcher(i2).matches()) {
                return true;
            }
            if (f55268g.matcher(i2).matches()) {
                return false;
            }
        }
        m77312k(str, "Boolean");
        return false;
    }

    /* renamed from: f */
    public long mo63559f(String str) {
        Long g = m77309g(this.f55271c, str);
        if (g != null) {
            m77307c(str, m77308e(this.f55271c));
            return g.longValue();
        }
        Long g2 = m77309g(this.f55272d, str);
        if (g2 != null) {
            return g2.longValue();
        }
        m77312k(str, "Long");
        return 0;
    }

    /* renamed from: h */
    public String mo63560h(String str) {
        String i = m77310i(this.f55271c, str);
        if (i != null) {
            m77307c(str, m77308e(this.f55271c));
            return i;
        }
        String i2 = m77310i(this.f55272d, str);
        if (i2 != null) {
            return i2;
        }
        m77312k(str, "String");
        return "";
    }
}
