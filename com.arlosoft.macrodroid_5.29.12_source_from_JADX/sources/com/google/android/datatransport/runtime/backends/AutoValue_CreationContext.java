package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Objects;

final class AutoValue_CreationContext extends CreationContext {

    /* renamed from: a */
    private final Context f1385a;

    /* renamed from: b */
    private final Clock f1386b;

    /* renamed from: c */
    private final Clock f1387c;

    /* renamed from: d */
    private final String f1388d;

    AutoValue_CreationContext(Context context, Clock clock, Clock clock2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f1385a = context;
        Objects.requireNonNull(clock, "Null wallClock");
        this.f1386b = clock;
        Objects.requireNonNull(clock2, "Null monotonicClock");
        this.f1387c = clock2;
        Objects.requireNonNull(str, "Null backendName");
        this.f1388d = str;
    }

    /* renamed from: b */
    public Context mo19481b() {
        return this.f1385a;
    }

    @NonNull
    /* renamed from: c */
    public String mo19482c() {
        return this.f1388d;
    }

    /* renamed from: d */
    public Clock mo19483d() {
        return this.f1387c;
    }

    /* renamed from: e */
    public Clock mo19484e() {
        return this.f1386b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreationContext)) {
            return false;
        }
        CreationContext creationContext = (CreationContext) obj;
        if (!this.f1385a.equals(creationContext.mo19481b()) || !this.f1386b.equals(creationContext.mo19484e()) || !this.f1387c.equals(creationContext.mo19483d()) || !this.f1388d.equals(creationContext.mo19482c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f1385a.hashCode() ^ 1000003) * 1000003) ^ this.f1386b.hashCode()) * 1000003) ^ this.f1387c.hashCode()) * 1000003) ^ this.f1388d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f1385a + ", wallClock=" + this.f1386b + ", monotonicClock=" + this.f1387c + ", backendName=" + this.f1388d + "}";
    }
}
