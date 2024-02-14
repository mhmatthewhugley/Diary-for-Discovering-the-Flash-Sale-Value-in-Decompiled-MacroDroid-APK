package com.google.android.datatransport.runtime.synchronization;

import androidx.annotation.WorkerThread;

@WorkerThread
public interface SynchronizationGuard {

    public interface CriticalSection<T> {
        T execute();
    }

    /* renamed from: c */
    <T> T mo19615c(CriticalSection<T> criticalSection);
}
