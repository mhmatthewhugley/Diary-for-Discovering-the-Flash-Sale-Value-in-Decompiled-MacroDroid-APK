package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_Device extends CrashlyticsReport.Session.Event.Device {

    /* renamed from: a */
    private final Double f5374a;

    /* renamed from: b */
    private final int f5375b;

    /* renamed from: c */
    private final boolean f5376c;

    /* renamed from: d */
    private final int f5377d;

    /* renamed from: e */
    private final long f5378e;

    /* renamed from: f */
    private final long f5379f;

    static final class Builder extends CrashlyticsReport.Session.Event.Device.Builder {

        /* renamed from: a */
        private Double f5380a;

        /* renamed from: b */
        private Integer f5381b;

        /* renamed from: c */
        private Boolean f5382c;

        /* renamed from: d */
        private Integer f5383d;

        /* renamed from: e */
        private Long f5384e;

        /* renamed from: f */
        private Long f5385f;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.Session.Event.Device mo23381a() {
            String str = "";
            if (this.f5381b == null) {
                str = str + " batteryVelocity";
            }
            if (this.f5382c == null) {
                str = str + " proximityOn";
            }
            if (this.f5383d == null) {
                str = str + " orientation";
            }
            if (this.f5384e == null) {
                str = str + " ramUsed";
            }
            if (this.f5385f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Device(this.f5380a, this.f5381b.intValue(), this.f5382c.booleanValue(), this.f5383d.intValue(), this.f5384e.longValue(), this.f5385f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Session.Event.Device.Builder mo23382b(Double d) {
            this.f5380a = d;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.Session.Event.Device.Builder mo23383c(int i) {
            this.f5381b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.Session.Event.Device.Builder mo23384d(long j) {
            this.f5385f = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.Session.Event.Device.Builder mo23385e(int i) {
            this.f5383d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.Session.Event.Device.Builder mo23386f(boolean z) {
            this.f5382c = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.Session.Event.Device.Builder mo23387g(long j) {
            this.f5384e = Long.valueOf(j);
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public Double mo23372b() {
        return this.f5374a;
    }

    /* renamed from: c */
    public int mo23373c() {
        return this.f5375b;
    }

    /* renamed from: d */
    public long mo23374d() {
        return this.f5379f;
    }

    /* renamed from: e */
    public int mo23375e() {
        return this.f5377d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
        Double d = this.f5374a;
        if (d != null ? d.equals(device.mo23372b()) : device.mo23372b() == null) {
            if (this.f5375b == device.mo23373c() && this.f5376c == device.mo23378g() && this.f5377d == device.mo23375e() && this.f5378e == device.mo23377f() && this.f5379f == device.mo23374d()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public long mo23377f() {
        return this.f5378e;
    }

    /* renamed from: g */
    public boolean mo23378g() {
        return this.f5376c;
    }

    public int hashCode() {
        Double d = this.f5374a;
        int hashCode = ((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f5375b) * 1000003;
        int i = this.f5376c ? 1231 : 1237;
        long j = this.f5378e;
        long j2 = this.f5379f;
        return ((((((hashCode ^ i) * 1000003) ^ this.f5377d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f5374a + ", batteryVelocity=" + this.f5375b + ", proximityOn=" + this.f5376c + ", orientation=" + this.f5377d + ", ramUsed=" + this.f5378e + ", diskUsed=" + this.f5379f + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Device(@Nullable Double d, int i, boolean z, int i2, long j, long j2) {
        this.f5374a = d;
        this.f5375b = i;
        this.f5376c = z;
        this.f5377d = i2;
        this.f5378e = j;
        this.f5379f = j2;
    }
}
