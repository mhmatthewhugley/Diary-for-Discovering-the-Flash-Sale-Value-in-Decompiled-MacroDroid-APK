package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Objects;

final class AutoValue_PersistedEvent extends PersistedEvent {

    /* renamed from: a */
    private final long f1568a;

    /* renamed from: b */
    private final TransportContext f1569b;

    /* renamed from: c */
    private final EventInternal f1570c;

    AutoValue_PersistedEvent(long j, TransportContext transportContext, EventInternal eventInternal) {
        this.f1568a = j;
        Objects.requireNonNull(transportContext, "Null transportContext");
        this.f1569b = transportContext;
        Objects.requireNonNull(eventInternal, "Null event");
        this.f1570c = eventInternal;
    }

    /* renamed from: b */
    public EventInternal mo19590b() {
        return this.f1570c;
    }

    /* renamed from: c */
    public long mo19591c() {
        return this.f1568a;
    }

    /* renamed from: d */
    public TransportContext mo19592d() {
        return this.f1569b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedEvent)) {
            return false;
        }
        PersistedEvent persistedEvent = (PersistedEvent) obj;
        if (this.f1568a != persistedEvent.mo19591c() || !this.f1569b.equals(persistedEvent.mo19592d()) || !this.f1570c.equals(persistedEvent.mo19590b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f1568a;
        return this.f1570c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f1569b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f1568a + ", transportContext=" + this.f1569b + ", event=" + this.f1570c + "}";
    }
}
