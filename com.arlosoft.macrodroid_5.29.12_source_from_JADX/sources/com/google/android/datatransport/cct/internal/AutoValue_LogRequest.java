package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

final class AutoValue_LogRequest extends LogRequest {

    /* renamed from: a */
    private final long f1216a;

    /* renamed from: b */
    private final long f1217b;

    /* renamed from: c */
    private final ClientInfo f1218c;

    /* renamed from: d */
    private final Integer f1219d;

    /* renamed from: e */
    private final String f1220e;

    /* renamed from: f */
    private final List<LogEvent> f1221f;

    /* renamed from: g */
    private final QosTier f1222g;

    static final class Builder extends LogRequest.Builder {

        /* renamed from: a */
        private Long f1223a;

        /* renamed from: b */
        private Long f1224b;

        /* renamed from: c */
        private ClientInfo f1225c;

        /* renamed from: d */
        private Integer f1226d;

        /* renamed from: e */
        private String f1227e;

        /* renamed from: f */
        private List<LogEvent> f1228f;

        /* renamed from: g */
        private QosTier f1229g;

        Builder() {
        }

        /* renamed from: a */
        public LogRequest mo19364a() {
            String str = "";
            if (this.f1223a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f1224b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new AutoValue_LogRequest(this.f1223a.longValue(), this.f1224b.longValue(), this.f1225c, this.f1226d, this.f1227e, this.f1228f, this.f1229g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public LogRequest.Builder mo19365b(@Nullable ClientInfo clientInfo) {
            this.f1225c = clientInfo;
            return this;
        }

        /* renamed from: c */
        public LogRequest.Builder mo19366c(@Nullable List<LogEvent> list) {
            this.f1228f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public LogRequest.Builder mo19367d(@Nullable Integer num) {
            this.f1226d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public LogRequest.Builder mo19368e(@Nullable String str) {
            this.f1227e = str;
            return this;
        }

        /* renamed from: f */
        public LogRequest.Builder mo19369f(@Nullable QosTier qosTier) {
            this.f1229g = qosTier;
            return this;
        }

        /* renamed from: g */
        public LogRequest.Builder mo19370g(long j) {
            this.f1223a = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public LogRequest.Builder mo19371h(long j) {
            this.f1224b = Long.valueOf(j);
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public ClientInfo mo19354b() {
        return this.f1218c;
    }

    @Nullable
    @Encodable.Field
    /* renamed from: c */
    public List<LogEvent> mo19355c() {
        return this.f1221f;
    }

    @Nullable
    /* renamed from: d */
    public Integer mo19356d() {
        return this.f1219d;
    }

    @Nullable
    /* renamed from: e */
    public String mo19357e() {
        return this.f1220e;
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<LogEvent> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogRequest)) {
            return false;
        }
        LogRequest logRequest = (LogRequest) obj;
        if (this.f1216a == logRequest.mo19360g() && this.f1217b == logRequest.mo19361h() && ((clientInfo = this.f1218c) != null ? clientInfo.equals(logRequest.mo19354b()) : logRequest.mo19354b() == null) && ((num = this.f1219d) != null ? num.equals(logRequest.mo19356d()) : logRequest.mo19356d() == null) && ((str = this.f1220e) != null ? str.equals(logRequest.mo19357e()) : logRequest.mo19357e() == null) && ((list = this.f1221f) != null ? list.equals(logRequest.mo19355c()) : logRequest.mo19355c() == null)) {
            QosTier qosTier = this.f1222g;
            if (qosTier == null) {
                if (logRequest.mo19359f() == null) {
                    return true;
                }
            } else if (qosTier.equals(logRequest.mo19359f())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public QosTier mo19359f() {
        return this.f1222g;
    }

    /* renamed from: g */
    public long mo19360g() {
        return this.f1216a;
    }

    /* renamed from: h */
    public long mo19361h() {
        return this.f1217b;
    }

    public int hashCode() {
        long j = this.f1216a;
        long j2 = this.f1217b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.f1218c;
        int i2 = 0;
        int hashCode = (i ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f1219d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f1220e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<LogEvent> list = this.f1221f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f1222g;
        if (qosTier != null) {
            i2 = qosTier.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f1216a + ", requestUptimeMs=" + this.f1217b + ", clientInfo=" + this.f1218c + ", logSource=" + this.f1219d + ", logSourceName=" + this.f1220e + ", logEvents=" + this.f1221f + ", qosTier=" + this.f1222g + "}";
    }

    private AutoValue_LogRequest(long j, long j2, @Nullable ClientInfo clientInfo, @Nullable Integer num, @Nullable String str, @Nullable List<LogEvent> list, @Nullable QosTier qosTier) {
        this.f1216a = j;
        this.f1217b = j2;
        this.f1218c = clientInfo;
        this.f1219d = num;
        this.f1220e = str;
        this.f1221f = list;
        this.f1222g = qosTier;
    }
}
