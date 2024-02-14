package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

class GetIdListener implements StateListener {

    /* renamed from: a */
    final TaskCompletionSource<String> f54853a;

    public GetIdListener(TaskCompletionSource<String> taskCompletionSource) {
        this.f54853a = taskCompletionSource;
    }

    /* renamed from: a */
    public boolean mo63238a(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.mo63275l() && !persistedInstallationEntry.mo63274k() && !persistedInstallationEntry.mo63272i()) {
            return false;
        }
        this.f54853a.mo56141e(persistedInstallationEntry.mo63251d());
        return true;
    }

    public boolean onException(Exception exc) {
        return false;
    }
}
