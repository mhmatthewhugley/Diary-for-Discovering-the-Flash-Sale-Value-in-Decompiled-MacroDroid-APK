package com.arlosoft.macrodroid.upgrade.billing;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

public class BillingDataSource_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a */
    final BillingDataSource f14888a;

    BillingDataSource_LifecycleAdapter(BillingDataSource billingDataSource) {
        this.f14888a = billingDataSource;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (z || event != Lifecycle.Event.ON_RESUME) {
            return;
        }
        if (!z2 || methodCallsLogger.approveCall("resume", 1)) {
            this.f14888a.resume();
        }
    }
}
