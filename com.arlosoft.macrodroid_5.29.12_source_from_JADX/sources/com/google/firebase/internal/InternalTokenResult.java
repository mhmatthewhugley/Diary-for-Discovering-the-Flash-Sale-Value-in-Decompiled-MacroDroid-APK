package com.google.firebase.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public class InternalTokenResult {
    @Nullable

    /* renamed from: a */
    private String f54931a;

    @KeepForSdk
    public InternalTokenResult(@Nullable String str) {
        this.f54931a = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof InternalTokenResult)) {
            return false;
        }
        return Objects.m4470a(this.f54931a, ((InternalTokenResult) obj).f54931a);
    }

    public int hashCode() {
        return Objects.m4471b(this.f54931a);
    }

    @NonNull
    public String toString() {
        return Objects.m4472c(this).mo21720a("token", this.f54931a).toString();
    }
}
