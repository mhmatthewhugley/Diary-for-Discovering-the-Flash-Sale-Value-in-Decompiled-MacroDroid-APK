package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig;

final class AutoValue_EventStoreConfig extends EventStoreConfig {

    /* renamed from: b */
    private final long f1558b;

    /* renamed from: c */
    private final int f1559c;

    /* renamed from: d */
    private final int f1560d;

    /* renamed from: e */
    private final long f1561e;

    /* renamed from: f */
    private final int f1562f;

    static final class Builder extends EventStoreConfig.Builder {

        /* renamed from: a */
        private Long f1563a;

        /* renamed from: b */
        private Integer f1564b;

        /* renamed from: c */
        private Integer f1565c;

        /* renamed from: d */
        private Long f1566d;

        /* renamed from: e */
        private Integer f1567e;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public EventStoreConfig mo19584a() {
            String str = "";
            if (this.f1563a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f1564b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f1565c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f1566d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f1567e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new AutoValue_EventStoreConfig(this.f1563a.longValue(), this.f1564b.intValue(), this.f1565c.intValue(), this.f1566d.longValue(), this.f1567e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public EventStoreConfig.Builder mo19585b(int i) {
            this.f1565c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public EventStoreConfig.Builder mo19586c(long j) {
            this.f1566d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public EventStoreConfig.Builder mo19587d(int i) {
            this.f1564b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public EventStoreConfig.Builder mo19588e(int i) {
            this.f1567e = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public EventStoreConfig.Builder mo19589f(long j) {
            this.f1563a = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo19576b() {
        return this.f1560d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo19577c() {
        return this.f1561e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo19578d() {
        return this.f1559c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo19579e() {
        return this.f1562f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventStoreConfig)) {
            return false;
        }
        EventStoreConfig eventStoreConfig = (EventStoreConfig) obj;
        if (this.f1558b == eventStoreConfig.mo19581f() && this.f1559c == eventStoreConfig.mo19578d() && this.f1560d == eventStoreConfig.mo19576b() && this.f1561e == eventStoreConfig.mo19577c() && this.f1562f == eventStoreConfig.mo19579e()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo19581f() {
        return this.f1558b;
    }

    public int hashCode() {
        long j = this.f1558b;
        long j2 = this.f1561e;
        return this.f1562f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f1559c) * 1000003) ^ this.f1560d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f1558b + ", loadBatchSize=" + this.f1559c + ", criticalSectionEnterTimeoutMs=" + this.f1560d + ", eventCleanUpAge=" + this.f1561e + ", maxBlobByteSizePerRow=" + this.f1562f + "}";
    }

    private AutoValue_EventStoreConfig(long j, int i, int i2, long j2, int i3) {
        this.f1558b = j;
        this.f1559c = i;
        this.f1560d = i2;
        this.f1561e = j2;
        this.f1562f = i3;
    }
}
