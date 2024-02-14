package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_CustomAttribute extends CrashlyticsReport.CustomAttribute {

    /* renamed from: a */
    private final String f5237a;

    /* renamed from: b */
    private final String f5238b;

    static final class Builder extends CrashlyticsReport.CustomAttribute.Builder {

        /* renamed from: a */
        private String f5239a;

        /* renamed from: b */
        private String f5240b;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.CustomAttribute mo23179a() {
            String str = "";
            if (this.f5239a == null) {
                str = str + " key";
            }
            if (this.f5240b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_CustomAttribute(this.f5239a, this.f5240b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.CustomAttribute.Builder mo23180b(String str) {
            Objects.requireNonNull(str, "Null key");
            this.f5239a = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.CustomAttribute.Builder mo23181c(String str) {
            Objects.requireNonNull(str, "Null value");
            this.f5240b = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public String mo23174b() {
        return this.f5237a;
    }

    @NonNull
    /* renamed from: c */
    public String mo23175c() {
        return this.f5238b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.CustomAttribute)) {
            return false;
        }
        CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
        if (!this.f5237a.equals(customAttribute.mo23174b()) || !this.f5238b.equals(customAttribute.mo23175c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f5237a.hashCode() ^ 1000003) * 1000003) ^ this.f5238b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f5237a + ", value=" + this.f5238b + "}";
    }

    private AutoValue_CrashlyticsReport_CustomAttribute(String str, String str2) {
        this.f5237a = str;
        this.f5238b = str2;
    }
}
