package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;

class DefaultSettingsSpiCall implements SettingsSpiCall {

    /* renamed from: a */
    private final String f5477a;

    /* renamed from: b */
    private final HttpRequestFactory f5478b;

    /* renamed from: c */
    private final Logger f5479c;

    public DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory) {
        this(str, httpRequestFactory, Logger.m6525f());
    }

    /* renamed from: b */
    private HttpGetRequest m7580b(HttpGetRequest httpGetRequest, SettingsRequest settingsRequest) {
        m7581c(httpGetRequest, "X-CRASHLYTICS-GOOGLE-APP-ID", settingsRequest.f5507a);
        m7581c(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m7581c(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-VERSION", CrashlyticsCore.m6683i());
        m7581c(httpGetRequest, "Accept", "application/json");
        m7581c(httpGetRequest, "X-CRASHLYTICS-DEVICE-MODEL", settingsRequest.f5508b);
        m7581c(httpGetRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", settingsRequest.f5509c);
        m7581c(httpGetRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", settingsRequest.f5510d);
        m7581c(httpGetRequest, "X-CRASHLYTICS-INSTALLATION-ID", settingsRequest.f5511e.mo23049a());
        return httpGetRequest;
    }

    /* renamed from: c */
    private void m7581c(HttpGetRequest httpGetRequest, String str, String str2) {
        if (str2 != null) {
            httpGetRequest.mo23485d(str, str2);
        }
    }

    /* renamed from: e */
    private JSONObject m7582e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            Logger logger = this.f5479c;
            logger.mo22963l("Failed to parse settings JSON from " + this.f5477a, e);
            Logger logger2 = this.f5479c;
            logger2.mo22962k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    private Map<String, String> m7583f(SettingsRequest settingsRequest) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", settingsRequest.f5514h);
        hashMap.put("display_version", settingsRequest.f5513g);
        hashMap.put("source", Integer.toString(settingsRequest.f5515i));
        String str = settingsRequest.f5512f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: a */
    public JSONObject mo23520a(SettingsRequest settingsRequest, boolean z) {
        if (z) {
            try {
                Map<String, String> f = m7583f(settingsRequest);
                HttpGetRequest b = m7580b(mo23521d(f), settingsRequest);
                Logger logger = this.f5479c;
                logger.mo22954b("Requesting settings from " + this.f5477a);
                Logger logger2 = this.f5479c;
                logger2.mo22960i("Settings query params were: " + f);
                return mo23522g(b.mo23484c());
            } catch (IOException e) {
                this.f5479c.mo22957e("Settings request failed.", e);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public HttpGetRequest mo23521d(Map<String, String> map) {
        HttpGetRequest a = this.f5478b.mo23486a(this.f5477a, map);
        return a.mo23485d(HTTP.USER_AGENT, "Crashlytics Android SDK/" + CrashlyticsCore.m6683i()).mo23485d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public JSONObject mo23522g(HttpResponse httpResponse) {
        int b = httpResponse.mo23488b();
        Logger logger = this.f5479c;
        logger.mo22960i("Settings response code was: " + b);
        if (mo23523h(b)) {
            return m7582e(httpResponse.mo23487a());
        }
        Logger logger2 = this.f5479c;
        logger2.mo22956d("Settings request failed; (status: " + b + ") from " + this.f5477a);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo23523h(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory, Logger logger) {
        if (str != null) {
            this.f5479c = logger;
            this.f5478b = httpRequestFactory;
            this.f5477a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
