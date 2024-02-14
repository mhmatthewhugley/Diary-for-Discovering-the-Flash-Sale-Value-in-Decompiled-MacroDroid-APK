package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import java.util.Locale;

class CrashlyticsAnalyticsListener implements AnalyticsConnector.AnalyticsConnectorListener {

    /* renamed from: a */
    private AnalyticsEventReceiver f4831a;

    /* renamed from: b */
    private AnalyticsEventReceiver f4832b;

    CrashlyticsAnalyticsListener() {
    }

    /* renamed from: b */
    private static void m6480b(@Nullable AnalyticsEventReceiver analyticsEventReceiver, @NonNull String str, @NonNull Bundle bundle) {
        if (analyticsEventReceiver != null) {
            analyticsEventReceiver.mo22964E1(str, bundle);
        }
    }

    /* renamed from: c */
    private void m6481c(@NonNull String str, @NonNull Bundle bundle) {
        AnalyticsEventReceiver analyticsEventReceiver;
        if ("clx".equals(bundle.getString("_o"))) {
            analyticsEventReceiver = this.f4831a;
        } else {
            analyticsEventReceiver = this.f4832b;
        }
        m6480b(analyticsEventReceiver, str, bundle);
    }

    /* renamed from: a */
    public void mo22932a(int i, @Nullable Bundle bundle) {
        String string;
        Logger.m6525f().mo22960i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i), bundle}));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            m6481c(string, bundle2);
        }
    }

    /* renamed from: d */
    public void mo22933d(@Nullable AnalyticsEventReceiver analyticsEventReceiver) {
        this.f4832b = analyticsEventReceiver;
    }

    /* renamed from: e */
    public void mo22934e(@Nullable AnalyticsEventReceiver analyticsEventReceiver) {
        this.f4831a = analyticsEventReceiver;
    }
}
