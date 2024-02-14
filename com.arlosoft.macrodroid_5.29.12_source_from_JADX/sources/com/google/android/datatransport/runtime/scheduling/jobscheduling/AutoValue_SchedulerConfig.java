package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;
import java.util.Objects;

final class AutoValue_SchedulerConfig extends SchedulerConfig {

    /* renamed from: a */
    private final Clock f1485a;

    /* renamed from: b */
    private final Map<Priority, SchedulerConfig.ConfigValue> f1486b;

    AutoValue_SchedulerConfig(Clock clock, Map<Priority, SchedulerConfig.ConfigValue> map) {
        Objects.requireNonNull(clock, "Null clock");
        this.f1485a = clock;
        Objects.requireNonNull(map, "Null values");
        this.f1486b = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Clock mo19541e() {
        return this.f1485a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        if (!this.f1485a.equals(schedulerConfig.mo19541e()) || !this.f1486b.equals(schedulerConfig.mo19543h())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Map<Priority, SchedulerConfig.ConfigValue> mo19543h() {
        return this.f1486b;
    }

    public int hashCode() {
        return ((this.f1485a.hashCode() ^ 1000003) * 1000003) ^ this.f1486b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f1485a + ", values=" + this.f1486b + "}";
    }
}
