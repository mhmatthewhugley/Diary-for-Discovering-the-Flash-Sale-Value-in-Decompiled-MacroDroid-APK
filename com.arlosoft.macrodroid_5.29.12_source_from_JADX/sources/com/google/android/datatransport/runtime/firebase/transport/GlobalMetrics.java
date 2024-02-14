package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;

public final class GlobalMetrics {

    /* renamed from: b */
    private static final GlobalMetrics f1433b = new Builder().mo19510a();

    /* renamed from: a */
    private final StorageMetrics f1434a;

    public static final class Builder {

        /* renamed from: a */
        private StorageMetrics f1435a = null;

        Builder() {
        }

        /* renamed from: a */
        public GlobalMetrics mo19510a() {
            return new GlobalMetrics(this.f1435a);
        }

        /* renamed from: b */
        public Builder mo19511b(StorageMetrics storageMetrics) {
            this.f1435a = storageMetrics;
            return this;
        }
    }

    GlobalMetrics(StorageMetrics storageMetrics) {
        this.f1434a = storageMetrics;
    }

    /* renamed from: b */
    public static Builder m1351b() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    @Encodable.Field
    /* renamed from: a */
    public StorageMetrics mo19509a() {
        return this.f1434a;
    }
}
