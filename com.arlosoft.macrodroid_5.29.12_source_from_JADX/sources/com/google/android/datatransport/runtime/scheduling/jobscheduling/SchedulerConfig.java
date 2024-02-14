package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import androidx.annotation.RequiresApi;
import androidx.work.WorkRequest;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@AutoValue
public abstract class SchedulerConfig {

    public static class Builder {

        /* renamed from: a */
        private Clock f1496a;

        /* renamed from: b */
        private Map<Priority, ConfigValue> f1497b = new HashMap();

        /* renamed from: a */
        public Builder mo19561a(Priority priority, ConfigValue configValue) {
            this.f1497b.put(priority, configValue);
            return this;
        }

        /* renamed from: b */
        public SchedulerConfig mo19562b() {
            Objects.requireNonNull(this.f1496a, "missing required property: clock");
            if (this.f1497b.keySet().size() >= Priority.values().length) {
                Map<Priority, ConfigValue> map = this.f1497b;
                this.f1497b = new HashMap();
                return SchedulerConfig.m1428d(this.f1496a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        /* renamed from: c */
        public Builder mo19563c(Clock clock) {
            this.f1496a = clock;
            return this;
        }
    }

    @AutoValue
    public static abstract class ConfigValue {

        @AutoValue.Builder
        public static abstract class Builder {
            /* renamed from: a */
            public abstract ConfigValue mo19552a();

            /* renamed from: b */
            public abstract Builder mo19553b(long j);

            /* renamed from: c */
            public abstract Builder mo19554c(Set<Flag> set);

            /* renamed from: d */
            public abstract Builder mo19555d(long j);
        }

        /* renamed from: a */
        public static Builder m1439a() {
            return new AutoValue_SchedulerConfig_ConfigValue.Builder().mo19554c(Collections.emptySet());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo19546b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<Flag> mo19547c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo19548d();
    }

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m1426a(int i, long j) {
        int i2 = i - 1;
        return (long) (Math.pow(3.0d, (double) i2) * ((double) j) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j > 1 ? j : 2) * ((long) i2)))));
    }

    /* renamed from: b */
    public static Builder m1427b() {
        return new Builder();
    }

    /* renamed from: d */
    static SchedulerConfig m1428d(Clock clock, Map<Priority, ConfigValue> map) {
        return new AutoValue_SchedulerConfig(clock, map);
    }

    /* renamed from: f */
    public static SchedulerConfig m1429f(Clock clock) {
        return m1427b().mo19561a(Priority.DEFAULT, ConfigValue.m1439a().mo19553b(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).mo19555d(86400000).mo19552a()).mo19561a(Priority.HIGHEST, ConfigValue.m1439a().mo19553b(1000).mo19555d(86400000).mo19552a()).mo19561a(Priority.VERY_LOW, ConfigValue.m1439a().mo19553b(86400000).mo19555d(86400000).mo19554c(m1430i(Flag.DEVICE_IDLE)).mo19552a()).mo19563c(clock).mo19562b();
    }

    /* renamed from: i */
    private static <T> Set<T> m1430i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    @RequiresApi(api = 21)
    /* renamed from: j */
    private void m1431j(JobInfo.Builder builder, Set<Flag> set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    @RequiresApi(api = 21)
    /* renamed from: c */
    public JobInfo.Builder mo19559c(JobInfo.Builder builder, Priority priority, long j, int i) {
        builder.setMinimumLatency(mo19560g(priority, j, i));
        m1431j(builder, mo19543h().get(priority).mo19547c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract Clock mo19541e();

    /* renamed from: g */
    public long mo19560g(Priority priority, long j, int i) {
        long a = j - mo19541e().mo19627a();
        ConfigValue configValue = mo19543h().get(priority);
        return Math.min(Math.max(m1426a(i, configValue.mo19546b()), a), configValue.mo19548d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map<Priority, ConfigValue> mo19543h();
}
