package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.util.Consumer;

public interface ConnectivityMonitor {

    public enum NetworkStatus {
        UNREACHABLE,
        REACHABLE
    }

    /* renamed from: a */
    void mo63012a(Consumer<NetworkStatus> consumer);

    void shutdown();
}
