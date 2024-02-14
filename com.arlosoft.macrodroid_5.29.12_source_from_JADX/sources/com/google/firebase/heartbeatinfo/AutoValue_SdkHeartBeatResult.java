package com.google.firebase.heartbeatinfo;

final class AutoValue_SdkHeartBeatResult extends SdkHeartBeatResult {

    /* renamed from: a */
    private final String f54801a;

    /* renamed from: c */
    private final long f54802c;

    /* renamed from: d */
    public long mo63196d() {
        return this.f54802c;
    }

    /* renamed from: e */
    public String mo63197e() {
        return this.f54801a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkHeartBeatResult)) {
            return false;
        }
        SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
        if (!this.f54801a.equals(sdkHeartBeatResult.mo63197e()) || this.f54802c != sdkHeartBeatResult.mo63196d()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f54802c;
        return ((this.f54801a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.f54801a + ", millis=" + this.f54802c + "}";
    }
}
