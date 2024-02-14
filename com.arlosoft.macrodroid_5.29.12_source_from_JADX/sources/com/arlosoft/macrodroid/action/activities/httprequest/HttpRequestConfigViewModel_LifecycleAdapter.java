package com.arlosoft.macrodroid.action.activities.httprequest;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

public class HttpRequestConfigViewModel_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a */
    final HttpRequestConfigViewModel f7916a;

    HttpRequestConfigViewModel_LifecycleAdapter(HttpRequestConfigViewModel httpRequestConfigViewModel) {
        this.f7916a = httpRequestConfigViewModel;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (z || event != Lifecycle.Event.ON_RESUME) {
            return;
        }
        if (!z2 || methodCallsLogger.approveCall("onResume", 1)) {
            this.f7916a.onResume();
        }
    }
}
