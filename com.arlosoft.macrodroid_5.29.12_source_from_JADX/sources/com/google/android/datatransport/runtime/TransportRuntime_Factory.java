package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import p287ia.C12478a;

public final class TransportRuntime_Factory implements Factory<TransportRuntime> {

    /* renamed from: a */
    private final C12478a<Clock> f1373a;

    /* renamed from: b */
    private final C12478a<Clock> f1374b;

    /* renamed from: c */
    private final C12478a<Scheduler> f1375c;

    /* renamed from: d */
    private final C12478a<Uploader> f1376d;

    /* renamed from: e */
    private final C12478a<WorkInitializer> f1377e;

    public TransportRuntime_Factory(C12478a<Clock> aVar, C12478a<Clock> aVar2, C12478a<Scheduler> aVar3, C12478a<Uploader> aVar4, C12478a<WorkInitializer> aVar5) {
        this.f1373a = aVar;
        this.f1374b = aVar2;
        this.f1375c = aVar3;
        this.f1376d = aVar4;
        this.f1377e = aVar5;
    }

    /* renamed from: a */
    public static TransportRuntime_Factory m1280a(C12478a<Clock> aVar, C12478a<Clock> aVar2, C12478a<Scheduler> aVar3, C12478a<Uploader> aVar4, C12478a<WorkInitializer> aVar5) {
        return new TransportRuntime_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static TransportRuntime m1281c(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }

    /* renamed from: b */
    public TransportRuntime get() {
        return m1281c(this.f1373a.get(), this.f1374b.get(), this.f1375c.get(), this.f1376d.get(), this.f1377e.get());
    }
}
