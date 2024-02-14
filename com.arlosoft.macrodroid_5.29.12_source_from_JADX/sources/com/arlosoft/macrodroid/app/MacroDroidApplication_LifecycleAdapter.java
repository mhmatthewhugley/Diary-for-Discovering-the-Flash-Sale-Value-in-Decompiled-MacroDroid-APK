package com.arlosoft.macrodroid.app;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

public class MacroDroidApplication_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a */
    final MacroDroidApplication f9907a;

    MacroDroidApplication_LifecycleAdapter(MacroDroidApplication macroDroidApplication) {
        this.f9907a = macroDroidApplication;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (!z) {
            if (event == Lifecycle.Event.ON_START) {
                if (!z2 || methodCallsLogger.approveCall("onAppForegrounded", 1)) {
                    this.f9907a.onAppForegrounded();
                }
            } else if (event != Lifecycle.Event.ON_STOP) {
            } else {
                if (!z2 || methodCallsLogger.approveCall("onAppBackgrounded", 1)) {
                    this.f9907a.onAppBackgrounded();
                }
            }
        }
    }
}
