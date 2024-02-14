package com.google.firebase.installations.remote;

import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.InstallationResponse;

final class AutoValue_InstallationResponse extends InstallationResponse {

    /* renamed from: a */
    private final String f54893a;

    /* renamed from: b */
    private final String f54894b;

    /* renamed from: c */
    private final String f54895c;

    /* renamed from: d */
    private final TokenResult f54896d;

    /* renamed from: e */
    private final InstallationResponse.ResponseCode f54897e;

    static final class Builder extends InstallationResponse.Builder {

        /* renamed from: a */
        private String f54898a;

        /* renamed from: b */
        private String f54899b;

        /* renamed from: c */
        private String f54900c;

        /* renamed from: d */
        private TokenResult f54901d;

        /* renamed from: e */
        private InstallationResponse.ResponseCode f54902e;

        Builder() {
        }

        /* renamed from: a */
        public InstallationResponse mo63291a() {
            return new AutoValue_InstallationResponse(this.f54898a, this.f54899b, this.f54900c, this.f54901d, this.f54902e);
        }

        /* renamed from: b */
        public InstallationResponse.Builder mo63292b(TokenResult tokenResult) {
            this.f54901d = tokenResult;
            return this;
        }

        /* renamed from: c */
        public InstallationResponse.Builder mo63293c(String str) {
            this.f54899b = str;
            return this;
        }

        /* renamed from: d */
        public InstallationResponse.Builder mo63294d(String str) {
            this.f54900c = str;
            return this;
        }

        /* renamed from: e */
        public InstallationResponse.Builder mo63295e(InstallationResponse.ResponseCode responseCode) {
            this.f54902e = responseCode;
            return this;
        }

        /* renamed from: f */
        public InstallationResponse.Builder mo63296f(String str) {
            this.f54898a = str;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public TokenResult mo63283b() {
        return this.f54896d;
    }

    @Nullable
    /* renamed from: c */
    public String mo63284c() {
        return this.f54894b;
    }

    @Nullable
    /* renamed from: d */
    public String mo63285d() {
        return this.f54895c;
    }

    @Nullable
    /* renamed from: e */
    public InstallationResponse.ResponseCode mo63286e() {
        return this.f54897e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f54893a;
        if (str != null ? str.equals(installationResponse.mo63288f()) : installationResponse.mo63288f() == null) {
            String str2 = this.f54894b;
            if (str2 != null ? str2.equals(installationResponse.mo63284c()) : installationResponse.mo63284c() == null) {
                String str3 = this.f54895c;
                if (str3 != null ? str3.equals(installationResponse.mo63285d()) : installationResponse.mo63285d() == null) {
                    TokenResult tokenResult = this.f54896d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.mo63283b()) : installationResponse.mo63283b() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f54897e;
                        if (responseCode == null) {
                            if (installationResponse.mo63286e() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.mo63286e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public String mo63288f() {
        return this.f54893a;
    }

    public int hashCode() {
        String str = this.f54893a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f54894b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f54895c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.f54896d;
        int hashCode4 = (hashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f54897e;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f54893a + ", fid=" + this.f54894b + ", refreshToken=" + this.f54895c + ", authToken=" + this.f54896d + ", responseCode=" + this.f54897e + "}";
    }

    private AutoValue_InstallationResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable TokenResult tokenResult, @Nullable InstallationResponse.ResponseCode responseCode) {
        this.f54893a = str;
        this.f54894b = str2;
        this.f54895c = str3;
        this.f54896d = tokenResult;
        this.f54897e = responseCode;
    }
}
