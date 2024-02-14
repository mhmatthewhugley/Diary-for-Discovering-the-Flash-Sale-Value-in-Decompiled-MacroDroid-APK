package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import org.json.JSONObject;

class DefaultSettingsJsonTransform implements SettingsJsonTransform {
    DefaultSettingsJsonTransform() {
    }

    /* renamed from: b */
    static Settings m7578b(CurrentTimeProvider currentTimeProvider) {
        return new Settings(currentTimeProvider.mo23041a() + ((long) TaskerPlugin.Setting.REQUESTED_TIMEOUT_MS_NEVER), new Settings.SessionData(8, 4), new Settings.FeatureFlagData(true, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    /* renamed from: a */
    public Settings mo23519a(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) {
        return m7578b(currentTimeProvider);
    }
}
