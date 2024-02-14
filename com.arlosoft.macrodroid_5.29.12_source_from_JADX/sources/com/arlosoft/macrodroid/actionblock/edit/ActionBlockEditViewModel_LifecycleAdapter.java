package com.arlosoft.macrodroid.actionblock.edit;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

public class ActionBlockEditViewModel_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a */
    final ActionBlockEditViewModel f9768a;

    ActionBlockEditViewModel_LifecycleAdapter(ActionBlockEditViewModel actionBlockEditViewModel) {
        this.f9768a = actionBlockEditViewModel;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (z || event != Lifecycle.Event.ON_RESUME) {
            return;
        }
        if (!z2 || methodCallsLogger.approveCall("onResume", 1)) {
            this.f9768a.onResume();
        }
    }
}
