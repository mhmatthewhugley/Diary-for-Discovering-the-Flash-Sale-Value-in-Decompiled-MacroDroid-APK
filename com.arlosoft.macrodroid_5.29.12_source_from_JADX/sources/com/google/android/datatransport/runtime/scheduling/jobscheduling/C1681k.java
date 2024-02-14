package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1681k implements SynchronizationGuard.CriticalSection {

    /* renamed from: a */
    public final /* synthetic */ Uploader f1552a;

    /* renamed from: b */
    public final /* synthetic */ Map f1553b;

    public /* synthetic */ C1681k(Uploader uploader, Map map) {
        this.f1552a = uploader;
        this.f1553b = map;
    }

    public final Object execute() {
        return this.f1552a.m1461q(this.f1553b);
    }
}
