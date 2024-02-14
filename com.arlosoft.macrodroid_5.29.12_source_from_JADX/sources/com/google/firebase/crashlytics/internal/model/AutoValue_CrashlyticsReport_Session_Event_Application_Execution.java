package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution extends CrashlyticsReport.Session.Event.Application.Execution {

    /* renamed from: a */
    private final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> f5324a;

    /* renamed from: b */
    private final CrashlyticsReport.Session.Event.Application.Execution.Exception f5325b;

    /* renamed from: c */
    private final CrashlyticsReport.ApplicationExitInfo f5326c;

    /* renamed from: d */
    private final CrashlyticsReport.Session.Event.Application.Execution.Signal f5327d;

    /* renamed from: e */
    private final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> f5328e;

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Builder {

        /* renamed from: a */
        private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> f5329a;

        /* renamed from: b */
        private CrashlyticsReport.Session.Event.Application.Execution.Exception f5330b;

        /* renamed from: c */
        private CrashlyticsReport.ApplicationExitInfo f5331c;

        /* renamed from: d */
        private CrashlyticsReport.Session.Event.Application.Execution.Signal f5332d;

        /* renamed from: e */
        private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> f5333e;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.Session.Event.Application.Execution mo23306a() {
            String str = "";
            if (this.f5332d == null) {
                str = str + " signal";
            }
            if (this.f5333e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution(this.f5329a, this.f5330b, this.f5331c, this.f5332d, this.f5333e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Session.Event.Application.Execution.Builder mo23307b(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.f5331c = applicationExitInfo;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.Session.Event.Application.Execution.Builder mo23308c(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> immutableList) {
            Objects.requireNonNull(immutableList, "Null binaries");
            this.f5333e = immutableList;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.Session.Event.Application.Execution.Builder mo23309d(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.f5330b = exception;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.Session.Event.Application.Execution.Builder mo23310e(CrashlyticsReport.Session.Event.Application.Execution.Signal signal) {
            Objects.requireNonNull(signal, "Null signal");
            this.f5332d = signal;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.Session.Event.Application.Execution.Builder mo23311f(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> immutableList) {
            this.f5329a = immutableList;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public CrashlyticsReport.ApplicationExitInfo mo23298b() {
        return this.f5326c;
    }

    @NonNull
    /* renamed from: c */
    public ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> mo23299c() {
        return this.f5328e;
    }

    @Nullable
    /* renamed from: d */
    public CrashlyticsReport.Session.Event.Application.Execution.Exception mo23300d() {
        return this.f5325b;
    }

    @NonNull
    /* renamed from: e */
    public CrashlyticsReport.Session.Event.Application.Execution.Signal mo23301e() {
        return this.f5327d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
        ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> immutableList = this.f5324a;
        if (immutableList != null ? immutableList.equals(execution.mo23303f()) : execution.mo23303f() == null) {
            CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f5325b;
            if (exception != null ? exception.equals(execution.mo23300d()) : execution.mo23300d() == null) {
                CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f5326c;
                if (applicationExitInfo != null ? applicationExitInfo.equals(execution.mo23298b()) : execution.mo23298b() == null) {
                    if (!this.f5327d.equals(execution.mo23301e()) || !this.f5328e.equals(execution.mo23299c())) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> mo23303f() {
        return this.f5324a;
    }

    public int hashCode() {
        ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> immutableList = this.f5324a;
        int i = 0;
        int hashCode = ((immutableList == null ? 0 : immutableList.hashCode()) ^ 1000003) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f5325b;
        int hashCode2 = (hashCode ^ (exception == null ? 0 : exception.hashCode())) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f5326c;
        if (applicationExitInfo != null) {
            i = applicationExitInfo.hashCode();
        }
        return ((((hashCode2 ^ i) * 1000003) ^ this.f5327d.hashCode()) * 1000003) ^ this.f5328e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f5324a + ", exception=" + this.f5325b + ", appExitInfo=" + this.f5326c + ", signal=" + this.f5327d + ", binaries=" + this.f5328e + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution(@Nullable ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> immutableList, @Nullable CrashlyticsReport.Session.Event.Application.Execution.Exception exception, @Nullable CrashlyticsReport.ApplicationExitInfo applicationExitInfo, CrashlyticsReport.Session.Event.Application.Execution.Signal signal, ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> immutableList2) {
        this.f5324a = immutableList;
        this.f5325b = exception;
        this.f5326c = applicationExitInfo;
        this.f5327d = signal;
        this.f5328e = immutableList2;
    }
}
