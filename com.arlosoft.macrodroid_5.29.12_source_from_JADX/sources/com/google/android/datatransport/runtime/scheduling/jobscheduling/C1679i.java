package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1679i implements SynchronizationGuard.CriticalSection {

    /* renamed from: a */
    public final /* synthetic */ Uploader f1546a;

    /* renamed from: b */
    public final /* synthetic */ Iterable f1547b;

    public /* synthetic */ C1679i(Uploader uploader, Iterable iterable) {
        this.f1546a = uploader;
        this.f1547b = iterable;
    }

    public final Object execute() {
        return this.f1546a.m1459o(this.f1547b);
    }
}
