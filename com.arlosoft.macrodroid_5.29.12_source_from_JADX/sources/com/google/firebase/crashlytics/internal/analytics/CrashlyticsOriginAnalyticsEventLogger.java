package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.connector.AnalyticsConnector;

public class CrashlyticsOriginAnalyticsEventLogger implements AnalyticsEventLogger {
    @NonNull

    /* renamed from: a */
    private final AnalyticsConnector f4861a;

    public CrashlyticsOriginAnalyticsEventLogger(@NonNull AnalyticsConnector analyticsConnector) {
        this.f4861a = analyticsConnector;
    }

    /* renamed from: a */
    public void mo22940a(@NonNull String str, @Nullable Bundle bundle) {
        this.f4861a.mo61993b("clx", str, bundle);
    }
}
