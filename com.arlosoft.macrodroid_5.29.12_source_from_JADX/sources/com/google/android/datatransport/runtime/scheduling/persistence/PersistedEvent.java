package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class PersistedEvent {
    /* renamed from: a */
    public static PersistedEvent m1539a(long j, TransportContext transportContext, EventInternal eventInternal) {
        return new AutoValue_PersistedEvent(j, transportContext, eventInternal);
    }

    /* renamed from: b */
    public abstract EventInternal mo19590b();

    /* renamed from: c */
    public abstract long mo19591c();

    /* renamed from: d */
    public abstract TransportContext mo19592d();
}
