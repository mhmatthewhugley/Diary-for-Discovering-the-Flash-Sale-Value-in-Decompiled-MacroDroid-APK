package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_Session_Application extends CrashlyticsReport.Session.Application {

    /* renamed from: a */
    private final String f5271a;

    /* renamed from: b */
    private final String f5272b;

    /* renamed from: c */
    private final String f5273c;

    /* renamed from: d */
    private final CrashlyticsReport.Session.Application.Organization f5274d;

    /* renamed from: e */
    private final String f5275e;

    /* renamed from: f */
    private final String f5276f;

    /* renamed from: g */
    private final String f5277g;

    static final class Builder extends CrashlyticsReport.Session.Application.Builder {

        /* renamed from: a */
        private String f5278a;

        /* renamed from: b */
        private String f5279b;

        /* renamed from: c */
        private String f5280c;

        /* renamed from: d */
        private CrashlyticsReport.Session.Application.Organization f5281d;

        /* renamed from: e */
        private String f5282e;

        /* renamed from: f */
        private String f5283f;

        /* renamed from: g */
        private String f5284g;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.Session.Application mo23235a() {
            String str = "";
            if (this.f5278a == null) {
                str = str + " identifier";
            }
            if (this.f5279b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Application(this.f5278a, this.f5279b, this.f5280c, this.f5281d, this.f5282e, this.f5283f, this.f5284g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Session.Application.Builder mo23236b(@Nullable String str) {
            this.f5283f = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.Session.Application.Builder mo23237c(@Nullable String str) {
            this.f5284g = str;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.Session.Application.Builder mo23238d(String str) {
            this.f5280c = str;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.Session.Application.Builder mo23239e(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f5278a = str;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.Session.Application.Builder mo23240f(String str) {
            this.f5282e = str;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.Session.Application.Builder mo23241g(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f5279b = str;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public String mo23225b() {
        return this.f5276f;
    }

    @Nullable
    /* renamed from: c */
    public String mo23226c() {
        return this.f5277g;
    }

    @Nullable
    /* renamed from: d */
    public String mo23227d() {
        return this.f5273c;
    }

    @NonNull
    /* renamed from: e */
    public String mo23228e() {
        return this.f5271a;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Application.Organization organization;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
        if (this.f5271a.equals(application.mo23228e()) && this.f5272b.equals(application.mo23232h()) && ((str = this.f5273c) != null ? str.equals(application.mo23227d()) : application.mo23227d() == null) && ((organization = this.f5274d) != null ? organization.equals(application.mo23231g()) : application.mo23231g() == null) && ((str2 = this.f5275e) != null ? str2.equals(application.mo23230f()) : application.mo23230f() == null) && ((str3 = this.f5276f) != null ? str3.equals(application.mo23225b()) : application.mo23225b() == null)) {
            String str4 = this.f5277g;
            if (str4 == null) {
                if (application.mo23226c() == null) {
                    return true;
                }
            } else if (str4.equals(application.mo23226c())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public String mo23230f() {
        return this.f5275e;
    }

    @Nullable
    /* renamed from: g */
    public CrashlyticsReport.Session.Application.Organization mo23231g() {
        return this.f5274d;
    }

    @NonNull
    /* renamed from: h */
    public String mo23232h() {
        return this.f5272b;
    }

    public int hashCode() {
        int hashCode = (((this.f5271a.hashCode() ^ 1000003) * 1000003) ^ this.f5272b.hashCode()) * 1000003;
        String str = this.f5273c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.Session.Application.Organization organization = this.f5274d;
        int hashCode3 = (hashCode2 ^ (organization == null ? 0 : organization.hashCode())) * 1000003;
        String str2 = this.f5275e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f5276f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f5277g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 ^ i;
    }

    public String toString() {
        return "Application{identifier=" + this.f5271a + ", version=" + this.f5272b + ", displayVersion=" + this.f5273c + ", organization=" + this.f5274d + ", installationUuid=" + this.f5275e + ", developmentPlatform=" + this.f5276f + ", developmentPlatformVersion=" + this.f5277g + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Application(String str, String str2, @Nullable String str3, @Nullable CrashlyticsReport.Session.Application.Organization organization, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.f5271a = str;
        this.f5272b = str2;
        this.f5273c = str3;
        this.f5274d = organization;
        this.f5275e = str4;
        this.f5276f = str5;
        this.f5277g = str6;
    }
}
