package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import java.util.Objects;

final class AutoValue_BatchedLogRequest extends BatchedLogRequest {

    /* renamed from: a */
    private final List<LogRequest> f1197a;

    AutoValue_BatchedLogRequest(List<LogRequest> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f1197a = list;
    }

    @NonNull
    @Encodable.Field
    /* renamed from: c */
    public List<LogRequest> mo19324c() {
        return this.f1197a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchedLogRequest) {
            return this.f1197a.equals(((BatchedLogRequest) obj).mo19324c());
        }
        return false;
    }

    public int hashCode() {
        return this.f1197a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f1197a + "}";
    }
}
