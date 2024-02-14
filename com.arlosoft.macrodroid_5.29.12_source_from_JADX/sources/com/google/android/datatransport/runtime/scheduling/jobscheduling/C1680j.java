package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1680j implements SynchronizationGuard.CriticalSection {

    /* renamed from: a */
    public final /* synthetic */ Uploader f1548a;

    /* renamed from: b */
    public final /* synthetic */ Iterable f1549b;

    /* renamed from: c */
    public final /* synthetic */ TransportContext f1550c;

    /* renamed from: d */
    public final /* synthetic */ long f1551d;

    public /* synthetic */ C1680j(Uploader uploader, Iterable iterable, TransportContext transportContext, long j) {
        this.f1548a = uploader;
        this.f1549b = iterable;
        this.f1550c = transportContext;
        this.f1551d = j;
    }

    public final Object execute() {
        return this.f1548a.m1458n(this.f1549b, this.f1550c, this.f1551d);
    }
}
