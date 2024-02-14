package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.Session {

    /* renamed from: a */
    private final String f5249a;

    /* renamed from: b */
    private final String f5250b;

    /* renamed from: c */
    private final long f5251c;

    /* renamed from: d */
    private final Long f5252d;

    /* renamed from: e */
    private final boolean f5253e;

    /* renamed from: f */
    private final CrashlyticsReport.Session.Application f5254f;

    /* renamed from: g */
    private final CrashlyticsReport.Session.User f5255g;

    /* renamed from: h */
    private final CrashlyticsReport.Session.OperatingSystem f5256h;

    /* renamed from: i */
    private final CrashlyticsReport.Session.Device f5257i;

    /* renamed from: j */
    private final ImmutableList<CrashlyticsReport.Session.Event> f5258j;

    /* renamed from: k */
    private final int f5259k;

    static final class Builder extends CrashlyticsReport.Session.Builder {

        /* renamed from: a */
        private String f5260a;

        /* renamed from: b */
        private String f5261b;

        /* renamed from: c */
        private Long f5262c;

        /* renamed from: d */
        private Long f5263d;

        /* renamed from: e */
        private Boolean f5264e;

        /* renamed from: f */
        private CrashlyticsReport.Session.Application f5265f;

        /* renamed from: g */
        private CrashlyticsReport.Session.User f5266g;

        /* renamed from: h */
        private CrashlyticsReport.Session.OperatingSystem f5267h;

        /* renamed from: i */
        private CrashlyticsReport.Session.Device f5268i;

        /* renamed from: j */
        private ImmutableList<CrashlyticsReport.Session.Event> f5269j;

        /* renamed from: k */
        private Integer f5270k;

        /* renamed from: a */
        public CrashlyticsReport.Session mo23213a() {
            String str = "";
            if (this.f5260a == null) {
                str = str + " generator";
            }
            if (this.f5261b == null) {
                str = str + " identifier";
            }
            if (this.f5262c == null) {
                str = str + " startedAt";
            }
            if (this.f5264e == null) {
                str = str + " crashed";
            }
            if (this.f5265f == null) {
                str = str + " app";
            }
            if (this.f5270k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session(this.f5260a, this.f5261b, this.f5262c.longValue(), this.f5263d, this.f5264e.booleanValue(), this.f5265f, this.f5266g, this.f5267h, this.f5268i, this.f5269j, this.f5270k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Session.Builder mo23214b(CrashlyticsReport.Session.Application application) {
            Objects.requireNonNull(application, "Null app");
            this.f5265f = application;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.Session.Builder mo23215c(boolean z) {
            this.f5264e = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.Session.Builder mo23216d(CrashlyticsReport.Session.Device device) {
            this.f5268i = device;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.Session.Builder mo23217e(Long l) {
            this.f5263d = l;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.Session.Builder mo23218f(ImmutableList<CrashlyticsReport.Session.Event> immutableList) {
            this.f5269j = immutableList;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.Session.Builder mo23219g(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.f5260a = str;
            return this;
        }

        /* renamed from: h */
        public CrashlyticsReport.Session.Builder mo23220h(int i) {
            this.f5270k = Integer.valueOf(i);
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.Session.Builder mo23221i(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f5261b = str;
            return this;
        }

        /* renamed from: k */
        public CrashlyticsReport.Session.Builder mo23222k(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.f5267h = operatingSystem;
            return this;
        }

        /* renamed from: l */
        public CrashlyticsReport.Session.Builder mo23223l(long j) {
            this.f5262c = Long.valueOf(j);
            return this;
        }

        /* renamed from: m */
        public CrashlyticsReport.Session.Builder mo23224m(CrashlyticsReport.Session.User user) {
            this.f5266g = user;
            return this;
        }

        Builder() {
        }

        private Builder(CrashlyticsReport.Session session) {
            this.f5260a = session.mo23203f();
            this.f5261b = session.mo23205h();
            this.f5262c = Long.valueOf(session.mo23208k());
            this.f5263d = session.mo23200d();
            this.f5264e = Boolean.valueOf(session.mo23210m());
            this.f5265f = session.mo23198b();
            this.f5266g = session.mo23209l();
            this.f5267h = session.mo23207j();
            this.f5268i = session.mo23199c();
            this.f5269j = session.mo23201e();
            this.f5270k = Integer.valueOf(session.mo23204g());
        }
    }

    @NonNull
    /* renamed from: b */
    public CrashlyticsReport.Session.Application mo23198b() {
        return this.f5254f;
    }

    @Nullable
    /* renamed from: c */
    public CrashlyticsReport.Session.Device mo23199c() {
        return this.f5257i;
    }

    @Nullable
    /* renamed from: d */
    public Long mo23200d() {
        return this.f5252d;
    }

    @Nullable
    /* renamed from: e */
    public ImmutableList<CrashlyticsReport.Session.Event> mo23201e() {
        return this.f5258j;
    }

    public boolean equals(Object obj) {
        Long l;
        CrashlyticsReport.Session.User user;
        CrashlyticsReport.Session.OperatingSystem operatingSystem;
        CrashlyticsReport.Session.Device device;
        ImmutableList<CrashlyticsReport.Session.Event> immutableList;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session)) {
            return false;
        }
        CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
        if (!this.f5249a.equals(session.mo23203f()) || !this.f5250b.equals(session.mo23205h()) || this.f5251c != session.mo23208k() || ((l = this.f5252d) != null ? !l.equals(session.mo23200d()) : session.mo23200d() != null) || this.f5253e != session.mo23210m() || !this.f5254f.equals(session.mo23198b()) || ((user = this.f5255g) != null ? !user.equals(session.mo23209l()) : session.mo23209l() != null) || ((operatingSystem = this.f5256h) != null ? !operatingSystem.equals(session.mo23207j()) : session.mo23207j() != null) || ((device = this.f5257i) != null ? !device.equals(session.mo23199c()) : session.mo23199c() != null) || ((immutableList = this.f5258j) != null ? !immutableList.equals(session.mo23201e()) : session.mo23201e() != null) || this.f5259k != session.mo23204g()) {
            return false;
        }
        return true;
    }

    @NonNull
    /* renamed from: f */
    public String mo23203f() {
        return this.f5249a;
    }

    /* renamed from: g */
    public int mo23204g() {
        return this.f5259k;
    }

    @NonNull
    @Encodable.Ignore
    /* renamed from: h */
    public String mo23205h() {
        return this.f5250b;
    }

    public int hashCode() {
        long j = this.f5251c;
        int hashCode = (((((this.f5249a.hashCode() ^ 1000003) * 1000003) ^ this.f5250b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f5252d;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f5253e ? 1231 : 1237)) * 1000003) ^ this.f5254f.hashCode()) * 1000003;
        CrashlyticsReport.Session.User user = this.f5255g;
        int hashCode3 = (hashCode2 ^ (user == null ? 0 : user.hashCode())) * 1000003;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.f5256h;
        int hashCode4 = (hashCode3 ^ (operatingSystem == null ? 0 : operatingSystem.hashCode())) * 1000003;
        CrashlyticsReport.Session.Device device = this.f5257i;
        int hashCode5 = (hashCode4 ^ (device == null ? 0 : device.hashCode())) * 1000003;
        ImmutableList<CrashlyticsReport.Session.Event> immutableList = this.f5258j;
        if (immutableList != null) {
            i = immutableList.hashCode();
        }
        return ((hashCode5 ^ i) * 1000003) ^ this.f5259k;
    }

    @Nullable
    /* renamed from: j */
    public CrashlyticsReport.Session.OperatingSystem mo23207j() {
        return this.f5256h;
    }

    /* renamed from: k */
    public long mo23208k() {
        return this.f5251c;
    }

    @Nullable
    /* renamed from: l */
    public CrashlyticsReport.Session.User mo23209l() {
        return this.f5255g;
    }

    /* renamed from: m */
    public boolean mo23210m() {
        return this.f5253e;
    }

    /* renamed from: n */
    public CrashlyticsReport.Session.Builder mo23211n() {
        return new Builder(this);
    }

    public String toString() {
        return "Session{generator=" + this.f5249a + ", identifier=" + this.f5250b + ", startedAt=" + this.f5251c + ", endedAt=" + this.f5252d + ", crashed=" + this.f5253e + ", app=" + this.f5254f + ", user=" + this.f5255g + ", os=" + this.f5256h + ", device=" + this.f5257i + ", events=" + this.f5258j + ", generatorType=" + this.f5259k + "}";
    }

    private AutoValue_CrashlyticsReport_Session(String str, String str2, long j, @Nullable Long l, boolean z, CrashlyticsReport.Session.Application application, @Nullable CrashlyticsReport.Session.User user, @Nullable CrashlyticsReport.Session.OperatingSystem operatingSystem, @Nullable CrashlyticsReport.Session.Device device, @Nullable ImmutableList<CrashlyticsReport.Session.Event> immutableList, int i) {
        this.f5249a = str;
        this.f5250b = str2;
        this.f5251c = j;
        this.f5252d = l;
        this.f5253e = z;
        this.f5254f = application;
        this.f5255g = user;
        this.f5256h = operatingSystem;
        this.f5257i = device;
        this.f5258j = immutableList;
        this.f5259k = i;
    }
}
