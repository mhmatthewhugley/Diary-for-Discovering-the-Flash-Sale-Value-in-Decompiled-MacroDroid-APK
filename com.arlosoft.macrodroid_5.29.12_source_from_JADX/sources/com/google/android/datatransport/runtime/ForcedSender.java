package com.google.android.datatransport.runtime;

import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;

public final class ForcedSender {
    private ForcedSender() {
    }

    /* renamed from: a */
    private static TransportContext m1236a(Transport<?> transport) {
        if (transport instanceof TransportImpl) {
            return ((TransportImpl) transport).mo19462d();
        }
        throw new IllegalArgumentException("Expected instance of TransportImpl.");
    }

    @WorkerThread
    /* renamed from: b */
    public static void m1237b(Transport<?> transport, Priority priority) {
        TransportRuntime.m1271c().mo19464e().mo19566u(m1236a(transport).mo19460f(priority), 1);
    }
}
