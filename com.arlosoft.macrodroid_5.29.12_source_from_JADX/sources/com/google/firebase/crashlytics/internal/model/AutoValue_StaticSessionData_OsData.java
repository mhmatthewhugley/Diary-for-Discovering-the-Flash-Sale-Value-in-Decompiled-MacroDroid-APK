package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import java.util.Objects;

final class AutoValue_StaticSessionData_OsData extends StaticSessionData.OsData {

    /* renamed from: a */
    private final String f5416a;

    /* renamed from: b */
    private final String f5417b;

    /* renamed from: c */
    private final boolean f5418c;

    AutoValue_StaticSessionData_OsData(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "Null osRelease");
        this.f5416a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f5417b = str2;
        this.f5418c = z;
    }

    /* renamed from: b */
    public boolean mo23439b() {
        return this.f5418c;
    }

    /* renamed from: c */
    public String mo23440c() {
        return this.f5417b;
    }

    /* renamed from: d */
    public String mo23441d() {
        return this.f5416a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.OsData)) {
            return false;
        }
        StaticSessionData.OsData osData = (StaticSessionData.OsData) obj;
        if (!this.f5416a.equals(osData.mo23441d()) || !this.f5417b.equals(osData.mo23440c()) || this.f5418c != osData.mo23439b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f5416a.hashCode() ^ 1000003) * 1000003) ^ this.f5417b.hashCode()) * 1000003) ^ (this.f5418c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f5416a + ", osCodeName=" + this.f5417b + ", isRooted=" + this.f5418c + "}";
    }
}
