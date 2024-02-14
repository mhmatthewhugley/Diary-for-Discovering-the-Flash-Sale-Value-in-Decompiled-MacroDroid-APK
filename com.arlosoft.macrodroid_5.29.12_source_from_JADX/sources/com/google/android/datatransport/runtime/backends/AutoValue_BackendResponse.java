package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;
import java.util.Objects;

final class AutoValue_BackendResponse extends BackendResponse {

    /* renamed from: a */
    private final BackendResponse.Status f1383a;

    /* renamed from: b */
    private final long f1384b;

    AutoValue_BackendResponse(BackendResponse.Status status, long j) {
        Objects.requireNonNull(status, "Null status");
        this.f1383a = status;
        this.f1384b = j;
    }

    /* renamed from: b */
    public long mo19476b() {
        return this.f1384b;
    }

    /* renamed from: c */
    public BackendResponse.Status mo19477c() {
        return this.f1383a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        if (!this.f1383a.equals(backendResponse.mo19477c()) || this.f1384b != backendResponse.mo19476b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f1384b;
        return ((this.f1383a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f1383a + ", nextRequestWaitMillis=" + this.f1384b + "}";
    }
}
