package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.remote.AutoValue_TokenResult;

@AutoValue
public abstract class TokenResult {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract TokenResult mo63303a();

        @NonNull
        /* renamed from: b */
        public abstract Builder mo63304b(@NonNull ResponseCode responseCode);

        @NonNull
        /* renamed from: c */
        public abstract Builder mo63305c(@NonNull String str);

        @NonNull
        /* renamed from: d */
        public abstract Builder mo63306d(long j);
    }

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @NonNull
    /* renamed from: a */
    public static Builder m76764a() {
        return new AutoValue_TokenResult.Builder().mo63306d(0);
    }

    @Nullable
    /* renamed from: b */
    public abstract ResponseCode mo63297b();

    @Nullable
    /* renamed from: c */
    public abstract String mo63298c();

    @NonNull
    /* renamed from: d */
    public abstract long mo63299d();
}
