package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

interface SettingsJsonTransform {
    /* renamed from: a */
    Settings mo23519a(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException;
}
