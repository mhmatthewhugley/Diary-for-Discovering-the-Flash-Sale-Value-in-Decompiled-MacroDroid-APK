package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_Session_Event_Application extends CrashlyticsReport.Session.Event.Application {

    /* renamed from: a */
    private final CrashlyticsReport.Session.Event.Application.Execution f5314a;

    /* renamed from: b */
    private final ImmutableList<CrashlyticsReport.CustomAttribute> f5315b;

    /* renamed from: c */
    private final ImmutableList<CrashlyticsReport.CustomAttribute> f5316c;

    /* renamed from: d */
    private final Boolean f5317d;

    /* renamed from: e */
    private final int f5318e;

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Builder {

        /* renamed from: a */
        private CrashlyticsReport.Session.Event.Application.Execution f5319a;

        /* renamed from: b */
        private ImmutableList<CrashlyticsReport.CustomAttribute> f5320b;

        /* renamed from: c */
        private ImmutableList<CrashlyticsReport.CustomAttribute> f5321c;

        /* renamed from: d */
        private Boolean f5322d;

        /* renamed from: e */
        private Integer f5323e;

        /* renamed from: a */
        public CrashlyticsReport.Session.Event.Application mo23292a() {
            String str = "";
            if (this.f5319a == null) {
                str = str + " execution";
            }
            if (this.f5323e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application(this.f5319a, this.f5320b, this.f5321c, this.f5322d, this.f5323e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Session.Event.Application.Builder mo23293b(@Nullable Boolean bool) {
            this.f5322d = bool;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.Session.Event.Application.Builder mo23294c(ImmutableList<CrashlyticsReport.CustomAttribute> immutableList) {
            this.f5320b = immutableList;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.Session.Event.Application.Builder mo23295d(CrashlyticsReport.Session.Event.Application.Execution execution) {
            Objects.requireNonNull(execution, "Null execution");
            this.f5319a = execution;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.Session.Event.Application.Builder mo23296e(ImmutableList<CrashlyticsReport.CustomAttribute> immutableList) {
            this.f5321c = immutableList;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.Session.Event.Application.Builder mo23297f(int i) {
            this.f5323e = Integer.valueOf(i);
            return this;
        }

        Builder() {
        }

        private Builder(CrashlyticsReport.Session.Event.Application application) {
            this.f5319a = application.mo23285d();
            this.f5320b = application.mo23284c();
            this.f5321c = application.mo23286e();
            this.f5322d = application.mo23283b();
            this.f5323e = Integer.valueOf(application.mo23288f());
        }
    }

    @Nullable
    /* renamed from: b */
    public Boolean mo23283b() {
        return this.f5317d;
    }

    @Nullable
    /* renamed from: c */
    public ImmutableList<CrashlyticsReport.CustomAttribute> mo23284c() {
        return this.f5315b;
    }

    @NonNull
    /* renamed from: d */
    public CrashlyticsReport.Session.Event.Application.Execution mo23285d() {
        return this.f5314a;
    }

    @Nullable
    /* renamed from: e */
    public ImmutableList<CrashlyticsReport.CustomAttribute> mo23286e() {
        return this.f5316c;
    }

    public boolean equals(Object obj) {
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList;
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
        if (!this.f5314a.equals(application.mo23285d()) || ((immutableList = this.f5315b) != null ? !immutableList.equals(application.mo23284c()) : application.mo23284c() != null) || ((immutableList2 = this.f5316c) != null ? !immutableList2.equals(application.mo23286e()) : application.mo23286e() != null) || ((bool = this.f5317d) != null ? !bool.equals(application.mo23283b()) : application.mo23283b() != null) || this.f5318e != application.mo23288f()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo23288f() {
        return this.f5318e;
    }

    /* renamed from: g */
    public CrashlyticsReport.Session.Event.Application.Builder mo23289g() {
        return new Builder(this);
    }

    public int hashCode() {
        int hashCode = (this.f5314a.hashCode() ^ 1000003) * 1000003;
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList = this.f5315b;
        int i = 0;
        int hashCode2 = (hashCode ^ (immutableList == null ? 0 : immutableList.hashCode())) * 1000003;
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList2 = this.f5316c;
        int hashCode3 = (hashCode2 ^ (immutableList2 == null ? 0 : immutableList2.hashCode())) * 1000003;
        Boolean bool = this.f5317d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.f5318e;
    }

    public String toString() {
        return "Application{execution=" + this.f5314a + ", customAttributes=" + this.f5315b + ", internalKeys=" + this.f5316c + ", background=" + this.f5317d + ", uiOrientation=" + this.f5318e + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport.Session.Event.Application.Execution execution, @Nullable ImmutableList<CrashlyticsReport.CustomAttribute> immutableList, @Nullable ImmutableList<CrashlyticsReport.CustomAttribute> immutableList2, @Nullable Boolean bool, int i) {
        this.f5314a = execution;
        this.f5315b = immutableList;
        this.f5316c = immutableList2;
        this.f5317d = bool;
        this.f5318e = i;
    }
}
