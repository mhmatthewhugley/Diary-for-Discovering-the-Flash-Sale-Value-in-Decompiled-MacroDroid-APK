package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class BackendRequest {

    @AutoValue.Builder
    public static abstract class Builder {
        /* renamed from: a */
        public abstract BackendRequest mo19473a();

        /* renamed from: b */
        public abstract Builder mo19474b(Iterable<EventInternal> iterable);

        /* renamed from: c */
        public abstract Builder mo19475c(@Nullable byte[] bArr);
    }

    /* renamed from: a */
    public static Builder m1295a() {
        return new AutoValue_BackendRequest.Builder();
    }

    /* renamed from: b */
    public abstract Iterable<EventInternal> mo19468b();

    @Nullable
    /* renamed from: c */
    public abstract byte[] mo19469c();
}
