package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ClientMetrics {

    /* renamed from: e */
    private static final ClientMetrics f1424e = new Builder().mo19505b();

    /* renamed from: a */
    private final TimeWindow f1425a;

    /* renamed from: b */
    private final List<LogSourceMetrics> f1426b;

    /* renamed from: c */
    private final GlobalMetrics f1427c;

    /* renamed from: d */
    private final String f1428d;

    public static final class Builder {

        /* renamed from: a */
        private TimeWindow f1429a = null;

        /* renamed from: b */
        private List<LogSourceMetrics> f1430b = new ArrayList();

        /* renamed from: c */
        private GlobalMetrics f1431c = null;

        /* renamed from: d */
        private String f1432d = "";

        Builder() {
        }

        /* renamed from: a */
        public Builder mo19504a(LogSourceMetrics logSourceMetrics) {
            this.f1430b.add(logSourceMetrics);
            return this;
        }

        /* renamed from: b */
        public ClientMetrics mo19505b() {
            return new ClientMetrics(this.f1429a, Collections.unmodifiableList(this.f1430b), this.f1431c, this.f1432d);
        }

        /* renamed from: c */
        public Builder mo19506c(String str) {
            this.f1432d = str;
            return this;
        }

        /* renamed from: d */
        public Builder mo19507d(GlobalMetrics globalMetrics) {
            this.f1431c = globalMetrics;
            return this;
        }

        /* renamed from: e */
        public Builder mo19508e(TimeWindow timeWindow) {
            this.f1429a = timeWindow;
            return this;
        }
    }

    ClientMetrics(TimeWindow timeWindow, List<LogSourceMetrics> list, GlobalMetrics globalMetrics, String str) {
        this.f1425a = timeWindow;
        this.f1426b = list;
        this.f1427c = globalMetrics;
        this.f1428d = str;
    }

    /* renamed from: e */
    public static Builder m1340e() {
        return new Builder();
    }

    @Protobuf(tag = 4)
    /* renamed from: a */
    public String mo19499a() {
        return this.f1428d;
    }

    @Protobuf(tag = 3)
    @Encodable.Field
    /* renamed from: b */
    public GlobalMetrics mo19500b() {
        return this.f1427c;
    }

    @Protobuf(tag = 2)
    @Encodable.Field
    /* renamed from: c */
    public List<LogSourceMetrics> mo19501c() {
        return this.f1426b;
    }

    @Protobuf(tag = 1)
    @Encodable.Field
    /* renamed from: d */
    public TimeWindow mo19502d() {
        return this.f1425a;
    }

    /* renamed from: f */
    public byte[] mo19503f() {
        return ProtoEncoderDoNotUse.m1238a(this);
    }
}
