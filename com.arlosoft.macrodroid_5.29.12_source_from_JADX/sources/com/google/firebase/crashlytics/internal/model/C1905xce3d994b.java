package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
final class C1905xce3d994b extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {

    /* renamed from: a */
    private final long f5364a;

    /* renamed from: b */
    private final String f5365b;

    /* renamed from: c */
    private final String f5366c;

    /* renamed from: d */
    private final long f5367d;

    /* renamed from: e */
    private final int f5368e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder */
    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {

        /* renamed from: a */
        private Long f5369a;

        /* renamed from: b */
        private String f5370b;

        /* renamed from: c */
        private String f5371c;

        /* renamed from: d */
        private Long f5372d;

        /* renamed from: e */
        private Integer f5373e;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame mo23366a() {
            String str = "";
            if (this.f5369a == null) {
                str = str + " pc";
            }
            if (this.f5370b == null) {
                str = str + " symbol";
            }
            if (this.f5372d == null) {
                str = str + " offset";
            }
            if (this.f5373e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C1905xce3d994b(this.f5369a.longValue(), this.f5370b, this.f5371c, this.f5372d.longValue(), this.f5373e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder mo23367b(String str) {
            this.f5371c = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder mo23368c(int i) {
            this.f5373e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder mo23369d(long j) {
            this.f5372d = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder mo23370e(long j) {
            this.f5369a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder mo23371f(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.f5370b = str;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public String mo23358b() {
        return this.f5366c;
    }

    /* renamed from: c */
    public int mo23359c() {
        return this.f5368e;
    }

    /* renamed from: d */
    public long mo23360d() {
        return this.f5367d;
    }

    /* renamed from: e */
    public long mo23361e() {
        return this.f5364a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
        if (this.f5364a == frame.mo23361e() && this.f5365b.equals(frame.mo23363f()) && ((str = this.f5366c) != null ? str.equals(frame.mo23358b()) : frame.mo23358b() == null) && this.f5367d == frame.mo23360d() && this.f5368e == frame.mo23359c()) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo23363f() {
        return this.f5365b;
    }

    public int hashCode() {
        long j = this.f5364a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f5365b.hashCode()) * 1000003;
        String str = this.f5366c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f5367d;
        return this.f5368e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f5364a + ", symbol=" + this.f5365b + ", file=" + this.f5366c + ", offset=" + this.f5367d + ", importance=" + this.f5368e + "}";
    }

    private C1905xce3d994b(long j, String str, @Nullable String str2, long j2, int i) {
        this.f5364a = j;
        this.f5365b = str;
        this.f5366c = str2;
        this.f5367d = j2;
        this.f5368e = i;
    }
}
