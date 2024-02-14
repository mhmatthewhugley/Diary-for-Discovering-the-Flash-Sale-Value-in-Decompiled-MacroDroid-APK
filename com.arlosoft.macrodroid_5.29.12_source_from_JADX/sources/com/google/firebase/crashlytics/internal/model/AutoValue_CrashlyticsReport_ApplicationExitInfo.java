package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_ApplicationExitInfo extends CrashlyticsReport.ApplicationExitInfo {

    /* renamed from: a */
    private final int f5221a;

    /* renamed from: b */
    private final String f5222b;

    /* renamed from: c */
    private final int f5223c;

    /* renamed from: d */
    private final int f5224d;

    /* renamed from: e */
    private final long f5225e;

    /* renamed from: f */
    private final long f5226f;

    /* renamed from: g */
    private final long f5227g;

    /* renamed from: h */
    private final String f5228h;

    static final class Builder extends CrashlyticsReport.ApplicationExitInfo.Builder {

        /* renamed from: a */
        private Integer f5229a;

        /* renamed from: b */
        private String f5230b;

        /* renamed from: c */
        private Integer f5231c;

        /* renamed from: d */
        private Integer f5232d;

        /* renamed from: e */
        private Long f5233e;

        /* renamed from: f */
        private Long f5234f;

        /* renamed from: g */
        private Long f5235g;

        /* renamed from: h */
        private String f5236h;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.ApplicationExitInfo mo23165a() {
            String str = "";
            if (this.f5229a == null) {
                str = str + " pid";
            }
            if (this.f5230b == null) {
                str = str + " processName";
            }
            if (this.f5231c == null) {
                str = str + " reasonCode";
            }
            if (this.f5232d == null) {
                str = str + " importance";
            }
            if (this.f5233e == null) {
                str = str + " pss";
            }
            if (this.f5234f == null) {
                str = str + " rss";
            }
            if (this.f5235g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo(this.f5229a.intValue(), this.f5230b, this.f5231c.intValue(), this.f5232d.intValue(), this.f5233e.longValue(), this.f5234f.longValue(), this.f5235g.longValue(), this.f5236h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.ApplicationExitInfo.Builder mo23166b(int i) {
            this.f5232d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.ApplicationExitInfo.Builder mo23167c(int i) {
            this.f5229a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.ApplicationExitInfo.Builder mo23168d(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.f5230b = str;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.ApplicationExitInfo.Builder mo23169e(long j) {
            this.f5233e = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.ApplicationExitInfo.Builder mo23170f(int i) {
            this.f5231c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.ApplicationExitInfo.Builder mo23171g(long j) {
            this.f5234f = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public CrashlyticsReport.ApplicationExitInfo.Builder mo23172h(long j) {
            this.f5235g = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.ApplicationExitInfo.Builder mo23173i(@Nullable String str) {
            this.f5236h = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public int mo23154b() {
        return this.f5224d;
    }

    @NonNull
    /* renamed from: c */
    public int mo23155c() {
        return this.f5221a;
    }

    @NonNull
    /* renamed from: d */
    public String mo23156d() {
        return this.f5222b;
    }

    @NonNull
    /* renamed from: e */
    public long mo23157e() {
        return this.f5225e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
        if (this.f5221a == applicationExitInfo.mo23155c() && this.f5222b.equals(applicationExitInfo.mo23156d()) && this.f5223c == applicationExitInfo.mo23159f() && this.f5224d == applicationExitInfo.mo23154b() && this.f5225e == applicationExitInfo.mo23157e() && this.f5226f == applicationExitInfo.mo23160g() && this.f5227g == applicationExitInfo.mo23161h()) {
            String str = this.f5228h;
            if (str == null) {
                if (applicationExitInfo.mo23163i() == null) {
                    return true;
                }
            } else if (str.equals(applicationExitInfo.mo23163i())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public int mo23159f() {
        return this.f5223c;
    }

    @NonNull
    /* renamed from: g */
    public long mo23160g() {
        return this.f5226f;
    }

    @NonNull
    /* renamed from: h */
    public long mo23161h() {
        return this.f5227g;
    }

    public int hashCode() {
        long j = this.f5225e;
        long j2 = this.f5226f;
        long j3 = this.f5227g;
        int hashCode = (((((((((((((this.f5221a ^ 1000003) * 1000003) ^ this.f5222b.hashCode()) * 1000003) ^ this.f5223c) * 1000003) ^ this.f5224d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f5228h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Nullable
    /* renamed from: i */
    public String mo23163i() {
        return this.f5228h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f5221a + ", processName=" + this.f5222b + ", reasonCode=" + this.f5223c + ", importance=" + this.f5224d + ", pss=" + this.f5225e + ", rss=" + this.f5226f + ", timestamp=" + this.f5227g + ", traceFile=" + this.f5228h + "}";
    }

    private AutoValue_CrashlyticsReport_ApplicationExitInfo(int i, String str, int i2, int i3, long j, long j2, long j3, @Nullable String str2) {
        this.f5221a = i;
        this.f5222b = str;
        this.f5223c = i2;
        this.f5224d = i3;
        this.f5225e = j;
        this.f5226f = j2;
        this.f5227g = j3;
        this.f5228h = str2;
    }
}
