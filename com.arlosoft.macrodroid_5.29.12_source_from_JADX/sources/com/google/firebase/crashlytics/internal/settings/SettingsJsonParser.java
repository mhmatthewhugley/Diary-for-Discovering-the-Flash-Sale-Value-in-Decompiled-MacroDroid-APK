package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

public class SettingsJsonParser {

    /* renamed from: a */
    private final CurrentTimeProvider f5506a;

    SettingsJsonParser(CurrentTimeProvider currentTimeProvider) {
        this.f5506a = currentTimeProvider;
    }

    /* renamed from: a */
    private static SettingsJsonTransform m7609a(int i) {
        if (i == 3) {
            return new SettingsV3JsonTransform();
        }
        Logger f = Logger.m6525f();
        f.mo22956d("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
        return new DefaultSettingsJsonTransform();
    }

    /* renamed from: b */
    public Settings mo23531b(JSONObject jSONObject) throws JSONException {
        return m7609a(jSONObject.getInt("settings_version")).mo23519a(this.f5506a, jSONObject);
    }
}
