package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;
import java.util.Objects;

final class AutoValue_CrashlyticsReport_FilesPayload_File extends CrashlyticsReport.FilesPayload.File {

    /* renamed from: a */
    private final String f5245a;

    /* renamed from: b */
    private final byte[] f5246b;

    static final class Builder extends CrashlyticsReport.FilesPayload.File.Builder {

        /* renamed from: a */
        private String f5247a;

        /* renamed from: b */
        private byte[] f5248b;

        Builder() {
        }

        /* renamed from: a */
        public CrashlyticsReport.FilesPayload.File mo23195a() {
            String str = "";
            if (this.f5247a == null) {
                str = str + " filename";
            }
            if (this.f5248b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_FilesPayload_File(this.f5247a, this.f5248b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.FilesPayload.File.Builder mo23196b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f5248b = bArr;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.FilesPayload.File.Builder mo23197c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f5247a = str;
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public byte[] mo23190b() {
        return this.f5246b;
    }

    @NonNull
    /* renamed from: c */
    public String mo23191c() {
        return this.f5245a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload.File)) {
            return false;
        }
        CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
        if (this.f5245a.equals(file.mo23191c())) {
            if (Arrays.equals(this.f5246b, file instanceof AutoValue_CrashlyticsReport_FilesPayload_File ? ((AutoValue_CrashlyticsReport_FilesPayload_File) file).f5246b : file.mo23190b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5245a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5246b);
    }

    public String toString() {
        return "File{filename=" + this.f5245a + ", contents=" + Arrays.toString(this.f5246b) + "}";
    }

    private AutoValue_CrashlyticsReport_FilesPayload_File(String str, byte[] bArr) {
        this.f5245a = str;
        this.f5246b = bArr;
    }
}
