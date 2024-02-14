package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_LogRequest;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

@AutoValue
public abstract class LogRequest {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract LogRequest mo19364a();

        @NonNull
        /* renamed from: b */
        public abstract Builder mo19365b(@Nullable ClientInfo clientInfo);

        @NonNull
        /* renamed from: c */
        public abstract Builder mo19366c(@Nullable List<LogEvent> list);

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: d */
        public abstract Builder mo19367d(@Nullable Integer num);

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: e */
        public abstract Builder mo19368e(@Nullable String str);

        @NonNull
        /* renamed from: f */
        public abstract Builder mo19369f(@Nullable QosTier qosTier);

        @NonNull
        /* renamed from: g */
        public abstract Builder mo19370g(long j);

        @NonNull
        /* renamed from: h */
        public abstract Builder mo19371h(long j);

        @NonNull
        /* renamed from: i */
        public Builder mo19384i(int i) {
            return mo19367d(Integer.valueOf(i));
        }

        @NonNull
        /* renamed from: j */
        public Builder mo19385j(@NonNull String str) {
            return mo19368e(str);
        }
    }

    @NonNull
    /* renamed from: a */
    public static Builder m1121a() {
        return new AutoValue_LogRequest.Builder();
    }

    @Nullable
    /* renamed from: b */
    public abstract ClientInfo mo19354b();

    @Nullable
    @Encodable.Field
    /* renamed from: c */
    public abstract List<LogEvent> mo19355c();

    @Nullable
    /* renamed from: d */
    public abstract Integer mo19356d();

    @Nullable
    /* renamed from: e */
    public abstract String mo19357e();

    @Nullable
    /* renamed from: f */
    public abstract QosTier mo19359f();

    /* renamed from: g */
    public abstract long mo19360g();

    /* renamed from: h */
    public abstract long mo19361h();
}
