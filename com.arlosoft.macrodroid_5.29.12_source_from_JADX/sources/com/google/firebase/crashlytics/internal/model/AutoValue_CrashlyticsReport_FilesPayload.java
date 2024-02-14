package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_FilesPayload extends CrashlyticsReport.FilesPayload {

    /* renamed from: a */
    private final ImmutableList<CrashlyticsReport.FilesPayload.File> f5241a;

    /* renamed from: b */
    private final String f5242b;

    static final class Builder extends CrashlyticsReport.FilesPayload.Builder {

        /* renamed from: a */
        private ImmutableList<CrashlyticsReport.FilesPayload.File> f5243a;

        /* renamed from: b */
        private String f5244b;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.FilesPayload mo23187a() {
            String str = "";
            if (this.f5243a == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_FilesPayload(this.f5243a, this.f5244b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.FilesPayload.Builder mo23188b(ImmutableList<CrashlyticsReport.FilesPayload.File> immutableList) {
            Objects.requireNonNull(immutableList, "Null files");
            this.f5243a = immutableList;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.FilesPayload.Builder mo23189c(String str) {
            this.f5244b = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public ImmutableList<CrashlyticsReport.FilesPayload.File> mo23182b() {
        return this.f5241a;
    }

    @Nullable
    /* renamed from: c */
    public String mo23183c() {
        return this.f5242b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload)) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
        if (this.f5241a.equals(filesPayload.mo23182b())) {
            String str = this.f5242b;
            if (str == null) {
                if (filesPayload.mo23183c() == null) {
                    return true;
                }
            } else if (str.equals(filesPayload.mo23183c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f5241a.hashCode() ^ 1000003) * 1000003;
        String str = this.f5242b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f5241a + ", orgId=" + this.f5242b + "}";
    }

    private AutoValue_CrashlyticsReport_FilesPayload(ImmutableList<CrashlyticsReport.FilesPayload.File> immutableList, @Nullable String str) {
        this.f5241a = immutableList;
        this.f5242b = str;
    }
}
