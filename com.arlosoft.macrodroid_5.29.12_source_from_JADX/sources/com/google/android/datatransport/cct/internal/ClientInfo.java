package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_ClientInfo;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ClientInfo {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract ClientInfo mo19333a();

        @NonNull
        /* renamed from: b */
        public abstract Builder mo19334b(@Nullable AndroidClientInfo androidClientInfo);

        @NonNull
        /* renamed from: c */
        public abstract Builder mo19335c(@Nullable ClientType clientType);
    }

    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        private ClientType(int i) {
            this.value = i;
        }
    }

    @NonNull
    /* renamed from: a */
    public static Builder m1097a() {
        return new AutoValue_ClientInfo.Builder();
    }

    @Nullable
    /* renamed from: b */
    public abstract AndroidClientInfo mo19328b();

    @Nullable
    /* renamed from: c */
    public abstract ClientType mo19329c();
}
