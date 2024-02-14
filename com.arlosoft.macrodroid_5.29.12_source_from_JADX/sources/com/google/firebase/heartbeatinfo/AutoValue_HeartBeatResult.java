package com.google.firebase.heartbeatinfo;

import java.util.List;
import java.util.Objects;

final class AutoValue_HeartBeatResult extends HeartBeatResult {

    /* renamed from: a */
    private final String f54799a;

    /* renamed from: b */
    private final List<String> f54800b;

    AutoValue_HeartBeatResult(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f54799a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f54800b = list;
    }

    /* renamed from: b */
    public List<String> mo63191b() {
        return this.f54800b;
    }

    /* renamed from: c */
    public String mo63192c() {
        return this.f54799a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        if (!this.f54799a.equals(heartBeatResult.mo63192c()) || !this.f54800b.equals(heartBeatResult.mo63191b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f54799a.hashCode() ^ 1000003) * 1000003) ^ this.f54800b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f54799a + ", usedDates=" + this.f54800b + "}";
    }
}
