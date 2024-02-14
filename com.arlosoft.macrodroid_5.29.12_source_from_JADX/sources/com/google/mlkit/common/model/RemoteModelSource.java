package com.google.mlkit.common.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_common.zzw;
import com.google.android.gms.internal.mlkit_common.zzx;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public abstract class RemoteModelSource {
    @Nullable

    /* renamed from: a */
    private final String f56286a;

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        return Objects.m4470a(this.f56286a, ((RemoteModelSource) obj).f56286a);
    }

    public int hashCode() {
        return Objects.m4471b(this.f56286a);
    }

    @NonNull
    public String toString() {
        zzw b = zzx.m61550b("RemoteModelSource");
        b.mo52015a("firebaseModelName", this.f56286a);
        return b.toString();
    }
}
