package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.InputStream;

interface NativeSessionFile {
    @Nullable
    /* renamed from: a */
    CrashlyticsReport.FilesPayload.File mo22976a();

    @NonNull
    /* renamed from: b */
    String mo22977b();

    @Nullable
    /* renamed from: c */
    InputStream mo22978c();
}
