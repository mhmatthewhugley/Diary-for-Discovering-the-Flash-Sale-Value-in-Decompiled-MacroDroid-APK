package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class Personalization {

    /* renamed from: a */
    private final Provider<AnalyticsConnector> f55283a;

    /* renamed from: b */
    private final Map<String, String> f55284b = Collections.synchronizedMap(new HashMap());

    public Personalization(Provider<AnalyticsConnector> provider) {
        this.f55283a = provider;
    }

    /* renamed from: a */
    public void mo63579a(@NonNull String str, @NonNull ConfigContainer configContainer) {
        JSONObject optJSONObject;
        AnalyticsConnector analyticsConnector = this.f55283a.get();
        if (analyticsConnector != null) {
            JSONObject f = configContainer.mo63541f();
            if (f.length() >= 1) {
                JSONObject d = configContainer.mo63538d();
                if (d.length() >= 1 && (optJSONObject = f.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (!optString.isEmpty()) {
                        synchronized (this.f55284b) {
                            if (!optString.equals(this.f55284b.get(str))) {
                                this.f55284b.put(str, optString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str);
                                bundle.putString("arm_value", d.optString(str));
                                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", optJSONObject.optString("group"));
                                analyticsConnector.mo61993b("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", optString);
                                analyticsConnector.mo61993b("fp", "_fpc", bundle2);
                            }
                        }
                    }
                }
            }
        }
    }
}
