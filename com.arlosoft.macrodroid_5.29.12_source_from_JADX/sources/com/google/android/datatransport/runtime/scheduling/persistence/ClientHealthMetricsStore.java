package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;

public interface ClientHealthMetricsStore {
    /* renamed from: b */
    void mo19596b();

    /* renamed from: e */
    ClientMetrics mo19597e();

    /* renamed from: f */
    void mo19598f(long j, LogEventDropped.Reason reason, String str);
}
