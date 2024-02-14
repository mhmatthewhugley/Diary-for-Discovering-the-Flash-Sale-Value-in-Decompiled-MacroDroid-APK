package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.TokenResult;

final class AutoValue_TokenResult extends TokenResult {

    /* renamed from: a */
    private final String f54903a;

    /* renamed from: b */
    private final long f54904b;

    /* renamed from: c */
    private final TokenResult.ResponseCode f54905c;

    static final class Builder extends TokenResult.Builder {

        /* renamed from: a */
        private String f54906a;

        /* renamed from: b */
        private Long f54907b;

        /* renamed from: c */
        private TokenResult.ResponseCode f54908c;

        Builder() {
        }

        /* renamed from: a */
        public TokenResult mo63303a() {
            String str = "";
            if (this.f54907b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new AutoValue_TokenResult(this.f54906a, this.f54907b.longValue(), this.f54908c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public TokenResult.Builder mo63304b(TokenResult.ResponseCode responseCode) {
            this.f54908c = responseCode;
            return this;
        }

        /* renamed from: c */
        public TokenResult.Builder mo63305c(String str) {
            this.f54906a = str;
            return this;
        }

        /* renamed from: d */
        public TokenResult.Builder mo63306d(long j) {
            this.f54907b = Long.valueOf(j);
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public TokenResult.ResponseCode mo63297b() {
        return this.f54905c;
    }

    @Nullable
    /* renamed from: c */
    public String mo63298c() {
        return this.f54903a;
    }

    @NonNull
    /* renamed from: d */
    public long mo63299d() {
        return this.f54904b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f54903a;
        if (str != null ? str.equals(tokenResult.mo63298c()) : tokenResult.mo63298c() == null) {
            if (this.f54904b == tokenResult.mo63299d()) {
                TokenResult.ResponseCode responseCode = this.f54905c;
                if (responseCode == null) {
                    if (tokenResult.mo63297b() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.mo63297b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f54903a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f54904b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f54905c;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f54903a + ", tokenExpirationTimestamp=" + this.f54904b + ", responseCode=" + this.f54905c + "}";
    }

    private AutoValue_TokenResult(@Nullable String str, long j, @Nullable TokenResult.ResponseCode responseCode) {
        this.f54903a = str;
        this.f54904b = j;
        this.f54905c = responseCode;
    }
}
