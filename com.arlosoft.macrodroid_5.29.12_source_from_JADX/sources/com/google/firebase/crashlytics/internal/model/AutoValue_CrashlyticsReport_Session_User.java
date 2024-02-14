package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_Session_User extends CrashlyticsReport.Session.User {

    /* renamed from: a */
    private final String f5396a;

    static final class Builder extends CrashlyticsReport.Session.User.Builder {

        /* renamed from: a */
        private String f5397a;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.Session.User mo23410a() {
            String str = "";
            if (this.f5397a == null) {
                str = str + " identifier";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_User(this.f5397a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Session.User.Builder mo23411b(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f5397a = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public String mo23406b() {
        return this.f5396a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.User) {
            return this.f5396a.equals(((CrashlyticsReport.Session.User) obj).mo23406b());
        }
        return false;
    }

    public int hashCode() {
        return this.f5396a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f5396a + "}";
    }

    private AutoValue_CrashlyticsReport_Session_User(String str) {
        this.f5396a = str;
    }
}
