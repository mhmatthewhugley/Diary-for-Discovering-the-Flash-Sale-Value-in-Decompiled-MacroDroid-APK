package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_Session_OperatingSystem extends CrashlyticsReport.Session.OperatingSystem {

    /* renamed from: a */
    private final int f5388a;

    /* renamed from: b */
    private final String f5389b;

    /* renamed from: c */
    private final String f5390c;

    /* renamed from: d */
    private final boolean f5391d;

    static final class Builder extends CrashlyticsReport.Session.OperatingSystem.Builder {

        /* renamed from: a */
        private Integer f5392a;

        /* renamed from: b */
        private String f5393b;

        /* renamed from: c */
        private String f5394c;

        /* renamed from: d */
        private Boolean f5395d;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.Session.OperatingSystem mo23401a() {
            String str = "";
            if (this.f5392a == null) {
                str = str + " platform";
            }
            if (this.f5393b == null) {
                str = str + " version";
            }
            if (this.f5394c == null) {
                str = str + " buildVersion";
            }
            if (this.f5395d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem(this.f5392a.intValue(), this.f5393b, this.f5394c, this.f5395d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Session.OperatingSystem.Builder mo23402b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f5394c = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.Session.OperatingSystem.Builder mo23403c(boolean z) {
            this.f5395d = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.Session.OperatingSystem.Builder mo23404d(int i) {
            this.f5392a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.Session.OperatingSystem.Builder mo23405e(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f5393b = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public String mo23394b() {
        return this.f5390c;
    }

    /* renamed from: c */
    public int mo23395c() {
        return this.f5388a;
    }

    @NonNull
    /* renamed from: d */
    public String mo23396d() {
        return this.f5389b;
    }

    /* renamed from: e */
    public boolean mo23397e() {
        return this.f5391d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.OperatingSystem)) {
            return false;
        }
        CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
        if (this.f5388a != operatingSystem.mo23395c() || !this.f5389b.equals(operatingSystem.mo23396d()) || !this.f5390c.equals(operatingSystem.mo23394b()) || this.f5391d != operatingSystem.mo23397e()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f5388a ^ 1000003) * 1000003) ^ this.f5389b.hashCode()) * 1000003) ^ this.f5390c.hashCode()) * 1000003) ^ (this.f5391d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f5388a + ", version=" + this.f5389b + ", buildVersion=" + this.f5390c + ", jailbroken=" + this.f5391d + "}";
    }

    private AutoValue_CrashlyticsReport_Session_OperatingSystem(int i, String str, String str2, boolean z) {
        this.f5388a = i;
        this.f5389b = str;
        this.f5390c = str2;
        this.f5391d = z;
    }
}
