package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

public final class TimeWindow {

    /* renamed from: c */
    private static final TimeWindow f1459c = new Builder().mo19530a();

    /* renamed from: a */
    private final long f1460a;

    /* renamed from: b */
    private final long f1461b;

    public static final class Builder {

        /* renamed from: a */
        private long f1462a = 0;

        /* renamed from: b */
        private long f1463b = 0;

        Builder() {
        }

        /* renamed from: a */
        public TimeWindow mo19530a() {
            return new TimeWindow(this.f1462a, this.f1463b);
        }

        /* renamed from: b */
        public Builder mo19531b(long j) {
            this.f1463b = j;
            return this;
        }

        /* renamed from: c */
        public Builder mo19532c(long j) {
            this.f1462a = j;
            return this;
        }
    }

    TimeWindow(long j, long j2) {
        this.f1460a = j;
        this.f1461b = j2;
    }

    /* renamed from: c */
    public static Builder m1374c() {
        return new Builder();
    }

    @Protobuf(tag = 2)
    /* renamed from: a */
    public long mo19528a() {
        return this.f1461b;
    }

    @Protobuf(tag = 1)
    /* renamed from: b */
    public long mo19529b() {
        return this.f1460a;
    }
}
