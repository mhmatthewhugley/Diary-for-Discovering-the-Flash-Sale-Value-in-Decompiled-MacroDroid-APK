package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

public final class LogEventDropped {

    /* renamed from: c */
    private static final LogEventDropped f1436c = new Builder().mo19514a();

    /* renamed from: a */
    private final long f1437a;

    /* renamed from: b */
    private final Reason f1438b;

    public static final class Builder {

        /* renamed from: a */
        private long f1439a = 0;

        /* renamed from: b */
        private Reason f1440b = Reason.REASON_UNKNOWN;

        Builder() {
        }

        /* renamed from: a */
        public LogEventDropped mo19514a() {
            return new LogEventDropped(this.f1439a, this.f1440b);
        }

        /* renamed from: b */
        public Builder mo19515b(long j) {
            this.f1439a = j;
            return this;
        }

        /* renamed from: c */
        public Builder mo19516c(Reason reason) {
            this.f1440b = reason;
            return this;
        }
    }

    public enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        private Reason(int i) {
            this.number_ = i;
        }

        /* renamed from: c */
        public int mo19517c() {
            return this.number_;
        }
    }

    LogEventDropped(long j, Reason reason) {
        this.f1437a = j;
        this.f1438b = reason;
    }

    /* renamed from: c */
    public static Builder m1355c() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    /* renamed from: a */
    public long mo19512a() {
        return this.f1437a;
    }

    @Protobuf(tag = 3)
    /* renamed from: b */
    public Reason mo19513b() {
        return this.f1438b;
    }
}
