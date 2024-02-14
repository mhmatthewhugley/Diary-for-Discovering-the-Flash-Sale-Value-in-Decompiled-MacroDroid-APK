package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LogSourceMetrics {

    /* renamed from: c */
    private static final LogSourceMetrics f1449c = new Builder().mo19520a();

    /* renamed from: a */
    private final String f1450a;

    /* renamed from: b */
    private final List<LogEventDropped> f1451b;

    public static final class Builder {

        /* renamed from: a */
        private String f1452a = "";

        /* renamed from: b */
        private List<LogEventDropped> f1453b = new ArrayList();

        Builder() {
        }

        /* renamed from: a */
        public LogSourceMetrics mo19520a() {
            return new LogSourceMetrics(this.f1452a, Collections.unmodifiableList(this.f1453b));
        }

        /* renamed from: b */
        public Builder mo19521b(List<LogEventDropped> list) {
            this.f1453b = list;
            return this;
        }

        /* renamed from: c */
        public Builder mo19522c(String str) {
            this.f1452a = str;
            return this;
        }
    }

    LogSourceMetrics(String str, List<LogEventDropped> list) {
        this.f1450a = str;
        this.f1451b = list;
    }

    /* renamed from: c */
    public static Builder m1362c() {
        return new Builder();
    }

    @Protobuf(tag = 2)
    @Encodable.Field
    /* renamed from: a */
    public List<LogEventDropped> mo19518a() {
        return this.f1451b;
    }

    @Protobuf(tag = 1)
    /* renamed from: b */
    public String mo19519b() {
        return this.f1450a;
    }
}
