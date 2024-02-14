package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import org.json.JSONException;
import org.json.JSONObject;

public class BreadcrumbAnalyticsEventReceiver implements AnalyticsEventReceiver, BreadcrumbSource {
    @Nullable

    /* renamed from: a */
    private BreadcrumbHandler f4860a;

    @NonNull
    /* renamed from: b */
    private static String m6547b(@NonNull String str, @NonNull Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: E1 */
    public void mo22964E1(@NonNull String str, @NonNull Bundle bundle) {
        BreadcrumbHandler breadcrumbHandler = this.f4860a;
        if (breadcrumbHandler != null) {
            try {
                breadcrumbHandler.mo22965a("$A$:" + m6547b(str, bundle));
            } catch (JSONException unused) {
                Logger.m6525f().mo22962k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    /* renamed from: a */
    public void mo22941a(@Nullable BreadcrumbHandler breadcrumbHandler) {
        this.f4860a = breadcrumbHandler;
        Logger.m6525f().mo22954b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
