package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p483y5.C17515a;
import p483y5.C17516b;

public class DefaultScheduler implements Scheduler {

    /* renamed from: f */
    private static final Logger f1464f = Logger.getLogger(TransportRuntime.class.getName());

    /* renamed from: a */
    private final WorkScheduler f1465a;

    /* renamed from: b */
    private final Executor f1466b;

    /* renamed from: c */
    private final BackendRegistry f1467c;

    /* renamed from: d */
    private final EventStore f1468d;

    /* renamed from: e */
    private final SynchronizationGuard f1469e;

    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.f1466b = executor;
        this.f1467c = backendRegistry;
        this.f1465a = workScheduler;
        this.f1468d = eventStore;
        this.f1469e = synchronizationGuard;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m1391d(TransportContext transportContext, EventInternal eventInternal) {
        this.f1468d.mo19604a2(transportContext, eventInternal);
        this.f1465a.mo19537a(transportContext, 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m1392e(TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        try {
            TransportBackend transportBackend = this.f1467c.get(transportContext.mo19426b());
            if (transportBackend == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{transportContext.mo19426b()});
                f1464f.warning(format);
                transportScheduleCallback.mo19275a(new IllegalArgumentException(format));
                return;
            }
            this.f1469e.mo19615c(new C17515a(this, transportContext, transportBackend.mo19283a(eventInternal)));
            transportScheduleCallback.mo19275a((Exception) null);
        } catch (Exception e) {
            Logger logger = f1464f;
            logger.warning("Error scheduling event " + e.getMessage());
            transportScheduleCallback.mo19275a(e);
        }
    }

    /* renamed from: a */
    public void mo19533a(TransportContext transportContext, EventInternal eventInternal, TransportScheduleCallback transportScheduleCallback) {
        this.f1466b.execute(new C17516b(this, transportContext, transportScheduleCallback, eventInternal));
    }
}
