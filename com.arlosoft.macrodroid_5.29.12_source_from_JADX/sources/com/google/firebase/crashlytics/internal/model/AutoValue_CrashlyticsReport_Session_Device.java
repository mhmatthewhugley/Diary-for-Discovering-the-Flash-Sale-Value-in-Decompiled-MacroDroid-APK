package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_Session_Device extends CrashlyticsReport.Session.Device {

    /* renamed from: a */
    private final int f5286a;

    /* renamed from: b */
    private final String f5287b;

    /* renamed from: c */
    private final int f5288c;

    /* renamed from: d */
    private final long f5289d;

    /* renamed from: e */
    private final long f5290e;

    /* renamed from: f */
    private final boolean f5291f;

    /* renamed from: g */
    private final int f5292g;

    /* renamed from: h */
    private final String f5293h;

    /* renamed from: i */
    private final String f5294i;

    static final class Builder extends CrashlyticsReport.Session.Device.Builder {

        /* renamed from: a */
        private Integer f5295a;

        /* renamed from: b */
        private String f5296b;

        /* renamed from: c */
        private Integer f5297c;

        /* renamed from: d */
        private Long f5298d;

        /* renamed from: e */
        private Long f5299e;

        /* renamed from: f */
        private Boolean f5300f;

        /* renamed from: g */
        private Integer f5301g;

        /* renamed from: h */
        private String f5302h;

        /* renamed from: i */
        private String f5303i;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.Session.Device mo23258a() {
            String str = "";
            if (this.f5295a == null) {
                str = str + " arch";
            }
            if (this.f5296b == null) {
                str = str + " model";
            }
            if (this.f5297c == null) {
                str = str + " cores";
            }
            if (this.f5298d == null) {
                str = str + " ram";
            }
            if (this.f5299e == null) {
                str = str + " diskSpace";
            }
            if (this.f5300f == null) {
                str = str + " simulator";
            }
            if (this.f5301g == null) {
                str = str + " state";
            }
            if (this.f5302h == null) {
                str = str + " manufacturer";
            }
            if (this.f5303i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Device(this.f5295a.intValue(), this.f5296b, this.f5297c.intValue(), this.f5298d.longValue(), this.f5299e.longValue(), this.f5300f.booleanValue(), this.f5301g.intValue(), this.f5302h, this.f5303i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Session.Device.Builder mo23259b(int i) {
            this.f5295a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.Session.Device.Builder mo23260c(int i) {
            this.f5297c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.Session.Device.Builder mo23261d(long j) {
            this.f5299e = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.Session.Device.Builder mo23262e(String str) {
            Objects.requireNonNull(str, "Null manufacturer");
            this.f5302h = str;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.Session.Device.Builder mo23263f(String str) {
            Objects.requireNonNull(str, "Null model");
            this.f5296b = str;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.Session.Device.Builder mo23264g(String str) {
            Objects.requireNonNull(str, "Null modelClass");
            this.f5303i = str;
            return this;
        }

        /* renamed from: h */
        public CrashlyticsReport.Session.Device.Builder mo23265h(long j) {
            this.f5298d = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.Session.Device.Builder mo23266i(boolean z) {
            this.f5300f = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: j */
        public CrashlyticsReport.Session.Device.Builder mo23267j(int i) {
            this.f5301g = Integer.valueOf(i);
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public int mo23246b() {
        return this.f5286a;
    }

    /* renamed from: c */
    public int mo23247c() {
        return this.f5288c;
    }

    /* renamed from: d */
    public long mo23248d() {
        return this.f5290e;
    }

    @NonNull
    /* renamed from: e */
    public String mo23249e() {
        return this.f5293h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
        if (this.f5286a == device.mo23246b() && this.f5287b.equals(device.mo23251f()) && this.f5288c == device.mo23247c() && this.f5289d == device.mo23253h() && this.f5290e == device.mo23248d() && this.f5291f == device.mo23256j() && this.f5292g == device.mo23255i() && this.f5293h.equals(device.mo23249e()) && this.f5294i.equals(device.mo23252g())) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo23251f() {
        return this.f5287b;
    }

    @NonNull
    /* renamed from: g */
    public String mo23252g() {
        return this.f5294i;
    }

    /* renamed from: h */
    public long mo23253h() {
        return this.f5289d;
    }

    public int hashCode() {
        long j = this.f5289d;
        long j2 = this.f5290e;
        return ((((((((((((((((this.f5286a ^ 1000003) * 1000003) ^ this.f5287b.hashCode()) * 1000003) ^ this.f5288c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f5291f ? 1231 : 1237)) * 1000003) ^ this.f5292g) * 1000003) ^ this.f5293h.hashCode()) * 1000003) ^ this.f5294i.hashCode();
    }

    /* renamed from: i */
    public int mo23255i() {
        return this.f5292g;
    }

    /* renamed from: j */
    public boolean mo23256j() {
        return this.f5291f;
    }

    public String toString() {
        return "Device{arch=" + this.f5286a + ", model=" + this.f5287b + ", cores=" + this.f5288c + ", ram=" + this.f5289d + ", diskSpace=" + this.f5290e + ", simulator=" + this.f5291f + ", state=" + this.f5292g + ", manufacturer=" + this.f5293h + ", modelClass=" + this.f5294i + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Device(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f5286a = i;
        this.f5287b = str;
        this.f5288c = i2;
        this.f5289d = j;
        this.f5290e = j2;
        this.f5291f = z;
        this.f5292g = i3;
        this.f5293h = str2;
        this.f5294i = str3;
    }
}
