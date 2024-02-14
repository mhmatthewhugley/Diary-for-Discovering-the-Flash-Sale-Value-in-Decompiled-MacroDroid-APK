package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_Session_Event extends CrashlyticsReport.Session.Event {

    /* renamed from: a */
    private final long f5304a;

    /* renamed from: b */
    private final String f5305b;

    /* renamed from: c */
    private final CrashlyticsReport.Session.Event.Application f5306c;

    /* renamed from: d */
    private final CrashlyticsReport.Session.Event.Device f5307d;

    /* renamed from: e */
    private final CrashlyticsReport.Session.Event.Log f5308e;

    static final class Builder extends CrashlyticsReport.Session.Event.Builder {

        /* renamed from: a */
        private Long f5309a;

        /* renamed from: b */
        private String f5310b;

        /* renamed from: c */
        private CrashlyticsReport.Session.Event.Application f5311c;

        /* renamed from: d */
        private CrashlyticsReport.Session.Event.Device f5312d;

        /* renamed from: e */
        private CrashlyticsReport.Session.Event.Log f5313e;

        /* renamed from: a */
        public CrashlyticsReport.Session.Event mo23277a() {
            String str = "";
            if (this.f5309a == null) {
                str = str + " timestamp";
            }
            if (this.f5310b == null) {
                str = str + " type";
            }
            if (this.f5311c == null) {
                str = str + " app";
            }
            if (this.f5312d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event(this.f5309a.longValue(), this.f5310b, this.f5311c, this.f5312d, this.f5313e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Session.Event.Builder mo23278b(CrashlyticsReport.Session.Event.Application application) {
            Objects.requireNonNull(application, "Null app");
            this.f5311c = application;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.Session.Event.Builder mo23279c(CrashlyticsReport.Session.Event.Device device) {
            Objects.requireNonNull(device, "Null device");
            this.f5312d = device;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.Session.Event.Builder mo23280d(CrashlyticsReport.Session.Event.Log log) {
            this.f5313e = log;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.Session.Event.Builder mo23281e(long j) {
            this.f5309a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.Session.Event.Builder mo23282f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f5310b = str;
            return this;
        }

        Builder() {
        }

        private Builder(CrashlyticsReport.Session.Event event) {
            this.f5309a = Long.valueOf(event.mo23271e());
            this.f5310b = event.mo23273f();
            this.f5311c = event.mo23268b();
            this.f5312d = event.mo23269c();
            this.f5313e = event.mo23270d();
        }
    }

    @NonNull
    /* renamed from: b */
    public CrashlyticsReport.Session.Event.Application mo23268b() {
        return this.f5306c;
    }

    @NonNull
    /* renamed from: c */
    public CrashlyticsReport.Session.Event.Device mo23269c() {
        return this.f5307d;
    }

    @Nullable
    /* renamed from: d */
    public CrashlyticsReport.Session.Event.Log mo23270d() {
        return this.f5308e;
    }

    /* renamed from: e */
    public long mo23271e() {
        return this.f5304a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event)) {
            return false;
        }
        CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
        if (this.f5304a == event.mo23271e() && this.f5305b.equals(event.mo23273f()) && this.f5306c.equals(event.mo23268b()) && this.f5307d.equals(event.mo23269c())) {
            CrashlyticsReport.Session.Event.Log log = this.f5308e;
            if (log == null) {
                if (event.mo23270d() == null) {
                    return true;
                }
            } else if (log.equals(event.mo23270d())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo23273f() {
        return this.f5305b;
    }

    /* renamed from: g */
    public CrashlyticsReport.Session.Event.Builder mo23274g() {
        return new Builder(this);
    }

    public int hashCode() {
        long j = this.f5304a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f5305b.hashCode()) * 1000003) ^ this.f5306c.hashCode()) * 1000003) ^ this.f5307d.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Log log = this.f5308e;
        return (log == null ? 0 : log.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.f5304a + ", type=" + this.f5305b + ", app=" + this.f5306c + ", device=" + this.f5307d + ", log=" + this.f5308e + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event(long j, String str, CrashlyticsReport.Session.Event.Application application, CrashlyticsReport.Session.Event.Device device, @Nullable CrashlyticsReport.Session.Event.Log log) {
        this.f5304a = j;
        this.f5305b = str;
        this.f5306c = application;
        this.f5307d = device;
        this.f5308e = log;
    }
}
