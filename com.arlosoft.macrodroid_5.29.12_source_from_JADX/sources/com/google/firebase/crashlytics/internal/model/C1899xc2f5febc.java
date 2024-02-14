package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception */
final class C1899xc2f5febc extends CrashlyticsReport.Session.Event.Application.Execution.Exception {

    /* renamed from: a */
    private final String f5342a;

    /* renamed from: b */
    private final String f5343b;

    /* renamed from: c */
    private final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> f5344c;

    /* renamed from: d */
    private final CrashlyticsReport.Session.Event.Application.Execution.Exception f5345d;

    /* renamed from: e */
    private final int f5346e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$Builder */
    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder {

        /* renamed from: a */
        private String f5347a;

        /* renamed from: b */
        private String f5348b;

        /* renamed from: c */
        private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> f5349c;

        /* renamed from: d */
        private CrashlyticsReport.Session.Event.Application.Execution.Exception f5350d;

        /* renamed from: e */
        private Integer f5351e;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.Session.Event.Application.Execution.Exception mo23332a() {
            String str = "";
            if (this.f5347a == null) {
                str = str + " type";
            }
            if (this.f5349c == null) {
                str = str + " frames";
            }
            if (this.f5351e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C1899xc2f5febc(this.f5347a, this.f5348b, this.f5349c, this.f5350d, this.f5351e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder mo23333b(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.f5350d = exception;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder mo23334c(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> immutableList) {
            Objects.requireNonNull(immutableList, "Null frames");
            this.f5349c = immutableList;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder mo23335d(int i) {
            this.f5351e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder mo23336e(String str) {
            this.f5348b = str;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder mo23337f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f5347a = str;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public CrashlyticsReport.Session.Event.Application.Execution.Exception mo23324b() {
        return this.f5345d;
    }

    @NonNull
    /* renamed from: c */
    public ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> mo23325c() {
        return this.f5344c;
    }

    /* renamed from: d */
    public int mo23326d() {
        return this.f5346e;
    }

    @Nullable
    /* renamed from: e */
    public String mo23327e() {
        return this.f5343b;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Exception)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception2 = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
        if (!this.f5342a.equals(exception2.mo23329f()) || ((str = this.f5343b) != null ? !str.equals(exception2.mo23327e()) : exception2.mo23327e() != null) || !this.f5344c.equals(exception2.mo23325c()) || ((exception = this.f5345d) != null ? !exception.equals(exception2.mo23324b()) : exception2.mo23324b() != null) || this.f5346e != exception2.mo23326d()) {
            return false;
        }
        return true;
    }

    @NonNull
    /* renamed from: f */
    public String mo23329f() {
        return this.f5342a;
    }

    public int hashCode() {
        int hashCode = (this.f5342a.hashCode() ^ 1000003) * 1000003;
        String str = this.f5343b;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f5344c.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f5345d;
        if (exception != null) {
            i = exception.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.f5346e;
    }

    public String toString() {
        return "Exception{type=" + this.f5342a + ", reason=" + this.f5343b + ", frames=" + this.f5344c + ", causedBy=" + this.f5345d + ", overflowCount=" + this.f5346e + "}";
    }

    private C1899xc2f5febc(String str, @Nullable String str2, ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> immutableList, @Nullable CrashlyticsReport.Session.Event.Application.Execution.Exception exception, int i) {
        this.f5342a = str;
        this.f5343b = str2;
        this.f5344c = immutableList;
        this.f5345d = exception;
        this.f5346e = i;
    }
}
