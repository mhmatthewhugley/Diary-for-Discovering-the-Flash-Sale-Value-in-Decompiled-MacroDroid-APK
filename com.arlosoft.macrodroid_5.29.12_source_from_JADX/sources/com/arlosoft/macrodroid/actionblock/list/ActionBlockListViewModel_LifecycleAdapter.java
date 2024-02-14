package com.arlosoft.macrodroid.actionblock.list;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

public class ActionBlockListViewModel_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a */
    final ActionBlockListViewModel f9824a;

    ActionBlockListViewModel_LifecycleAdapter(ActionBlockListViewModel actionBlockListViewModel) {
        this.f9824a = actionBlockListViewModel;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (z || event != Lifecycle.Event.ON_RESUME) {
            return;
        }
        if (!z2 || methodCallsLogger.approveCall("onResume", 1)) {
            this.f9824a.onResume();
        }
    }
}
