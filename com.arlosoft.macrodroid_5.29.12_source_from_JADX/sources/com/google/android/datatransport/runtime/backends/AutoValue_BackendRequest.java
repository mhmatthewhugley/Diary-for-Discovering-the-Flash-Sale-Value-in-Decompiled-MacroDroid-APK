package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import java.util.Arrays;
import java.util.Objects;

final class AutoValue_BackendRequest extends BackendRequest {

    /* renamed from: a */
    private final Iterable<EventInternal> f1379a;

    /* renamed from: b */
    private final byte[] f1380b;

    static final class Builder extends BackendRequest.Builder {

        /* renamed from: a */
        private Iterable<EventInternal> f1381a;

        /* renamed from: b */
        private byte[] f1382b;

        Builder() {
        }

        /* renamed from: a */
        public BackendRequest mo19473a() {
            String str = "";
            if (this.f1381a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new AutoValue_BackendRequest(this.f1381a, this.f1382b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public BackendRequest.Builder mo19474b(Iterable<EventInternal> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f1381a = iterable;
            return this;
        }

        /* renamed from: c */
        public BackendRequest.Builder mo19475c(@Nullable byte[] bArr) {
            this.f1382b = bArr;
            return this;
        }
    }

    /* renamed from: b */
    public Iterable<EventInternal> mo19468b() {
        return this.f1379a;
    }

    @Nullable
    /* renamed from: c */
    public byte[] mo19469c() {
        return this.f1380b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendRequest)) {
            return false;
        }
        BackendRequest backendRequest = (BackendRequest) obj;
        if (this.f1379a.equals(backendRequest.mo19468b())) {
            if (Arrays.equals(this.f1380b, backendRequest instanceof AutoValue_BackendRequest ? ((AutoValue_BackendRequest) backendRequest).f1380b : backendRequest.mo19469c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f1379a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1380b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f1379a + ", extras=" + Arrays.toString(this.f1380b) + "}";
    }

    private AutoValue_BackendRequest(Iterable<EventInternal> iterable, @Nullable byte[] bArr) {
        this.f1379a = iterable;
        this.f1380b = bArr;
    }
}
