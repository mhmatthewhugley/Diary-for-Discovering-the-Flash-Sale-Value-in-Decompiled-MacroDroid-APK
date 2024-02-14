package com.google.android.datatransport.cct.internal;

final class AutoValue_LogResponse extends LogResponse {

    /* renamed from: a */
    private final long f1230a;

    AutoValue_LogResponse(long j) {
        this.f1230a = j;
    }

    /* renamed from: c */
    public long mo19372c() {
        return this.f1230a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogResponse) || this.f1230a != ((LogResponse) obj).mo19372c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f1230a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f1230a + "}";
    }
}
