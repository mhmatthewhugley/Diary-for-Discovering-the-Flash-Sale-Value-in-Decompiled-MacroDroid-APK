package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.remote.AutoValue_InstallationResponse;

@AutoValue
public abstract class InstallationResponse {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract InstallationResponse mo63291a();

        @NonNull
        /* renamed from: b */
        public abstract Builder mo63292b(@NonNull TokenResult tokenResult);

        @NonNull
        /* renamed from: c */
        public abstract Builder mo63293c(@NonNull String str);

        @NonNull
        /* renamed from: d */
        public abstract Builder mo63294d(@NonNull String str);

        @NonNull
        /* renamed from: e */
        public abstract Builder mo63295e(@NonNull ResponseCode responseCode);

        @NonNull
        /* renamed from: f */
        public abstract Builder mo63296f(@NonNull String str);
    }

    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    @NonNull
    /* renamed from: a */
    public static Builder m76746a() {
        return new AutoValue_InstallationResponse.Builder();
    }

    @Nullable
    /* renamed from: b */
    public abstract TokenResult mo63283b();

    @Nullable
    /* renamed from: c */
    public abstract String mo63284c();

    @Nullable
    /* renamed from: d */
    public abstract String mo63285d();

    @Nullable
    /* renamed from: e */
    public abstract ResponseCode mo63286e();

    @Nullable
    /* renamed from: f */
    public abstract String mo63288f();
}
