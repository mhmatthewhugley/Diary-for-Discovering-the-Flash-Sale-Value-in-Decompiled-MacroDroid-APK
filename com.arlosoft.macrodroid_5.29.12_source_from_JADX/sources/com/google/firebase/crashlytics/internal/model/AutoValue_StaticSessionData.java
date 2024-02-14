package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import java.util.Objects;

final class AutoValue_StaticSessionData extends StaticSessionData {

    /* renamed from: a */
    private final StaticSessionData.AppData f5398a;

    /* renamed from: b */
    private final StaticSessionData.OsData f5399b;

    /* renamed from: c */
    private final StaticSessionData.DeviceData f5400c;

    AutoValue_StaticSessionData(StaticSessionData.AppData appData, StaticSessionData.OsData osData, StaticSessionData.DeviceData deviceData) {
        Objects.requireNonNull(appData, "Null appData");
        this.f5398a = appData;
        Objects.requireNonNull(osData, "Null osData");
        this.f5399b = osData;
        Objects.requireNonNull(deviceData, "Null deviceData");
        this.f5400c = deviceData;
    }

    /* renamed from: a */
    public StaticSessionData.AppData mo23412a() {
        return this.f5398a;
    }

    /* renamed from: c */
    public StaticSessionData.DeviceData mo23413c() {
        return this.f5400c;
    }

    /* renamed from: d */
    public StaticSessionData.OsData mo23414d() {
        return this.f5399b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData)) {
            return false;
        }
        StaticSessionData staticSessionData = (StaticSessionData) obj;
        if (!this.f5398a.equals(staticSessionData.mo23412a()) || !this.f5399b.equals(staticSessionData.mo23414d()) || !this.f5400c.equals(staticSessionData.mo23413c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f5398a.hashCode() ^ 1000003) * 1000003) ^ this.f5399b.hashCode()) * 1000003) ^ this.f5400c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f5398a + ", osData=" + this.f5399b + ", deviceData=" + this.f5400c + "}";
    }
}
