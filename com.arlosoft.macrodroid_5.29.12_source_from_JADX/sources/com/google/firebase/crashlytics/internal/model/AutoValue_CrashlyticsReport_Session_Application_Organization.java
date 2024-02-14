package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Application_Organization extends CrashlyticsReport.Session.Application.Organization {

    /* renamed from: a */
    private final String f5285a;

    static final class Builder extends CrashlyticsReport.Session.Application.Organization.Builder {
        Builder() {
        }
    }

    @NonNull
    /* renamed from: a */
    public String mo23242a() {
        return this.f5285a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application.Organization) {
            return this.f5285a.equals(((CrashlyticsReport.Session.Application.Organization) obj).mo23242a());
        }
        return false;
    }

    public int hashCode() {
        return this.f5285a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f5285a + "}";
    }
}
