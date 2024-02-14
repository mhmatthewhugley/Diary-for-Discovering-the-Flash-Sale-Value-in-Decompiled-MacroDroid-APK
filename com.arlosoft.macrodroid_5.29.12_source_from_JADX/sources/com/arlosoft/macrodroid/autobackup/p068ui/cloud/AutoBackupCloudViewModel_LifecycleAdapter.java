package com.arlosoft.macrodroid.autobackup.p068ui.cloud;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

/* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.AutoBackupCloudViewModel_LifecycleAdapter */
public class AutoBackupCloudViewModel_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a */
    final AutoBackupCloudViewModel f9945a;

    AutoBackupCloudViewModel_LifecycleAdapter(AutoBackupCloudViewModel autoBackupCloudViewModel) {
        this.f9945a = autoBackupCloudViewModel;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (z || event != Lifecycle.Event.ON_START) {
            return;
        }
        if (!z2 || methodCallsLogger.approveCall("onStart", 1)) {
            this.f9945a.onStart();
        }
    }
}
