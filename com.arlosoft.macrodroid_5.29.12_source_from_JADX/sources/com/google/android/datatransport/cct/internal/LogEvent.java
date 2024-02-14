package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_LogEvent;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class LogEvent {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract LogEvent mo19346a();

        @NonNull
        /* renamed from: b */
        public abstract Builder mo19347b(@Nullable Integer num);

        @NonNull
        /* renamed from: c */
        public abstract Builder mo19348c(long j);

        @NonNull
        /* renamed from: d */
        public abstract Builder mo19349d(long j);

        @NonNull
        /* renamed from: e */
        public abstract Builder mo19350e(@Nullable NetworkConnectionInfo networkConnectionInfo);

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: f */
        public abstract Builder mo19351f(@Nullable byte[] bArr);

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: g */
        public abstract Builder mo19352g(@Nullable String str);

        @NonNull
        /* renamed from: h */
        public abstract Builder mo19353h(long j);
    }

    /* renamed from: a */
    private static Builder m1103a() {
        return new AutoValue_LogEvent.Builder();
    }

    @NonNull
    /* renamed from: i */
    public static Builder m1104i(@NonNull String str) {
        return m1103a().mo19352g(str);
    }

    @NonNull
    /* renamed from: j */
    public static Builder m1105j(@NonNull byte[] bArr) {
        return m1103a().mo19351f(bArr);
    }

    @Nullable
    /* renamed from: b */
    public abstract Integer mo19336b();

    /* renamed from: c */
    public abstract long mo19337c();

    /* renamed from: d */
    public abstract long mo19338d();

    @Nullable
    /* renamed from: e */
    public abstract NetworkConnectionInfo mo19339e();

    @Nullable
    /* renamed from: f */
    public abstract byte[] mo19341f();

    @Nullable
    /* renamed from: g */
    public abstract String mo19342g();

    /* renamed from: h */
    public abstract long mo19343h();
}
