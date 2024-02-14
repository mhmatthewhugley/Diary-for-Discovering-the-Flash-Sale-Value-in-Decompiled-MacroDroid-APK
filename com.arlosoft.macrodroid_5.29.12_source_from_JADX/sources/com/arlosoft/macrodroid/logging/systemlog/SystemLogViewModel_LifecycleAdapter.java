package com.arlosoft.macrodroid.logging.systemlog;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

public class SystemLogViewModel_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a */
    final SystemLogViewModel f12255a;

    SystemLogViewModel_LifecycleAdapter(SystemLogViewModel systemLogViewModel) {
        this.f12255a = systemLogViewModel;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (z || event != Lifecycle.Event.ON_RESUME) {
            return;
        }
        if (!z2 || methodCallsLogger.approveCall("onResume", 1)) {
            this.f12255a.onResume();
        }
    }
}
