package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;

public class WorkInitializer {

    /* renamed from: a */
    private final Executor f1520a;

    /* renamed from: b */
    private final EventStore f1521b;

    /* renamed from: c */
    private final WorkScheduler f1522c;

    /* renamed from: d */
    private final SynchronizationGuard f1523d;

    WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.f1520a = executor;
        this.f1521b = eventStore;
        this.f1522c = workScheduler;
        this.f1523d = synchronizationGuard;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m1474d() {
        for (TransportContext a : this.f1521b.mo19606g0()) {
            this.f1522c.mo19537a(a, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m1475e() {
        this.f1523d.mo19615c(new C1684n(this));
    }

    /* renamed from: c */
    public void mo19569c() {
        this.f1520a.execute(new C1685o(this));
    }
}
