package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage */
final class C1897xfe724d07 extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {

    /* renamed from: a */
    private final long f5334a;

    /* renamed from: b */
    private final long f5335b;

    /* renamed from: c */
    private final String f5336c;

    /* renamed from: d */
    private final String f5337d;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage$Builder */
    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {

        /* renamed from: a */
        private Long f5338a;

        /* renamed from: b */
        private Long f5339b;

        /* renamed from: c */
        private String f5340c;

        /* renamed from: d */
        private String f5341d;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage mo23319a() {
            String str = "";
            if (this.f5338a == null) {
                str = str + " baseAddress";
            }
            if (this.f5339b == null) {
                str = str + " size";
            }
            if (this.f5340c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C1897xfe724d07(this.f5338a.longValue(), this.f5339b.longValue(), this.f5340c, this.f5341d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder mo23320b(long j) {
            this.f5338a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder mo23321c(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f5340c = str;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder mo23322d(long j) {
            this.f5339b = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder mo23323e(@Nullable String str) {
            this.f5341d = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public long mo23312b() {
        return this.f5334a;
    }

    @NonNull
    /* renamed from: c */
    public String mo23313c() {
        return this.f5336c;
    }

    /* renamed from: d */
    public long mo23314d() {
        return this.f5335b;
    }

    @Encodable.Ignore
    @Nullable
    /* renamed from: e */
    public String mo23315e() {
        return this.f5337d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.BinaryImage)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
        if (this.f5334a == binaryImage.mo23312b() && this.f5335b == binaryImage.mo23314d() && this.f5336c.equals(binaryImage.mo23313c())) {
            String str = this.f5337d;
            if (str == null) {
                if (binaryImage.mo23315e() == null) {
                    return true;
                }
            } else if (str.equals(binaryImage.mo23315e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f5334a;
        long j2 = this.f5335b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f5336c.hashCode()) * 1000003;
        String str = this.f5337d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f5334a + ", size=" + this.f5335b + ", name=" + this.f5336c + ", uuid=" + this.f5337d + "}";
    }

    private C1897xfe724d07(long j, long j2, String str, @Nullable String str2) {
        this.f5334a = j;
        this.f5335b = j2;
        this.f5336c = str;
        this.f5337d = str2;
    }
}
