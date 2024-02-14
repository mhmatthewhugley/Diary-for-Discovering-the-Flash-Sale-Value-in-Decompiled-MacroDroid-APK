package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@AutoValue
public abstract class EventInternal {

    @AutoValue.Builder
    public static abstract class Builder {
        /* renamed from: a */
        public final Builder mo19450a(String str, int i) {
            mo19405e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final Builder mo19451b(String str, long j) {
            mo19405e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final Builder mo19452c(String str, String str2) {
            mo19405e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract EventInternal mo19404d();

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract Map<String, String> mo19405e();

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract Builder mo19406f(Map<String, String> map);

        /* renamed from: g */
        public abstract Builder mo19407g(Integer num);

        /* renamed from: h */
        public abstract Builder mo19408h(EncodedPayload encodedPayload);

        /* renamed from: i */
        public abstract Builder mo19409i(long j);

        /* renamed from: j */
        public abstract Builder mo19410j(String str);

        /* renamed from: k */
        public abstract Builder mo19411k(long j);
    }

    /* renamed from: a */
    public static Builder m1208a() {
        return new AutoValue_EventInternal.Builder().mo19406f(new HashMap());
    }

    /* renamed from: b */
    public final String mo19445b(String str) {
        String str2 = mo19395c().get(str);
        return str2 == null ? "" : str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<String, String> mo19395c();

    @Nullable
    /* renamed from: d */
    public abstract Integer mo19396d();

    /* renamed from: e */
    public abstract EncodedPayload mo19397e();

    /* renamed from: f */
    public abstract long mo19399f();

    /* renamed from: g */
    public final int mo19446g(String str) {
        String str2 = mo19395c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long mo19447h(String str) {
        String str2 = mo19395c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> mo19448i() {
        return Collections.unmodifiableMap(mo19395c());
    }

    /* renamed from: j */
    public abstract String mo19401j();

    /* renamed from: k */
    public abstract long mo19402k();

    /* renamed from: l */
    public Builder mo19449l() {
        return new AutoValue_EventInternal.Builder().mo19410j(mo19401j()).mo19407g(mo19396d()).mo19408h(mo19397e()).mo19409i(mo19399f()).mo19411k(mo19402k()).mo19406f(new HashMap(mo19395c()));
    }
}
