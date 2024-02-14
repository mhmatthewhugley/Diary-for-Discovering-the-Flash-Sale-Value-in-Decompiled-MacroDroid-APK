package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.Settings;
import org.json.JSONException;
import org.json.JSONObject;

class SettingsV3JsonTransform implements SettingsJsonTransform {
    SettingsV3JsonTransform() {
    }

    /* renamed from: b */
    private static Settings.FeatureFlagData m7615b(JSONObject jSONObject) {
        return new Settings.FeatureFlagData(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    /* renamed from: c */
    private static Settings.SessionData m7616c(JSONObject jSONObject) {
        return new Settings.SessionData(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: d */
    private static long m7617d(CurrentTimeProvider currentTimeProvider, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return currentTimeProvider.mo23041a() + (j * 1000);
    }

    /* renamed from: a */
    public Settings mo23519a(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException {
        Settings.SessionData sessionData;
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", 3600);
        double optDouble = jSONObject2.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject2.optDouble("on_demand_backoff_base", 1.2d);
        int optInt3 = jSONObject2.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject2.has("session")) {
            sessionData = m7616c(jSONObject2.getJSONObject("session"));
        } else {
            sessionData = m7616c(new JSONObject());
        }
        return new Settings(m7617d(currentTimeProvider, (long) optInt2, jSONObject2), sessionData, m7615b(jSONObject2.getJSONObject("features")), optInt, optInt2, optDouble, optDouble2, optInt3);
    }
}
