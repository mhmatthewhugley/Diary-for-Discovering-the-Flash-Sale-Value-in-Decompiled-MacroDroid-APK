package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_Session_Event_Log extends CrashlyticsReport.Session.Event.Log {

    /* renamed from: a */
    private final String f5386a;

    static final class Builder extends CrashlyticsReport.Session.Event.Log.Builder {

        /* renamed from: a */
        private String f5387a;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.Session.Event.Log mo23392a() {
            String str = "";
            if (this.f5387a == null) {
                str = str + " content";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Log(this.f5387a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Session.Event.Log.Builder mo23393b(String str) {
            Objects.requireNonNull(str, "Null content");
            this.f5387a = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public String mo23388b() {
        return this.f5386a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Log) {
            return this.f5386a.equals(((CrashlyticsReport.Session.Event.Log) obj).mo23388b());
        }
        return false;
    }

    public int hashCode() {
        return this.f5386a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f5386a + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Log(String str) {
        this.f5386a = str;
    }
}
