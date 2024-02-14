package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.LogEvent;
import java.util.Arrays;

final class AutoValue_LogEvent extends LogEvent {

    /* renamed from: a */
    private final long f1202a;

    /* renamed from: b */
    private final Integer f1203b;

    /* renamed from: c */
    private final long f1204c;

    /* renamed from: d */
    private final byte[] f1205d;

    /* renamed from: e */
    private final String f1206e;

    /* renamed from: f */
    private final long f1207f;

    /* renamed from: g */
    private final NetworkConnectionInfo f1208g;

    static final class Builder extends LogEvent.Builder {

        /* renamed from: a */
        private Long f1209a;

        /* renamed from: b */
        private Integer f1210b;

        /* renamed from: c */
        private Long f1211c;

        /* renamed from: d */
        private byte[] f1212d;

        /* renamed from: e */
        private String f1213e;

        /* renamed from: f */
        private Long f1214f;

        /* renamed from: g */
        private NetworkConnectionInfo f1215g;

        Builder() {
        }

        /* renamed from: a */
        public LogEvent mo19346a() {
            String str = "";
            if (this.f1209a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f1211c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f1214f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new AutoValue_LogEvent(this.f1209a.longValue(), this.f1210b, this.f1211c.longValue(), this.f1212d, this.f1213e, this.f1214f.longValue(), this.f1215g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public LogEvent.Builder mo19347b(@Nullable Integer num) {
            this.f1210b = num;
            return this;
        }

        /* renamed from: c */
        public LogEvent.Builder mo19348c(long j) {
            this.f1209a = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public LogEvent.Builder mo19349d(long j) {
            this.f1211c = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public LogEvent.Builder mo19350e(@Nullable NetworkConnectionInfo networkConnectionInfo) {
            this.f1215g = networkConnectionInfo;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public LogEvent.Builder mo19351f(@Nullable byte[] bArr) {
            this.f1212d = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public LogEvent.Builder mo19352g(@Nullable String str) {
            this.f1213e = str;
            return this;
        }

        /* renamed from: h */
        public LogEvent.Builder mo19353h(long j) {
            this.f1214f = Long.valueOf(j);
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public Integer mo19336b() {
        return this.f1203b;
    }

    /* renamed from: c */
    public long mo19337c() {
        return this.f1202a;
    }

    /* renamed from: d */
    public long mo19338d() {
        return this.f1204c;
    }

    @Nullable
    /* renamed from: e */
    public NetworkConnectionInfo mo19339e() {
        return this.f1208g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogEvent)) {
            return false;
        }
        LogEvent logEvent = (LogEvent) obj;
        if (this.f1202a == logEvent.mo19337c() && ((num = this.f1203b) != null ? num.equals(logEvent.mo19336b()) : logEvent.mo19336b() == null) && this.f1204c == logEvent.mo19338d()) {
            if (Arrays.equals(this.f1205d, logEvent instanceof AutoValue_LogEvent ? ((AutoValue_LogEvent) logEvent).f1205d : logEvent.mo19341f()) && ((str = this.f1206e) != null ? str.equals(logEvent.mo19342g()) : logEvent.mo19342g() == null) && this.f1207f == logEvent.mo19343h()) {
                NetworkConnectionInfo networkConnectionInfo = this.f1208g;
                if (networkConnectionInfo == null) {
                    if (logEvent.mo19339e() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(logEvent.mo19339e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public byte[] mo19341f() {
        return this.f1205d;
    }

    @Nullable
    /* renamed from: g */
    public String mo19342g() {
        return this.f1206e;
    }

    /* renamed from: h */
    public long mo19343h() {
        return this.f1207f;
    }

    public int hashCode() {
        long j = this.f1202a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f1203b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f1204c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f1205d)) * 1000003;
        String str = this.f1206e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f1207f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f1208g;
        if (networkConnectionInfo != null) {
            i2 = networkConnectionInfo.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f1202a + ", eventCode=" + this.f1203b + ", eventUptimeMs=" + this.f1204c + ", sourceExtension=" + Arrays.toString(this.f1205d) + ", sourceExtensionJsonProto3=" + this.f1206e + ", timezoneOffsetSeconds=" + this.f1207f + ", networkConnectionInfo=" + this.f1208g + "}";
    }

    private AutoValue_LogEvent(long j, @Nullable Integer num, long j2, @Nullable byte[] bArr, @Nullable String str, long j3, @Nullable NetworkConnectionInfo networkConnectionInfo) {
        this.f1202a = j;
        this.f1203b = num;
        this.f1204c = j2;
        this.f1205d = bArr;
        this.f1206e = str;
        this.f1207f = j3;
        this.f1208g = networkConnectionInfo;
    }
}
