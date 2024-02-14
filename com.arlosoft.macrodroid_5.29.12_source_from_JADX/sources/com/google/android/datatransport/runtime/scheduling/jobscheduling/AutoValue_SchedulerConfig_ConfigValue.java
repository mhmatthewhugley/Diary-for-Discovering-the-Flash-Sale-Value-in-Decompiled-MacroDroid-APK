package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Objects;
import java.util.Set;

final class AutoValue_SchedulerConfig_ConfigValue extends SchedulerConfig.ConfigValue {

    /* renamed from: a */
    private final long f1487a;

    /* renamed from: b */
    private final long f1488b;

    /* renamed from: c */
    private final Set<SchedulerConfig.Flag> f1489c;

    static final class Builder extends SchedulerConfig.ConfigValue.Builder {

        /* renamed from: a */
        private Long f1490a;

        /* renamed from: b */
        private Long f1491b;

        /* renamed from: c */
        private Set<SchedulerConfig.Flag> f1492c;

        Builder() {
        }

        /* renamed from: a */
        public SchedulerConfig.ConfigValue mo19552a() {
            String str = "";
            if (this.f1490a == null) {
                str = str + " delta";
            }
            if (this.f1491b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f1492c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new AutoValue_SchedulerConfig_ConfigValue(this.f1490a.longValue(), this.f1491b.longValue(), this.f1492c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public SchedulerConfig.ConfigValue.Builder mo19553b(long j) {
            this.f1490a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public SchedulerConfig.ConfigValue.Builder mo19554c(Set<SchedulerConfig.Flag> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f1492c = set;
            return this;
        }

        /* renamed from: d */
        public SchedulerConfig.ConfigValue.Builder mo19555d(long j) {
            this.f1491b = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo19546b() {
        return this.f1487a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<SchedulerConfig.Flag> mo19547c() {
        return this.f1489c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo19548d() {
        return this.f1488b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.ConfigValue)) {
            return false;
        }
        SchedulerConfig.ConfigValue configValue = (SchedulerConfig.ConfigValue) obj;
        if (this.f1487a == configValue.mo19546b() && this.f1488b == configValue.mo19548d() && this.f1489c.equals(configValue.mo19547c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f1487a;
        long j2 = this.f1488b;
        return this.f1489c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f1487a + ", maxAllowedDelay=" + this.f1488b + ", flags=" + this.f1489c + "}";
    }

    private AutoValue_SchedulerConfig_ConfigValue(long j, long j2, Set<SchedulerConfig.Flag> set) {
        this.f1487a = j;
        this.f1488b = j2;
        this.f1489c = set;
    }
}
