package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
final class C1901x7c929f5b extends CrashlyticsReport.Session.Event.Application.Execution.Signal {

    /* renamed from: a */
    private final String f5352a;

    /* renamed from: b */
    private final String f5353b;

    /* renamed from: c */
    private final long f5354c;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal$Builder */
    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {

        /* renamed from: a */
        private String f5355a;

        /* renamed from: b */
        private String f5356b;

        /* renamed from: c */
        private Long f5357c;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.Session.Event.Application.Execution.Signal mo23344a() {
            String str = "";
            if (this.f5355a == null) {
                str = str + " name";
            }
            if (this.f5356b == null) {
                str = str + " code";
            }
            if (this.f5357c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C1901x7c929f5b(this.f5355a, this.f5356b, this.f5357c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder mo23345b(long j) {
            this.f5357c = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder mo23346c(String str) {
            Objects.requireNonNull(str, "Null code");
            this.f5356b = str;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder mo23347d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f5355a = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public long mo23338b() {
        return this.f5354c;
    }

    @NonNull
    /* renamed from: c */
    public String mo23339c() {
        return this.f5353b;
    }

    @NonNull
    /* renamed from: d */
    public String mo23340d() {
        return this.f5352a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Signal)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
        if (!this.f5352a.equals(signal.mo23340d()) || !this.f5353b.equals(signal.mo23339c()) || this.f5354c != signal.mo23338b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f5354c;
        return ((((this.f5352a.hashCode() ^ 1000003) * 1000003) ^ this.f5353b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f5352a + ", code=" + this.f5353b + ", address=" + this.f5354c + "}";
    }

    private C1901x7c929f5b(String str, String str2, long j) {
        this.f5352a = str;
        this.f5353b = str2;
        this.f5354c = j;
    }
}
