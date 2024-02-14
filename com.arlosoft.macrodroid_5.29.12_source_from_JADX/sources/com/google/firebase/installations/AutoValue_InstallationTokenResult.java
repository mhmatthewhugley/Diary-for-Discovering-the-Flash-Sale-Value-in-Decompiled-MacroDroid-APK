package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.installations.InstallationTokenResult;
import java.util.Objects;

final class AutoValue_InstallationTokenResult extends InstallationTokenResult {

    /* renamed from: a */
    private final String f54821a;

    /* renamed from: b */
    private final long f54822b;

    /* renamed from: c */
    private final long f54823c;

    static final class Builder extends InstallationTokenResult.Builder {

        /* renamed from: a */
        private String f54824a;

        /* renamed from: b */
        private Long f54825b;

        /* renamed from: c */
        private Long f54826c;

        Builder() {
        }

        /* renamed from: a */
        public InstallationTokenResult mo63227a() {
            String str = "";
            if (this.f54824a == null) {
                str = str + " token";
            }
            if (this.f54825b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f54826c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new AutoValue_InstallationTokenResult(this.f54824a, this.f54825b.longValue(), this.f54826c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public InstallationTokenResult.Builder mo63228b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f54824a = str;
            return this;
        }

        /* renamed from: c */
        public InstallationTokenResult.Builder mo63229c(long j) {
            this.f54826c = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public InstallationTokenResult.Builder mo63230d(long j) {
            this.f54825b = Long.valueOf(j);
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public String mo63221b() {
        return this.f54821a;
    }

    @NonNull
    /* renamed from: c */
    public long mo63222c() {
        return this.f54823c;
    }

    @NonNull
    /* renamed from: d */
    public long mo63223d() {
        return this.f54822b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationTokenResult)) {
            return false;
        }
        InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
        if (this.f54821a.equals(installationTokenResult.mo63221b()) && this.f54822b == installationTokenResult.mo63223d() && this.f54823c == installationTokenResult.mo63222c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f54822b;
        long j2 = this.f54823c;
        return ((((this.f54821a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f54821a + ", tokenExpirationTimestamp=" + this.f54822b + ", tokenCreationTimestamp=" + this.f54823c + "}";
    }

    private AutoValue_InstallationTokenResult(String str, long j, long j2) {
        this.f54821a = str;
        this.f54822b = j;
        this.f54823c = j2;
    }
}
