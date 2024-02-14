package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import java.util.Objects;

final class AutoValue_StaticSessionData_AppData extends StaticSessionData.AppData {

    /* renamed from: a */
    private final String f5401a;

    /* renamed from: b */
    private final String f5402b;

    /* renamed from: c */
    private final String f5403c;

    /* renamed from: d */
    private final String f5404d;

    /* renamed from: e */
    private final int f5405e;

    /* renamed from: f */
    private final DevelopmentPlatformProvider f5406f;

    AutoValue_StaticSessionData_AppData(String str, String str2, String str3, String str4, int i, DevelopmentPlatformProvider developmentPlatformProvider) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f5401a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f5402b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f5403c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f5404d = str4;
        this.f5405e = i;
        Objects.requireNonNull(developmentPlatformProvider, "Null developmentPlatformProvider");
        this.f5406f = developmentPlatformProvider;
    }

    /* renamed from: a */
    public String mo23418a() {
        return this.f5401a;
    }

    /* renamed from: c */
    public int mo23419c() {
        return this.f5405e;
    }

    /* renamed from: d */
    public DevelopmentPlatformProvider mo23420d() {
        return this.f5406f;
    }

    /* renamed from: e */
    public String mo23421e() {
        return this.f5404d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.AppData)) {
            return false;
        }
        StaticSessionData.AppData appData = (StaticSessionData.AppData) obj;
        if (!this.f5401a.equals(appData.mo23418a()) || !this.f5402b.equals(appData.mo23423f()) || !this.f5403c.equals(appData.mo23424g()) || !this.f5404d.equals(appData.mo23421e()) || this.f5405e != appData.mo23419c() || !this.f5406f.equals(appData.mo23420d())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo23423f() {
        return this.f5402b;
    }

    /* renamed from: g */
    public String mo23424g() {
        return this.f5403c;
    }

    public int hashCode() {
        return ((((((((((this.f5401a.hashCode() ^ 1000003) * 1000003) ^ this.f5402b.hashCode()) * 1000003) ^ this.f5403c.hashCode()) * 1000003) ^ this.f5404d.hashCode()) * 1000003) ^ this.f5405e) * 1000003) ^ this.f5406f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f5401a + ", versionCode=" + this.f5402b + ", versionName=" + this.f5403c + ", installUuid=" + this.f5404d + ", deliveryMechanism=" + this.f5405e + ", developmentPlatformProvider=" + this.f5406f + "}";
    }
}
