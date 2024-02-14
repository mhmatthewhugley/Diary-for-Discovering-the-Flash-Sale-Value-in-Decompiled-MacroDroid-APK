package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import java.util.Map;
import java.util.Objects;

final class AutoValue_EventInternal extends EventInternal {

    /* renamed from: a */
    private final String f1312a;

    /* renamed from: b */
    private final Integer f1313b;

    /* renamed from: c */
    private final EncodedPayload f1314c;

    /* renamed from: d */
    private final long f1315d;

    /* renamed from: e */
    private final long f1316e;

    /* renamed from: f */
    private final Map<String, String> f1317f;

    static final class Builder extends EventInternal.Builder {

        /* renamed from: a */
        private String f1318a;

        /* renamed from: b */
        private Integer f1319b;

        /* renamed from: c */
        private EncodedPayload f1320c;

        /* renamed from: d */
        private Long f1321d;

        /* renamed from: e */
        private Long f1322e;

        /* renamed from: f */
        private Map<String, String> f1323f;

        Builder() {
        }

        /* renamed from: d */
        public EventInternal mo19404d() {
            String str = "";
            if (this.f1318a == null) {
                str = str + " transportName";
            }
            if (this.f1320c == null) {
                str = str + " encodedPayload";
            }
            if (this.f1321d == null) {
                str = str + " eventMillis";
            }
            if (this.f1322e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f1323f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new AutoValue_EventInternal(this.f1318a, this.f1319b, this.f1320c, this.f1321d.longValue(), this.f1322e.longValue(), this.f1323f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Map<String, String> mo19405e() {
            Map<String, String> map = this.f1323f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public EventInternal.Builder mo19406f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f1323f = map;
            return this;
        }

        /* renamed from: g */
        public EventInternal.Builder mo19407g(Integer num) {
            this.f1319b = num;
            return this;
        }

        /* renamed from: h */
        public EventInternal.Builder mo19408h(EncodedPayload encodedPayload) {
            Objects.requireNonNull(encodedPayload, "Null encodedPayload");
            this.f1320c = encodedPayload;
            return this;
        }

        /* renamed from: i */
        public EventInternal.Builder mo19409i(long j) {
            this.f1321d = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public EventInternal.Builder mo19410j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f1318a = str;
            return this;
        }

        /* renamed from: k */
        public EventInternal.Builder mo19411k(long j) {
            this.f1322e = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo19395c() {
        return this.f1317f;
    }

    @Nullable
    /* renamed from: d */
    public Integer mo19396d() {
        return this.f1313b;
    }

    /* renamed from: e */
    public EncodedPayload mo19397e() {
        return this.f1314c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventInternal)) {
            return false;
        }
        EventInternal eventInternal = (EventInternal) obj;
        if (!this.f1312a.equals(eventInternal.mo19401j()) || ((num = this.f1313b) != null ? !num.equals(eventInternal.mo19396d()) : eventInternal.mo19396d() != null) || !this.f1314c.equals(eventInternal.mo19397e()) || this.f1315d != eventInternal.mo19399f() || this.f1316e != eventInternal.mo19402k() || !this.f1317f.equals(eventInternal.mo19395c())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public long mo19399f() {
        return this.f1315d;
    }

    public int hashCode() {
        int hashCode = (this.f1312a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f1313b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f1315d;
        long j2 = this.f1316e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f1314c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f1317f.hashCode();
    }

    /* renamed from: j */
    public String mo19401j() {
        return this.f1312a;
    }

    /* renamed from: k */
    public long mo19402k() {
        return this.f1316e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f1312a + ", code=" + this.f1313b + ", encodedPayload=" + this.f1314c + ", eventMillis=" + this.f1315d + ", uptimeMillis=" + this.f1316e + ", autoMetadata=" + this.f1317f + "}";
    }

    private AutoValue_EventInternal(String str, @Nullable Integer num, EncodedPayload encodedPayload, long j, long j2, Map<String, String> map) {
        this.f1312a = str;
        this.f1313b = num;
        this.f1314c = encodedPayload;
        this.f1315d = j;
        this.f1316e = j2;
        this.f1317f = map;
    }
}
