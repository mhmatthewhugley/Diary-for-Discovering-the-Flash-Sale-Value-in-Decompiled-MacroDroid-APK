package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread */
final class C1903x7e3e3ebd extends CrashlyticsReport.Session.Event.Application.Execution.Thread {

    /* renamed from: a */
    private final String f5358a;

    /* renamed from: b */
    private final int f5359b;

    /* renamed from: c */
    private final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> f5360c;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$Builder */
    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {

        /* renamed from: a */
        private String f5361a;

        /* renamed from: b */
        private Integer f5362b;

        /* renamed from: c */
        private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> f5363c;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.Session.Event.Application.Execution.Thread mo23354a() {
            String str = "";
            if (this.f5361a == null) {
                str = str + " name";
            }
            if (this.f5362b == null) {
                str = str + " importance";
            }
            if (this.f5363c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C1903x7e3e3ebd(this.f5361a, this.f5362b.intValue(), this.f5363c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder mo23355b(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> immutableList) {
            Objects.requireNonNull(immutableList, "Null frames");
            this.f5363c = immutableList;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder mo23356c(int i) {
            this.f5362b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder mo23357d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f5361a = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> mo23348b() {
        return this.f5360c;
    }

    /* renamed from: c */
    public int mo23349c() {
        return this.f5359b;
    }

    @NonNull
    /* renamed from: d */
    public String mo23350d() {
        return this.f5358a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
        if (!this.f5358a.equals(thread.mo23350d()) || this.f5359b != thread.mo23349c() || !this.f5360c.equals(thread.mo23348b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f5358a.hashCode() ^ 1000003) * 1000003) ^ this.f5359b) * 1000003) ^ this.f5360c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f5358a + ", importance=" + this.f5359b + ", frames=" + this.f5360c + "}";
    }

    private C1903x7e3e3ebd(String str, int i, ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> immutableList) {
        this.f5358a = str;
        this.f5359b = i;
        this.f5360c = immutableList;
    }
}
