package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;

interface StateListener {
    /* renamed from: a */
    boolean mo63238a(PersistedInstallationEntry persistedInstallationEntry);

    boolean onException(Exception exc);
}
