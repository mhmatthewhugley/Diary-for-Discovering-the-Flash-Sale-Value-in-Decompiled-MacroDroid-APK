package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

public class FirebaseRemoteConfigSettings {

    /* renamed from: a */
    private final long f55200a;

    /* renamed from: b */
    private final long f55201b;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public long f55202a = 60;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public long f55203b = ConfigFetchHandler.f55243j;

        @NonNull
        /* renamed from: c */
        public FirebaseRemoteConfigSettings mo63521c() {
            return new FirebaseRemoteConfigSettings(this);
        }

        @NonNull
        /* renamed from: d */
        public Builder mo63522d(long j) {
            if (j >= 0) {
                this.f55203b = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    /* renamed from: a */
    public long mo63519a() {
        return this.f55200a;
    }

    /* renamed from: b */
    public long mo63520b() {
        return this.f55201b;
    }

    private FirebaseRemoteConfigSettings(Builder builder) {
        this.f55200a = builder.f55202a;
        this.f55201b = builder.f55203b;
    }
}
