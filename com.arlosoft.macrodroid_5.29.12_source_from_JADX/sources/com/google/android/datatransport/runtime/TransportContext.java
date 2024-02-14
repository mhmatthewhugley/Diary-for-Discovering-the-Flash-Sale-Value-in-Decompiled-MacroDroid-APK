package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class TransportContext {

    @AutoValue.Builder
    public static abstract class Builder {
        /* renamed from: a */
        public abstract TransportContext mo19431a();

        /* renamed from: b */
        public abstract Builder mo19432b(String str);

        /* renamed from: c */
        public abstract Builder mo19433c(@Nullable byte[] bArr);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: d */
        public abstract Builder mo19434d(Priority priority);
    }

    /* renamed from: a */
    public static Builder m1253a() {
        return new AutoValue_TransportContext.Builder().mo19434d(Priority.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo19426b();

    @Nullable
    /* renamed from: c */
    public abstract byte[] mo19427c();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public abstract Priority mo19428d();

    /* renamed from: e */
    public boolean mo19459e() {
        return mo19427c() != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public TransportContext mo19460f(Priority priority) {
        return m1253a().mo19432b(mo19426b()).mo19434d(priority).mo19433c(mo19427c()).mo19431a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo19426b();
        objArr[1] = mo19428d();
        objArr[2] = mo19427c() == null ? "" : Base64.encodeToString(mo19427c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
