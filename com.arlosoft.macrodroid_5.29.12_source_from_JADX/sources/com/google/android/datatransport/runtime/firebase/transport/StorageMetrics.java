package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

public final class StorageMetrics {

    /* renamed from: c */
    private static final StorageMetrics f1454c = new Builder().mo19525a();

    /* renamed from: a */
    private final long f1455a;

    /* renamed from: b */
    private final long f1456b;

    public static final class Builder {

        /* renamed from: a */
        private long f1457a = 0;

        /* renamed from: b */
        private long f1458b = 0;

        Builder() {
        }

        /* renamed from: a */
        public StorageMetrics mo19525a() {
            return new StorageMetrics(this.f1457a, this.f1458b);
        }

        /* renamed from: b */
        public Builder mo19526b(long j) {
            this.f1457a = j;
            return this;
        }

        /* renamed from: c */
        public Builder mo19527c(long j) {
            this.f1458b = j;
            return this;
        }
    }

    StorageMetrics(long j, long j2) {
        this.f1455a = j;
        this.f1456b = j2;
    }

    /* renamed from: c */
    public static Builder m1368c() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    /* renamed from: a */
    public long mo19523a() {
        return this.f1455a;
    }

    @Protobuf(tag = 2)
    /* renamed from: b */
    public long mo19524b() {
        return this.f1456b;
    }
}
