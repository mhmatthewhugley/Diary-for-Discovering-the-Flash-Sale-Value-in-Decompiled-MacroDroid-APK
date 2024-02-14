package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

@AutoValue
public abstract class CrashlyticsReportWithSessionId {
    @NonNull
    /* renamed from: a */
    public static CrashlyticsReportWithSessionId m6724a(CrashlyticsReport crashlyticsReport, String str, File file) {
        return new AutoValue_CrashlyticsReportWithSessionId(crashlyticsReport, str, file);
    }

    /* renamed from: b */
    public abstract CrashlyticsReport mo22966b();

    /* renamed from: c */
    public abstract File mo22967c();

    /* renamed from: d */
    public abstract String mo22968d();
}
