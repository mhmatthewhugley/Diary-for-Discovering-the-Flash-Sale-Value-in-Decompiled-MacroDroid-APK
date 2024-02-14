package com.google.firebase.crashlytics.internal;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;

public interface CrashlyticsNativeComponent {
    @NonNull
    /* renamed from: a */
    NativeSessionFileProvider mo22942a(@NonNull String str);

    /* renamed from: b */
    boolean mo22943b();

    /* renamed from: c */
    void mo22944c(@NonNull String str, @NonNull String str2, long j, @NonNull StaticSessionData staticSessionData);

    /* renamed from: d */
    boolean mo22945d(@NonNull String str);
}
