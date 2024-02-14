package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import java.util.Objects;

final class AutoValue_StaticSessionData_DeviceData extends StaticSessionData.DeviceData {

    /* renamed from: a */
    private final int f5407a;

    /* renamed from: b */
    private final String f5408b;

    /* renamed from: c */
    private final int f5409c;

    /* renamed from: d */
    private final long f5410d;

    /* renamed from: e */
    private final long f5411e;

    /* renamed from: f */
    private final boolean f5412f;

    /* renamed from: g */
    private final int f5413g;

    /* renamed from: h */
    private final String f5414h;

    /* renamed from: i */
    private final String f5415i;

    AutoValue_StaticSessionData_DeviceData(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f5407a = i;
        Objects.requireNonNull(str, "Null model");
        this.f5408b = str;
        this.f5409c = i2;
        this.f5410d = j;
        this.f5411e = j2;
        this.f5412f = z;
        this.f5413g = i3;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f5414h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f5415i = str3;
    }

    /* renamed from: a */
    public int mo23427a() {
        return this.f5407a;
    }

    /* renamed from: b */
    public int mo23428b() {
        return this.f5409c;
    }

    /* renamed from: d */
    public long mo23429d() {
        return this.f5411e;
    }

    /* renamed from: e */
    public boolean mo23430e() {
        return this.f5412f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.DeviceData)) {
            return false;
        }
        StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
        if (this.f5407a == deviceData.mo23427a() && this.f5408b.equals(deviceData.mo23433g()) && this.f5409c == deviceData.mo23428b() && this.f5410d == deviceData.mo23437j() && this.f5411e == deviceData.mo23429d() && this.f5412f == deviceData.mo23430e() && this.f5413g == deviceData.mo23436i() && this.f5414h.equals(deviceData.mo23432f()) && this.f5415i.equals(deviceData.mo23434h())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo23432f() {
        return this.f5414h;
    }

    /* renamed from: g */
    public String mo23433g() {
        return this.f5408b;
    }

    /* renamed from: h */
    public String mo23434h() {
        return this.f5415i;
    }

    public int hashCode() {
        long j = this.f5410d;
        long j2 = this.f5411e;
        return ((((((((((((((((this.f5407a ^ 1000003) * 1000003) ^ this.f5408b.hashCode()) * 1000003) ^ this.f5409c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f5412f ? 1231 : 1237)) * 1000003) ^ this.f5413g) * 1000003) ^ this.f5414h.hashCode()) * 1000003) ^ this.f5415i.hashCode();
    }

    /* renamed from: i */
    public int mo23436i() {
        return this.f5413g;
    }

    /* renamed from: j */
    public long mo23437j() {
        return this.f5410d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f5407a + ", model=" + this.f5408b + ", availableProcessors=" + this.f5409c + ", totalRam=" + this.f5410d + ", diskSpace=" + this.f5411e + ", isEmulator=" + this.f5412f + ", state=" + this.f5413g + ", manufacturer=" + this.f5414h + ", modelClass=" + this.f5415i + "}";
    }
}
