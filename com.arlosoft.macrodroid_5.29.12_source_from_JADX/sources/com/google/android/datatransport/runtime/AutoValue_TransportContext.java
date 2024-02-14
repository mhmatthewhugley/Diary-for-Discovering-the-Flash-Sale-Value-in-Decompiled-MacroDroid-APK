package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Arrays;
import java.util.Objects;

final class AutoValue_TransportContext extends TransportContext {

    /* renamed from: a */
    private final String f1334a;

    /* renamed from: b */
    private final byte[] f1335b;

    /* renamed from: c */
    private final Priority f1336c;

    static final class Builder extends TransportContext.Builder {

        /* renamed from: a */
        private String f1337a;

        /* renamed from: b */
        private byte[] f1338b;

        /* renamed from: c */
        private Priority f1339c;

        Builder() {
        }

        /* renamed from: a */
        public TransportContext mo19431a() {
            String str = "";
            if (this.f1337a == null) {
                str = str + " backendName";
            }
            if (this.f1339c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new AutoValue_TransportContext(this.f1337a, this.f1338b, this.f1339c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public TransportContext.Builder mo19432b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f1337a = str;
            return this;
        }

        /* renamed from: c */
        public TransportContext.Builder mo19433c(@Nullable byte[] bArr) {
            this.f1338b = bArr;
            return this;
        }

        /* renamed from: d */
        public TransportContext.Builder mo19434d(Priority priority) {
            Objects.requireNonNull(priority, "Null priority");
            this.f1339c = priority;
            return this;
        }
    }

    /* renamed from: b */
    public String mo19426b() {
        return this.f1334a;
    }

    @Nullable
    /* renamed from: c */
    public byte[] mo19427c() {
        return this.f1335b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public Priority mo19428d() {
        return this.f1336c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransportContext)) {
            return false;
        }
        TransportContext transportContext = (TransportContext) obj;
        if (this.f1334a.equals(transportContext.mo19426b())) {
            if (!Arrays.equals(this.f1335b, transportContext instanceof AutoValue_TransportContext ? ((AutoValue_TransportContext) transportContext).f1335b : transportContext.mo19427c()) || !this.f1336c.equals(transportContext.mo19428d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f1334a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1335b)) * 1000003) ^ this.f1336c.hashCode();
    }

    private AutoValue_TransportContext(String str, @Nullable byte[] bArr, Priority priority) {
        this.f1334a = str;
        this.f1335b = bArr;
        this.f1336c = priority;
    }
}
