package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

class GetAuthTokenListener implements StateListener {

    /* renamed from: a */
    private final Utils f54851a;

    /* renamed from: b */
    private final TaskCompletionSource<InstallationTokenResult> f54852b;

    public GetAuthTokenListener(Utils utils, TaskCompletionSource<InstallationTokenResult> taskCompletionSource) {
        this.f54851a = utils;
        this.f54852b = taskCompletionSource;
    }

    /* renamed from: a */
    public boolean mo63238a(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.mo63274k() || this.f54851a.mo63244f(persistedInstallationEntry)) {
            return false;
        }
        this.f54852b.mo56139c(InstallationTokenResult.m76630a().mo63228b(persistedInstallationEntry.mo63249b()).mo63230d(persistedInstallationEntry.mo63250c()).mo63229c(persistedInstallationEntry.mo63256h()).mo63227a());
        return true;
    }

    public boolean onException(Exception exc) {
        this.f54852b.mo56140d(exc);
        return true;
    }
}
