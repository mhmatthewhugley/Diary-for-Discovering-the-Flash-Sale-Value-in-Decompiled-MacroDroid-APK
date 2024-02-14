package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
import java.util.Objects;

final class AutoValue_CrashlyticsReportWithSessionId extends CrashlyticsReportWithSessionId {

    /* renamed from: a */
    private final CrashlyticsReport f4873a;

    /* renamed from: b */
    private final String f4874b;

    /* renamed from: c */
    private final File f4875c;

    AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReport crashlyticsReport, String str, File file) {
        Objects.requireNonNull(crashlyticsReport, "Null report");
        this.f4873a = crashlyticsReport;
        Objects.requireNonNull(str, "Null sessionId");
        this.f4874b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.f4875c = file;
    }

    /* renamed from: b */
    public CrashlyticsReport mo22966b() {
        return this.f4873a;
    }

    /* renamed from: c */
    public File mo22967c() {
        return this.f4875c;
    }

    /* renamed from: d */
    public String mo22968d() {
        return this.f4874b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportWithSessionId)) {
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        if (!this.f4873a.equals(crashlyticsReportWithSessionId.mo22966b()) || !this.f4874b.equals(crashlyticsReportWithSessionId.mo22968d()) || !this.f4875c.equals(crashlyticsReportWithSessionId.mo22967c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f4873a.hashCode() ^ 1000003) * 1000003) ^ this.f4874b.hashCode()) * 1000003) ^ this.f4875c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f4873a + ", sessionId=" + this.f4874b + ", reportFile=" + this.f4875c + "}";
    }
}
