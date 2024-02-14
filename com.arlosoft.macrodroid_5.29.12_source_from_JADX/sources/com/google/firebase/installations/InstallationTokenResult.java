package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.AutoValue_InstallationTokenResult;

@AutoValue
public abstract class InstallationTokenResult {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract InstallationTokenResult mo63227a();

        @NonNull
        /* renamed from: b */
        public abstract Builder mo63228b(@NonNull String str);

        @NonNull
        /* renamed from: c */
        public abstract Builder mo63229c(long j);

        @NonNull
        /* renamed from: d */
        public abstract Builder mo63230d(long j);
    }

    @NonNull
    /* renamed from: a */
    public static Builder m76630a() {
        return new AutoValue_InstallationTokenResult.Builder();
    }

    @NonNull
    /* renamed from: b */
    public abstract String mo63221b();

    @NonNull
    /* renamed from: c */
    public abstract long mo63222c();

    @NonNull
    /* renamed from: d */
    public abstract long mo63223d();
}
