package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

final class AutoValue_CrashlyticsReport extends CrashlyticsReport {

    /* renamed from: b */
    private final String f5205b;

    /* renamed from: c */
    private final String f5206c;

    /* renamed from: d */
    private final int f5207d;

    /* renamed from: e */
    private final String f5208e;

    /* renamed from: f */
    private final String f5209f;

    /* renamed from: g */
    private final String f5210g;

    /* renamed from: h */
    private final CrashlyticsReport.Session f5211h;

    /* renamed from: i */
    private final CrashlyticsReport.FilesPayload f5212i;

    static final class Builder extends CrashlyticsReport.Builder {

        /* renamed from: a */
        private String f5213a;

        /* renamed from: b */
        private String f5214b;

        /* renamed from: c */
        private Integer f5215c;

        /* renamed from: d */
        private String f5216d;

        /* renamed from: e */
        private String f5217e;

        /* renamed from: f */
        private String f5218f;

        /* renamed from: g */
        private CrashlyticsReport.Session f5219g;

        /* renamed from: h */
        private CrashlyticsReport.FilesPayload f5220h;

        /* renamed from: a */
        public CrashlyticsReport mo23145a() {
            String str = "";
            if (this.f5213a == null) {
                str = str + " sdkVersion";
            }
            if (this.f5214b == null) {
                str = str + " gmpAppId";
            }
            if (this.f5215c == null) {
                str = str + " platform";
            }
            if (this.f5216d == null) {
                str = str + " installationUuid";
            }
            if (this.f5217e == null) {
                str = str + " buildVersion";
            }
            if (this.f5218f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport(this.f5213a, this.f5214b, this.f5215c.intValue(), this.f5216d, this.f5217e, this.f5218f, this.f5219g, this.f5220h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Builder mo23146b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f5217e = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.Builder mo23147c(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f5218f = str;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.Builder mo23148d(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.f5214b = str;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.Builder mo23149e(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.f5216d = str;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.Builder mo23150f(CrashlyticsReport.FilesPayload filesPayload) {
            this.f5220h = filesPayload;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.Builder mo23151g(int i) {
            this.f5215c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: h */
        public CrashlyticsReport.Builder mo23152h(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.f5213a = str;
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.Builder mo23153i(CrashlyticsReport.Session session) {
            this.f5219g = session;
            return this;
        }

        Builder() {
        }

        private Builder(CrashlyticsReport crashlyticsReport) {
            this.f5213a = crashlyticsReport.mo23141i();
            this.f5214b = crashlyticsReport.mo23135e();
            this.f5215c = Integer.valueOf(crashlyticsReport.mo23139h());
            this.f5216d = crashlyticsReport.mo23137f();
            this.f5217e = crashlyticsReport.mo23133c();
            this.f5218f = crashlyticsReport.mo23134d();
            this.f5219g = crashlyticsReport.mo23142j();
            this.f5220h = crashlyticsReport.mo23138g();
        }
    }

    @NonNull
    /* renamed from: c */
    public String mo23133c() {
        return this.f5209f;
    }

    @NonNull
    /* renamed from: d */
    public String mo23134d() {
        return this.f5210g;
    }

    @NonNull
    /* renamed from: e */
    public String mo23135e() {
        return this.f5206c;
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.Session session;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.f5205b.equals(crashlyticsReport.mo23141i()) && this.f5206c.equals(crashlyticsReport.mo23135e()) && this.f5207d == crashlyticsReport.mo23139h() && this.f5208e.equals(crashlyticsReport.mo23137f()) && this.f5209f.equals(crashlyticsReport.mo23133c()) && this.f5210g.equals(crashlyticsReport.mo23134d()) && ((session = this.f5211h) != null ? session.equals(crashlyticsReport.mo23142j()) : crashlyticsReport.mo23142j() == null)) {
            CrashlyticsReport.FilesPayload filesPayload = this.f5212i;
            if (filesPayload == null) {
                if (crashlyticsReport.mo23138g() == null) {
                    return true;
                }
            } else if (filesPayload.equals(crashlyticsReport.mo23138g())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo23137f() {
        return this.f5208e;
    }

    @Nullable
    /* renamed from: g */
    public CrashlyticsReport.FilesPayload mo23138g() {
        return this.f5212i;
    }

    /* renamed from: h */
    public int mo23139h() {
        return this.f5207d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f5205b.hashCode() ^ 1000003) * 1000003) ^ this.f5206c.hashCode()) * 1000003) ^ this.f5207d) * 1000003) ^ this.f5208e.hashCode()) * 1000003) ^ this.f5209f.hashCode()) * 1000003) ^ this.f5210g.hashCode()) * 1000003;
        CrashlyticsReport.Session session = this.f5211h;
        int i = 0;
        int hashCode2 = (hashCode ^ (session == null ? 0 : session.hashCode())) * 1000003;
        CrashlyticsReport.FilesPayload filesPayload = this.f5212i;
        if (filesPayload != null) {
            i = filesPayload.hashCode();
        }
        return hashCode2 ^ i;
    }

    @NonNull
    /* renamed from: i */
    public String mo23141i() {
        return this.f5205b;
    }

    @Nullable
    /* renamed from: j */
    public CrashlyticsReport.Session mo23142j() {
        return this.f5211h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public CrashlyticsReport.Builder mo23143k() {
        return new Builder(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f5205b + ", gmpAppId=" + this.f5206c + ", platform=" + this.f5207d + ", installationUuid=" + this.f5208e + ", buildVersion=" + this.f5209f + ", displayVersion=" + this.f5210g + ", session=" + this.f5211h + ", ndkPayload=" + this.f5212i + "}";
    }

    private AutoValue_CrashlyticsReport(String str, String str2, int i, String str3, String str4, String str5, @Nullable CrashlyticsReport.Session session, @Nullable CrashlyticsReport.FilesPayload filesPayload) {
        this.f5205b = str;
        this.f5206c = str2;
        this.f5207d = i;
        this.f5208e = str3;
        this.f5209f = str4;
        this.f5210g = str5;
        this.f5211h = session;
        this.f5212i = filesPayload;
    }
}
