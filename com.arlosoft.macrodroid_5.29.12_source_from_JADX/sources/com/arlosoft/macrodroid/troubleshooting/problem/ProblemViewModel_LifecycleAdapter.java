package com.arlosoft.macrodroid.troubleshooting.problem;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

public class ProblemViewModel_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a */
    final ProblemViewModel f14803a;

    ProblemViewModel_LifecycleAdapter(ProblemViewModel problemViewModel) {
        this.f14803a = problemViewModel;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (z || event != Lifecycle.Event.ON_RESUME) {
            return;
        }
        if (!z2 || methodCallsLogger.approveCall("onResume", 1)) {
            this.f14803a.onResume();
        }
    }
}
